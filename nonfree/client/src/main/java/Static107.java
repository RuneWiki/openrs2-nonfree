import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	public static int anInt2560;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "Lclient!ih;")
	public static Class36 aClass36_4;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!vb;")
	public static Class84 aClass84_5 = new Class84();

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
	public static int anInt2559 = 0;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_728 = Static38.method685("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!ai;")
	private static Class6 aClass6_729 = Static38.method685("Connecting to update server");

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!ai;")
	public static Class6 aClass6_730 = Static38.method685(")1j");

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	public static int anInt2561 = 0;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public static int anInt2562 = 0;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_731 = Static38.method685(":");

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
	public static int anInt2563 = -1;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	public static int anInt2564 = 0;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "Lclient!ai;")
	public static Class6 aClass6_732 = Static38.method685("null");

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
	public static int anInt2566 = 127;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Lclient!ai;")
	public static Class6 aClass6_733 = Static38.method685("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!ai;")
	public static Class6 aClass6_734 = aClass6_729;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBIIII)V")
	public static void method1735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = Static30.aClass44_1.method1247(arg4, arg3, arg0);
		@Pc(31) int local31;
		@Pc(47) int local47;
		@Pc(35) int local35;
		@Pc(37) int local37;
		@Pc(62) int local62;
		@Pc(71) int local71;
		if (local15 != 0) {
			local31 = Static30.aClass44_1.method1272(arg4, arg3, arg0, local15);
			local35 = local31 & 0x1F;
			local37 = arg2;
			if (local15 > 0) {
				local37 = arg1;
			}
			local47 = local31 >> 6 & 0x3;
			local62 = arg3 * 4 + (-arg0 + 103) * 2048 + 24624;
			@Pc(65) int[] local65 = Static58.aClass2_Sub3_Sub2_Sub1_2.anIntArray14;
			local71 = local15 >> 14 & 0x7FFF;
			@Pc(75) Class2_Sub3_Sub6 local75 = Static163.method2609(local71);
			if (local75.anInt1212 == -1) {
				if (local35 == 0 || local35 == 2) {
					if (local47 == 0) {
						local65[local62] = local37;
						local65[local62 + 512] = local37;
						local65[local62 + 1024] = local37;
						local65[local62 + 1536] = local37;
					} else if (local47 == 1) {
						local65[local62] = local37;
						local65[local62 + 1] = local37;
						local65[local62 + 2] = local37;
						local65[local62 + 3] = local37;
					} else if (local47 == 2) {
						local65[local62 + 3] = local37;
						local65[local62 + 512 + 3] = local37;
						local65[local62 + 3 + 1024] = local37;
						local65[local62 + 1536 + 3] = local37;
					} else if (local47 == 3) {
						local65[local62 + 1536] = local37;
						local65[local62 + 1 + 1536] = local37;
						local65[local62 + 2 + 1536] = local37;
						local65[local62 + 1536 + 3] = local37;
					}
				}
				if (local35 == 3) {
					if (local47 == 0) {
						local65[local62] = local37;
					} else if (local47 == 1) {
						local65[local62 + 3] = local37;
					} else if (local47 == 2) {
						local65[local62 + 1539] = local37;
					} else if (local47 == 3) {
						local65[local62 + 1536] = local37;
					}
				}
				if (local35 == 2) {
					if (local47 == 3) {
						local65[local62] = local37;
						local65[local62 + 512] = local37;
						local65[local62 + 1024] = local37;
						local65[local62 + 1536] = local37;
					} else if (local47 == 0) {
						local65[local62] = local37;
						local65[local62 + 1] = local37;
						local65[local62 + 2] = local37;
						local65[local62 + 3] = local37;
					} else if (local47 == 1) {
						local65[local62 + 3] = local37;
						local65[local62 + 515] = local37;
						local65[local62 + 1027] = local37;
						local65[local62 + 1536 + 3] = local37;
					} else if (local47 == 2) {
						local65[local62 + 1536] = local37;
						local65[local62 + 1537] = local37;
						local65[local62 + 1538] = local37;
						local65[local62 + 1536 + 3] = local37;
					}
				}
			} else {
				@Pc(85) Class2_Sub3_Sub2_Sub3 local85 = Static81.aClass2_Sub3_Sub2_Sub3Array4[local75.anInt1212];
				if (local85 != null) {
					@Pc(98) int local98 = (local75.anInt1205 * 4 - local85.anInt3620) / 2;
					@Pc(109) int local109 = (local75.anInt1195 * 4 - local85.anInt3621) / 2;
					local85.method2398(arg3 * 4 + local98 + 48, local109 + (-local75.anInt1195 + 104 + -arg0) * 4 + 48);
				}
			}
		}
		local15 = Static30.aClass44_1.method1255(arg4, arg3, arg0);
		if (local15 != 0) {
			local31 = Static30.aClass44_1.method1272(arg4, arg3, arg0, local15);
			local47 = local31 >> 6 & 0x3;
			local35 = local31 & 0x1F;
			local37 = local15 >> 14 & 0x7FFF;
			@Pc(472) Class2_Sub3_Sub6 local472 = Static163.method2609(local37);
			@Pc(501) int local501;
			if (local472.anInt1212 != -1) {
				@Pc(581) Class2_Sub3_Sub2_Sub3 local581 = Static81.aClass2_Sub3_Sub2_Sub3Array4[local472.anInt1212];
				if (local581 != null) {
					local71 = (local472.anInt1205 * 4 - local581.anInt3620) / 2;
					local501 = (local472.anInt1195 * 4 - local581.anInt3621) / 2;
					local581.method2398(local71 + arg3 * 4 + 48, (104 - (arg0 + local472.anInt1195)) * 4 + 48 + local501);
				}
			} else if (local35 == 9) {
				@Pc(484) int[] local484 = Static58.aClass2_Sub3_Sub2_Sub1_2.anIntArray14;
				local62 = 15658734;
				local501 = (103 - arg0) * 512 * 4 + arg3 * 4 + 24624;
				if (local15 > 0) {
					local62 = 15597568;
				}
				if (local47 == 0 || local47 == 2) {
					local484[local501 + 1536] = local62;
					local484[local501 + 1024 + 1] = local62;
					local484[local501 + 2 + 512] = local62;
					local484[local501 + 3] = local62;
				} else {
					local484[local501] = local62;
					local484[local501 + 1 + 512] = local62;
					local484[local501 + 1024 + 2] = local62;
					local484[local501 + 3 + 1536] = local62;
				}
			}
		}
		local15 = Static30.aClass44_1.method1264(arg4, arg3, arg0);
		if (local15 == 0) {
			return;
		}
		local31 = local15 >> 14 & 0x7FFF;
		@Pc(643) Class2_Sub3_Sub6 local643 = Static163.method2609(local31);
		if (local643.anInt1212 == -1) {
			return;
		}
		@Pc(652) Class2_Sub3_Sub2_Sub3 local652 = Static81.aClass2_Sub3_Sub2_Sub3Array4[local643.anInt1212];
		if (local652 != null) {
			local37 = (local643.anInt1205 * 4 - local652.anInt3620) / 2;
			@Pc(676) int local676 = (local643.anInt1195 * 4 - local652.anInt3621) / 2;
			local652.method2398(arg3 * 4 + local37 + 48, (-local643.anInt1195 + (104 - arg0)) * 4 + 48 + local676);
			return;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	public static void method1736() {
		aClass6_732 = null;
		aClass6_733 = null;
		aClass36_4 = null;
		aClass6_734 = null;
		aClass6_729 = null;
		aClass6_731 = null;
		aClass84_5 = null;
		aClass6_728 = null;
		aClass6_730 = null;
	}
}
