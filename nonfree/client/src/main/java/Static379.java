import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
	public static int anInt124;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_3 = new Class142("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	public static int anInt119 = 0;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
	public static int anInt122 = -1;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_7 = new Class67(18, -2);

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
	public static int anInt125 = -1;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)V")
	public static void method127(@OriginalArg(1) int arg0) {
		if (Static270.anInt1979 == 0) {
			Static181.aClass1_Sub9_Sub3_2.method4642(arg0);
		} else {
			Static451.anInt7187 = arg0;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!jg;I)V")
	public static void method129(@OriginalArg(0) Class11_Sub1_Sub3 arg0) {
		@Pc(10) boolean local10 = false;
		if (Static98.anInt1304 == arg0.anInt3341 || arg0.anInt3302 == -1 || arg0.anInt3337 != 0) {
			local10 = true;
		} else {
			@Pc(36) Class64 local36 = Static402.aClass37_2.method665(arg0.anInt3302);
			if (local36.aBoolean142 || local36.anIntArray126[arg0.anInt3296] < arg0.anInt3268 + 1) {
				local10 = true;
			}
		}
		if (local10) {
			@Pc(63) int local63 = arg0.anInt3341 - arg0.anInt3301;
			@Pc(69) int local69 = Static98.anInt1304 - arg0.anInt3301;
			@Pc(81) int local81 = arg0.anInt3291 * 128 + arg0.method2635() * 64;
			@Pc(93) int local93 = arg0.anInt3329 * 128 + arg0.method2635() * 64;
			@Pc(105) int local105 = arg0.anInt3306 * 128 + arg0.method2635() * 64;
			@Pc(117) int local117 = arg0.anInt3294 * 128 + arg0.method2635() * 64;
			arg0.anInt6430 = (local69 * local117 + local93 * (local63 - local69)) / local63;
			arg0.anInt6428 = (local81 * (local63 - local69) + local69 * local105) / local63;
		}
		arg0.anInt3345 = 0;
		if (arg0.anInt3292 == 0) {
			arg0.method2642(8192, false);
		}
		if (arg0.anInt3292 == 1) {
			arg0.method2642(12288, false);
		}
		if (arg0.anInt3292 == 2) {
			arg0.method2642(0, false);
		}
		if (arg0.anInt3292 == 3) {
			arg0.method2642(4096, false);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIBLclient!eb;IZI)V")
	public static void method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class64 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (Static249.anInt4440 >= 50 || (arg2 == null || arg2.anIntArrayArray16 == null || arg0 >= arg2.anIntArrayArray16.length || arg2.anIntArrayArray16[arg0] == null)) {
			return;
		}
		@Pc(34) int local34 = arg2.anIntArrayArray16[arg0][0];
		@Pc(46) int local46 = local34 >> 8;
		@Pc(52) int local52 = local34 >> 5 & 0x7;
		@Pc(71) int local71;
		if (arg2.anIntArrayArray16[arg0].length > 1) {
			local71 = (int) ((double) arg2.anIntArrayArray16[arg0].length * Math.random());
			if (local71 > 0) {
				local46 = arg2.anIntArrayArray16[arg0][local71];
			}
		}
		@Pc(84) int local84 = local34 & 0x1F;
		if (local84 == 0) {
			if (arg4) {
				Static318.method4199(0, local46, local52, 255);
			}
		} else if (Static126.aClass19_Sub1_1.anInt4221 != 0) {
			local71 = arg1 - 64 >> 7;
			@Pc(114) int local114 = arg5 - 64 >> 7;
			Static234.aClass43Array1[Static249.anInt4440++] = new Class43((byte) 1, local46, local52, 0, 255, (arg3 << 24) + (local71 << 16) + (local114 << 8) + local84);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I[Lclient!o;)V")
	public static void method132(@OriginalArg(1) Class85[] arg0) {
		Static133.anInt2067 = arg0.length;
		Static138.anIntArray185 = new int[Static133.anInt2067 + 10];
		Static91.aClass85Array5 = new Class85[Static133.anInt2067 + 10];
		Static471.method3067(arg0, 0, Static91.aClass85Array5, 0, Static133.anInt2067);
		for (@Pc(30) int local30 = 0; local30 < Static133.anInt2067; local30++) {
			Static138.anIntArray185[local30] = Static91.aClass85Array5[local30].Q();
		}
		for (@Pc(49) int local49 = Static133.anInt2067; local49 < Static91.aClass85Array5.length; local49++) {
			Static138.anIntArray185[local49] = 12;
		}
	}
}
