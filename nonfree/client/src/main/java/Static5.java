import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	public static int anInt41 = 0;

	@OriginalMember(owner = "client!ac", name = "ib", descriptor = "Z")
	public static boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public static void method51() {
		@Pc(7) int local7 = Static187.anInt3432;
		@Pc(9) int[] local9 = Static668.anIntArray664;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(26) Class23_Sub2_Sub1_Sub2_Sub1 local26 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local9[local11]];
			if (local26 != null && local26.anInt10132 > 0) {
				local26.anInt10132--;
				if (local26.anInt10132 == 0) {
					local26.aString131 = null;
				}
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static308.anInt5687; local53++) {
			@Pc(60) long local60 = (long) Static390.anIntArray424[local53];
			@Pc(66) Class3_Sub11 local66 = (Class3_Sub11) Static500.aClass62_40.method1682(local60);
			if (local66 != null) {
				@Pc(71) Class23_Sub2_Sub1_Sub2_Sub2 local71 = local66.aClass23_Sub2_Sub1_Sub2_Sub2_1;
				if (local71.anInt10132 > 0) {
					local71.anInt10132--;
					if (local71.anInt10132 == 0) {
						local71.aString131 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZILclient!hk;II[II)Lclient!vq;")
	public static Class39_Sub4_Sub1 method54(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class16_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		if (arg2.aBoolean314 || Static9.method94(arg4) && Static9.method94(arg0)) {
			return new Class39_Sub4_Sub1(arg2, 3553, arg4, arg0, false, arg5, arg3, 0);
		} else if (arg2.aBoolean318) {
			return new Class39_Sub4_Sub1(arg2, 34037, arg4, arg0, false, arg5, arg3, 0);
		} else {
			return new Class39_Sub4_Sub1(arg2, arg4, arg0, Static527.method7377(arg4), Static527.method7377(arg0), arg5);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	public static void method55(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = Static17.aClass202_1.method4632(Static569.aClass335_25.method7694(Static319.anInt5939));
		@Pc(53) int local53;
		@Pc(30) int local30;
		if (Static548.aBoolean662) {
			for (@Pc(71) Class3_Sub6_Sub20 local71 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5934(); local71 != null; local71 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5929()) {
				if (local71.anInt9677 == 1) {
					local30 = Static300.method4652((Class3_Sub6_Sub16) local71.aClass258_13.aClass3_Sub6_44.aClass3_Sub6_67);
				} else {
					local30 = Static619.method8225(local71);
				}
				if (local30 > local17) {
					local17 = local30;
				}
			}
			local17 += 8;
			Static464.anInt7952 = (Static236.aBoolean347 ? 26 : 22) + Static661.anInt10221 * 16;
			local53 = Static661.anInt10221 * 16 + 21;
		} else {
			for (@Pc(24) Class3_Sub6_Sub16 local24 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4457(); local24 != null; local24 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4459()) {
				local30 = Static300.method4652(local24);
				if (local17 < local30) {
					local17 = local30;
				}
			}
			local17 += 8;
			local53 = Static37.anInt1104 * 16 + 21;
			Static464.anInt7952 = Static37.anInt1104 * 16 + (Static236.aBoolean347 ? 26 : 22);
		}
		@Pc(130) int local130 = arg0 - local17 / 2;
		if (local130 + local17 > Static654.anInt10064) {
			local130 = Static654.anInt10064 - local17;
		}
		if (local130 < 0) {
			local130 = 0;
		}
		local30 = arg1;
		if (Static483.anInt8181 < local53 + arg1) {
			local30 = Static483.anInt8181 - local53;
		}
		Static567.anInt9059 = local130;
		if (local30 < 0) {
			local30 = 0;
		}
		Static467.anInt7972 = local30;
		Static108.anInt2244 = local17;
		Static463.aBoolean600 = true;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(III)Z")
	public static boolean method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static94.method1881(arg0, arg1) || Static302.method4657(arg1, arg0);
	}
}
