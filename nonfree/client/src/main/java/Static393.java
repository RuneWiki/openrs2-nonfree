import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "Z")
	public static boolean aBoolean458;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "F")
	public static float aFloat132;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "Lclient!lb;")
	public static final Class174 aClass174_27 = new Class174(32);

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)I")
	public static int method5915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static39.aByteArrayArray7 == null ? 0 : Static39.aByteArrayArray7[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIB)I")
	public static int method5916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(21) int local21 = local7 < 8 ? arg0 : arg3;
		@Pc(38) int local38 = local7 < 4 ? arg3 : local7 == 12 || local7 == 14 ? arg0 : arg1;
		return ((local7 & 0x1) == 0 ? local21 : -local21) + ((local7 & 0x2) == 0 ? local38 : -local38);
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
	public static void method5917() {
		Static441.aClass81_6.method2635();
		Static88.aClass40_1.method1496();
		Static489.aClass34_2.method1367();
		Static365.aClass194_6.method5083();
		Static345.aClass222_1.method5590();
		Static454.aClass153_2.method3996();
		Static6.aClass126_1.method3568();
		Static529.aClass90_2.method2956();
		Static483.aClass187_1.method4857();
		Static133.aClass173_1.method4407();
		Static109.aClass18_1.method872();
		Static198.aClass165_3.method4288();
		Static167.aClass250_4.method6149();
		Static182.aClass133_1.method3770();
		Static162.aClass98_11.method3007();
		Static27.aClass310_1.method7428();
		Static86.aClass254_1.method6206();
		Static294.aClass119_1.method3463();
		Static530.aClass137_2.method3824();
		Static90.aClass229_1.method5694();
		Static34.method1304();
		Static293.method3137();
		Static411.method6145();
		Static150.method3008();
		Static309.aClass316_45.method7803();
		Static497.aClass316_60.method7803();
		Static45.aClass316_6.method7803();
		Static536.aClass316_63.method7803();
		Static387.aClass316_51.method7803();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method5918(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZII)Lclient!vo;")
	public static Class1_Sub49 method5919(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class1_Sub49) aClass174_27.method4422(local17);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIILclient!qa;I)V")
	public static void method5920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) int arg4) {
		arg3.N(arg4, arg1, arg2 + arg4, arg1 + arg0);
		arg3.method7632(arg4, -16777216, arg2, arg0, arg1);
		if (Static52.anInt1508 < 100) {
			return;
		}
		@Pc(31) float local31 = (float) Static451.anInt3551 / (float) Static451.anInt3555;
		@Pc(33) int local33 = arg2;
		@Pc(35) int local35 = arg0;
		if (local31 < 1.0F) {
			local35 = (int) (local31 * (float) arg2);
		} else {
			local33 = (int) ((float) arg0 / local31);
		}
		@Pc(61) int local61 = arg4 + (arg2 - local33) / 2;
		@Pc(70) int local70 = arg1 + (arg0 - local35) / 2;
		if (Static413.aClass12_17 == null || Static413.aClass12_17.c() != arg2 || Static413.aClass12_17.la() != arg0) {
			Static451.method3227(Static451.anInt3553, Static451.anInt3551 + Static451.anInt3558, Static451.anInt3553 - -Static451.anInt3555, Static451.anInt3558, local61, local70, local33 + local61, local70 + local35);
			Static451.method3220(arg3);
			Static413.aClass12_17 = arg3.method7612(local61, local70, local33, local35, false);
		}
		Static413.aClass12_17.method7191(local61, local70);
		@Pc(118) int local118 = Static117.anInt2851 * local33 / Static451.anInt3555;
		@Pc(124) int local124 = local35 * Static358.anInt2384 / Static451.anInt3551;
		@Pc(132) int local132 = Static469.anInt8066 * local33 / Static451.anInt3555 + local61;
		@Pc(145) int local145 = local35 + local70 - local35 * Static413.anInt7199 / Static451.anInt3551 - local124;
		@Pc(147) int local147 = -1996554240;
		if (Static538.aClass37_4 == Static452.aClass37_3) {
			local147 = -1996488705;
		}
		arg3.f(local132, local145, local118, local124, local147, 1);
		arg3.method7568(local132, local145, local118, local124, local147, 0);
		if (Static173.anInt3748 <= 0) {
			return;
		}
		@Pc(189) int local189;
		if (Static527.anInt8941 > 50) {
			local189 = (100 - Static527.anInt8941) * 5;
		} else {
			local189 = Static527.anInt8941 * 5;
		}
		for (@Pc(199) Class1_Sub25 local199 = (Class1_Sub25) Static451.aClass38_28.method1419(); local199 != null; local199 = (Class1_Sub25) Static451.aClass38_28.method1415()) {
			@Pc(206) Class24 local206 = Static451.aClass250_3.method6143(local199.anInt4556);
			if (Static304.method5085(local206)) {
				@Pc(238) int local238;
				@Pc(250) int local250;
				if (local199.anInt4556 == Static116.anInt2817) {
					local238 = local33 * local199.anInt4561 / Static451.anInt3555 + local61;
					local250 = local70 + (Static451.anInt3551 - local199.anInt4557) * local35 / Static451.anInt3551;
					arg3.method7632(local238 - 2, local189 << 24 | 0xFFFF00, 4, 4, local250 - 2);
				} else if (Static388.anInt6745 != -1 && Static388.anInt6745 == local206.anInt1169) {
					local238 = local61 + local199.anInt4561 * local33 / Static451.anInt3555;
					local250 = local35 * (Static451.anInt3551 - local199.anInt4557) / Static451.anInt3551 + local70;
					arg3.method7632(local238 - 2, local189 << 24 | 0xFFFF00, 4, 4, local250 - 2);
				}
			}
		}
	}
}
