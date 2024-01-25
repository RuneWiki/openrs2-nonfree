import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "[I")
	public static final int[] anIntArray714 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
	public static int anInt9433 = 0;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Lclient!ff;")
	public static final Class101 aClass101_18 = new Class101(2, 4, 4, 0);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7692(@OriginalArg(1) String arg0) {
		Static83.method1476(4, 0, "", "", "", arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIBLclient!de;Lclient!qaa;)V")
	public static void method7693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8_Sub3_Sub3_Sub1_Sub1 arg2, @OriginalArg(4) Class1_Sub35_Sub2 arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg1 & 0x10) != 0) {
			Static500.aByteArray97[arg0] = arg3.method5743();
		}
		@Pc(28) int local28;
		if ((arg1 & 0x80) != 0) {
			local28 = arg3.method5783();
			if (local28 == 65535) {
				local28 = -1;
			}
			arg2.anInt6781 = local28;
		}
		if ((arg1 & 0x8000) != 0) {
			local7 = arg3.method5751();
		}
		@Pc(56) int local56;
		@Pc(67) int local67;
		if ((arg1 & 0x40) != 0) {
			local28 = arg3.method5771();
			local56 = arg3.method5737();
			if (local28 == 65535) {
				local28 = -1;
			}
			local67 = arg3.method5742();
			arg2.method5427(false, local67, local56, local28);
		}
		if ((arg1 & 0x20000) != 0) {
			local28 = Static301.anInt5197;
			local56 = arg3.method5739();
			local67 = arg3.method5793();
			arg2.method5436(local56, local67, local28);
		}
		if ((arg1 & 0x2) != 0) {
			local28 = arg3.method5750();
			@Pc(108) byte[] local108 = new byte[local28];
			@Pc(113) Class1_Sub35 local113 = new Class1_Sub35(local108);
			arg3.method5763(local28, local108);
			Static510.aClass1_Sub35Array1[arg0] = local113;
			arg2.method1443(local113);
		}
		if ((arg1 & 0x4000) != 0) {
			arg2.anInt6847 = arg3.method5743();
			arg2.anInt6796 = arg3.method5762();
			arg2.anInt6793 = arg3.method5751();
			arg2.anInt6788 = arg3.method5762();
			arg2.anInt6779 = arg3.method5771() + Static301.anInt5197;
			arg2.anInt6810 = arg3.method5772() + Static301.anInt5197;
			arg2.anInt6789 = arg3.method5742();
			if (arg2.aBoolean135) {
				arg2.anInt6796 += arg2.anInt1729;
				arg2.anInt6847 += arg2.anInt1749;
				arg2.anInt6793 += arg2.anInt1749;
				arg2.anInt6788 += arg2.anInt1729;
				arg2.anInt6859 = 0;
			} else {
				arg2.anInt6788 += arg2.anIntArray533[0];
				arg2.anInt6859 = 1;
				arg2.anInt6847 += arg2.anIntArray534[0];
				arg2.anInt6793 += arg2.anIntArray534[0];
				arg2.anInt6796 += arg2.anIntArray533[0];
			}
			arg2.anInt6858 = 0;
		}
		@Pc(263) int[] local263;
		if ((arg1 & 0x100) != 0) {
			local28 = arg3.method5750();
			local263 = new int[local28];
			@Pc(266) int[] local266 = new int[local28];
			@Pc(269) int[] local269 = new int[local28];
			for (@Pc(271) int local271 = 0; local271 < local28; local271++) {
				@Pc(277) int local277 = arg3.method5783();
				if (local277 == 65535) {
					local277 = -1;
				}
				local263[local271] = local277;
				local266[local271] = arg3.method5750();
				local269[local271] = arg3.method5771();
			}
			Static530.method7279(arg2, local266, local263, local269);
		}
		if ((arg1 & 0x20) != 0) {
			local28 = arg3.method5739();
			local56 = arg3.method5793();
			arg2.method5436(local28, local56, Static301.anInt5197);
			arg2.anInt6816 = Static301.anInt5197 + 300;
			arg2.anInt6851 = arg3.method5742();
		}
		if ((arg1 & 0x1000) != 0) {
			arg2.aBoolean137 = arg3.method5793() == 1;
		}
		if ((arg1 & 0x400) != 0) {
			arg2.aString68 = arg3.method5760();
			if (arg2.aString68.charAt(0) == '~') {
				arg2.aString68 = arg2.aString68.substring(1);
				Static83.method1476(2, 0, arg2.method1441(), arg2.aString15, arg2.method1438(), arg2.aString68);
			} else if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == arg2) {
				Static83.method1476(2, 0, arg2.method1441(), arg2.aString15, arg2.method1438(), arg2.aString68);
			}
			arg2.anInt6778 = 0;
			arg2.anInt6799 = 0;
			arg2.anInt6815 = 150;
		}
		if ((arg1 & 0x10000) != 0) {
			arg2.lb = arg3.method5768();
			arg2.aByte92 = arg3.method5751();
			arg2.aByte93 = arg3.method5751();
			arg2.aByte94 = (byte) arg3.method5750();
			arg2.anInt6831 = Static301.anInt5197 + arg3.method5771();
			arg2.anInt6795 = Static301.anInt5197 + arg3.method5779();
		}
		if ((arg1 & 0x2000) != 0) {
			local28 = arg3.method5779();
			local56 = arg3.method5804();
			if (local28 == 65535) {
				local28 = -1;
			}
			local67 = arg3.method5750();
			arg2.method5427(true, local67, local56, local28);
		}
		if ((arg1 & 0x1) != 0) {
			local263 = new int[4];
			for (local67 = 0; local67 < 4; local67++) {
				local263[local67] = arg3.method5771();
				if (local263[local67] == 65535) {
					local263[local67] = -1;
				}
			}
			@Pc(539) int local539 = arg3.method5793();
			Static290.method4092(local539, arg2, local263);
		}
		if ((arg1 & 0x200) != 0) {
			local56 = arg3.method5783();
			arg2.anInt6827 = arg3.method5775();
			arg2.anInt6837 = arg3.method5742();
			arg2.aBoolean552 = (local56 & 0x8000) != 0;
			arg2.anInt6776 = local56 & 0x7FFF;
			arg2.anInt6811 = arg2.anInt6827 + Static301.anInt5197 + arg2.anInt6776;
		}
		if ((arg1 & 0x4) != 0) {
			arg2.anInt1728 = arg3.method5771();
			if (arg2.anInt6859 == 0) {
				arg2.method5433(arg2.anInt1728);
				arg2.anInt1728 = -1;
			}
		}
		if (!arg2.aBoolean135) {
			return;
		}
		if (local7 == 127) {
			arg2.method1444(arg2.anInt1729, arg2.anInt1749);
			return;
		}
		@Pc(636) byte local636;
		if (local7 == -1) {
			local636 = Static500.aByteArray97[arg0];
		} else {
			local636 = local7;
		}
		arg2.method1439(local636, arg2.anInt1749, arg2.anInt1729);
	}
}
