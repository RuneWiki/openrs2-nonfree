import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!eha", name = "x", descriptor = "[Lclient!hw;")
	public static Class153[] aClass153Array1;

	@OriginalMember(owner = "client!eha", name = "r", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!eha", name = "S", descriptor = "I")
	public static int anInt2734 = 0;

	@OriginalMember(owner = "client!eha", name = "Z", descriptor = "Z")
	public static boolean aBoolean210 = false;

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(I[BLjava/io/File;I)V")
	public static void method2275(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local14.readFully(arg0, 0, arg2);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(B)V")
	public static void method2279() {
		Static515.anInt8712 = (int) ((double) Static399.anInt7121 * 34.46D);
		Static496.anInt828 = 200;
		Static515.anInt8712 <<= 0x2;
		if (Static266.aClass82_8.method6120()) {
			Static515.anInt8712 += 512;
		}
		Static220.method3852(false);
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IB)I")
	public static int method2280(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static64.method1060(arg0);
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(Z)V")
	public static void method2281() {
		Static35.method497();
		Static80.aBoolean118 = false;
	}
}
