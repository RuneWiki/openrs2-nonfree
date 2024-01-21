import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!me", name = "X", descriptor = "I")
	public static int anInt2975;

	@OriginalMember(owner = "client!me", name = "Z", descriptor = "Lclient!ag;")
	public static Class4 aClass4_72;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!me", name = "R", descriptor = "Lclient!dd;")
	public static Class13 aClass13_986 = Static161.method2971("mapflag");

	@OriginalMember(owner = "client!me", name = "S", descriptor = "Lclient!ld;")
	public static Class47 aClass47_23 = new Class47(64);

	@OriginalMember(owner = "client!me", name = "T", descriptor = "Lclient!nd;")
	private static Class57 aClass57_1 = new Class57();

	@OriginalMember(owner = "client!me", name = "U", descriptor = "Lclient!dd;")
	private static Class13 aClass13_987 = Static161.method2971("Please enter your username)3");

	@OriginalMember(owner = "client!me", name = "V", descriptor = "Lclient!dd;")
	public static Class13 aClass13_988 = aClass13_987;

	@OriginalMember(owner = "client!me", name = "W", descriptor = "I")
	public static int anInt2974 = -1;

	@OriginalMember(owner = "client!me", name = "ab", descriptor = "I")
	public static int anInt2976 = 0;

	@OriginalMember(owner = "client!me", name = "bb", descriptor = "I")
	public static int anInt2977 = 0;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
	public static void method2126() {
		Static1.aClass1_Sub8_Sub1_1.method1654(202);
		for (@Pc(14) Class1_Sub22 local14 = (Class1_Sub22) Static18.aClass45_3.method1982(); local14 != null; local14 = (Class1_Sub22) Static18.aClass45_3.method1986()) {
			if (local14.anInt3979 == 0) {
				Static4.method83(true, local14);
			}
		}
		if (Static89.aClass20_7 != null) {
			Static125.method2300(Static89.aClass20_7);
			Static89.aClass20_7 = null;
		}
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
	public static void method2127() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static53.anInt1722 - 1; local13++) {
				if (Static147.aShortArray41[local13] < 1000 && Static147.aShortArray41[local13 + 1] > 1000) {
					@Pc(33) Class13 local33 = Static164.aClass13Array27[local13];
					local7 = false;
					Static164.aClass13Array27[local13] = Static164.aClass13Array27[local13 + 1];
					Static164.aClass13Array27[local13 + 1] = local33;
					@Pc(53) Class13 local53 = Static58.aClass13Array15[local13];
					Static58.aClass13Array15[local13] = Static58.aClass13Array15[local13 + 1];
					Static58.aClass13Array15[local13 + 1] = local53;
					@Pc(71) int local71 = Static29.anIntArray115[local13];
					Static29.anIntArray115[local13] = Static29.anIntArray115[local13 + 1];
					Static29.anIntArray115[local13 + 1] = local71;
					@Pc(89) int local89 = Static65.anIntArray199[local13];
					Static65.anIntArray199[local13] = Static65.anIntArray199[local13 + 1];
					Static65.anIntArray199[local13 + 1] = local89;
					@Pc(107) short local107 = Static147.aShortArray41[local13];
					Static147.aShortArray41[local13] = Static147.aShortArray41[local13 + 1];
					Static147.aShortArray41[local13 + 1] = local107;
					@Pc(125) long local125 = Static130.aLongArray6[local13];
					Static130.aLongArray6[local13] = Static130.aLongArray6[local13 + 1];
					Static130.aLongArray6[local13 + 1] = local125;
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2128(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static140.aClass42_1);
		arg0.addMouseMotionListener(Static140.aClass42_1);
		arg0.addFocusListener(Static140.aClass42_1);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILclient!dd;)V")
	public static void method2129(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1) {
		Static1.aClass1_Sub8_Sub1_1.method1654(98);
		Static1.aClass1_Sub8_Sub1_1.method1646(arg1.method878());
		Static1.aClass1_Sub8_Sub1_1.method1604(arg0);
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
	public static void method2130() {
		Static39.aClass47_9.method1995();
		Static93.aClass47_20.method1995();
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
	public static void method2131() {
		aClass13_988 = null;
		aClass4_72 = null;
		aClass13_987 = null;
		aClass47_23 = null;
		aBigInteger1 = null;
		aClass13_986 = null;
		aClass57_1 = null;
		Class1_Sub2_Sub12.aLongArray5 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!dd;ZI)V")
	public static void method2132(@OriginalArg(0) Class13 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) short[] local4 = new short[16];
		@Pc(8) Class13 local8 = arg0.method876();
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < anInt2975; local16++) {
			@Pc(22) Class1_Sub2_Sub6 local22 = Static184.method2994(local16);
			if ((!arg1 || local22.aBoolean89) && local22.aClass13_463.method876().method884(local8) != -1) {
				if (local14 >= 250) {
					Static169.aShortArray49 = null;
					Static7.anInt3185 = -1;
					return;
				}
				if (local14 >= local4.length) {
					@Pc(58) short[] local58 = new short[local4.length * 2];
					for (@Pc(60) int local60 = 0; local60 < local14; local60++) {
						local58[local60] = local4[local60];
					}
					local4 = local58;
				}
				local4[local14++] = (short) local16;
			}
		}
		Static7.anInt3185 = local14;
		Static169.aShortArray49 = local4;
		Static137.anInt3410 = 0;
		@Pc(97) Class13[] local97 = new Class13[Static7.anInt3185];
		for (@Pc(99) int local99 = 0; local99 < Static7.anInt3185; local99++) {
			local97[local99] = Static184.method2994(local4[local99]).aClass13_463;
		}
		Static18.method660(Static169.aShortArray49, local97);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B[B)[B")
	public static byte[] method2133(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class1_Sub8 local4 = new Class1_Sub8(arg0);
		@Pc(15) int local15 = local4.method1607();
		@Pc(25) int local25 = local4.method1626();
		if (local25 < 0 || Static89.anInt2504 != 0 && local25 > Static89.anInt2504) {
			throw new RuntimeException();
		} else if (local15 == 0) {
			@Pc(48) byte[] local48 = new byte[local25];
			local4.method1641(local48, local25);
			return local48;
		} else {
			@Pc(62) int local62 = local4.method1626();
			if (local62 < 0 || Static89.anInt2504 != 0 && local62 > Static89.anInt2504) {
				throw new RuntimeException();
			}
			@Pc(86) byte[] local86 = new byte[local62];
			if (local15 == 1) {
				Static76.method1578(local86, local62, arg0, local25);
			} else {
				aClass57_1.method2222(local4, local86);
			}
			return local86;
		}
	}
}
