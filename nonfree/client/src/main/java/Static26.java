import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!au", name = "D", descriptor = "I")
	public static int anInt452;

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(II)I")
	public static int method459(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
	public static void method460() {
		if (Static67.aFileOutputStream1 != null) {
			try {
				Static67.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Static67.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!au", name = "d", descriptor = "(II)I")
	public static int method463(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
