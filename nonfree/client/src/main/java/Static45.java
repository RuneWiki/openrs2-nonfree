import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!br", name = "E", descriptor = "I")
	public static int anInt1056;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)V")
	public static void method1073(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static560.anInt9247 = 1;
		Static193.anInt9352 = -1;
		Static17.method406(arg1, arg0, false);
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method1075(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static362.anInt6352; local11++) {
			if (arg0.equalsIgnoreCase(Static227.aStringArray11[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static120.aStringArray6[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IILjava/io/File;[B)V")
	public static void method1076(@OriginalArg(0) int arg0, @OriginalArg(2) File arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local14.readFully(arg2, 0, arg0);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}
}
