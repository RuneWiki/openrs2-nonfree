import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString19 = "flash2:";

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "J")
	public static long aLong23 = 0L;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I[B)[B")
	public static byte[] method583(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static367.method4034(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!fb;)Lclient!qs;")
	public static Class3_Sub3 method584(@OriginalArg(1) Class3_Sub4 arg0) {
		arg0.method3643();
		@Pc(13) int local13 = arg0.method3643();
		@Pc(17) Class3_Sub3 local17 = Static40.method5456(local13);
		local17.anInt6851 = arg0.method3643();
		@Pc(26) int local26 = arg0.method3643();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method3643();
			local17.method5731(arg0, local34);
		}
		local17.method5730();
		return local17;
	}
}
