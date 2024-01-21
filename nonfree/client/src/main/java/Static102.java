import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ki", name = "R", descriptor = "I")
	public static int anInt2347;

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "Lclient!qe;")
	public static Class83 aClass83_679 = null;

	@OriginalMember(owner = "client!ki", name = "K", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_680 = Static181.method2795("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!ki", name = "L", descriptor = "[S")
	public static final short[] aShortArray21 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ki", name = "U", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_681 = Static181.method2795("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ki", name = "X", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_682 = Static181.method2795("Cabbage");

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V")
	public static void method1756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static37.anInt961 == 1) {
			Static175.aClass2_Sub2_Sub17Array10[Static46.anInt1093 / 100].method1905(Static85.anInt1874 - 8, Static33.anInt870 - 8);
		}
		if (Static37.anInt961 == 2) {
			Static175.aClass2_Sub2_Sub17Array10[Static46.anInt1093 / 100 + 4].method1905(Static85.anInt1874 - 8, Static33.anInt870 - 8);
		}
		Static12.method298();
		if (!Static167.aBoolean160) {
			return;
		}
		@Pc(51) int local51 = arg0 + 512 - 5;
		@Pc(55) int local55 = arg2 + 20;
		Static167.aClass2_Sub2_Sub5_3.method1082(Static67.method1268(new Class83[] { Static124.aClass83_742, Static129.method2179(Static130.anInt2835) }), local51, local55, 16776960, -1);
		@Pc(77) Runtime local77 = Runtime.getRuntime();
		@Pc(78) int local78 = local55 + 15;
		@Pc(80) int local80 = 16776960;
		@Pc(90) int local90 = (int) ((local77.totalMemory() - local77.freeMemory()) / 1024L);
		if (local90 > 32768 && Static158.aBoolean148) {
			local80 = 16711680;
		}
		if (local90 > 65536 && !Static158.aBoolean148) {
			local80 = 16711680;
		}
		Static167.aClass2_Sub2_Sub5_3.method1082(Static67.method1268(new Class83[] { Static71.aClass83_526, Static129.method2179(local90), Static205.aClass83_1164 }), local51, local78, local80, -1);
		local55 = local78 + 15;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIII)V")
	public static void method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static63.method2583(arg3);
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = arg3 - arg1;
		@Pc(19) int local19 = arg3;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(27) int local27 = -arg3;
		@Pc(29) int local29 = local17;
		@Pc(31) int local31 = -1;
		@Pc(34) int local34 = -local17;
		@Pc(38) int[] local38 = Static14.anIntArrayArray18[arg4];
		@Pc(40) int local40 = -1;
		@Pc(45) int local45 = arg2 - local17;
		@Pc(49) int local49 = arg2 + local17;
		Static22.method438(local45, arg5, arg2 - arg3, local38);
		Static22.method438(local49, arg0, local45, local38);
		Static22.method438(arg3 + arg2, arg5, local49, local38);
		while (local12 < local19) {
			local40 += 2;
			local31 += 2;
			local34 += local31;
			if (local34 >= 0 && local29 >= 1) {
				Static129.anIntArray282[local29] = local12;
				local29--;
				local34 -= local29 << 1;
			}
			local27 += local40;
			local12++;
			@Pc(128) int[] local128;
			@Pc(135) int[] local135;
			@Pc(143) int local143;
			@Pc(139) int local139;
			@Pc(148) int local148;
			@Pc(152) int local152;
			@Pc(156) int local156;
			if (local27 >= 0) {
				local19--;
				local27 -= local19 << 1;
				if (local17 > local19) {
					local128 = Static14.anIntArrayArray18[local19 + arg4];
					local135 = Static14.anIntArrayArray18[arg4 - local19];
					local139 = local12 + arg2;
					local143 = Static129.anIntArray282[local19];
					local148 = arg2 - local12;
					local152 = arg2 + local143;
					local156 = arg2 - local143;
					Static22.method438(local156, arg5, local148, local128);
					Static22.method438(local152, arg0, local156, local128);
					Static22.method438(local139, arg5, local152, local128);
					Static22.method438(local156, arg5, local148, local135);
					Static22.method438(local152, arg0, local156, local135);
					Static22.method438(local139, arg5, local152, local135);
				} else {
					local128 = Static14.anIntArrayArray18[local19 + arg4];
					local143 = local12 + arg2;
					local135 = Static14.anIntArrayArray18[arg4 - local19];
					local139 = arg2 - local12;
					Static22.method438(local143, arg5, local139, local128);
					Static22.method438(local143, arg5, local139, local135);
				}
			}
			local128 = Static14.anIntArrayArray18[local12 + arg4];
			local143 = local19 + arg2;
			local139 = arg2 - local19;
			local135 = Static14.anIntArrayArray18[arg4 - local12];
			if (local12 < local17) {
				local148 = local12 <= local29 ? local29 : Static129.anIntArray282[local12];
				local152 = local148 + arg2;
				local156 = arg2 - local148;
				Static22.method438(local156, arg5, local139, local128);
				Static22.method438(local152, arg0, local156, local128);
				Static22.method438(local143, arg5, local152, local128);
				Static22.method438(local156, arg5, local139, local135);
				Static22.method438(local152, arg0, local156, local135);
				Static22.method438(local143, arg5, local152, local135);
			} else {
				Static22.method438(local143, arg5, local139, local128);
				Static22.method438(local143, arg5, local139, local135);
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)Lclient!fd;")
	public static Class2_Sub2_Sub9 method1758(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub2_Sub9 local6 = (Class2_Sub2_Sub9) Static74.aClass86_24.method2643((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(29) byte[] local29 = Static44.aClass28_49.method852(arg0, 28);
		local6 = new Class2_Sub2_Sub9();
		if (local29 != null) {
			local6.method1024(new Class2_Sub3(local29));
		}
		Static74.aClass86_24.method2647(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Lclient!qe;")
	public static Class83 method1759(@OriginalArg(0) int arg0) {
		@Pc(3) Class83 local3 = new Class83();
		local3.aByteArray36 = new byte[arg0];
		local3.anInt3158 = 0;
		return local3;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)Z")
	public static boolean method1766(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!gh;")
	public static Class34 method1768(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(14) Class local14 = Class.forName("Class34_Sub1");
			@Pc(18) Class34 local18 = (Class34) local14.getDeclaredConstructor().newInstance();
			local18.method2584(arg2, arg1, arg0);
			return local18;
		} catch (@Pc(29) Throwable local29) {
			@Pc(33) Class34_Sub2 local33 = new Class34_Sub2();
			local33.method2584(arg2, arg1, arg0);
			return local33;
		}
	}
}
