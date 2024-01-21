import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_4;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!ge;")
	public static Class7 aClass7_7;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "Lclient!ga;")
	public static Class29 aClass29_5;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!rd;")
	private static Class63 aClass63_331 = Static80.method1463("Please use a different world)3");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!rd;")
	public static Class63 aClass63_328 = aClass63_331;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!rd;")
	private static Class63 aClass63_329 = Static80.method1463("To");

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!rd;")
	public static Class63 aClass63_330 = aClass63_329;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	public static int anInt489 = 0;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "Lclient!rd;")
	private static Class63 aClass63_332 = Static80.method1463("Prepared sound engine");

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "Lclient!rd;")
	public static Class63 aClass63_333 = aClass63_331;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Lclient!rd;")
	public static Class63 aClass63_334 = Static80.method1463("sch-Utteln:");

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "[Lclient!r;")
	public static Class62[] aClass62Array1 = new Class62[50];

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "Lclient!rd;")
	public static Class63 aClass63_335 = aClass63_332;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
	public static int anInt492 = 0;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "[Lclient!hc;")
	public static Class30[] aClass30Array1 = new Class30[4];

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
	public static int anInt494 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([Lclient!rd;I)Lclient!rd;")
	public static Class63 method374(@OriginalArg(0) Class63[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static42.method920(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)I")
	public static int method375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg0 /= 2;
		}
		if (arg1 > 192) {
			arg0 /= 2;
		}
		if (arg1 > 217) {
			arg0 /= 2;
		}
		if (arg1 > 243) {
			arg0 /= 2;
		}
		return arg1 / 2 + (arg0 / 32 << 7) + (arg2 / 4 << 10);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method376() {
		aClass63_331 = null;
		aClass63_335 = null;
		aClass63_329 = null;
		aClass63_332 = null;
		aClass7_7 = null;
		aClass63_333 = null;
		aClass29_5 = null;
		aClass6_Sub3_Sub3_Sub3_4 = null;
		aClass63_330 = null;
		aClass63_334 = null;
		aClass30Array1 = null;
		aClass62Array1 = null;
		aClass63_328 = null;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	public static void method377() {
		Static44.method959();
		Static35.aBoolean58 = true;
		Static22.method533();
		@Pc(31) boolean local31;
		if (Static25.anInt847 != -1) {
			local31 = Static72.method1385(1, 190, 261, Static25.anInt847);
			if (!local31) {
				Static10.aBoolean20 = true;
			}
		} else if (Static111.anIntArray352[Static86.anInt2366] != -1) {
			local31 = Static72.method1385(1, 190, 261, Static111.anIntArray352[Static86.anInt2366]);
			if (!local31) {
				Static10.aBoolean20 = true;
			}
		}
		if (Static12.aBoolean23 && Static19.anInt634 == 1) {
			if (Static65.anInt1845 == 1) {
				Static44.method958();
			} else {
				Static49.method1037();
			}
		}
		Static72.method1382();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!rd;")
	public static Class63 method378(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static118.method2114(arg0) : Static51.aClass63_836;
	}
}
