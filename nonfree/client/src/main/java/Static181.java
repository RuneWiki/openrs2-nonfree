import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Lclient!ba;")
	public static final Class20 aClass20_2 = Static191.method2735();

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_195 = new Class48(7, 0);

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
	public static int anInt5500 = 0;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZLclient!st;)V")
	public static void method4751(@OriginalArg(1) Class41_Sub6 arg0) {
		arg0.aClass25_Sub1_Sub1_1 = null;
		if (Static281.anInt4885 < 20) {
			Static367.aClass208_9.method4664(arg0);
			Static281.anInt4885++;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BIIIII)V")
	public static void method4752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg1;
		@Pc(15) int local15 = arg0 - arg3;
		if (local10 == 0) {
			if (local15 != 0) {
				Static289.method4392(arg1, arg4, arg0, arg3);
			}
		} else if (local15 == 0) {
			Static382.method5422(arg4, arg1, arg2, arg3);
		} else {
			@Pc(50) int local50 = (local15 << 12) / local10;
			@Pc(59) int local59 = arg3 - (local50 * arg1 >> 12);
			@Pc(71) int local71;
			@Pc(79) int local79;
			if (arg2 < Static372.anInt1561) {
				local71 = Static372.anInt1561;
				local79 = local59 + (Static372.anInt1561 * local50 >> 12);
			} else if (arg2 > Static98.anInt1774) {
				local71 = Static98.anInt1774;
				local79 = (Static98.anInt1774 * local50 >> 12) + local59;
			} else {
				local71 = arg2;
				local79 = arg0;
			}
			@Pc(115) int local115;
			@Pc(113) int local113;
			if (arg1 < Static372.anInt1561) {
				local113 = local59 + (Static372.anInt1561 * local50 >> 12);
				local115 = Static372.anInt1561;
			} else if (arg1 > Static98.anInt1774) {
				local113 = local59 + (local50 * Static98.anInt1774 >> 12);
				local115 = Static98.anInt1774;
			} else {
				local113 = arg3;
				local115 = arg1;
			}
			if (Static194.anInt3448 > local113) {
				local115 = (Static194.anInt3448 - local59 << 12) / local50;
				local113 = Static194.anInt3448;
			} else if (Static264.anInt4589 < local113) {
				local115 = (Static264.anInt4589 - local59 << 12) / local50;
				local113 = Static264.anInt4589;
			}
			if (Static194.anInt3448 > local79) {
				local71 = (Static194.anInt3448 - local59 << 12) / local50;
				local79 = Static194.anInt3448;
			} else if (local79 > Static264.anInt4589) {
				local79 = Static264.anInt4589;
				local71 = (Static264.anInt4589 - local59 << 12) / local50;
			}
			Static34.method520(local79, local71, local113, arg4, local115);
		}
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(B)V")
	public static void method4753() {
		Static281.aClass227_37.method4871();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB)Z")
	public static boolean method4755(@OriginalArg(0) int arg0) {
		@Pc(7) Class124_Sub1 local7 = Static273.method4215(arg0);
		if (local7 == null) {
			return false;
		} else if (Static237.anInt3958 == 3) {
			@Pc(44) String local44 = "";
			if (Static96.aClass73_2 != Static314.aClass73_5) {
				local44 = ":" + (local7.anInt5511 + 7000);
			}
			@Pc(60) String local60 = "";
			if (Static348.aString68 != null) {
				local60 = "/p=" + Static348.aString68;
			}
			@Pc(109) String local109 = "http://" + local7.aString64 + local44 + "/l=" + Static48.anInt952 + "/a=" + Static380.anInt6150 + local60 + "/j" + (Static177.aBoolean120 ? "1" : "0") + ",o" + (Static197.aBoolean345 ? "1" : "0") + ",a2";
			try {
				Static305.aClient1.getAppletContext().showDocument(new URL(local109), "_self");
				return true;
			} catch (@Pc(119) Exception local119) {
				return false;
			}
		} else {
			Static233.anInt3887 = local7.anInt5511;
			Static314.aString60 = local7.aString64;
			if (Static314.aClass73_5 != Static96.aClass73_2) {
				Static91.anInt1662 = Static233.anInt3887 + 40000;
				Static128.anInt2264 = Static233.anInt3887 + 50000;
				Static394.anInt6422 = Static91.anInt1662;
			}
			return true;
		}
	}
}
