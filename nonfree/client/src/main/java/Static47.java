import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public static int anInt762;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_20 = new Class208(36, -1);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;IB)I")
	public static int method608(@OriginalArg(0) String arg0) {
		return Static234.method4206(arg0, 16);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V")
	public static void method609(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub7_Sub2 local13 = Static328.method5290(10, arg0);
		local13.method1197();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I")
	public static int method610(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V")
	public static void method611(@OriginalArg(1) int arg0) {
		Static17.anIntArray51 = new int[arg0];
		Static230.anIntArray383 = new int[arg0];
		Static345.anIntArray541 = new int[arg0];
		Static172.anIntArray273 = new int[arg0];
		Static67.anIntArray112 = new int[arg0];
	}
}
