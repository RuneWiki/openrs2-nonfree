import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(19) int[] local19 = local11[1];
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static157.anInt3431; local29++) {
				this.method327(arg0, local29);
				@Pc(42) int[][] local42 = this.method3737(0, Static32.anInt708);
				local23[local29] = local42[0][Static116.anInt1291];
				local19[local29] = local42[1][Static116.anInt1291];
				local27[local29] = local42[2][Static116.anInt1291];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			for (@Pc(25) int local25 = 0; local25 < Static157.anInt3431; local25++) {
				this.method327(arg0, local25);
				@Pc(38) int[] local38 = this.method3733(Static32.anInt708, 0);
				local15[local25] = local38[Static116.anInt1291];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean213 = arg0.method3793() == 1;
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IBI)V")
	private void method327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static211.anIntArray334[arg0];
		@Pc(17) int local17 = Static73.anIntArray105[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local17 - 2048), (double) (local5 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static32.anInt708 = arg0;
			Static116.anInt1291 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static116.anInt1291 = arg0;
			Static32.anInt708 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static116.anInt1291 = Static157.anInt3431 - arg0;
			Static32.anInt708 = arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static116.anInt1291 = arg1;
			Static32.anInt708 = Static187.anInt4033 - arg0;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static116.anInt1291 = Static157.anInt3431 - arg1;
			Static32.anInt708 = Static187.anInt4033 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static32.anInt708 = Static187.anInt4033 - arg1;
			Static116.anInt1291 = Static157.anInt3431 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static116.anInt1291 = arg0;
			Static32.anInt708 = Static187.anInt4033 - arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static116.anInt1291 = Static157.anInt3431 - arg1;
			Static32.anInt708 = arg0;
		}
		Static116.anInt1291 &= Static74.anInt1679;
		Static32.anInt708 &= Static148.anInt3213;
	}
}
