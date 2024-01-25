import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	public static int anInt6867;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Z")
	public static boolean aBoolean460;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "[Lclient!sa;")
	public static Class10[] aClass10Array7;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "[Lclient!ha;")
	public static Class12[] aClass12Array24;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!h;")
	public static final Class114 aClass114_135 = new Class114("Loaded JAGGL", "JAGGL geladen", "JAGGL chargé", "JAGGL carregado");

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Z")
	public static boolean aBoolean461 = false;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5948(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(18) String local18 = Static361.method5639(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static35.anInt1297; local31++) {
			@Pc(36) String local36 = Static159.aStringArray13[local31];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static361.method5639(local36);
			if (local36 != null && local36.equals(local18)) {
				Static35.anInt1297--;
				for (@Pc(60) int local60 = local31; local60 < Static35.anInt1297; local60++) {
					Static159.aStringArray13[local60] = Static159.aStringArray13[local60 + 1];
					Static401.aStringArray38[local60] = Static401.aStringArray38[local60 + 1];
					Static529.aStringArray47[local60] = Static529.aStringArray47[local60 + 1];
					Static472.aStringArray44[local60] = Static472.aStringArray44[local60 + 1];
					Static449.aBooleanArray30[local60] = Static449.aBooleanArray30[local60 + 1];
				}
				Static340.anInt6357 = Static418.anInt7279;
				Static444.method6416(Static537.aClass186_117);
				Static192.aClass1_Sub13_Sub2_1.method3060(Static443.method6412(arg0));
				Static192.aClass1_Sub13_Sub2_1.method3061(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5949(@OriginalArg(0) String arg0) {
		@Pc(12) StringBuffer local12 = new StringBuffer();
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(22) char local22 = arg0.charAt(local17);
			if (local22 == '%' && local17 + 2 < local15) {
				local22 = arg0.charAt(local17 + 1);
				@Pc(93) int local93;
				if (local22 >= '0' && local22 <= '9') {
					local93 = local22 - 48;
				} else if (local22 >= 'a' && local22 <= 'f') {
					local93 = local22 + 10 - 'a';
				} else {
					if (local22 < 'A' || local22 > 'F') {
						local12.append('%');
						continue;
					}
					local93 = local22 + '\n' - 65;
				}
				local22 = arg0.charAt(local17 + 2);
				local93 *= 16;
				if (local22 >= '0' && local22 <= '9') {
					local93 += local22 - '0';
				} else if (local22 >= 'a' && local22 <= 'f') {
					local93 += local22 + '\n' - 97;
				} else {
					if (local22 < 'A' || local22 > 'F') {
						local12.append('%');
						continue;
					}
					local93 += local22 - 55;
				}
				local17 += 2;
				if (local93 != 0 && Static214.method3851((byte) local93)) {
					local12.append(Static455.method6568((byte) local93));
				}
			} else if (local22 == '+') {
				local12.append(' ');
			} else {
				local12.append(local22);
			}
		}
		return local12.toString();
	}
}
