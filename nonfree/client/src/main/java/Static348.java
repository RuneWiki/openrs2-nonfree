import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
	public static int anInt6160;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	public static int anInt6162;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "Lclient!lm;")
	public static Class134 aClass134_136;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "[Lclient!qp;")
	public static final Class171[] aClass171Array3 = new Class171[29];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method5327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 - arg0;
		if (local13 < -9) {
			return "<col=ff0000>";
		} else if (local13 < -6) {
			return "<col=ff3000>";
		} else if (local13 < -3) {
			return "<col=ff7000>";
		} else if (local13 < 0) {
			return "<col=ffb000>";
		} else if (local13 > 9) {
			return "<col=00ff00>";
		} else if (local13 > 6) {
			return "<col=40ff00>";
		} else if (local13 > 3) {
			return "<col=80ff00>";
		} else if (local13 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBI)V")
	public static void method5330(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static17.method307(7, arg0);
		local8.method4783();
		local8.anInt5461 = arg1;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public static void method5331() {
		if (Static291.aFrame1 != null) {
			return;
		}
		@Pc(17) Container local17;
		if (Static333.aFrame2 == null) {
			local17 = Static197.aClass215_5.anApplet1;
		} else {
			local17 = Static333.aFrame2;
		}
		Static350.anInt4382 = local17.getSize().width;
		Static132.anInt6775 = local17.getSize().height;
		@Pc(35) Insets local35;
		if (Static333.aFrame2 == local17) {
			local35 = Static333.aFrame2.getInsets();
			Static350.anInt4382 -= local35.left + local35.right;
			Static132.anInt6775 -= local35.top + local35.bottom;
		}
		if (Static151.method2632() == 1) {
			Static325.anInt2764 = 0;
			Static204.anInt6778 = (Static350.anInt4382 - 765) / 2;
			Static26.anInt476 = 765;
			Static321.anInt6388 = 503;
		} else if (Static267.anInt5492 < 96 && Static24.anInt437 == 0) {
			@Pc(96) int local96 = Static350.anInt4382 > 1024 ? 1024 : Static350.anInt4382;
			Static204.anInt6778 = (Static350.anInt4382 - local96) / 2;
			@Pc(110) int local110 = Static132.anInt6775 <= 768 ? Static132.anInt6775 : 768;
			Static26.anInt476 = local96;
			Static321.anInt6388 = local110;
			Static325.anInt2764 = 0;
		} else {
			Static204.anInt6778 = 0;
			Static325.anInt2764 = 0;
			Static26.anInt476 = Static350.anInt4382;
			Static321.anInt6388 = Static132.anInt6775;
		}
		if (Static217.anInt951 != 0) {
			@Pc(127) boolean local127;
			if (Static26.anInt476 < 1024 && Static321.anInt6388 < 768) {
				local127 = true;
			} else {
				local127 = false;
			}
		}
		Static235.aCanvas6.setSize(Static26.anInt476, Static321.anInt6388);
		if (Static217.aClass105_5 != null) {
			Static217.aClass105_5.method4215();
		}
		if (Static333.aFrame2 == local17) {
			local35 = Static333.aFrame2.getInsets();
			Static235.aCanvas6.setLocation(local35.left + Static204.anInt6778, Static325.anInt2764 + local35.top);
		} else {
			Static235.aCanvas6.setLocation(Static204.anInt6778, Static325.anInt2764);
		}
		if (Static129.anInt2569 != -1) {
			Static57.method1110(true);
		}
		Static129.method2096();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)Lclient!i;")
	public static Class102 method5333(@OriginalArg(0) int arg0) {
		@Pc(5) Class37 local5 = Static54.aClass37_26;
		@Pc(14) Class102 local14;
		synchronized (Static54.aClass37_26) {
			local14 = (Class102) Static54.aClass37_26.method915((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static328.aClass134_10.method3009(Static251.method4511(arg0), Static166.method2923(arg0));
		local14 = new Class102();
		local14.anInt2383 = arg0;
		if (local34 != null) {
			local14.method1976(new Class1_Sub21(local34));
		}
		local14.method1989();
		if (local14.anInt2395 != -1) {
			local14.method1986(method5333(local14.anInt2395), method5333(local14.anInt2409));
		}
		if (local14.anInt2432 != -1) {
			local14.method1985(method5333(local14.anInt2411), method5333(local14.anInt2432));
		}
		if (!Static50.aBoolean82 && local14.aBoolean196) {
			local14.aString95 = Static170.aString129;
			local14.aStringArray23 = Static203.aStringArray30;
			local14.anIntArray251 = null;
			local14.aStringArray24 = Static206.aStringArray31;
			local14.aBoolean195 = false;
			local14.anInt2391 = 0;
		}
		@Pc(117) Class37 local117 = Static54.aClass37_26;
		synchronized (Static54.aClass37_26) {
			Static54.aClass37_26.method922((long) arg0, local14);
			return local14;
		}
	}
}
