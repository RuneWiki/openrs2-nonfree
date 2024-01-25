import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lclient!kr;")
	public static Class171 aClass171_109;

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_78 = new Class306("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
	public static int anInt6368 = -1;

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "Z")
	public static boolean aBoolean465 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!dda;)V")
	public static void method5389(@OriginalArg(0) Class62 arg0) {
		if (Static246.anInt4872 >= 65535) {
			return;
		}
		@Pc(6) Class1_Sub2 local6 = arg0.aClass1_Sub2_1;
		Static447.aClass62Array1[Static246.anInt4872] = arg0;
		Static98.aBooleanArray45[Static246.anInt4872] = false;
		Static246.anInt4872++;
		@Pc(21) int local21 = arg0.anInt1596;
		if (arg0.aBoolean103) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt1596;
		if (arg0.aBoolean104) {
			local29 = Static388.anInt7032 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method2427() + Static122.anInt2483 - local6.method2434() >> Static451.anInt7905;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method2427() + local6.method2434() - Static122.anInt2483 >> Static451.anInt7905;
			if (local73 >= Static382.anInt6965) {
				local73 = Static382.anInt6965 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray32[local41++];
				@Pc(105) int local105 = (local6.method2426() + Static122.anInt2483 - local6.method2434() >> Static451.anInt7905) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static93.anInt1898) {
					local113 = Static93.anInt1898 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static245.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static245.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static246.anInt4872;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static245.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static246.anInt4872 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static245.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static246.anInt4872 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static245.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static246.anInt4872 << 48;
					}
				}
			}
		}
	}
}
