import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "Lclient!la;")
	public static Class14 aClass14_3;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Lclient!mn;")
	public static Class171 aClass171_79;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
	public static int anInt6218;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_83 = new Class208(35, 7);

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_84 = new Class208(28, 4);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
	public static void method4952(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class2_Sub1_Sub6 local16 = Static267.method3705(arg0, 8);
		local16.method2574();
		local16.anInt3128 = arg3;
		local16.anInt3131 = arg1;
		local16.anInt3130 = arg2;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public static void method4953() {
		Static28.aClass75_3.method5970(Static304.aFloat77, Static280.aFloat71, Static290.aFloat75);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method4954(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				@Pc(72) char local72 = Static105.aCharArray2[(int) (local58 - arg0 * 37L)];
				if (local72 == '_') {
					@Pc(80) int local80 = local54.length() - 1;
					local54.setCharAt(local80, Character.toUpperCase(local54.charAt(local80)));
					local72 = ' ';
				}
				local54.append(local72);
			}
			local54.reverse();
			local54.setCharAt(0, Character.toUpperCase(local54.charAt(0)));
			return local54.toString();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([I[JZ)V")
	public static void method4955(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static69.method1079(arg1, arg0, 0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIILclient!kj;I)V")
	public static void method4956(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11_Sub5_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class101 local14 = arg2.method6218();
		@Pc(24) int local24 = arg2.anInt7672 - arg2.aClass23_7.anInt483 & 0x3FFF;
		if (arg1 == -1) {
			if (local24 != 0 || arg2.lb > 25) {
				arg2.aBoolean514 = false;
				if (arg3 < 0 && local14.anInt2622 != -1) {
					arg2.anInt7663 = local14.anInt2622;
				} else if (arg3 <= 0 || local14.anInt2649 == -1) {
					arg2.anInt7663 = local14.anInt2645;
				} else {
					arg2.anInt7663 = local14.anInt2649;
				}
			} else if (!arg2.aBoolean514 || !local14.method2203(arg2.anInt7663)) {
				arg2.anInt7663 = local14.method2207();
				arg2.aBoolean514 = arg2.anInt7663 != -1;
			}
		} else if (arg2.anInt7656 != -1 && (local24 >= 10240 || local24 <= 2048)) {
			@Pc(199) int local199 = Static325.anIntArray490[arg0] - arg2.aClass23_7.anInt483 & 0x3FFF;
			if (arg1 == 2 && local14.anInt2614 != -1) {
				if (local199 > 2048 && local199 <= 6144 && local14.anInt2627 != -1) {
					arg2.anInt7663 = local14.anInt2627;
				} else if (local199 >= 10240 && local199 < 14336 && local14.anInt2643 != -1) {
					arg2.anInt7663 = local14.anInt2643;
				} else if (local199 <= 6144 || local199 >= 10240 || local14.anInt2629 == -1) {
					arg2.anInt7663 = local14.anInt2614;
				} else {
					arg2.anInt7663 = local14.anInt2629;
				}
			} else if (arg1 == 0 && local14.anInt2608 != -1) {
				if (local199 > 2048 && local199 <= 6144 && local14.anInt2651 != -1) {
					arg2.anInt7663 = local14.anInt2651;
				} else if (local199 >= 10240 && local199 < 14336 && local14.anInt2654 != -1) {
					arg2.anInt7663 = local14.anInt2654;
				} else if (local199 <= 6144 || local199 >= 10240 || local14.anInt2619 == -1) {
					arg2.anInt7663 = local14.anInt2608;
				} else {
					arg2.anInt7663 = local14.anInt2619;
				}
			} else if (local199 > 2048 && local199 <= 6144 && local14.anInt2642 != -1) {
				arg2.anInt7663 = local14.anInt2642;
			} else if (local199 >= 10240 && local199 < 14336 && local14.anInt2610 != -1) {
				arg2.anInt7663 = local14.anInt2610;
			} else if (local199 <= 6144 || local199 >= 10240 || local14.anInt2616 == -1) {
				arg2.anInt7663 = local14.anInt2645;
			} else {
				arg2.anInt7663 = local14.anInt2616;
			}
			arg2.aBoolean514 = false;
		} else if (local24 == 0 && arg2.lb <= 25) {
			if (arg1 == 2 && local14.anInt2614 != -1) {
				arg2.anInt7663 = local14.anInt2614;
			} else if (arg1 == 0 && local14.anInt2608 != -1) {
				arg2.anInt7663 = local14.anInt2608;
			} else {
				arg2.anInt7663 = local14.anInt2645;
			}
			arg2.aBoolean514 = false;
		} else {
			arg2.aBoolean514 = false;
			if (arg1 == 2 && local14.anInt2614 != -1) {
				if (arg3 < 0 && local14.anInt2631 != -1) {
					arg2.anInt7663 = local14.anInt2631;
				} else if (arg3 <= 0 || local14.anInt2611 == -1) {
					arg2.anInt7663 = local14.anInt2614;
				} else {
					arg2.anInt7663 = local14.anInt2611;
				}
			} else if (arg1 == 0 && local14.anInt2608 != -1) {
				if (arg3 < 0 && local14.anInt2621 != -1) {
					arg2.anInt7663 = local14.anInt2621;
				} else if (arg3 <= 0 || local14.anInt2612 == -1) {
					arg2.anInt7663 = local14.anInt2608;
				} else {
					arg2.anInt7663 = local14.anInt2612;
				}
			} else if (arg3 < 0 && local14.anInt2647 != -1) {
				arg2.anInt7663 = local14.anInt2647;
			} else if (arg3 <= 0 || local14.anInt2615 == -1) {
				arg2.anInt7663 = local14.anInt2645;
			} else {
				arg2.anInt7663 = local14.anInt2615;
			}
		}
	}
}
