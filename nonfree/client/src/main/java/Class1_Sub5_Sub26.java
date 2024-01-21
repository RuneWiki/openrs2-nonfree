import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class1_Sub5_Sub26 extends Class1_Sub5 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass53_41.method1591(arg0);
		@Pc(23) int[] local23 = local19[1];
		@Pc(27) int[] local27 = local19[0];
		@Pc(31) int[] local31 = local19[2];
		if (super.aClass53_41.aBoolean90) {
			for (@Pc(37) int local37 = 0; local37 < Static177.anInt4018; local37++) {
				this.method2219(arg0, local37);
				@Pc(50) int[][] local50 = this.method3144(Static6.anInt147, 0);
				local27[local37] = local50[0][Static5.anInt139];
				local23[local37] = local50[1][Static5.anInt139];
				local31[local37] = local50[2][Static5.anInt139];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean173 = arg0.method336() == 1;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)V")
	private void method2219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static34.anIntArray75[arg0];
		@Pc(18) int local18 = Static116.anIntArray275[arg1];
		@Pc(29) float local29 = (float) Math.atan2((double) (local18 - 2048), (double) (local14 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static6.anInt147 = arg0;
			Static5.anInt139 = arg1;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static5.anInt139 = arg0;
			Static6.anInt147 = arg1;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static6.anInt147 = arg1;
			Static5.anInt139 = Static177.anInt4018 - arg0;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static5.anInt139 = arg1;
			Static6.anInt147 = Static101.anInt2218 - arg0;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static5.anInt139 = Static177.anInt4018 - arg1;
			Static6.anInt147 = Static101.anInt2218 - arg0;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static5.anInt139 = Static177.anInt4018 - arg0;
			Static6.anInt147 = Static101.anInt2218 - arg1;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static5.anInt139 = arg0;
			Static6.anInt147 = Static101.anInt2218 - arg1;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static5.anInt139 = Static177.anInt4018 - arg1;
			Static6.anInt147 = arg0;
		}
		Static5.anInt139 &= Static47.anInt1130;
		Static6.anInt147 &= Static151.anInt3420;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			for (@Pc(22) int local22 = 0; local22 < Static177.anInt4018; local22++) {
				this.method2219(arg0, local22);
				@Pc(35) int[] local35 = this.method3145(0, Static6.anInt147);
				local7[local22] = local35[Static5.anInt139];
			}
		}
		return local7;
	}
}
