import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!in", name = "M", descriptor = "Lclient!ov;")
	public static Class226 aClass226_6;

	@OriginalMember(owner = "client!in", name = "F", descriptor = "I")
	public static int anInt4092 = 0;

	@OriginalMember(owner = "client!in", name = "J", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_44 = new Class37();

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)V")
	public static void method3584(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static373.aBooleanArray10[arg0]) {
			Static186.aClass171_71.method4343(arg0);
			Static396.aClass156ArrayArray1[arg0] = null;
			Static520.aClass156ArrayArray2[arg0] = null;
			Static373.aBooleanArray10[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(III)Z")
	public static boolean method3585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static136.method2256(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | Static529.method7331(arg1, arg0) | Static85.method1465(arg0, arg1) ? true : (Static330.method5080(arg0, arg1) | (arg0 & 0x2000) != 0 | Static64.method1153(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V")
	public static void method3586(@OriginalArg(1) int arg0) {
		if (!Static544.aClass1_Sub22_Sub1_1.aBoolean390) {
			arg0 = -1;
		}
		if (Static433.anInt7523 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(33) Class192 local33 = Static420.aClass95_2.method2263(arg0);
			@Pc(37) Class136 local37 = local33.method4749();
			if (local37 == null) {
				arg0 = -1;
			} else {
				Static466.aClass102_4.method2384(local37.method3542(), local37.method3537(), local37.method3545(), Static105.aCanvas3, new Point(local33.anInt5543, local33.anInt5544));
				Static433.anInt7523 = arg0;
			}
		}
		if (arg0 == -1 && Static433.anInt7523 != -1) {
			Static466.aClass102_4.method2384(null, -1, -1, Static105.aCanvas3, new Point());
			Static433.anInt7523 = -1;
		}
	}
}
