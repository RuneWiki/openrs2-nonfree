import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
	public static String method1749(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static532.method7364(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!wu;)V")
	public static void method1752(@OriginalArg(1) Class380 arg0) {
		Static313.aClass380_75 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method1753() {
		if (Static282.aFileOutputStream5 != null) {
			try {
				Static282.aFileOutputStream5.close();
			} catch (@Pc(13) IOException local13) {
			}
		}
		Static282.aFileOutputStream5 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(CB)I")
	public static int method1755(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class261.anIntArray494.length ? Class261.anIntArray494[arg0] : -1;
	}
}
