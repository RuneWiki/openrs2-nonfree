import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBI)V")
	private void method6886(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static557.anIntArray708[arg0];
		@Pc(21) int local21 = Static445.anIntArray590[arg1];
		@Pc(32) float local32 = (float) Math.atan2((double) (local9 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static254.anInt4597 = arg0;
			Static193.anInt3584 = arg1;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static193.anInt3584 = arg0;
			Static254.anInt4597 = arg1;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static254.anInt4597 = Static279.anInt4906 - arg1;
			Static193.anInt3584 = arg0;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static254.anInt4597 = arg0;
			Static193.anInt3584 = Static52.anInt1010 - arg1;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static193.anInt3584 = Static52.anInt1010 - arg1;
			Static254.anInt4597 = Static279.anInt4906 - arg0;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static254.anInt4597 = Static279.anInt4906 - arg1;
			Static193.anInt3584 = Static52.anInt1010 - arg0;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static193.anInt3584 = Static52.anInt1010 - arg0;
			Static254.anInt4597 = arg1;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static193.anInt3584 = arg1;
			Static254.anInt4597 = Static279.anInt4906 - arg0;
		}
		Static193.anInt3584 &= Static171.anInt3020;
		Static254.anInt4597 &= Static216.anInt4134;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			for (@Pc(25) int local25 = 0; local25 < Static279.anInt4906; local25++) {
				this.method6886(local25, arg0);
				@Pc(38) int[] local38 = this.method7709(Static193.anInt3584, 0);
				local11[local25] = local38[Static254.anInt4597];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean737 = arg0.method5750() == 1;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static279.anInt4906; local29++) {
				this.method6886(local29, arg0);
				@Pc(42) int[][] local42 = this.method7700(Static193.anInt3584, 0);
				local19[local29] = local42[0][Static254.anInt4597];
				local23[local29] = local42[1][Static254.anInt4597];
				local27[local29] = local42[2][Static254.anInt4597];
			}
		}
		return local11;
	}
}
