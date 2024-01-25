import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Lclient!aa;")
	public static Class2 aClass2_3;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "Lclient!pc;")
	public static Class3_Sub37 aClass3_Sub37_1;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "Z")
	public static boolean aBoolean216 = false;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public static void method2396() {
		if (Static151.aClass96_2 != null) {
			Static151.aClass96_2.method3466();
		}
		if (Static63.aClass96_3 != null) {
			Static63.aClass96_3.method3466();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLclient!qq;[[B)V")
	public static void method2397(@OriginalArg(1) Class22_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(19) int local19 = 0; local19 < arg0.anInt5763; local19++) {
			Static44.method856();
			for (@Pc(25) int local25 = 0; local25 < Static373.anInt6324 >> 3; local25++) {
				for (@Pc(29) int local29 = 0; local29 < Static291.anInt5062 >> 3; local29++) {
					@Pc(39) int local39 = Static390.anIntArrayArrayArray12[local19][local25][local29];
					if (local39 != -1) {
						@Pc(48) int local48 = local39 >> 24 & 0x3;
						if (!arg0.aBoolean407 || local48 == 0) {
							@Pc(62) int local62 = local39 >> 1 & 0x3;
							@Pc(68) int local68 = local39 >> 14 & 0x3FF;
							@Pc(74) int local74 = local39 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local68 / 8 << 8) + local74 / 8;
							for (@Pc(86) int local86 = 0; local86 < Static127.anIntArray115.length; local86++) {
								if (Static127.anIntArray115[local86] == local84 && arg1[local86] != null) {
									@Pc(108) Class3_Sub25 local108 = new Class3_Sub25(arg1[local86]);
									arg0.method4789(local19, local48, local62, local29 * 8, local68, local74, local108, Static250.aClass128Array1, local25 * 8);
									arg0.method4795(local19, local25 * 8, Static413.aClass167_11, local29 * 8, local48, local74, local68, local12[0] == -1 ? local12 : null, local108, local62);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static460.aClass64_1 = Static335.aClass58_1.method1542(Static448.aClass172_1, local12[3], local12[2], local12[1], local12[0]);
			Static138.anInt2445 = local12[4];
		}
	}
}
