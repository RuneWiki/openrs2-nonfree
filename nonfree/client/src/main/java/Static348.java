import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
	public static int anInt6296;

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "Z")
	public static boolean aBoolean431 = false;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "Lclient!si;")
	public static final Class217 aClass217_34 = new Class217(4, 7);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZI)Z")
	public static boolean method4902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([BI)[B")
	public static byte[] method4903(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static457.method1215(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
