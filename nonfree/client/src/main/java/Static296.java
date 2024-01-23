import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!cc;")
	public static Class26 aClass26_57 = new Class26(30);

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "[Lclient!ch;")
	public static Class30[] aClass30Array1 = new Class30[4];

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method4477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 + arg5 > arg6 && arg7 + arg6 > arg1) {
			return arg0 < arg2 + arg4 && arg4 < arg3 + arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	public static int method4478() {
		return Static216.anInt4215;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Z")
	public static boolean method4479() {
		try {
			return Static134.method3300();
		} catch (@Pc(16) IOException local16) {
			Static154.method2462();
			return true;
		} catch (@Pc(21) Exception local21) {
			@Pc(63) String local63 = "T2 - " + Static34.anInt552 + "," + Static113.anInt2273 + "," + Static63.anInt1231 + " - " + Static21.anInt1052 + "," + (Static220.anInt3983 + Static154.aClass53_Sub1_Sub1_2.anIntArray422[0]) + "," + (Static295.anInt5480 + Static154.aClass53_Sub1_Sub1_2.anIntArray426[0]) + " - ";
			for (@Pc(65) int local65 = 0; Static21.anInt1052 > local65 && local65 < 50; local65++) {
				local63 = local63 + Static189.aClass4_Sub10_Sub1_2.aByteArray71[local65] + ",";
			}
			Static193.method3072(local21, local63);
			Static115.method1819();
			return true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIIII)I")
	public static int method4480(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = arg2 & 0xF;
		@Pc(32) int local32 = local9 >= 4 ? (local9 == 12 || local9 == 14 ? arg1 : arg3) : arg0;
		@Pc(39) int local39 = local9 < 8 ? arg1 : arg0;
		return ((local9 & 0x2) == 0 ? local32 : -local32) + ((local9 & 0x1) == 0 ? local39 : -local39);
	}
}
