import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "Lclient!nm;")
	public static Class119 aClass119_48;

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "Lclient!on;")
	public static Class121 aClass121_2;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
	public static int anInt2557;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
	public static int anInt2551 = 0;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
	public static int anInt2552 = 0;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "[Lclient!sj;")
	public static Class53_Sub1[] aClass53_Sub1Array1 = new Class53_Sub1[29];

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Z")
	public static boolean aBoolean225 = false;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
	public static int anInt2559 = -1;

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "Z")
	public static boolean aBoolean226 = false;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZIIIIIIII)V")
	public static void method2270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static19.method322(arg5)) {
			Static296.method717(arg4, arg0, arg7, -1, arg6, arg2, Static176.aClass157ArrayArray1[arg5], arg3, arg1);
		} else if (arg1 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				Static166.aBooleanArray11[local14] = true;
			}
		} else {
			Static166.aBooleanArray11[arg1] = true;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BJ)V")
	public static void method2271(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static116.aClass1_Sub13_Sub1_48.method1887(134);
			Static116.aClass1_Sub13_Sub1_48.method1857(arg0);
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	public static void method2272() {
		if (Static58.anIntArray98 != null && Static192.anIntArray396 != null) {
			return;
		}
		Static192.anIntArray396 = new int[256];
		Static58.anIntArray98 = new int[256];
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(24) double local24 = (double) local14 / 255.0D * 6.283185307179586D;
			Static58.anIntArray98[local14] = (int) (Math.sin(local24) * 4096.0D);
			Static192.anIntArray396[local14] = (int) (Math.cos(local24) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!to;)V")
	public static void method2273(@OriginalArg(1) Class169 arg0) {
		Static35.aClass169_1 = arg0;
	}
}
