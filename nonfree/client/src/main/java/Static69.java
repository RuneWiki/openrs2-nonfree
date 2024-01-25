import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
	public static int anInt1570;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IZIILjava/lang/String;)V")
	public static void method1357(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Class230 local8 = Static572.method8204(arg0, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray26 != null) {
			@Pc(23) Class14_Sub55 local23 = new Class14_Sub55();
			local23.anObjectArray33 = local8.anObjectArray26;
			local23.anInt10934 = arg2;
			local23.aClass230_14 = local8;
			local23.aString116 = arg3;
			Static632.method8830(local23);
		}
		if (Static430.anInt7691 != 10 || !Static78.method1481(local8).method5411(arg2 - 1)) {
			return;
		}
		@Pc(63) Class14_Sub19 local63;
		if (arg2 == 1) {
			local63 = Static286.method4081(Static205.aClass394_1, Static656.aClass100_141);
			Static416.method6207(arg1, local8.anInt6646, local63, arg0);
			Static576.method8234(local63);
		}
		if (arg2 == 2) {
			local63 = Static286.method4081(Static205.aClass394_1, Static530.aClass100_114);
			Static416.method6207(arg1, local8.anInt6646, local63, arg0);
			Static576.method8234(local63);
		}
		if (arg2 == 3) {
			local63 = Static286.method4081(Static205.aClass394_1, Static464.aClass100_105);
			Static416.method6207(arg1, local8.anInt6646, local63, arg0);
			Static576.method8234(local63);
		}
		if (arg2 == 4) {
			local63 = Static286.method4081(Static205.aClass394_1, Static134.aClass100_66);
			Static416.method6207(arg1, local8.anInt6646, local63, arg0);
			Static576.method8234(local63);
		}
		if (arg2 == 5) {
			local63 = Static286.method4081(Static205.aClass394_1, Static508.aClass100_107);
			Static416.method6207(arg1, local8.anInt6646, local63, arg0);
			Static576.method8234(local63);
		}
		if (arg2 == 6) {
			local63 = Static286.method4081(Static205.aClass394_1, Static55.aClass100_23);
			Static416.method6207(arg1, local8.anInt6646, local63, arg0);
			Static576.method8234(local63);
		}
		if (arg2 == 7) {
			local63 = Static286.method4081(Static205.aClass394_1, Static633.aClass100_134);
			Static416.method6207(arg1, local8.anInt6646, local63, arg0);
			Static576.method8234(local63);
		}
		if (arg2 == 8) {
			local63 = Static286.method4081(Static205.aClass394_1, Static312.aClass100_82);
			Static416.method6207(arg1, local8.anInt6646, local63, arg0);
			Static576.method8234(local63);
		}
		if (arg2 == 9) {
			local63 = Static286.method4081(Static205.aClass394_1, Static357.aClass100_90);
			Static416.method6207(arg1, local8.anInt6646, local63, arg0);
			Static576.method8234(local63);
		}
		if (arg2 == 10) {
			local63 = Static286.method4081(Static205.aClass394_1, Static570.aClass100_121);
			Static416.method6207(arg1, local8.anInt6646, local63, arg0);
			Static576.method8234(local63);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "([Ljava/lang/String;[IB)V")
	public static void method1358(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1) {
		Static618.method8670(arg1, 0, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1359(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class14_Sub29 local8 = new Class14_Sub29(arg0);
		@Pc(12) int local12 = local8.method5866();
		@Pc(16) int local16 = local8.method5878();
		if (local16 < 0 || Static170.anInt3358 != 0 && local16 > Static170.anInt3358) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(47) byte[] local47 = new byte[local16];
			local8.method5860(local47, 0, local16);
			return local47;
		} else {
			@Pc(59) int local59 = local8.method5878();
			if (local59 < 0 || Static170.anInt3358 != 0 && Static170.anInt3358 < local59) {
				throw new RuntimeException();
			}
			@Pc(76) byte[] local76 = new byte[local59];
			if (local12 == 1) {
				Static554.method7796(local76, local59, arg0, local16);
			} else {
				@Pc(81) Class212 local81 = Static17.aClass212_1;
				synchronized (Static17.aClass212_1) {
					Static17.aClass212_1.method5197(local76, local8);
				}
			}
			return local76;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILclient!so;)Lclient!ee;")
	public static Class86_Sub1 method1360(@OriginalArg(1) Class14_Sub29 arg0) {
		return new Class86_Sub1(arg0.method5890(), arg0.method5890(), arg0.method5890(), arg0.method5890(), arg0.method5862(), arg0.method5866());
	}
}
