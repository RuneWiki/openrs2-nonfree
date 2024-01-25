import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "[I")
	public static int[] anIntArray595;

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame4;

	@OriginalMember(owner = "client!ia", name = "L", descriptor = "[[B")
	public static byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
	public static int anInt8804 = 0;

	@OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
	public static int anInt8805 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
	public static int method7268(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method7269(@OriginalArg(0) String arg0) {
		if (Class188.aString52.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class188.aString52.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class188.aString52.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)[Lclient!fn;")
	public static Class103[] method7270() {
		return new Class103[] { Static407.aClass103_19, Static287.aClass103_13, Static125.aClass103_6 };
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!lr;ZZIBILclient!lr;)I")
	public static int method7271(@OriginalArg(0) Class208_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class208_Sub1 arg5) {
		@Pc(15) int local15 = Static320.method4864(arg2, arg0, arg4, arg5);
		if (local15 != 0) {
			return arg2 ? -local15 : local15;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(36) int local36 = Static320.method4864(arg1, arg0, arg3, arg5);
			return arg1 ? -local36 : local36;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V")
	public static void method7272(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static24.aBooleanArray1[arg0]) {
			Static301.aClass111_70.method2460(arg0);
			Static249.aClass365ArrayArray3[arg0] = null;
			Static440.aClass365ArrayArray4[arg0] = null;
			Static24.aBooleanArray1[arg0] = false;
		}
	}
}
