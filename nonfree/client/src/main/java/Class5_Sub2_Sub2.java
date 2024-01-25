import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!as", name = "G", descriptor = "I")
	private int anInt373 = 8192;

	@OriginalMember(owner = "client!as", name = "N", descriptor = "I")
	private int anInt378 = 0;

	@OriginalMember(owner = "client!as", name = "I", descriptor = "I")
	private int anInt375 = 12288;

	@OriginalMember(owner = "client!as", name = "F", descriptor = "I")
	private int anInt372 = 0;

	@OriginalMember(owner = "client!as", name = "P", descriptor = "I")
	private int anInt380 = 2048;

	@OriginalMember(owner = "client!as", name = "H", descriptor = "I")
	private int anInt374 = 4096;

	@OriginalMember(owner = "client!as", name = "T", descriptor = "I")
	private int anInt383 = 2048;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt380 = arg0.method7860();
		} else if (arg1 == 1) {
			this.anInt378 = arg0.method7860();
		} else if (arg1 == 2) {
			this.anInt372 = arg0.method7860();
		} else if (arg1 == 3) {
			this.anInt383 = arg0.method7860();
		} else if (arg1 == 4) {
			this.anInt375 = arg0.method7860();
		} else if (arg1 == 5) {
			this.anInt374 = arg0.method7860();
		} else if (arg1 == 6) {
			this.anInt373 = arg0.method7860();
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(30) int local30 = Static369.anIntArray377[arg0] - 2048;
			for (@Pc(32) int local32 = 0; local32 < Static195.anInt3759; local32++) {
				@Pc(40) int local40 = Static554.anIntArray510[local32] - 2048;
				@Pc(45) int local45 = this.anInt380 + local40;
				@Pc(56) int local56 = local45 >= -2048 ? local45 : local45 + 4096;
				@Pc(67) int local67 = local56 <= 2048 ? local56 : local56 - 4096;
				@Pc(73) int local73 = local30 + this.anInt378;
				@Pc(84) int local84 = local73 < -2048 ? local73 + 4096 : local73;
				@Pc(95) int local95 = local84 > 2048 ? local84 - 4096 : local84;
				@Pc(100) int local100 = this.anInt372 + local40;
				@Pc(109) int local109 = local100 >= -2048 ? local100 : local100 + 4096;
				@Pc(118) int local118 = local109 > 2048 ? local109 - 4096 : local109;
				@Pc(123) int local123 = this.anInt383 + local30;
				@Pc(134) int local134 = local123 < -2048 ? local123 + 4096 : local123;
				@Pc(143) int local143 = local134 > 2048 ? local134 - 4096 : local134;
				local11[local32] = this.method332(local95, local67) || this.method335(local143, local118) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IZI)Z")
	private boolean method332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg0 - arg1) * this.anInt375 >> 12;
		@Pc(22) int local22 = Static378.anIntArray381[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt375;
		@Pc(41) int local41 = (local29 << 12) / this.anInt373;
		@Pc(48) int local48 = local41 * this.anInt374 >> 12;
		return local48 > arg0 + arg1 && -local48 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(III)Z")
	private boolean method335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt375 * (arg1 + arg0) >> 12;
		@Pc(27) int local27 = Static378.anIntArray381[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt375;
		@Pc(41) int local41 = (local34 << 12) / this.anInt373;
		@Pc(48) int local48 = local41 * this.anInt374 >> 12;
		return local48 > arg0 - arg1 && arg0 - arg1 > -local48;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V")
	@Override
	public void method8951() {
		Static47.method612();
	}
}
