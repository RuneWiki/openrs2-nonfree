import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "Lclient!sg;")
	public static Class54 aClass54_4;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_61 = new Class109(64);

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
	public static int anInt6605 = 0;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "Lclient!vg;")
	public static Class201 aClass201_13 = null;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	public static void method5875() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local16.invoke(local24, (Object[]) null);
					Static26.anInt514 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIII)V")
	public static void method5876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static120.anInt2266 = arg2;
		Static103.anInt5457 = arg4;
		Static323.anInt6231 = arg0;
		Static350.anInt6717 = arg1;
		Static30.anInt601 = arg3;
		if (Static350.anInt6717 >= 100) {
			@Pc(27) int local27 = Static103.anInt5457 * 128 + 64;
			@Pc(33) int local33 = Static120.anInt2266 * 128 + 64;
			@Pc(41) int local41 = Static208.method3804(Static239.anInt4811, local27, local33) - Static323.anInt6231;
			@Pc(45) int local45 = local27 - Static271.anInt5301;
			@Pc(50) int local50 = local41 - Static102.anInt1934;
			@Pc(55) int local55 = local33 - Static21.anInt466;
			@Pc(66) int local66 = (int) Math.sqrt((double) (local55 * local55 + local45 * local45));
			Static42.anInt731 = (int) (Math.atan2((double) local50, (double) local66) * 2607.5945876176133D) & 0x3FFF;
			Static258.anInt5088 = (int) (-2607.5945876176133D * Math.atan2((double) local45, (double) local55)) & 0x3FFF;
			if (Static42.anInt731 < 1024) {
				Static42.anInt731 = 1024;
			}
			Static304.anInt5915 = 0;
			if (Static42.anInt731 > 3072) {
				Static42.anInt731 = 3072;
			}
		}
		Static53.anInt992 = 2;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ti;BI)Lclient!ha;")
	public static Class84 method5881(@OriginalArg(0) Class4_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class84 local15;
		if (Static52.aClass84_1 == null) {
			local15 = new Class84();
		} else {
			local15 = Static52.aClass84_1;
			Static52.aClass84_1 = Static52.aClass84_1.aClass84_2;
			Static5.anInt94--;
			local15.aClass84_2 = null;
		}
		local15.anInt2103 = arg1;
		local15.aClass4_Sub5_1 = arg0;
		return local15;
	}
}
