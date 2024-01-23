import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!md", name = "n", descriptor = "[I")
	public static int[] anIntArray300 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!md", name = "o", descriptor = "I")
	public static int anInt3290 = 0;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString108 = "Loaded wordpack";

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)Z")
	public static boolean method2835() {
		try {
			return Static222.method3593();
		} catch (@Pc(15) IOException local15) {
			Static269.method4149();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(63) String local63 = "T2 - " + Static126.anInt1523 + "," + Static129.anInt2551 + "," + Static130.anInt2575 + " - " + Static5.anInt204 + "," + (Static138.aClass11_Sub4_Sub1_3.anIntArray407[0] + Static38.anInt714) + "," + (Static135.anInt2659 + Static138.aClass11_Sub4_Sub1_3.anIntArray406[0]) + " - ";
			for (@Pc(65) int local65 = 0; local65 < Static5.anInt204 && local65 < 50; local65++) {
				local63 = local63 + Static10.aClass1_Sub13_Sub1_117.aByteArray63[local65] + ",";
			}
			Static6.method4140(local22, local63);
			Static218.method3536();
			return true;
		}
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
	public static void method2836() {
		if (!Static258.aBoolean463 && Static210.anInt4011 != 2) {
			try {
				Static320.method2266("tbrefresh", Static222.aClient1);
			} catch (@Pc(20) Throwable local20) {
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIILclient!km;IJZ)Z")
	public static boolean method2837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class11 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static282.method4274(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}
}
