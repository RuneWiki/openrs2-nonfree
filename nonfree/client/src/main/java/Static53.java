import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
	public static int anInt1130;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_15 = new Class93("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "[I")
	public static final int[] anIntArray97 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "Lclient!se;")
	public static final Class179 aClass179_2 = new Class179(64);

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
	public static int anInt1131 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;JIIB)V")
	public static void method1208(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static29.aBoolean66 && Static117.anInt2590 < 500) {
			@Pc(18) int local18 = arg2 == -1 ? Static256.anInt5081 : arg2;
			@Pc(41) Class2_Sub13 local41 = new Class2_Sub13(arg3, arg1, local18, arg6, arg4, arg0, arg5);
			Static91.aClass216_22.method5995(local41);
			Static117.anInt2590++;
		}
	}
}
