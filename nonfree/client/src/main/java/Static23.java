import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "[I")
	public static int[] anIntArray36;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_15 = new Class136(30, -1);

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z")
	public static boolean method487() {
		return Static571.anInt9391 != 0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
	public static void method489() {
		@Pc(1) Class293 local1 = Static15.aClass293_5;
		synchronized (Static15.aClass293_5) {
			Static15.aClass293_5.method6927();
		}
		local1 = Static214.aClass293_26;
		synchronized (Static214.aClass293_26) {
			Static214.aClass293_26.method6927();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;BZ)V")
	public static void method494(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2) {
		Static321.method4988();
		Static322.method4990();
		Static600.method8381();
		Static369.method5768(arg2, arg1, arg0);
		Static319.method4980();
		Static462.method6096(Static485.aClass126_17);
		Static526.method7539(Static485.aClass126_17);
		Static613.method8506(Static488.aClass384_112, Static485.aClass126_17);
		Static16.method435();
		Static231.method3612(Static184.aClass44Array8);
		Static101.method1476();
		Static246.method3759();
		if (Static469.anInt7883 == 3) {
			Static214.method3254(4);
		} else if (Static469.anInt7883 == 7) {
			Static214.method3254(8);
		} else if (Static469.anInt7883 == 10) {
			Static214.method3254(11);
		} else if (Static469.anInt7883 == 1 || Static469.anInt7883 == 2) {
			Static462.method6095();
		}
	}
}
