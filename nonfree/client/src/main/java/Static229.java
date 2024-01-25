import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([BI)[B")
	public static byte[] method3608(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = new byte[arg0.length];
			Static553.method3373(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BI)V")
	public static void method3611(@OriginalArg(1) int arg0) {
		if (!Static106.method1964(arg0)) {
			return;
		}
		@Pc(19) Class310[] local19 = Static235.aClass310ArrayArray2[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class310 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt9162 = 0;
				local27.anInt9146 = 1;
				local27.anInt9196 = 0;
			}
		}
	}
}
