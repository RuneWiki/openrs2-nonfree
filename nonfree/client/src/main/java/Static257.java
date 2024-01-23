import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread2;

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "Lclient!db;")
	public static Class31 aClass31_39 = new Class31(64);

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "[I")
	public static int[] anIntArray605 = new int[5];

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "[Lclient!bk;")
	public static Class1_Sub2_Sub4[] aClass1_Sub2_Sub4Array2 = new Class1_Sub2_Sub4[14];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
	public static void method3983() {
		for (@Pc(6) Class1_Sub24 local6 = (Class1_Sub24) Static16.aClass69_2.method1636(); local6 != null; local6 = (Class1_Sub24) Static16.aClass69_2.method1631()) {
			if (local6.anInt4114 == -1) {
				local6.anInt4102 = 0;
				Static191.method2912(local6);
			} else {
				local6.method4534();
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!jj;)Lclient!dg;")
	public static Class35_Sub1 method3984(@OriginalArg(1) Class1_Sub18 arg0) {
		return new Class35_Sub1(arg0.method3064(), arg0.method3064(), arg0.method3064(), arg0.method3064(), arg0.method3109(), arg0.method3109(), arg0.method3122());
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
	public static void method3986(@OriginalArg(1) int arg0) {
		if (!Static273.aBoolean417) {
			arg0 = -1;
		}
		if (Static94.anInt1786 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(20) Class10 local20 = Static204.method3162(arg0);
			@Pc(24) Class1_Sub2_Sub2_Sub1 local24 = local20.method301();
			if (local24 == null) {
				arg0 = -1;
			} else {
				Static13.aClass84_3.method1961(local24.method3927(), local24.anInt5113, Static189.aCanvas1, local24.anInt5109, new Point(local20.anInt399, local20.anInt393));
				Static94.anInt1786 = arg0;
			}
		}
		if (arg0 == -1 && Static94.anInt1786 != -1) {
			Static13.aClass84_3.method1961(null, -1, Static189.aCanvas1, -1, new Point());
			Static94.anInt1786 = -1;
		}
	}
}
