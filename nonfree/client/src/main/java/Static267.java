import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "Lclient!jg;")
	public static Class79 aClass79_4;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray15 = new byte[1000][];

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
	public static int anInt3572 = -1;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
	public static int[] anIntArray300 = new int[100];

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
	public static int anInt3573 = 0;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!oe;")
	public static Class119 method2843(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class119_Sub2");
			@Pc(10) Class119 local10 = (Class119) local6.getDeclaredConstructor().newInstance();
			local10.method3927(arg2, arg0, arg1);
			return local10;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class119_Sub1 local29 = new Class119_Sub1();
			local29.method3927(arg2, arg0, arg1);
			return local29;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	public static void method2845() {
		Class3.aLongArray8 = null;
		aClass79_4 = null;
		anIntArrayArray28 = null;
		aByteArrayArray15 = null;
		anIntArray300 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)I")
	public static int method2846(@OriginalArg(0) int arg0) {
		if (Static259.aClass158_3 != null) {
			Static259.aClass158_3.method3779();
			Static259.aClass158_3 = null;
		}
		Static263.anInt906++;
		if (Static263.anInt906 > 4) {
			Static134.anInt2799 = 0;
			Static263.anInt906 = 0;
			return arg0;
		}
		if (Static90.anInt1866 == Static173.anInt3426) {
			Static90.anInt1866 = Static28.anInt524;
		} else {
			Static90.anInt1866 = Static173.anInt3426;
		}
		Static134.anInt2799 = 0;
		return -1;
	}
}
