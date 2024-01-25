import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static301 {

	@OriginalMember(owner = "client!ot", name = "T", descriptor = "I")
	public static int anInt5208;

	@OriginalMember(owner = "client!ot", name = "V", descriptor = "Lclient!ve;")
	public static Class10_Sub43 aClass10_Sub43_1;

	@OriginalMember(owner = "client!ot", name = "W", descriptor = "[Lclient!o;")
	public static Class80[] aClass80Array16;

	@OriginalMember(owner = "client!ot", name = "R", descriptor = "Lclient!eo;")
	public static final Class46 aClass46_1 = Static35.method479();

	@OriginalMember(owner = "client!ot", name = "S", descriptor = "Z")
	public static final boolean aBoolean353 = false;

	@OriginalMember(owner = "client!ot", name = "U", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)V")
	public static void method4175() {
		if (Static197.anInt3945 == 5) {
			Static197.anInt3945 = 6;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BI)Z")
	public static boolean method4177(@OriginalArg(1) int arg0) {
		return arg0 == 45 || arg0 == 3 || arg0 == 1001 || arg0 == 30 || arg0 == 19;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(IIB)Z")
	public static boolean method4178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static90.method1690(arg1, arg0) | (arg1 & 0x10000) != 0 || Static152.method2605(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static445.method5935(arg1, arg0);
		}
	}
}
