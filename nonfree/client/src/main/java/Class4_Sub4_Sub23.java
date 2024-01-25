import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class4_Sub4_Sub23 extends Class4_Sub4 {

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			for (@Pc(24) int local24 = 0; local24 < Static419.anInt6404; local24++) {
				this.method4053(local24, arg0);
				@Pc(37) int[] local37 = this.method6040(Static336.anInt5466, 0);
				local13[local24] = local37[Static246.anInt4069];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			super.aBoolean535 = arg1.method5007() == 1;
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(26) int[] local26 = local18[0];
			@Pc(30) int[] local30 = local18[1];
			@Pc(34) int[] local34 = local18[2];
			for (@Pc(36) int local36 = 0; local36 < Static419.anInt6404; local36++) {
				this.method4053(local36, arg0);
				@Pc(49) int[][] local49 = this.method6049(Static336.anInt5466, 0);
				local26[local36] = local49[0][Static246.anInt4069];
				local30[local36] = local49[1][Static246.anInt4069];
				local34[local36] = local49[2][Static246.anInt4069];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(III)V")
	private void method4053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = Static226.anIntArray284[arg0];
		@Pc(21) int local21 = Static334.anIntArray437[arg1];
		@Pc(32) float local32 = (float) Math.atan2((double) (local17 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static336.anInt5466 = arg1;
			Static246.anInt4069 = arg0;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static246.anInt4069 = arg1;
			Static336.anInt5466 = arg0;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static246.anInt4069 = Static419.anInt6404 - arg1;
			Static336.anInt5466 = arg0;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static336.anInt5466 = Static91.anInt1740 - arg1;
			Static246.anInt4069 = arg0;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static336.anInt5466 = Static91.anInt1740 - arg1;
			Static246.anInt4069 = Static419.anInt6404 - arg0;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static246.anInt4069 = Static419.anInt6404 - arg1;
			Static336.anInt5466 = Static91.anInt1740 - arg0;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static246.anInt4069 = arg1;
			Static336.anInt5466 = Static91.anInt1740 - arg0;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static336.anInt5466 = arg1;
			Static246.anInt4069 = Static419.anInt6404 - arg0;
		}
		Static246.anInt4069 &= Static211.anInt3669;
		Static336.anInt5466 &= Static204.anInt3610;
	}
}
