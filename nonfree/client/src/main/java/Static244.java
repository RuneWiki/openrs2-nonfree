import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_143 = new Class34("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "Lclient!aq;")
	public static Class12 aClass12_15 = null;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "Lclient!wk;")
	public static final Class1_Sub43 aClass1_Sub43_1 = new Class1_Sub43(0, 0);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/awt/Component;ILclient!nh;II)Lclient!uc;")
	public static Class7 method4381(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) int arg3) {
		if (Static38.anInt1250 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class7 local36 = (Class7) Class.forName("Class7_Sub1").getDeclaredConstructor().newInstance();
			local36.anInt6632 = arg1;
			local36.anIntArray527 = new int[(Static330.aBoolean615 ? 2 : 1) * 256];
			local36.method5554(arg0);
			local36.anInt6631 = (arg1 & 0xFFFFFC00) + 1024;
			if (local36.anInt6631 > 16384) {
				local36.anInt6631 = 16384;
			}
			local36.method5544(local36.anInt6631);
			if (Static308.anInt3006 > 0 && Static73.aClass37_1 == null) {
				Static73.aClass37_1 = new Class37();
				Static73.aClass37_1.aClass143_3 = arg2;
				arg2.method3908(Static73.aClass37_1, Static308.anInt3006);
			}
			if (Static73.aClass37_1 != null) {
				if (Static73.aClass37_1.aClass7Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static73.aClass37_1.aClass7Array1[arg3] = local36;
			}
			return local36;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class7_Sub2 local117 = new Class7_Sub2(arg2, arg3);
				local117.anIntArray527 = new int[(Static330.aBoolean615 ? 2 : 1) * 256];
				local117.anInt6632 = arg1;
				local117.method5554(arg0);
				local117.anInt6631 = 16384;
				local117.method5544(local117.anInt6631);
				if (Static308.anInt3006 > 0 && Static73.aClass37_1 == null) {
					Static73.aClass37_1 = new Class37();
					Static73.aClass37_1.aClass143_3 = arg2;
					arg2.method3908(Static73.aClass37_1, Static308.anInt3006);
				}
				if (Static73.aClass37_1 != null) {
					if (Static73.aClass37_1.aClass7Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static73.aClass37_1.aClass7Array1[arg3] = local117;
				}
				return local117;
			} catch (@Pc(181) Throwable local181) {
				return new Class7();
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	public static void method4382() {
		if (Static197.aFrame2 != null) {
			return;
		}
		@Pc(17) Container local17;
		if (Static84.aFrame1 == null) {
			local17 = Static15.aClass143_1.anApplet1;
		} else {
			local17 = Static84.aFrame1;
		}
		Static170.anInt3645 = local17.getSize().width;
		Static357.anInt4330 = local17.getSize().height;
		@Pc(35) Insets local35;
		if (local17 == Static84.aFrame1) {
			local35 = Static84.aFrame1.getInsets();
			Static170.anInt3645 -= local35.right + local35.left;
			Static357.anInt4330 -= local35.top + local35.bottom;
		}
		if (Static44.method1024() == 1) {
			Static194.anInt4145 = 765;
			Static195.anInt4173 = 0;
			Static98.anInt2364 = (Static170.anInt3645 - 765) / 2;
			Static271.anInt5530 = 503;
		} else if (Static257.anInt5344 < 96 && Static306.anInt6046 == 0) {
			@Pc(98) int local98 = Static170.anInt3645 > 1024 ? 1024 : Static170.anInt3645;
			Static98.anInt2364 = (Static170.anInt3645 - local98) / 2;
			Static194.anInt4145 = local98;
			@Pc(116) int local116 = Static357.anInt4330 <= 768 ? Static357.anInt4330 : 768;
			Static195.anInt4173 = 0;
			Static271.anInt5530 = local116;
		} else {
			Static194.anInt4145 = Static170.anInt3645;
			Static98.anInt2364 = 0;
			Static195.anInt4173 = 0;
			Static271.anInt5530 = Static357.anInt4330;
		}
		if (Static63.anInt5669 != 0) {
			@Pc(132) boolean local132;
			if (Static194.anInt4145 < 1024 && Static271.anInt5530 < 768) {
				local132 = true;
			} else {
				local132 = false;
			}
		}
		Static349.aCanvas5.setSize(Static194.anInt4145, Static271.anInt5530);
		if (Static208.aClass32_11 != null) {
			Static208.aClass32_11.method2228();
		}
		if (Static84.aFrame1 == local17) {
			local35 = Static84.aFrame1.getInsets();
			Static349.aCanvas5.setLocation(local35.left + Static98.anInt2364, Static195.anInt4173 + local35.top);
		} else {
			Static349.aCanvas5.setLocation(Static98.anInt2364, Static195.anInt4173);
		}
		if (Static89.anInt2231 != -1) {
			Static267.method4700(true);
		}
		Static231.method4265();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIII)V")
	public static void method4383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == arg2) {
			Static149.method2980(arg3, arg4, arg0, arg2);
		} else if (arg3 - arg2 >= Static268.anInt5477 && arg3 + arg2 <= Static342.anInt3000 && Static197.anInt4211 <= arg4 - arg1 && Static326.anInt2469 >= arg4 + arg1) {
			Static344.method5516(arg4, arg1, arg0, arg3, arg2);
		} else {
			Static273.method4773(arg2, arg1, arg0, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V")
	public static void method4388(@OriginalArg(1) int arg0) {
		@Pc(1) Class87 local1 = Static204.aClass87_38;
		synchronized (Static204.aClass87_38) {
			Static204.aClass87_38.method2485();
			Static204.aClass87_38 = new Class87(arg0);
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public static void method4389() {
		Static258.method4651((long) Static5.anInt208, Static208.aClass32_11);
		if (Static89.anInt2231 != -1) {
			Static147.method2937(Static89.anInt2231);
		}
		for (@Pc(23) int local23 = 0; local23 < Static47.anInt1510; local23++) {
			if (Static223.aBooleanArray28[local23]) {
				Static161.aBooleanArray16[local23] = true;
			}
			Static320.aBooleanArray24[local23] = Static223.aBooleanArray28[local23];
			Static223.aBooleanArray28[local23] = false;
		}
		Static180.anInt3888 = Static5.anInt208;
		if (Static208.aClass32_11.method2178()) {
			Static87.aBoolean205 = true;
		}
		if (Static89.anInt2231 != -1) {
			Static47.anInt1510 = 0;
			Static211.method4079();
		}
		Static208.aClass32_11.method2184();
		Static270.method4744(Static46.anInt1504);
		Static303.anInt2311 = 0;
	}
}
