import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class3_Sub6_Sub30 extends Class3_Sub6 {

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean729 = arg0.method5175() == 1;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(III)V")
	private void method6590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static73.anIntArray76[arg0];
		@Pc(13) int local13 = Static525.anIntArray553[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static66.anInt1530 = arg0;
			Static138.anInt3001 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static138.anInt3001 = arg0;
			Static66.anInt1530 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static138.anInt3001 = arg0;
			Static66.anInt1530 = Static521.anInt8383 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static138.anInt3001 = Static522.anInt8394 - arg1;
			Static66.anInt1530 = arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static138.anInt3001 = Static522.anInt8394 - arg1;
			Static66.anInt1530 = Static521.anInt8383 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static66.anInt1530 = Static521.anInt8383 - arg1;
			Static138.anInt3001 = Static522.anInt8394 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static138.anInt3001 = Static522.anInt8394 - arg0;
			Static66.anInt1530 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static66.anInt1530 = Static521.anInt8383 - arg0;
			Static138.anInt3001 = arg1;
		}
		Static138.anInt3001 &= Static68.anInt1579;
		Static66.anInt1530 &= Static296.anInt5049;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static521.anInt8383; local29++) {
				this.method6590(local29, arg0);
				@Pc(42) int[][] local42 = this.method7773(0, Static138.anInt3001);
				local19[local29] = local42[0][Static66.anInt1530];
				local23[local29] = local42[1][Static66.anInt1530];
				local27[local29] = local42[2][Static66.anInt1530];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			for (@Pc(25) int local25 = 0; local25 < Static521.anInt8383; local25++) {
				this.method6590(local25, arg0);
				@Pc(38) int[] local38 = this.method7769(Static138.anInt3001, 0);
				local19[local25] = local38[Static66.anInt1530];
			}
		}
		return local19;
	}
}
