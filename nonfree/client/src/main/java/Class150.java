import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class150 {

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "[J")
	public static final long[] aLongArray5 = new long[256];

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
	public int anInt4590;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
	public int anInt4591;

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
	public int anInt4592;

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
	public int anInt4593;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
	public int anInt4594;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
	public int anInt4596;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "J")
	public long aLong143;

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
	public int anInt4600;

	@OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
	public int anInt4601;

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
	private int anInt4604;

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
	public int anInt4605;

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
	public int anInt4595 = 0;

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "Z")
	private boolean aBoolean298 = false;

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
	public int anInt4602 = 0;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray5[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILclient!wn;)V")
	private void method3928(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt4604 = arg1.method4560();
		} else if (arg0 == 2) {
			arg1.method4614();
		} else if (arg0 == 3) {
			this.anInt4593 = arg1.method4595();
			this.anInt4594 = arg1.method4595();
			this.anInt4601 = arg1.method4595();
		} else if (arg0 == 4) {
			this.anInt4591 = arg1.method4614();
			this.anInt4600 = arg1.method4595();
		} else if (arg0 == 6) {
			this.anInt4592 = arg1.method4614();
		} else if (arg0 == 8) {
			this.anInt4595 = 1;
		} else if (arg0 == 9) {
			this.anInt4602 = 1;
		} else if (arg0 == 10) {
			this.aBoolean298 = true;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLclient!wn;)V")
	public void method3930(@OriginalArg(1) Class4_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4614();
			if (local5 == 0) {
				return;
			}
			this.method3928(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
	public void method3932() {
		this.anInt4596 = Class4_Sub13.anIntArray496[this.anInt4604 << 3];
		this.anInt4590 = (int) Math.sqrt((double) (this.anInt4601 * this.anInt4601 + this.anInt4593 * this.anInt4593 + this.anInt4594 * this.anInt4594));
		if (this.anInt4600 == 0) {
			this.anInt4600 = 1;
		}
		if (this.anInt4591 == 0) {
			this.aLong143 = 2147483647L;
		} else if (this.anInt4591 == 1) {
			this.aLong143 = this.anInt4590 * 8 / this.anInt4600;
			this.aLong143 *= this.aLong143;
		} else if (this.anInt4591 == 2) {
			this.aLong143 = this.anInt4590 * 8 / this.anInt4600;
		}
		if (this.aBoolean298) {
			this.anInt4590 *= -1;
		}
	}
}
