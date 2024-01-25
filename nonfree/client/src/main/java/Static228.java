import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!ol", name = "D", descriptor = "Lclient!ct;")
	public static Class30 aClass30_67;

	@OriginalMember(owner = "client!ol", name = "E", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_155 = new Class18(7, 18);

	@OriginalMember(owner = "client!ol", name = "F", descriptor = "Z")
	public static boolean aBoolean351 = true;

	@OriginalMember(owner = "client!ol", name = "I", descriptor = "Lclient!dq;")
	public static Class38 aClass38_25 = new Class38(128);

	@OriginalMember(owner = "client!ol", name = "K", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_157 = new Class106("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!ol", name = "L", descriptor = "[I")
	public static final int[] anIntArray378 = new int[1000];

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
	public static void method4268() {
		if (Static166.anInt3465 > 0) {
			Static294.method5141();
		} else {
			Static30.aClass76_1 = Static165.aClass76_2;
			Static165.aClass76_2 = null;
			Static44.method1064(40);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!ge;I)I")
	public static int method4269(@OriginalArg(0) Class1_Sub7_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method2169(2);
		@Pc(28) int local28;
		if (local15 == 0) {
			local28 = 0;
		} else if (local15 == 1) {
			local28 = arg0.method2169(5);
		} else if (local15 == 2) {
			local28 = arg0.method2169(8);
		} else {
			local28 = arg0.method2169(11);
		}
		return local28;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZIIII)V")
	public static void method4271(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(23) int local23 = arg3 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(49) int local49 = Static236.aShort69 + local23 * (Static197.aShort54 - Static236.aShort69) / 100;
		if (local49 < Static351.aShort39) {
			local49 = Static351.aShort39;
		} else if (local49 > Static260.aShort71) {
			local49 = Static260.aShort71;
		}
		@Pc(71) int local71 = arg3 * 512 * local49 / (arg2 * 334);
		@Pc(105) int local105;
		@Pc(112) int local112;
		@Pc(80) short local80;
		if (local71 < Static31.aShort17) {
			local80 = Static31.aShort17;
			local49 = arg2 * 334 * local80 / (arg3 * 512);
			if (Static260.aShort71 < local49) {
				local49 = Static260.aShort71;
				local105 = local49 * 512 * arg3 / (local80 * 334);
				local112 = (arg2 - local105) / 2;
				if (arg1) {
					Static9.aClass63_1.method4651();
					Static9.aClass63_1.method4639(arg4, arg0, arg3, -16777216, local112);
					Static9.aClass63_1.method4639(arg4, arg2 + arg0 - local112, arg3, -16777216, local112);
				}
				arg2 -= local112 * 2;
				arg0 += local112;
			}
		} else if (local71 > Static223.aShort60) {
			local80 = Static223.aShort60;
			local49 = arg2 * local80 * 334 / (arg3 * 512);
			if (Static351.aShort39 > local49) {
				local49 = Static351.aShort39;
				local105 = arg2 * 334 * local80 / (local49 * 512);
				local112 = (arg3 - local105) / 2;
				if (arg1) {
					Static9.aClass63_1.method4651();
					Static9.aClass63_1.method4639(arg4, arg0, local112, -16777216, arg2);
					Static9.aClass63_1.method4639(arg3 + arg4 - local112, arg0, local112, -16777216, arg2);
				}
				arg4 += local112;
				arg3 -= local112 * 2;
			}
		}
		Static33.anInt828 = arg4;
		Static128.anInt5883 = (short) arg2;
		Static76.anInt1693 = arg0;
		Static266.anInt5226 = arg3 * local49 / 334;
		Static126.anInt2759 = (short) arg3;
	}
}
