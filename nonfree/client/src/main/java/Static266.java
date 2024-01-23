import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!th;")
	public static Class168 aClass168_180;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "I")
	public static int anInt5320;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	public static int anInt5317 = 0;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!ci;")
	public static Class26 aClass26_51 = new Class26();

	@OriginalMember(owner = "client!te", name = "h", descriptor = "I")
	public static int anInt5321 = 0;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString380 = "cyan:";

	@OriginalMember(owner = "client!te", name = "m", descriptor = "I")
	public static int anInt5324 = 1;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!qm;B)Lclient!e;")
	public static Class31_Sub2 method4022(@OriginalArg(0) Class1_Sub14 arg0) {
		return new Class31_Sub2(arg0.method2248(), arg0.method2248(), arg0.method2248(), arg0.method2248(), arg0.method2215(), arg0.method2199());
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V")
	public static void method4023(@OriginalArg(1) boolean arg0) {
		Static150.anIntArray311 = new int[104];
		Static84.anIntArray201 = new int[5];
		Static193.anIntArray368 = new int[104];
		@Pc(12) byte local12;
		if (arg0) {
			local12 = 1;
		} else {
			local12 = 4;
		}
		Static170.aByteArrayArrayArray14 = new byte[local12][105][105];
		Static313.anIntArray567 = new int[104];
		Static43.aByteArrayArrayArray1 = new byte[local12][104][104];
		Static211.anIntArrayArrayArray9 = new int[local12][105][105];
		aByteArrayArrayArray16 = new byte[local12][104][104];
		Static120.anIntArray566 = new int[104];
		Static257.aByteArrayArrayArray15 = new byte[local12][104][104];
		Static75.anInt1755 = 99;
		Static111.aByteArrayArrayArray3 = new byte[local12][104][104];
		Static145.anIntArray540 = new int[104];
	}
}
