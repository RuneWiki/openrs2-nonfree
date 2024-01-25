import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_190 = new Class129(106, -2);

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_127 = new Class198(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString74 = null;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)Z")
	public static boolean method5943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static134.method1929(arg0, arg1)) {
			return Static303.method3770(arg1, arg0) | (arg0 & 0xB000) != 0 | Static163.method2300(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static171.method2361(arg1, arg0) | Static322.method3971(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	public static void method5945() {
		Static53.method833(Static387.aClass76_14);
		Static287.anInt4467++;
		if (Static240.aBoolean469 && Static320.aBoolean344) {
			@Pc(30) int local30 = Static290.aClass66_1.method5965();
			@Pc(34) int local34 = Static290.aClass66_1.method5974();
			local34 -= Static372.anInt6084;
			local30 -= Static464.anInt7343;
			if (local30 < Static454.anInt7429) {
				local30 = Static454.anInt7429;
			}
			if (local34 < Static147.anInt2654) {
				local34 = Static147.anInt2654;
			}
			if (Static454.anInt7429 + Static359.aClass76_13.anInt2127 < local30 + Static387.aClass76_14.anInt2127) {
				local30 = Static359.aClass76_13.anInt2127 + Static454.anInt7429 - Static387.aClass76_14.anInt2127;
			}
			if (Static359.aClass76_13.anInt2106 + Static147.anInt2654 < Static387.aClass76_14.anInt2106 + local34) {
				local34 = Static147.anInt2654 + Static359.aClass76_13.anInt2106 - Static387.aClass76_14.anInt2106;
			}
			@Pc(109) int local109 = Static359.aClass76_13.anInt2052 + local30 - Static454.anInt7429;
			@Pc(116) int local116 = Static359.aClass76_13.anInt2061 + local34 - Static147.anInt2654;
			@Pc(176) Class5_Sub33 local176;
			if (Static290.aClass66_1.method5964()) {
				if (Static287.anInt4467 > Static387.aClass76_14.anInt2074) {
					@Pc(135) int local135 = local30 - Static383.anInt6297;
					@Pc(139) int local139 = local34 - Static146.anInt2650;
					if (Static387.aClass76_14.anInt2059 < local135 || -Static387.aClass76_14.anInt2059 > local135 || Static387.aClass76_14.anInt2059 < local139 || -Static387.aClass76_14.anInt2059 > local139) {
						Static243.aBoolean252 = true;
					}
				}
				if (Static387.aClass76_14.anObjectArray6 != null && Static243.aBoolean252) {
					local176 = new Class5_Sub33();
					local176.aClass76_12 = Static387.aClass76_14;
					local176.anInt5630 = local116;
					local176.anObjectArray35 = Static387.aClass76_14.anObjectArray6;
					local176.anInt5627 = local109;
					Static181.method2470(local176);
				}
			} else {
				if (Static243.aBoolean252) {
					Static289.method3586();
					if (Static387.aClass76_14.anObjectArray20 != null) {
						local176 = new Class5_Sub33();
						local176.aClass76_11 = Static161.aClass76_6;
						local176.anInt5627 = local109;
						local176.aClass76_12 = Static387.aClass76_14;
						local176.anObjectArray35 = Static387.aClass76_14.anObjectArray20;
						local176.anInt5630 = local116;
						Static181.method2470(local176);
					}
					if (Static161.aClass76_6 != null && Static55.method891(Static387.aClass76_14) != null) {
						Static32.method546(Static387.aClass76_14, Static161.aClass76_6);
					}
				} else if ((Static456.anInt7452 == 1 || Static20.method336()) && Static18.anInt395 > 2) {
					Static323.method3980(Static383.anInt6297 + Static464.anInt7343, Static372.anInt6084 - -Static146.anInt2650);
				} else if (Static337.method4361()) {
					Static323.method3980(Static464.anInt7343 + Static383.anInt6297, Static372.anInt6084 - -Static146.anInt2650);
				}
				Static387.aClass76_14 = null;
			}
		} else if (Static287.anInt4467 > 1) {
			Static387.aClass76_14 = null;
		}
	}
}
