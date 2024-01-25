import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!br", name = "a", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_43 = new Class137(73, 7);

	@OriginalMember(owner = "client!br", name = "f", descriptor = "I")
	public static int anInt708 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public static void method611() {
		Static149.aClass167_100.method3389();
		Static325.aClass167_75.method3389();
		Static329.aClass167_76.method3389();
		Static416.aClass167_94.method3389();
		Static239.aClass167_61.method3389();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method612(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static328.method4200(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(Z)V")
	public static void method613() {
		if (Static144.anInt2432 == 0) {
			return;
		}
		try {
			if (++Static291.anInt4798 > 1500) {
				if (Static48.aClass3_2 != null) {
					Static48.aClass3_2.method63();
					Static48.aClass3_2 = null;
				}
				if (Static218.anInt5614 >= 1) {
					Static144.anInt2432 = 0;
					Static418.anInt6790 = -5;
					return;
				}
				Static291.anInt4798 = 0;
				if (Static25.anInt542 == Static195.anInt3133) {
					Static195.anInt3133 = Static288.anInt4735;
				} else {
					Static195.anInt3133 = Static25.anInt542;
				}
				Static144.anInt2432 = 1;
				Static218.anInt5614++;
			}
			if (Static144.anInt2432 == 1) {
				Static289.aClass215_8 = Static41.aClass124_2.method2532(Static428.aString65, Static195.anInt3133);
				Static144.anInt2432 = 2;
			}
			@Pc(120) int local120;
			if (Static144.anInt2432 == 2) {
				if (Static289.aClass215_8.anInt5791 == 2) {
					throw new IOException();
				}
				if (Static289.aClass215_8.anInt5791 != 1) {
					return;
				}
				Static48.aClass3_2 = new Class3((Socket) Static289.aClass215_8.anObject10, Static41.aClass124_2);
				Static289.aClass215_8 = null;
				Static48.aClass3_2.method62(Static75.aClass1_Sub11_Sub1_1.anInt5766, Static75.aClass1_Sub11_Sub1_1.aByteArray64);
				Static218.method4377();
				local120 = Static48.aClass3_2.method57();
				Static218.method4377();
				if (local120 != 101) {
					Static418.anInt6790 = local120;
					Static144.anInt2432 = 0;
					Static48.aClass3_2.method63();
					Static48.aClass3_2 = null;
					return;
				}
				Static144.anInt2432 = 3;
			}
			if (Static144.anInt2432 == 3 && Static48.aClass3_2.method61() >= 2) {
				local120 = Static48.aClass3_2.method57() << 8 | Static48.aClass3_2.method57();
				Static240.method3132(local120);
				if (Static62.anInt1112 == -1) {
					Static418.anInt6790 = 6;
					Static144.anInt2432 = 0;
					Static48.aClass3_2.method63();
					Static48.aClass3_2 = null;
				} else {
					Static144.anInt2432 = 0;
					Static48.aClass3_2.method63();
					Static48.aClass3_2 = null;
					Static17.method269();
				}
			}
		} catch (@Pc(195) IOException local195) {
			if (Static48.aClass3_2 != null) {
				Static48.aClass3_2.method63();
				Static48.aClass3_2 = null;
			}
			if (Static218.anInt5614 >= 1) {
				Static144.anInt2432 = 0;
				Static418.anInt6790 = -4;
			} else {
				Static291.anInt4798 = 0;
				if (Static195.anInt3133 == Static25.anInt542) {
					Static195.anInt3133 = Static288.anInt4735;
				} else {
					Static195.anInt3133 = Static25.anInt542;
				}
				Static144.anInt2432 = 1;
				Static218.anInt5614++;
			}
		}
	}
}
