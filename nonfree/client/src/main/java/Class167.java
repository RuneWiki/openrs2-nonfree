import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class167 {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "[B")
	public static final byte[] aByteArray50;

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
	public int anInt4716;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
	public int anInt4717;

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
	public int anInt4719;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
	private int anInt4720;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
	public int anInt4721;

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
	public int anInt4722;

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
	public int anInt4724;

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
	public int anInt4725;

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
	public int anInt4728;

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "J")
	public long aLong122;

	@OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
	public int anInt4732;

	@OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
	public int anInt4729 = 0;

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
	public int anInt4727 = 0;

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "Z")
	private boolean aBoolean352 = false;

	static {
		@Pc(1) int local1 = 0;
		aByteArray50 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray50[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLclient!eh;)V")
	public void method3997(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6015();
			if (local5 == 0) {
				return;
			}
			this.method3999(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILclient!eh;)V")
	private void method3999(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt4720 = arg1.method5982();
		} else if (arg0 == 2) {
			arg1.method6015();
		} else if (arg0 == 3) {
			this.anInt4722 = arg1.method6026();
			this.anInt4725 = arg1.method6026();
			this.anInt4724 = arg1.method6026();
		} else if (arg0 == 4) {
			this.anInt4719 = arg1.method6015();
			this.anInt4728 = arg1.method6026();
		} else if (arg0 == 6) {
			this.anInt4716 = arg1.method6015();
		} else if (arg0 == 8) {
			this.anInt4729 = 1;
		} else if (arg0 == 9) {
			this.anInt4727 = 1;
		} else if (arg0 == 10) {
			this.aBoolean352 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
	public void method4000() {
		this.anInt4721 = Class4_Sub11.anIntArray147[this.anInt4720 << 3];
		this.anInt4732 = (int) Math.sqrt((double) (this.anInt4725 * this.anInt4725 + this.anInt4722 * this.anInt4722 + this.anInt4724 * this.anInt4724));
		if (this.anInt4728 == 0) {
			this.anInt4728 = 1;
		}
		if (this.anInt4719 == 0) {
			this.aLong122 = 2147483647L;
		} else if (this.anInt4719 == 1) {
			this.aLong122 = this.anInt4732 * 8 / this.anInt4728;
			this.aLong122 *= this.aLong122;
		} else if (this.anInt4719 == 2) {
			this.aLong122 = this.anInt4732 * 8 / this.anInt4728;
		}
		if (this.aBoolean352) {
			this.anInt4732 *= -1;
		}
	}
}
