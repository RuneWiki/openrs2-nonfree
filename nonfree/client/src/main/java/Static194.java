import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static194 {

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "[[B")
	public static final byte[][] aByteArrayArray6 = new byte[1000][];

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Z")
	public static boolean method3065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static20.method457(arg1, arg0)) {
			return (arg0 & 0xB000) != 0 | Static416.method6342(arg0, arg1) | Static364.method5693(arg0, arg1) ? true : (Static182.method2926(arg1, arg0) | Static122.method1834(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)V")
	public static void method3066(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static128.aBooleanArray12[arg0]) {
			Static42.aClass384_21.method8872(arg0);
			Static441.aClass357ArrayArray1[arg0] = null;
			Static591.aClass357ArrayArray2[arg0] = null;
			Static128.aBooleanArray12[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "(I)[Lclient!le;")
	public static Class204[] method3068() {
		return new Class204[] { Static239.aClass204_7, Static107.aClass204_1, Static435.aClass204_12 };
	}
}
