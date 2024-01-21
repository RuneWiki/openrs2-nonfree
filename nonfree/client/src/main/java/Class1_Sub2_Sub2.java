import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass19_41.method1028(arg0);
		@Pc(20) int[] local20 = local11[0];
		@Pc(24) int[] local24 = local11[1];
		@Pc(28) int[] local28 = local11[2];
		if (super.aClass19_41.aBoolean54) {
			for (@Pc(34) int local34 = 0; local34 < Static22.anInt596; local34++) {
				this.method277(local34, arg0);
				@Pc(47) int[][] local47 = this.method3390(Static16.anInt469, 0);
				local20[local34] = local47[0][Static2.anInt129];
				local24[local34] = local47[1][Static2.anInt129];
				local28[local34] = local47[2][Static2.anInt129];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			for (@Pc(22) int local22 = 0; local22 < Static22.anInt596; local22++) {
				this.method277(local22, arg0);
				@Pc(35) int[] local35 = this.method3401(Static16.anInt469, 0);
				local16[local22] = local35[Static2.anInt129];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			super.aBoolean173 = arg1.method1234() == 1;
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
	private void method277(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = Static167.anIntArray417[arg0];
		@Pc(20) int local20 = Static160.anIntArray399[arg1];
		@Pc(31) float local31 = (float) Math.atan2((double) (local16 - 2048), (double) (local20 - 2048));
		if ((double) local31 >= -3.141592653589793D && (double) local31 <= -2.356194490192345D) {
			Static2.anInt129 = arg0;
			Static16.anInt469 = arg1;
		} else if ((double) local31 <= -1.5707963267948966D && (double) local31 >= -2.356194490192345D) {
			Static2.anInt129 = arg1;
			Static16.anInt469 = arg0;
		} else if ((double) local31 <= -0.7853981633974483D && (double) local31 >= -1.5707963267948966D) {
			Static2.anInt129 = Static22.anInt596 - arg1;
			Static16.anInt469 = arg0;
		} else if (local31 <= 0.0F && (double) local31 >= -0.7853981633974483D) {
			Static16.anInt469 = Static181.anInt4508 - arg1;
			Static2.anInt129 = arg0;
		} else if (local31 >= 0.0F && (double) local31 <= 0.7853981633974483D) {
			Static16.anInt469 = Static181.anInt4508 - arg1;
			Static2.anInt129 = Static22.anInt596 - arg0;
		} else if ((double) local31 >= 0.7853981633974483D && (double) local31 <= 1.5707963267948966D) {
			Static16.anInt469 = Static181.anInt4508 - arg0;
			Static2.anInt129 = Static22.anInt596 - arg1;
		} else if ((double) local31 >= 1.5707963267948966D && (double) local31 <= 2.356194490192345D) {
			Static16.anInt469 = Static181.anInt4508 - arg0;
			Static2.anInt129 = arg1;
		} else if ((double) local31 >= 2.356194490192345D && (double) local31 <= 3.141592653589793D) {
			Static2.anInt129 = Static22.anInt596 - arg0;
			Static16.anInt469 = arg1;
		}
		Static2.anInt129 &= Static28.anInt833;
		Static16.anInt469 &= Static14.anInt436;
	}
}
