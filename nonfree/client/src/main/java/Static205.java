import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "[I")
	private static int[] anIntArray396;

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "Lclient!gba;")
	private static Class115 aClass115_10;

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "Lclient!sd;")
	private static Class301 aClass301_1;

	@OriginalMember(owner = "client!ht", name = "q", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray16;

	@OriginalMember(owner = "client!ht", name = "v", descriptor = "Lclient!gba;")
	private static Class115 aClass115_11;

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
	private static int anInt4284 = 0;

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "[I")
	private static final int[] anIntArray397 = new int[5];

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "[Lclient!gs;")
	private static final Class128[] aClass128Array1 = new Class128[50];

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
	private static int anInt4293 = 0;

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray17 = new String[1000];

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "[I")
	private static final int[] anIntArray398 = new int[1000];

	@OriginalMember(owner = "client!ht", name = "w", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "[[I")
	private static final int[][] anIntArrayArray49 = new int[5][5000];

	@OriginalMember(owner = "client!ht", name = "y", descriptor = "I")
	private static int anInt4294 = 0;

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "[I")
	private static final int[] anIntArray399 = new int[3];

	@OriginalMember(owner = "client!ht", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray18 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ht", name = "B", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_33 = new Class223(4);

	@OriginalMember(owner = "client!ht", name = "C", descriptor = "I")
	private static int anInt4295 = 0;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!dm;I)V")
	private static void method3629(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray3;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class4_Sub7_Sub18 local12 = Static314.method7736(local8);
		if (local12 == null) {
			return;
		}
		anIntArray396 = new int[local12.anInt9701];
		@Pc(21) int local21 = 0;
		aStringArray16 = new String[local12.anInt9703];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2447;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2451;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass115_5 == null ? -1 : arg0.aClass115_5.anInt3464;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2449;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass115_5 == null ? -1 : arg0.aClass115_5.anInt3517;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass115_4 == null ? -1 : arg0.aClass115_4.anInt3464;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass115_4 == null ? -1 : arg0.aClass115_4.anInt3517;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2450;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2448;
				}
				anIntArray396[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString20;
				}
				aStringArray16[local27++] = local135;
			}
		}
		anInt4295 = arg0.anInt2445;
		method3635(local12, arg1);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!jv;II)V")
	public static void method3630(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class4_Sub7_Sub18 local5 = Static77.method1365(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray396 = new int[local5.anInt9701];
		aStringArray16 = new String[local5.anInt9703];
		if (local5.aClass182_9 == Static285.aClass182_6 || local5.aClass182_9 == Static75.aClass182_1 || local5.aClass182_9 == Static236.aClass182_5) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static593.aClass115_15 != null) {
				local30 = Static593.aClass115_15.anInt3456;
				local32 = Static593.aClass115_15.anInt3458;
			}
			anIntArray396[0] = Static86.aClass50_1.method7100() - local30;
			anIntArray396[1] = Static86.aClass50_1.method7102() - local32;
		}
		method3635(local5, 200000);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZ)V")
	private static void method3631(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class4_Sub41 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray398[anInt4294++] = Static290.anInt5384;
				return;
			}
			if (arg0 == 5001) {
				anInt4294 -= 3;
				Static290.anInt5384 = anIntArray398[anInt4294];
				Static472.aClass104_4 = Static390.method5715(anIntArray398[anInt4294 + 1]);
				if (Static472.aClass104_4 == null) {
					Static472.aClass104_4 = Static120.aClass104_1;
				}
				Static466.anInt7872 = anIntArray398[anInt4294 + 2];
				local52 = Static128.method2707(Static227.aClass61_51, Class16_Sub3.lb);
				local52.aClass4_Sub9_Sub1_3.method5961(-345277664, Static290.anInt5384);
				local52.aClass4_Sub9_Sub1_3.method5961(-345277664, Static472.aClass104_4.anInt3141);
				local52.aClass4_Sub9_Sub1_3.method5961(-345277664, Static466.anInt7872);
				Static551.method7603(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt4284 -= 2;
				local83 = aStringArray17[anInt4284];
				local89 = aStringArray17[anInt4284 + 1];
				anInt4294 -= 2;
				local97 = anIntArray398[anInt4294];
				local103 = anIntArray398[anInt4294 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class4_Sub41 local125 = Static128.method2707(Static34.aClass61_126, Class16_Sub3.lb);
				local125.aClass4_Sub9_Sub1_3.method5961(-345277664, Static509.method7221(local83) + Static509.method7221(local89) + 2);
				local125.aClass4_Sub9_Sub1_3.method6000(local83);
				local125.aClass4_Sub9_Sub1_3.method5961(-345277664, local97 - 1);
				local125.aClass4_Sub9_Sub1_3.method5961(-345277664, local103);
				local125.aClass4_Sub9_Sub1_3.method6000(local89);
				Static551.method7603(local125);
				return;
			}
			@Pc(179) Class138 local179;
			if (arg0 == 5003) {
				local175 = anIntArray398[--anInt4294];
				local179 = Static525.method7330(local175);
				local181 = "";
				if (local179 != null && local179.aString38 != null) {
					local181 = local179.aString38;
				}
				aStringArray17[anInt4284++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray398[--anInt4294];
				local179 = Static525.method7330(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3979;
				}
				anIntArray398[anInt4294++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static472.aClass104_4 == null) {
					anIntArray398[anInt4294++] = -1;
					return;
				}
				anIntArray398[anInt4294++] = Static472.aClass104_4.anInt3141;
				return;
			}
			@Pc(269) Class4_Sub41 local269;
			if (arg0 == 5006) {
				local175 = anIntArray398[--anInt4294];
				local269 = Static128.method2707(Static46.aClass61_11, Class16_Sub3.lb);
				local269.aClass4_Sub9_Sub1_3.method5961(-345277664, local175);
				Static551.method7603(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray17[--anInt4284];
				method3633(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt4284 -= 2;
				local83 = aStringArray17[anInt4284];
				local89 = aStringArray17[anInt4284 + 1];
				if (Static540.anInt9129 != 0 || (!Static448.aBoolean537 || Static251.aBoolean372) && !Static266.aBoolean387) {
					@Pc(328) Class4_Sub41 local328 = Static128.method2707(Static478.aClass61_110, Class16_Sub3.lb);
					local328.aClass4_Sub9_Sub1_3.method5961(-345277664, 0);
					local103 = local328.aClass4_Sub9_Sub1_3.anInt7219;
					local328.aClass4_Sub9_Sub1_3.method6000(local83);
					Static185.method7126(local328.aClass4_Sub9_Sub1_3, local89);
					local328.aClass4_Sub9_Sub1_3.method6028(local328.aClass4_Sub9_Sub1_3.anInt7219 - local103);
					Static551.method7603(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray398[--anInt4294];
				local179 = Static525.method7330(local175);
				local181 = "";
				if (local179 != null && local179.aString37 != null) {
					local181 = local179.aString37;
				}
				aStringArray17[anInt4284++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray398[--anInt4294];
				local179 = Static525.method7330(local175);
				local181 = "";
				if (local179 != null && local179.aString36 != null) {
					local181 = local179.aString36;
				}
				aStringArray17[anInt4284++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray398[--anInt4294];
				local179 = Static525.method7330(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3978;
				}
				anIntArray398[anInt4294++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static129.aClass10_Sub1_Sub2_Sub2_1 == null || Static129.aClass10_Sub1_Sub2_Sub2_1.aString92 == null) {
					local83 = Static39.aString11;
				} else {
					local83 = Static129.aClass10_Sub1_Sub2_Sub2_1.method7047();
				}
				aStringArray17[anInt4284++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray398[anInt4294++] = Static466.anInt7872;
				return;
			}
			if (arg0 == 5017) {
				anIntArray398[anInt4294++] = Static497.method7069();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray398[--anInt4294];
				local179 = Static525.method7330(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt3973;
				}
				anIntArray398[anInt4294++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray398[--anInt4294];
				local179 = Static525.method7330(local175);
				local181 = "";
				if (local179 != null && local179.aString40 != null) {
					local181 = local179.aString40;
				}
				aStringArray17[anInt4284++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static129.aClass10_Sub1_Sub2_Sub2_1 == null || Static129.aClass10_Sub1_Sub2_Sub2_1.aString92 == null) {
					local83 = Static39.aString11;
				} else {
					local83 = Static129.aClass10_Sub1_Sub2_Sub2_1.method7042();
				}
				aStringArray17[anInt4284++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray398[--anInt4294];
				local179 = Static525.method7330(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3977;
				}
				anIntArray398[anInt4294++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray398[--anInt4294];
				local179 = Static525.method7330(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3974;
				}
				anIntArray398[anInt4294++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray398[--anInt4294];
				local179 = Static525.method7330(local175);
				local181 = "";
				if (local179 != null && local179.aString39 != null) {
					local181 = local179.aString39;
				}
				aStringArray17[anInt4284++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray398[--anInt4294];
				aStringArray17[anInt4284++] = Static560.aClass51_1.method888(local175).aString10;
				return;
			}
			@Pc(736) Class4_Sub7_Sub1 local736;
			if (arg0 == 5051) {
				local175 = anIntArray398[--anInt4294];
				local736 = Static560.aClass51_1.method888(local175);
				if (local736.anIntArray120 == null) {
					anIntArray398[anInt4294++] = 0;
					return;
				}
				anIntArray398[anInt4294++] = local736.anIntArray120.length;
				return;
			}
			if (arg0 == 5052) {
				anInt4294 -= 2;
				local175 = anIntArray398[anInt4294];
				local776 = anIntArray398[anInt4294 + 1];
				@Pc(781) Class4_Sub7_Sub1 local781 = Static560.aClass51_1.method888(local175);
				local103 = local781.anIntArray120[local776];
				anIntArray398[anInt4294++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray398[--anInt4294];
				local736 = Static560.aClass51_1.method888(local175);
				if (local736.anIntArray121 == null) {
					anIntArray398[anInt4294++] = 0;
					return;
				}
				anIntArray398[anInt4294++] = local736.anIntArray121.length;
				return;
			}
			if (arg0 == 5054) {
				anInt4294 -= 2;
				local175 = anIntArray398[anInt4294];
				local776 = anIntArray398[anInt4294 + 1];
				anIntArray398[anInt4294++] = Static560.aClass51_1.method888(local175).anIntArray121[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray398[--anInt4294];
				aStringArray17[anInt4284++] = Static320.aClass363_1.method8038(local175).method7163();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray398[--anInt4294];
				@Pc(907) Class4_Sub7_Sub16 local907 = Static320.aClass363_1.method8038(local175);
				if (local907.anIntArray667 == null) {
					anIntArray398[anInt4294++] = 0;
					return;
				}
				anIntArray398[anInt4294++] = local907.anIntArray667.length;
				return;
			}
			if (arg0 == 5057) {
				anInt4294 -= 2;
				local175 = anIntArray398[anInt4294];
				local776 = anIntArray398[anInt4294 + 1];
				anIntArray398[anInt4294++] = Static320.aClass363_1.method8038(local175).anIntArray667[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass301_1 = new Class301();
				aClass301_1.anInt8051 = anIntArray398[--anInt4294];
				aClass301_1.aClass4_Sub7_Sub16_1 = Static320.aClass363_1.method8038(aClass301_1.anInt8051);
				aClass301_1.anIntArray638 = new int[aClass301_1.aClass4_Sub7_Sub16_1.method7166()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static128.method2707(Static32.aClass61_7, Class16_Sub3.lb);
				local52.aClass4_Sub9_Sub1_3.method5961(-345277664, 0);
				local776 = local52.aClass4_Sub9_Sub1_3.anInt7219;
				local52.aClass4_Sub9_Sub1_3.method5961(-345277664, 0);
				local52.aClass4_Sub9_Sub1_3.method6012(aClass301_1.anInt8051);
				aClass301_1.aClass4_Sub7_Sub16_1.method7162(aClass301_1.anIntArray638, local52.aClass4_Sub9_Sub1_3);
				local52.aClass4_Sub9_Sub1_3.method6028(local52.aClass4_Sub9_Sub1_3.anInt7219 - local776);
				Static551.method7603(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray17[--anInt4284];
				local269 = Static128.method2707(Static88.aClass61_20, Class16_Sub3.lb);
				local269.aClass4_Sub9_Sub1_3.method5961(-345277664, 0);
				local97 = local269.aClass4_Sub9_Sub1_3.anInt7219;
				local269.aClass4_Sub9_Sub1_3.method6000(local83);
				local269.aClass4_Sub9_Sub1_3.method6012(aClass301_1.anInt8051);
				aClass301_1.aClass4_Sub7_Sub16_1.method7162(aClass301_1.anIntArray638, local269.aClass4_Sub9_Sub1_3);
				local269.aClass4_Sub9_Sub1_3.method6028(local269.aClass4_Sub9_Sub1_3.anInt7219 - local97);
				Static551.method7603(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static128.method2707(Static32.aClass61_7, Class16_Sub3.lb);
				local52.aClass4_Sub9_Sub1_3.method5961(-345277664, 0);
				local776 = local52.aClass4_Sub9_Sub1_3.anInt7219;
				local52.aClass4_Sub9_Sub1_3.method5961(-345277664, 1);
				local52.aClass4_Sub9_Sub1_3.method6012(aClass301_1.anInt8051);
				aClass301_1.aClass4_Sub7_Sub16_1.method7162(aClass301_1.anIntArray638, local52.aClass4_Sub9_Sub1_3);
				local52.aClass4_Sub9_Sub1_3.method6028(local52.aClass4_Sub9_Sub1_3.anInt7219 - local776);
				Static551.method7603(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt4294 -= 2;
				local175 = anIntArray398[anInt4294];
				local776 = anIntArray398[anInt4294 + 1];
				anIntArray398[anInt4294++] = Static560.aClass51_1.method888(local175).aCharArray1[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt4294 -= 2;
				local175 = anIntArray398[anInt4294];
				local776 = anIntArray398[anInt4294 + 1];
				anIntArray398[anInt4294++] = Static560.aClass51_1.method888(local175).aCharArray2[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt4294 -= 2;
				local175 = anIntArray398[anInt4294];
				local776 = anIntArray398[anInt4294 + 1];
				if (local776 == -1) {
					anIntArray398[anInt4294++] = -1;
					return;
				}
				anIntArray398[anInt4294++] = Static560.aClass51_1.method888(local175).method597((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt4294 -= 2;
				local175 = anIntArray398[anInt4294];
				local776 = anIntArray398[anInt4294 + 1];
				if (local776 == -1) {
					anIntArray398[anInt4294++] = -1;
					return;
				}
				anIntArray398[anInt4294++] = Static560.aClass51_1.method888(local175).method604((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray398[--anInt4294];
				anIntArray398[anInt4294++] = Static320.aClass363_1.method8038(local175).method7166();
				return;
			}
			if (arg0 == 5067) {
				anInt4294 -= 2;
				local175 = anIntArray398[anInt4294];
				local776 = anIntArray398[anInt4294 + 1];
				local97 = Static320.aClass363_1.method8038(local175).method7161(local776).anInt5497;
				anIntArray398[anInt4294++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt4294 -= 2;
				local175 = anIntArray398[anInt4294];
				local776 = anIntArray398[anInt4294 + 1];
				aClass301_1.anIntArray638[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt4294 -= 2;
				local175 = anIntArray398[anInt4294];
				local776 = anIntArray398[anInt4294 + 1];
				aClass301_1.anIntArray638[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt4294 -= 3;
				local175 = anIntArray398[anInt4294];
				local776 = anIntArray398[anInt4294 + 1];
				local97 = anIntArray398[anInt4294 + 2];
				@Pc(1448) Class4_Sub7_Sub16 local1448 = Static320.aClass363_1.method8038(local175);
				if (local1448.method7161(local776).anInt5497 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray398[anInt4294++] = local1448.method7165(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray17[--anInt4284];
				local1496 = anIntArray398[--anInt4294] == 1;
				Static158.method3138(local83, local1496);
				anIntArray398[anInt4294++] = Static3.anInt32;
				return;
			}
			if (arg0 == 5072) {
				if (Static556.aShortArray132 != null && Static178.anInt3781 < Static3.anInt32) {
					anIntArray398[anInt4294++] = Static556.aShortArray132[Static178.anInt3781++] & 0xFFFF;
					return;
				}
				anIntArray398[anInt4294++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static178.anInt3781 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static12.aClass173_1.method6259(86)) {
					anIntArray398[anInt4294++] = 1;
					return;
				}
				anIntArray398[anInt4294++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static12.aClass173_1.method6259(82)) {
					anIntArray398[anInt4294++] = 1;
					return;
				}
				anIntArray398[anInt4294++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static12.aClass173_1.method6259(81)) {
					anIntArray398[anInt4294++] = 1;
					return;
				}
				anIntArray398[anInt4294++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static72.method1295(anIntArray398[--anInt4294]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray398[anInt4294++] = Static367.method6796();
					return;
				}
				if (arg0 == 5205) {
					Static122.method6962(-1, anIntArray398[--anInt4294], false, -1);
					return;
				}
				@Pc(1696) Class4_Sub7_Sub13 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray398[--anInt4294];
					local1696 = Static392.method7245(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray398[anInt4294++] = -1;
						return;
					}
					anIntArray398[anInt4294++] = local1696.anInt6629;
					return;
				}
				@Pc(1729) Class4_Sub7_Sub13 local1729;
				if (arg0 == 5207) {
					local1729 = Static392.method7244(anIntArray398[--anInt4294]);
					if (local1729 != null && local1729.aString77 != null) {
						aStringArray17[anInt4284++] = local1729.aString77;
						return;
					}
					aStringArray17[anInt4284++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray398[anInt4294++] = Static38.anInt742;
					anIntArray398[anInt4294++] = Static357.anInt6211;
					return;
				}
				if (arg0 == 5209) {
					anIntArray398[anInt4294++] = Static397.anInt6936 + Static392.anInt8797;
					anIntArray398[anInt4294++] = Static470.anInt7923 + Static392.anInt8804;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray398[--anInt4294];
					local1696 = Static392.method7244(local175);
					if (local1696 == null) {
						anIntArray398[anInt4294++] = 0;
						anIntArray398[anInt4294++] = 0;
						return;
					}
					anIntArray398[anInt4294++] = local1696.anInt6623 >> 14 & 0x3FFF;
					anIntArray398[anInt4294++] = local1696.anInt6623 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray398[--anInt4294];
					local1696 = Static392.method7244(local175);
					if (local1696 == null) {
						anIntArray398[anInt4294++] = 0;
						anIntArray398[anInt4294++] = 0;
						return;
					}
					anIntArray398[anInt4294++] = local1696.anInt6630 - local1696.anInt6626;
					anIntArray398[anInt4294++] = local1696.anInt6619 - local1696.anInt6625;
					return;
				}
				@Pc(1919) Class4_Sub48 local1919;
				if (arg0 == 5212) {
					local1919 = Static3.method61();
					if (local1919 == null) {
						anIntArray398[anInt4294++] = -1;
						anIntArray398[anInt4294++] = -1;
						return;
					}
					anIntArray398[anInt4294++] = local1919.anInt8895;
					local776 = local1919.anInt8894 << 28 | local1919.anInt8896 + Static392.anInt8797 << 14 | local1919.anInt8900 + Static392.anInt8804;
					anIntArray398[anInt4294++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static447.method6308();
					if (local1919 == null) {
						anIntArray398[anInt4294++] = -1;
						anIntArray398[anInt4294++] = -1;
						return;
					}
					anIntArray398[anInt4294++] = local1919.anInt8895;
					local776 = local1919.anInt8894 << 28 | local1919.anInt8896 + Static392.anInt8797 << 14 | local1919.anInt8900 + Static392.anInt8804;
					anIntArray398[anInt4294++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray398[--anInt4294];
					local1696 = Static453.method6410();
					if (local1696 != null) {
						local2067 = local1696.method5528(local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, anIntArray399, local175 & 0x3FFF);
						if (local2067) {
							Static483.method6713(anIntArray399[2], anIntArray399[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt4294 -= 2;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					@Pc(2105) Class286 local2105 = Static392.method7241(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class4_Sub7_Sub13 local2112 = (Class4_Sub7_Sub13) local2105.method6403(); local2112 != null; local2112 = (Class4_Sub7_Sub13) local2105.method6414()) {
						if (local2112.anInt6629 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray398[anInt4294++] = 1;
						return;
					}
					anIntArray398[anInt4294++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray398[--anInt4294];
					local1696 = Static392.method7244(local175);
					if (local1696 == null) {
						anIntArray398[anInt4294++] = -1;
						return;
					}
					anIntArray398[anInt4294++] = local1696.anInt6627;
					return;
				}
				if (arg0 == 5220) {
					anIntArray398[anInt4294++] = Static355.anInt6196 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray398[--anInt4294];
					Static483.method6713(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static453.method6410();
					if (local1729 != null) {
						local1496 = local1729.method5524(anIntArray399, Static397.anInt6936 + Static392.anInt8797, Static470.anInt7923 + Static392.anInt8804);
						if (local1496) {
							anIntArray398[anInt4294++] = anIntArray399[1];
							anIntArray398[anInt4294++] = anIntArray399[2];
							return;
						}
						anIntArray398[anInt4294++] = -1;
						anIntArray398[anInt4294++] = -1;
						return;
					}
					anIntArray398[anInt4294++] = -1;
					anIntArray398[anInt4294++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt4294 -= 2;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					Static122.method6962(local776 >> 14 & 0x3FFF, local175, false, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray398[--anInt4294];
					local1696 = Static453.method6410();
					if (local1696 != null) {
						local2067 = local1696.method5528(local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, anIntArray399, local175 & 0x3FFF);
						if (local2067) {
							anIntArray398[anInt4294++] = anIntArray399[1];
							anIntArray398[anInt4294++] = anIntArray399[2];
							return;
						}
						anIntArray398[anInt4294++] = -1;
						anIntArray398[anInt4294++] = -1;
						return;
					}
					anIntArray398[anInt4294++] = -1;
					anIntArray398[anInt4294++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray398[--anInt4294];
					local1696 = Static453.method6410();
					if (local1696 != null) {
						local2067 = local1696.method5524(anIntArray399, local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
						if (local2067) {
							anIntArray398[anInt4294++] = anIntArray399[1];
							anIntArray398[anInt4294++] = anIntArray399[2];
							return;
						}
						anIntArray398[anInt4294++] = -1;
						anIntArray398[anInt4294++] = -1;
						return;
					}
					anIntArray398[anInt4294++] = -1;
					anIntArray398[anInt4294++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static256.method4271(anIntArray398[--anInt4294]);
					return;
				}
				if (arg0 == 5227) {
					anInt4294 -= 2;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					Static122.method6962(local776 >> 14 & 0x3FFF, local175, true, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static132.aBoolean240 = anIntArray398[--anInt4294] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray398[anInt4294++] = Static132.aBoolean240 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray398[--anInt4294];
					Static57.method852(local175);
					return;
				}
				@Pc(2625) Class4 local2625;
				if (arg0 == 5231) {
					anInt4294 -= 2;
					local175 = anIntArray398[anInt4294];
					local1496 = anIntArray398[anInt4294 + 1] == 1;
					if (Static363.aClass183_26 != null) {
						local2625 = Static363.aClass183_26.method4289((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8013();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class4();
							Static363.aClass183_26.method4282((long) local175, local2625);
						}
					}
					return;
				}
				@Pc(2667) Class4 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray398[--anInt4294];
					if (Static363.aClass183_26 != null) {
						local2667 = Static363.aClass183_26.method4289((long) local175);
						anIntArray398[anInt4294++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray398[anInt4294++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt4294 -= 2;
					local175 = anIntArray398[anInt4294];
					local1496 = anIntArray398[anInt4294 + 1] == 1;
					if (Static552.aClass183_40 != null) {
						local2625 = Static552.aClass183_40.method4289((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8013();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class4();
							Static552.aClass183_40.method4282((long) local175, local2625);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray398[--anInt4294];
					if (Static552.aClass183_40 != null) {
						local2667 = Static552.aClass183_40.method4289((long) local175);
						anIntArray398[anInt4294++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray398[anInt4294++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray398[anInt4294++] = Static392.aClass4_Sub7_Sub13_2 == null ? -1 : Static392.aClass4_Sub7_Sub13_2.anInt6629;
					return;
				}
				if (arg0 == 5236) {
					anInt4294 -= 2;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static516.method2309(local97, local175, local103);
					if (local2833 < 0) {
						anIntArray398[anInt4294++] = -1;
						return;
					}
					anIntArray398[anInt4294++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static591.method7950();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt4294 -= 2;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					Static469.method6545(3, local776, local175, false);
					anIntArray398[anInt4294++] = Static528.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static528.aFrame1 != null) {
						Static469.method6545(Static189.aClass4_Sub2_Sub1_1.anInt9290, -1, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2917) Class242[] local2917 = Static401.method5807();
					anIntArray398[anInt4294++] = local2917.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray398[--anInt4294];
					@Pc(2941) Class242[] local2941 = Static401.method5807();
					anIntArray398[anInt4294++] = local2941[local175].anInt6163;
					anIntArray398[anInt4294++] = local2941[local175].anInt6170;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static189.aClass4_Sub2_Sub1_1.anInt9305;
					local776 = Static189.aClass4_Sub2_Sub1_1.anInt9296;
					local97 = -1;
					@Pc(2978) Class242[] local2978 = Static401.method5807();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class242 local2985 = local2978[local2833];
						if (local2985.anInt6163 == local175 && local2985.anInt6170 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray398[anInt4294++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray398[anInt4294++] = Static420.method6044();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray398[--anInt4294];
					if (local175 >= 1 && local175 <= 2) {
						Static469.method6545(local175, -1, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9290;
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray398[--anInt4294];
					if (local175 >= 1 && local175 <= 2) {
						Static189.aClass4_Sub2_Sub1_1.anInt9290 = local175;
						Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt4284 -= 2;
					local83 = aStringArray17[anInt4284];
					local89 = aStringArray17[anInt4284 + 1];
					local97 = anIntArray398[--anInt4294];
					@Pc(3124) Class4_Sub41 local3124 = Static128.method2707(Static380.aClass61_83, Class16_Sub3.lb);
					local3124.aClass4_Sub9_Sub1_3.method5961(-345277664, Static509.method7221(local83) + Static509.method7221(local89) + 1);
					local3124.aClass4_Sub9_Sub1_3.method6000(local83);
					local3124.aClass4_Sub9_Sub1_3.method6000(local89);
					local3124.aClass4_Sub9_Sub1_3.method5961(-345277664, local97);
					Static551.method7603(local3124);
					return;
				}
				if (arg0 == 5401) {
					anInt4294 -= 2;
					Static252.aShortArray90[anIntArray398[anInt4294]] = (short) Static59.method861(anIntArray398[anInt4294 + 1]);
					Static195.aClass99_1.method2797();
					Static195.aClass99_1.method2791();
					Static401.aClass345_2.method7612();
					Static39.method670();
					return;
				}
				if (arg0 == 5405) {
					anInt4294 -= 2;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static201.anIntArrayArrayArray13[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt4294 -= 7;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1] << 1;
					local97 = anIntArray398[anInt4294 + 2];
					local103 = anIntArray398[anInt4294 + 3];
					local2833 = anIntArray398[anInt4294 + 4];
					@Pc(3262) int local3262 = anIntArray398[anInt4294 + 5];
					@Pc(3268) int local3268 = anIntArray398[anInt4294 + 6];
					if (local175 >= 0 && local175 < 2 && Static201.anIntArrayArrayArray13[local175] != null && local776 >= 0 && local776 < Static201.anIntArrayArrayArray13[local175].length) {
						Static201.anIntArrayArrayArray13[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3268 };
						Static201.anIntArrayArrayArray13[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3262 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static201.anIntArrayArrayArray13[anIntArray398[--anInt4294]].length >> 1;
					anIntArray398[anInt4294++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static528.aFrame1 != null) {
						Static469.method6545(Static189.aClass4_Sub2_Sub1_1.anInt9290, -1, -1, false);
					}
					if (Static537.aFrame2 != null) {
						Static388.method5705();
						System.exit(0);
						return;
					}
					local83 = Static21.aString6 == null ? Static6.method102() : Static21.aString6;
					Static8.method7646(Static147.aClass161_4, local83, false, Static403.anInt6994 == 1);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static370.aClass299_6 != null) {
						if (Static370.aClass299_6.anObject41 == null) {
							local83 = Static86.method2041(Static370.aClass299_6.anInt7986);
						} else {
							local83 = (String) Static370.aClass299_6.anObject41;
						}
					}
					aStringArray17[anInt4284++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray398[anInt4294++] = Static147.aClass161_4.aBoolean344 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static528.aFrame1 != null) {
						Static469.method6545(Static189.aClass4_Sub2_Sub1_1.anInt9290, -1, -1, false);
					}
					local83 = aStringArray17[--anInt4284];
					local1496 = anIntArray398[--anInt4294] == 1;
					local181 = Static6.method102() + local83;
					Static8.method7646(Static147.aClass161_4, local181, local1496, Static403.anInt6994 == 1);
					return;
				}
				if (arg0 == 5422) {
					anInt4284 -= 2;
					local83 = aStringArray17[anInt4284];
					local89 = aStringArray17[anInt4284 + 1];
					local97 = anIntArray398[--anInt4294];
					if (local83.length() > 0) {
						if (Static129.aStringArray7 == null) {
							Static129.aStringArray7 = new String[Static164.anIntArray353[Static538.aClass263_5.anInt6964]];
						}
						Static129.aStringArray7[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static404.aStringArray31 == null) {
							Static404.aStringArray31 = new String[Static164.anIntArray353[Static538.aClass263_5.anInt6964]];
						}
						Static404.aStringArray31[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray17[--anInt4284]);
					return;
				}
				if (arg0 == 5424) {
					anInt4294 -= 11;
					Static474.anInt4413 = anIntArray398[anInt4294];
					Static433.anInt7416 = anIntArray398[anInt4294 + 1];
					Static292.anInt5391 = anIntArray398[anInt4294 + 2];
					Static542.anInt9149 = anIntArray398[anInt4294 + 3];
					Static25.anInt460 = anIntArray398[anInt4294 + 4];
					Static141.anInt3160 = anIntArray398[anInt4294 + 5];
					Static121.anInt7255 = anIntArray398[anInt4294 + 6];
					Static463.anInt7840 = anIntArray398[anInt4294 + 7];
					Static431.anInt7394 = anIntArray398[anInt4294 + 8];
					Static119.anInt2754 = anIntArray398[anInt4294 + 9];
					Static257.anInt5045 = anIntArray398[anInt4294 + 10];
					Static360.aClass31_78.method679(Static25.anInt460);
					Static360.aClass31_78.method679(Static141.anInt3160);
					Static360.aClass31_78.method679(Static121.anInt7255);
					Static360.aClass31_78.method679(Static463.anInt7840);
					Static360.aClass31_78.method679(Static431.anInt7394);
					Static18.aClass13_6 = null;
					Static545.aClass13_34 = null;
					Static551.aClass13_36 = null;
					Static267.aClass13_17 = null;
					Static32.aClass13_3 = null;
					Static331.aClass13_18 = null;
					Static423.aClass13_30 = null;
					Static487.aClass13_20 = null;
					Static272.aBoolean390 = true;
					return;
				}
				if (arg0 == 5425) {
					Static452.method6399();
					Static272.aBoolean390 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt4294 -= 2;
					Static514.anInt8838 = anIntArray398[anInt4294];
					Static349.anInt6115 = anIntArray398[anInt4294 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt4294 -= 2;
					Static93.anInt2380 = anIntArray398[anInt4294 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt4294 -= 2;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					anIntArray398[anInt4294++] = Static206.method3642(local175, local776) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static363.method5455(aStringArray17[--anInt4284], false, false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static611.method6758("accountcreated", Static55.anApplet1);
						return;
					} catch (@Pc(3800) Throwable local3800) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static611.method6758("accountcreatestarted", Static55.anApplet1);
						return;
					} catch (@Pc(3811) Throwable local3811) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static168.aClipboard1 != null) {
						@Pc(3823) Transferable local3823 = Static168.aClipboard1.getContents(null);
						if (local3823 != null) {
							try {
								local83 = (String) local3823.getTransferData(DataFlavor.stringFlavor);
								if (local83 == null) {
									local83 = "";
								}
							} catch (@Pc(3836) Exception local3836) {
							}
						}
					}
					aStringArray17[anInt4284++] = local83;
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt4294 -= 4;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					local103 = anIntArray398[anInt4294 + 3];
					Static166.method3203(local103, local776 << 2, false, (local175 >> 14 & 0x3FFF) - Static373.anInt6695, local97, (local175 & 0x3FFF) - Static6.anInt97);
					return;
				}
				if (arg0 == 5501) {
					anInt4294 -= 4;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					local103 = anIntArray398[anInt4294 + 3];
					Static447.method6309((local175 & 0x3FFF) - Static6.anInt97, (local175 >> 14 & 0x3FFF) - Static373.anInt6695, local103, local776 << 2, local97);
					return;
				}
				if (arg0 == 5502) {
					anInt4294 -= 6;
					local175 = anIntArray398[anInt4294];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static135.anInt3092 = local175;
					local776 = anIntArray398[anInt4294 + 1];
					if (local776 + 1 >= Static201.anIntArrayArrayArray13[Static135.anInt3092].length >> 1) {
						throw new RuntimeException();
					}
					Static315.anInt5654 = local776;
					Static312.anInt9782 = 0;
					Static306.anInt5575 = anIntArray398[anInt4294 + 2];
					Static167.anInt3607 = anIntArray398[anInt4294 + 3];
					local97 = anIntArray398[anInt4294 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static226.anInt4661 = local97;
					local103 = anIntArray398[anInt4294 + 5];
					if (local103 + 1 >= Static201.anIntArrayArrayArray13[Static226.anInt4661].length >> 1) {
						throw new RuntimeException();
					}
					Static571.anInt9400 = local103;
					Static555.anInt9335 = 3;
					Static140.anInt3147 = -1;
					Static380.anInt6749 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static12.method271();
					return;
				}
				if (arg0 == 5504) {
					anInt4294 -= 2;
					Static83.method7959(anIntArray398[anInt4294 + 1], anIntArray398[anInt4294]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray398[anInt4294++] = (int) Static330.aFloat102 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray398[anInt4294++] = (int) Static477.aFloat164 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static116.method2401();
					return;
				}
				if (arg0 == 5508) {
					Static79.method1369();
					return;
				}
				if (arg0 == 5509) {
					Static474.method3730();
					return;
				}
				if (arg0 == 5510) {
					Static184.method3424();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray398[--anInt4294];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static373.anInt6695;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static38.anInt740) {
						local776 = Static38.anInt740;
					}
					local97 -= Static6.anInt97;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static38.anInt741) {
						local97 = Static38.anInt741;
					}
					Static460.anInt7816 = (local776 << 9) + 256;
					Static391.anInt6854 = (local97 << 9) + 256;
					Static555.anInt9335 = 4;
					Static140.anInt3147 = -1;
					Static380.anInt6749 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static486.method6754();
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray398[--anInt4294];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static373.anInt6695;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static38.anInt740) {
							local776 = Static38.anInt740;
						}
						local97 -= Static6.anInt97;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static38.anInt741) {
							local97 = Static38.anInt741;
						}
						Static380.anInt6749 = (local776 << 9) + 256;
						Static140.anInt3147 = (local97 << 9) + 256;
						return;
					}
					Static380.anInt6749 = -1;
					Static140.anInt3147 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt4284 -= 2;
					local83 = aStringArray17[anInt4284];
					local89 = aStringArray17[anInt4284 + 1];
					local97 = anIntArray398[--anInt4294];
					if (Static598.anInt9831 != 3) {
						return;
					}
					if (Static81.anInt9842 == 0 && Static430.anInt7383 == 0) {
						Static39.aString11 = local83;
						Static321.aString71 = local89;
						Static64.anInt1206 = local97;
						Static33.method600(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static419.method6619();
					return;
				}
				if (arg0 == 5602) {
					if (Static81.anInt9842 == 0) {
						Static524.anInt8909 = -2;
						Static341.anInt5984 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt4294 -= 4;
					if (Static598.anInt9831 != 3) {
						return;
					}
					if (Static81.anInt9842 == 0 && Static430.anInt7383 == 0) {
						Static464.method6710(anIntArray398[anInt4294 + 1], anIntArray398[anInt4294 + 2], anIntArray398[anInt4294 + 3], anIntArray398[anInt4294]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt4284--;
					if (Static598.anInt9831 != 3) {
						return;
					}
					if (Static81.anInt9842 == 0 && Static430.anInt7383 == 0) {
						Static36.method624(Static551.method7610(aStringArray17[anInt4284]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt4284 -= 2;
					if (Static598.anInt9831 != 3) {
						return;
					}
					if (Static81.anInt9842 == 0 && Static430.anInt7383 == 0) {
						Static67.method1113(aStringArray17[anInt4284 + 1], false, Static551.method7610(aStringArray17[anInt4284]));
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static430.anInt7383 == 0) {
						Static521.anInt8882 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray398[anInt4294++] = Static341.anInt5984;
					return;
				}
				if (arg0 == 5608) {
					anIntArray398[anInt4294++] = Static158.anInt3479;
					return;
				}
				if (arg0 == 5609) {
					anIntArray398[anInt4294++] = Static521.anInt8882;
					return;
				}
				if (arg0 == 5610) {
					for (local175 = 0; local175 < 5; local175++) {
						aStringArray17[anInt4284++] = Static425.aStringArray32 == null || Static425.aStringArray32.length <= local175 ? "" : Static426.method6085(Static425.aStringArray32[local175]);
					}
					Static425.aStringArray32 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray398[anInt4294++] = Static497.anInt8608;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray398[--anInt4294];
					if (Static598.anInt9831 != 7) {
						return;
					}
					if (Static81.anInt9842 == 0 && Static430.anInt7383 == 0) {
						if (Static235.aClass45_1 != null) {
							Static235.aClass45_1.method839();
							Static235.aClass45_1 = null;
						}
						Static64.anInt1206 = local175;
						Static33.method600(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray398[anInt4294++] = Static341.anInt5984;
					return;
				}
				if (arg0 == 5615) {
					anInt4284 -= 2;
					local83 = aStringArray17[anInt4284];
					local89 = aStringArray17[anInt4284 + 1];
					if (Static598.anInt9831 != 3) {
						return;
					}
					if (Static81.anInt9842 == 0 && Static430.anInt7383 == 0) {
						if (Static235.aClass45_1 != null) {
							Static235.aClass45_1.method839();
							Static235.aClass45_1 = null;
						}
						Static39.aString11 = local83;
						Static321.aString71 = local89;
						Static33.method600(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static362.method5445(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray398[anInt4294++] = Static524.anInt8909;
					return;
				}
				if (arg0 == 5618) {
					local175 = anIntArray398[--anInt4294];
					Static146.method3009(false, local175);
					return;
				}
				if (arg0 == 5619) {
					local175 = anIntArray398[--anInt4294];
					Static146.method3009(true, local175);
					return;
				}
				if (arg0 == 5620) {
					Static282.method4470();
					if (Static40.aString12 != "" && Static40.aString12 != "") {
						anIntArray398[anInt4294++] = 1;
						return;
					}
					anIntArray398[anInt4294++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt4284 -= 2;
					if (Static598.anInt9831 != 3) {
						return;
					}
					if (Static81.anInt9842 == 0 && Static430.anInt7383 == 0) {
						Static67.method1113(aStringArray17[anInt4284 + 1], true, Static551.method7610(aStringArray17[anInt4284]));
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4719) Class299 local4719 = Static147.aClass161_4.method3815("3", false);
					while (local4719.anInt7985 == 0) {
						Static55.method845(1L);
					}
					if (local4719.anInt7985 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4739) Class23 local4739 = (Class23) local4719.anObject41;
					if (local4739.method493().exists()) {
						@Pc(4749) Class4_Sub9 local4749 = new Class4_Sub9(50);
						try {
							local4739.method496(0, local4749.aByteArray97, 50);
						} catch (@Pc(4758) IOException local4758) {
						}
					}
					try {
						local4739.method495();
						return;
					} catch (@Pc(4764) Exception local4764) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static248.aString61 != null) {
						anIntArray398[anInt4294++] = 1;
						return;
					}
					anIntArray398[anInt4294++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray398[anInt4294++] = (int) (Static316.aLong165 >> 32);
					anIntArray398[anInt4294++] = (int) (Static316.aLong165 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 1) {
						local175 = 1;
					}
					if (local175 > 4) {
						local175 = 4;
					}
					Static189.aClass4_Sub2_Sub1_1.anInt9299 = local175;
					Static589.method7934();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6002) {
					Static189.aClass4_Sub2_Sub1_1.method7660(anIntArray398[--anInt4294] == 1);
					Static589.method7934();
					Static308.method4762();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6003) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean646 = anIntArray398[--anInt4294] == 1;
					Static308.method4762();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6005) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean656 = anIntArray398[--anInt4294] == 1;
					Static589.method7934();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6006) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean647 = anIntArray398[--anInt4294] == 1;
					Static185.aClass66_14.method6839(!Static189.aClass4_Sub2_Sub1_1.aBoolean647);
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6007) {
					Static189.aClass4_Sub2_Sub1_1.anInt9302 = anIntArray398[--anInt4294];
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6008) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean652 = anIntArray398[--anInt4294] == 1;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6009) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean644 = anIntArray398[--anInt4294] == 1;
					Static589.method7934();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6010) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean649 = anIntArray398[--anInt4294] == 1;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6011) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static189.aClass4_Sub2_Sub1_1.method7647(Static403.anInt6994, local175);
					Static589.method7934();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6012) {
					Static189.aClass4_Sub2_Sub1_1.method7642(anIntArray398[--anInt4294] == 1, Static403.anInt6994);
					Static271.method4381();
					Static114.method2345();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6014) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean648 = anIntArray398[--anInt4294] == 1;
					Static589.method7934();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6015) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean657 = anIntArray398[--anInt4294] == 1;
					Static589.method7934();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6016) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static189.aClass4_Sub2_Sub1_1.anInt9297 = local175;
					Static8.method7640(Static403.anInt6994);
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					return;
				}
				if (arg0 == 6017) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean650 = anIntArray398[--anInt4294] == 1;
					Static355.method5251();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6018) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static189.aClass4_Sub2_Sub1_1.anInt9298 = local175;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static189.aClass4_Sub2_Sub1_1.anInt9295) {
						if (Static189.aClass4_Sub2_Sub1_1.anInt9295 == 0 && Static416.anInt7187 != -1) {
							Static565.method7768(Static416.anInt7187, local175, Static291.aClass31_66);
							Static327.aBoolean615 = false;
						} else if (local175 == 0) {
							Static459.method6461();
							Static327.aBoolean615 = false;
						} else {
							Static332.method4991(local175);
						}
						Static189.aClass4_Sub2_Sub1_1.anInt9295 = local175;
					}
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6020) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static189.aClass4_Sub2_Sub1_1.anInt9277 = local175;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6021) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean666 = anIntArray398[--anInt4294] == 1;
					Static308.method4762();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray398[--anInt4294];
					local1496 = false;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 2) {
						local175 = 2;
					}
					if (Static87.anInt2262 < 96) {
						local175 = 0;
						local1496 = true;
					}
					Static46.method736(local175);
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					anIntArray398[anInt4294++] = local1496 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static189.aClass4_Sub2_Sub1_1.anInt9279 = local175;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					return;
				}
				if (arg0 == 6025) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0 || local175 > Static437.method6209(Static87.anInt2262)) {
						local175 = 0;
					}
					Static189.aClass4_Sub2_Sub1_1.anInt9286 = local175;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static200.method3593(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean660 = anIntArray398[--anInt4294] != 0;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					return;
				}
				if (arg0 == 6029) {
					Static189.aClass4_Sub2_Sub1_1.anInt9302 = anIntArray398[--anInt4294];
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					return;
				}
				if (arg0 == 6030) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean653 = anIntArray398[--anInt4294] != 0;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static589.method7934();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static8.method7640(local175);
					return;
				}
				if (arg0 == 6032) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static189.aClass4_Sub2_Sub1_1.anInt9285 = local175;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6033) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0 || local175 > 4) {
						local175 = 2;
					}
					Static189.aClass4_Sub2_Sub1_1.anInt9300 = local175;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					return;
				}
				if (arg0 == 6034) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean661 = anIntArray398[--anInt4294] == 1;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static271.method4381();
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6035) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean663 = anIntArray398[--anInt4294] == 1;
					Static589.method7934();
					Static308.method4762();
					return;
				}
				if (arg0 == 6036) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static189.aClass4_Sub2_Sub1_1.method7650(local175);
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					return;
				}
				if (arg0 == 6037) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static189.aClass4_Sub2_Sub1_1.anInt9282 = local175;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray398[--anInt4294];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static189.aClass4_Sub2_Sub1_1.anInt9278 && Static416.anInt7187 == Static491.anInt8563) {
						if (Static189.aClass4_Sub2_Sub1_1.anInt9278 == 0) {
							Static565.method7768(Static416.anInt7187, local175, Static291.aClass31_66);
							Static327.aBoolean615 = false;
						} else if (local175 == 0) {
							Static459.method6461();
							Static327.aBoolean615 = false;
						} else {
							Static332.method4991(local175);
						}
					}
					Static189.aClass4_Sub2_Sub1_1.anInt9278 = local175;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray398[--anInt4294];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static189.aClass4_Sub2_Sub1_1.anInt9289) {
						Static189.aClass4_Sub2_Sub1_1.anInt9289 = local175;
						Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
						Static47.aBoolean78 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9299;
					return;
				}
				if (arg0 == 6102) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.method7648(Static403.anInt6994) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean646 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean656 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean647 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9302;
					return;
				}
				if (arg0 == 6108) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean652 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean644 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean649 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.method7643(Static403.anInt6994);
					return;
				}
				if (arg0 == 6112) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.method7644(Static403.anInt6994) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean648 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean657 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9297;
					return;
				}
				if (arg0 == 6117) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean650 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9298;
					return;
				}
				if (arg0 == 6119) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9295;
					return;
				}
				if (arg0 == 6120) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9277;
					return;
				}
				if (arg0 == 6121) {
					anIntArray398[anInt4294++] = Static185.aClass66_14.method6781() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray398[anInt4294++] = Static170.method7580();
					return;
				}
				if (arg0 == 6124) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9279;
					return;
				}
				if (arg0 == 6125) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9286;
					return;
				}
				if (arg0 == 6126) {
					anIntArray398[anInt4294++] = Static185.aClass66_14.method6849() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean645 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean660 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9302;
					return;
				}
				if (arg0 == 6130) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean653 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray398[anInt4294++] = Static403.anInt6994;
					return;
				}
				if (arg0 == 6132) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9285;
					return;
				}
				if (arg0 == 6133) {
					anIntArray398[anInt4294++] = Static147.aClass161_4.aBoolean344 && !Static147.aClass161_4.aBoolean345 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray398[anInt4294++] = Static437.method6209(Static87.anInt2262);
					return;
				}
				if (arg0 == 6135) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9300;
					return;
				}
				if (arg0 == 6136) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean661 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6352) boolean local6352 = true;
					try {
						local6352 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6362) Throwable local6362) {
					}
					anIntArray398[anInt4294++] = local6352 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray398[anInt4294++] = Static279.method4429(200, Static403.anInt6994);
					return;
				}
				if (arg0 == 6139) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.method7657(Static403.anInt6994);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6410) byte local6410 = 0;
					if (Static358.method5266(Static403.anInt6994) && Static87.anInt2262 < 96) {
						local6410 = 1;
					}
					anIntArray398[anInt4294++] = local6410;
					return;
				}
				if (arg0 == 6141) {
					if (Static87.anInt2262 < 96) {
						anIntArray398[anInt4294++] = 0;
						return;
					}
					anIntArray398[anInt4294++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9282;
					return;
				}
				if (arg0 == 6143) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9278;
					return;
				}
				if (arg0 == 6144) {
					anIntArray398[anInt4294++] = Static418.aBoolean523 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9289;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt4294 -= 2;
					Static518.aShort114 = (short) anIntArray398[anInt4294];
					if (Static518.aShort114 <= 0) {
						Static518.aShort114 = 256;
					}
					Static240.aShort75 = (short) anIntArray398[anInt4294 + 1];
					if (Static240.aShort75 <= 0) {
						Static240.aShort75 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt4294 -= 2;
					Static303.aShort82 = (short) anIntArray398[anInt4294];
					if (Static303.aShort82 <= 0) {
						Static303.aShort82 = 256;
					}
					Static195.aShort65 = (short) anIntArray398[anInt4294 + 1];
					if (Static195.aShort65 <= 0) {
						Static195.aShort65 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt4294 -= 4;
					Static278.aShort79 = (short) anIntArray398[anInt4294];
					if (Static278.aShort79 <= 0) {
						Static278.aShort79 = 1;
					}
					Static498.aShort108 = (short) anIntArray398[anInt4294 + 1];
					if (Static498.aShort108 <= 0) {
						Static498.aShort108 = 32767;
					} else if (Static498.aShort108 < Static278.aShort79) {
						Static498.aShort108 = Static278.aShort79;
					}
					Static348.aShort84 = (short) anIntArray398[anInt4294 + 2];
					if (Static348.aShort84 <= 0) {
						Static348.aShort84 = 1;
					}
					Static164.aShort54 = (short) anIntArray398[anInt4294 + 3];
					if (Static164.aShort54 <= 0) {
						Static164.aShort54 = 32767;
						return;
					}
					if (Static164.aShort54 < Static348.aShort84) {
						Static164.aShort54 = Static348.aShort84;
					}
					return;
				}
				if (arg0 == 6203) {
					Static250.method4211(Static92.aClass115_3.anInt3474, 0, 0, Static92.aClass115_3.anInt3481, false);
					anIntArray398[anInt4294++] = Static565.anInt9457;
					anIntArray398[anInt4294++] = Static244.anInt4833;
					return;
				}
				if (arg0 == 6204) {
					anIntArray398[anInt4294++] = Static303.aShort82;
					anIntArray398[anInt4294++] = Static195.aShort65;
					return;
				}
				if (arg0 == 6205) {
					anIntArray398[anInt4294++] = Static518.aShort114;
					anIntArray398[anInt4294++] = Static240.aShort75;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray398[anInt4294++] = (int) (Static184.method3422() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray398[anInt4294++] = (int) (Static184.method3422() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt4294 -= 3;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local97, local776, local175);
					local103 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray398[anInt4294++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static184.method3422()));
					anIntArray398[anInt4294++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray398[--anInt4294];
					local1496 = true;
					if (local175 < 0) {
						local1496 = (local175 + 1) % 4 == 0;
					} else if (local175 < 1582) {
						local1496 = local175 % 4 == 0;
					} else if (local175 % 4 != 0) {
						local1496 = false;
					} else if (local175 % 100 != 0) {
						local1496 = true;
					} else if (local175 % 400 != 0) {
						local1496 = false;
					}
					anIntArray398[anInt4294++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray398[anInt4294++] = Static253.method4249() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray398[anInt4294++] = Static527.method7355() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static598.anInt9831 == 7 && Static81.anInt9842 == 0 && Static430.anInt7383 == 0) {
						if (Static232.aBoolean353) {
							anIntArray398[anInt4294++] = 0;
							return;
						}
						if (Static445.aLong223 > Static184.method3422() - 1000L) {
							anIntArray398[anInt4294++] = 1;
							return;
						}
						Static232.aBoolean353 = true;
						local52 = Static128.method2707(Static441.aClass61_102, Class16_Sub3.lb);
						local52.aClass4_Sub9_Sub1_3.method5963(Static170.anInt9209);
						Static551.method7603(local52);
						anIntArray398[anInt4294++] = 0;
						return;
					}
					anIntArray398[anInt4294++] = 1;
					return;
				}
				@Pc(7033) Class361 local7033;
				@Pc(7000) Class7_Sub1 local7000;
				if (arg0 == 6501) {
					local7000 = Static341.method5071();
					if (local7000 != null) {
						anIntArray398[anInt4294++] = local7000.anInt94;
						anIntArray398[anInt4294++] = local7000.anInt84;
						aStringArray17[anInt4284++] = local7000.aString1;
						local7033 = local7000.method100();
						anIntArray398[anInt4294++] = local7033.anInt9771;
						aStringArray17[anInt4284++] = local7033.aString99;
						anIntArray398[anInt4294++] = local7000.anInt81;
						anIntArray398[anInt4294++] = local7000.anInt93;
						aStringArray17[anInt4284++] = local7000.aString2;
						return;
					}
					anIntArray398[anInt4294++] = -1;
					anIntArray398[anInt4294++] = 0;
					aStringArray17[anInt4284++] = "";
					anIntArray398[anInt4294++] = 0;
					aStringArray17[anInt4284++] = "";
					anIntArray398[anInt4294++] = 0;
					anIntArray398[anInt4294++] = 0;
					aStringArray17[anInt4284++] = "";
					return;
				}
				if (arg0 == 6502) {
					local7000 = Static233.method4036();
					if (local7000 != null) {
						anIntArray398[anInt4294++] = local7000.anInt94;
						anIntArray398[anInt4294++] = local7000.anInt84;
						aStringArray17[anInt4284++] = local7000.aString1;
						local7033 = local7000.method100();
						anIntArray398[anInt4294++] = local7033.anInt9771;
						aStringArray17[anInt4284++] = local7033.aString99;
						anIntArray398[anInt4294++] = local7000.anInt81;
						anIntArray398[anInt4294++] = local7000.anInt93;
						aStringArray17[anInt4284++] = local7000.aString2;
						return;
					}
					anIntArray398[anInt4294++] = -1;
					anIntArray398[anInt4294++] = 0;
					aStringArray17[anInt4284++] = "";
					anIntArray398[anInt4294++] = 0;
					aStringArray17[anInt4284++] = "";
					anIntArray398[anInt4294++] = 0;
					anIntArray398[anInt4294++] = 0;
					aStringArray17[anInt4284++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray398[--anInt4294];
					local89 = aStringArray17[--anInt4284];
					if (Static598.anInt9831 == 7 && Static81.anInt9842 == 0 && Static430.anInt7383 == 0) {
						anIntArray398[anInt4294++] = Static132.method2774(local89, local175) ? 1 : 0;
						return;
					}
					anIntArray398[anInt4294++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static189.aClass4_Sub2_Sub1_1.anInt9291 = anIntArray398[--anInt4294];
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					return;
				}
				if (arg0 == 6505) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9291;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray398[--anInt4294];
					@Pc(7390) Class7_Sub1 local7390 = Static502.method7167(local175);
					if (local7390 != null) {
						anIntArray398[anInt4294++] = local7390.anInt84;
						aStringArray17[anInt4284++] = local7390.aString1;
						@Pc(7414) Class361 local7414 = local7390.method100();
						anIntArray398[anInt4294++] = local7414.anInt9771;
						aStringArray17[anInt4284++] = local7414.aString99;
						anIntArray398[anInt4294++] = local7390.anInt81;
						anIntArray398[anInt4294++] = local7390.anInt93;
						aStringArray17[anInt4284++] = local7390.aString2;
						return;
					}
					anIntArray398[anInt4294++] = -1;
					aStringArray17[anInt4284++] = "";
					anIntArray398[anInt4294++] = 0;
					aStringArray17[anInt4284++] = "";
					anIntArray398[anInt4294++] = 0;
					anIntArray398[anInt4294++] = 0;
					aStringArray17[anInt4284++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt4294 -= 4;
					local175 = anIntArray398[anInt4294];
					local1496 = anIntArray398[anInt4294 + 1] == 1;
					local97 = anIntArray398[anInt4294 + 2];
					local2107 = anIntArray398[anInt4294 + 3] == 1;
					Static525.method7333(local2107, local97, local175, local1496);
					return;
				}
				if (arg0 == 6508) {
					Static22.method426();
					return;
				}
				if (arg0 == 6509) {
					if (Static598.anInt9831 != 7) {
						return;
					}
					Static131.aBoolean237 = anIntArray398[--anInt4294] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray398[anInt4294++] = Static37.anInt737;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static189.aClass4_Sub2_Sub1_1.aBoolean651 = anIntArray398[--anInt4294] == 1;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					return;
				}
				if (arg0 == 6601) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.aBoolean651 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static455.aClass215_1 == Static591.aClass215_4) {
				if (arg0 == 6700) {
					local175 = Static543.aClass183_39.method4291();
					if (Static249.anInt4945 != -1) {
						local175++;
					}
					anIntArray398[anInt4294++] = local175;
					return;
				}
				if (arg0 == 6701) {
					local175 = anIntArray398[--anInt4294];
					if (Static249.anInt4945 != -1) {
						if (local175 == 0) {
							anIntArray398[anInt4294++] = Static249.anInt4945;
							return;
						}
						local175--;
					}
					@Pc(7701) Class4_Sub49 local7701 = (Class4_Sub49) Static543.aClass183_39.method4286();
					while (local175-- > 0) {
						local7701 = (Class4_Sub49) Static543.aClass183_39.method4283();
					}
					anIntArray398[anInt4294++] = local7701.anInt9337;
					return;
				}
				if (arg0 == 6702) {
					local175 = anIntArray398[--anInt4294];
					if (Static458.aClass115ArrayArray2[local175] == null) {
						aStringArray17[anInt4284++] = "";
						return;
					}
					local89 = Static458.aClass115ArrayArray2[local175][0].aString31;
					if (local89 == null) {
						aStringArray17[anInt4284++] = "";
						return;
					}
					aStringArray17[anInt4284++] = local89.substring(0, local89.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local175 = anIntArray398[--anInt4294];
					if (Static458.aClass115ArrayArray2[local175] == null) {
						anIntArray398[anInt4294++] = 0;
						return;
					}
					anIntArray398[anInt4294++] = Static458.aClass115ArrayArray2[local175].length;
					return;
				}
				if (arg0 == 6704) {
					anInt4294 -= 2;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					if (Static458.aClass115ArrayArray2[local175] == null) {
						aStringArray17[anInt4284++] = "";
						return;
					}
					local181 = Static458.aClass115ArrayArray2[local175][local776].aString31;
					if (local181 == null) {
						aStringArray17[anInt4284++] = "";
						return;
					}
					aStringArray17[anInt4284++] = local181;
					return;
				}
				if (arg0 == 6705) {
					anInt4294 -= 2;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					if (Static458.aClass115ArrayArray2[local175] == null) {
						anIntArray398[anInt4294++] = 0;
						return;
					}
					anIntArray398[anInt4294++] = Static458.aClass115ArrayArray2[local175][local776].anInt3513;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt4294 -= 3;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					Static32.method567(local97, 1, local175 << 16 | local776, "");
					return;
				}
				if (arg0 == 6708) {
					anInt4294 -= 3;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					Static32.method567(local97, 2, local175 << 16 | local776, "");
					return;
				}
				if (arg0 == 6709) {
					anInt4294 -= 3;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					Static32.method567(local97, 3, local175 << 16 | local776, "");
					return;
				}
				if (arg0 == 6710) {
					anInt4294 -= 3;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					Static32.method567(local97, 4, local175 << 16 | local776, "");
					return;
				}
				if (arg0 == 6711) {
					anInt4294 -= 3;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					Static32.method567(local97, 5, local175 << 16 | local776, "");
					return;
				}
				if (arg0 == 6712) {
					anInt4294 -= 3;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					Static32.method567(local97, 6, local175 << 16 | local776, "");
					return;
				}
				if (arg0 == 6713) {
					anInt4294 -= 3;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					Static32.method567(local97, 7, local175 << 16 | local776, "");
					return;
				}
				if (arg0 == 6714) {
					anInt4294 -= 3;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					Static32.method567(local97, 8, local175 << 16 | local776, "");
					return;
				}
				if (arg0 == 6715) {
					anInt4294 -= 3;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					Static32.method567(local97, 9, local175 << 16 | local776, "");
					return;
				}
				if (arg0 == 6716) {
					anInt4294 -= 3;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					Static32.method567(local97, 10, local175 << 16 | local776, "");
					return;
				}
				if (arg0 == 6717) {
					anInt4294 -= 3;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					local97 = anIntArray398[anInt4294 + 2];
					@Pc(8289) Class115 local8289 = Static279.method4432(local175 << 16 | local776, local97);
					Static400.method5802();
					@Pc(8294) Class4_Sub31 local8294 = Static69.method1233(local8289);
					Static533.method7420(local8294.method4973(), local8294.anInt5881, local8289);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8322) Class86 local8322;
				if (arg0 == 6800) {
					local175 = anIntArray398[--anInt4294];
					local8322 = Static152.aClass337_2.method7441(local175);
					if (local8322.aString22 == null) {
						aStringArray17[anInt4284++] = "";
						return;
					}
					aStringArray17[anInt4284++] = local8322.aString22;
					return;
				}
				if (arg0 == 6801) {
					local175 = anIntArray398[--anInt4294];
					local8322 = Static152.aClass337_2.method7441(local175);
					anIntArray398[anInt4294++] = local8322.anInt2727;
					return;
				}
				if (arg0 == 6802) {
					local175 = anIntArray398[--anInt4294];
					local8322 = Static152.aClass337_2.method7441(local175);
					anIntArray398[anInt4294++] = local8322.anInt2720;
					return;
				}
				if (arg0 == 6803) {
					local175 = anIntArray398[--anInt4294];
					local8322 = Static152.aClass337_2.method7441(local175);
					anIntArray398[anInt4294++] = local8322.anInt2697;
					return;
				}
				if (arg0 == 6804) {
					anInt4294 -= 2;
					local175 = anIntArray398[anInt4294];
					local776 = anIntArray398[anInt4294 + 1];
					@Pc(8444) Class59 local8444 = Static53.aClass152_1.method3679(local776);
					if (local8444.method1335()) {
						aStringArray17[anInt4284++] = Static152.aClass337_2.method7441(local175).method2399(local8444.aString17, local776);
						return;
					}
					anIntArray398[anInt4294++] = Static152.aClass337_2.method7441(local175).method2408(local8444.anInt1575, local776);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray398[anInt4294++] = Static448.aBoolean537 && !Static251.aBoolean372 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray398[anInt4294++] = Static18.anInt1593;
					return;
				}
				if (arg0 == 6902) {
					anIntArray398[anInt4294++] = Static216.anInt4415;
					return;
				}
				if (arg0 == 6903) {
					anIntArray398[anInt4294++] = Static139.anInt3140;
					return;
				}
				if (arg0 == 6904) {
					anIntArray398[anInt4294++] = Static375.anInt6701;
					return;
				}
				if (arg0 == 6905) {
					local83 = "";
					if (Static370.aClass299_6 != null) {
						if (Static370.aClass299_6.anObject41 == null) {
							local83 = Static86.method2041(Static370.aClass299_6.anInt7986);
						} else {
							local83 = (String) Static370.aClass299_6.anObject41;
						}
					}
					aStringArray17[anInt4284++] = local83;
					return;
				}
				if (arg0 == 6906) {
					anIntArray398[anInt4294++] = Static294.anInt5440;
					return;
				}
				if (arg0 == 6907) {
					anIntArray398[anInt4294++] = Static12.anInt231;
					return;
				}
				if (arg0 == 6908) {
					anIntArray398[anInt4294++] = Static153.anInt3367;
					return;
				}
				if (arg0 == 6909) {
					anIntArray398[anInt4294++] = Static283.aBoolean402 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray398[anInt4294++] = Static393.anInt9509;
					return;
				}
				if (arg0 == 6911) {
					anIntArray398[anInt4294++] = Static287.anInt5342;
					return;
				}
				if (arg0 == 6912) {
					anIntArray398[anInt4294++] = Static74.anInt1566;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local175 = Static189.aClass4_Sub2_Sub1_1.method7662();
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9322 = Static403.anInt6994;
					anIntArray398[anInt4294++] = local175;
					Static589.method7934();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 7001) {
					Static189.aClass4_Sub2_Sub1_1.method7649();
					Static589.method7934();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 7002) {
					Static189.aClass4_Sub2_Sub1_1.method7659();
					Static589.method7934();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 7003) {
					Static189.aClass4_Sub2_Sub1_1.method7656();
					Static589.method7934();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 7004) {
					Static189.aClass4_Sub2_Sub1_1.method7651();
					Static589.method7934();
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 7005) {
					Static189.aClass4_Sub2_Sub1_1.anInt9283 = 0;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static189.aClass4_Sub2_Sub1_1.anInt9322 == 2) {
						Static189.aClass4_Sub2_Sub1_1.aBoolean664 = true;
						return;
					}
					if (Static189.aClass4_Sub2_Sub1_1.anInt9322 == 1) {
						Static189.aClass4_Sub2_Sub1_1.aBoolean665 = true;
						return;
					}
					if (Static189.aClass4_Sub2_Sub1_1.anInt9322 == 3) {
						Static189.aClass4_Sub2_Sub1_1.aBoolean662 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray398[anInt4294++] = Static189.aClass4_Sub2_Sub1_1.anInt9283;
					return;
				}
				if (arg0 == 7008) {
					if (Static403.anInt6994 == 0 && Static87.anInt2262 < 96) {
						anIntArray398[anInt4294++] = 1;
						return;
					}
					anIntArray398[anInt4294++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	private static void method3632(@OriginalArg(0) int arg0) {
		@Pc(3) Class115 local3 = Static92.method2118(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class115[] local13 = Static355.aClass115ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class115[] local19 = Static458.aClass115ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static355.aClass115ArrayArray1[local9] = new Class115[local22];
			Static602.method1585(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static602.method1585(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method3633(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static540.anInt9129 == 0 && (Static448.aBoolean537 && !Static251.aBoolean372 || Static266.aBoolean387)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static275.aClass198_46.method4407(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static275.aClass198_46.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_47.method4407(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static275.aClass198_47.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_48.method4407(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static275.aClass198_48.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_49.method4407(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static275.aClass198_49.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_50.method4407(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static275.aClass198_50.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_51.method4407(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static275.aClass198_51.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_52.method4407(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static275.aClass198_52.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_53.method4407(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static275.aClass198_53.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_54.method4407(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static275.aClass198_54.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_55.method4407(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static275.aClass198_55.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_56.method4407(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static275.aClass198_56.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_57.method4407(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static275.aClass198_57.method4407(0).length());
		} else if (Static56.anInt953 != 0) {
			if (local11.startsWith(Static275.aClass198_46.method4407(Static56.anInt953))) {
				local13 = 0;
				arg0 = arg0.substring(Static275.aClass198_46.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_47.method4407(Static56.anInt953))) {
				local13 = 1;
				arg0 = arg0.substring(Static275.aClass198_47.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_48.method4407(Static56.anInt953))) {
				local13 = 2;
				arg0 = arg0.substring(Static275.aClass198_48.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_49.method4407(Static56.anInt953))) {
				local13 = 3;
				arg0 = arg0.substring(Static275.aClass198_49.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_50.method4407(Static56.anInt953))) {
				local13 = 4;
				arg0 = arg0.substring(Static275.aClass198_50.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_51.method4407(Static56.anInt953))) {
				local13 = 5;
				arg0 = arg0.substring(Static275.aClass198_51.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_52.method4407(Static56.anInt953))) {
				local13 = 6;
				arg0 = arg0.substring(Static275.aClass198_52.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_53.method4407(Static56.anInt953))) {
				local13 = 7;
				arg0 = arg0.substring(Static275.aClass198_53.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_54.method4407(Static56.anInt953))) {
				local13 = 8;
				arg0 = arg0.substring(Static275.aClass198_54.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_55.method4407(Static56.anInt953))) {
				local13 = 9;
				arg0 = arg0.substring(Static275.aClass198_55.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_56.method4407(Static56.anInt953))) {
				local13 = 10;
				arg0 = arg0.substring(Static275.aClass198_56.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_57.method4407(Static56.anInt953))) {
				local13 = 11;
				arg0 = arg0.substring(Static275.aClass198_57.method4407(Static56.anInt953).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Class198.lb.method4407(0))) {
			local451 = 1;
			arg0 = arg0.substring(Class198.lb.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_58.method4407(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static275.aClass198_58.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_59.method4407(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static275.aClass198_59.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_60.method4407(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static275.aClass198_60.method4407(0).length());
		} else if (local11.startsWith(Static275.aClass198_61.method4407(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static275.aClass198_61.method4407(0).length());
		} else if (Static56.anInt953 != 0) {
			if (local11.startsWith(Class198.lb.method4407(Static56.anInt953))) {
				local451 = 1;
				arg0 = arg0.substring(Class198.lb.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_58.method4407(Static56.anInt953))) {
				local451 = 2;
				arg0 = arg0.substring(Static275.aClass198_58.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_59.method4407(Static56.anInt953))) {
				local451 = 3;
				arg0 = arg0.substring(Static275.aClass198_59.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_60.method4407(Static56.anInt953))) {
				local451 = 4;
				arg0 = arg0.substring(Static275.aClass198_60.method4407(Static56.anInt953).length());
			} else if (local11.startsWith(Static275.aClass198_61.method4407(Static56.anInt953))) {
				local451 = 5;
				arg0 = arg0.substring(Static275.aClass198_61.method4407(Static56.anInt953).length());
			}
		}
		@Pc(641) Class4_Sub41 local641 = Static128.method2707(Static596.aClass61_135, Class16_Sub3.lb);
		local641.aClass4_Sub9_Sub1_3.method5961(-345277664, 0);
		@Pc(650) int local650 = local641.aClass4_Sub9_Sub1_3.anInt7219;
		local641.aClass4_Sub9_Sub1_3.method5961(-345277664, local13);
		local641.aClass4_Sub9_Sub1_3.method5961(-345277664, local451);
		Static185.method7126(local641.aClass4_Sub9_Sub1_3, arg0);
		local641.aClass4_Sub9_Sub1_3.method6028(local641.aClass4_Sub9_Sub1_3.anInt7219 - local650);
		Static551.method7603(local641);
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "()V")
	public static void method3634() {
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!wm;I)V")
	private static void method3635(@OriginalArg(0) Class4_Sub7_Sub18 arg0, @OriginalArg(1) int arg1) {
		anInt4294 = 0;
		anInt4284 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray717;
		@Pc(11) int[] local11 = arg0.anIntArray718;
		@Pc(13) byte local13 = -1;
		anInt4293 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label260: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(802) boolean local802;
					if (local11[local5] == 1) {
						local802 = true;
					} else {
						local802 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method3641(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method3631(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray398[anInt4294++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray398[anInt4294++] = Static511.aClass335_2.anIntArray686[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static511.aClass335_2.method7430(local54, anIntArray398[--anInt4294]);
					} else if (local31 == 3) {
						aStringArray17[anInt4284++] = arg0.aStringArray39[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt4294 -= 2;
						if (anIntArray398[anInt4294] != anIntArray398[anInt4294 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt4294 -= 2;
						if (anIntArray398[anInt4294] == anIntArray398[anInt4294 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt4294 -= 2;
						if (anIntArray398[anInt4294] < anIntArray398[anInt4294 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt4294 -= 2;
						if (anIntArray398[anInt4294] > anIntArray398[anInt4294 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt4293 == 0) {
							return;
						}
						@Pc(216) Class128 local216 = aClass128Array1[--anInt4293];
						arg0 = local216.aClass4_Sub7_Sub18_1;
						local8 = arg0.anIntArray717;
						local11 = arg0.anIntArray718;
						local5 = local216.anInt3774;
						anIntArray396 = local216.anIntArray366;
						aStringArray16 = local216.aStringArray12;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray398[anInt4294++] = Static511.aClass335_2.method7423(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static511.aClass335_2.method7432(anIntArray398[--anInt4294], local54);
					} else if (local31 == 31) {
						anInt4294 -= 2;
						if (anIntArray398[anInt4294] <= anIntArray398[anInt4294 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt4294 -= 2;
						if (anIntArray398[anInt4294] >= anIntArray398[anInt4294 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray398[anInt4294++] = anIntArray396[local11[local5]];
					} else if (local31 == 34) {
						anIntArray396[local11[local5]] = anIntArray398[--anInt4294];
					} else if (local31 == 35) {
						aStringArray17[anInt4284++] = aStringArray16[local11[local5]];
					} else if (local31 == 36) {
						aStringArray16[local11[local5]] = aStringArray17[--anInt4284];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt4284 -= local54;
						@Pc(400) String local400 = Static206.method3643(anInt4284, local54, aStringArray17);
						aStringArray17[anInt4284++] = local400;
					} else if (local31 == 38) {
						anInt4294--;
					} else if (local31 == 39) {
						anInt4284--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class4_Sub7_Sub18 local436 = Static314.method7736(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt9701];
							@Pc(450) String[] local450 = new String[local436.anInt9703];
							for (local452 = 0; local452 < local436.anInt9708; local452++) {
								local446[local452] = anIntArray398[anInt4294 + local452 - local436.anInt9708];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt9700; local471++) {
								local450[local471] = aStringArray17[anInt4284 + local471 - local436.anInt9700];
							}
							anInt4294 -= local436.anInt9708;
							anInt4284 -= local436.anInt9700;
							@Pc(502) Class128 local502 = new Class128();
							local502.aClass4_Sub7_Sub18_1 = arg0;
							local502.anInt3774 = local5;
							local502.anIntArray366 = anIntArray396;
							local502.aStringArray12 = aStringArray16;
							if (anInt4293 >= aClass128Array1.length) {
								throw new RuntimeException();
							}
							aClass128Array1[anInt4293++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray717;
							local11 = local436.anIntArray718;
							local5 = -1;
							anIntArray396 = local446;
							aStringArray16 = local450;
						} else if (local31 == 42) {
							anIntArray398[anInt4294++] = Static435.anIntArray612[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static435.anIntArray612[local54] = anIntArray398[--anInt4294];
							Static370.method5550(local54);
							Static195.aBoolean312 |= Static23.aBooleanArray6[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray398[--anInt4294];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray397[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray49[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray398[--anInt4294];
							if (local603 < 0 || local603 >= anIntArray397[local54]) {
								throw new RuntimeException();
							}
							anIntArray398[anInt4294++] = anIntArrayArray49[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt4294 -= 2;
							local603 = anIntArray398[anInt4294];
							if (local603 < 0 || local603 >= anIntArray397[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray49[local54][local603] = anIntArray398[anInt4294 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static200.aStringArray15[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray17[anInt4284++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static200.aStringArray15[local54] = aStringArray17[--anInt4284];
							Static324.method4906(local54);
						} else if (local31 == 51) {
							@Pc(774) Class183 local774 = arg0.aClass183Array1[local11[local5]];
							@Pc(787) Class4_Sub33 local787 = (Class4_Sub33) local774.method4289((long) anIntArray398[--anInt4294]);
							if (local787 != null) {
								local5 += local787.anInt6079;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString98 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong307).append(" ");
				for (local603 = anInt4293 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass128Array1[local603].aClass4_Sub7_Sub18_1.aLong307).append(" ");
				}
				local856.append("op: ").append(local13);
				Static473.method6593(local837, local856.toString());
			} else {
				Static160.method3167("Clientscript error in: " + arg0.aString98);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString98).append("\n");
				for (local603 = anInt4293 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass128Array1[local603].aClass4_Sub7_Sub18_1.aString98).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static473.method6593(local837, local856.toString());
				Static444.method6281(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!dm;)V")
	public static void method3636(@OriginalArg(0) Class4_Sub12 arg0) {
		method3629(arg0, 200000);
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method3637(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray18[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
	public static void method3638(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static474.method3731(arg0)) {
			return;
		}
		@Pc(12) Class115[] local12 = Static458.aClass115ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class115 local19 = local12[local14];
			if (local19.anObjectArray33 != null) {
				@Pc(26) Class4_Sub12 local26 = new Class4_Sub12();
				local26.aClass115_5 = local19;
				local26.anObjectArray3 = local19.anObjectArray33;
				method3629(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(IZ)V")
	public static void method3639() {
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V")
	private static void method3640(@OriginalArg(0) int arg0) {
		@Pc(3) Class115 local3 = Static92.method2118(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class115[] local13 = Static355.aClass115ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class115[] local19 = Static458.aClass115ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static355.aClass115ArrayArray1[local9] = new Class115[local22];
			Static602.method1585(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static602.method1585(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(IZ)V")
	private static void method3641(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class115 local137;
		@Pc(158) Class115 local158;
		@Pc(35) Class115 local35;
		@Pc(56) int local56;
		@Pc(13) int local13;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(210) Class115 local210;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt4294 -= 3;
				local13 = anIntArray398[anInt4294];
				local19 = anIntArray398[anInt4294 + 1];
				local25 = anIntArray398[anInt4294 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static92.method2118(local13);
				if (local35.aClass115Array1 == null) {
					local35.aClass115Array1 = new Class115[local25 + 1];
				}
				if (local35.aClass115Array1.length <= local25) {
					@Pc(54) Class115[] local54 = new Class115[local25 + 1];
					for (local56 = 0; local56 < local35.aClass115Array1.length; local56++) {
						local54[local56] = local35.aClass115Array1[local56];
					}
					local35.aClass115Array1 = local54;
				}
				if (local25 > 0 && local35.aClass115Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class115 local99 = new Class115();
				local99.anInt3519 = local19;
				local99.anInt3441 = local99.anInt3464 = local35.anInt3464;
				local99.anInt3517 = local25;
				local35.aClass115Array1[local25] = local99;
				if (arg1) {
					aClass115_10 = local99;
				} else {
					aClass115_11 = local99;
				}
				Static330.method4950(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass115_10 : aClass115_11;
				if (local137.anInt3517 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static92.method2118(local137.anInt3464);
				local158.aClass115Array1[local137.anInt3517] = null;
				Static330.method4950(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static92.method2118(anIntArray398[--anInt4294]);
				local137.aClass115Array1 = null;
				Static330.method4950(local137);
				return;
			}
			if (arg0 == 200) {
				anInt4294 -= 2;
				local13 = anIntArray398[anInt4294];
				local19 = anIntArray398[anInt4294 + 1];
				local210 = Static279.method4432(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray398[anInt4294++] = 1;
					if (arg1) {
						aClass115_10 = local210;
						return;
					}
					aClass115_11 = local210;
					return;
				}
				anIntArray398[anInt4294++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray398[--anInt4294];
				local158 = Static92.method2118(local13);
				if (local158 != null) {
					anIntArray398[anInt4294++] = 1;
					if (arg1) {
						aClass115_10 = local158;
						return;
					}
					aClass115_11 = local158;
					return;
				}
				anIntArray398[anInt4294++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray398[--anInt4294];
				method3640(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray398[--anInt4294];
				method3632(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt4294 -= 2;
					local13 = anIntArray398[anInt4294];
					local19 = anIntArray398[anInt4294 + 1];
					for (local25 = 0; local25 < Static128.anIntArray289.length; local25++) {
						if (Static128.anIntArray289[local25] == local13) {
							Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1.method7933(Static438.aClass237_2, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static482.anIntArray642.length; local353++) {
						if (Static482.anIntArray642[local353] == local13) {
							Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1.method7933(Static438.aClass237_2, local353, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt4294 -= 2;
					local13 = anIntArray398[anInt4294];
					local19 = anIntArray398[anInt4294 + 1];
					Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1.method7930(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray398[--anInt4294] != 0;
					Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1.method7931(local412);
					return;
				}
				if (arg0 == 411) {
					anInt4294 -= 2;
					local13 = anIntArray398[anInt4294];
					local19 = anIntArray398[anInt4294 + 1];
					Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1.method7929(local13, Static195.aClass99_1, local19);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static92.method2118(anIntArray398[--anInt4294]);
				} else {
					local137 = arg1 ? aClass115_10 : aClass115_11;
				}
				if (arg0 == 1000) {
					anInt4294 -= 4;
					local137.anInt3447 = anIntArray398[anInt4294];
					local137.anInt3473 = anIntArray398[anInt4294 + 1];
					local19 = anIntArray398[anInt4294 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray398[anInt4294 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte41 = (byte) local19;
					local137.aByte40 = (byte) local25;
					Static330.method4950(local137);
					Static154.method3086(local137);
					if (local137.anInt3517 == -1) {
						Static507.method7207(local137.anInt3464);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt4294 -= 4;
					local137.anInt3528 = anIntArray398[anInt4294];
					local137.anInt3500 = anIntArray398[anInt4294 + 1];
					local137.anInt3514 = 0;
					local137.anInt3515 = 0;
					local19 = anIntArray398[anInt4294 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray398[anInt4294 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte42 = (byte) local19;
					local137.aByte43 = (byte) local25;
					Static330.method4950(local137);
					Static154.method3086(local137);
					if (local137.anInt3519 == 0) {
						Static424.method6072(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray398[--anInt4294] == 1;
					if (local137.aBoolean283 != local645) {
						local137.aBoolean283 = local645;
						Static330.method4950(local137);
					}
					if (local137.anInt3517 == -1) {
						Static41.method700(local137.anInt3464);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt4294 -= 2;
					local137.anInt3434 = anIntArray398[anInt4294];
					local137.anInt3461 = anIntArray398[anInt4294 + 1];
					Static330.method4950(local137);
					Static154.method3086(local137);
					if (local137.anInt3519 == 0) {
						Static424.method6072(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean274 = anIntArray398[--anInt4294] == 1;
					return;
				}
			} else {
				@Pc(1532) String local1532;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static92.method2118(anIntArray398[--anInt4294]);
					} else {
						local137 = arg1 ? aClass115_10 : aClass115_11;
					}
					if (arg0 == 1100) {
						anInt4294 -= 2;
						local137.anInt3485 = anIntArray398[anInt4294];
						if (local137.anInt3485 > local137.anInt3462 - local137.anInt3474) {
							local137.anInt3485 = local137.anInt3462 - local137.anInt3474;
						}
						if (local137.anInt3485 < 0) {
							local137.anInt3485 = 0;
						}
						local137.anInt3526 = anIntArray398[anInt4294 + 1];
						if (local137.anInt3526 > local137.anInt3484 - local137.anInt3481) {
							local137.anInt3526 = local137.anInt3484 - local137.anInt3481;
						}
						if (local137.anInt3526 < 0) {
							local137.anInt3526 = 0;
						}
						Static330.method4950(local137);
						if (local137.anInt3517 == -1) {
							Static457.method6436(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt3502 = anIntArray398[--anInt4294];
						Static330.method4950(local137);
						if (local137.anInt3517 == -1) {
							Static16.method325(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean275 = anIntArray398[--anInt4294] == 1;
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt3511 = anIntArray398[--anInt4294];
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt3440 = anIntArray398[--anInt4294];
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray398[--anInt4294];
						if (local137.anInt3442 != local19) {
							local137.anInt3442 = local19;
							Static330.method4950(local137);
						}
						if (local137.anInt3517 == -1) {
							Static249.method4210(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt3449 = anIntArray398[--anInt4294];
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean279 = anIntArray398[--anInt4294] == 1;
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt3445 = 1;
						local137.anInt3508 = anIntArray398[--anInt4294];
						Static330.method4950(local137);
						if (local137.anInt3517 == -1) {
							Static489.method7987(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt4294 -= 6;
						local137.anInt3476 = anIntArray398[anInt4294];
						local137.anInt3477 = anIntArray398[anInt4294 + 1];
						local137.anInt3444 = anIntArray398[anInt4294 + 2];
						local137.anInt3492 = anIntArray398[anInt4294 + 3];
						local137.anInt3472 = anIntArray398[anInt4294 + 4];
						local137.anInt3467 = anIntArray398[anInt4294 + 5];
						Static330.method4950(local137);
						if (local137.anInt3517 == -1) {
							Static519.method7289(local137.anInt3464);
							Static218.method3778(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray398[--anInt4294];
						if (local137.anInt3494 != local19) {
							local137.anInt3494 = local19;
							local137.anInt3460 = 0;
							local137.anInt3491 = 1;
							local137.anInt3524 = 0;
							@Pc(1094) Class77 local1094 = local137.anInt3494 == -1 ? null : Static168.aClass327_2.method7326(local137.anInt3494);
							if (local1094 != null) {
								Static443.method6270(local137.anInt3460, local1094);
							}
							Static330.method4950(local137);
						}
						if (local137.anInt3517 == -1) {
							Static113.method2338(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean280 = anIntArray398[--anInt4294] == 1;
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray17[--anInt4284];
						if (!local1145.equals(local137.aString32)) {
							local137.aString32 = local1145;
							Static330.method4950(local137);
						}
						if (local137.anInt3517 == -1) {
							Static201.method3597(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt3478 = anIntArray398[--anInt4294];
						Static330.method4950(local137);
						if (local137.anInt3517 == -1) {
							Static491.method7043(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt4294 -= 3;
						local137.anInt3523 = anIntArray398[anInt4294];
						local137.anInt3495 = anIntArray398[anInt4294 + 1];
						local137.anInt3505 = anIntArray398[anInt4294 + 2];
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean273 = anIntArray398[--anInt4294] == 1;
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt3482 = anIntArray398[--anInt4294];
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt3525 = anIntArray398[--anInt4294];
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean271 = anIntArray398[--anInt4294] == 1;
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean272 = anIntArray398[--anInt4294] == 1;
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt4294 -= 2;
						local137.anInt3462 = anIntArray398[anInt4294];
						local137.anInt3484 = anIntArray398[anInt4294 + 1];
						Static330.method4950(local137);
						if (local137.anInt3519 == 0) {
							Static424.method6072(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt4294 -= 2;
						local137.anInt3521 = (short) anIntArray398[anInt4294];
						local137.anInt3483 = (short) anIntArray398[anInt4294 + 1];
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean282 = anIntArray398[--anInt4294] == 1;
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt3467 = anIntArray398[--anInt4294];
						Static330.method4950(local137);
						if (local137.anInt3517 == -1) {
							Static519.method7289(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray398[--anInt4294];
						local137.aBoolean281 = local19 == 1;
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt4294 -= 2;
						local137.anInt3459 = anIntArray398[anInt4294];
						local137.anInt3496 = anIntArray398[anInt4294 + 1];
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt3529 = anIntArray398[--anInt4294];
						Static330.method4950(local137);
						return;
					}
					@Pc(1498) Class59 local1498;
					if (arg0 == 1127) {
						anInt4294 -= 2;
						local19 = anIntArray398[anInt4294];
						local25 = anIntArray398[anInt4294 + 1];
						local1498 = Static53.aClass152_1.method3679(local19);
						if (local25 != local1498.anInt1575) {
							local137.method3130(local25, local19);
							return;
						}
						local137.method3146(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray398[--anInt4294];
						local1532 = aStringArray17[--anInt4284];
						local1498 = Static53.aClass152_1.method3679(local19);
						if (!local1498.aString17.equals(local1532)) {
							local137.method3137(local1532, local19);
							return;
						}
						local137.method3146(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static92.method2118(anIntArray398[--anInt4294]);
					} else {
						local137 = arg1 ? aClass115_10 : aClass115_11;
					}
					Static330.method4950(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt4294 -= 2;
						local19 = anIntArray398[anInt4294];
						local25 = anIntArray398[anInt4294 + 1];
						if (local137.anInt3517 == -1) {
							Static257.method4280(local137.anInt3464);
							Static519.method7289(local137.anInt3464);
							Static218.method3778(local137.anInt3464);
						}
						if (local19 == -1) {
							local137.anInt3445 = 1;
							local137.anInt3508 = -1;
							local137.anInt3510 = -1;
							return;
						}
						local137.anInt3510 = local19;
						local137.anInt3487 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean278 = true;
						} else {
							local137.aBoolean278 = false;
						}
						@Pc(1674) Class222 local1674 = Static195.aClass99_1.method2798(local19);
						local137.anInt3444 = local1674.anInt5776;
						local137.anInt3492 = local1674.anInt5814;
						local137.anInt3472 = local1674.anInt5823;
						local137.anInt3476 = local1674.anInt5788;
						local137.anInt3477 = local1674.anInt5821;
						local137.anInt3467 = local1674.anInt5781;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt3512 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt3512 = 1;
						} else {
							local137.anInt3512 = 2;
						}
						if (local137.anInt3514 > 0) {
							local137.anInt3467 = local137.anInt3467 * 32 / local137.anInt3514;
							return;
						}
						if (local137.anInt3528 > 0) {
							local137.anInt3467 = local137.anInt3467 * 32 / local137.anInt3528;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt3445 = 2;
						local137.anInt3508 = anIntArray398[--anInt4294];
						if (local137.anInt3517 == -1) {
							Static489.method7987(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt3445 = 3;
						local137.anInt3508 = -1;
						if (local137.anInt3517 == -1) {
							Static489.method7987(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt3445 = 6;
						local137.anInt3508 = anIntArray398[--anInt4294];
						if (local137.anInt3517 == -1) {
							Static489.method7987(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt3445 = 5;
						local137.anInt3508 = anIntArray398[--anInt4294];
						if (local137.anInt3517 == -1) {
							Static489.method7987(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt4294 -= 4;
						local137.anInt3452 = anIntArray398[anInt4294];
						local137.anInt3448 = anIntArray398[anInt4294 + 1];
						local137.anInt3506 = anIntArray398[anInt4294 + 2];
						local137.anInt3453 = anIntArray398[anInt4294 + 3];
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt4294 -= 2;
						local137.anInt3455 = anIntArray398[anInt4294];
						local137.anInt3497 = anIntArray398[anInt4294 + 1];
						Static330.method4950(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt4294 -= 4;
						local137.anInt3508 = anIntArray398[anInt4294];
						local137.anInt3454 = anIntArray398[anInt4294 + 1];
						if (anIntArray398[anInt4294 + 2] == 1) {
							local137.anInt3445 = 9;
						} else {
							local137.anInt3445 = 8;
						}
						if (anIntArray398[anInt4294 + 3] == 1) {
							local137.aBoolean278 = true;
						} else {
							local137.aBoolean278 = false;
						}
						if (local137.anInt3517 == -1) {
							Static489.method7987(local137.anInt3464);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt3445 = 5;
						local137.anInt3508 = Static416.anInt7186;
						local137.anInt3454 = 0;
						if (local137.anInt3517 == -1) {
							Static489.method7987(local137.anInt3464);
						}
						return;
					}
				} else {
					@Pc(2334) int local2334;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static92.method2118(anIntArray398[--anInt4294]);
						} else {
							local137 = arg1 ? aClass115_10 : aClass115_11;
						}
						if (arg0 == 1300) {
							local19 = anIntArray398[--anInt4294] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method3151(local19, aStringArray17[--anInt4284]);
								return;
							}
							anInt4284--;
							return;
						}
						if (arg0 == 1301) {
							anInt4294 -= 2;
							local19 = anIntArray398[anInt4294];
							local25 = anIntArray398[anInt4294 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass115_8 = null;
								return;
							}
							local137.aClass115_8 = Static279.method4432(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray398[--anInt4294];
							if (local19 != Static160.anInt3549 && local19 != Static187.anInt8846 && local19 != Static457.anInt7770) {
								return;
							}
							local137.anInt3437 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt3507 = anIntArray398[--anInt4294];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt3480 = anIntArray398[--anInt4294];
							return;
						}
						if (arg0 == 1305) {
							local137.aString33 = aStringArray17[--anInt4284];
							return;
						}
						if (arg0 == 1306) {
							local137.aString34 = aStringArray17[--anInt4284];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray11 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt3438 = anIntArray398[--anInt4294];
							local137.anInt3527 = anIntArray398[--anInt4294];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray398[--anInt4294];
							local25 = anIntArray398[--anInt4294];
							if (local25 >= 1 && local25 <= 10) {
								local137.method3148(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString30 = aStringArray17[--anInt4284];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt3493 = anIntArray398[--anInt4294];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt4294 -= 3;
								local19 = anIntArray398[anInt4294] - 1;
								local25 = anIntArray398[anInt4294 + 1];
								local353 = anIntArray398[anInt4294 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt4294 -= 2;
								local19 = 10;
								local25 = anIntArray398[anInt4294];
								local353 = anIntArray398[anInt4294 + 1];
							}
							if (local137.aByteArray40 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray40 = new byte[11];
								local137.aByteArray41 = new byte[11];
								local137.anIntArray315 = new int[11];
							}
							local137.aByteArray40[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean277 = false;
								for (local2334 = 0; local2334 < local137.aByteArray40.length; local2334++) {
									if (local137.aByteArray40[local2334] != 0) {
										local137.aBoolean277 = true;
										break;
									}
								}
							} else {
								local137.aBoolean277 = true;
							}
							local137.aByteArray41[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt3499 = anIntArray398[--anInt4294];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static92.method2118(anIntArray398[--anInt4294]);
						} else {
							local137 = arg1 ? aClass115_10 : aClass115_11;
						}
						if (arg0 == 1499) {
							local137.method3144();
							return;
						}
						local1145 = aStringArray17[--anInt4284];
						@Pc(2420) int[] local2420 = null;
						if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
							local353 = anIntArray398[--anInt4294];
							if (local353 > 0) {
								local2420 = new int[local353];
								while (local353-- > 0) {
									local2420[local353] = anIntArray398[--anInt4294];
								}
							}
							local1145 = local1145.substring(0, local1145.length() - 1);
						}
						@Pc(2472) Object[] local2472 = new Object[local1145.length() + 1];
						for (local2334 = local2472.length - 1; local2334 >= 1; local2334--) {
							if (local1145.charAt(local2334 - 1) == 's') {
								local2472[local2334] = aStringArray17[--anInt4284];
							} else {
								local2472[local2334] = Integer.valueOf(anIntArray398[--anInt4294]);
							}
						}
						local56 = anIntArray398[--anInt4294];
						if (local56 == -1) {
							local2472 = null;
						} else {
							local2472[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray12 = local2472;
						} else if (arg0 == 1401) {
							local137.anObjectArray24 = local2472;
						} else if (arg0 == 1402) {
							local137.anObjectArray17 = local2472;
						} else if (arg0 == 1403) {
							local137.anObjectArray21 = local2472;
						} else if (arg0 == 1404) {
							local137.anObjectArray9 = local2472;
						} else if (arg0 == 1405) {
							local137.anObjectArray31 = local2472;
						} else if (arg0 == 1406) {
							local137.anObjectArray25 = local2472;
						} else if (arg0 == 1407) {
							local137.anObjectArray18 = local2472;
							local137.anIntArray317 = local2420;
						} else if (arg0 == 1408) {
							local137.anObjectArray19 = local2472;
						} else if (arg0 == 1409) {
							local137.anObjectArray26 = local2472;
						} else if (arg0 == 1410) {
							local137.anObjectArray6 = local2472;
						} else if (arg0 == 1411) {
							local137.anObjectArray11 = local2472;
						} else if (arg0 == 1412) {
							local137.anObjectArray15 = local2472;
						} else if (arg0 == 1414) {
							local137.anObjectArray28 = local2472;
							local137.anIntArray311 = local2420;
						} else if (arg0 == 1415) {
							local137.anObjectArray22 = local2472;
							local137.anIntArray312 = local2420;
						} else if (arg0 == 1416) {
							local137.anObjectArray27 = local2472;
						} else if (arg0 == 1417) {
							local137.anObjectArray32 = local2472;
						} else if (arg0 == 1418) {
							local137.anObjectArray20 = local2472;
						} else if (arg0 == 1419) {
							local137.anObjectArray14 = local2472;
						} else if (arg0 == 1420) {
							local137.anObjectArray23 = local2472;
						} else if (arg0 == 1421) {
							local137.anObjectArray16 = local2472;
						} else if (arg0 == 1422) {
							local137.anObjectArray10 = local2472;
						} else if (arg0 == 1423) {
							local137.anObjectArray34 = local2472;
						} else if (arg0 == 1424) {
							local137.anObjectArray13 = local2472;
						} else if (arg0 == 1425) {
							local137.anObjectArray5 = local2472;
						} else if (arg0 == 1426) {
							local137.anObjectArray30 = local2472;
						} else if (arg0 == 1427) {
							local137.anObjectArray8 = local2472;
						} else if (arg0 == 1428) {
							local137.anObjectArray35 = local2472;
							local137.anIntArray318 = local2420;
						} else if (arg0 == 1429) {
							local137.anObjectArray29 = local2472;
							local137.anIntArray316 = local2420;
						} else if (arg0 == 1430) {
							local137.anObjectArray7 = local2472;
						}
						local137.aBoolean276 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass115_10 : aClass115_11;
						if (arg0 == 1500) {
							anIntArray398[anInt4294++] = local137.anInt3456;
							return;
						}
						if (arg0 == 1501) {
							anIntArray398[anInt4294++] = local137.anInt3458;
							return;
						}
						if (arg0 == 1502) {
							anIntArray398[anInt4294++] = local137.anInt3474;
							return;
						}
						if (arg0 == 1503) {
							anIntArray398[anInt4294++] = local137.anInt3481;
							return;
						}
						if (arg0 == 1504) {
							anIntArray398[anInt4294++] = local137.aBoolean283 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray398[anInt4294++] = local137.anInt3441;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static352.method7380(local137);
							anIntArray398[anInt4294++] = local158 == null ? -1 : local158.anInt3464;
							return;
						}
					} else {
						@Pc(3068) Class59 local3068;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass115_10 : aClass115_11;
							if (arg0 == 1600) {
								anIntArray398[anInt4294++] = local137.anInt3485;
								return;
							}
							if (arg0 == 1601) {
								anIntArray398[anInt4294++] = local137.anInt3526;
								return;
							}
							if (arg0 == 1602) {
								aStringArray17[anInt4284++] = local137.aString32;
								return;
							}
							if (arg0 == 1603) {
								anIntArray398[anInt4294++] = local137.anInt3462;
								return;
							}
							if (arg0 == 1604) {
								anIntArray398[anInt4294++] = local137.anInt3484;
								return;
							}
							if (arg0 == 1605) {
								anIntArray398[anInt4294++] = local137.anInt3467;
								return;
							}
							if (arg0 == 1606) {
								anIntArray398[anInt4294++] = local137.anInt3444;
								return;
							}
							if (arg0 == 1607) {
								anIntArray398[anInt4294++] = local137.anInt3472;
								return;
							}
							if (arg0 == 1608) {
								anIntArray398[anInt4294++] = local137.anInt3492;
								return;
							}
							if (arg0 == 1609) {
								anIntArray398[anInt4294++] = local137.anInt3511;
								return;
							}
							if (arg0 == 1610) {
								anIntArray398[anInt4294++] = local137.anInt3476;
								return;
							}
							if (arg0 == 1611) {
								anIntArray398[anInt4294++] = local137.anInt3477;
								return;
							}
							if (arg0 == 1612) {
								anIntArray398[anInt4294++] = local137.anInt3442;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray398[--anInt4294];
								local3068 = Static53.aClass152_1.method3679(local19);
								if (local3068.method1335()) {
									aStringArray17[anInt4284++] = local137.method3135(local19, local3068.aString17);
									return;
								}
								anIntArray398[anInt4294++] = local137.method3136(local3068.anInt1575, local19);
								return;
							}
							if (arg0 == 1614) {
								anIntArray398[anInt4294++] = local137.anInt3449;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass115_10 : aClass115_11;
							if (arg0 == 1700) {
								anIntArray398[anInt4294++] = local137.anInt3510;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt3510 != -1) {
									anIntArray398[anInt4294++] = local137.anInt3487;
									return;
								}
								anIntArray398[anInt4294++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray398[anInt4294++] = local137.anInt3517;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass115_10 : aClass115_11;
							if (arg0 == 1800) {
								anIntArray398[anInt4294++] = Static69.method1233(local137).method4973();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray398[--anInt4294];
								local19--;
								if (local137.aStringArray11 != null && local19 < local137.aStringArray11.length && local137.aStringArray11[local19] != null) {
									aStringArray17[anInt4284++] = local137.aStringArray11[local19];
									return;
								}
								aStringArray17[anInt4284++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString33 == null) {
									aStringArray17[anInt4284++] = "";
									return;
								}
								aStringArray17[anInt4284++] = local137.aString33;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static92.method2118(anIntArray398[--anInt4294]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass115_10 : aClass115_11;
							}
							if (anInt4295 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray8 == null) {
									return;
								}
								@Pc(3318) Class4_Sub12 local3318 = new Class4_Sub12();
								local3318.aClass115_5 = local137;
								local3318.anObjectArray3 = local137.anObjectArray8;
								local3318.anInt2445 = anInt4295 + 1;
								Static577.aClass124_67.method3275(local3318);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static92.method2118(anIntArray398[--anInt4294]);
							if (arg0 == 2500) {
								anIntArray398[anInt4294++] = local137.anInt3456;
								return;
							}
							if (arg0 == 2501) {
								anIntArray398[anInt4294++] = local137.anInt3458;
								return;
							}
							if (arg0 == 2502) {
								anIntArray398[anInt4294++] = local137.anInt3474;
								return;
							}
							if (arg0 == 2503) {
								anIntArray398[anInt4294++] = local137.anInt3481;
								return;
							}
							if (arg0 == 2504) {
								anIntArray398[anInt4294++] = local137.aBoolean283 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray398[anInt4294++] = local137.anInt3441;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static352.method7380(local137);
								anIntArray398[anInt4294++] = local158 == null ? -1 : local158.anInt3464;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static92.method2118(anIntArray398[--anInt4294]);
							if (arg0 == 2600) {
								anIntArray398[anInt4294++] = local137.anInt3485;
								return;
							}
							if (arg0 == 2601) {
								anIntArray398[anInt4294++] = local137.anInt3526;
								return;
							}
							if (arg0 == 2602) {
								aStringArray17[anInt4284++] = local137.aString32;
								return;
							}
							if (arg0 == 2603) {
								anIntArray398[anInt4294++] = local137.anInt3462;
								return;
							}
							if (arg0 == 2604) {
								anIntArray398[anInt4294++] = local137.anInt3484;
								return;
							}
							if (arg0 == 2605) {
								anIntArray398[anInt4294++] = local137.anInt3467;
								return;
							}
							if (arg0 == 2606) {
								anIntArray398[anInt4294++] = local137.anInt3444;
								return;
							}
							if (arg0 == 2607) {
								anIntArray398[anInt4294++] = local137.anInt3472;
								return;
							}
							if (arg0 == 2608) {
								anIntArray398[anInt4294++] = local137.anInt3492;
								return;
							}
							if (arg0 == 2609) {
								anIntArray398[anInt4294++] = local137.anInt3511;
								return;
							}
							if (arg0 == 2610) {
								anIntArray398[anInt4294++] = local137.anInt3476;
								return;
							}
							if (arg0 == 2611) {
								anIntArray398[anInt4294++] = local137.anInt3477;
								return;
							}
							if (arg0 == 2612) {
								anIntArray398[anInt4294++] = local137.anInt3442;
								return;
							}
							if (arg0 == 2613) {
								anIntArray398[anInt4294++] = local137.anInt3449;
								return;
							}
						} else {
							@Pc(3828) Class4_Sub49 local3828;
							@Pc(3726) Class4_Sub49 local3726;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static92.method2118(anIntArray398[--anInt4294]);
									anIntArray398[anInt4294++] = local137.anInt3510;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static92.method2118(anIntArray398[--anInt4294]);
									if (local137.anInt3510 != -1) {
										anIntArray398[anInt4294++] = local137.anInt3487;
										return;
									}
									anIntArray398[anInt4294++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray398[--anInt4294];
									local3726 = (Class4_Sub49) Static543.aClass183_39.method4289((long) local13);
									if (local3726 != null) {
										anIntArray398[anInt4294++] = 1;
										return;
									}
									anIntArray398[anInt4294++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static92.method2118(anIntArray398[--anInt4294]);
									if (local137.aClass115Array1 == null) {
										anIntArray398[anInt4294++] = 0;
										return;
									}
									local19 = local137.aClass115Array1.length;
									for (local25 = 0; local25 < local137.aClass115Array1.length; local25++) {
										if (local137.aClass115Array1[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray398[anInt4294++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt4294 -= 2;
									local13 = anIntArray398[anInt4294];
									local19 = anIntArray398[anInt4294 + 1];
									local3828 = (Class4_Sub49) Static543.aClass183_39.method4289((long) local13);
									if (local3828 != null && local3828.anInt9337 == local19) {
										anIntArray398[anInt4294++] = 1;
										return;
									}
									anIntArray398[anInt4294++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static92.method2118(anIntArray398[--anInt4294]);
								if (arg0 == 2800) {
									anIntArray398[anInt4294++] = Static69.method1233(local137).method4973();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray398[--anInt4294];
									local19--;
									if (local137.aStringArray11 != null && local19 < local137.aStringArray11.length && local137.aStringArray11[local19] != null) {
										aStringArray17[anInt4284++] = local137.aStringArray11[local19];
										return;
									}
									aStringArray17[anInt4284++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString33 == null) {
										aStringArray17[anInt4284++] = "";
										return;
									}
									aStringArray17[anInt4284++] = local137.aString33;
									return;
								}
							} else {
								@Pc(3965) String local3965;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3965 = aStringArray17[--anInt4284];
										Static354.method5234(local3965);
										return;
									}
									if (arg0 == 3101) {
										anInt4294 -= 2;
										Static470.method6548(Static129.aClass10_Sub1_Sub2_Sub2_1, anIntArray398[anInt4294 + 1], anIntArray398[anInt4294]);
										return;
									}
									if (arg0 == 3103) {
										Static461.method6473();
										return;
									}
									if (arg0 == 3104) {
										local3965 = aStringArray17[--anInt4284];
										local19 = 0;
										if (Static241.method4087(local3965)) {
											local19 = Static272.method4392(local3965);
										}
										@Pc(4025) Class4_Sub41 local4025 = Static128.method2707(Static317.aClass61_73, Class16_Sub3.lb);
										local4025.aClass4_Sub9_Sub1_3.method5963(local19);
										Static551.method7603(local4025);
										return;
									}
									@Pc(4054) Class4_Sub41 local4054;
									if (arg0 == 3105) {
										local3965 = aStringArray17[--anInt4284];
										local4054 = Static128.method2707(Static210.aClass61_50, Class16_Sub3.lb);
										local4054.aClass4_Sub9_Sub1_3.method5961(-345277664, local3965.length() + 1);
										local4054.aClass4_Sub9_Sub1_3.method6000(local3965);
										Static551.method7603(local4054);
										return;
									}
									if (arg0 == 3106) {
										local3965 = aStringArray17[--anInt4284];
										local4054 = Static128.method2707(Static242.aClass61_53, Class16_Sub3.lb);
										local4054.aClass4_Sub9_Sub1_3.method5961(-345277664, local3965.length() + 1);
										local4054.aClass4_Sub9_Sub1_3.method6000(local3965);
										Static551.method7603(local4054);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray398[--anInt4294];
										local1145 = aStringArray17[--anInt4284];
										Static411.method5915(local13, local1145);
										return;
									}
									if (arg0 == 3108) {
										anInt4294 -= 3;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local25 = anIntArray398[anInt4294 + 2];
										local35 = Static92.method2118(local25);
										Static44.method732(local13, local35, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local210 = arg1 ? aClass115_10 : aClass115_11;
										Static44.method732(local13, local210, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray398[--anInt4294];
										local4054 = Static128.method2707(Static405.aClass61_92, Class16_Sub3.lb);
										local4054.aClass4_Sub9_Sub1_3.method6012(local13);
										Static551.method7603(local4054);
										return;
									}
									if (arg0 == 3111) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local3828 = (Class4_Sub49) Static543.aClass183_39.method4289((long) local13);
										if (local3828 != null) {
											Static597.method8029(local3828, true, local3828.anInt9337 != local19);
										}
										Static241.method4092(local19, local13, true, 3);
										return;
									}
									if (arg0 == 3112) {
										anInt4294--;
										local13 = anIntArray398[anInt4294];
										local3726 = (Class4_Sub49) Static543.aClass183_39.method4289((long) local13);
										if (local3726 != null && local3726.anInt9334 == 3) {
											Static597.method8029(local3726, true, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static107.method6139(aStringArray17[--anInt4284]);
										return;
									}
									if (arg0 == 3114) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local1532 = aStringArray17[--anInt4284];
										Static410.method5899("", "", local1532, local13, "", local19);
										return;
									}
									if (arg0 == 3115) {
										anInt4294 -= 11;
										@Pc(4355) Class297[] local4355 = Static192.method3526();
										@Pc(4358) Class58[] local4358 = Static458.method6443();
										Static379.method5834(anIntArray398[anInt4294 + 3], anIntArray398[anInt4294 + 6], local4358[anIntArray398[anInt4294 + 1]], local4355[anIntArray398[anInt4294]], anIntArray398[anInt4294 + 4], anIntArray398[anInt4294 + 2], anIntArray398[anInt4294 + 5], anIntArray398[anInt4294 + 8], anIntArray398[anInt4294 + 10], anIntArray398[anInt4294 + 7], anIntArray398[anInt4294 + 9]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt4294 -= 3;
										Static3.method60(anIntArray398[anInt4294 + 1], 255, anIntArray398[anInt4294 + 2], anIntArray398[anInt4294]);
										return;
									}
									if (arg0 == 3201) {
										Static178.method3349(255, anIntArray398[--anInt4294], 50);
										return;
									}
									if (arg0 == 3202) {
										anInt4294 -= 2;
										Static466.method6512(255, anIntArray398[anInt4294 + 1], anIntArray398[anInt4294]);
										return;
									}
									if (arg0 == 3203) {
										anInt4294 -= 4;
										Static3.method60(anIntArray398[anInt4294 + 1], anIntArray398[anInt4294 + 3], anIntArray398[anInt4294 + 2], anIntArray398[anInt4294]);
										return;
									}
									if (arg0 == 3204) {
										anInt4294 -= 3;
										Static178.method3349(anIntArray398[anInt4294 + 1], anIntArray398[anInt4294], anIntArray398[anInt4294 + 2]);
										return;
									}
									if (arg0 == 3205) {
										anInt4294 -= 3;
										Static466.method6512(anIntArray398[anInt4294 + 2], anIntArray398[anInt4294 + 1], anIntArray398[anInt4294]);
										return;
									}
									if (arg0 == 3206) {
										anInt4294 -= 4;
										Static560.method7718(anIntArray398[anInt4294 + 2], anIntArray398[anInt4294 + 3], anIntArray398[anInt4294], false, anIntArray398[anInt4294 + 1]);
										return;
									}
									if (arg0 == 3207) {
										anInt4294 -= 4;
										Static560.method7718(anIntArray398[anInt4294 + 2], anIntArray398[anInt4294 + 3], anIntArray398[anInt4294], true, anIntArray398[anInt4294 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray398[anInt4294++] = Static237.anInt7561;
										return;
									}
									if (arg0 == 3301) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = Static472.method6575(local19, false, local13);
										return;
									}
									if (arg0 == 3302) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = Static23.method437(local13, local19, false);
										return;
									}
									if (arg0 == 3303) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = Static541.method7508(false, local19, local13);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static20.aClass142_1.method3547(local13).anInt7836;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static365.anIntArray528[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static384.anIntArray545[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static339.anIntArray487[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4812) byte local4812 = Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101;
										local19 = (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934 >> 9) + Static373.anInt6695;
										local25 = (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929 >> 9) + Static6.anInt97;
										anIntArray398[anInt4294++] = (local4812 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray398[anInt4294++] = Static148.aBoolean511 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = Static472.method6575(local19, true, local13);
										return;
									}
									if (arg0 == 3314) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = Static23.method437(local13, local19, true);
										return;
									}
									if (arg0 == 3315) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = Static541.method7508(true, local19, local13);
										return;
									}
									if (arg0 == 3316) {
										if (Static540.anInt9129 >= 2) {
											anIntArray398[anInt4294++] = Static540.anInt9129;
											return;
										}
										anIntArray398[anInt4294++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray398[anInt4294++] = Static72.anInt1537;
										return;
									}
									if (arg0 == 3318) {
										anIntArray398[anInt4294++] = Static238.aClass300_10.anInt7993;
										return;
									}
									if (arg0 == 3321) {
										anIntArray398[anInt4294++] = Static304.anInt5550;
										return;
									}
									if (arg0 == 3322) {
										anIntArray398[anInt4294++] = Static121.anInt7260;
										return;
									}
									if (arg0 == 3323) {
										if (Static248.anInt4941 >= 5 && Static248.anInt4941 <= 9) {
											anIntArray398[anInt4294++] = 1;
											return;
										}
										anIntArray398[anInt4294++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static248.anInt4941 >= 5 && Static248.anInt4941 <= 9) {
											anIntArray398[anInt4294++] = Static248.anInt4941;
											return;
										}
										anIntArray398[anInt4294++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray398[anInt4294++] = Static268.aBoolean388 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray398[anInt4294++] = Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8575;
										return;
									}
									if (arg0 == 3327) {
										anIntArray398[anInt4294++] = Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1.aBoolean680 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray398[anInt4294++] = Static266.aBoolean387 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static280.method4438(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = Static90.method2059(false, local19, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = Static90.method2059(true, local19, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray398[anInt4294++] = Static64.anInt1206;
										return;
									}
									if (arg0 == 3335) {
										anIntArray398[anInt4294++] = Static56.anInt953;
										return;
									}
									if (arg0 == 3336) {
										anInt4294 -= 4;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local25 = anIntArray398[anInt4294 + 2];
										local353 = anIntArray398[anInt4294 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray398[anInt4294++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray398[anInt4294++] = Static431.anInt7395;
										return;
									}
									if (arg0 == 3338) {
										anIntArray398[anInt4294++] = Static437.method6210();
										return;
									}
									if (arg0 == 3339) {
										anIntArray398[anInt4294++] = Static208.aBoolean323 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray398[anInt4294++] = Static340.aBoolean446 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray398[anInt4294++] = Static376.aBoolean498 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray398[anInt4294++] = Static86.aClass50_1.method7100();
										return;
									}
									if (arg0 == 3343) {
										anIntArray398[anInt4294++] = Static86.aClass50_1.method7102();
										return;
									}
									if (arg0 == 3344) {
										aStringArray17[anInt4284++] = Static32.method569();
										return;
									}
									if (arg0 == 3345) {
										aStringArray17[anInt4284++] = Static16.method328();
										return;
									}
									if (arg0 == 3346) {
										anIntArray398[anInt4294++] = Static275.method4408();
										return;
									}
									if (arg0 == 3347) {
										anIntArray398[anInt4294++] = Static110.anInt2613;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5547) Class146 local5547;
									if (arg0 == 3400) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local5547 = Static244.aClass205_1.method4571(local13);
										aStringArray17[anInt4284++] = local5547.method3572(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt4294 -= 4;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local25 = anIntArray398[anInt4294 + 2];
										local353 = anIntArray398[anInt4294 + 3];
										@Pc(5593) Class146 local5593 = Static244.aClass205_1.method4571(local25);
										if (local5593.aChar3 == local13 && local5593.aChar2 == local19) {
											if (local19 == 115) {
												aStringArray17[anInt4284++] = local5593.method3572(local353);
												return;
											}
											anIntArray398[anInt4294++] = local5593.method3573(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt4294 -= 3;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local25 = anIntArray398[anInt4294 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5669) Class146 local5669 = Static244.aClass205_1.method4571(local19);
										if (local5669.aChar2 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray398[anInt4294++] = local5669.method3566(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray398[--anInt4294];
										local1145 = aStringArray17[--anInt4284];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5547 = Static244.aClass205_1.method4571(local13);
										if (local5547.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray398[anInt4294++] = local5547.method3571(local1145) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray398[--anInt4294];
										@Pc(5767) Class146 local5767 = Static244.aClass205_1.method4571(local13);
										anIntArray398[anInt4294++] = local5767.aClass183_17.method4291();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static98.anInt2440 == 0) {
											anIntArray398[anInt4294++] = -2;
											return;
										}
										if (Static98.anInt2440 == 1) {
											anIntArray398[anInt4294++] = -1;
											return;
										}
										anIntArray398[anInt4294++] = Static282.anInt5285;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray398[--anInt4294];
										if (Static98.anInt2440 == 2 && local13 < Static282.anInt5285) {
											aStringArray17[anInt4284++] = Static300.aStringArray26[local13];
											if (Static38.aStringArray3[local13] != null) {
												aStringArray17[anInt4284++] = Static38.aStringArray3[local13];
												return;
											}
											aStringArray17[anInt4284++] = "";
											return;
										}
										aStringArray17[anInt4284++] = "";
										aStringArray17[anInt4284++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray398[--anInt4294];
										if (Static98.anInt2440 == 2 && local13 < Static282.anInt5285) {
											anIntArray398[anInt4294++] = Static26.anIntArray417[local13];
											return;
										}
										anIntArray398[anInt4294++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray398[--anInt4294];
										if (Static98.anInt2440 == 2 && local13 < Static282.anInt5285) {
											anIntArray398[anInt4294++] = Static506.anIntArray669[local13];
											return;
										}
										anIntArray398[anInt4294++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3965 = aStringArray17[--anInt4284];
										local19 = anIntArray398[--anInt4294];
										Static224.method3851(local19, local3965);
										return;
									}
									if (arg0 == 3605) {
										local3965 = aStringArray17[--anInt4284];
										Static184.method3420(local3965);
										return;
									}
									if (arg0 == 3606) {
										local3965 = aStringArray17[--anInt4284];
										Static262.method4308(local3965);
										return;
									}
									if (arg0 == 3607) {
										local3965 = aStringArray17[--anInt4284];
										Static529.method7391(local3965, false);
										return;
									}
									if (arg0 == 3608) {
										local3965 = aStringArray17[--anInt4284];
										Static590.method7938(local3965);
										return;
									}
									if (arg0 == 3609) {
										local3965 = aStringArray17[--anInt4284];
										if (local3965.startsWith("<img=0>") || local3965.startsWith("<img=1>")) {
											local3965 = local3965.substring(7);
										}
										anIntArray398[anInt4294++] = Static263.method6569(local3965) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray398[--anInt4294];
										if (Static98.anInt2440 == 2 && local13 < Static282.anInt5285) {
											aStringArray17[anInt4284++] = Static12.aStringArray1[local13];
											return;
										}
										aStringArray17[anInt4284++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static210.aString44 != null) {
											aStringArray17[anInt4284++] = Static426.method6085(Static210.aString44);
											return;
										}
										aStringArray17[anInt4284++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static210.aString44 != null) {
											anIntArray398[anInt4294++] = Static63.anInt1182;
											return;
										}
										anIntArray398[anInt4294++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray398[--anInt4294];
										if (Static210.aString44 != null && local13 < Static63.anInt1182) {
											aStringArray17[anInt4284++] = Static168.aClass193Array1[local13].aString66;
											return;
										}
										aStringArray17[anInt4284++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray398[--anInt4294];
										if (Static210.aString44 != null && local13 < Static63.anInt1182) {
											anIntArray398[anInt4294++] = Static168.aClass193Array1[local13].anInt5149;
											return;
										}
										anIntArray398[anInt4294++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray398[--anInt4294];
										if (Static210.aString44 != null && local13 < Static63.anInt1182) {
											anIntArray398[anInt4294++] = Static168.aClass193Array1[local13].aByte66;
											return;
										}
										anIntArray398[anInt4294++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray398[anInt4294++] = Static68.aByte26;
										return;
									}
									if (arg0 == 3617) {
										local3965 = aStringArray17[--anInt4284];
										Static133.method2782(local3965);
										return;
									}
									if (arg0 == 3618) {
										anIntArray398[anInt4294++] = Static535.aByte104;
										return;
									}
									if (arg0 == 3619) {
										local3965 = aStringArray17[--anInt4284];
										Static592.method7971(local3965);
										return;
									}
									if (arg0 == 3620) {
										Static471.method6561();
										return;
									}
									if (arg0 == 3621) {
										if (Static98.anInt2440 == 0) {
											anIntArray398[anInt4294++] = -1;
											return;
										}
										anIntArray398[anInt4294++] = Static286.anInt8741;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray398[--anInt4294];
										if (Static98.anInt2440 != 0 && local13 < Static286.anInt8741) {
											aStringArray17[anInt4284++] = Static101.aStringArray5[local13];
											if (Static550.aStringArray38[local13] != null) {
												aStringArray17[anInt4284++] = Static550.aStringArray38[local13];
												return;
											}
											aStringArray17[anInt4284++] = "";
											return;
										}
										aStringArray17[anInt4284++] = "";
										aStringArray17[anInt4284++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3965 = aStringArray17[--anInt4284];
										if (local3965.startsWith("<img=0>") || local3965.startsWith("<img=1>")) {
											local3965 = local3965.substring(7);
										}
										anIntArray398[anInt4294++] = Static15.method308(local3965) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray398[--anInt4294];
										if (Static168.aClass193Array1 != null && local13 < Static63.anInt1182 && Static168.aClass193Array1[local13].aString65.equalsIgnoreCase(Static129.aClass10_Sub1_Sub2_Sub2_1.aString93)) {
											anIntArray398[anInt4294++] = 1;
											return;
										}
										anIntArray398[anInt4294++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static151.aString28 != null) {
											aStringArray17[anInt4284++] = Static151.aString28;
											return;
										}
										aStringArray17[anInt4284++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray398[--anInt4294];
										if (Static210.aString44 != null && local13 < Static63.anInt1182) {
											aStringArray17[anInt4284++] = Static168.aClass193Array1[local13].aString67;
											return;
										}
										aStringArray17[anInt4284++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray398[--anInt4294];
										if (Static98.anInt2440 == 2 && local13 >= 0 && local13 < Static282.anInt5285) {
											anIntArray398[anInt4294++] = Static520.aBooleanArray38[local13] ? 1 : 0;
											return;
										}
										anIntArray398[anInt4294++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3965 = aStringArray17[--anInt4284];
										if (local3965.startsWith("<img=0>") || local3965.startsWith("<img=1>")) {
											local3965 = local3965.substring(7);
										}
										anIntArray398[anInt4294++] = Static317.method4844(local3965);
										return;
									}
									if (arg0 == 3629) {
										anIntArray398[anInt4294++] = Static95.anInt9216;
										return;
									}
									if (arg0 == 3630) {
										local3965 = aStringArray17[--anInt4284];
										Static529.method7391(local3965, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static410.aBooleanArray29[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray398[--anInt4294];
										if (Static210.aString44 != null && local13 < Static63.anInt1182) {
											aStringArray17[anInt4284++] = Static168.aClass193Array1[local13].aString65;
											return;
										}
										aStringArray17[anInt4284++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray398[--anInt4294];
										if (Static98.anInt2440 != 0 && local13 < Static286.anInt8741) {
											aStringArray17[anInt4284++] = Static383.aStringArray29[local13];
											return;
										}
										aStringArray17[anInt4284++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static221.aClass334Array1[local13].method7419();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static221.aClass334Array1[local13].anInt9034;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static221.aClass334Array1[local13].anInt9039;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static221.aClass334Array1[local13].anInt9038;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static221.aClass334Array1[local13].anInt9035;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static221.aClass334Array1[local13].anInt9043;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray398[--anInt4294];
										local19 = Static221.aClass334Array1[local13].method7417();
										anIntArray398[anInt4294++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray398[--anInt4294];
										local19 = Static221.aClass334Array1[local13].method7417();
										anIntArray398[anInt4294++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray398[--anInt4294];
										local19 = Static221.aClass334Array1[local13].method7417();
										anIntArray398[anInt4294++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray398[--anInt4294];
										local19 = Static221.aClass334Array1[local13].method7417();
										anIntArray398[anInt4294++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt4294 -= 5;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local25 = anIntArray398[anInt4294 + 2];
										local353 = anIntArray398[anInt4294 + 3];
										local2334 = anIntArray398[anInt4294 + 4];
										anIntArray398[anInt4294++] = local13 + (local19 - local13) * (local2334 - local25) / (local353 - local25);
										return;
									}
									@Pc(7277) long local7277;
									@Pc(7270) long local7270;
									if (arg0 == 4007) {
										anInt4294 -= 2;
										local7270 = anIntArray398[anInt4294];
										local7277 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = (int) (local7270 + local7270 * local7277 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										if (local13 == 0) {
											anIntArray398[anInt4294++] = 0;
											return;
										}
										anIntArray398[anInt4294++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										if (local13 == 0) {
											anIntArray398[anInt4294++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray398[anInt4294++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray398[anInt4294++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt4294 -= 3;
										local7270 = anIntArray398[anInt4294];
										local7277 = anIntArray398[anInt4294 + 1];
										@Pc(7658) long local7658 = (long) anIntArray398[anInt4294 + 2];
										anIntArray398[anInt4294++] = (int) (local7270 * local7658 / local7277);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3965 = aStringArray17[--anInt4284];
										local19 = anIntArray398[--anInt4294];
										aStringArray17[anInt4284++] = local3965 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt4284 -= 2;
										local3965 = aStringArray17[anInt4284];
										local1145 = aStringArray17[anInt4284 + 1];
										aStringArray17[anInt4284++] = local3965 + local1145;
										return;
									}
									if (arg0 == 4102) {
										local3965 = aStringArray17[--anInt4284];
										local19 = anIntArray398[--anInt4294];
										aStringArray17[anInt4284++] = local3965 + Static87.method2046(local19);
										return;
									}
									if (arg0 == 4103) {
										local3965 = aStringArray17[--anInt4284];
										aStringArray17[anInt4284++] = local3965.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray17[anInt4284++] = method3637(anIntArray398[--anInt4294]);
										return;
									}
									if (arg0 == 4105) {
										anInt4284 -= 2;
										local3965 = aStringArray17[anInt4284];
										local1145 = aStringArray17[anInt4284 + 1];
										if (Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1 != null && Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1.aBoolean680) {
											aStringArray17[anInt4284++] = local1145;
											return;
										}
										aStringArray17[anInt4284++] = local3965;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray398[--anInt4294];
										aStringArray17[anInt4284++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt4284 -= 2;
										anIntArray398[anInt4294++] = Static208.method3670(aStringArray17[anInt4284 + 1], aStringArray17[anInt4284], Static56.anInt953);
										return;
									}
									@Pc(7941) Class196 local7941;
									if (arg0 == 4108) {
										local3965 = aStringArray17[--anInt4284];
										anInt4294 -= 2;
										local19 = anIntArray398[anInt4294];
										local25 = anIntArray398[anInt4294 + 1];
										local7941 = Static297.method4643(local25, Static520.aClass31_110);
										anIntArray398[anInt4294++] = local7941.method4382(local3965, local19, Static223.aClass13Array15);
										return;
									}
									if (arg0 == 4109) {
										local3965 = aStringArray17[--anInt4284];
										anInt4294 -= 2;
										local19 = anIntArray398[anInt4294];
										local25 = anIntArray398[anInt4294 + 1];
										local7941 = Static297.method4643(local25, Static520.aClass31_110);
										anIntArray398[anInt4294++] = local7941.method4380(local3965, Static223.aClass13Array15, local19);
										return;
									}
									if (arg0 == 4110) {
										anInt4284 -= 2;
										local3965 = aStringArray17[anInt4284];
										local1145 = aStringArray17[anInt4284 + 1];
										if (anIntArray398[--anInt4294] == 1) {
											aStringArray17[anInt4284++] = local3965;
											return;
										}
										aStringArray17[anInt4284++] = local1145;
										return;
									}
									if (arg0 == 4111) {
										local3965 = aStringArray17[--anInt4284];
										aStringArray17[anInt4284++] = Static95.method7585(local3965);
										return;
									}
									if (arg0 == 4112) {
										local3965 = aStringArray17[--anInt4284];
										local19 = anIntArray398[--anInt4294];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray17[anInt4284++] = local3965 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static413.method5931((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static88.method2052((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static533.method7416((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static425.method6084((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3965 = aStringArray17[--anInt4284];
										if (local3965 != null) {
											anIntArray398[anInt4294++] = local3965.length();
											return;
										}
										anIntArray398[anInt4294++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3965 = aStringArray17[--anInt4284];
										anInt4294 -= 2;
										local19 = anIntArray398[anInt4294];
										local25 = anIntArray398[anInt4294 + 1];
										aStringArray17[anInt4284++] = local3965.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3965 = aStringArray17[--anInt4284];
										@Pc(8304) StringBuffer local8304 = new StringBuffer(local3965.length());
										@Pc(8306) boolean local8306 = false;
										for (local353 = 0; local353 < local3965.length(); local353++) {
											@Pc(8313) char local8313 = local3965.charAt(local353);
											if (local8313 == '<') {
												local8306 = true;
											} else if (local8313 == '>') {
												local8306 = false;
											} else if (!local8306) {
												local8304.append(local8313);
											}
										}
										aStringArray17[anInt4284++] = local8304.toString();
										return;
									}
									if (arg0 == 4120) {
										local3965 = aStringArray17[--anInt4284];
										anInt4294 -= 2;
										local19 = anIntArray398[anInt4294];
										local25 = anIntArray398[anInt4294 + 1];
										anIntArray398[anInt4294++] = local3965.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt4284 -= 2;
										local3965 = aStringArray17[anInt4284];
										local1145 = aStringArray17[anInt4284 + 1];
										local25 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = local3965.indexOf(local1145, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray398[--anInt4294] != 0;
										local19 = anIntArray398[--anInt4294];
										aStringArray17[anInt4284++] = Static561.method7023(0, Static56.anInt953, (long) local19, local412);
										return;
									}
									if (arg0 == 4125) {
										local3965 = aStringArray17[--anInt4284];
										local19 = anIntArray398[--anInt4294];
										@Pc(8527) Class196 local8527 = Static297.method4643(local19, Static520.aClass31_110);
										anIntArray398[anInt4294++] = local8527.method4377(Static223.aClass13Array15, local3965);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray398[--anInt4294];
										aStringArray17[anInt4284++] = Static195.aClass99_1.method2798(local13).aString72;
										return;
									}
									@Pc(8589) Class222 local8589;
									if (arg0 == 4201) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local8589 = Static195.aClass99_1.method2798(local13);
										if (local19 >= 1 && local19 <= 5 && local8589.aStringArray27[local19 - 1] != null) {
											aStringArray17[anInt4284++] = local8589.aStringArray27[local19 - 1];
											return;
										}
										aStringArray17[anInt4284++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local8589 = Static195.aClass99_1.method2798(local13);
										if (local19 >= 1 && local19 <= 5 && local8589.aStringArray28[local19 - 1] != null) {
											aStringArray17[anInt4284++] = local8589.aStringArray28[local19 - 1];
											return;
										}
										aStringArray17[anInt4284++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static195.aClass99_1.method2798(local13).anInt5833;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static195.aClass99_1.method2798(local13).anInt5791 == 1 ? 1 : 0;
										return;
									}
									@Pc(8752) Class222 local8752;
									if (arg0 == 4205) {
										local13 = anIntArray398[--anInt4294];
										local8752 = Static195.aClass99_1.method2798(local13);
										if (local8752.anInt5784 == -1 && local8752.anInt5815 >= 0) {
											anIntArray398[anInt4294++] = local8752.anInt5815;
											return;
										}
										anIntArray398[anInt4294++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray398[--anInt4294];
										local8752 = Static195.aClass99_1.method2798(local13);
										if (local8752.anInt5784 >= 0 && local8752.anInt5815 >= 0) {
											anIntArray398[anInt4294++] = local8752.anInt5815;
											return;
										}
										anIntArray398[anInt4294++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static195.aClass99_1.method2798(local13).aBoolean432 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local3068 = Static53.aClass152_1.method3679(local19);
										if (local3068.method1335()) {
											aStringArray17[anInt4284++] = Static195.aClass99_1.method2798(local13).method4920(local19, local3068.aString17);
											return;
										}
										anIntArray398[anInt4294++] = Static195.aClass99_1.method2798(local13).method4922(local19, local3068.anInt1575);
										return;
									}
									if (arg0 == 4209) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1] - 1;
										local8589 = Static195.aClass99_1.method2798(local13);
										if (local8589.anInt5805 == local19) {
											anIntArray398[anInt4294++] = local8589.anInt5792;
											return;
										}
										if (local8589.anInt5828 == local19) {
											anIntArray398[anInt4294++] = local8589.anInt5780;
											return;
										}
										anIntArray398[anInt4294++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3965 = aStringArray17[--anInt4284];
										local19 = anIntArray398[--anInt4294];
										Static279.method4434(local3965, local19 == 1);
										anIntArray398[anInt4294++] = Static3.anInt32;
										return;
									}
									if (arg0 == 4211) {
										if (Static556.aShortArray132 != null && Static178.anInt3781 < Static3.anInt32) {
											anIntArray398[anInt4294++] = Static556.aShortArray132[Static178.anInt3781++] & 0xFFFF;
											return;
										}
										anIntArray398[anInt4294++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static178.anInt3781 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray398[--anInt4294];
										anIntArray398[anInt4294++] = Static195.aClass99_1.method2798(local13).anInt5810;
										return;
									}
									if (arg0 == 4214) {
										local3965 = aStringArray17[--anInt4284];
										anInt4294 -= 3;
										local19 = anIntArray398[anInt4294];
										local25 = anIntArray398[anInt4294 + 1];
										local353 = anIntArray398[anInt4294 + 2];
										Static209.method7917(local353, local25, local3965, local19 == 1);
										anIntArray398[anInt4294++] = Static3.anInt32;
										return;
									}
									if (arg0 == 4215) {
										anInt4284 -= 2;
										anInt4294 -= 2;
										local3965 = aStringArray17[anInt4284];
										local19 = anIntArray398[anInt4294];
										local25 = anIntArray398[anInt4294 + 1];
										@Pc(9151) String local9151 = aStringArray17[anInt4284 + 1];
										Static1.method45(local9151, local19 == 1, local3965, local25);
										anIntArray398[anInt4294++] = Static3.anInt32;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local3068 = Static53.aClass152_1.method3679(local19);
										if (local3068.method1335()) {
											aStringArray17[anInt4284++] = Static401.aClass345_2.method7602(local13).method1111(local19, local3068.aString17);
											return;
										}
										anIntArray398[anInt4294++] = Static401.aClass345_2.method7602(local13).method1114(local3068.anInt1575, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local3068 = Static53.aClass152_1.method3679(local19);
										if (local3068.method1335()) {
											aStringArray17[anInt4284++] = Static553.aClass288_4.method6419(local13).method576(local3068.aString17, local19);
											return;
										}
										anIntArray398[anInt4294++] = Static553.aClass288_4.method6419(local13).method560(local3068.anInt1575, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt4294 -= 2;
										local13 = anIntArray398[anInt4294];
										local19 = anIntArray398[anInt4294 + 1];
										local3068 = Static53.aClass152_1.method3679(local19);
										if (local3068.method1335()) {
											aStringArray17[anInt4284++] = Static506.aClass143_1.method3551(local13).method7854(local3068.aString17, local19);
											return;
										}
										anIntArray398[anInt4294++] = Static506.aClass143_1.method3551(local13).method7856(local19, local3068.anInt1575);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray398[--anInt4294];
									@Pc(9379) Class130 local9379 = Static251.aClass127_1.method3342(local13);
									if (local9379.anIntArray369 != null && local9379.anIntArray369.length > 0) {
										local25 = 0;
										local353 = local9379.anIntArray368[0];
										for (local2334 = 1; local2334 < local9379.anIntArray369.length; local2334++) {
											if (local9379.anIntArray368[local2334] > local353) {
												local25 = local2334;
												local353 = local9379.anIntArray368[local2334];
											}
										}
										anIntArray398[anInt4294++] = local9379.anIntArray369[local25];
										return;
									}
									anIntArray398[anInt4294++] = local9379.anInt3818;
									return;
								}
							}
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}
}
