import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gp", name = "N", descriptor = "[Lclient!kr;")
	public static Class20[] aClass20Array6;

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "Lclient!uf;")
	public static final Class334 aClass334_3 = new Class334();

	@OriginalMember(owner = "client!gp", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString46 = "";

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
	public static byte[] method3389(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg0;
			return arg1 ? Static74.method1385(local21) : local21;
		} else if (arg0 instanceof Class81) {
			@Pc(35) Class81 local35 = (Class81) arg0;
			return local35.method1784();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZILclient!dm;)V")
	public static void method3390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		if (arg2.aByte46 == 0) {
			arg2.anInt2005 = arg2.anInt2004;
		} else if (arg2.aByte46 == 1) {
			arg2.anInt2005 = arg2.anInt2004 + (arg1 - arg2.anInt1991) / 2;
		} else if (arg2.aByte46 == 2) {
			arg2.anInt2005 = arg1 - arg2.anInt2004 - arg2.anInt1991;
		} else if (arg2.aByte46 == 3) {
			arg2.anInt2005 = arg2.anInt2004 * arg1 >> 14;
		} else if (arg2.aByte46 == 4) {
			arg2.anInt2005 = (arg1 * arg2.anInt2004 >> 14) + (arg1 - arg2.anInt1991) / 2;
		} else {
			arg2.anInt2005 = arg1 - (arg2.anInt2004 * arg1 >> 14) - arg2.anInt1991;
		}
		if (arg2.aByte47 == 0) {
			arg2.anInt1928 = arg2.anInt1924;
		} else if (arg2.aByte47 == 1) {
			arg2.anInt1928 = (arg0 - arg2.anInt1964) / 2 + arg2.anInt1924;
		} else if (arg2.aByte47 == 2) {
			arg2.anInt1928 = arg0 - arg2.anInt1924 - arg2.anInt1964;
		} else if (arg2.aByte47 == 3) {
			arg2.anInt1928 = arg2.anInt1924 * arg0 >> 14;
		} else if (arg2.aByte47 == 4) {
			arg2.anInt1928 = (arg0 * arg2.anInt1924 >> 14) + (arg0 - arg2.anInt1964) / 2;
		} else {
			arg2.anInt1928 = arg0 - arg2.anInt1964 - (arg0 * arg2.anInt1924 >> 14);
		}
		if (!Static612.aBoolean735 || Static69.method1332(arg2).anInt7661 == 0 && arg2.anInt1955 != 0) {
			return;
		}
		if (arg2.anInt1928 < 0) {
			arg2.anInt1928 = 0;
		} else if (arg0 < arg2.anInt1964 + arg2.anInt1928) {
			arg2.anInt1928 = arg0 - arg2.anInt1964;
		}
		if (arg2.anInt2005 < 0) {
			arg2.anInt2005 = 0;
		} else if (arg2.anInt1991 + arg2.anInt2005 > arg1) {
			arg2.anInt2005 = arg1 - arg2.anInt1991;
			return;
		}
	}
}
