import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	public static int anInt5282;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	public static int anInt5283;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString324 = "Created gameworld";

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
	public static int anInt5284 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method4306() {
		Static213.anInt4195 = 0;
		Static250.anInt4761 = 0;
		Static142.method2190();
		Static292.method4443();
		Static282.method4355();
		Static279.method4345();
		@Pc(19) int local19;
		for (local19 = 0; local19 < Static213.anInt4195; local19++) {
			@Pc(34) int local34 = Static68.anIntArray99[local19];
			if (Static50.anInt954 != Static182.aClass53_Sub1_Sub1Array1[local34].anInt3990) {
				if (Static182.aClass53_Sub1_Sub1Array1[local34].anInt1582 > 0) {
					Static47.method739(Static182.aClass53_Sub1_Sub1Array1[local34]);
				}
				Static182.aClass53_Sub1_Sub1Array1[local34] = null;
			}
		}
		if (Static189.aClass4_Sub10_Sub1_2.anInt5713 != Static21.anInt1052) {
			throw new RuntimeException("gpp1 pos:" + Static189.aClass4_Sub10_Sub1_2.anInt5713 + " psize:" + Static21.anInt1052);
		}
		for (local19 = 0; local19 < Static129.anInt2510; local19++) {
			if (Static182.aClass53_Sub1_Sub1Array1[Static172.anIntArray317[local19]] == null) {
				throw new RuntimeException("gpp2 pos:" + local19 + " size:" + Static129.anInt2510);
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public static void method4307() {
		Static202.aClass26_42.method511();
		Static240.aClass26_46.method511();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[BZI)Ljava/lang/String;")
	public static String method4308(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg2; local16++) {
			@Pc(32) int local32 = arg1[arg0 + local16] & 0xFF;
			if (local32 != 0) {
				if (local32 >= 128 && local32 < 160) {
					@Pc(49) char local49 = Static257.aCharArray3[local32 - 128];
					if (local49 == '\u0000') {
						local49 = '?';
					}
					local32 = local49;
				}
				local8[local14++] = (char) local32;
			}
		}
		return new String(local8, 0, local14);
	}
}
