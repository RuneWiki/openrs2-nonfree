import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
	public static int anInt7132;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
	public static int anInt7134;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
	public static int anInt7136;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_250 = new Class62("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	public static void method6127() {
		if (Static162.aClass86_4 == null) {
			return;
		}
		if (Static162.aClass86_4.anInt2590 == 1) {
			Static162.aClass86_4 = null;
			return;
		}
		if (Static162.aClass86_4.anInt2590 == 2) {
			Static326.method5242(Static259.aString46, Static222.aClass123_4, 2);
			Static162.aClass86_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIIBI)V")
	public static void method6128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class7_Sub4 local10 = (Class7_Sub4) Static119.aClass199_2.method4896(); local10 != null; local10 = (Class7_Sub4) Static119.aClass199_2.method4902()) {
			if (Static339.anInt6265 >= local10.anInt3775) {
				local10.method5398();
			} else {
				Static55.method856(local10.anInt3778 * 2, arg0 >> 1, arg3 >> 1, (local10.anInt3779 << 7) + 64, (local10.anInt3780 << 7) + 64, local10.anInt3777);
				Static180.aClass44_4.method4644(local10.anInt3781 | 0xFF000000, 0, arg1 + Static128.anIntArray211[1], arg2 + Static128.anIntArray211[0], local10.aString33);
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIZZIFI)[[I")
	public static int[][] method6129(@OriginalArg(7) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub1_Sub13 local13 = new Class2_Sub1_Sub13();
		local13.anInt2802 = (int) (arg0 * 4096.0F);
		local13.anInt2813 = 8;
		local13.aBoolean195 = false;
		local13.anInt2811 = 3;
		local13.anInt2807 = 4;
		local13.method6067();
		Static262.method4488(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method2252(local9[local45], local45);
		}
		return local9;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;BIII[B)I")
	public static int method6131(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(14) int local14 = arg1;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(24) char local24 = arg0.charAt(local16);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				arg3[local16 + arg2] = (byte) local24;
			} else if (local24 == '€') {
				arg3[arg2 + local16] = -128;
			} else if (local24 == '‚') {
				arg3[arg2 + local16] = -126;
			} else if (local24 == 'ƒ') {
				arg3[local16 + arg2] = -125;
			} else if (local24 == '„') {
				arg3[local16 + arg2] = -124;
			} else if (local24 == '…') {
				arg3[local16 + arg2] = -123;
			} else if (local24 == '†') {
				arg3[local16 + arg2] = -122;
			} else if (local24 == '‡') {
				arg3[local16 + arg2] = -121;
			} else if (local24 == 'ˆ') {
				arg3[arg2 + local16] = -120;
			} else if (local24 == '‰') {
				arg3[arg2 + local16] = -119;
			} else if (local24 == 'Š') {
				arg3[arg2 + local16] = -118;
			} else if (local24 == '‹') {
				arg3[local16 + arg2] = -117;
			} else if (local24 == 'Œ') {
				arg3[arg2 + local16] = -116;
			} else if (local24 == 'Ž') {
				arg3[local16 + arg2] = -114;
			} else if (local24 == '‘') {
				arg3[arg2 + local16] = -111;
			} else if (local24 == '’') {
				arg3[arg2 + local16] = -110;
			} else if (local24 == '“') {
				arg3[arg2 + local16] = -109;
			} else if (local24 == '”') {
				arg3[local16 + arg2] = -108;
			} else if (local24 == '•') {
				arg3[local16 + arg2] = -107;
			} else if (local24 == '–') {
				arg3[arg2 + local16] = -106;
			} else if (local24 == '—') {
				arg3[arg2 + local16] = -105;
			} else if (local24 == '˜') {
				arg3[local16 + arg2] = -104;
			} else if (local24 == '™') {
				arg3[arg2 + local16] = -103;
			} else if (local24 == 'š') {
				arg3[arg2 + local16] = -102;
			} else if (local24 == '›') {
				arg3[local16 + arg2] = -101;
			} else if (local24 == 'œ') {
				arg3[local16 + arg2] = -100;
			} else if (local24 == 'ž') {
				arg3[arg2 + local16] = -98;
			} else if (local24 == 'Ÿ') {
				arg3[arg2 + local16] = -97;
			} else {
				arg3[arg2 + local16] = 63;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method6132(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static77.method1332(Static373.aClass183_110);
		Static76.aClass2_Sub24_Sub2_7.method5746(Static305.method6026(arg1) + 1);
		Static76.aClass2_Sub24_Sub2_7.method5772(arg1);
		Static76.aClass2_Sub24_Sub2_7.method5775(arg0);
	}
}
