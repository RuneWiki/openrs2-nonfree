import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "Lclient!kj;")
	public static Class6_Sub29 aClass6_Sub29_3;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
	public static int anInt8263;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "Lclient!ui;")
	public static final Class359 aClass359_54 = new Class359(8);

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "[I")
	public static final int[] anIntArray518 = new int[6];

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
	public static int anInt8266 = 0;

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "[I")
	public static final int[] anIntArray519 = new int[6];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
	public static int method7227() {
		return Static290.anInt10204 == 1 ? Static211.anInt4193 : 0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIILclient!vea;)V")
	public static void method7228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class60_Sub1_Sub2 arg3) {
		@Pc(4) Class243 local4 = Static565.method7969(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass60_Sub1_Sub2_1 = arg3;
		@Pc(19) int local19 = Static555.aClass96Array3 == Static216.aClass96Array1 ? 1 : 0;
		if (arg3.method7919()) {
			if (arg3.method7918()) {
				arg3.aClass60_Sub1_23 = Static265.aClass60_Sub1Array4[local19];
				Static265.aClass60_Sub1Array4[local19] = arg3;
				return;
			}
			arg3.aClass60_Sub1_23 = Static403.aClass60_Sub1Array5[local19];
			Static403.aClass60_Sub1Array5[local19] = arg3;
			Static429.aBoolean549 = true;
			return;
		}
		arg3.aClass60_Sub1_23 = Static535.aClass60_Sub1Array3[local19];
		Static535.aClass60_Sub1Array3[local19] = arg3;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method7230(@OriginalArg(1) Class75 arg0) {
		Static82.aClass92Array1 = new Class92[Static512.anIntArray533.length];
		for (@Pc(16) int local16 = 0; local16 < Static512.anIntArray533.length; local16++) {
			@Pc(22) int local22 = Static512.anIntArray533[local16];
			@Pc(27) Class53 local27 = Static287.method4708(local22, Static57.aClass223_12);
			@Pc(35) Class67 local35 = arg0.method6649(local27, Static691.method1247(Static173.aClass223_35, local22));
			Static82.aClass92Array1[local16] = new Class92(local35, local27);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZC)C")
	public static char method7231(@OriginalArg(1) char arg0) {
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
