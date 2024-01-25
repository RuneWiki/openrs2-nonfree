import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!gi", name = "T", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_67 = new Class208(21, 2);

	@OriginalMember(owner = "client!gi", name = "X", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)Lclient!ff;")
	public static Class2_Sub7_Sub4 method2078(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub7_Sub4 local10 = (Class2_Sub7_Sub4) Static246.aClass105_5.method2632((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = Static300.aClass83_107.method1968(arg0, 1);
		} else {
			local27 = Static36.aClass83_55.method1968(arg0 & 0x7FFF, 1);
		}
		local10 = new Class2_Sub7_Sub4();
		if (local27 != null) {
			local10.method1715(new Class2_Sub24(local27));
		}
		if (arg0 >= 32768) {
			local10.method1714();
		}
		Static246.aClass105_5.method2630(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZC)C")
	public static char method2079(@OriginalArg(1) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}
}
