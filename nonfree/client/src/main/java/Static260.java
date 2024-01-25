import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "[Lclient!ig;")
	public static Class12[] aClass12Array14;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_39 = new Class220(20);

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "[I")
	public static final int[] anIntArray398 = new int[5];

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "J")
	public static long aLong141 = 0L;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)I")
	public static int method4006(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
	public static void method4007(@OriginalArg(0) int arg0) {
		if (Static54.anInt1123 == arg0) {
			return;
		}
		if (Static54.anInt1123 == 0) {
			Static318.method4506();
		}
		if (arg0 == 40) {
			Static420.method5694();
		}
		if (arg0 != 40 && Static419.aClass30_4 != null) {
			Static419.aClass30_4.method741();
			Static419.aClass30_4 = null;
		}
		if (Static54.anInt1123 == 25 || Static54.anInt1123 == 28) {
			Static435.aClass158_94.anInt4036 = 2;
			Static250.aClass158_58.anInt4036 = 2;
			Static312.aClass158_68.anInt4036 = 2;
			Static129.aClass158_29.anInt4036 = 2;
			Static85.aClass158_22.anInt4036 = 2;
			Static197.aClass158_42.anInt4036 = 2;
			Static20.aClass158_6.anInt4036 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static102.anInt4995 = 0;
			Static210.anInt3657 = 1;
			Static306.anInt3571 = 0;
			Static371.anInt6173 = 0;
			Static41.anInt900 = 1;
			Static22.method312(true);
			Static435.aClass158_94.anInt4036 = 1;
			Static250.aClass158_58.anInt4036 = 1;
			Static312.aClass158_68.anInt4036 = 1;
			Static129.aClass158_29.anInt4036 = 1;
			Static85.aClass158_22.anInt4036 = 1;
			Static197.aClass158_42.anInt4036 = 1;
			Static20.aClass158_6.anInt4036 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static265.method4067();
		}
		if (arg0 == 5) {
			Static446.method5953(Static76.aClass158_17, Static44.aClass28_14);
		} else {
			Static275.method4183();
		}
		@Pc(141) boolean local141 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(154) boolean local154 = Static54.anInt1123 == 5 || Static54.anInt1123 == 10 || Static54.anInt1123 == 28;
		if (local154 != local141) {
			if (local141) {
				Static75.anInt1505 = Static144.anInt2631;
				if (Static8.aClass173_Sub1_1.anInt4414 == 0) {
					Static258.method3972();
				} else {
					Static305.method4409(Static144.anInt2631, Static8.aClass173_Sub1_1.anInt4414, Static280.aClass158_63);
				}
				Static376.aClass179_3.method4140(false);
			} else {
				Static258.method3972();
				Static376.aClass179_3.method4140(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static44.aClass28_14.method3497();
		}
		Static54.anInt1123 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!hf;ZZLjava/lang/String;I)V")
	public static void method4008(@OriginalArg(0) Class103 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		if (!arg1) {
			Static181.method2815(arg3, arg0, 3);
			return;
		}
		@Pc(16) String local16;
		if (Static143.aString25.startsWith("win") && Static143.anInt2575 != 3) {
			local16 = null;
			if (arg0.anApplet1 != null) {
				local16 = arg0.anApplet1.getParameter("haveie6");
			}
			if (local16 == null || !local16.equals("1")) {
				@Pc(36) Class249 local36 = Static181.method2815(arg3, arg0, 0);
				Static5.aString1 = arg3;
				Static349.aClass249_7 = local36;
				Static159.aClass103_2 = arg0;
				return;
			}
		}
		if (Static143.aString25.startsWith("mac")) {
			local16 = null;
			if (arg0.anApplet1 != null) {
				local16 = arg0.anApplet1.getParameter("havefirefox");
			}
			if (local16 != null && local16.equals("1") && arg2) {
				Static181.method2815(arg3, arg0, 1);
				return;
			}
		}
		Static181.method2815(arg3, arg0, 2);
	}
}
