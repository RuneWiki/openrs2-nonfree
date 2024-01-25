import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static175 {

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "[S")
	public static short[] aShortArray37 = new short[256];

	@OriginalMember(owner = "client!ih", name = "nc", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ih", name = "Gc", descriptor = "[I")
	public static final int[] anIntArray229 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!ih", name = "ld", descriptor = "I")
	public static int anInt3046 = 0;

	@OriginalMember(owner = "client!ih", name = "be", descriptor = "Lclient!am;")
	public static final Class14 aClass14_12 = new Class14();

	@OriginalMember(owner = "client!ih", name = "le", descriptor = "Z")
	public static boolean aBoolean286 = false;

	@OriginalMember(owner = "client!ih", name = "pe", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_43 = new Class142("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!ih", name = "qe", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_114 = new Class67(38, 9);

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)V")
	public static void method2501(@OriginalArg(1) int arg0) {
		if (Static191.anIntArray263 == null || Static191.anIntArray263.length < arg0) {
			Static191.anIntArray263 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZLclient!oi;ZII)V")
	public static void method2512(@OriginalArg(0) int arg0, @OriginalArg(2) Class185 arg1, @OriginalArg(4) int arg2) {
		Static270.anInt1979 = 1;
		Static318.anInt5262 = 0;
		Static353.anInt5706 = 10000;
		Static64.anInt996 = arg2;
		Static371.aClass185_97 = arg1;
		Static107.aBoolean183 = false;
		Static451.anInt7187 = arg0;
	}
}
