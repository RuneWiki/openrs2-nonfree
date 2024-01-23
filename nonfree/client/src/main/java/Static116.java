import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString152 = "Members object";

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZIIII[Lclient!wf;)V")
	public static void method1871(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class191[] arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg4.length; local3++) {
			@Pc(11) Class191 local11 = arg4[local3];
			if (local11 != null && arg1 == local11.anInt6093) {
				Static84.method1458(local11, arg3, arg0, arg2);
				Static39.method803(arg2, arg3, local11);
				if (local11.anInt6163 > local11.anInt6155 - local11.anInt6088) {
					local11.anInt6163 = local11.anInt6155 - local11.anInt6088;
				}
				if (local11.anInt6106 > local11.anInt6151 - local11.anInt6128) {
					local11.anInt6106 = local11.anInt6151 - local11.anInt6128;
				}
				if (local11.anInt6163 < 0) {
					local11.anInt6163 = 0;
				}
				if (local11.anInt6106 < 0) {
					local11.anInt6106 = 0;
				}
				if (local11.anInt6086 == 0) {
					Static99.method1655(local11, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static21.method455(arg6, arg4, arg3, 0, arg2, arg0, arg5, arg1);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[F")
	public static float[] method1876(@OriginalArg(1) int arg0) {
		@Pc(7) float local7 = Static180.method2909() + Static180.method2904();
		@Pc(9) int local9 = Static180.method2906();
		@Pc(18) float local18 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		Static301.aFloatArray21[3] = 1.0F;
		@Pc(29) float local29 = (float) (local9 & 0xFF) / 255.0F;
		@Pc(38) float local38 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(40) float local40 = 0.58823526F;
		Static301.aFloatArray21[0] = local7 * local40 * local38 * ((float) (arg0 >> 16 & 0xFF) / 255.0F);
		Static301.aFloatArray21[1] = local18 * ((float) (arg0 >> 8 & 0xFF) / 255.0F) * local40 * local7;
		Static301.aFloatArray21[2] = local7 * (float) (arg0 & 0xFF) / 255.0F * local29 * local40;
		return Static301.aFloatArray21;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1877(@OriginalArg(0) String arg0) {
		Static147.method2381(0, arg0, 0, "", "");
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!th;Lclient!th;Z)V")
	public static void method1879(@OriginalArg(1) Class168 arg0, @OriginalArg(2) Class168 arg1) {
		Static60.aBoolean91 = true;
		Static264.aClass168_179 = arg0;
		Static74.aClass168_58 = arg1;
	}
}
