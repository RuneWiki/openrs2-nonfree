import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_48 = new Class142("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)Lclient!at;")
	public static Class20 method2867() {
		try {
			return new Class20_Sub1();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class20) Class.forName("Class20_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class20_Sub2();
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	public static void method2868() {
		if (Static135.anInt2114 == 2) {
			Static154.method1923(3);
		} else if (Static135.anInt2114 == 6) {
			Static154.method1923(7);
		} else if (Static135.anInt2114 == 9) {
			Static154.method1923(10);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZC)B")
	public static byte method2869(@OriginalArg(1) char arg0) {
		@Pc(23) byte local23;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local23 = (byte) arg0;
		} else if (arg0 == '€') {
			local23 = -128;
		} else if (arg0 == '‚') {
			local23 = -126;
		} else if (arg0 == 'ƒ') {
			local23 = -125;
		} else if (arg0 == '„') {
			local23 = -124;
		} else if (arg0 == '…') {
			local23 = -123;
		} else if (arg0 == '†') {
			local23 = -122;
		} else if (arg0 == '‡') {
			local23 = -121;
		} else if (arg0 == 'ˆ') {
			local23 = -120;
		} else if (arg0 == '‰') {
			local23 = -119;
		} else if (arg0 == 'Š') {
			local23 = -118;
		} else if (arg0 == '‹') {
			local23 = -117;
		} else if (arg0 == 'Œ') {
			local23 = -116;
		} else if (arg0 == 'Ž') {
			local23 = -114;
		} else if (arg0 == '‘') {
			local23 = -111;
		} else if (arg0 == '’') {
			local23 = -110;
		} else if (arg0 == '“') {
			local23 = -109;
		} else if (arg0 == '”') {
			local23 = -108;
		} else if (arg0 == '•') {
			local23 = -107;
		} else if (arg0 == '–') {
			local23 = -106;
		} else if (arg0 == '—') {
			local23 = -105;
		} else if (arg0 == '˜') {
			local23 = -104;
		} else if (arg0 == '™') {
			local23 = -103;
		} else if (arg0 == 'š') {
			local23 = -102;
		} else if (arg0 == '›') {
			local23 = -101;
		} else if (arg0 == 'œ') {
			local23 = -100;
		} else if (arg0 == 'ž') {
			local23 = -98;
		} else if (arg0 == 'Ÿ') {
			local23 = -97;
		} else {
			local23 = 63;
		}
		return local23;
	}
}
