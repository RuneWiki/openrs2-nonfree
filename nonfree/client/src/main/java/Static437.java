import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!op", name = "e", descriptor = "Lclient!tf;")
	public static final Class340 aClass340_58 = new Class340();

	@OriginalMember(owner = "client!op", name = "f", descriptor = "I")
	public static int anInt7442 = 0;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIII)V")
	public static void method6611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static484.anInt8246 = arg3;
		Static26.anInt362 = arg4;
		Static309.anInt5362 = arg2;
		Static566.anInt8430 = arg0;
		Static104.anInt2080 = arg1;
		if (Static566.anInt8430 >= 100) {
			@Pc(27) int local27 = Static104.anInt2080 * 512 + 256;
			@Pc(33) int local33 = Static484.anInt8246 * 512 + 256;
			@Pc(41) int local41 = Static248.method4318(local33, Static504.anInt8428, local27) - Static26.anInt362;
			@Pc(46) int local46 = local27 - Static475.anInt8090;
			@Pc(50) int local50 = local41 - Static406.anInt7076;
			@Pc(55) int local55 = local33 - Static365.anInt6155;
			@Pc(66) int local66 = (int) Math.sqrt((double) (local55 * local55 + local46 * local46));
			Static337.anInt5759 = (int) (Math.atan2((double) local50, (double) local66) * 2607.5945876176133D) & 0x3FFF;
			Static21.anInt279 = (int) (-2607.5945876176133D * Math.atan2((double) local46, (double) local55)) & 0x3FFF;
			Static200.anInt4059 = 0;
			if (Static337.anInt5759 < 1024) {
				Static337.anInt5759 = 1024;
			}
			if (Static337.anInt5759 > 3072) {
				Static337.anInt5759 = 3072;
			}
		}
		Static16.anInt232 = -1;
		Static126.anInt2529 = -1;
		Static526.anInt8626 = 2;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BLclient!vo;II)V")
	public static void method6612(@OriginalArg(1) Class381 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static637.aClass381_13 != null || Static484.aBoolean623 || (arg0 == null || Static206.method3808(arg0) == null)) {
			return;
		}
		Static637.aClass381_13 = arg0;
		Static220.aClass381_4 = Static206.method3808(arg0);
		Static75.anInt1038 = arg2;
		Static323.anInt5579 = 0;
		Static231.anInt4491 = arg1;
		Static511.aBoolean648 = false;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public static void method6613() {
		for (@Pc(8) Class60_Sub6 local8 = (Class60_Sub6) Static219.aClass385_2.method8772(); local8 != null; local8 = (Class60_Sub6) Static219.aClass385_2.method8772()) {
			Static376.method5668(local8);
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (Static687.aClass6_Sub44_33.aClass7_Sub6_1.method926() == 1) {
			local38 = 0;
			local40 = 3;
		} else {
			local40 = Static621.anInt9796;
			local38 = Static621.anInt9796;
		}
		Static78.method1072();
		for (@Pc(61) int local61 = local38; local61 <= local40; local61++) {
			Static78.method1059();
			Static78.method1077(local61);
			Static78.method1063(local61);
		}
		Static78.method1062();
		Static78.method1075();
	}
}
