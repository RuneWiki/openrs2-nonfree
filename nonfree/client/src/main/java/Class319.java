import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class319 {

	@OriginalMember(owner = "client!un", name = "t", descriptor = "[J")
	public static final long[] aLongArray15 = new long[256];

	@OriginalMember(owner = "client!un", name = "c", descriptor = "I")
	public int anInt8952;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "I")
	private int anInt8953;

	@OriginalMember(owner = "client!un", name = "f", descriptor = "I")
	public int anInt8954;

	@OriginalMember(owner = "client!un", name = "g", descriptor = "I")
	public int anInt8955;

	@OriginalMember(owner = "client!un", name = "h", descriptor = "I")
	public int anInt8956;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "I")
	public int anInt8957;

	@OriginalMember(owner = "client!un", name = "m", descriptor = "I")
	public int anInt8961;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "I")
	public int anInt8963;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "I")
	public int anInt8964;

	@OriginalMember(owner = "client!un", name = "q", descriptor = "I")
	public int anInt8965;

	@OriginalMember(owner = "client!un", name = "s", descriptor = "J")
	public long aLong223;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "Z")
	private boolean aBoolean633 = false;

	@OriginalMember(owner = "client!un", name = "r", descriptor = "I")
	public int anInt8966 = 0;

	@OriginalMember(owner = "client!un", name = "u", descriptor = "I")
	public int anInt8967 = 0;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(12) long local12 = (long) local8;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1L) == 1L) {
					local12 = local12 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local12 >>>= 0x1;
				}
			}
			aLongArray15[local8] = local12;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
	public void method7326() {
		this.anInt8963 = Class138.anIntArray393[this.anInt8953 << 3];
		this.anInt8955 = (int) Math.sqrt((double) (this.anInt8961 * this.anInt8961 + this.anInt8956 * this.anInt8956 + this.anInt8957 * this.anInt8957));
		if (this.anInt8954 == 0) {
			this.anInt8954 = 1;
		}
		if (this.anInt8964 == 0) {
			this.aLong223 = 2147483647L;
		} else if (this.anInt8964 == 1) {
			this.aLong223 = this.anInt8955 * 8 / this.anInt8954;
			this.aLong223 *= this.aLong223;
		} else if (this.anInt8964 == 2) {
			this.aLong223 = this.anInt8955 * 8 / this.anInt8954;
		}
		if (this.aBoolean633) {
			this.anInt8955 *= -1;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BLclient!dga;I)V")
	private void method7329(@OriginalArg(1) Class6_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8953 = arg0.method6006();
		} else if (arg1 == 2) {
			arg0.method6041();
		} else if (arg1 == 3) {
			this.anInt8956 = arg0.method6027();
			this.anInt8961 = arg0.method6027();
			this.anInt8957 = arg0.method6027();
		} else if (arg1 == 4) {
			this.anInt8964 = arg0.method6041();
			this.anInt8954 = arg0.method6027();
		} else if (arg1 == 6) {
			this.anInt8965 = arg0.method6041();
		} else if (arg1 == 8) {
			this.anInt8966 = 1;
		} else if (arg1 == 9) {
			this.anInt8967 = 1;
		} else if (arg1 == 10) {
			this.aBoolean633 = true;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!dga;B)V")
	public void method7331(@OriginalArg(0) Class6_Sub14 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6041();
			if (local15 == 0) {
				return;
			}
			this.method7329(arg0, local15);
		}
	}
}
