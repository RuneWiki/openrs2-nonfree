import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!te", name = "D", descriptor = "I")
	public static int anInt6110;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "[I")
	public static final int[] anIntArray470 = new int[25];

	@OriginalMember(owner = "client!te", name = "A", descriptor = "Lclient!oa;")
	public static final Class144 aClass144_9 = new Class144(64);

	@OriginalMember(owner = "client!te", name = "B", descriptor = "I")
	public static int anInt6109 = -1;

	@OriginalMember(owner = "client!te", name = "C", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_192 = new Class157(0, 0);

	@OriginalMember(owner = "client!te", name = "E", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_18 = new Class143(6, 6);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5147(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static369.method2582(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5149(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		Static300.method5057(Static75.aClass157_48);
		Static197.aClass2_Sub12_Sub2_2.method3147(Static217.method4134(arg1) + 1);
		Static197.aClass2_Sub12_Sub2_2.method3156(arg1);
		Static197.aClass2_Sub12_Sub2_2.method3141(arg0);
	}
}
