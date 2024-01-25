import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class6_Sub1_Sub28 extends Class6_Sub1 {

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(III)V")
	private void method6872(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static473.anIntArray730[arg0];
		@Pc(18) int local18 = Static346.anIntArray472[arg1];
		@Pc(29) float local29 = (float) Math.atan2((double) (local14 - 2048), (double) (local18 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static498.anInt8887 = arg0;
			Static187.anInt4103 = arg1;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static187.anInt4103 = arg0;
			Static498.anInt8887 = arg1;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static498.anInt8887 = Static289.anInt5549 - arg1;
			Static187.anInt4103 = arg0;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static187.anInt4103 = Static468.anInt8642 - arg1;
			Static498.anInt8887 = arg0;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static187.anInt4103 = Static468.anInt8642 - arg1;
			Static498.anInt8887 = Static289.anInt5549 - arg0;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static187.anInt4103 = Static468.anInt8642 - arg0;
			Static498.anInt8887 = Static289.anInt5549 - arg1;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static498.anInt8887 = arg1;
			Static187.anInt4103 = Static468.anInt8642 - arg0;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static187.anInt4103 = arg1;
			Static498.anInt8887 = Static289.anInt5549 - arg0;
		}
		Static498.anInt8887 &= Static153.anInt3343;
		Static187.anInt4103 &= Static574.anInt9711;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static289.anInt5549; local34++) {
				this.method6872(local34, arg0);
				@Pc(49) int[][] local49 = this.method8162(Static187.anInt4103, 0);
				local24[local34] = local49[0][Static498.anInt8887];
				local28[local34] = local49[1][Static498.anInt8887];
				local32[local34] = local49[2][Static498.anInt8887];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			super.aBoolean719 = arg1.method4966() == 1;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			for (@Pc(22) int local22 = 0; local22 < Static289.anInt5549; local22++) {
				this.method6872(local22, arg0);
				@Pc(35) int[] local35 = this.method8165(0, Static187.anInt4103);
				local16[local22] = local35[Static498.anInt8887];
			}
		}
		return local16;
	}
}
