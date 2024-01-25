import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
	public static int anInt4810;

	@OriginalMember(owner = "client!kea", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!kea", name = "B", descriptor = "Lclient!tf;")
	public static Class322 aClass322_94;

	@OriginalMember(owner = "client!kea", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString32 = "";

	@OriginalMember(owner = "client!kea", name = "z", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_55 = new Class303(82, -1);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBIIIIII)V")
	public static void method4155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static469.anInt4270 <= arg1 && arg6 <= Static325.anInt5516 && arg3 >= Static395.anInt6904 && arg2 <= Static561.anInt2703) {
			Static436.method6105(arg5, arg2, arg6, arg4, arg0, arg3, arg1);
		} else {
			Static586.method1888(arg2, arg6, arg4, arg5, arg0, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!wp;IB)V")
	public static void method4158(@OriginalArg(0) int arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) int arg2) {
		Static479.aClass361_15 = arg1;
		Static491.anInt8009 = arg2;
		Static38.anInt726 = arg0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIII)V")
	public static void method4159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) float local9 = (float) Static44.anInt9269 / (float) Static44.anInt9261;
		@Pc(11) int local11 = arg0;
		@Pc(13) int local13 = arg2;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg0);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(40) int local40 = arg3 - (arg2 - local13) / 2;
		@Pc(49) int local49 = arg1 - (arg0 - local11) / 2;
		Static334.anInt5600 = Static44.anInt9269 - Static44.anInt9269 * local40 / local13;
		Static56.anInt1176 = Static44.anInt9261 * local49 / local11;
		Static406.anInt7005 = -1;
		Static455.anInt7670 = -1;
		Static109.method1915();
	}
}
