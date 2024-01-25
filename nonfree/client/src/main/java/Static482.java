import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!ha;")
	public static Class84 aClass84_23;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!an;")
	public static Class16 aClass16_112;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString99 = null;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
	public static final int[] anIntArray652 = new int[32];

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	public static void method7215() {
		@Pc(5) Class125 local5 = Static156.aClass125_21;
		synchronized (Static156.aClass125_21) {
			Static156.aClass125_21.method3440();
		}
		local5 = Static268.aClass125_41;
		synchronized (Static268.aClass125_41) {
			Static268.aClass125_41.method3440();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLclient!be;)I")
	public static int method7217(@OriginalArg(1) Class30_Sub1_Sub1 arg0) {
		if (arg0.anInt4199 == 0) {
			return 0;
		}
		@Pc(67) int local67;
		@Pc(60) int local60;
		if (arg0.anInt4135 != -1) {
			@Pc(19) Class30_Sub1_Sub1 local19 = null;
			if (arg0.anInt4135 < 32768) {
				@Pc(33) Class12_Sub41 local33 = (Class12_Sub41) Static29.aClass68_7.method1917((long) arg0.anInt4135);
				if (local33 != null) {
					local19 = local33.aClass30_Sub1_Sub1_Sub2_2;
				}
			} else if (arg0.anInt4135 >= 32768) {
				local19 = Static90.aClass30_Sub1_Sub1_Sub1Array1[arg0.anInt4135 - 32768];
			}
			if (local19 != null) {
				local60 = arg0.anInt9418 - local19.anInt9418;
				local67 = arg0.anInt9416 - local19.anInt9416;
				if (local60 != 0 || local67 != 0) {
					arg0.method3601((int) (Math.atan2((double) local60, (double) local67) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class30_Sub1_Sub1_Sub1) {
			@Pc(93) Class30_Sub1_Sub1_Sub1 local93 = (Class30_Sub1_Sub1_Sub1) arg0;
			if (local93.anInt746 != -1 && (local93.anInt4201 == 0 || local93.anInt4202 > 0)) {
				local93.method3601(local93.anInt746);
				local93.anInt746 = -1;
			}
		} else if (arg0 instanceof Class30_Sub1_Sub1_Sub2) {
			@Pc(123) Class30_Sub1_Sub1_Sub2 local123 = (Class30_Sub1_Sub1_Sub2) arg0;
			if (local123.anInt4222 != -1 && (local123.anInt4201 == 0 || local123.anInt4202 > 0)) {
				local60 = local123.anInt9418 - (local123.anInt4222 - Static61.anInt1459 - Static61.anInt1459) * 64;
				local67 = local123.anInt9416 - (local123.anInt4210 - Static203.anInt4534 - Static203.anInt4534) * 64;
				if (local60 != 0 || local67 != 0) {
					local123.method3601((int) (Math.atan2((double) local60, (double) local67) * 2607.5945876176133D) & 0x3FFF);
				}
				local123.anInt4222 = -1;
			}
		}
		return arg0.method3588();
	}
}
