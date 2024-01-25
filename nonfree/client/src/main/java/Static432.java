import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "[[S")
	public static short[][] aShortArrayArray12;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!h;")
	public static final Class114 aClass114_145 = new Class114("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method6371() {
		if (Static197.method3654(Static51.anInt7926) || Static124.method4352(Static51.anInt7926)) {
			Static391.method5888(Static308.anInt5918 >> 10, Static347.anInt6404 >> 10, 5000);
		} else {
			@Pc(32) int local32 = Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray362[0] >> 3;
			@Pc(39) int local39 = Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray361[0] >> 3;
			if (local32 >= 0 && Static542.anInt9387 >> 3 > local32 && local39 >= 0 && local39 < Static36.anInt1324 >> 3) {
				Static391.method5888(local32, local39, 5000);
			} else {
				Static391.method5888(Static542.anInt9387 >> 4, Static36.anInt1324 >> 4, 0);
			}
		}
		Static246.method4152();
		Static245.method4144();
		Static18.method820();
		Static131.method2856();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method6372(@OriginalArg(1) String arg0) {
		if (Static283.anInt5580 == 3) {
			return -1;
		} else if (Static241.aHashtable6.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(25) String local25 = Static34.method1305(arg0);
			if (local25 == null) {
				return -1;
			}
			@Pc(38) String local38 = Static136.aString21 + local25;
			if (!Static265.aClass160_60.method4209("", local38)) {
				return -1;
			} else if (Static265.aClass160_60.method4219(local38)) {
				@Pc(62) byte[] local62 = Static265.aClass160_60.method4222("", local38);
				@Pc(67) File local67 = Static239.aClass182_6.method4804(local25);
				if (local62 == null || local67 == null) {
					return -1;
				}
				@Pc(73) boolean local73 = true;
				@Pc(77) byte[] local77 = Static409.method6132(local67);
				if (local77 != null && local77.length == local62.length) {
					for (@Pc(89) int local89 = 0; local89 < local77.length; local89++) {
						if (local62[local89] != local77[local89]) {
							local73 = false;
							break;
						}
					}
				} else {
					local73 = false;
				}
				try {
					if (!local73) {
						Static239.aClass182_6.method4820(local67, local62);
					}
				} catch (@Pc(119) Throwable local119) {
					return -1;
				}
				Static406.method6080(arg0, local67);
				return 100;
			} else {
				return Static265.aClass160_60.method4194(local38);
			}
		}
	}
}
