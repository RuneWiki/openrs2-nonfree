import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "[Lclient!f;")
	public static Class80[] aClass80Array17;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!mr;")
	public static Class161 aClass161_3;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_108 = new Class237(24, 3);

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_84 = new Class84("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString42 = "";

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BII)Z")
	public static boolean method5016(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static383.method5219(arg1, arg0) | (arg1 & 0x10000) != 0 || Static349.method1151(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static161.method2443(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	public static void method5020() {
		@Pc(8) int local8 = Static25.aByteArrayArray15.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static25.aByteArrayArray15[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static374.anInt6428; local20++) {
					if (Static110.anIntArray243[local20] == Static157.anIntArray255[local10]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static110.anIntArray243[Static374.anInt6428] = Static157.anIntArray255[local10];
					local18 = Static374.anInt6428++;
				}
				@Pc(63) Class1_Sub1 local63 = new Class1_Sub1(Static25.aByteArrayArray15[local10]);
				@Pc(65) int local65 = 0;
				while (local63.anInt5056 < Static25.aByteArrayArray15[local10].length && local65 < 511 && Static288.anInt5039 < 1023) {
					@Pc(82) int local82 = local65++ << 6 | local18;
					@Pc(86) int local86 = local63.method4093();
					@Pc(90) int local90 = local86 >> 14;
					@Pc(96) int local96 = local86 >> 7 & 0x3F;
					@Pc(100) int local100 = local86 & 0x3F;
					@Pc(113) int local113 = (Static157.anIntArray255[local10] >> 8) * 64 + local96 - Static437.anInt7555;
					@Pc(126) int local126 = (Static157.anIntArray255[local10] & 0xFF) * 64 + local100 - Static134.anInt5502;
					@Pc(135) Class66 local135 = Static322.aClass187_2.method4504(local63.method4093());
					if (Static410.aClass26_Sub2_Sub2_Sub2Array1[local82] == null && (local135.aByte19 & 0x1) > 0 && local90 == Static424.anInt7348 && local113 >= 0 && Static135.anInt2314 > local113 + local135.anInt1717 && local126 >= 0 && Static352.anInt6022 > local126 + local135.anInt1717) {
						Static410.aClass26_Sub2_Sub2_Sub2Array1[local82] = new Class26_Sub2_Sub2_Sub2();
						Static410.aClass26_Sub2_Sub2_Sub2Array1[local82].anInt7097 = local82;
						@Pc(194) Class26_Sub2_Sub2_Sub2 local194 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local82];
						Static212.anIntArray28[Static288.anInt5039++] = local82;
						local194.anInt7098 = Static403.anInt6978;
						local194.method5546(local135);
						local194.method5539(local194.aClass66_1.anInt1717);
						local194.anInt7126 = local194.aClass66_1.anInt1704 << 3;
						if (local194.anInt7126 == 0) {
							local194.method5537(0);
						} else {
							local194.method5537((local194.aClass66_1.aByte21 + 4 & 0xC7E00007) << 11);
						}
						local194.method5545(local90, local126, true, local113, local194.method5535());
					}
				}
			}
		}
	}
}
