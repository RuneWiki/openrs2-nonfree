import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static473 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public static int anInt8327;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!ka;")
	public static Class3 aClass3_3;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "I")
	public static int anInt8332;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public static void method6556(@OriginalArg(0) int arg0) {
		if (Static76.method1083(arg0)) {
			Static350.method5309(Static360.aClass97ArrayArray2[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	public static void method6557() {
		if (Static154.aBoolean217) {
			return;
		}
		Static154.aBoolean217 = true;
		Static380.aBoolean478 = true;
		if (Static58.aClass6_Sub17_Sub1_1.aBoolean598) {
			Static532.aFloat185 = (int) Static532.aFloat185 - 17 & 0xFFFFFFF0;
		} else {
			Static256.aFloat120 += (-12.0F - Static256.aFloat120) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method6559(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(IB)Z")
	public static boolean method6560(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 4;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/net/Socket;IB)Lclient!hb;")
	public static Class1 method6561(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class1_Sub1(arg0, 7500);
	}
}
