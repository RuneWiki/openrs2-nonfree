import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "[I")
	public static int[] anIntArray41;

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
	public static int anInt487;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V")
	public static void method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class1_Sub1_Sub2 local11 = Static46.method824(1, arg0);
		local11.method294();
		local11.anInt293 = arg1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V")
	public static void method467() {
		Static282.aClass169_150.method4020(5);
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Lclient!ai;")
	public static Class9 method468() {
		try {
			return (Class9) Class.forName("Class9_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V")
	public static void method470(@OriginalArg(0) int arg0) {
		Static314.anInt5911 = 100;
		Static283.anInt5402 = -1;
		Static299.anInt5666 = arg0;
		Static137.anInt2704 = 3;
	}
}
