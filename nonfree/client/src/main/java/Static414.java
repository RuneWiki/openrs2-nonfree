import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!od", name = "b", descriptor = "I")
	public static int anInt7227;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "[Lclient!vs;")
	public static Class379[] aClass379Array2;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([BIB)[B")
	public static byte[] method6211(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static679.method1563(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I")
	public static int method6213() {
		@Pc(7) int local7 = 0;
		@Pc(17) Field[] local17 = fs.class.getDeclaredFields();
		for (@Pc(26) int local26 = 0; local26 < local17.length; local26++) {
			@Pc(32) Field local32 = local17[local26];
			if (li.class.isAssignableFrom(local32.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}
}
