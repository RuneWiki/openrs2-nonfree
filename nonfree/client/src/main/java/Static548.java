import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!si", name = "b", descriptor = "I")
	public static int anInt8426;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)[Lclient!tu;")
	public static Class356[] method7290() {
		return new Class356[] { Static403.aClass356_8, Static226.aClass356_6, Static73.aClass356_1 };
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II[BB)[B")
	public static byte[] method7291(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static685.method6464(arg1, arg0, local11, 0, 32768);
		return local11;
	}
}
