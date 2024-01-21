import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "[I")
	public static int[] anIntArray130;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!ed;")
	private static Class23 aClass23_409 = Static169.method2903("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!ed;")
	public static Class23 aClass23_410 = aClass23_409;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "Lclient!ed;")
	private static Class23 aClass23_417 = Static169.method2903("Login limit exceeded)3");

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!ed;")
	public static Class23 aClass23_411 = aClass23_417;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Lclient!ed;")
	private static Class23 aClass23_416 = Static169.method2903("Loading sprites )2 ");

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Lclient!ed;")
	public static Class23 aClass23_412 = aClass23_416;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "Lclient!ed;")
	public static Class23 aClass23_413 = Static169.method2903("(Y");

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "Lclient!ed;")
	private static Class23 aClass23_414 = Static169.method2903("Login server offline)3");

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Lclient!ed;")
	public static Class23 aClass23_415 = aClass23_414;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "Lclient!ed;")
	public static Class23 aClass23_418 = Static169.method2903("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method668() {
		aClass23_418 = null;
		aClass23_412 = null;
		aShortArrayArray3 = null;
		anIntArray130 = null;
		aClass23_411 = null;
		aClass23_416 = null;
		aClass23_414 = null;
		aClass23_410 = null;
		aClass23_413 = null;
		aClass23_417 = null;
		aClass23_415 = null;
		aClass23_409 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(JI)V")
	public static void method669(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(9) InterruptedException local9) {
		}
	}
}
