import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!da", name = "S", descriptor = "[Lclient!rc;")
	public static Class2_Sub2_Sub16[] aClass2_Sub2_Sub16Array4;

	@OriginalMember(owner = "client!da", name = "X", descriptor = "J")
	public static long aLong21 = 0L;

	@OriginalMember(owner = "client!da", name = "Z", descriptor = "Lclient!i;")
	private static Class41 aClass41_231 = Static184.method2923("Use");

	@OriginalMember(owner = "client!da", name = "db", descriptor = "Lclient!i;")
	public static Class41 aClass41_232 = aClass41_231;

	@OriginalMember(owner = "client!da", name = "gb", descriptor = "Lclient!i;")
	private static Class41 aClass41_233 = Static184.method2923("wave2:");

	@OriginalMember(owner = "client!da", name = "hb", descriptor = "Lclient!i;")
	public static Class41 aClass41_234 = aClass41_233;

	@OriginalMember(owner = "client!da", name = "kb", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!da", name = "nb", descriptor = "Lclient!i;")
	public static Class41 aClass41_235 = aClass41_233;

	@OriginalMember(owner = "client!da", name = "ob", descriptor = "Lclient!wi;")
	public static Class108 aClass108_1 = new Class108();

	@OriginalMember(owner = "client!da", name = "qb", descriptor = "I")
	public static int anInt889 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILclient!nc;JZ)V")
	public static void method653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class78 local6 = new Class78();
		local6.aClass12_7 = arg4;
		local6.anInt3383 = arg1 * 128 + 64;
		local6.anInt3378 = arg2 * 128 + 64;
		local6.anInt3380 = arg3;
		local6.aLong103 = arg5;
		if (Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2] = new Class2_Sub7(arg0, arg1, arg2);
		}
		Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2].aClass78_1 = local6;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(IB)V")
	public static void method654(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static150.aBooleanArray18[arg0]) {
			return;
		}
		Static74.aClass15_18.method404(arg0);
		if (Static68.aClass80ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(33) boolean local33 = true;
		for (@Pc(35) int local35 = 0; local35 < Static68.aClass80ArrayArray1[arg0].length; local35++) {
			if (Static68.aClass80ArrayArray1[arg0][local35] != null) {
				if (Static68.aClass80ArrayArray1[arg0][local35].anInt3640 == 2) {
					local33 = false;
				} else {
					Static68.aClass80ArrayArray1[arg0][local35] = null;
				}
			}
		}
		if (local33) {
			Static68.aClass80ArrayArray1[arg0] = null;
		}
		Static150.aBooleanArray18[arg0] = false;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(B)Lclient!cf;")
	public static Class19 method656() {
		try {
			return (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
