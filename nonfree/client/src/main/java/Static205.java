import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
	public static int anInt4555;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public static int anInt4557;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "Lclient!kea;")
	public static Class161 aClass161_46;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "S")
	public static short aShort72 = 32767;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_76 = new Class133(0, 8);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[B)[B")
	public static byte[] method3798(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static559.method5957(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
