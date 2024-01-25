import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!oi;")
	public static Class185 aClass185_17;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
	public static int anInt915;

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "Lclient!am;")
	public static final Class14 aClass14_3 = new Class14();

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "Lclient!dv;")
	public static final Class63 aClass63_1 = new Class63();

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[200];

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(CI)Z")
	public static boolean method809(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!jg;)V")
	public static void method810(@OriginalArg(1) Class11_Sub1_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt3301 - Static98.anInt1304;
		@Pc(21) int local21 = arg0.anInt3291 * 128 + arg0.method2635() * 64;
		@Pc(32) int local32 = arg0.anInt3329 * 128 + arg0.method2635() * 64;
		arg0.anInt6430 += (local32 - arg0.anInt6430) / local9;
		arg0.anInt3345 = 0;
		arg0.anInt6428 += (local21 - arg0.anInt6428) / local9;
		if (arg0.anInt3292 == 0) {
			arg0.method2631(8192);
		}
		if (arg0.anInt3292 == 1) {
			arg0.method2631(12288);
		}
		if (arg0.anInt3292 == 2) {
			arg0.method2631(0);
		}
		if (arg0.anInt3292 == 3) {
			arg0.method2631(4096);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "([BI)Z")
	public static boolean method811(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub19 local8 = new Class1_Sub19(arg0);
		@Pc(12) int local12 = local8.method2915();
		if (local12 != 2) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method2915() == 1;
		if (local28) {
			Static271.method3867(local8);
		}
		Static171.method2275(local8);
		return true;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V")
	public static void method815() {
		Static62.aClass14_4 = new Class14();
	}
}
