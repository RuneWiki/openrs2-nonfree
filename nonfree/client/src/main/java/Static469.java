import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!pia", name = "B", descriptor = "I")
	public static int anInt11069;

	@OriginalMember(owner = "client!pia", name = "z", descriptor = "I")
	public static int anInt11070;

	@OriginalMember(owner = "client!pia", name = "C", descriptor = "Lclient!l;")
	public static final Class213 aClass213_46 = new Class213();

	@OriginalMember(owner = "client!pia", name = "s", descriptor = "[I")
	public static final int[] anIntArray595 = new int[3];

	@OriginalMember(owner = "client!pia", name = "A", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_280 = new Class160(132, 6);

	@OriginalMember(owner = "client!pia", name = "w", descriptor = "I")
	public static int anInt11068 = 0;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lclient!eba;Lclient!rg;BIIZI)V")
	public static void method9385(@OriginalArg(0) Class14_Sub1_Sub3 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static494.method7429(arg2, arg1, arg3);
		Static556.aClass14_Sub1_Sub3_4 = arg0;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIILclient!sea;I)V")
	public static void method9387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class328 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class14_Sub3 local7 = null;
		for (@Pc(18) Class14_Sub3 local18 = (Class14_Sub3) Static74.aClass32_2.method584(); local18 != null; local18 = (Class14_Sub3) Static74.aClass32_2.method577()) {
			if (arg0 == local18.anInt231 && arg1 == local18.anInt233 && arg2 == local18.anInt224 && local18.anInt227 == arg4) {
				local7 = local18;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class14_Sub3();
			local7.anInt227 = arg4;
			local7.anInt231 = arg0;
			local7.anInt224 = arg2;
			local7.anInt233 = arg1;
			Static74.aClass32_2.method582(local7);
		}
		local7.aBoolean19 = true;
		local7.aBoolean18 = false;
		local7.aClass328_1 = arg3;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIII[B)Z")
	public static boolean method9390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class14_Sub21 local12 = new Class14_Sub21(arg4);
		@Pc(14) int local14 = -1;
		label70: while (true) {
			@Pc(25) int local25 = local12.method7691();
			if (local25 == 0) {
				return local7;
			}
			local14 += local25;
			@Pc(36) int local36 = 0;
			@Pc(40) boolean local40 = false;
			while (true) {
				@Pc(75) int local75;
				@Pc(102) Class128 local102;
				do {
					@Pc(79) int local79;
					@Pc(83) int local83;
					do {
						do {
							do {
								do {
									@Pc(46) int local46;
									while (local40) {
										local46 = local12.method7728(-129);
										if (local46 == 0) {
											continue label70;
										}
										local12.method7695(120);
									}
									local46 = local12.method7728(-129);
									if (local46 == 0) {
										continue label70;
									}
									local36 += local46 - 1;
									@Pc(63) int local63 = local36 & 0x3F;
									@Pc(69) int local69 = local36 >> 6 & 0x3F;
									local75 = local12.method7695(121) >> 2;
									local79 = local69 + arg2;
									local83 = arg1 + local63;
								} while (local79 <= 0);
							} while (local83 <= 0);
						} while (arg0 - 1 <= local79);
					} while (local83 >= arg3 - 1);
					local102 = Static212.aClass249_4.method6119(local14);
				} while (local75 == 22 && Static181.aClass14_Sub26_9.aClass43_Sub27_1.method7915() == 0 && local102.anInt2945 == 0 && local102.anInt2943 != 1 && !local102.aBoolean206);
				if (!local102.method2676()) {
					local7 = false;
					Static464.anInt7758++;
				}
				local40 = true;
			}
		}
	}
}
