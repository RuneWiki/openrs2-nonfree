import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
	public static int anInt4237 = 0;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
	public static int anInt4240 = 0;

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
	public static int anInt4241 = 0;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	public static void method3771() {
		Static93.aClass27_10 = null;
		Static278.anInt5164 = -1;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)Lclient!vm;")
	public static Class139 method3772() {
		try {
			return new Class139_Sub1();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class139) Class.forName("Class139_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class139_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BLclient!g;Lclient!g;)I")
	public static int method3773(@OriginalArg(1) Class83 arg0, @OriginalArg(2) Class83 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1958(Static47.anInt762)) {
			local5++;
		}
		if (arg0.method1958(Static107.anInt2387)) {
			local5++;
		}
		if (arg0.method1958(Static291.anInt5451)) {
			local5++;
		}
		if (arg1.method1958(Static47.anInt762)) {
			local5++;
		}
		if (arg1.method1958(Static107.anInt2387)) {
			local5++;
		}
		if (arg1.method1958(Static291.anInt5451)) {
			local5++;
		}
		return local5;
	}
}
