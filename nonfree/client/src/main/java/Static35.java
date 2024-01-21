import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
	public static int anInt1167;

	@OriginalMember(owner = "client!fa", name = "ab", descriptor = "I")
	public static int anInt1172;

	@OriginalMember(owner = "client!fa", name = "gb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!fa", name = "kb", descriptor = "[I")
	public static int[] anIntArray146;

	@OriginalMember(owner = "client!fa", name = "P", descriptor = "Lclient!wd;")
	public static Class80 aClass80_390 = Static2.method59("m");

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "[Lclient!ub;")
	public static Class71[] aClass71Array1 = new Class71[50];

	@OriginalMember(owner = "client!fa", name = "hb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_393 = Static2.method59("wishes to trade with you)3");

	@OriginalMember(owner = "client!fa", name = "U", descriptor = "Lclient!wd;")
	public static Class80 aClass80_391 = aClass80_393;

	@OriginalMember(owner = "client!fa", name = "X", descriptor = "[Lclient!cc;")
	public static Class2_Sub1_Sub1_Sub4_Sub1[] aClass2_Sub1_Sub1_Sub4_Sub1Array1 = new Class2_Sub1_Sub1_Sub4_Sub1[32768];

	@OriginalMember(owner = "client!fa", name = "fb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_392 = Static2.method59("Chat panel redrawn");

	@OriginalMember(owner = "client!fa", name = "ib", descriptor = "Lclient!wd;")
	public static Class80 aClass80_394 = Static2.method59("Verbindung mit");

	@OriginalMember(owner = "client!fa", name = "lb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_395 = Static2.method59("Mitteilung");

	@OriginalMember(owner = "client!fa", name = "ob", descriptor = "Lclient!wd;")
	public static Class80 aClass80_396 = Static2.method59("(U3");

	@OriginalMember(owner = "client!fa", name = "rb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_398 = Static2.method59("Click to switch");

	@OriginalMember(owner = "client!fa", name = "pb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_397 = aClass80_398;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(B)V")
	public static void method623() {
		Static119.aClass32_31.method878();
		Static86.aClass32_41.method878();
		Static42.aClass32_24.method878();
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	public static void method624() {
		Static9.aByteArrayArray2 = null;
		Static93.anIntArray314 = null;
		Static40.anIntArray154 = null;
		Static95.anIntArray318 = null;
		Static86.anIntArray280 = null;
		Static14.anIntArray65 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!kb;Z)V")
	public static void method625(@OriginalArg(0) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub16_5 != null) {
			arg0.aClass2_Sub16_5.anInt2503 = 0;
		}
		arg0.aBoolean184 = false;
		for (@Pc(14) Class2_Sub2 local14 = arg0.method1521(); local14 != null; local14 = arg0.method1518()) {
			method625(local14);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
	public static void method626(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub18 local10 = (Class2_Sub18) Static104.aClass41_12.method1056((long) arg0);
		if (local10 != null) {
			local10.method1961();
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
	public static void method627() {
		aClass80_393 = null;
		aByteArrayArrayArray2 = null;
		aClass2_Sub1_Sub1_Sub4_Sub1Array1 = null;
		aClass80_396 = null;
		aClass80_395 = null;
		aClass80_392 = null;
		aClass80_397 = null;
		aClass80_394 = null;
		aClass80_398 = null;
		aClass80_390 = null;
		anIntArray146 = null;
		aClass71Array1 = null;
		aClass80_391 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([BIII)Lclient!wd;")
	public static Class80 method628(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class80 local5 = new Class80();
		local5.anInt3200 = 0;
		local5.aByteArray40 = new byte[arg2];
		for (@Pc(18) int local18 = arg1; local18 < arg1 + arg2; local18++) {
			if (arg0[local18] != 0) {
				local5.aByteArray40[local5.anInt3200++] = arg0[local18];
			}
		}
		return local5;
	}
}
