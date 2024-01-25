import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class328 {

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
	public int anInt9107;

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "J")
	public long aLong230;

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
	private int anInt9109;

	@OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
	public int anInt9110;

	@OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
	public int anInt9113;

	@OriginalMember(owner = "client!tda", name = "j", descriptor = "I")
	public int anInt9114;

	@OriginalMember(owner = "client!tda", name = "k", descriptor = "I")
	public int anInt9115;

	@OriginalMember(owner = "client!tda", name = "m", descriptor = "I")
	public int anInt9117;

	@OriginalMember(owner = "client!tda", name = "p", descriptor = "I")
	public int anInt9120;

	@OriginalMember(owner = "client!tda", name = "x", descriptor = "I")
	public int anInt9123;

	@OriginalMember(owner = "client!tda", name = "y", descriptor = "I")
	public int anInt9124;

	@OriginalMember(owner = "client!tda", name = "v", descriptor = "I")
	public int anInt9122 = 0;

	@OriginalMember(owner = "client!tda", name = "o", descriptor = "I")
	public int anInt9119 = 0;

	@OriginalMember(owner = "client!tda", name = "s", descriptor = "Z")
	private boolean aBoolean664 = false;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
	public void method7867() {
		this.anInt9124 = Class377.anIntArray601[this.anInt9109 << 3];
		@Pc(17) long local17 = (long) this.anInt9107;
		@Pc(21) long local21 = (long) this.anInt9117;
		@Pc(25) long local25 = (long) this.anInt9115;
		this.anInt9123 = (int) Math.sqrt((double) (local25 * local25 + local21 * local21 + local17 * local17));
		if (this.anInt9113 == 0) {
			this.anInt9113 = 1;
		}
		if (this.anInt9114 == 0) {
			this.aLong230 = 2147483647L;
		} else if (this.anInt9114 == 1) {
			this.aLong230 = this.anInt9123 * 8 / this.anInt9113;
			this.aLong230 *= this.aLong230;
		} else if (this.anInt9114 == 2) {
			this.aLong230 = this.anInt9123 * 8 / this.anInt9113;
		}
		if (this.aBoolean664) {
			this.anInt9123 *= -1;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!ofa;I)V")
	public void method7868(@OriginalArg(0) Class5_Sub22 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5966();
			if (local13 == 0) {
				return;
			}
			this.method7870(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ILclient!ofa;B)V")
	private void method7870(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt9109 = arg1.method5968();
		} else if (arg0 == 2) {
			arg1.method5966();
		} else if (arg0 == 3) {
			this.anInt9107 = arg1.method5913();
			this.anInt9117 = arg1.method5913();
			this.anInt9115 = arg1.method5913();
		} else if (arg0 == 4) {
			this.anInt9114 = arg1.method5966();
			this.anInt9113 = arg1.method5913();
		} else if (arg0 == 6) {
			this.anInt9110 = arg1.method5966();
		} else if (arg0 == 8) {
			this.anInt9122 = 1;
		} else if (arg0 == 9) {
			this.anInt9119 = 1;
		} else if (arg0 == 10) {
			this.aBoolean664 = true;
		}
	}
}
