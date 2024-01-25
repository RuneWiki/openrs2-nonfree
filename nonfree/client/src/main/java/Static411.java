import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
	public static int anInt6846 = 0;

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "[I")
	public static final int[] anIntArray583 = new int[50];

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
	public static int anInt6851 = 0;

	@OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
	public static int anInt6852 = 0;

	@OriginalMember(owner = "client!uv", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[100];

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
	public static void method5406(@OriginalArg(0) int arg0) {
		if (Static237.anInt4548 == 0) {
			Static335.aClass2_Sub3_Sub4_2.method4648(arg0);
		} else {
			Static237.anInt4547 = arg0;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B[B)[B")
	public static byte[] method5409(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static457.method683(arg0, 0, local14, 0, local6);
		return local14;
	}
}
