import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
	public static int anInt5164 = -1;

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_154 = new Class208(82, 3);

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
	public static final int anInt5165 = 1338;

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
	public static int anInt5166 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!mt;")
	public static Class1_Sub2 method4615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class188 local7 = Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class168 local14 = local7.aClass168_2; local14 != null; local14 = local14.aClass168_1) {
			@Pc(18) Class1_Sub2 local18 = local14.aClass1_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort95 == arg1 && local18.aShort96 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBLclient!qo;I)V")
	public static void method4617(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt5366 == arg0 && arg0 != -1) {
			@Pc(80) Class102 local80 = Static333.aClass50_2.method1175(arg0);
			@Pc(83) int local83 = local80.anInt2985;
			if (local83 == 1) {
				arg1.anInt5414 = 0;
				arg1.anInt5367 = 0;
				arg1.anInt5407 = 0;
				arg1.anInt5405 = arg2;
				arg1.anInt5425 = 1;
				Static343.method5495(local80, false, arg1.anInt6800, arg1.anInt5407, arg1.anInt6798, arg1.aByte73);
			}
			if (local83 == 2) {
				arg1.anInt5414 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt5366 == -1 || Static333.aClass50_2.method1175(arg0).anInt2992 >= Static333.aClass50_2.method1175(arg1.anInt5366).anInt2992) {
			arg1.anInt5407 = 0;
			arg1.anInt5366 = arg0;
			arg1.anInt5414 = 0;
			arg1.anInt5367 = 0;
			arg1.anInt5405 = arg2;
			arg1.anInt5431 = arg1.anInt5432;
			arg1.anInt5425 = 1;
			if (arg1.anInt5366 != -1) {
				Static343.method5495(Static333.aClass50_2.method1175(arg1.anInt5366), false, arg1.anInt6800, arg1.anInt5407, arg1.anInt6798, arg1.aByte73);
			}
		}
	}
}
