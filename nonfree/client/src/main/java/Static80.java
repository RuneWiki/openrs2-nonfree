import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "[I")
	public static int[] anIntArray140;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "[I")
	public static int[] anIntArray139 = new int[128];

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Lclient!vh;")
	public static Class187 aClass187_50 = new Class187(50);

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString97 = "red:";

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Lclient!ro;")
	public static Class157 method1561(@OriginalArg(1) int arg0) {
		@Pc(10) Class157 local10 = (Class157) Static32.aClass187_76.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(31) byte[] local31 = Static38.aClass121_88.method3115(Static207.method3316(arg0), Static138.method2399(arg0));
		local10 = new Class157();
		local10.anInt4523 = arg0;
		if (local31 != null) {
			local10.method3939(new Class1_Sub14(local31));
		}
		local10.method3940();
		Static32.aClass187_76.method4524((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BZ)V")
	public static void method1565(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static92.aBoolean375) {
			Static92.aBoolean375 = arg0;
			Static190.method3096();
		}
	}
}
