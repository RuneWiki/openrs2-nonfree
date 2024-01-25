import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!qk", name = "eb", descriptor = "I")
	public static int anInt5088;

	@OriginalMember(owner = "client!qk", name = "hb", descriptor = "[[[Lclient!dh;")
	public static Class45[][][] aClass45ArrayArrayArray2;

	@OriginalMember(owner = "client!qk", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString183 = "Please remove ";

	@OriginalMember(owner = "client!qk", name = "ab", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!qk", name = "gb", descriptor = "Lclient!vq;")
	public static final Class210 aClass210_1 = new Class210();

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method4295(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V")
	public static void method4297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class3_Sub12 local6 = (Class3_Sub12) Static269.aClass127_28.method3402(); local6 != null; local6 = (Class3_Sub12) Static269.aClass127_28.method3400()) {
			Static257.method4355(arg2, arg0, local6, arg1, arg3);
		}
		for (@Pc(35) Class3_Sub12 local35 = (Class3_Sub12) Static102.aClass127_7.method3402(); local35 != null; local35 = (Class3_Sub12) Static102.aClass127_7.method3400()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class54 local44 = local35.aClass5_Sub4_Sub4_Sub2_1.method4201();
			if (local35.aClass5_Sub4_Sub4_Sub2_1.aBoolean285) {
				local39 = 0;
			} else if (local44.anInt1509 == local35.aClass5_Sub4_Sub4_Sub2_1.anInt4911 || local35.aClass5_Sub4_Sub4_Sub2_1.anInt4911 == local44.anInt1491 || local35.aClass5_Sub4_Sub4_Sub2_1.anInt4911 == local44.anInt1505 || local44.anInt1498 == local35.aClass5_Sub4_Sub4_Sub2_1.anInt4911) {
				local39 = 2;
			} else if (local44.anInt1499 == local35.aClass5_Sub4_Sub4_Sub2_1.anInt4911 || local35.aClass5_Sub4_Sub4_Sub2_1.anInt4911 == local44.anInt1473 || local35.aClass5_Sub4_Sub4_Sub2_1.anInt4911 == local44.anInt1475 || local44.anInt1482 == local35.aClass5_Sub4_Sub4_Sub2_1.anInt4911) {
				local39 = 3;
			}
			if (local39 != local35.anInt1266) {
				@Pc(131) int local131 = Static350.method5690(local35.aClass5_Sub4_Sub4_Sub2_1);
				if (local35.anInt1259 != local131) {
					if (local35.aClass3_Sub2_Sub3_2 != null) {
						Static273.aClass3_Sub2_Sub2_2.method1367(local35.aClass3_Sub2_Sub3_2);
						local35.aClass3_Sub2_Sub3_2 = null;
					}
					local35.anInt1259 = local131;
				}
				local35.anInt1266 = local39;
			}
			local35.anInt1261 = local35.aClass5_Sub4_Sub4_Sub2_1.anInt5901;
			local35.anInt1271 = local35.aClass5_Sub4_Sub4_Sub2_1.anInt5901 + local35.aClass5_Sub4_Sub4_Sub2_1.method4208() * 64;
			local35.anInt1272 = local35.aClass5_Sub4_Sub4_Sub2_1.anInt5905;
			local35.anInt1257 = local35.aClass5_Sub4_Sub4_Sub2_1.anInt5905 + local35.aClass5_Sub4_Sub4_Sub2_1.method4208() * 64;
			Static257.method4355(arg2, arg0, local35, arg1, arg3);
		}
		for (@Pc(205) Class3_Sub12 local205 = (Class3_Sub12) Static41.aClass24_2.method595(); local205 != null; local205 = (Class3_Sub12) Static41.aClass24_2.method602()) {
			@Pc(209) byte local209 = 1;
			@Pc(214) Class54 local214 = local205.aClass5_Sub4_Sub4_Sub1_1.method4201();
			if (local205.aClass5_Sub4_Sub4_Sub1_1.aBoolean285) {
				local209 = 0;
			} else if (local214.anInt1509 == local205.aClass5_Sub4_Sub4_Sub1_1.anInt4911 || local205.aClass5_Sub4_Sub4_Sub1_1.anInt4911 == local214.anInt1491 || local205.aClass5_Sub4_Sub4_Sub1_1.anInt4911 == local214.anInt1505 || local214.anInt1498 == local205.aClass5_Sub4_Sub4_Sub1_1.anInt4911) {
				local209 = 2;
			} else if (local214.anInt1499 == local205.aClass5_Sub4_Sub4_Sub1_1.anInt4911 || local205.aClass5_Sub4_Sub4_Sub1_1.anInt4911 == local214.anInt1473 || local214.anInt1475 == local205.aClass5_Sub4_Sub4_Sub1_1.anInt4911 || local214.anInt1482 == local205.aClass5_Sub4_Sub4_Sub1_1.anInt4911) {
				local209 = 3;
			}
			if (local209 != local205.anInt1266) {
				@Pc(317) int local317 = Static286.method4914(local205.aClass5_Sub4_Sub4_Sub1_1);
				if (local205.anInt1259 != local317) {
					if (local205.aClass3_Sub2_Sub3_2 != null) {
						Static273.aClass3_Sub2_Sub2_2.method1367(local205.aClass3_Sub2_Sub3_2);
						local205.aClass3_Sub2_Sub3_2 = null;
					}
					local205.anInt1259 = local317;
				}
				local205.anInt1266 = local209;
			}
			local205.anInt1261 = local205.aClass5_Sub4_Sub4_Sub1_1.anInt5901;
			local205.anInt1271 = local205.aClass5_Sub4_Sub4_Sub1_1.anInt5901 + local205.aClass5_Sub4_Sub4_Sub1_1.method4208() * 64;
			local205.anInt1272 = local205.aClass5_Sub4_Sub4_Sub1_1.anInt5905;
			local205.anInt1257 = local205.aClass5_Sub4_Sub4_Sub1_1.anInt5905 + local205.aClass5_Sub4_Sub4_Sub1_1.method4208() * 64;
			Static257.method4355(arg2, arg0, local205, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V")
	public static void method4298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg1, 14);
		local8.method2509();
		local8.anInt3054 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)V")
	public static void method4300() {
		for (@Pc(3) int local3 = 0; local3 < Static160.aByteArrayArrayArray9.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static160.aByteArrayArrayArray9[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static160.aByteArrayArrayArray9[0][0].length; local11++) {
					Static160.aByteArrayArrayArray9[local3][local7][local11] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)V")
	public static void method4301() {
		Static170.anInt6279 = 0;
		Static116.aClass127_12.method3401();
		Static116.aClass127_12.method3387(Static307.aClass3_Sub26_1);
		Static170.anInt6279++;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)Z")
	public static boolean method4302(@OriginalArg(1) int arg0) {
		@Pc(7) Class58_Sub1 local7 = Static219.method3808(arg0);
		if (local7 == null) {
			return false;
		} else if (Static59.anInt1274 == 3) {
			@Pc(41) String local41 = "";
			if (Static113.anInt6411 != 0) {
				local41 = ":" + (local7.anInt5541 + 7000);
			}
			@Pc(59) String local59 = "";
			if (Static230.aString248 != null) {
				local59 = "/p=" + Static230.aString248;
			}
			@Pc(113) String local113 = "http://" + local7.aString195 + local41 + "/l=" + Static344.anInt6698 + "/a=" + Static329.anInt6344 + local59 + "/j" + (Static341.aBoolean445 ? "1" : "0") + ",o" + (Static352.aBoolean452 ? "1" : "0") + ",a2";
			try {
				Static37.aClient2.getAppletContext().showDocument(new URL(local113), "_self");
				return true;
			} catch (@Pc(123) Exception local123) {
				return false;
			}
		} else {
			Static287.anInt5784 = local7.anInt5541;
			Static346.aString255 = local7.aString195;
			if (Static113.anInt6411 != 0) {
				Static230.anInt6570 = Static287.anInt5784 + 50000;
				Static47.anInt1037 = Static287.anInt5784 + 40000;
				Static342.anInt6677 = Static47.anInt1037;
			}
			return true;
		}
	}
}
