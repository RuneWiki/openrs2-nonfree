import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!gf", name = "zb", descriptor = "I")
	public static int anInt1241;

	@OriginalMember(owner = "client!gf", name = "Db", descriptor = "Lclient!ef;")
	public static Class16 aClass16_58;

	@OriginalMember(owner = "client!gf", name = "Hb", descriptor = "[[I")
	public static int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!gf", name = "Jb", descriptor = "[Lclient!nc;")
	public static Class3_Sub14[] aClass3_Sub14Array1;

	@OriginalMember(owner = "client!gf", name = "pb", descriptor = "I")
	public static int anInt1235 = 0;

	@OriginalMember(owner = "client!gf", name = "qb", descriptor = "[Lclient!d;")
	public static Class3_Sub1_Sub5_Sub1_Sub1[] aClass3_Sub1_Sub5_Sub1_Sub1Array1 = new Class3_Sub1_Sub5_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!gf", name = "rb", descriptor = "Lclient!he;")
	private static Class26 aClass26_629 = Static6.method100("World");

	@OriginalMember(owner = "client!gf", name = "tb", descriptor = "Lclient!he;")
	public static Class26 aClass26_630 = Static6.method100("Art");

	@OriginalMember(owner = "client!gf", name = "ub", descriptor = "Lclient!he;")
	public static Class26 aClass26_631 = aClass26_629;

	@OriginalMember(owner = "client!gf", name = "yb", descriptor = "I")
	public static int anInt1240 = 0;

	@OriginalMember(owner = "client!gf", name = "Ab", descriptor = "Lclient!he;")
	public static Class26 aClass26_632 = Static6.method100("::qa_op_test");

	@OriginalMember(owner = "client!gf", name = "Gb", descriptor = "Lclient!he;")
	private static Class26 aClass26_636 = Static6.method100("To create a new account you need to");

	@OriginalMember(owner = "client!gf", name = "Bb", descriptor = "Lclient!he;")
	public static Class26 aClass26_633 = aClass26_636;

	@OriginalMember(owner = "client!gf", name = "Cb", descriptor = "Lclient!he;")
	public static Class26 aClass26_634 = Static6.method100("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!gf", name = "Fb", descriptor = "Lclient!he;")
	public static Class26 aClass26_635 = Static6.method100("Texturen geladen)3");

	@OriginalMember(owner = "client!gf", name = "Ib", descriptor = "Lclient!he;")
	public static Class26 aClass26_637 = aClass26_629;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
	public static void method766() {
		anIntArrayArray12 = null;
		aClass26_629 = null;
		aClass26_632 = null;
		aClass26_631 = null;
		aClass26_633 = null;
		aClass16_58 = null;
		aClass26_636 = null;
		aClass26_634 = null;
		aClass3_Sub1_Sub5_Sub1_Sub1Array1 = null;
		aClass3_Sub14Array1 = null;
		aClass26_635 = null;
		aClass26_637 = null;
		aClass26_630 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIIIBI)Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3 method767(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(20) long local20 = ((long) arg4 << 40) + (long) arg1 + ((long) arg2 << 16) + ((long) arg3 << 38);
		@Pc(32) Class3_Sub1_Sub4_Sub3 local32;
		if (!arg0) {
			local32 = (Class3_Sub1_Sub4_Sub3) Static14.aClass66_3.method1970(local20);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class3_Sub1_Sub9 local40 = Static117.method2099(arg1);
		if (arg2 > 1 && local40.anIntArray167 != null) {
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
				if (arg2 >= local40.anIntArray168[local52] && local40.anIntArray168[local52] != 0) {
					local50 = local40.anIntArray167[local52];
				}
			}
			if (local50 != -1) {
				local40 = Static117.method2099(local50);
			}
		}
		@Pc(92) Class3_Sub1_Sub5_Sub7 local92 = local40.method1125(1);
		if (local92 == null) {
			return null;
		}
		@Pc(98) Class3_Sub1_Sub4_Sub3 local98 = null;
		if (local40.anInt1699 != -1) {
			local98 = method767(true, local40.anInt1692, 10, 1, 0);
			if (local98 == null) {
				return null;
			}
		}
		@Pc(118) int[] local118 = Static77.anIntArray389;
		@Pc(120) int local120 = Static77.anInt3239;
		@Pc(122) int local122 = Static77.anInt3242;
		@Pc(125) int[] local125 = new int[4];
		Static77.method2221(local125);
		local32 = new Class3_Sub1_Sub4_Sub3(36, 32);
		Static77.method2219(local32.anIntArray308, 36, 32);
		Static77.method2222();
		Static127.method2238();
		Static127.method2241(16, 16);
		Static127.aBoolean183 = false;
		@Pc(148) int local148 = local40.anInt1696;
		if (arg0) {
			local148 = (int) ((double) local148 * 1.5D);
		} else if (arg3 == 2) {
			local148 = (int) ((double) local148 * 1.04D);
		}
		@Pc(176) int local176 = Class3_Sub1_Sub4_Sub4.anIntArray391[local40.anInt1708] * local148 >> 16;
		@Pc(185) int local185 = Class3_Sub1_Sub4_Sub4.anIntArray392[local40.anInt1708] * local148 >> 16;
		local92.method1475();
		local92.method1466(local40.anInt1704, local40.anInt1691, local40.anInt1708, local40.anInt1682, local40.anInt1713 + local92.anInt2680 / 2 + local176, local185 + local40.anInt1713);
		if (arg3 >= 1) {
			local32.method1763(1);
		}
		if (arg3 >= 2) {
			local32.method1763(16777215);
		}
		if (arg4 != 0) {
			local32.method1746(arg4);
		}
		Static77.method2219(local32.anIntArray308, 36, 32);
		if (local40.anInt1699 != -1) {
			local98.method1758(0, 0);
		}
		if (!arg0 && (local40.anInt1715 == 1 || arg2 != 1) && arg2 != -1) {
			Static3.aClass3_Sub1_Sub4_Sub2_Sub1_1.method1617(Static51.method1079(arg2), 0, 9, 16776960, 1);
		}
		if (!arg0) {
			Static14.aClass66_3.method1969(local20, local32);
		}
		Static77.method2219(local118, local120, local122);
		Static77.method2216(local125);
		Static127.method2238();
		Static127.aBoolean183 = true;
		return local32;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void method768(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static74.method1346(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static125.aClass75_6.anApplet1 != null) {
				@Pc(108) Class22 local108 = Static125.aClass75_6.method2175(new URL(Static125.aClass75_6.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static36.anInt1191 + "&u=" + Static40.aLong36 + "&v1=" + Static123.aString3 + "&v2=" + Static123.aString5 + "&e=" + local7));
				while (local108.anInt1200 == 0) {
					Static40.method783(1L);
				}
				if (local108.anInt1200 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local108.anObject3;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!cf;")
	public static RuntimeException_Sub1 method769(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub1 local5;
		if (arg0 instanceof RuntimeException_Sub1) {
			local5 = (RuntimeException_Sub1) arg0;
			local5.aString1 = local5.aString1 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLjava/lang/Object;Lclient!vb;)V")
	public static void method770(@OriginalArg(1) Object arg0, @OriginalArg(2) Class75 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg1.anEventQueue1.peekEvent() != null; local15++) {
			Static40.method783(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
