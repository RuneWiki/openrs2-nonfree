import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	public static int anInt2190;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Lclient!gf;")
	public static final Class91 aClass91_5 = new Class91("", 11);

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
	public static int anInt2192 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	public static int method2036() {
		return 16;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZI)Z")
	public static boolean method2037(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public static void method2038(@OriginalArg(1) int arg0) {
		Static66.anInt1152 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([BII)[B")
	public static byte[] method2039(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static472.method5022(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Z")
	public static boolean method2041(@OriginalArg(1) int arg0) {
		return arg0 == 59 || arg0 == 13 || arg0 == 1012 || arg0 == 5 || arg0 == 8;
	}
}
