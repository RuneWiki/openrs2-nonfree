import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ad", name = "V", descriptor = "[I")
	public static int[] anIntArray16;

	@OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
	public static int anInt213;

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "Lclient!fo;")
	public static final Class91 aClass91_1 = new Class91(9, 14);

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_4 = new Class243(53, -1);

	@OriginalMember(owner = "client!ad", name = "U", descriptor = "Lclient!qc;")
	public static final Class231 aClass231_2 = new Class231(5);

	@OriginalMember(owner = "client!ad", name = "W", descriptor = "Lclient!pm;")
	public static final Class223 aClass223_1 = new Class223();

	@OriginalMember(owner = "client!ad", name = "Y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[200];

	@OriginalMember(owner = "client!ad", name = "Z", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_9 = new Class202("K", "T", "K", "K");

	@OriginalMember(owner = "client!ad", name = "ab", descriptor = "[I")
	public static final int[] anIntArray17 = new int[1000];

	@OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
	public static int anInt214 = 0;

	@OriginalMember(owner = "client!ad", name = "cb", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method372() {
		@Pc(14) int local14 = (int) ((double) Static363.anInt1158 * 34.46D);
		local14 <<= 0x0;
		if (Static103.aClass39_3.method6082()) {
			local14 += 128;
		}
		Static103.aClass39_3.ta(50, local14);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Z")
	public static boolean method373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static16.method470(arg0, arg1) || Static61.method1138(arg1, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIB)V")
	public static void method375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) float local9 = (float) Static201.anInt202 / (float) Static201.anInt201;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg3;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg1);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(44) int local44 = arg2 - (arg1 - local11) / 2;
		@Pc(53) int local53 = arg0 - (arg3 - local13) / 2;
		Static467.anInt8412 = -1;
		Static140.anInt2619 = Static201.anInt202 - local53 * Static201.anInt202 / local13;
		Static294.anInt5413 = -1;
		Static202.anInt3644 = Static201.anInt201 * local44 / local11;
		Static371.method5897();
	}
}
