import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_46 = new Class160(16, 7);

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[8];

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method3371(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) byte[] local14 = new byte[arg1];
		Static585.method3080(arg0, 0, local14, 0, arg1);
		return local14;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIIIIIIZ)Z")
	public static boolean method3372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(8) int local8 = Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray661[0];
		@Pc(13) int local13 = Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray660[0];
		if (local8 < 0 || Static301.anInt4912 <= local8 || local13 < 0 || Static473.anInt7969 <= local13) {
			return false;
		} else if (arg6 >= 0 && Static301.anInt4912 > arg6 && arg3 >= 0 && Static473.anInt7969 > arg3) {
			@Pc(73) int local73 = Static394.method5824(arg6, local13, arg5, Static281.anIntArray451, arg3, arg2, arg0, arg7, arg4, Static77.anIntArray94, Static296.aClass295Array3[Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103], arg1, Static426.aClass29_Sub2_Sub1_Sub2_2.method7008(), local8);
			if (local73 < 1) {
				return false;
			}
			Static334.anInt5975 = Static281.anIntArray451[local73 - 1];
			Static16.anInt311 = Static77.anIntArray94[local73 - 1];
			Static190.aBoolean258 = false;
			Static201.method5196();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Z)V")
	public static void method3374() {
		if (Static176.aClass121_5.method7081()) {
			Static176.aClass121_5.method7132(Static34.aCanvas15);
			Static87.method1417();
			Static176.aClass121_5.method7120(Static34.aCanvas15);
			Static176.aClass121_5.method7101(Static34.aCanvas15);
		} else {
			Static360.method5340(Static567.anInt9503);
		}
		Static260.method3643();
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIZ)I")
	public static int method3375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class6_Sub13 local8 = Static59.method44(arg1, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && local8.anIntArray171.length > arg0) {
			return local8.anIntArray171[arg0];
		} else {
			return -1;
		}
	}
}
