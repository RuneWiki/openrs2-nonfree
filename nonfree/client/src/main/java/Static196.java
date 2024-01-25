import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hfa", name = "w", descriptor = "I")
	public static int anInt9122;

	@OriginalMember(owner = "client!hfa", name = "x", descriptor = "I")
	public static int anInt9123;

	@OriginalMember(owner = "client!hfa", name = "C", descriptor = "F")
	public static float aFloat202;

	@OriginalMember(owner = "client!hfa", name = "z", descriptor = "I")
	public static int anInt9125 = -1;

	@OriginalMember(owner = "client!hfa", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString85 = "";

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!sp;IIIIII)V")
	public static void method7553(@OriginalArg(0) Class41_Sub2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static432.method6083(arg0.aByte117, arg1, arg0.anInt9444, arg3, arg0.anInt9442, arg2, 0);
	}

	@OriginalMember(owner = "client!hfa", name = "k", descriptor = "(I)Lclient!qs;")
	public static Class228 method7554() {
		try {
			return new Class228_Sub1();
		} catch (@Pc(16) Throwable local16) {
			try {
				return (Class228) Class.forName("Class228_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(22) Throwable local22) {
				return new Class228_Sub3();
			}
		}
	}
}
