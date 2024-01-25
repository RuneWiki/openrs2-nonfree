import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
	public static int anInt5067;

	@OriginalMember(owner = "client!ke", name = "S", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!ke", name = "O", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_74 = new Class218(79, -1);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/io/File;I[BI)V")
	public static void method4634(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(18) DataInputStream local18 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local18.readFully(arg2, 0, arg1);
		} catch (@Pc(25) EOFException local25) {
		}
		local18.close();
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
	public static void method4647() {
		Static440.aClass19_1.method2355();
		Static22.aClass16_2.method5886();
		Static200.aClient1.method1499();
		Static126.aCanvas6.setBackground(Color.black);
		Static203.anInt3983 = -1;
		Static440.aClass19_1 = Static67.method1351(Static126.aCanvas6);
		Static22.aClass16_2 = Static71.method1373(Static126.aCanvas6);
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
	public static void method4652() {
		Static160.aClass165_21.method4403();
	}
}
