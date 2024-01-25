import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class6_Sub3_Sub22 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(III)V")
	private void method4956(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static157.anIntArray321[arg0];
		@Pc(13) int local13 = Static564.anIntArray703[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static541.anInt9161 = arg0;
			Static198.anInt3445 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static198.anInt3445 = arg0;
			Static541.anInt9161 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static198.anInt3445 = arg0;
			Static541.anInt9161 = Static447.anInt8568 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static198.anInt3445 = Static495.anInt8251 - arg1;
			Static541.anInt9161 = arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static541.anInt9161 = Static447.anInt8568 - arg0;
			Static198.anInt3445 = Static495.anInt8251 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static541.anInt9161 = Static447.anInt8568 - arg1;
			Static198.anInt3445 = Static495.anInt8251 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static541.anInt9161 = arg1;
			Static198.anInt3445 = Static495.anInt8251 - arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static541.anInt9161 = Static447.anInt8568 - arg0;
			Static198.anInt3445 = arg1;
		}
		Static541.anInt9161 &= Static392.anInt6966;
		Static198.anInt3445 &= Static252.anInt4135;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static447.anInt8568; local29++) {
				this.method4956(local29, arg0);
				@Pc(42) int[][] local42 = this.method7823(0, Static198.anInt3445);
				local19[local29] = local42[0][Static541.anInt9161];
				local23[local29] = local42[1][Static541.anInt9161];
				local27[local29] = local42[2][Static541.anInt9161];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			for (@Pc(25) int local25 = 0; local25 < Static447.anInt8568; local25++) {
				this.method4956(local25, arg0);
				@Pc(38) int[] local38 = this.method7824(0, Static198.anInt3445);
				local19[local25] = local38[Static541.anInt9161];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			super.aBoolean668 = arg1.method6041() == 1;
		}
	}
}
