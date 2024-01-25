import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!bt", name = "R", descriptor = "Lclient!ua;")
	public static Class5_Sub49 aClass5_Sub49_1;

	@OriginalMember(owner = "client!bt", name = "A", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_19 = new Class187(76, -1);

	@OriginalMember(owner = "client!bt", name = "N", descriptor = "[I")
	public static final int[] anIntArray56 = new int[2];

	@OriginalMember(owner = "client!bt", name = "Q", descriptor = "I")
	public static int anInt925 = 0;

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V")
	public static void method856(@OriginalArg(0) int arg0) {
		if (Static175.method2576(arg0)) {
			Static330.method5113(Static227.aClass394ArrayArray2[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIZI)V")
	public static void method857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 + Static454.anInt7910;
		@Pc(11) int local11 = Static48.anInt750 + arg1;
		if (Static129.aClass313ArrayArrayArray7 == null || arg0 < 0 || arg1 < 0 || Static124.anInt2150 <= arg0 || arg1 >= Static64.anInt1015 || Static655.aClass5_Sub36_29.aClass2_Sub19_1.method7172() == 0 && arg2 != Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149) {
			return;
		}
		@Pc(62) long local62 = (long) (local11 << 14 | arg2 << 28 | local7);
		@Pc(68) Class5_Sub24 local68 = (Class5_Sub24) Static109.aClass335_12.method7766(local62);
		if (local68 == null) {
			Static664.method8675(arg2, arg0, arg1);
			return;
		}
		@Pc(82) Class5_Sub29 local82 = (Class5_Sub29) local68.aClass124_30.method2572();
		if (local82 == null) {
			Static664.method8675(arg2, arg0, arg1);
			return;
		}
		@Pc(96) Class41_Sub1_Sub2_Sub1 local96 = (Class41_Sub1_Sub2_Sub1) Static664.method8675(arg2, arg0, arg1);
		if (local96 == null) {
			local96 = new Class41_Sub1_Sub2_Sub1(arg0 << 9, Static298.aClass88Array3[arg2].method8749(arg0, arg1), arg1 << 9, arg2, arg2);
		} else {
			local96.anInt8579 = local96.anInt8582 = -1;
		}
		local96.anInt8567 = local82.anInt3940;
		local96.anInt8577 = local82.anInt3941;
		label56: while (true) {
			@Pc(138) Class5_Sub29 local138 = (Class5_Sub29) local68.aClass124_30.method2569();
			if (local138 == null) {
				break;
			}
			if (local138.anInt3940 != local96.anInt8567) {
				local96.anInt8579 = local138.anInt3940;
				local96.anInt8569 = local138.anInt3941;
				while (true) {
					@Pc(159) Class5_Sub29 local159 = (Class5_Sub29) local68.aClass124_30.method2569();
					if (local159 == null) {
						break label56;
					}
					if (local159.anInt3940 != local96.anInt8567 && local96.anInt8579 != local159.anInt3940) {
						local96.anInt8584 = local159.anInt3941;
						local96.anInt8582 = local159.anInt3940;
					}
				}
			}
		}
		@Pc(208) int local208 = Static161.method1246(arg2, (arg1 << 9) + 256, (arg0 << 9) + 256);
		local96.anInt8572 = 0;
		local96.aByte149 = (byte) arg2;
		local96.aByte150 = (byte) arg2;
		local96.anInt10366 = arg0 << 9;
		local96.anInt10370 = local208;
		local96.anInt10367 = arg1 << 9;
		if (Static488.method7149(arg0, arg1)) {
			local96.aByte150++;
		}
		Static398.method5868(arg2, arg0, arg1, local208, local96);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method858(@OriginalArg(0) String arg0) {
		Static423.method6423(0, 0, arg0, "", "", "");
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!li;)I")
	public static int method859(@OriginalArg(1) Class41_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt9474 == 0) {
			return 0;
		}
		@Pc(65) int local65;
		@Pc(58) int local58;
		if (arg0.anInt9452 != -1) {
			@Pc(18) Class41_Sub1_Sub1_Sub3 local18 = null;
			if (arg0.anInt9452 < 32768) {
				@Pc(44) Class5_Sub34 local44 = (Class5_Sub34) Static223.aClass335_19.method7766((long) arg0.anInt9452);
				if (local44 != null) {
					local18 = local44.aClass41_Sub1_Sub1_Sub3_Sub1_1;
				}
			} else if (arg0.anInt9452 >= 32768) {
				local18 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[arg0.anInt9452 - 32768];
			}
			if (local18 != null) {
				local58 = arg0.anInt10366 - local18.anInt10366;
				local65 = arg0.anInt10367 - local18.anInt10367;
				if (local58 != 0 || local65 != 0) {
					arg0.method7915((int) (Math.atan2((double) local58, (double) local65) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class41_Sub1_Sub1_Sub3_Sub2) {
			@Pc(162) Class41_Sub1_Sub1_Sub3_Sub2 local162 = (Class41_Sub1_Sub1_Sub3_Sub2) arg0;
			if (local162.anInt9545 != -1 && (local162.anInt9526 == 0 || local162.anInt9523 > 0)) {
				local162.method7915(local162.anInt9545);
				local162.anInt9545 = -1;
			}
		} else if (arg0 instanceof Class41_Sub1_Sub1_Sub3_Sub1) {
			@Pc(96) Class41_Sub1_Sub1_Sub3_Sub1 local96 = (Class41_Sub1_Sub1_Sub3_Sub1) arg0;
			if (local96.anInt5464 != -1 && (local96.anInt9526 == 0 || local96.anInt9523 > 0)) {
				local58 = local96.anInt10366 - (local96.anInt5464 - Static454.anInt7910 - Static454.anInt7910) * 256;
				local65 = local96.anInt10367 - (local96.anInt5460 - Static48.anInt750 - Static48.anInt750) * 256;
				if (local58 != 0 || local65 != 0) {
					local96.method7915((int) (Math.atan2((double) local58, (double) local65) * 2607.5945876176133D) & 0x3FFF);
				}
				local96.anInt5464 = -1;
			}
		}
		return arg0.method7926();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZILclient!cb;IBIJ)V")
	public static void method861(@OriginalArg(1) int arg0, @OriginalArg(2) Class50 arg1, @OriginalArg(3) int arg2, @OriginalArg(6) long arg3) {
		Static595.method8074(arg1, arg3, arg2, arg0);
	}
}
