import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class4_Sub6_Sub39 extends Class4_Sub6 {

	@OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
	private int anInt5530;

	@OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
	private int anInt5531;

	@OriginalMember(owner = "client!wm", name = "N", descriptor = "I")
	private int anInt5533;

	@OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
	private int anInt5535;

	@OriginalMember(owner = "client!wm", name = "Y", descriptor = "I")
	private int anInt5540;

	@OriginalMember(owner = "client!wm", name = "ab", descriptor = "I")
	private int anInt5542;

	@OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
	private int anInt5529 = 0;

	@OriginalMember(owner = "client!wm", name = "U", descriptor = "I")
	private int anInt5537 = 0;

	@OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
	private int anInt5527 = 0;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIII)V")
	private void method4387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(28) int local28 = arg2 <= 2048 ? (arg0 + 4096) * arg2 >> 12 : arg0 + arg2 - (arg2 * arg0 >> 12);
		if (local28 <= 0) {
			this.anInt5535 = this.anInt5530 = this.anInt5540 = arg2;
			return;
		}
		@Pc(50) int local50 = arg1 * 6;
		@Pc(57) int local57 = arg2 + arg2 - local28;
		@Pc(65) int local65 = (local28 - local57 << 12) / local28;
		@Pc(71) int local71 = local50 >> 12;
		@Pc(77) int local77 = local65 * local28 >> 12;
		@Pc(84) int local84 = local50 - (local71 << 12);
		@Pc(90) int local90 = local77 * local84 >> 12;
		@Pc(95) int local95 = local28 - local90;
		@Pc(99) int local99 = local90 + local57;
		if (local71 == 0) {
			this.anInt5530 = local99;
			this.anInt5535 = local28;
			this.anInt5540 = local57;
		} else if (local71 == 1) {
			this.anInt5530 = local28;
			this.anInt5535 = local95;
			this.anInt5540 = local57;
		} else if (local71 == 2) {
			this.anInt5535 = local57;
			this.anInt5530 = local28;
			this.anInt5540 = local99;
		} else if (local71 == 3) {
			this.anInt5530 = local95;
			this.anInt5540 = local28;
			this.anInt5535 = local57;
		} else if (local71 == 4) {
			this.anInt5540 = local28;
			this.anInt5530 = local57;
			this.anInt5535 = local99;
		} else if (local71 == 5) {
			this.anInt5535 = local28;
			this.anInt5540 = local95;
			this.anInt5530 = local57;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5529 = arg0.method1869();
		} else if (arg1 == 1) {
			this.anInt5527 = (arg0.method1892() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt5537 = (arg0.method1892() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(IIII)V")
	private void method4389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 > arg1 ? arg2 : arg1;
		@Pc(23) int local23 = arg0 > local12 ? arg0 : local12;
		@Pc(30) int local30 = arg1 > arg2 ? arg2 : arg1;
		@Pc(37) int local37 = local30 <= arg0 ? local30 : arg0;
		@Pc(41) int local41 = local23 - local37;
		if (local41 <= 0) {
			this.anInt5533 = 0;
		} else {
			@Pc(60) int local60 = (local23 - arg2 << 12) / local41;
			@Pc(68) int local68 = (local23 - arg1 << 12) / local41;
			@Pc(77) int local77 = (local23 - arg0 << 12) / local41;
			if (arg2 == local23) {
				this.anInt5533 = local37 == arg1 ? local77 + 20480 : -local68 + 4096;
			} else if (arg1 == local23) {
				this.anInt5533 = arg0 == local37 ? local60 + 4096 : 12288 - local77;
			} else {
				this.anInt5533 = arg2 == local37 ? local68 + 12288 : -local60 + 20480;
			}
			this.anInt5533 /= 6;
		}
		this.anInt5531 = (local37 + local23) / 2;
		if (this.anInt5531 > 0 && this.anInt5531 < 4096) {
			this.anInt5542 = (local41 << 12) / (this.anInt5531 > 2048 ? 8192 - this.anInt5531 * 2 : this.anInt5531 * 2);
		} else {
			this.anInt5542 = 0;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(28) int[][] local28 = this.method4377(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local13[0];
			@Pc(48) int[] local48 = local13[1];
			@Pc(52) int[] local52 = local13[2];
			for (@Pc(54) int local54 = 0; local54 < Static2.anInt19; local54++) {
				this.method4389(local40[local54], local36[local54], local32[local54]);
				this.anInt5533 += this.anInt5529;
				this.anInt5542 += this.anInt5527;
				while (this.anInt5533 < 0) {
					this.anInt5533 += 4096;
				}
				if (this.anInt5542 < 0) {
					this.anInt5542 = 0;
				}
				while (this.anInt5533 > 4096) {
					this.anInt5533 -= 4096;
				}
				this.anInt5531 += this.anInt5537;
				if (this.anInt5531 < 0) {
					this.anInt5531 = 0;
				}
				if (this.anInt5531 > 4096) {
					this.anInt5531 = 4096;
				}
				if (this.anInt5542 > 4096) {
					this.anInt5542 = 4096;
				}
				this.method4387(this.anInt5542, this.anInt5533, this.anInt5531);
				local44[local54] = this.anInt5535;
				local48[local54] = this.anInt5530;
				local52[local54] = this.anInt5540;
			}
		}
		return local13;
	}
}
