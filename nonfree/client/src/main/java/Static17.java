import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_14;

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "Lclient!kj;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_15;

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
	public static int anInt457 = 100;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "Lclient!i;")
	public static Class41 aClass41_108 = Static184.method2923("3D)2Softwarebibliothek gestartet)3");

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "Lclient!i;")
	public static Class41 aClass41_109 = Static184.method2923("Clientscript error in: ");

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "Lclient!i;")
	public static Class41 aClass41_110 = Static184.method2923("(U3");

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
	public static int anInt473 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([Lclient!ia;[BIIZI)V")
	public static void method323(@OriginalArg(0) Class42[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		@Pc(20) Class2_Sub3 local20 = new Class2_Sub3(arg1);
		@Pc(22) int local22 = -1;
		while (true) {
			@Pc(26) int local26 = local20.method194();
			if (local26 == 0) {
				return;
			}
			local22 += local26;
			@Pc(37) int local37 = 0;
			while (true) {
				@Pc(41) int local41 = local20.method212();
				if (local41 == 0) {
					break;
				}
				local37 += local41 - 1;
				@Pc(53) int local53 = local37 & 0x3F;
				@Pc(59) int local59 = local37 >> 6 & 0x3F;
				@Pc(63) int local63 = local20.method209();
				@Pc(67) int local67 = local37 >> 12;
				@Pc(71) int local71 = arg3 + local53;
				@Pc(75) int local75 = local63 & 0x3;
				@Pc(80) int local80 = local59 + arg2;
				@Pc(84) int local84 = local63 >> 2;
				if (local80 > 0 && local71 > 0 && local80 < 103 && local71 < 103) {
					@Pc(104) Class42 local104 = null;
					@Pc(108) int local108 = local67;
					if ((Static102.aByteArrayArrayArray7[1][local80][local71] & 0x2) == 2) {
						local108 = local67 - 1;
					}
					if (local108 >= 0) {
						local104 = arg0[local108];
					}
					Static198.method3079(true, local67, local75, local84, Static217.aBoolean290, local22, local67, local104, local71, local80);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!u;Z)V")
	public static void method324(@OriginalArg(0) Class12_Sub3 arg0) {
		if (arg0.anInt3931 == 0) {
			return;
		}
		@Pc(41) int local41;
		@Pc(35) int local35;
		if (arg0.anInt3943 != -1 && arg0.anInt3943 < 32768) {
			@Pc(27) Class12_Sub3_Sub2 local27 = Static199.aClass12_Sub3_Sub2Array1[arg0.anInt3943];
			if (local27 != null) {
				local35 = arg0.anInt3949 - local27.anInt3949;
				local41 = arg0.anInt3961 - local27.anInt3961;
				if (local41 != 0 || local35 != 0) {
					arg0.anInt3947 = (int) (Math.atan2((double) local41, (double) local35) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(71) int local71;
		if (arg0.anInt3943 >= 32768) {
			local71 = arg0.anInt3943 - 32768;
			if (local71 == Static195.anInt4428) {
				local71 = 2047;
			}
			@Pc(84) Class12_Sub3_Sub1 local84 = Static216.aClass12_Sub3_Sub1Array1[local71];
			if (local84 != null) {
				local35 = arg0.anInt3961 - local84.anInt3961;
				@Pc(99) int local99 = arg0.anInt3949 - local84.anInt3949;
				if (local35 != 0 || local99 != 0) {
					arg0.anInt3947 = (int) (Math.atan2((double) local35, (double) local99) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3925 != 0 || arg0.anInt3928 != 0) && (arg0.anInt3960 == 0 || arg0.anInt3937 > 0)) {
			local41 = arg0.anInt3932 * 64 + arg0.anInt3949 - (-Static168.anInt3899 + arg0.anInt3928 + -Static168.anInt3899) * 64 - 64;
			local71 = arg0.anInt3961 + (arg0.anInt3932 - 1) * 64 - (arg0.anInt3925 - Static198.anInt4451 - Static198.anInt4451) * 64;
			if (local71 != 0 || local41 != 0) {
				arg0.anInt3947 = (int) (Math.atan2((double) local71, (double) local41) * 325.949D) & 0x7FF;
			}
			arg0.anInt3928 = 0;
			arg0.anInt3925 = 0;
		}
		local71 = arg0.anInt3947 - arg0.anInt3916 & 0x7FF;
		if (local71 == 0) {
			arg0.anInt3919 = 0;
			return;
		}
		arg0.anInt3919++;
		@Pc(252) boolean local252;
		if (local71 > 1024) {
			arg0.anInt3916 -= arg0.anInt3931;
			local252 = true;
			if (local71 < arg0.anInt3931 || 2048 - arg0.anInt3931 < local71) {
				arg0.anInt3916 = arg0.anInt3947;
				local252 = false;
			}
			if (arg0.anInt3934 == arg0.anInt3935 && (arg0.anInt3919 > 25 || local252)) {
				if (arg0.anInt3921 == -1) {
					arg0.anInt3935 = arg0.anInt3922;
				} else {
					arg0.anInt3935 = arg0.anInt3921;
				}
			}
		} else {
			arg0.anInt3916 += arg0.anInt3931;
			local252 = true;
			if (arg0.anInt3931 > local71 || 2048 - arg0.anInt3931 < local71) {
				arg0.anInt3916 = arg0.anInt3947;
				local252 = false;
			}
			if (arg0.anInt3935 == arg0.anInt3934 && (arg0.anInt3919 > 25 || local252)) {
				if (arg0.anInt3956 == -1) {
					arg0.anInt3935 = arg0.anInt3922;
				} else {
					arg0.anInt3935 = arg0.anInt3956;
				}
			}
		}
		arg0.anInt3916 &= 0x7FF;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!nb;Z)V")
	public static void method327(@OriginalArg(0) Class15 arg0) {
		Static32.aClass15_6 = arg0;
	}
}
