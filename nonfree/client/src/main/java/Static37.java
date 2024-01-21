import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!e", name = "o", descriptor = "Lclient!s;")
	public static Class2_Sub23 aClass2_Sub23_1;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Lclient!ah;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	public static int anInt932 = 0;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "[I")
	public static int[] anIntArray82 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!e", name = "d", descriptor = "I")
	public static int anInt934 = 0;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!lf;")
	public static Class49 aClass49_482 = Static32.method683("Lade Texturen )2 ");

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Lclient!rc;")
	public static Class74 aClass74_30 = new Class74(64);

	@OriginalMember(owner = "client!e", name = "n", descriptor = "I")
	public static int anInt941 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)V")
	public static void method758(@OriginalArg(1) boolean arg0) {
		if (Static175.aClass57_4 == null) {
			return;
		}
		try {
			@Pc(15) Class2_Sub13 local15 = new Class2_Sub13(4);
			local15.method2932(arg0 ? 2 : 3);
			local15.method2913(0);
			Static175.aClass57_4.method1885(4, local15.aByteArray49);
		} catch (@Pc(38) IOException local38) {
			try {
				Static175.aClass57_4.method1892();
			} catch (@Pc(43) Exception local43) {
			}
			Static175.aClass57_4 = null;
			Static69.anInt1423++;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method759() {
		for (@Pc(14) Class2_Sub2_Sub3_Sub3 local14 = (Class2_Sub2_Sub3_Sub3) Static21.aClass81_2.method2682(); local14 != null; local14 = (Class2_Sub2_Sub3_Sub3) Static21.aClass81_2.method2686()) {
			if (Static66.anInt1396 != local14.anInt1239 || local14.anInt1250 < Static127.anInt2757) {
				local14.method3007();
			} else if (Static127.anInt2757 >= local14.anInt1247) {
				if (local14.anInt1249 > 0) {
					@Pc(49) Class2_Sub2_Sub3_Sub7_Sub1 local49 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local14.anInt1249 - 1];
					if (local49 != null && local49.anInt3529 >= 0 && local49.anInt3529 < 13312 && local49.anInt3578 >= 0 && local49.anInt3578 < 13312) {
						local14.method982(Static127.anInt2757, local49.anInt3578, Static18.method346(local49.anInt3578, local14.anInt1239, local49.anInt3529) - local14.anInt1232, local49.anInt3529);
					}
				}
				if (local14.anInt1249 < 0) {
					@Pc(102) int local102 = -local14.anInt1249 - 1;
					@Pc(107) Class2_Sub2_Sub3_Sub7_Sub2 local107;
					if (local102 == Static54.anInt1191) {
						local107 = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1;
					} else {
						local107 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local102];
					}
					if (local107 != null && local107.anInt3529 >= 0 && local107.anInt3529 < 13312 && local107.anInt3578 >= 0 && local107.anInt3578 < 13312) {
						local14.method982(Static127.anInt2757, local107.anInt3578, Static18.method346(local107.anInt3578, local14.anInt1239, local107.anInt3529) - local14.anInt1232, local107.anInt3529);
					}
				}
				local14.method983(Static170.anInt3724);
				Static86.method2730(Static66.anInt1396, (int) local14.aDouble7, (int) local14.aDouble6, (int) local14.aDouble5, 60, local14, local14.anInt1238, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)Z")
	public static boolean method761(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method762() {
		aClass49_482 = null;
		anIntArray82 = null;
		aClass74_30 = null;
		aClass5_1 = null;
		aClass2_Sub23_1 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)Z")
	public static boolean method763(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}
}
