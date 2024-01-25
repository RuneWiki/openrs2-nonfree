import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!c", name = "q", descriptor = "I")
	public static int anInt7284;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public static int anInt7273 = 0;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray51 = new String[100];

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	public static int anInt7276 = 104;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	public static int anInt7278 = 1;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_108 = new Class217(28, 4);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public static void method5679() {
		Static46.aClass11_4.method312();
		Static74.aClass244_2.method5238();
		Static319.aClass244_4.method5238();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
	public static void method5688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7;
		if (Static406.anInt6694 != arg0) {
			Static86.anIntArray125 = new int[arg0];
			for (local7 = 0; local7 < arg0; local7++) {
				Static86.anIntArray125[local7] = (local7 << 12) / arg0;
			}
			Static12.anInt373 = arg0 * 32;
			Static5.anInt72 = arg0 - 1;
			Static406.anInt6694 = arg0;
		}
		if (arg1 == Static286.anInt1445) {
			return;
		}
		if (Static406.anInt6694 == arg1) {
			Static441.anIntArray522 = Static86.anIntArray125;
		} else {
			Static441.anIntArray522 = new int[arg1];
			for (local7 = 0; local7 < arg1; local7++) {
				Static441.anIntArray522[local7] = (local7 << 12) / arg1;
			}
		}
		Static286.anInt1445 = arg1;
		Static350.anInt3654 = arg1 - 1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)V")
	public static void method5694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static194.anInt3884 = arg0;
		Static202.anInt3951 = arg4;
		Static185.anInt3725 = arg3;
		Static20.anInt684 = arg1;
		Static348.anInt5916 = arg2;
		if (Static20.anInt684 >= 100) {
			@Pc(32) int local32 = Static348.anInt5916 * 128 + 64;
			@Pc(38) int local38 = Static202.anInt3951 * 128 + 64;
			@Pc(47) int local47 = Static231.method3482(Static6.anInt93, local32, local38) - Static185.anInt3725;
			@Pc(52) int local52 = local32 - Static276.anInt5105;
			@Pc(57) int local57 = local47 - Static439.anInt7400;
			@Pc(62) int local62 = local38 - Static265.anInt5008;
			@Pc(73) int local73 = (int) Math.sqrt((double) (local52 * local52 + local62 * local62));
			Static298.anInt5734 = (int) (Math.atan2((double) local57, (double) local73) * 2607.5945876176133D) & 0x3FFF;
			Static445.anInt7532 = (int) (-2607.5945876176133D * Math.atan2((double) local52, (double) local62)) & 0x3FFF;
			if (Static298.anInt5734 < 1024) {
				Static298.anInt5734 = 1024;
			}
			Static445.anInt7524 = 0;
			if (Static298.anInt5734 > 3072) {
				Static298.anInt5734 = 3072;
			}
		}
		Static161.anInt3316 = 2;
	}
}
