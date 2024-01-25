import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class2_Sub3_Sub39 extends Class2_Sub3 {

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static222.anInt4971; local34++) {
				this.method9160(local34, arg0);
				@Pc(47) int[][] local47 = this.method9147(Static11.anInt6558, 0);
				local24[local34] = local47[0][Static369.anInt7337];
				local28[local34] = local47[1][Static369.anInt7337];
				local32[local34] = local47[2][Static369.anInt7337];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			for (@Pc(22) int local22 = 0; local22 < Static222.anInt4971; local22++) {
				this.method9160(local22, arg0);
				@Pc(37) int[] local37 = this.method9156(Static11.anInt6558, 0);
				local16[local22] = local37[Static369.anInt7337];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean748 = arg0.method8383() == 1;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)V")
	private void method9160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static464.anIntArray556[arg0];
		@Pc(13) int local13 = Static547.anIntArray641[arg1];
		@Pc(32) float local32 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static11.anInt6558 = arg1;
			Static369.anInt7337 = arg0;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static11.anInt6558 = arg0;
			Static369.anInt7337 = arg1;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static369.anInt7337 = Static222.anInt4971 - arg1;
			Static11.anInt6558 = arg0;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static369.anInt7337 = arg0;
			Static11.anInt6558 = Static101.anInt2845 - arg1;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static369.anInt7337 = Static222.anInt4971 - arg0;
			Static11.anInt6558 = Static101.anInt2845 - arg1;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static369.anInt7337 = Static222.anInt4971 - arg1;
			Static11.anInt6558 = Static101.anInt2845 - arg0;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static11.anInt6558 = Static101.anInt2845 - arg0;
			Static369.anInt7337 = arg1;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static11.anInt6558 = arg1;
			Static369.anInt7337 = Static222.anInt4971 - arg0;
		}
		Static11.anInt6558 &= Static591.anInt6375;
		Static369.anInt7337 &= Static620.anInt10845;
	}
}
