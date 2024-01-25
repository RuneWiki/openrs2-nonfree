import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
	public static int anInt3653;

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "Lclient!nq;")
	public static final Class144 aClass144_1 = new Class144();

	@OriginalMember(owner = "client!lj", name = "P", descriptor = "[I")
	public static final int[] anIntArray361 = new int[13];

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V")
	public static void method3301() {
		@Pc(5) Class109 local5 = Static342.aClass109_61;
		synchronized (Static342.aClass109_61) {
			Static342.aClass109_61.method2858();
		}
		local5 = Static77.aClass109_20;
		synchronized (Static77.aClass109_20) {
			Static77.aClass109_20.method2858();
		}
		@Pc(36) Class120 local36 = Static311.aClass120_2;
		synchronized (Static311.aClass120_2) {
			Static311.aClass120_2.method3170();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!ok;Lclient!ea;ZII)V")
	public static void method3303(@OriginalArg(1) int arg0, @OriginalArg(2) Class18 arg1, @OriginalArg(3) Class55 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3) {
			Static354.aClass95_18.method5491((Static168.anInt3376 - Static354.aClass95_18.method5507()) / 2, (Static256.anInt5066 - Static354.aClass95_18.method5494()) / 2);
			Static223.aClass95_10.method5491((Static168.anInt3376 - Static223.aClass95_10.method5507()) / 2, 18);
		}
		arg1.method4172(-1, ~Static111.anInt2077 == -2 ? Static74.aClass85_32.method2020(Static41.anInt726) : Static94.aClass85_39.method2020(Static41.anInt726), arg0, Static168.anInt3376 / 2, Static256.anInt5066 / 2 - 26);
		@Pc(70) int local70 = Static256.anInt5066 / 2 - 18;
		arg2.method5204(Static168.anInt3376 / 2 - 152, local70, 304, 34, arg5, 0);
		arg2.method5204(Static168.anInt3376 / 2 - 151, local70 + 1, 302, 32, 0, 0);
		arg2.method5205(Static168.anInt3376 / 2 - 150, local70 + 2, Static178.anInt3531 * 3, 30, arg4, 0);
		arg2.method5205(Static178.anInt3531 * 3 + Static168.anInt3376 / 2 - 150, local70 - -2, 300 - Static178.anInt3531 * 3, 30, 0, 0);
		arg1.method4172(-1, Static316.aString47, arg0, Static168.anInt3376 / 2, Static256.anInt5066 / 2 + 4);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!vg;)V")
	public static void method3304(@OriginalArg(1) Class201 arg0) {
		@Pc(11) int local11 = arg0.anInt6555;
		if (local11 == 327) {
			arg0.anInt6484 = 150;
			arg0.anInt6561 = (int) (Math.sin((double) Static283.anInt5563 / 40.0D) * 256.0D) & 0x3FFF;
			arg0.anInt6556 = 5;
			arg0.anInt6511 = -1;
		} else if (local11 == 328) {
			if (Static192.aClass4_Sub5_Sub2_Sub1_2.aString40 == null) {
				arg0.anInt6511 = 0;
				arg0.anInt6533 = 0;
			} else {
				arg0.anInt6484 = 150;
				arg0.anInt6561 = (int) (Math.sin((double) Static283.anInt5563 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt6556 = 5;
				arg0.anInt6511 = 2047;
				arg0.anInt6533 = Static190.method431(Static192.aClass4_Sub5_Sub2_Sub1_2.aString40);
				arg0.anInt6526 = Static192.aClass4_Sub5_Sub2_Sub1_2.anInt5361;
				arg0.anInt6549 = Static192.aClass4_Sub5_Sub2_Sub1_2.anInt5384;
				arg0.anInt6490 = Static192.aClass4_Sub5_Sub2_Sub1_2.anInt5385;
				arg0.anInt6534 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)V")
	public static void method3305() {
		if (Static288.method5007() || Static322.anInt611 == Static239.anInt4811) {
			Static163.method2869(Static236.aClass55_9);
			if (Static31.anInt619 != Static239.anInt4811) {
				Static344.method5892();
			}
		} else {
			Static144.method2634(Static239.anInt4811, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0], false, false, Static111.anInt2079, Static53.anInt990, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0]);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!jq;)I")
	public static int method3306(@OriginalArg(1) Class4_Sub5_Sub2 arg0) {
		if (arg0.anInt5392 == 0) {
			return 0;
		}
		@Pc(30) int local30;
		@Pc(37) int local37;
		if (arg0.anInt5362 != -1 && arg0.anInt5362 < 32768) {
			@Pc(21) Class4_Sub5_Sub2_Sub2 local21 = Static280.aClass4_Sub5_Sub2_Sub2Array1[arg0.anInt5362];
			if (local21 != null) {
				local30 = arg0.anInt6631 - local21.anInt6631;
				local37 = arg0.anInt6632 - local21.anInt6632;
				if (local30 != 0 || local37 != 0) {
					arg0.method4811((int) (Math.atan2((double) local30, (double) local37) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(68) int local68;
		if (arg0.anInt5362 >= 32768) {
			local68 = arg0.anInt5362 - 32768;
			if (local68 == Static166.anInt3304) {
				local68 = 2047;
			}
			@Pc(81) Class4_Sub5_Sub2_Sub1 local81 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local68];
			if (local81 != null) {
				local37 = arg0.anInt6631 - local81.anInt6631;
				@Pc(95) int local95 = arg0.anInt6632 - local81.anInt6632;
				if (local37 != 0 || local95 != 0) {
					arg0.method4811((int) (Math.atan2((double) local37, (double) local95) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt5378 != 0 || arg0.anInt5380 != 0) && (arg0.anInt5413 == 0 || arg0.anInt5417 > 0)) {
			local68 = arg0.anInt6631 - (arg0.anInt5378 - Static172.anInt4394 - Static172.anInt4394) * 64;
			local30 = arg0.anInt6632 - (arg0.anInt5380 - Static12.anInt3797 - Static12.anInt3797) * 64;
			if (local68 != 0 || local30 != 0) {
				arg0.method4811((int) (Math.atan2((double) local68, (double) local30) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt5380 = 0;
			arg0.anInt5378 = 0;
		}
		return arg0.method4810();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3307(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(18) String local18 = Static289.method5015(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < Static346.anInt6667; local23++) {
			@Pc(28) String local28 = Static25.aStringArray52[local23];
			if (local28.startsWith("*")) {
				local28 = local28.substring(1);
			}
			local28 = Static289.method5015(local28);
			if (local28 != null && local28.equals(local18)) {
				Static346.anInt6667--;
				for (@Pc(52) int local52 = local23; local52 < Static346.anInt6667; local52++) {
					Static25.aStringArray52[local52] = Static25.aStringArray52[local52 + 1];
					Static253.aStringArray51[local52] = Static253.aStringArray51[local52 + 1];
					Static222.aStringArray48[local52] = Static222.aStringArray48[local52 + 1];
					Static178.aStringArray42[local52] = Static178.aStringArray42[local52 + 1];
					Static211.aBooleanArray17[local52] = Static211.aBooleanArray17[local52 + 1];
				}
				Static195.anInt3884 = Static190.anInt456;
				Static125.aClass5_Sub12_Sub2_3.method5125(142);
				Static125.aClass5_Sub12_Sub2_3.method5089(Static56.method878(arg0));
				Static125.aClass5_Sub12_Sub2_3.method5094(arg0);
				break;
			}
		}
	}
}
