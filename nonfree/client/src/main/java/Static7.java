import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!ia;")
	public static Class51 aClass51_51 = Static64.method1101(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!af", name = "h", descriptor = "[I")
	public static int[] anIntArray9 = new int[2000];

	@OriginalMember(owner = "client!af", name = "i", descriptor = "J")
	public static long aLong4 = 0L;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array1 = new Class51[100];

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!ia;")
	private static Class51 aClass51_52 = Static64.method1101("Loading config )2 ");

	@OriginalMember(owner = "client!af", name = "o", descriptor = "Lclient!ia;")
	public static Class51 aClass51_53 = aClass51_52;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I[Lclient!me;I)V")
	public static void method100(@OriginalArg(0) int arg0, @OriginalArg(1) Class71[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) Class71 local18 = arg1[local12];
			if (local18 != null) {
				if (local18.anInt2777 == 0) {
					if (local18.aClass71Array2 != null) {
						method100(arg0, local18.aClass71Array2);
					}
					@Pc(39) Class1_Sub13 local39 = (Class1_Sub13) Static120.aClass102_14.method3093((long) local18.anInt2807);
					if (local39 != null) {
						Static55.method955(local39.anInt1677, arg0);
					}
				}
				@Pc(55) Class1_Sub21 local55;
				if (arg0 == 0 && local18.anObjectArray6 != null) {
					local55 = new Class1_Sub21();
					local55.aClass71_25 = local18;
					local55.anObjectArray32 = local18.anObjectArray6;
					Static65.method1119(local55);
				}
				if (arg0 == 1 && local18.anObjectArray14 != null) {
					if (local18.anInt2788 >= 0) {
						@Pc(81) Class71 local81 = method102(local18.anInt2807);
						if (local81 == null || local81.aClass71Array2 == null || local81.aClass71Array2.length <= local18.anInt2788 || local81.aClass71Array2[local18.anInt2788] != local18) {
							continue;
						}
					}
					local55 = new Class1_Sub21();
					local55.aClass71_25 = local18;
					local55.anObjectArray32 = local18.anObjectArray14;
					Static65.method1119(local55);
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public static void method101() {
		while (true) {
			if (Static225.aClass1_Sub16_Sub1_4.method3825(Static142.anInt3128) >= 11) {
				@Pc(12) int local12 = Static225.aClass1_Sub16_Sub1_4.method3824(11);
				if (local12 != 2047) {
					@Pc(17) boolean local17 = false;
					if (Static191.aClass5_Sub1_Sub1Array1[local12] == null) {
						local17 = true;
						Static191.aClass5_Sub1_Sub1Array1[local12] = new Class5_Sub1_Sub1();
						if (Static78.aClass1_Sub16Array1[local12] != null) {
							Static191.aClass5_Sub1_Sub1Array1[local12].method1460(Static78.aClass1_Sub16Array1[local12]);
						}
					}
					Static79.anIntArray111[Static118.anInt2542++] = local12;
					@Pc(53) Class5_Sub1_Sub1 local53 = Static191.aClass5_Sub1_Sub1Array1[local12];
					local53.anInt3627 = Static109.anInt2430;
					@Pc(61) int local61 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
					@Pc(66) int local66 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
					if (local66 == 1) {
						Static145.anIntArray216[Static226.anInt4738++] = local12;
					}
					@Pc(84) int local84 = Static205.anIntArray328[Static225.aClass1_Sub16_Sub1_4.method3824(3)];
					if (local17) {
						local53.anInt3581 = local53.anInt3575 = local84;
					}
					@Pc(97) int local97 = Static225.aClass1_Sub16_Sub1_4.method3824(5);
					@Pc(102) int local102 = Static225.aClass1_Sub16_Sub1_4.method3824(5);
					if (local102 > 15) {
						local102 -= 32;
					}
					if (local97 > 15) {
						local97 -= 32;
					}
					local53.method2797(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0] + local97, local61 == 1, local102 + Static73.aClass5_Sub1_Sub1_1.anIntArray238[0]);
					continue;
				}
			}
			Static225.aClass1_Sub16_Sub1_4.method3826();
			return;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)Lclient!me;")
	public static Class71 method102(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static64.aClass71ArrayArray1[local7] == null || Static64.aClass71ArrayArray1[local7][local11] == null) {
			@Pc(30) boolean local30 = Static54.method933(local7);
			if (!local30) {
				return null;
			}
		}
		return Static64.aClass71ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	public static void method103() {
		System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLclient!ia;)I")
	public static int method104(@OriginalArg(1) Class51 arg0) {
		return arg0.method1399() + 1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!mb;)V")
	public static void method105(@OriginalArg(1) Class70 arg0) {
		Static24.aClass70_9 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)Lclient!rc;")
	public static Class1_Sub2_Sub15 method106(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub15 local10 = (Class1_Sub2_Sub15) Static195.aClass123_7.method3640((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static24.aClass70_9.method3509(arg0, 5);
		local10 = new Class1_Sub2_Sub15();
		if (local20 != null) {
			local10.method2985(new Class1_Sub16(local20));
		}
		Static195.aClass123_7.method3644(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
	public static int method107(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBLclient!mb;Lclient!mb;)Lclient!jb;")
	public static Class1_Sub2_Sub11 method109(@OriginalArg(0) int arg0, @OriginalArg(3) Class70 arg1, @OriginalArg(4) Class70 arg2) {
		return Static36.method640(arg0, arg1) ? Static209.method3461(arg2.method3509(0, arg0)) : null;
	}
}
