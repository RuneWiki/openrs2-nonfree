import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
	public static int anInt1499;

	@OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
	public static int anInt1500;

	@OriginalMember(owner = "client!ed", name = "I", descriptor = "[Lclient!k;")
	public static Class106[] aClass106Array1;

	@OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
	public static int anInt1505 = 0;

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
	public static int anInt1511 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ae;ZIZILclient!sj;Lclient!qe;IIILclient!ae;I)Lclient!gj;")
	public static Class31 method1565(@OriginalArg(0) Class4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class37 arg4, @OriginalArg(6) Class160 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class4 arg9, @OriginalArg(11) int arg10) {
		@Pc(15) Class31 local15 = Static86.method1934(arg10, arg7, arg8, arg2, arg6, arg5, arg9);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) Class208 local25 = Static282.method5080(arg2);
		@Pc(37) int local37;
		if (arg7 > 1 && local25.anIntArray504 != null) {
			@Pc(35) int local35 = -1;
			for (local37 = 0; local37 < 10; local37++) {
				if (arg7 >= local25.anIntArray505[local37] && local25.anIntArray505[local37] != 0) {
					local35 = local25.anIntArray504[local37];
				}
			}
			if (local35 != -1) {
				local25 = Static282.method5080(local35);
			}
		}
		@Pc(81) Class192 local81 = Static111.method2400(Static8.aClass191_7, local25.anInt6803);
		if (local81 == null) {
			return null;
		}
		if (local25.aShortArray112 != null) {
			for (local37 = 0; local37 < local25.aShortArray112.length; local37++) {
				if (local25.aByteArray91 == null || local37 >= local25.aByteArray91.length) {
					local81.method5476(local25.aShortArray112[local37], local25.aShortArray109[local37]);
				} else {
					local81.method5476(local25.aShortArray112[local37], Static306.aShortArray86[local25.aByteArray91[local37] & 0xFF]);
				}
			}
		}
		if (local25.aShortArray111 != null) {
			for (local37 = 0; local37 < local25.aShortArray111.length; local37++) {
				local81.method5472(local25.aShortArray110[local37], local25.aShortArray111[local37]);
			}
		}
		if (arg5 != null) {
			for (local37 = 0; local37 < 5; local37++) {
				if (Static282.aShortArrayArray7[local37].length > arg5.anIntArray379[local37]) {
					local81.method5476(Static262.aShortArray78[local37], Static282.aShortArrayArray7[local37][arg5.anIntArray379[local37]]);
				}
				if (Static276.aShortArrayArray6[local37].length > arg5.anIntArray379[local37]) {
					local81.method5476(Static96.aShortArray52[local37], Static276.aShortArrayArray6[local37][arg5.anIntArray379[local37]]);
				}
			}
		}
		@Pc(228) short local228 = 1024;
		@Pc(230) boolean local230 = false;
		if (local25.anInt6751 != 128 || local25.anInt6777 != 128 || local25.anInt6779 != 128) {
			local230 = true;
			local228 = 1031;
		}
		@Pc(265) Class7 local265 = arg0.method4237(local81, local228, 0, local25.anInt6788 + 64, 768 - -local25.anInt6787);
		if (!local265.method1427()) {
			return null;
		}
		if (local230) {
			local265.method1445(local25.anInt6751, local25.anInt6777, local25.anInt6779);
		}
		@Pc(282) Class31 local282 = null;
		if (local25.anInt6757 != -1) {
			local282 = method1565(arg0, true, local25.anInt6805, true, arg4, arg5, 1, 10, 0, arg9, 0);
			if (local282 == null) {
				return null;
			}
		} else if (local25.anInt6785 != -1) {
			local282 = method1565(arg0, true, local25.anInt6790, false, arg4, arg5, arg6, arg7, 0, arg9, arg10);
			if (local282 == null) {
				return null;
			}
		}
		@Pc(331) int local331 = local25.anInt6770;
		if (arg3) {
			local331 = (int) ((double) local331 * 1.5D);
		} else if (arg6 == 2) {
			local331 = (int) ((double) local331 * 1.04D);
		}
		arg0.method4266(16, 16, 512, 512);
		@Pc(361) Class133 local361 = arg0.method4273();
		local361.method4337();
		arg0.method4233(local361);
		arg0.method4216(1.0F);
		arg0.method4223(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(380) Class133 local380 = arg0.method4244();
		local380.method4328(-local25.anInt6796 << 3);
		local380.method4327(local25.anInt6769 << 3);
		local380.method4333(local25.anInt6755, (local331 * Class24.anIntArray35[local25.anInt6799 << 3] >> 15) + local25.anInt6795 - local265.method1430() / 2, local25.anInt6795 + (local331 * Class24.anIntArray36[local25.anInt6799 << 3] >> 15));
		local380.method4338(local25.anInt6799 << 3);
		@Pc(438) int local438 = arg0.method4215();
		@Pc(441) int local441 = arg0.method4302();
		arg0.method4205(50, Integer.MAX_VALUE);
		arg0.method4225();
		arg0.method4299();
		arg0.method4246(0, 0, 36, 32, 0, 0);
		local265.method1441(local380, null, 1);
		arg0.method4205(local438, local441);
		@Pc(473) int[] local473 = arg0.method4212();
		if (arg6 >= 1) {
			local473 = Static120.method2506(-16777215, local473);
			if (arg6 >= 2) {
				local473 = Static120.method2506(-1, local473);
			}
		}
		if (arg10 != 0) {
			Static327.method5742(local473, arg10);
		}
		arg0.method4227(local473, 36, 36, 32).method4377(0, 0);
		if (local25.anInt6757 != -1) {
			local282.method4377(0, 0);
		} else if (local25.anInt6785 != -1) {
			local282.method4377(0, 0);
		}
		if (arg8 == 1 || arg8 == 2 && (local25.anInt6792 == 1 || arg7 != 1) && arg7 != -1) {
			arg4.method5254(-16777215, 0, -256, Static12.method423(arg7), 9);
		}
		local473 = arg0.method4212();
		for (@Pc(572) int local572 = 0; local572 < local473.length; local572++) {
			if ((local473[local572] & 0xFFFFFF) == 0) {
				local473[local572] = 0;
			} else {
				local473[local572] |= 0xFF000000;
			}
		}
		@Pc(609) Class31 local609;
		if (arg1) {
			local609 = arg0.method4227(local473, 36, 36, 32);
		} else {
			local609 = arg9.method4227(local473, 36, 36, 32);
		}
		if (!arg1) {
			@Pc(625) Class212 local625 = new Class212();
			local625.anInt6921 = arg2;
			local625.anInt6913 = arg10;
			local625.anInt6918 = arg8;
			local625.anInt6914 = arg9.anInt4681;
			local625.anInt6916 = arg6;
			local625.anInt6917 = arg7;
			local625.aBoolean607 = arg5 != null;
			Static129.aClass148_1.method4062(local625, local609);
		}
		return local609;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method1566(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static307.method5418(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static2.method55(local7);
			local7 = Static24.method731(local7, "%3a", ":");
			local7 = Static24.method731(local7, "%40", "@");
			local7 = Static24.method731(local7, "%26", "&");
			local7 = Static24.method731(local7, "%23", "#");
			if (Static125.aClass168_1.anApplet1 != null) {
				@Pc(104) Class193 local104 = Static125.aClass168_1.method4850(new URL(Static125.aClass168_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static162.anInt3272 + "&u=" + Static173.aLong103 + "&v1=" + Static268.aString54 + "&v2=" + Static268.aString51 + "&e=" + local7));
				while (local104.anInt6293 == 0) {
					Static102.method2276(1L);
				}
				if (local104.anInt6293 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local104.anObject7;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(B)V")
	public static void method1568() {
		Static271.aClass2_Sub3_Sub3_3.method1752();
		Static144.aClass191_93 = null;
		Static237.anInt4541 = 1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
	public static boolean method1569(@OriginalArg(0) int arg0) {
		if (arg0 == 59 || arg0 == 51 || arg0 == 60 || arg0 == 8 || arg0 == 4) {
			return true;
		} else {
			return arg0 == 18 || arg0 == 1010;
		}
	}
}
