import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
	public static int anInt1963;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "Lclient!mfa;")
	public static final Class211 aClass211_20 = new Class211();

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!fo;[IB[III)Lclient!ufa;")
	public static Class19_Sub3 method1814(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg0.method5567(Static451.aClass333_14, Static336.aClass220_12)) {
			@Pc(21) int[] local21 = new int[arg4 * arg3];
			for (local23 = 0; local23 < arg4; local23++) {
				local33 = arg2[local23] + arg3 * local23;
				for (local35 = 0; local35 < arg1[local23]; local35++) {
					local21[local33++] = -16777216;
				}
			}
			return new Class19_Sub3(arg0, arg3, arg4, local21);
		}
		@Pc(65) byte[] local65 = new byte[arg3 * arg4];
		for (local23 = 0; local23 < arg4; local23++) {
			local33 = local23 * arg3 + arg2[local23];
			for (local35 = 0; local35 < arg1[local23]; local35++) {
				local65[local33++] = -1;
			}
		}
		return new Class19_Sub3(arg0, arg3, arg4, local65);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method1815(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
	public static void method1818() {
		if (Static325.anInt6149 == 9) {
			Static145.method2683(5);
		} else if (Static325.anInt6149 == 5 || Static325.anInt6149 == 6) {
			Static145.method2683(3);
		} else if (Static325.anInt6149 == 12) {
			Static145.method2683(3);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZI)Z")
	public static boolean method1821(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
