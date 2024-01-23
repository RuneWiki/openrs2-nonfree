import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class4_Sub1_Sub21 extends Class4_Sub1 {

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
	private int anInt3352 = 32768;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub21() {
		super(3, false);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(27) int[] local27 = this.method4538(1, arg0);
			@Pc(33) int[] local33 = this.method4538(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static68.anInt1753; local35++) {
				@Pc(50) int local50 = local27[local35] >> 4 & 0xFF;
				@Pc(59) int local59 = this.anInt3352 * local33[local35] >> 12;
				@Pc(67) int local67 = local59 * Static284.anIntArray447[local50] >> 12;
				@Pc(75) int local75 = Static144.anIntArray233[local50] * local59 >> 12;
				@Pc(83) int local83 = (local67 >> 12) + local35 & Static295.anInt5711;
				@Pc(91) int local91 = Static19.anInt437 & (local75 >> 12) + arg0;
				@Pc(97) int[] local97 = this.method4538(0, local91);
				local17[local35] = local97[local83];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
	@Override
	public void method4537() {
		Static37.method1936();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(22) int[] local22 = this.method4538(1, arg0);
			@Pc(28) int[] local28 = this.method4538(2, arg0);
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[2];
			for (@Pc(42) int local42 = 0; local42 < Static68.anInt1753; local42++) {
				@Pc(55) int local55 = local22[local42] * 255 >> 12 & 0xFF;
				@Pc(64) int local64 = this.anInt3352 * local28[local42] >> 12;
				@Pc(72) int local72 = local64 * Static284.anIntArray447[local55] >> 12;
				@Pc(81) int local81 = Static295.anInt5711 & local42 + (local72 >> 12);
				@Pc(89) int local89 = local64 * Static144.anIntArray233[local55] >> 12;
				@Pc(97) int local97 = Static19.anInt437 & (local89 >> 12) + arg0;
				@Pc(103) int[][] local103 = this.method4549(0, local97);
				local36[local42] = local103[0][local81];
				local32[local42] = local103[1][local81];
				local40[local42] = local103[2][local81];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt3352 = arg1.method3085() << 4;
		} else if (arg0 == 1) {
			this.aBoolean392 = arg1.method3110() == 1;
		}
	}
}
