import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!wp", name = "J", descriptor = "I")
	public static int anInt6599;

	@OriginalMember(owner = "client!wp", name = "L", descriptor = "I")
	public static int anInt6601;

	@OriginalMember(owner = "client!wp", name = "Q", descriptor = "Lclient!vr;")
	public static Class112 aClass112_5;

	@OriginalMember(owner = "client!wp", name = "X", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!wp", name = "M", descriptor = "I")
	public static int anInt6602 = 0;

	@OriginalMember(owner = "client!wp", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString381 = "M";

	@OriginalMember(owner = "client!wp", name = "T", descriptor = "Z")
	public static boolean aBoolean489 = false;

	@OriginalMember(owner = "client!wp", name = "U", descriptor = "Lclient!wf;")
	public static final Class215 aClass215_11 = new Class215(64);

	@OriginalMember(owner = "client!wp", name = "W", descriptor = "[I")
	public static final int[] anIntArray564 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!wp", name = "Y", descriptor = "I")
	public static int anInt6608 = -1;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BJ)V")
	public static void method5823(@OriginalArg(1) long arg0) {
		@Pc(12) int local12 = Static159.anInt3220;
		@Pc(14) int local14 = Static130.anInt2662;
		@Pc(21) int local21;
		@Pc(29) int local29;
		if (Static259.anInt3210 != local12) {
			local21 = local12 - Static259.anInt3210;
			local29 = (int) ((long) local21 * arg0 / 320L);
			if (local21 > 0) {
				if (local29 == 0) {
					local29 = 1;
				} else if (local29 > local21) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = -1;
			} else if (local21 > local29) {
				local29 = local21;
			}
			Static259.anInt3210 += local29;
		}
		if (!Static139.aBoolean462) {
			Static155.aFloat64 += Static183.aFloat46 * (float) arg0 / 40.0F * 8.0F;
			Static5.aFloat2 += (float) arg0 * Static230.aFloat69 / 40.0F * 8.0F;
		}
		if (local14 != Static64.anInt1546) {
			local21 = local14 - Static64.anInt1546;
			local29 = (int) ((long) local21 * arg0 / 320L);
			if (local21 <= 0) {
				if (local29 == 0) {
					local29 = -1;
				} else if (local21 > local29) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = 1;
			} else if (local29 > local21) {
				local29 = local21;
			}
			Static64.anInt1546 += local29;
		}
		Static65.method1806();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5824(@OriginalArg(1) String arg0) {
		if (Static32.aClass205Array1 != null) {
			Static335.aClass5_Sub1_Sub1_3.method174(222);
			Static335.aClass5_Sub1_Sub1_3.method1886(Static344.method954(arg0));
			Static335.aClass5_Sub1_Sub1_3.method1849(arg0);
		}
	}

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "(I)V")
	public static void method5825() {
		Static27.anInt5324 = 0;
		Static60.aClass211_4.method5600();
		Static188.aBoolean264 = false;
	}
}
