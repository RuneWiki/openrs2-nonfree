import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "Lclient!ic;")
	public static Class113 aClass113_82;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_135 = new Class151("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
	public static int anInt4221 = -1;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
	public static int anInt4222 = 0;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZILclient!od;I[I)Lclient!we;")
	public static Class5_Sub1_Sub1 method3385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class128_Sub2 arg2, @OriginalArg(5) int[] arg3) {
		if (arg2.aBoolean362 || Static298.method3895(arg1) && Static298.method3895(arg0)) {
			return new Class5_Sub1_Sub1(arg2, 3553, arg1, arg0, false, arg3);
		} else if (arg2.aBoolean372) {
			return new Class5_Sub1_Sub1(arg2, 34037, arg1, arg0, false, arg3);
		} else {
			return new Class5_Sub1_Sub1(arg2, arg1, arg0, Static88.method1286(arg1), Static88.method1286(arg0), arg3);
		}
	}

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)V")
	public static void method3398() {
		@Pc(7) int local7 = Static31.anInt624;
		@Pc(9) int[] local9 = Static363.anIntArray373;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class20_Sub3_Sub3_Sub1 local19 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt6021 > 0) {
				local19.anInt6021--;
				if (local19.anInt6021 == 0) {
					local19.aString53 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static411.anInt6695; local54++) {
			@Pc(60) int local60 = Static220.anIntArray193[local54];
			@Pc(64) Class20_Sub3_Sub3_Sub2 local64 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local60];
			if (local64 != null && local64.anInt6021 > 0) {
				local64.anInt6021--;
				if (local64.anInt6021 == 0) {
					local64.aString53 = null;
				}
			}
		}
	}
}
