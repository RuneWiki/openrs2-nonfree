import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "Lclient!mfa;")
	public static Class211 aClass211_44;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_66 = new Class181(54, 7);

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "Z")
	public static boolean aBoolean438 = false;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
	public static int anInt5752 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!iaa;)Lclient!oq;")
	public static Class101_Sub2 method4919(@OriginalArg(1) Class6_Sub26 arg0) {
		@Pc(7) Class101 local7 = Static170.method3473(arg0);
		@Pc(16) int local16 = arg0.method5000();
		@Pc(20) int local20 = arg0.method5000();
		return new Class101_Sub2(local7.aClass148_10, local7.aClass49_11, local7.anInt9011, local7.anInt9013, local7.anInt9016, local7.anInt9009, local7.anInt9010, local16, local20);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IJ)V")
	public static void method4921(@OriginalArg(1) long arg0) {
		@Pc(11) int local11 = Static99.anInt2351;
		@Pc(19) int local19;
		@Pc(27) int local27;
		if (local11 != Static357.anInt6870) {
			local19 = local11 - Static357.anInt6870;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 > 0) {
				if (local27 == 0) {
					local27 = 1;
				} else if (local27 > local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = -1;
			} else if (local27 < local19) {
				local27 = local19;
			}
			Static357.anInt6870 += local27;
		}
		@Pc(72) int local72 = Static131.anInt2843;
		if (local72 != Static252.anInt5119) {
			local19 = local72 - Static252.anInt5119;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 > 0) {
				if (local27 == 0) {
					local27 = 1;
				} else if (local27 > local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = -1;
			} else if (local27 < local19) {
				local27 = local19;
			}
			Static252.anInt5119 += local27;
		}
		if (!Static104.aClass6_Sub6_Sub1_4.aBoolean137) {
			Static412.aFloat175 += (float) arg0 * Static471.aFloat184 / 40.0F * 8.0F;
			Static200.aFloat100 += (float) arg0 * Static342.aFloat131 / 40.0F * 8.0F;
		}
		Static562.method7979();
	}
}
