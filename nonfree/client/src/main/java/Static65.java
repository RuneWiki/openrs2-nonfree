import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "[I")
	public static int[] anIntArray97;

	@OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
	public static int anInt1266 = 0;

	@OriginalMember(owner = "client!ei", name = "D", descriptor = "Lclient!ic;")
	public static Class85 aClass85_5 = new Class85(512);

	@OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
	public static int anInt1267 = 0;

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
	public static int anInt1273 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!fh;I)I")
	public static int method1046(@OriginalArg(0) Class58 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1359(Static246.anInt4678)) {
			local5++;
		}
		if (arg0.method1359(Static22.anInt322)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
	public static void method1047() {
		Static205.method3283(Static35.aClass189_1);
		Static105.anInt2165++;
		if (Static238.aBoolean311 && Static171.aBoolean232) {
			@Pc(27) int local27 = Static286.anInt5358;
			local27 -= Static194.anInt5205;
			if (local27 < Static73.anInt1633) {
				local27 = Static73.anInt1633;
			}
			if (Static35.aClass189_1.anInt5897 + local27 > Static38.aClass189_2.anInt5897 + Static73.anInt1633) {
				local27 = Static38.aClass189_2.anInt5897 + Static73.anInt1633 - Static35.aClass189_1.anInt5897;
			}
			@Pc(61) int local61 = Static312.anInt6042;
			local61 -= Static41.anInt777;
			if (Static268.anInt5183 > local61) {
				local61 = Static268.anInt5183;
			}
			@Pc(75) int local75 = local27 - Static161.anInt3183;
			if (Static35.aClass189_1.anInt5953 + local61 > Static268.anInt5183 - -Static38.aClass189_2.anInt5953) {
				local61 = Static268.anInt5183 + Static38.aClass189_2.anInt5953 - Static35.aClass189_1.anInt5953;
			}
			@Pc(103) int local103 = local61 - Static9.anInt134;
			@Pc(106) int local106 = Static35.aClass189_1.anInt5900;
			if (Static105.anInt2165 > Static35.aClass189_1.anInt5957 && (local75 > local106 || local75 < -local106 || local103 > local106 || local103 < -local106)) {
				Static128.aBoolean173 = true;
			}
			@Pc(150) int local150 = Static38.aClass189_2.anInt5936 + local27 - Static73.anInt1633;
			@Pc(159) int local159 = local61 + Static38.aClass189_2.anInt5935 - Static268.anInt5183;
			@Pc(169) Class4_Sub13 local169;
			if (Static35.aClass189_1.anObjectArray11 != null && Static128.aBoolean173) {
				local169 = new Class4_Sub13();
				local169.anInt2492 = local159;
				local169.aClass189_7 = Static35.aClass189_1;
				local169.anInt2495 = local150;
				local169.anObjectArray2 = Static35.aClass189_1.anObjectArray11;
				Static135.method2020(local169);
			}
			if (Static86.anInt1991 == 0) {
				if (Static128.aBoolean173) {
					if (Static35.aClass189_1.anObjectArray7 != null) {
						local169 = new Class4_Sub13();
						local169.aClass189_6 = Static298.aClass189_16;
						local169.aClass189_7 = Static35.aClass189_1;
						local169.anInt2495 = local150;
						local169.anInt2492 = local159;
						local169.anObjectArray2 = Static35.aClass189_1.anObjectArray7;
						Static135.method2020(local169);
					}
					if (Static298.aClass189_16 != null && Static41.method691(Static35.aClass189_1) != null) {
						Static110.aClass4_Sub10_Sub1_1.method4687(0);
						Static110.aClass4_Sub10_Sub1_1.method4661(Static35.aClass189_1.anInt5918);
						Static110.aClass4_Sub10_Sub1_1.method4621(Static298.aClass189_16.anInt5918);
						Static110.aClass4_Sub10_Sub1_1.method4651(Static298.aClass189_16.anInt5972);
						Static110.aClass4_Sub10_Sub1_1.method4673(Static35.aClass189_1.anInt5972);
					}
				} else if ((Static107.anInt5401 == 1 || Static60.method1005(Static300.anInt5638 - 1)) && Static300.anInt5638 > 2) {
					Static244.method3820();
				} else if (Static300.anInt5638 > 0) {
					Static312.method4821();
				}
				Static35.aClass189_1 = null;
			}
		} else if (Static105.anInt2165 > 1) {
			Static35.aClass189_1 = null;
		}
	}
}
