import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_22 = new Class287(25, 3);

	@OriginalMember(owner = "client!bt", name = "O", descriptor = "Z")
	public static boolean aBoolean109 = false;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIB)Z")
	public static boolean method1223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static49.method1210(arg0, arg1) || Static71.method1725(arg0, arg1);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)V")
	public static void method1226(@OriginalArg(0) int arg0) {
		Static198.anInt4276 = arg0;
		Static32.aClass342_54.method7693();
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)V")
	public static void method1227() {
		Static449.aClass251ArrayArray1 = new Class251[Static117.aClass284_36.method6322()][];
		Static516.aClass251ArrayArray2 = new Class251[Static117.aClass284_36.method6322()][];
		Static121.aBooleanArray7 = new boolean[Static117.aClass284_36.method6322()];
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)V")
	public static void method1231() {
		Static314.anInt5779 = -1;
		Static403.anInt7291 = 1;
		if (Static148.aString76 == null) {
			Static483.method6567(35);
		} else {
			@Pc(20) Class3_Sub26 local20 = new Class3_Sub26(Static522.method7234(Static399.method5602(Static148.aString76)));
			@Pc(24) long local24 = local20.method6813();
			Static284.aLong140 = local20.method6813();
			Static81.method1893("", true, Static517.method6954(local24));
		}
	}
}
