import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!oca", name = "G", descriptor = "I")
	public static int anInt6216;

	@OriginalMember(owner = "client!oca", name = "N", descriptor = "F")
	public static float aFloat139;

	@OriginalMember(owner = "client!oca", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[100];

	@OriginalMember(owner = "client!oca", name = "E", descriptor = "I")
	public static int anInt6214 = 2;

	@OriginalMember(owner = "client!oca", name = "P", descriptor = "I")
	public static int anInt6223 = 0;

	@OriginalMember(owner = "client!oca", name = "R", descriptor = "I")
	public static int anInt6225 = 0;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "([BII)[B")
	public static byte[] method5288(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static585.method3080(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(BI)V")
	public static void method5289(@OriginalArg(1) int arg0) {
		Static387.anInt6906 = arg0;
		Static230.anInt3922 = -1;
		Static230.anInt3922 = -1;
		Static155.method2279();
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILclient!oa;II)V")
	public static void method5291(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(3) int arg2) {
		Static246.aClass121_7 = arg1;
		Static82.aClass171ArrayArray1 = new Class171[arg0][arg2];
		if (Static195.anIntArray389 != null) {
			Static443.aClass17_4 = Static188.method2785(Static195.anIntArray389[0], Static195.anIntArray389[5], Static195.anIntArray389[2], Static195.anIntArray389[1], Static195.anIntArray389[3], Static195.anIntArray389[4]);
		}
		Static295.aClass171_2 = new Class171();
		Static407.method5937();
	}
}
