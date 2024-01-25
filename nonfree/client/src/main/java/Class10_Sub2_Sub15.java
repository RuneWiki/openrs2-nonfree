import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class10_Sub2_Sub15 extends Class10_Sub2 {

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			for (@Pc(22) int local22 = 0; local22 < Static121.anInt2458; local22++) {
				this.method2212(arg0, local22);
				@Pc(35) int[] local35 = this.method6041(Static72.anInt1487, 0);
				local16[local22] = local35[Static400.anInt6753];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean499 = arg1.method2502() == 1;
		}
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static121.anInt2458; local29++) {
				this.method2212(arg0, local29);
				@Pc(42) int[][] local42 = this.method6045(0, Static72.anInt1487);
				local19[local29] = local42[0][Static400.anInt6753];
				local23[local29] = local42[1][Static400.anInt6753];
				local27[local29] = local42[2][Static400.anInt6753];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BII)V")
	private void method2212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static182.anIntArray374[arg1];
		@Pc(13) int local13 = Static67.anIntArray106[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static72.anInt1487 = arg0;
			Static400.anInt6753 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static400.anInt6753 = arg0;
			Static72.anInt1487 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static400.anInt6753 = Static121.anInt2458 - arg0;
			Static72.anInt1487 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static72.anInt1487 = Static190.anInt3835 - arg0;
			Static400.anInt6753 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static400.anInt6753 = Static121.anInt2458 - arg1;
			Static72.anInt1487 = Static190.anInt3835 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static72.anInt1487 = Static190.anInt3835 - arg1;
			Static400.anInt6753 = Static121.anInt2458 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static72.anInt1487 = Static190.anInt3835 - arg1;
			Static400.anInt6753 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static400.anInt6753 = Static121.anInt2458 - arg1;
			Static72.anInt1487 = arg0;
		}
		Static400.anInt6753 &= Static429.anInt7203;
		Static72.anInt1487 &= Static140.anInt2877;
	}
}
