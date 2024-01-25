import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray78;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Lclient!la;")
	public static Class207 aClass207_120;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "Lclient!rda;")
	public static final Class5_Sub43 aClass5_Sub43_6 = new Class5_Sub43(0, 0);

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "Lclient!ew;")
	public static final Class98 aClass98_51 = new Class98("", 14);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	public static void method8676() {
		@Pc(13) int local13 = 0;
		if (Static97.aClass5_Sub25_8 != null) {
			local13 = Static97.aClass5_Sub25_8.aClass6_Sub27_1.method8027();
		}
		@Pc(32) int local32;
		@Pc(41) int local41;
		if (local13 == 2) {
			local32 = Static312.anInt10525 > 800 ? 800 : Static312.anInt10525;
			local41 = Static28.anInt359 > 600 ? 600 : Static28.anInt359;
			Static246.anInt4491 = (Static312.anInt10525 - local32) / 2;
			Static345.anInt5827 = local32;
			Static408.anInt7118 = local41;
			Static147.anInt2574 = 0;
		} else if (local13 == 1) {
			local32 = Static312.anInt10525 > 1024 ? 1024 : Static312.anInt10525;
			local41 = Static28.anInt359 <= 768 ? Static28.anInt359 : 768;
			Static345.anInt5827 = local32;
			Static246.anInt4491 = (Static312.anInt10525 - local32) / 2;
			Static147.anInt2574 = 0;
			Static408.anInt7118 = local41;
		} else {
			Static246.anInt4491 = 0;
			Static147.anInt2574 = 0;
			Static408.anInt7118 = Static28.anInt359;
			Static345.anInt5827 = Static312.anInt10525;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BIC)C")
	public static char method8678(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}
}
