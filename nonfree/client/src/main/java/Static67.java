import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!cb;")
	public static Class4_Sub6 aClass4_Sub6_1;

	@OriginalMember(owner = "client!da", name = "r", descriptor = "Lclient!wo;")
	public static Class4_Sub18_Sub4 aClass4_Sub18_Sub4_2;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString19;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "Lclient!er;")
	public static final Class69 aClass69_13 = new Class69(260);

	@OriginalMember(owner = "client!da", name = "p", descriptor = "I")
	public static int anInt1669 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CI)C")
	public static char method1267(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V")
	public static void method1268(@OriginalArg(0) int arg0) {
		@Pc(17) Class4_Sub1_Sub8 local17 = Static416.method5456(arg0, 5);
		local17.method2761();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!co;IIII)V")
	public static void method1270(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static386.method5226(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static301.anInt5434) {
			Static386.method5226(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static386.method5226(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static241.anInt4414) {
			Static386.method5226(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static241.anInt4414) {
			Static386.method5226(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static301.anInt5434 && arg4 <= Static241.anInt4414) {
			Static386.method5226(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static386.method5226(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static301.anInt5434 && arg4 > 0) {
			Static386.method5226(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
