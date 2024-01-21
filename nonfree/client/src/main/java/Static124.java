import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2 aClass2_Sub2_Sub3_Sub2_5;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
	public static int anInt3039;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
	public static int anInt3033 = 0;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Lclient!rg;")
	public static Class2_Sub18_Sub1 aClass2_Sub18_Sub1_3 = new Class2_Sub18_Sub1(5000);

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1117 = Static146.method2172("<br>(X");

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
	public static int anInt3041 = 0;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
	public static int anInt3042 = 0;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
	public static int anInt3043 = 0;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1118 = Static146.method2172(")1j");

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public static void method2158() {
		for (@Pc(3) int local3 = -1; local3 < anInt3042; local3++) {
			@Pc(11) int local11;
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static177.anIntArray632[local3];
			}
			@Pc(21) Class2_Sub2_Sub1_Sub6_Sub1 local21 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local11];
			if (local21 != null && local21.anInt4419 > 0) {
				local21.anInt4419--;
				if (local21.anInt4419 == 0) {
					local21.aClass77_1508 = null;
				}
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static145.anInt3533; local62++) {
			@Pc(68) int local68 = Static160.anIntArray643[local62];
			@Pc(72) Class2_Sub2_Sub1_Sub6_Sub2 local72 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local68];
			if (local72 != null && local72.anInt4419 > 0) {
				local72.anInt4419--;
				if (local72.anInt4419 == 0) {
					local72.aClass77_1508 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static void method2159() {
		aClass2_Sub18_Sub1_3 = null;
		aClass2_Sub2_Sub3_Sub2_5 = null;
		aClass77_1118 = null;
		aClass77_1117 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!v;)V")
	public static void method2160(@OriginalArg(1) Class2_Sub2_Sub1_Sub6 arg0) {
		if (arg0.anInt4397 == 0) {
			return;
		}
		@Pc(41) int local41;
		@Pc(34) int local34;
		if (arg0.anInt4402 != -1 && arg0.anInt4402 < 32768) {
			@Pc(26) Class2_Sub2_Sub1_Sub6_Sub2 local26 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[arg0.anInt4402];
			if (local26 != null) {
				local34 = arg0.anInt4385 - local26.anInt4385;
				local41 = arg0.anInt4400 - local26.anInt4400;
				if (local41 != 0 || local34 != 0) {
					arg0.anInt4387 = (int) (Math.atan2((double) local41, (double) local34) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(69) int local69;
		if (arg0.anInt4402 >= 32768) {
			local69 = arg0.anInt4402 - 32768;
			if (Static181.anInt4599 == local69) {
				local69 = 2047;
			}
			@Pc(78) Class2_Sub2_Sub1_Sub6_Sub1 local78 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local69];
			if (local78 != null) {
				local34 = arg0.anInt4400 - local78.anInt4400;
				@Pc(94) int local94 = arg0.anInt4385 - local78.anInt4385;
				if (local34 != 0 || local94 != 0) {
					arg0.anInt4387 = (int) (Math.atan2((double) local34, (double) local94) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt4417 != 0 || arg0.anInt4371 != 0) && (arg0.anInt4403 == 0 || arg0.anInt4378 > 0)) {
			local41 = arg0.anInt4385 - (arg0.anInt4371 - Static168.anInt4143 - Static168.anInt4143) * 64;
			local69 = arg0.anInt4400 - (arg0.anInt4417 - Static157.anInt3889 - Static157.anInt3889) * 64;
			if (local69 != 0 || local41 != 0) {
				arg0.anInt4387 = (int) (Math.atan2((double) local69, (double) local41) * 325.949D) & 0x7FF;
			}
			arg0.anInt4371 = 0;
			arg0.anInt4417 = 0;
		}
		local69 = arg0.anInt4387 - arg0.anInt4415 & 0x7FF;
		if (local69 == 0) {
			arg0.anInt4416 = 0;
			return;
		}
		arg0.anInt4416++;
		@Pc(214) boolean local214;
		if (local69 > 1024) {
			arg0.anInt4415 -= arg0.anInt4397;
			local214 = true;
			if (local69 < arg0.anInt4397 || 2048 - arg0.anInt4397 < local69) {
				local214 = false;
				arg0.anInt4415 = arg0.anInt4387;
			}
			if (arg0.anInt4413 == arg0.anInt4389 && (arg0.anInt4416 > 25 || local214)) {
				if (arg0.anInt4418 == -1) {
					arg0.anInt4389 = arg0.anInt4380;
				} else {
					arg0.anInt4389 = arg0.anInt4418;
				}
			}
		} else {
			arg0.anInt4415 += arg0.anInt4397;
			local214 = true;
			if (local69 < arg0.anInt4397 || local69 > 2048 - arg0.anInt4397) {
				local214 = false;
				arg0.anInt4415 = arg0.anInt4387;
			}
			if (arg0.anInt4389 == arg0.anInt4413 && (arg0.anInt4416 > 25 || local214)) {
				if (arg0.anInt4412 == -1) {
					arg0.anInt4389 = arg0.anInt4380;
				} else {
					arg0.anInt4389 = arg0.anInt4412;
				}
			}
		}
		arg0.anInt4415 &= 0x7FF;
	}
}
