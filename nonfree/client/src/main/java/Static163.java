import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static163 {

	@OriginalMember(owner = "client!gaa", name = "x", descriptor = "I")
	public static int anInt2988;

	@OriginalMember(owner = "client!gaa", name = "p", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_40 = new Class98(36, 20);

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIBII)Z")
	public static boolean method2600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static267.aByteArrayArrayArray8[0][arg0][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static267.aByteArrayArrayArray8[arg3][arg0][arg2] & 0x10) == 0) {
			return arg1 == Static432.method6149(arg3, arg2, arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!oa;B)V")
	public static void method2601(@OriginalArg(0) Class90 arg0) {
		if (Static82.anInt1372 != Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 && (Static113.aClass133ArrayArrayArray1 != null && Static479.method6664(Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98, arg0))) {
			Static82.anInt1372 = Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98;
		}
	}
}
