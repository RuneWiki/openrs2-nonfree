import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
	public static int anInt1065;

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "Lclient!ro;")
	public static final Class221 aClass221_1 = new Class221();

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "[S")
	public static short[] aShortArray20 = new short[256];

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
	public static int anInt1060 = 0;

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "Lclient!fs;")
	public static final Class86 aClass86_1 = new Class86(16);

	@OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
	public static int anInt1066 = -1;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)Z")
	public static boolean method821(@OriginalArg(0) int arg0) {
		if (arg0 == 8 || arg0 == 30 || arg0 == 12 || arg0 == 44 || arg0 == 50) {
			return true;
		} else {
			return arg0 == 15 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)V")
	public static void method822(@OriginalArg(0) int arg0) {
		Static113.method1929();
		@Pc(19) int local19 = Static172.aClass123_1.method2740(arg0).anInt4625;
		if (local19 == 0) {
			return;
		}
		@Pc(30) int local30 = Static224.aClass239_7.anIntArray564[arg0];
		if (local19 == 6) {
			Static7.anInt49 = local30;
		}
		if (local19 == 5) {
			Static72.anInt1386 = local30;
		}
	}
}
