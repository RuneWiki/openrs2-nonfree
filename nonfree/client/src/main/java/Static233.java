import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "[I")
	public static int[] anIntArray359;

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
	public static int anInt4431;

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet3;

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
	public static int anInt4433;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Z")
	public static boolean aBoolean341 = false;

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "Lclient!jv;")
	public static final Class174 aClass174_24 = new Class174();

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "Lclient!mo;")
	public static final Class215 aClass215_4 = new Class215("RC", 1);

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!qh;I)Lclient!ms;")
	public static Class94_Sub2 method3927(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(7) Class94 local7 = Static574.method7617(arg0);
		@Pc(13) int local13 = arg0.method3116();
		@Pc(21) int local21 = arg0.method3116();
		return new Class94_Sub2(local7.aClass300_13, local7.aClass140_15, local7.anInt8266, local7.anInt8265, local7.anInt8263, local7.anInt8262, local7.anInt8268, local7.anInt8269, local7.anInt8267, local13, local21);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "([Lclient!lk;IBZII)V")
	public static void method3929(@OriginalArg(0) Class203[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class203 local18 = arg0[local12];
			if (local18 != null && arg1 == local18.anInt5518) {
				Static159.method2856(arg4, arg3, local18, arg2);
				Static294.method4662(arg4, arg3, local18);
				if (local18.anInt5490 - local18.anInt5513 < local18.anInt5466) {
					local18.anInt5466 = local18.anInt5490 - local18.anInt5513;
				}
				if (local18.anInt5506 - local18.anInt5476 < local18.anInt5512) {
					local18.anInt5512 = local18.anInt5506 - local18.anInt5476;
				}
				if (local18.anInt5466 < 0) {
					local18.anInt5466 = 0;
				}
				if (local18.anInt5512 < 0) {
					local18.anInt5512 = 0;
				}
				if (local18.anInt5473 == 0) {
					Static480.method6572(arg2, local18);
				}
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIII)Lclient!pl;")
	public static Class9_Sub1_Sub1_Sub2 method3931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class63 local11 = Static554.aClass63ArrayArrayArray4[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class9_Sub1_Sub1_Sub2 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class16 local22 = local11.aClass16_3; local22 != null; local22 = local22.aClass16_1) {
			@Pc(30) Class9_Sub1_Sub1 local30 = local22.aClass9_Sub1_Sub1_1;
			if (local30 instanceof Class9_Sub1_Sub1_Sub2) {
				@Pc(36) Class9_Sub1_Sub1_Sub2 local36 = (Class9_Sub1_Sub1_Sub2) local30;
				@Pc(46) int local46 = local36.method5569() * 256 + 252 - 256;
				@Pc(54) int local54 = local36.anInt8975 - local46 >> 9;
				@Pc(62) int local62 = local36.anInt8980 - local46 >> 9;
				@Pc(69) int local69 = local46 + local36.anInt8975 >> 9;
				@Pc(77) int local77 = local36.anInt8980 + local46 >> 9;
				if (local54 <= arg0 && local62 <= arg2 && arg0 <= local69 && local77 >= arg2) {
					@Pc(111) int local111 = (local77 + 1 - arg2) * (-arg0 + 1 + local69);
					if (local111 > local19) {
						local17 = local36;
						local19 = local111;
					}
				}
			}
		}
		return local17;
	}
}
