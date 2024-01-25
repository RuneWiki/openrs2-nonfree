import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ev", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ev", name = "C", descriptor = "I")
	public static int anInt2229;

	@OriginalMember(owner = "client!ev", name = "v", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_28 = new Class242("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!ev", name = "A", descriptor = "I")
	public static int anInt2227 = -1;

	@OriginalMember(owner = "client!ev", name = "D", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_54 = new Class36(60, 0);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!o;)V")
	public static void method1656(@OriginalArg(0) Class169 arg0) {
		if (Static340.anInt6033 >= 65535) {
			return;
		}
		@Pc(6) Class4_Sub8 local6 = arg0.aClass4_Sub8_1;
		Static200.aClass169Array1[Static340.anInt6033] = arg0;
		Static417.aBooleanArray27[Static340.anInt6033] = false;
		Static340.anInt6033++;
		@Pc(21) int local21 = arg0.anInt4885;
		if (arg0.aBoolean345) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt4885;
		if (arg0.aBoolean344) {
			local29 = Static338.anInt5952 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5682() + Static40.anInt1024 - local6.method5679() >> Static372.anInt7558;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5682() + local6.method5679() - Static40.anInt1024 >> Static372.anInt7558;
			if (local73 >= Static241.anInt4414) {
				local73 = Static241.anInt4414 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray69[local41++];
				@Pc(105) int local105 = (local6.method5676() + Static40.anInt1024 - local6.method5679() >> Static372.anInt7558) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static301.anInt5434) {
					local113 = Static301.anInt5434 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static420.aLongArrayArrayArray128[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static420.aLongArrayArrayArray128[local38][local126][local82] = local135 | (long) Static340.anInt6033;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static420.aLongArrayArrayArray128[local38][local126][local82] = local135 | (long) Static340.anInt6033 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static420.aLongArrayArrayArray128[local38][local126][local82] = local135 | (long) Static340.anInt6033 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static420.aLongArrayArrayArray128[local38][local126][local82] = local135 | (long) Static340.anInt6033 << 48;
					}
				}
			}
		}
	}
}
