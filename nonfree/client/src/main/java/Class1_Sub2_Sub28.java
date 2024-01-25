import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class1_Sub2_Sub28 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
	private int anInt4636 = 32768;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub28() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(21) int[] local21 = this.method5654(1, arg0);
			@Pc(27) int[] local27 = this.method5654(2, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static251.anInt6509; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = this.anInt4636 * local27[local41] >> 12;
				@Pc(70) int local70 = Static238.anIntArray597[local53] * local62 >> 12;
				@Pc(78) int local78 = local62 * Static119.anIntArray251[local53] >> 12;
				@Pc(86) int local86 = Static260.anInt5056 & (local70 >> 12) + local41;
				@Pc(94) int local94 = (local78 >> 12) + arg0 & Static206.anInt4136;
				@Pc(100) int[][] local100 = this.method5659(local94, 0);
				local31[local41] = local100[0][local86];
				local35[local41] = local100[1][local86];
				local39[local41] = local100[2][local86];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt4636 = arg1.method3115() << 4;
		} else if (arg0 == 1) {
			super.aBoolean583 = arg1.method3141() == 1;
		}
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	@Override
	public void method5661() {
		Static244.method4324();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(26) int[] local26 = this.method5654(1, arg0);
			@Pc(34) int[] local34 = this.method5654(2, arg0);
			for (@Pc(36) int local36 = 0; local36 < Static251.anInt6509; local36++) {
				@Pc(46) int local46 = local26[local36] >> 4 & 0xFF;
				@Pc(55) int local55 = local34[local36] * this.anInt4636 >> 12;
				@Pc(63) int local63 = Static238.anIntArray597[local46] * local55 >> 12;
				@Pc(71) int local71 = local55 * Static119.anIntArray251[local46] >> 12;
				@Pc(79) int local79 = (local63 >> 12) + local36 & Static260.anInt5056;
				@Pc(87) int local87 = (local71 >> 12) + arg0 & Static206.anInt4136;
				@Pc(93) int[] local93 = this.method5654(0, local87);
				local11[local36] = local93[local79];
			}
		}
		return local11;
	}
}
