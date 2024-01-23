import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!w", name = "q", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "[I")
	public static int[] anIntArray481 = new int[25];

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString191 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method4293(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < Static297.anInt5497; local12++) {
			if (arg0.equalsIgnoreCase(Static112.aStringArray18[local12])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)Z")
	public static boolean method4294() {
		try {
			return Static225.method3589();
		} catch (@Pc(14) IOException local14) {
			Static278.method4129();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(60) String local60 = "T2 - " + Static92.anInt1908 + "," + Static53.anInt1060 + "," + Static251.anInt4741 + " - " + Static131.anInt2781 + "," + (Static239.aClass12_Sub3_Sub2_2.anIntArray376[0] + Static170.anInt3385) + "," + (Static239.aClass12_Sub3_Sub2_2.anIntArray379[0] + Static239.anInt4613) + " - ";
			for (@Pc(62) int local62 = 0; local62 < Static131.anInt2781 && local62 < 50; local62++) {
				local60 = local60 + Static101.aClass4_Sub17_Sub1_4.aByteArray30[local62] + ",";
			}
			Static244.method3721(local60, local19);
			Static180.method2828();
			return true;
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public static void method4295() {
		anIntArray481 = null;
		aString191 = null;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)I")
	public static int method4296() {
		if (Static117.aBoolean172) {
			return 0;
		} else if (Static62.method957()) {
			return Static73.aBoolean106 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4297(@OriginalArg(0) String arg0) {
		if (Static192.aClass9_2 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < Static192.aClass9_2.anInt203; local18++) {
			if (Static141.method2287(arg0, Static83.method3365(Static192.aClass9_2.aStringArray2[local18], "<br>", " "))) {
				return local18;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 >= Static211.anInt4200 && arg8 <= Static154.anInt3126 && Static211.anInt4200 <= arg1 && Static154.anInt3126 >= arg1 && arg3 >= Static211.anInt4200 && arg3 <= Static154.anInt3126 && arg6 >= Static211.anInt4200 && Static154.anInt3126 >= arg6 && Static171.anInt3392 <= arg4 && Static141.anInt2889 >= arg4 && Static171.anInt3392 <= arg2 && Static141.anInt2889 >= arg2 && arg5 >= Static171.anInt3392 && Static141.anInt2889 >= arg5 && Static171.anInt3392 <= arg7 && Static141.anInt2889 >= arg7) {
			Static1.method2(arg0, arg8, arg1, arg6, arg7, arg2, arg5, arg4, arg3);
		} else {
			Static77.method1193(arg1, arg5, arg8, arg0, arg3, arg2, arg6, arg7, arg4);
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	public static void method4299() {
		Static256.aClass33_37.method839();
	}
}
