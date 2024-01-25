import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static384 {

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "[Lclient!wt;")
	public static Class324[] aClass324Array1;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_124 = new Class133(45, 6);

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "[[B")
	public static final byte[][] aByteArrayArray22 = new byte[50][];

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_125 = new Class133(23, 6);

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
