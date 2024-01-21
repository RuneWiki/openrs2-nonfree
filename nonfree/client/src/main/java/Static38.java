import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!he", name = "G", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_8;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "Lclient!fb;")
	public static Canvas_Sub1 aCanvas_Sub1_1;

	@OriginalMember(owner = "client!he", name = "J", descriptor = "Lclient!lc;")
	public static Class31 aClass31_516 = Static56.method1206("huffman");

	@OriginalMember(owner = "client!he", name = "K", descriptor = "Lclient!fe;")
	public static Class17 aClass17_58 = new Class17(64);

	@OriginalMember(owner = "client!he", name = "L", descriptor = "I")
	public static int anInt1428 = 0;

	@OriginalMember(owner = "client!he", name = "M", descriptor = "[I")
	public static int[] anIntArray229 = new int[256];

	@OriginalMember(owner = "client!he", name = "N", descriptor = "Lclient!lc;")
	public static Class31 aClass31_517 = Static56.method1206("Bad session id)3");

	@OriginalMember(owner = "client!he", name = "O", descriptor = "Lclient!lc;")
	public static Class31 aClass31_518 = Static56.method1206("@cr1@");

	@OriginalMember(owner = "client!he", name = "P", descriptor = "Lclient!lc;")
	public static Class31 aClass31_519 = Static56.method1206("To extend or cancel a subscription:*6n1(Y Logout and return to the frontpage of this website)3*6n2(YChoose the relevant option from the (Wmembership(W section)3*6n*6nNote: If you are a credit card subscriber a top)2up payment will*6nautomatically be taken when 3 days credit remain)3*6n(Xunless you cancel your subscription)1 which can be done at any time)3(Y");

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
	public static int anInt1429 = 0;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	public static void method986() {
		aClass31_519 = null;
		aClass17_58 = null;
		aClass31_516 = null;
		aClass31_518 = null;
		aClass31_517 = null;
		aCanvas_Sub1_1 = null;
		anIntArray229 = null;
		aClass2_Sub1_Sub3_Sub1_8 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!ib;)V")
	public static void method987(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub4_Sub6 arg1) {
		if (arg1.anInt2006 < 128 || arg1.anInt2011 < 128 || arg1.anInt2006 >= 13184 || arg1.anInt2011 >= 13184) {
			arg1.anInt2014 = -1;
			arg1.anInt2027 = 0;
			arg1.anInt2018 = 0;
			arg1.anInt1995 = -1;
			arg1.anInt2006 = arg1.anIntArray281[0] * 128 + arg1.anInt1994 * 64;
			arg1.anInt2011 = arg1.anInt1994 * 64 + arg1.anIntArray285[0] * 128;
			arg1.method1271();
		}
		if (arg1 == Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1 && (arg1.anInt2006 < 1536 || arg1.anInt2011 < 1536 || arg1.anInt2006 >= 11776 || arg1.anInt2011 >= 11776)) {
			arg1.anInt1995 = -1;
			arg1.anInt2018 = 0;
			arg1.anInt2014 = -1;
			arg1.anInt2027 = 0;
			arg1.anInt2006 = arg1.anIntArray281[0] * 128 + arg1.anInt1994 * 64;
			arg1.anInt2011 = arg1.anIntArray285[0] * 128 + arg1.anInt1994 * 64;
			arg1.method1271();
		}
		if (arg1.anInt2018 > Static49.anInt2694) {
			Static34.method873(arg1);
		} else if (Static49.anInt2694 <= arg1.anInt2027) {
			Static28.method780(arg1);
		} else {
			Static12.method364(arg1);
		}
		Static76.method1414(arg1);
		Static8.method199(arg1);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!jc;ILclient!jc;I)V")
	public static void method988(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2) throws IOException {
		@Pc(6) byte[] local6 = arg0.method1071(arg1);
		if (local6 == null) {
			return;
		}
		@Pc(19) int local19 = 0;
		@Pc(22) byte[] local22 = new byte[1000];
		@Pc(27) int local27 = local6.length - 2;
		@Pc(35) GZIPInputStream local35 = new GZIPInputStream(new ByteArrayInputStream(local6));
		while (true) {
			@Pc(42) int local42 = local35.read(local22, 0, local22.length);
			if (local42 == -1) {
				@Pc(58) byte[] local58 = new byte[local6.length + 9];
				Static112.method991(local6, 0, local58, 9, local6.length);
				@Pc(70) Class2_Sub6 local70 = new Class2_Sub6(local58);
				local70.method637(2);
				local70.method666(local27);
				local70.method666(local19);
				local70.anInt952 = local58.length - 2;
				@Pc(94) int local94 = local70.method627();
				local70.anInt952 = local58.length - 2;
				local70.method648(local94 - 1);
				arg2.method1074(arg1, local58, local58.length);
				return;
			}
			local19 += local42;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIBI)V")
	public static void method989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (!Static10.aBoolean28) {
			arg4 = 0;
		}
		if (arg1 == Static103.anInt2767 && arg3 == Static76.anInt2252 && arg4 == Static87.anInt2341) {
			return;
		}
		Static76.anInt2252 = arg3;
		Static87.anInt2341 = arg4;
		Static103.anInt2767 = arg1;
		Static75.method1404(25);
		Static59.method1283(false, Static40.aClass31_712, null);
		@Pc(35) int local35 = Static47.anInt1730;
		@Pc(37) int local37 = Static25.anInt1103;
		Static25.anInt1103 = arg1 * 8 - 48;
		Static47.anInt1730 = arg3 * 8 - 48;
		@Pc(53) int local53 = Static25.anInt1103 - local37;
		@Pc(59) int local59 = Static47.anInt1730 - local35;
		for (@Pc(63) int local63 = 0; local63 < 16384; local63++) {
			@Pc(69) Class2_Sub1_Sub4_Sub6_Sub2 local69 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local63];
			if (local69 != null) {
				for (@Pc(73) int local73 = 0; local73 < 10; local73++) {
					local69.anIntArray281[local73] -= local53;
					local69.anIntArray285[local73] -= local59;
				}
				local69.anInt2006 -= local53 * 128;
				local69.anInt2011 -= local59 * 128;
			}
		}
		for (@Pc(117) int local117 = 0; local117 < 2048; local117++) {
			@Pc(123) Class2_Sub1_Sub4_Sub6_Sub1 local123 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local117];
			if (local123 != null) {
				for (@Pc(127) int local127 = 0; local127 < 10; local127++) {
					local123.anIntArray281[local127] -= local53;
					local123.anIntArray285[local127] -= local59;
				}
				local123.anInt2011 -= local59 * 128;
				local123.anInt2006 -= local53 * 128;
			}
		}
		Static58.anInt1945 = arg4;
		@Pc(177) byte local177 = 104;
		@Pc(179) byte local179 = 0;
		Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.method1278(false, arg0, arg2);
		@Pc(187) byte local187 = 1;
		@Pc(189) byte local189 = 104;
		@Pc(191) byte local191 = 0;
		@Pc(198) byte local198 = 1;
		if (local59 < 0) {
			local191 = 103;
			local198 = -1;
			local189 = -1;
		}
		if (local53 < 0) {
			local179 = 103;
			local187 = -1;
			local177 = -1;
		}
		for (@Pc(219) int local219 = local179; local219 != local177; local219 += local187) {
			for (@Pc(223) int local223 = local191; local223 != local189; local223 += local198) {
				@Pc(230) int local230 = local219 + local53;
				@Pc(234) int local234 = local59 + local223;
				for (@Pc(236) int local236 = 0; local236 < 4; local236++) {
					if (local230 >= 0 && local234 >= 0 && local230 < 104 && local234 < 104) {
						Static78.aClass36ArrayArrayArray1[local236][local219][local223] = Static78.aClass36ArrayArrayArray1[local236][local230][local234];
					} else {
						Static78.aClass36ArrayArrayArray1[local236][local219][local223] = null;
					}
				}
			}
		}
		for (@Pc(297) Class2_Sub3 local297 = (Class2_Sub3) Static62.aClass36_5.method1365(); local297 != null; local297 = (Class2_Sub3) Static62.aClass36_5.method1361()) {
			local297.anInt355 -= local53;
			local297.anInt363 -= local59;
			if (local297.anInt355 < 0 || local297.anInt363 < 0 || local297.anInt355 >= 104 || local297.anInt363 >= 104) {
				local297.method1695();
			}
		}
		Static95.aBoolean133 = false;
		Static41.anInt1578 = -1;
		if (Static85.anInt2509 != 0) {
			Static8.anInt302 -= local59;
			Static85.anInt2509 -= local53;
		}
		Static55.aClass36_4.method1356();
		Static11.aClass36_1.method1356();
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
	public static void method990() {
		Static61.aClass17_78.method782();
		Static57.aClass17_96.method782();
	}
}
