import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class3_Sub2_Sub9 extends Class3_Sub2 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			for (@Pc(22) int local22 = 0; local22 < Static86.anInt1942; local22++) {
				this.method1258(local22, arg0);
				@Pc(35) int[] local35 = this.method2787(Static136.anInt3087, 0);
				local16[local22] = local35[Static5.anInt106];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass28_39.method997(arg0);
		@Pc(15) int[] local15 = local11[0];
		@Pc(19) int[] local19 = local11[2];
		@Pc(32) int[] local32 = local11[1];
		if (super.aClass28_39.aBoolean89) {
			for (@Pc(38) int local38 = 0; local38 < Static86.anInt1942; local38++) {
				this.method1258(local38, arg0);
				@Pc(51) int[][] local51 = this.method2785(Static136.anInt3087, 0);
				local15[local38] = local51[0][Static5.anInt106];
				local32[local38] = local51[1][Static5.anInt106];
				local19[local38] = local51[2][Static5.anInt106];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean271 = arg0.method1354() == 1;
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(III)V")
	private void method1258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static165.anIntArray17[arg0];
		@Pc(13) int local13 = Static123.anIntArray308[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local5 - 2048), (double) (local13 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static5.anInt106 = arg0;
			Static136.anInt3087 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static136.anInt3087 = arg0;
			Static5.anInt106 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static136.anInt3087 = arg0;
			Static5.anInt106 = Static86.anInt1942 - arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static5.anInt106 = arg0;
			Static136.anInt3087 = Static152.anInt3405 - arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static136.anInt3087 = Static152.anInt3405 - arg1;
			Static5.anInt106 = Static86.anInt1942 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static136.anInt3087 = Static152.anInt3405 - arg0;
			Static5.anInt106 = Static86.anInt1942 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static5.anInt106 = arg1;
			Static136.anInt3087 = Static152.anInt3405 - arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static5.anInt106 = Static86.anInt1942 - arg0;
			Static136.anInt3087 = arg1;
		}
		Static5.anInt106 &= Static165.anInt321;
		Static136.anInt3087 &= Static124.anInt2869;
	}
}
