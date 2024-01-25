import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!rs", name = "I", descriptor = "I")
	public static int anInt7651;

	@OriginalMember(owner = "client!rs", name = "D", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_157 = new Class298(79, 3);

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
	public static void method6454() {
		Static478.aClient1.method1616();
		Static294.method4659();
		Static210.aClass272_125 = null;
		Static196.aClass272_118 = null;
		Static428.aClass272_46 = null;
		Static187.aClass3_Sub11_Sub1_1.anInt3520 = 0;
		Static20.anInt529 = 0;
		Static208.anInt4195 = 0;
		Static536.method7042();
		Static548.aString121 = null;
		Static590.anInt9377 = 0;
		Static355.anInt6147 = 0;
		Static419.aClass325Array5 = null;
		Static583.anInt9304 = 0;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([BILjava/io/File;B)V")
	public static void method6455(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg0, 0, arg1);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)V")
	public static void method6457() {
		@Pc(5) Class10 local5 = Static220.aClass10_20;
		synchronized (Static220.aClass10_20) {
			Static220.aClass10_20.method258(5);
		}
		local5 = Static391.aClass10_41;
		synchronized (Static391.aClass10_41) {
			Static391.aClass10_41.method258(5);
		}
	}
}
