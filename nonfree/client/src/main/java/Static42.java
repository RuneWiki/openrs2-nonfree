import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bv", name = "L", descriptor = "[I")
	public static int[] anIntArray107;

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_22 = new Class158("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!bv", name = "F", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!bv", name = "M", descriptor = "[I")
	public static final int[] anIntArray108 = new int[13];

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(III)I")
	public static int method783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 >>> 31;
		return (arg0 + local15) / arg1 - local15;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZII[BI[BIII)V")
	public static void method784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = -(arg0 >> 2);
		@Pc(19) int local19 = -(arg0 & 0x3);
		for (@Pc(22) int local22 = -arg1; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg6++;
				arg4[local30] = (byte) (arg4[local30] - arg2[arg7++]);
				@Pc(43) int local43 = arg6++;
				arg4[local43] = (byte) (arg4[local43] - arg2[arg7++]);
				@Pc(56) int local56 = arg6++;
				arg4[local56] = (byte) (arg4[local56] - arg2[arg7++]);
				@Pc(69) int local69 = arg6++;
				arg4[local69] = (byte) (arg4[local69] - arg2[arg7++]);
			}
			for (@Pc(88) int local88 = local19; local88 < 0; local88++) {
				local30 = arg6++;
				arg4[local30] = (byte) (arg4[local30] - arg2[arg7++]);
			}
			arg7 += arg5;
			arg6 += arg3;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(JILjava/lang/String;Z)V")
	public static void method785(@OriginalArg(0) long arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		if (arg2) {
			Static342.method4808();
			if (Static323.aString56.equals("")) {
				Static168.anInt1719 = 39;
				return;
			}
		}
		@Pc(19) Class1_Sub3 local19 = new Class1_Sub3(128);
		local19.method1208(10);
		local19.method1227((int) (Math.random() * 65535.0D));
		local19.method1180(arg0);
		local19.method1227(Static2.anInt47);
		local19.method1197((int) (Math.random() * 9.9999999E7D));
		local19.method1190(arg1);
		local19.method1197((int) (Math.random() * 9.9999999E7D));
		if (arg2) {
			local19.method1180(Static26.method555(Static323.aString56));
			try {
				local19.method1180(Long.parseLong(Static413.aString63));
			} catch (@Pc(71) Exception local71) {
				Static168.anInt1719 = 39;
				return;
			}
		} else {
			local19.method1197((int) (Math.random() * 9.9999999E7D));
			local19.method1197((int) (Math.random() * 9.9999999E7D));
			local19.method1197((int) (Math.random() * 9.9999999E7D));
			local19.method1197((int) (Math.random() * 9.9999999E7D));
		}
		local19.method1197((int) (Math.random() * 9.9999999E7D));
		local19.method1183(Static194.aBigInteger2, Static77.aBigInteger1);
		Static433.aClass1_Sub3_Sub1_11.anInt1710 = 0;
		Static433.aClass1_Sub3_Sub1_11.method1208(arg2 ? Static168.aClass247_36.anInt7273 : Static168.aClass247_33.anInt7273);
		Static433.aClass1_Sub3_Sub1_11.method1227(local19.anInt1710 + 28);
		Static433.aClass1_Sub3_Sub1_11.method1227(598);
		Static433.aClass1_Sub3_Sub1_11.method1208(Static365.anInt6682);
		Static433.aClass1_Sub3_Sub1_11.method1208(Static268.aClass272_4.anInt7964);
		Static346.method4897(Static433.aClass1_Sub3_Sub1_11);
		Static433.aClass1_Sub3_Sub1_11.method1181(local19.aByteArray14, local19.anInt1710);
		Static168.anInt1719 = -3;
		Static174.anInt3826 = 1;
		Static54.anInt1413 = 0;
		Static319.anInt1887 = 0;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IC)C")
	public static char method787(@OriginalArg(1) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}
}
