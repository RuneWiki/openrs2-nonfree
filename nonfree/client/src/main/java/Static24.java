import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Z")
	public static boolean aBoolean23;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_15;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "[I")
	public static int[] anIntArray68;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Lclient!u;")
	public static Class74 aClass74_511 = Static72.method1077("p12_full");

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Lclient!u;")
	public static Class74 aClass74_512 = Static72.method1077("backright2");

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_513 = Static72.method1077("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!u;")
	public static Class74 aClass74_514 = Static72.method1077("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!e", name = "n", descriptor = "[Lclient!u;")
	public static Class74[] aClass74Array4 = new Class74[20];

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Lclient!u;")
	public static Class74 aClass74_515 = Static72.method1077("sl_stars");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method487() {
		for (@Pc(14) Class2_Sub8 local14 = (Class2_Sub8) Static104.aClass13_66.method415(); local14 != null; local14 = (Class2_Sub8) Static104.aClass13_66.method414()) {
			if (local14.anInt932 == -1) {
				local14.anInt937 = 0;
				Static84.method1292(local14);
			} else {
				local14.method1930();
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public static void method488() {
		aClass74_512 = null;
		aClass74_514 = null;
		aClass74_515 = null;
		aClass74_511 = null;
		aClass74Array4 = null;
		aClass74_513 = null;
		aByteArrayArray3 = null;
		anIntArray68 = null;
		aClass2_Sub2_Sub1_Sub1_15 = null;
		aFont1 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ba;B)V")
	public static void method489(@OriginalArg(0) Class2_Sub2_Sub2_Sub1 arg0) {
		if (arg0.anInt2716 == Static107.anInt2338 || arg0.anInt2670 == -1 || arg0.anInt2675 != 0 || arg0.anInt2677 + 1 > Static12.method270(arg0.anInt2670).anIntArray191[arg0.anInt2690]) {
			@Pc(34) int local34 = arg0.anInt2716 - arg0.anInt2701;
			@Pc(39) int local39 = Static107.anInt2338 - arg0.anInt2701;
			@Pc(50) int local50 = arg0.anInt2698 * 128 + arg0.anInt2703 * 64;
			@Pc(60) int local60 = arg0.anInt2703 * 64 + arg0.anInt2686 * 128;
			@Pc(70) int local70 = arg0.anInt2703 * 64 + arg0.anInt2721 * 128;
			@Pc(80) int local80 = arg0.anInt2703 * 64 + arg0.anInt2702 * 128;
			arg0.anInt2673 = (local70 * local39 + local80 * (local34 - local39)) / local34;
			arg0.anInt2672 = (local50 * local39 + local60 * (local34 - local39)) / local34;
		}
		if (arg0.anInt2680 == 0) {
			arg0.anInt2705 = 1024;
		}
		arg0.anInt2709 = 0;
		if (arg0.anInt2680 == 1) {
			arg0.anInt2705 = 1536;
		}
		if (arg0.anInt2680 == 2) {
			arg0.anInt2705 = 0;
		}
		if (arg0.anInt2680 == 3) {
			arg0.anInt2705 = 512;
		}
		arg0.anInt2720 = arg0.anInt2705;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZIZI)Lclient!pe;")
	public static Class26_Sub1 method491(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Class77 local5 = null;
		if (Static89.aClass24_2 != null) {
			local5 = new Class77(arg3, Static89.aClass24_2, Static63.aClass24Array1[arg3], 1000000);
		}
		return new Class26_Sub1(local5, Static56.aClass77_1, arg3, arg2, arg1, arg0);
	}
}
