import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "Lclient!jb;")
	public static Class157 aClass157_1;

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_17 = new Class112();

	@OriginalMember(owner = "client!eba", name = "h", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
	public static int anInt2183 = 2;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I[BIIII)V")
	public static void method1927(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(24) int local24 = arg1 - arg3 >> 2;
		arg2 += arg3;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg1 - arg3 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg0[arg2++] = 1;
				}
			}
			@Pc(33) int local33 = arg2 + 1;
			arg0[arg2] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg0[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg0[local38] = 1;
			arg2 = local43 + 1;
			arg0[local43] = 1;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIIII)V")
	public static void method1929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static562.anInt9174 = arg2;
		Static477.anInt7888 = arg0;
		Static351.anInt6111 = arg1;
		Static379.anInt6484 = arg4;
		Static399.anInt6956 = arg3;
		if (Static562.anInt9174 >= 100) {
			@Pc(29) int local29 = Static379.anInt6484 * 512 + 256;
			@Pc(35) int local35 = Static399.anInt6956 * 512 + 256;
			@Pc(44) int local44 = Static475.method6537(local35, Static117.anInt2694, local29) - Static351.anInt6111;
			@Pc(49) int local49 = local29 - Static226.anInt3984;
			@Pc(54) int local54 = local44 - Static461.anInt7704;
			@Pc(59) int local59 = local35 - Static350.anInt6080;
			@Pc(71) int local71 = (int) Math.sqrt((double) (local49 * local49 + local59 * local59));
			Static494.anInt8029 = (int) (Math.atan2((double) local54, (double) local71) * 2607.5945876176133D) & 0x3FFF;
			Static333.anInt5565 = (int) (-2607.5945876176133D * Math.atan2((double) local49, (double) local59)) & 0x3FFF;
			if (Static494.anInt8029 < 1024) {
				Static494.anInt8029 = 1024;
			}
			Static208.anInt3801 = 0;
			if (Static494.anInt8029 > 3072) {
				Static494.anInt8029 = 3072;
			}
		}
		Static379.anInt6482 = 2;
		Static391.anInt6856 = -1;
		Static18.anInt314 = -1;
	}
}
