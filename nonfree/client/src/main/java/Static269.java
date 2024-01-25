import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!kea", name = "x", descriptor = "J")
	public static long aLong161 = 0L;

	@OriginalMember(owner = "client!kea", name = "C", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_67 = new Class276(87, -1);

	@OriginalMember(owner = "client!kea", name = "F", descriptor = "[Lclient!bd;")
	public static Class27[] aClass27Array1 = null;

	@OriginalMember(owner = "client!kea", name = "I", descriptor = "I")
	public static int anInt5720 = 0;

	@OriginalMember(owner = "client!kea", name = "N", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("8a2d948f60ab6ea9e779ef9cdfd2fa8facf01058d5b379d6cde370febb89e3b02024103832907b2b7e37dd969e5ed33a38b10a74601e172910578f1239db1f69", 16);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method4714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg6 < 0 || Static460.anInt8640 - 1 <= arg0 || arg6 >= Static292.anInt7682 - 1) {
			return;
		}
		if (Static580.aClass125ArrayArrayArray3 == null) {
			return;
		}
		@Pc(40) Interface22 local40;
		if (arg5 == 0) {
			local40 = (Interface22) Static496.method7511(arg1, arg0, arg6);
			@Pc(46) Interface22 local46 = (Interface22) Static404.method6578(arg1, arg0, arg6);
			if (local40 != null && arg2 != 2) {
				if (local40 instanceof Class2_Sub4_Sub1) {
					((Class2_Sub4_Sub1) local40).aClass210_3.method5519(arg4);
				} else {
					Static105.method2237(arg5, arg3, local40.method8398(), arg4, arg6, arg2, arg0, arg1);
				}
			}
			if (local46 != null) {
				if (!(local46 instanceof Class2_Sub4_Sub1)) {
					Static105.method2237(arg5, arg3, local46.method8398(), arg4, arg6, arg2, arg0, arg1);
					return;
				}
				((Class2_Sub4_Sub1) local46).aClass210_3.method5519(arg4);
				return;
			}
			return;
		}
		if (arg5 != 1) {
			if (arg5 == 2) {
				local40 = (Interface22) Static200.method3364(arg1, arg0, arg6, ut.class);
				if (local40 != null) {
					if (arg2 == 11) {
						arg2 = 10;
					}
					if (!(local40 instanceof Class2_Sub2_Sub2)) {
						Static105.method2237(arg5, arg3, local40.method8398(), arg4, arg6, arg2, arg0, arg1);
						return;
					}
					((Class2_Sub2_Sub2) local40).aClass210_2.method5519(arg4);
					return;
				}
			} else if (arg5 == 3) {
				local40 = (Interface22) Static86.method1922(arg1, arg0, arg6);
				if (local40 == null) {
					return;
				}
				if (local40 instanceof Class2_Sub1_Sub2) {
					((Class2_Sub1_Sub2) local40).aClass210_1.method5519(arg4);
					return;
				}
				Static105.method2237(arg5, arg3, local40.method8398(), arg4, arg6, arg2, arg0, arg1);
			} else {
				return;
			}
			return;
		}
		local40 = (Interface22) Static563.method8123(arg1, arg0, arg6);
		if (local40 == null) {
			return;
		}
		if (local40 instanceof Class2_Sub3_Sub3) {
			((Class2_Sub3_Sub3) local40).aClass210_4.method5519(arg4);
			return;
		}
		@Pc(210) int local210 = local40.method8398();
		if (arg2 == 4 || arg2 == 5) {
			Static105.method2237(arg5, arg3, local210, arg4, arg6, 4, arg0, arg1);
			return;
		}
		if (arg2 == 6) {
			Static105.method2237(arg5, arg3 + 4, local210, arg4, arg6, 4, arg0, arg1);
		} else if (arg2 == 7) {
			Static105.method2237(arg5, (arg3 + 2 & 0x3) + 4, local210, arg4, arg6, 4, arg0, arg1);
			return;
		} else if (arg2 == 8) {
			Static105.method2237(arg5, arg3 + 4, local210, arg4, arg6, 4, arg0, arg1);
			Static105.method2237(arg5, (arg3 + 2 & 0x3) + 4, local210, arg4, arg6, 4, arg0, arg1);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public static String method4715() {
		@Pc(10) String local10 = "www";
		if (Static51.aClass109_2 == Static366.aClass109_5) {
			local10 = "www-wtrc";
		} else if (Static1.aClass109_1 == Static51.aClass109_2) {
			local10 = "www-wtqa";
		} else if (Static51.aClass109_2 == Static478.aClass109_6) {
			local10 = "www-wtwip";
		}
		@Pc(29) String local29 = "";
		if (Static64.aString16 != null) {
			local29 = "/p=" + Static64.aString16;
		}
		return "http://" + local10 + "." + Static581.aClass335_4.aString129 + ".com/l=" + Static126.anInt2904 + "/a=" + Static32.anInt2893 + local29 + "/";
	}
}
