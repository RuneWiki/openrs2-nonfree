import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!kl", name = "t", descriptor = "B")
	public static byte aByte74;

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "[I")
	public static final int[] anIntArray298 = new int[64];

	@OriginalMember(owner = "client!kl", name = "A", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_80 = new Class171(32, -1);

	@OriginalMember(owner = "client!kl", name = "G", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!kl", name = "H", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_52 = new Class240(0, 6);

	@OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
	public static int anInt5291 = 1;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)Z")
	public static boolean method4540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static204.method3066(arg1, arg0) & Static155.method2483(arg0, arg1);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)V")
	public static void method4541(@OriginalArg(0) boolean arg0) {
		if (Static12.aClass26_1 != null) {
			Static12.aClass26_1.method746();
			Static12.aClass26_1 = null;
		}
		Static474.anInt7575 = 0;
		Static655.method8761();
		Static70.method1234();
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			Static609.aClass110Array1[local27].method2365();
		}
		Static345.method5025(false);
		System.gc();
		Static643.method8653();
		Static501.aBoolean551 = false;
		Static189.anInt3426 = -1;
		Static115.method1733();
		Static179.method7839(true);
		Static534.anInt8358 = 0;
		Static55.anInt1158 = 0;
		Static586.anInt9541 = 0;
		Static402.anInt6661 = 0;
		Static447.anInt7216 = 0;
		Static82.anInt1510 = 0;
		for (@Pc(68) int local68 = 0; local68 < Static171.aClass252Array1.length; local68++) {
			Static171.aClass252Array1[local68] = null;
		}
		Static72.method1249();
		for (@Pc(83) int local83 = 0; local83 < 2048; local83++) {
			Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local83] = null;
		}
		Static52.anInt1140 = 0;
		Static105.aClass333_11.method7485();
		Static331.anInt5501 = 0;
		Static462.aClass333_29.method7485();
		Static304.method4414();
		Static147.anInt2707 = 0;
		Static210.aClass262_1.method5785();
		Static182.method2871();
		Static60.method1111();
		Static213.aClass3_Sub26_2 = null;
		Static234.aClass342_1 = null;
		Static665.aClass3_Sub42_3 = null;
		Static121.aClass3_Sub26_1 = null;
		Static465.aClass342_3 = null;
		Static214.aLong274 = 0L;
		if (arg0) {
			Static279.method4069(12);
			return;
		}
		Static279.method4069(3);
		try {
			Static680.method795(Static339.anApplet2, "loggedout");
		} catch (@Pc(138) Throwable local138) {
		}
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)[Lclient!jg;")
	public static Class179[] method4542() {
		return new Class179[] { Static675.aClass179_1, Static675.aClass179_2, Static675.aClass179_3, Static675.aClass179_4, Static675.aClass179_5, Static675.aClass179_6, Static675.aClass179_7, Static675.aClass179_8, Static675.aClass179_9, Static675.aClass179_10, Static675.aClass179_11, Static675.aClass179_12 };
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(B)V")
	public static void method4543() {
		if (Static313.anInt9096 > 1) {
			Static336.aClass3_Sub41_18.method6705(4, Static336.aClass3_Sub41_18.aClass14_Sub26_1);
		} else {
			Static336.aClass3_Sub41_18.method6705(2, Static336.aClass3_Sub41_18.aClass14_Sub26_1);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILclient!ofa;)Ljava/lang/String;")
	public static String method4544(@OriginalArg(1) Class265 arg0) {
		if (Static86.method1383(arg0).method6484() == 0) {
			return null;
		} else if (arg0.aString89 == null || arg0.aString89.trim().length() == 0) {
			return Static97.aBoolean153 ? "Hidden-use" : null;
		} else {
			return arg0.aString89;
		}
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(II)I")
	public static int method4545(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
