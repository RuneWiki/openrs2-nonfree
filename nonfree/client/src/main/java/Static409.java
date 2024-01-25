import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!rca", name = "t", descriptor = "Lclient!kda;")
	public static Class160 aClass160_83;

	@OriginalMember(owner = "client!rca", name = "K", descriptor = "[[S")
	public static short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!rca", name = "o", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_97 = new Class186(45, 11);

	@OriginalMember(owner = "client!rca", name = "u", descriptor = "[I")
	public static final int[] anIntArray535 = new int[13];

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!gba;)V")
	public static void method6130(@OriginalArg(1) Class1_Sub13_Sub2 arg0) {
		for (@Pc(10) int local10 = 0; local10 < Static125.anInt3025; local10++) {
			@Pc(15) int local15 = Static255.anIntArray355[local10];
			@Pc(19) Class47_Sub2_Sub3_Sub2 local19 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local15];
			@Pc(23) int local23 = arg0.method3043();
			if ((local23 & 0x20) != 0) {
				local23 += arg0.method3043() << 8;
			}
			if ((local23 & 0x1000) != 0) {
				local23 += arg0.method3043() << 16;
			}
			Static17.method815(local23, local19, local15, arg0);
		}
	}

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "(B)V")
	public static void method6131() {
		for (@Pc(13) Class1_Sub1_Sub7 local13 = (Class1_Sub1_Sub7) Static228.aClass38_76.method1419(); local13 != null; local13 = (Class1_Sub1_Sub7) Static228.aClass38_76.method1415()) {
			@Pc(17) Class47_Sub2_Sub5 local17 = local13.aClass47_Sub2_Sub5_1;
			if (Static416.anInt7252 > local17.anInt5549) {
				local13.method7983();
				local17.method4777();
			} else if (Static416.anInt7252 >= local17.anInt5545) {
				if (local17.anInt5536 > 0) {
					@Pc(46) Class1_Sub10 local46 = (Class1_Sub10) Static258.aClass174_15.method4422((long) (local17.anInt5536 - 1));
					if (local46 != null) {
						@Pc(51) Class47_Sub2_Sub3_Sub1 local51 = local46.aClass47_Sub2_Sub3_Sub1_2;
						if (local51.anInt8189 >= 0 && Static542.anInt9387 * 128 > local51.anInt8189 && local51.anInt8191 >= 0 && local51.anInt8191 < Static36.anInt1324 * 128) {
							local17.method4775(local51.anInt8189, Static74.method1954(local17.aByte94, local51.anInt8191, local51.anInt8189) - local17.anInt5553, Static416.anInt7252, local51.anInt8191);
						}
					}
				}
				if (local17.anInt5536 < 0) {
					@Pc(111) int local111 = -local17.anInt5536 - 1;
					@Pc(120) Class47_Sub2_Sub3_Sub2 local120;
					if (local111 == Static150.anInt3353) {
						local120 = Static16.aClass47_Sub2_Sub3_Sub2_1;
					} else {
						local120 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local111];
					}
					if (local120 != null && local120.anInt8189 >= 0 && Static542.anInt9387 * 128 > local120.anInt8189 && local120.anInt8191 >= 0 && local120.anInt8191 < Static36.anInt1324 * 128) {
						local17.method4775(local120.anInt8189, Static74.method1954(local17.aByte94, local120.anInt8191, local120.anInt8189) - local17.anInt5553, Static416.anInt7252, local120.anInt8191);
					}
				}
				local17.method4772(Static309.anInt5936);
				Static346.method5547(local17, true);
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILjava/io/File;)[B")
	public static byte[] method6132(@OriginalArg(1) File arg0) {
		return Static321.method5257((int) arg0.length(), arg0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IBI)Z")
	public static boolean method6133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static135.method2904(arg0, arg1) | (arg1 & 0x800) != 0 || Static153.method3113(arg0, arg1);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)V")
	public static void method6135(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(7, arg0);
		local8.method4925();
	}

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "(I)V")
	public static void method6136() {
		Static444.method6416(Static42.aClass186_15);
		Static192.aClass1_Sub13_Sub2_1.method3060(0);
	}
}
