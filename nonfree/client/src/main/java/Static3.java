import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_12;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
	public static int anInt1282;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "Lclient!ta;")
	public static Class14 aClass14_17;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_13;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "Lclient!ta;")
	public static Class14 aClass14_18;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "Lclient!kc;")
	private static Class36 aClass36_646 = Static14.method2017(" million");

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!kc;")
	public static Class36 aClass36_642 = aClass36_646;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!kc;")
	public static Class36 aClass36_643 = Static14.method2017("gleiten:");

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Lclient!kc;")
	public static Class36 aClass36_644 = Static14.method2017("::fpson");

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
	public static final int anInt1280 = 2301979;

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "Lclient!kc;")
	private static Class36 aClass36_647 = Static14.method2017("Attack");

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Lclient!kc;")
	public static Class36 aClass36_645 = aClass36_647;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "[[[Lclient!bb;")
	public static Class8[][][] aClass8ArrayArrayArray2 = new Class8[4][104][104];

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "Lclient!kc;")
	public static Class36 aClass36_648 = Static14.method2017("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
	public static int anInt1297 = 0;

	@OriginalMember(owner = "client!ac", name = "X", descriptor = "Lclient!kc;")
	public static Class36 aClass36_649 = Static14.method2017("@gr1@");

	@OriginalMember(owner = "client!ac", name = "db", descriptor = "I")
	public static int anInt1302 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ac;Lclient!ac;I)V")
	public static void method924(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		Static32.aClass3_4 = arg1;
		Static45.aClass3_11 = arg0;
		Static26.anInt698 = Static32.aClass3_4.method946(3);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method929() {
		aClass14_18 = null;
		aClass36_643 = null;
		aClass14_17 = null;
		aClass36_647 = null;
		aClass36_645 = null;
		aClass2_Sub1_Sub1_Sub1_12 = null;
		aClass36_648 = null;
		aClass8ArrayArrayArray2 = null;
		aClass2_Sub1_Sub1_Sub1_13 = null;
		aClass36_646 = null;
		aClass36_644 = null;
		aClass36_649 = null;
		aClass36_642 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!wd;IIIIB)V")
	public static void method938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub12 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(21) int local21;
		if (arg5 < 0 || arg5 >= 104 || arg1 < 0 || arg1 >= 104) {
			while (true) {
				local21 = arg2.method1399();
				if (local21 == 0) {
					break;
				}
				if (local21 == 1) {
					arg2.method1399();
					break;
				}
				if (local21 <= 49) {
					arg2.method1399();
				}
			}
			return;
		}
		Static16.aByteArrayArrayArray3[arg6][arg5][arg1] = 0;
		while (true) {
			local21 = arg2.method1399();
			if (local21 == 0) {
				if (arg6 == 0) {
					Static27.anIntArrayArrayArray4[0][arg5][arg1] = -Static10.method213(arg1 + arg0 + 556238, arg5 + (932731 - -arg3)) * 8;
				} else {
					Static27.anIntArrayArrayArray4[arg6][arg5][arg1] = Static27.anIntArrayArrayArray4[arg6 - 1][arg5][arg1] - 240;
				}
				break;
			}
			if (local21 == 1) {
				@Pc(112) int local112 = arg2.method1399();
				if (local112 == 1) {
					local112 = 0;
				}
				if (arg6 == 0) {
					Static27.anIntArrayArrayArray4[0][arg5][arg1] = -local112 * 8;
				} else {
					Static27.anIntArrayArrayArray4[arg6][arg5][arg1] = Static27.anIntArrayArrayArray4[arg6 - 1][arg5][arg1] - local112 * 8;
				}
				break;
			}
			if (local21 <= 49) {
				Static89.aByteArrayArrayArray8[arg6][arg5][arg1] = arg2.method1406();
				Static111.aByteArrayArrayArray9[arg6][arg5][arg1] = (byte) ((local21 - 2) / 4);
				Static10.aByteArrayArrayArray2[arg6][arg5][arg1] = (byte) (local21 + arg4 - 2 & 0x3);
			} else if (local21 <= 81) {
				Static16.aByteArrayArrayArray3[arg6][arg5][arg1] = (byte) (local21 - 49);
			} else {
				Static22.aByteArrayArrayArray4[arg6][arg5][arg1] = (byte) (local21 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	public static void method941() {
		Static56.aClass60_1.anInt2366 = 0;
		Static103.aBoolean123 = true;
		Static10.aLong7 = 0L;
		Static73.anInt1836 = 0;
		Static22.aBoolean22 = true;
		Static82.method1499();
		Static7.anInt191 = 0;
		Static42.aClass2_Sub12_Sub1_1.anInt1939 = 0;
		Static1.anInt2 = 0;
		Static43.anInt1141 = 0;
		Static92.aClass2_Sub12_Sub1_3.anInt1939 = 0;
		Static10.anInt253 = -1;
		Static112.anInt2926 = -1;
		Static15.anInt318 = -1;
		Static33.anInt426 = -1;
		Static42.anInt1111 = 0;
		Static73.aBoolean82 = false;
		Static10.anInt243 = 0;
		Static50.method964(0);
		for (@Pc(1817) int local1817 = 0; local1817 < 100; local1817++) {
			Static99.aClass36Array35[local1817] = null;
		}
		Static57.anInt1504 = (int) (Math.random() * 110.0D) - 55;
		Static63.anInt1623 = (int) (Math.random() * 100.0D) - 50;
		Static115.anInt1793 = 0;
		Static22.anInt576 = 0;
		Static65.anInt1689 = 0;
		Static47.anInt1242 = -1;
		Static25.anInt633 = (int) (Math.random() * 80.0D) - 40;
		Static14.anInt2903 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static65.anInt1672 = (int) (Math.random() * 120.0D) - 60;
		Static7.anInt194 = (int) (Math.random() * 30.0D) - 20;
		Static20.anInt500 = 0;
		Static45.anInt1227 = 0;
		Static78.anInt2040 = 0;
		Static56.aBoolean70 = false;
		Static108.anInt2775 = 0;
		for (@Pc(1897) int local1897 = 0; local1897 < 2048; local1897++) {
			Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local1897] = null;
			Static55.aClass2_Sub12Array3[local1897] = null;
		}
		for (@Pc(1915) int local1915 = 0; local1915 < 32768; local1915++) {
			Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local1915] = null;
		}
		Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[2047] = new Class2_Sub1_Sub4_Sub2_Sub2();
		Static59.aClass8_4.method179();
		Static71.aClass8_5.method179();
		@Pc(1955) int local1955;
		@Pc(1959) int local1959;
		for (@Pc(1951) int local1951 = 0; local1951 < 4; local1951++) {
			for (local1955 = 0; local1955 < 104; local1955++) {
				for (local1959 = 0; local1959 < 104; local1959++) {
					aClass8ArrayArrayArray2[local1951][local1955][local1959] = null;
				}
			}
		}
		Static39.aClass8_2 = new Class8();
		Static106.anInt2726 = 0;
		Static7.anInt189 = 0;
		for (local1955 = 0; local1955 < Static97.anInt2572; local1955++) {
			@Pc(2001) Class2_Sub1_Sub16 local2001 = Static36.method733(local1955);
			if (local2001 != null && local2001.anInt2564 == 0) {
				Static107.anIntArray331[local1955] = 0;
				Static4.anIntArray14[local1955] = 0;
			}
		}
		Static71.method1275(Static39.anInt980);
		Static39.anInt980 = -1;
		Static71.method1275(Static49.anInt1312);
		Static49.anInt1312 = -1;
		Static71.method1275(Static78.anInt2037);
		Static78.anInt2037 = -1;
		Static71.method1275(Static46.anInt1229);
		Static46.anInt1229 = -1;
		Static71.method1275(Static9.anInt237);
		Static9.anInt237 = -1;
		Static71.method1275(Static94.anInt2471);
		Static94.anInt2471 = -1;
		Static71.method1275(Static32.anInt900);
		Static73.aBoolean82 = false;
		Static80.anInt2060 = -1;
		Static90.aClass36_1092 = null;
		Static32.anInt900 = -1;
		Static32.anInt910 = 0;
		Static109.anInt2825 = 3;
		Static16.aBoolean8 = false;
		Static38.anInt968 = -1;
		Static15.anInt314 = 0;
		Static47.aClass67_1.method1996(-1, false, null, new int[5]);
		for (local1959 = 0; local1959 < 5; local1959++) {
			Static45.aClass36Array22[local1959] = null;
			Static66.aBooleanArray11[local1959] = false;
		}
		Static14.method2021();
		Static94.aBoolean110 = true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[B)[B")
	public static byte[] method944(@OriginalArg(1) byte[] arg0) {
		@Pc(20) Class2_Sub12 local20 = new Class2_Sub12(arg0);
		@Pc(24) int local24 = local20.method1399();
		@Pc(28) int local28 = local20.method1412();
		if (local28 < 0 || Static61.anInt1608 != 0 && Static61.anInt1608 < local28) {
			throw new RuntimeException();
		} else if (local24 == 0) {
			@Pc(109) byte[] local109 = new byte[local28];
			local20.method1414(local109, local28);
			return local109;
		} else {
			@Pc(49) int local49 = local20.method1412();
			if (local49 < 0 || Static61.anInt1608 != 0 && local49 > Static61.anInt1608) {
				throw new RuntimeException();
			}
			@Pc(70) byte[] local70 = new byte[local49];
			if (local24 == 1) {
				Static75.method1440(local70, local49, arg0, local28);
			} else {
				try {
					@Pc(96) DataInputStream local96 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local28)));
					local96.readFully(local70);
					local96.close();
				} catch (@Pc(103) IOException local103) {
				}
			}
			return local70;
		}
	}
}
