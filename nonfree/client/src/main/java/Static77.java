import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "I")
	public static int anInt1912;

	@OriginalMember(owner = "client!cv", name = "H", descriptor = "F")
	public static float aFloat45;

	@OriginalMember(owner = "client!cv", name = "E", descriptor = "I")
	public static int anInt1917 = 0;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
	public static void method1702(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static573.method8082(arg1, arg0, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1704(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static298.method4854(Static128.aClass181_33);
			Static547.aClass6_Sub26_Sub2_2.method4950(Static392.method6180(arg0), -81849);
			Static547.aClass6_Sub26_Sub2_2.method4998(arg0);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/io/File;II[B)V")
	public static void method1705(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(18) DataInputStream local18 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local18.readFully(arg2, 0, arg1);
		} catch (@Pc(25) EOFException local25) {
		}
		local18.close();
	}
}
