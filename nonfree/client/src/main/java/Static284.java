import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "Lclient!at;")
	private static Class24 aClass24_11;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "Lclient!iia;")
	private static Class154 aClass154_1;

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray24;

	@OriginalMember(owner = "client!kca", name = "p", descriptor = "[I")
	private static int[] anIntArray343;

	@OriginalMember(owner = "client!kca", name = "u", descriptor = "Lclient!at;")
	private static Class24 aClass24_12;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "[I")
	private static final int[] anIntArray342 = new int[1000];

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray23 = new String[1000];

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
	private static int anInt5974 = 0;

	@OriginalMember(owner = "client!kca", name = "l", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!kca", name = "m", descriptor = "[[I")
	private static final int[][] anIntArrayArray30 = new int[5][5000];

	@OriginalMember(owner = "client!kca", name = "t", descriptor = "[Lclient!qea;")
	private static final Class276[] aClass276Array1 = new Class276[50];

	@OriginalMember(owner = "client!kca", name = "v", descriptor = "I")
	private static int anInt5984 = 0;

	@OriginalMember(owner = "client!kca", name = "x", descriptor = "[I")
	private static final int[] anIntArray344 = new int[5];

	@OriginalMember(owner = "client!kca", name = "y", descriptor = "I")
	private static int anInt5986 = 0;

	@OriginalMember(owner = "client!kca", name = "z", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_33 = new Class169(4);

	@OriginalMember(owner = "client!kca", name = "A", descriptor = "[I")
	private static final int[] anIntArray345 = new int[3];

	@OriginalMember(owner = "client!kca", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray25 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!kca", name = "C", descriptor = "I")
	private static int anInt5987 = 0;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!uw;II)V")
	public static void method5149(@OriginalArg(0) Class350 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub6_Sub11 local5 = Static404.method6582(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray343 = new int[local5.anInt5667];
		aStringArray24 = new String[local5.anInt5668];
		if (local5.aClass350_4 == Static32.aClass350_2 || local5.aClass350_4 == Static528.aClass350_8 || local5.aClass350_4 == Static306.aClass350_5) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static50.aClass24_5 != null) {
				local30 = Static50.aClass24_5.anInt495;
				local32 = Static50.aClass24_5.anInt465;
			}
			anIntArray343[0] = Static628.aClass9_1.method803() - local30;
			anIntArray343[1] = Static628.aClass9_1.method800() - local32;
		}
		method5159(local5, 200000);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
	private static void method5150(@OriginalArg(0) int arg0) {
		@Pc(3) Class24 local3 = Static87.method8101(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class24[] local13 = Static410.aClass24ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class24[] local19 = Static631.aClass24ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static410.aClass24ArrayArray1[local9] = new Class24[local22];
			Static653.method7721(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static653.method7721(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V")
	public static void method5151(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static80.method2326(arg0)) {
			return;
		}
		@Pc(12) Class24[] local12 = Static631.aClass24ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class24 local19 = local12[local14];
			if (local19.anObjectArray24 != null) {
				@Pc(26) Class2_Sub44 local26 = new Class2_Sub44();
				local26.aClass24_15 = local19;
				local26.anObjectArray32 = local19.anObjectArray24;
				method5160(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IZ)V")
	private static void method5152(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class2_Sub52 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray342[anInt5986++] = Static645.anInt11095;
				return;
			}
			if (arg0 == 5001) {
				anInt5986 -= 3;
				Static645.anInt11095 = anIntArray342[anInt5986];
				Static28.aClass313_1 = Static237.method4454(anIntArray342[anInt5986 + 1]);
				if (Static28.aClass313_1 == null) {
					Static28.aClass313_1 = Static343.aClass313_3;
				}
				Static63.anInt2057 = anIntArray342[anInt5986 + 2];
				local52 = Static130.method3019(Static243.aClass94_50, Static361.aClass183_1);
				local52.aClass2_Sub11_Sub2_7.method8374(Static645.anInt11095);
				local52.aClass2_Sub11_Sub2_7.method8374(Static28.aClass313_1.anInt9428);
				local52.aClass2_Sub11_Sub2_7.method8374(Static63.anInt2057);
				Static96.method2563(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt5984 -= 2;
				local83 = aStringArray23[anInt5984];
				local89 = aStringArray23[anInt5984 + 1];
				anInt5986 -= 2;
				local97 = anIntArray342[anInt5986];
				local103 = anIntArray342[anInt5986 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class2_Sub52 local125 = Static130.method3019(Static394.aClass94_79, Static361.aClass183_1);
				local125.aClass2_Sub11_Sub2_7.method8374(Static296.method5291(local83) + Static296.method5291(local89) + 2);
				local125.aClass2_Sub11_Sub2_7.method8329(local83);
				local125.aClass2_Sub11_Sub2_7.method8374(local97 - 1);
				local125.aClass2_Sub11_Sub2_7.method8374(local103);
				local125.aClass2_Sub11_Sub2_7.method8329(local89);
				Static96.method2563(local125);
				return;
			}
			@Pc(179) Class242 local179;
			if (arg0 == 5003) {
				local175 = anIntArray342[--anInt5986];
				local179 = Static502.method7998(local175);
				local181 = "";
				if (local179 != null && local179.aString85 != null) {
					local181 = local179.aString85;
				}
				aStringArray23[anInt5984++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray342[--anInt5986];
				local179 = Static502.method7998(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt7575;
				}
				anIntArray342[anInt5986++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static28.aClass313_1 == null) {
					anIntArray342[anInt5986++] = -1;
					return;
				}
				anIntArray342[anInt5986++] = Static28.aClass313_1.anInt9428;
				return;
			}
			@Pc(269) Class2_Sub52 local269;
			if (arg0 == 5006) {
				local175 = anIntArray342[--anInt5986];
				local269 = Static130.method3019(Static428.aClass94_60, Static361.aClass183_1);
				local269.aClass2_Sub11_Sub2_7.method8374(local175);
				Static96.method2563(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray23[--anInt5984];
				method5155(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt5984 -= 2;
				local83 = aStringArray23[anInt5984];
				local89 = aStringArray23[anInt5984 + 1];
				if (Static468.anInt8823 != 0 || (!Static209.aBoolean352 || Static381.aBoolean540) && !Static180.aBoolean322) {
					@Pc(328) Class2_Sub52 local328 = Static130.method3019(Static520.aClass94_97, Static361.aClass183_1);
					local328.aClass2_Sub11_Sub2_7.method8374(0);
					local103 = local328.aClass2_Sub11_Sub2_7.anInt10066;
					local328.aClass2_Sub11_Sub2_7.method8329(local83);
					Static47.method1691(local328.aClass2_Sub11_Sub2_7, local89);
					local328.aClass2_Sub11_Sub2_7.method8335(local328.aClass2_Sub11_Sub2_7.anInt10066 - local103);
					Static96.method2563(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray342[--anInt5986];
				local179 = Static502.method7998(local175);
				local181 = "";
				if (local179 != null && local179.aString83 != null) {
					local181 = local179.aString83;
				}
				aStringArray23[anInt5984++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray342[--anInt5986];
				local179 = Static502.method7998(local175);
				local181 = "";
				if (local179 != null && local179.aString82 != null) {
					local181 = local179.aString82;
				}
				aStringArray23[anInt5984++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray342[--anInt5986];
				local179 = Static502.method7998(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt7571;
				}
				anIntArray342[anInt5986++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 == null || Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aString63 == null) {
					local83 = "";
				} else {
					local83 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5226();
				}
				aStringArray23[anInt5984++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray342[anInt5986++] = Static63.anInt2057;
				return;
			}
			if (arg0 == 5017) {
				anIntArray342[anInt5986++] = Static142.method3137();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray342[--anInt5986];
				local179 = Static502.method7998(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt7572;
				}
				anIntArray342[anInt5986++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray342[--anInt5986];
				local179 = Static502.method7998(local175);
				local181 = "";
				if (local179 != null && local179.aString86 != null) {
					local181 = local179.aString86;
				}
				aStringArray23[anInt5984++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 == null || Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aString63 == null) {
					local83 = "";
				} else {
					local83 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5220();
				}
				aStringArray23[anInt5984++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray342[--anInt5986];
				local179 = Static502.method7998(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt7574;
				}
				anIntArray342[anInt5986++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray342[--anInt5986];
				local179 = Static502.method7998(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt7573;
				}
				anIntArray342[anInt5986++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray342[--anInt5986];
				local179 = Static502.method7998(local175);
				local181 = "";
				if (local179 != null && local179.aString84 != null) {
					local181 = local179.aString84;
				}
				aStringArray23[anInt5984++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray342[--anInt5986];
				aStringArray23[anInt5984++] = Static479.aClass312_1.method7842(local175).aString104;
				return;
			}
			@Pc(736) Class2_Sub6_Sub20 local736;
			if (arg0 == 5051) {
				local175 = anIntArray342[--anInt5986];
				local736 = Static479.aClass312_1.method7842(local175);
				if (local736.anIntArray660 == null) {
					anIntArray342[anInt5986++] = 0;
					return;
				}
				anIntArray342[anInt5986++] = local736.anIntArray660.length;
				return;
			}
			if (arg0 == 5052) {
				anInt5986 -= 2;
				local175 = anIntArray342[anInt5986];
				local776 = anIntArray342[anInt5986 + 1];
				@Pc(781) Class2_Sub6_Sub20 local781 = Static479.aClass312_1.method7842(local175);
				local103 = local781.anIntArray660[local776];
				anIntArray342[anInt5986++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray342[--anInt5986];
				local736 = Static479.aClass312_1.method7842(local175);
				if (local736.anIntArray659 == null) {
					anIntArray342[anInt5986++] = 0;
					return;
				}
				anIntArray342[anInt5986++] = local736.anIntArray659.length;
				return;
			}
			if (arg0 == 5054) {
				anInt5986 -= 2;
				local175 = anIntArray342[anInt5986];
				local776 = anIntArray342[anInt5986 + 1];
				anIntArray342[anInt5986++] = Static479.aClass312_1.method7842(local175).anIntArray659[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray342[--anInt5986];
				aStringArray23[anInt5984++] = Static296.aClass13_1.method226(local175).method8045();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray342[--anInt5986];
				@Pc(907) Class2_Sub6_Sub19 local907 = Static296.aClass13_1.method226(local175);
				if (local907.anIntArray633 == null) {
					anIntArray342[anInt5986++] = 0;
					return;
				}
				anIntArray342[anInt5986++] = local907.anIntArray633.length;
				return;
			}
			if (arg0 == 5057) {
				anInt5986 -= 2;
				local175 = anIntArray342[anInt5986];
				local776 = anIntArray342[anInt5986 + 1];
				anIntArray342[anInt5986++] = Static296.aClass13_1.method226(local175).anIntArray633[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass154_1 = new Class154();
				aClass154_1.anInt5253 = anIntArray342[--anInt5986];
				aClass154_1.aClass2_Sub6_Sub19_1 = Static296.aClass13_1.method226(aClass154_1.anInt5253);
				aClass154_1.anIntArray274 = new int[aClass154_1.aClass2_Sub6_Sub19_1.method8041()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static130.method3019(Static246.aClass94_51, Static361.aClass183_1);
				local52.aClass2_Sub11_Sub2_7.method8374(0);
				local776 = local52.aClass2_Sub11_Sub2_7.anInt10066;
				local52.aClass2_Sub11_Sub2_7.method8374(0);
				local52.aClass2_Sub11_Sub2_7.method8333(aClass154_1.anInt5253);
				aClass154_1.aClass2_Sub6_Sub19_1.method8036(aClass154_1.anIntArray274, local52.aClass2_Sub11_Sub2_7);
				local52.aClass2_Sub11_Sub2_7.method8335(local52.aClass2_Sub11_Sub2_7.anInt10066 - local776);
				Static96.method2563(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray23[--anInt5984];
				local269 = Static130.method3019(Static406.aClass94_80, Static361.aClass183_1);
				local269.aClass2_Sub11_Sub2_7.method8374(0);
				local97 = local269.aClass2_Sub11_Sub2_7.anInt10066;
				local269.aClass2_Sub11_Sub2_7.method8329(local83);
				local269.aClass2_Sub11_Sub2_7.method8333(aClass154_1.anInt5253);
				aClass154_1.aClass2_Sub6_Sub19_1.method8036(aClass154_1.anIntArray274, local269.aClass2_Sub11_Sub2_7);
				local269.aClass2_Sub11_Sub2_7.method8335(local269.aClass2_Sub11_Sub2_7.anInt10066 - local97);
				Static96.method2563(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static130.method3019(Static246.aClass94_51, Static361.aClass183_1);
				local52.aClass2_Sub11_Sub2_7.method8374(0);
				local776 = local52.aClass2_Sub11_Sub2_7.anInt10066;
				local52.aClass2_Sub11_Sub2_7.method8374(1);
				local52.aClass2_Sub11_Sub2_7.method8333(aClass154_1.anInt5253);
				aClass154_1.aClass2_Sub6_Sub19_1.method8036(aClass154_1.anIntArray274, local52.aClass2_Sub11_Sub2_7);
				local52.aClass2_Sub11_Sub2_7.method8335(local52.aClass2_Sub11_Sub2_7.anInt10066 - local776);
				Static96.method2563(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt5986 -= 2;
				local175 = anIntArray342[anInt5986];
				local776 = anIntArray342[anInt5986 + 1];
				anIntArray342[anInt5986++] = Static479.aClass312_1.method7842(local175).aCharArray7[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt5986 -= 2;
				local175 = anIntArray342[anInt5986];
				local776 = anIntArray342[anInt5986 + 1];
				anIntArray342[anInt5986++] = Static479.aClass312_1.method7842(local175).aCharArray6[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt5986 -= 2;
				local175 = anIntArray342[anInt5986];
				local776 = anIntArray342[anInt5986 + 1];
				if (local776 == -1) {
					anIntArray342[anInt5986++] = -1;
					return;
				}
				anIntArray342[anInt5986++] = Static479.aClass312_1.method7842(local175).method8507((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt5986 -= 2;
				local175 = anIntArray342[anInt5986];
				local776 = anIntArray342[anInt5986 + 1];
				if (local776 == -1) {
					anIntArray342[anInt5986++] = -1;
					return;
				}
				anIntArray342[anInt5986++] = Static479.aClass312_1.method7842(local175).method8503((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray342[--anInt5986];
				anIntArray342[anInt5986++] = Static296.aClass13_1.method226(local175).method8041();
				return;
			}
			if (arg0 == 5067) {
				anInt5986 -= 2;
				local175 = anIntArray342[anInt5986];
				local776 = anIntArray342[anInt5986 + 1];
				local97 = Static296.aClass13_1.method226(local175).method8038(local776).anInt7474;
				anIntArray342[anInt5986++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt5986 -= 2;
				local175 = anIntArray342[anInt5986];
				local776 = anIntArray342[anInt5986 + 1];
				aClass154_1.anIntArray274[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt5986 -= 2;
				local175 = anIntArray342[anInt5986];
				local776 = anIntArray342[anInt5986 + 1];
				aClass154_1.anIntArray274[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt5986 -= 3;
				local175 = anIntArray342[anInt5986];
				local776 = anIntArray342[anInt5986 + 1];
				local97 = anIntArray342[anInt5986 + 2];
				@Pc(1448) Class2_Sub6_Sub19 local1448 = Static296.aClass13_1.method226(local175);
				if (local1448.method8038(local776).anInt7474 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray342[anInt5986++] = local1448.method8039(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray23[--anInt5984];
				local1496 = anIntArray342[--anInt5986] == 1;
				Static279.method6676(local1496, local83);
				anIntArray342[anInt5986++] = Static305.anInt6352;
				return;
			}
			if (arg0 == 5072) {
				if (Static468.aShortArray116 != null && Static396.anInt7578 < Static305.anInt6352) {
					anIntArray342[anInt5986++] = Static468.aShortArray116[Static396.anInt7578++] & 0xFFFF;
					return;
				}
				anIntArray342[anInt5986++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static396.anInt7578 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static449.aClass90_1.method8781(86)) {
					anIntArray342[anInt5986++] = 1;
					return;
				}
				anIntArray342[anInt5986++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static449.aClass90_1.method8781(82)) {
					anIntArray342[anInt5986++] = 1;
					return;
				}
				anIntArray342[anInt5986++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static449.aClass90_1.method8781(81)) {
					anIntArray342[anInt5986++] = 1;
					return;
				}
				anIntArray342[anInt5986++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static224.method4291(anIntArray342[--anInt5986]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray342[anInt5986++] = Static318.method5532();
					return;
				}
				if (arg0 == 5205) {
					Static20.method584(false, -1, -1, anIntArray342[--anInt5986]);
					return;
				}
				@Pc(1696) Class2_Sub6_Sub4 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray342[--anInt5986];
					local1696 = Static303.method163(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray342[anInt5986++] = -1;
						return;
					}
					anIntArray342[anInt5986++] = local1696.anInt2711;
					return;
				}
				@Pc(1729) Class2_Sub6_Sub4 local1729;
				if (arg0 == 5207) {
					local1729 = Static303.method154(anIntArray342[--anInt5986]);
					if (local1729 != null && local1729.aString23 != null) {
						aStringArray23[anInt5984++] = local1729.aString23;
						return;
					}
					aStringArray23[anInt5984++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray342[anInt5986++] = Static221.anInt4940;
					anIntArray342[anInt5986++] = Static449.anInt8346;
					return;
				}
				if (arg0 == 5209) {
					anIntArray342[anInt5986++] = Static491.anInt9082 + Static303.anInt110;
					anIntArray342[anInt5986++] = Static536.anInt9677 + Static303.anInt108;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray342[--anInt5986];
					local1696 = Static303.method154(local175);
					if (local1696 == null) {
						anIntArray342[anInt5986++] = 0;
						anIntArray342[anInt5986++] = 0;
						return;
					}
					anIntArray342[anInt5986++] = local1696.anInt2720 >> 14 & 0x3FFF;
					anIntArray342[anInt5986++] = local1696.anInt2720 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray342[--anInt5986];
					local1696 = Static303.method154(local175);
					if (local1696 == null) {
						anIntArray342[anInt5986++] = 0;
						anIntArray342[anInt5986++] = 0;
						return;
					}
					anIntArray342[anInt5986++] = local1696.anInt2716 - local1696.anInt2723;
					anIntArray342[anInt5986++] = local1696.anInt2710 - local1696.anInt2722;
					return;
				}
				@Pc(1919) Class2_Sub32 local1919;
				if (arg0 == 5212) {
					local1919 = Static552.method8240();
					if (local1919 == null) {
						anIntArray342[anInt5986++] = -1;
						anIntArray342[anInt5986++] = -1;
						return;
					}
					anIntArray342[anInt5986++] = local1919.anInt6568;
					local776 = local1919.anInt6570 << 28 | local1919.anInt6572 + Static303.anInt110 << 14 | local1919.anInt6571 + Static303.anInt108;
					anIntArray342[anInt5986++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static134.method3055();
					if (local1919 == null) {
						anIntArray342[anInt5986++] = -1;
						anIntArray342[anInt5986++] = -1;
						return;
					}
					anIntArray342[anInt5986++] = local1919.anInt6568;
					local776 = local1919.anInt6570 << 28 | local1919.anInt6572 + Static303.anInt110 << 14 | local1919.anInt6571 + Static303.anInt108;
					anIntArray342[anInt5986++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray342[--anInt5986];
					local1696 = Static421.method6788();
					if (local1696 != null) {
						local2067 = local1696.method2556(anIntArray345, local175 >> 14 & 0x3FFF, local175 & 0x3FFF, local175 >> 28 & 0x3);
						if (local2067) {
							Static336.method5781(anIntArray345[1], anIntArray345[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt5986 -= 2;
					local175 = anIntArray342[anInt5986];
					local776 = anIntArray342[anInt5986 + 1];
					@Pc(2105) Class211 local2105 = Static303.method164(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class2_Sub6_Sub4 local2112 = (Class2_Sub6_Sub4) local2105.method6008(); local2112 != null; local2112 = (Class2_Sub6_Sub4) local2105.method6000()) {
						if (local2112.anInt2711 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray342[anInt5986++] = 1;
						return;
					}
					anIntArray342[anInt5986++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray342[--anInt5986];
					local1696 = Static303.method154(local175);
					if (local1696 == null) {
						anIntArray342[anInt5986++] = -1;
						return;
					}
					anIntArray342[anInt5986++] = local1696.anInt2713;
					return;
				}
				if (arg0 == 5220) {
					anIntArray342[anInt5986++] = Static124.anInt11089 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray342[--anInt5986];
					Static336.method5781(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static421.method6788();
					if (local1729 != null) {
						local1496 = local1729.method2559(Static536.anInt9677 + Static303.anInt108, Static491.anInt9082 + Static303.anInt110, anIntArray345);
						if (local1496) {
							anIntArray342[anInt5986++] = anIntArray345[1];
							anIntArray342[anInt5986++] = anIntArray345[2];
							return;
						}
						anIntArray342[anInt5986++] = -1;
						anIntArray342[anInt5986++] = -1;
						return;
					}
					anIntArray342[anInt5986++] = -1;
					anIntArray342[anInt5986++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt5986 -= 2;
					local175 = anIntArray342[anInt5986];
					local776 = anIntArray342[anInt5986 + 1];
					Static20.method584(false, local776 & 0x3FFF, local776 >> 14 & 0x3FFF, local175);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray342[--anInt5986];
					local1696 = Static421.method6788();
					if (local1696 != null) {
						local2067 = local1696.method2556(anIntArray345, local175 >> 14 & 0x3FFF, local175 & 0x3FFF, local175 >> 28 & 0x3);
						if (local2067) {
							anIntArray342[anInt5986++] = anIntArray345[1];
							anIntArray342[anInt5986++] = anIntArray345[2];
							return;
						}
						anIntArray342[anInt5986++] = -1;
						anIntArray342[anInt5986++] = -1;
						return;
					}
					anIntArray342[anInt5986++] = -1;
					anIntArray342[anInt5986++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray342[--anInt5986];
					local1696 = Static421.method6788();
					if (local1696 != null) {
						local2067 = local1696.method2559(local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray345);
						if (local2067) {
							anIntArray342[anInt5986++] = anIntArray345[1];
							anIntArray342[anInt5986++] = anIntArray345[2];
							return;
						}
						anIntArray342[anInt5986++] = -1;
						anIntArray342[anInt5986++] = -1;
						return;
					}
					anIntArray342[anInt5986++] = -1;
					anIntArray342[anInt5986++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static378.method2838(anIntArray342[--anInt5986]);
					return;
				}
				if (arg0 == 5227) {
					anInt5986 -= 2;
					local175 = anIntArray342[anInt5986];
					local776 = anIntArray342[anInt5986 + 1];
					Static20.method584(true, local776 & 0x3FFF, local776 >> 14 & 0x3FFF, local175);
					return;
				}
				if (arg0 == 5228) {
					Static40.aBoolean112 = anIntArray342[--anInt5986] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray342[anInt5986++] = Static40.aBoolean112 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray342[--anInt5986];
					Static224.method4293(local175);
					return;
				}
				@Pc(2625) Class2 local2625;
				if (arg0 == 5231) {
					anInt5986 -= 2;
					local175 = anIntArray342[anInt5986];
					local1496 = anIntArray342[anInt5986 + 1] == 1;
					if (Static83.aClass99_21 != null) {
						local2625 = Static83.aClass99_21.method3056((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method9253();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class2();
							Static83.aClass99_21.method3059((long) local175, local2625);
						}
					}
					return;
				}
				@Pc(2667) Class2 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray342[--anInt5986];
					if (Static83.aClass99_21 != null) {
						local2667 = Static83.aClass99_21.method3056((long) local175);
						anIntArray342[anInt5986++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray342[anInt5986++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt5986 -= 2;
					local175 = anIntArray342[anInt5986];
					local1496 = anIntArray342[anInt5986 + 1] == 1;
					if (Static409.aClass99_56 != null) {
						local2625 = Static409.aClass99_56.method3056((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method9253();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class2();
							Static409.aClass99_56.method3059((long) local175, local2625);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray342[--anInt5986];
					if (Static409.aClass99_56 != null) {
						local2667 = Static409.aClass99_56.method3056((long) local175);
						anIntArray342[anInt5986++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray342[anInt5986++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray342[anInt5986++] = Static303.aClass2_Sub6_Sub4_2 == null ? -1 : Static303.aClass2_Sub6_Sub4_2.anInt2711;
					return;
				}
				if (arg0 == 5236) {
					anInt5986 -= 2;
					local175 = anIntArray342[anInt5986];
					local776 = anIntArray342[anInt5986 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static345.method5922(local175, local97, local103);
					if (local2833 < 0) {
						anIntArray342[anInt5986++] = -1;
						return;
					}
					anIntArray342[anInt5986++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static21.method596();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt5986 -= 2;
					local175 = anIntArray342[anInt5986];
					local776 = anIntArray342[anInt5986 + 1];
					Static317.method5514(3, local175, false, local776);
					anIntArray342[anInt5986++] = Static232.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static232.aFrame1 != null) {
						Static317.method5514(Static74.aClass2_Sub13_5.aClass14_Sub16_1.method5919(), -1, false, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2919) Class25[] local2919 = Static139.method3118();
					anIntArray342[anInt5986++] = local2919.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray342[--anInt5986];
					@Pc(2943) Class25[] local2943 = Static139.method3118();
					anIntArray342[anInt5986++] = local2943[local175].anInt577;
					anIntArray342[anInt5986++] = local2943[local175].anInt581;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static122.anInt10527;
					local776 = Static345.anInt6919;
					local97 = -1;
					@Pc(2978) Class25[] local2978 = Static139.method3118();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class25 local2985 = local2978[local2833];
						if (local2985.anInt577 == local175 && local2985.anInt581 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray342[anInt5986++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray342[anInt5986++] = Static89.method2478();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray342[--anInt5986];
					if (local175 >= 1 && local175 <= 2) {
						Static317.method5514(local175, -1, false, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub16_1.method5919();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray342[--anInt5986];
					if (local175 >= 1 && local175 <= 2) {
						Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub16_1, local175);
						Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub16_2, local175);
						Static318.method5531();
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt5984 -= 2;
					local83 = aStringArray23[anInt5984];
					local89 = aStringArray23[anInt5984 + 1];
					local97 = anIntArray342[--anInt5986];
					@Pc(3133) Class2_Sub52 local3133 = Static130.method3019(Static430.aClass94_21, Static361.aClass183_1);
					local3133.aClass2_Sub11_Sub2_7.method8374(Static296.method5291(local83) + Static296.method5291(local89) + 1);
					local3133.aClass2_Sub11_Sub2_7.method8329(local83);
					local3133.aClass2_Sub11_Sub2_7.method8329(local89);
					local3133.aClass2_Sub11_Sub2_7.method8374(local97);
					Static96.method2563(local3133);
					return;
				}
				if (arg0 == 5401) {
					anInt5986 -= 2;
					Static464.aShortArray115[anIntArray342[anInt5986]] = (short) Static1.method6137(anIntArray342[anInt5986 + 1]);
					Static635.aClass336_2.method8414();
					Static635.aClass336_2.method8420();
					Static462.aClass355_2.method8739();
					Static132.method3031();
					return;
				}
				if (arg0 == 5405) {
					anInt5986 -= 2;
					local175 = anIntArray342[anInt5986];
					local776 = anIntArray342[anInt5986 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static614.anIntArrayArrayArray20[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt5986 -= 7;
					local175 = anIntArray342[anInt5986];
					local776 = anIntArray342[anInt5986 + 1] << 1;
					local97 = anIntArray342[anInt5986 + 2];
					local103 = anIntArray342[anInt5986 + 3];
					local2833 = anIntArray342[anInt5986 + 4];
					@Pc(3271) int local3271 = anIntArray342[anInt5986 + 5];
					@Pc(3277) int local3277 = anIntArray342[anInt5986 + 6];
					if (local175 >= 0 && local175 < 2 && Static614.anIntArrayArrayArray20[local175] != null && local776 >= 0 && local776 < Static614.anIntArrayArrayArray20[local175].length) {
						Static614.anIntArrayArrayArray20[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3277 };
						Static614.anIntArrayArrayArray20[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3271 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static614.anIntArrayArrayArray20[anIntArray342[--anInt5986]].length >> 1;
					anIntArray342[anInt5986++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static232.aFrame1 != null) {
						Static317.method5514(Static74.aClass2_Sub13_5.aClass14_Sub16_1.method5919(), -1, false, -1);
					}
					if (Static255.aFrame2 != null) {
						Static154.method6048();
						System.exit(0);
						return;
					}
					local83 = Static362.aString77 == null ? Static544.method8156() : Static362.aString77;
					Static51.method1762(local83, Static268.aClass370_3, Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() == 1, false);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static374.aClass240_10 != null) {
						if (Static374.aClass240_10.anObject13 == null) {
							local83 = Static56.method1810(Static374.aClass240_10.anInt7568);
						} else {
							local83 = (String) Static374.aClass240_10.anObject13;
						}
					}
					aStringArray23[anInt5984++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray342[anInt5986++] = Static268.aClass370_3.aBoolean739 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static232.aFrame1 != null) {
						Static317.method5514(Static74.aClass2_Sub13_5.aClass14_Sub16_1.method5919(), -1, false, -1);
					}
					local83 = aStringArray23[--anInt5984];
					local1496 = anIntArray342[--anInt5986] == 1;
					local181 = Static544.method8156() + local83;
					Static51.method1762(local181, Static268.aClass370_3, Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() == 1, local1496);
					return;
				}
				if (arg0 == 5422) {
					anInt5984 -= 2;
					local83 = aStringArray23[anInt5984];
					local89 = aStringArray23[anInt5984 + 1];
					local97 = anIntArray342[--anInt5986];
					if (local83.length() > 0) {
						if (Static302.aStringArray26 == null) {
							Static302.aStringArray26 = new String[Static584.anIntArray282[Static423.aClass316_4.anInt9447]];
						}
						Static302.aStringArray26[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static258.aStringArray21 == null) {
							Static258.aStringArray21 = new String[Static584.anIntArray282[Static423.aClass316_4.anInt9447]];
						}
						Static258.aStringArray21[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray23[--anInt5984]);
					return;
				}
				if (arg0 == 5424) {
					anInt5986 -= 11;
					Static573.anInt10254 = anIntArray342[anInt5986];
					Static251.anInt5400 = anIntArray342[anInt5986 + 1];
					Static573.anInt10252 = anIntArray342[anInt5986 + 2];
					Static329.anInt6645 = anIntArray342[anInt5986 + 3];
					Static519.anInt9455 = anIntArray342[anInt5986 + 4];
					Static420.anInt7951 = anIntArray342[anInt5986 + 5];
					Static286.anInt6056 = anIntArray342[anInt5986 + 6];
					Static70.anInt2220 = anIntArray342[anInt5986 + 7];
					Static30.anInt659 = anIntArray342[anInt5986 + 8];
					Static569.anInt10209 = anIntArray342[anInt5986 + 9];
					Static327.anInt6611 = anIntArray342[anInt5986 + 10];
					Static214.aClass157_106.method4575(Static519.anInt9455);
					Static214.aClass157_106.method4575(Static420.anInt7951);
					Static214.aClass157_106.method4575(Static286.anInt6056);
					Static214.aClass157_106.method4575(Static70.anInt2220);
					Static214.aClass157_106.method4575(Static30.anInt659);
					Static435.aClass46_25 = null;
					Static356.aClass46_21 = null;
					Static137.aClass46_14 = null;
					Static143.aClass46_26 = null;
					Static369.aClass46_24 = null;
					Static546.aClass46_27 = null;
					Static67.aClass46_9 = null;
					Static137.aClass46_13 = null;
					Static292.aBoolean464 = true;
					return;
				}
				if (arg0 == 5425) {
					Static588.method8689();
					Static292.aBoolean464 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt5986 -= 2;
					Static338.anInt6830 = anIntArray342[anInt5986];
					Static237.anInt5154 = anIntArray342[anInt5986 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt5986 -= 2;
					Static585.anInt10366 = anIntArray342[anInt5986 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt5986 -= 2;
					local175 = anIntArray342[anInt5986];
					local776 = anIntArray342[anInt5986 + 1];
					anIntArray342[anInt5986++] = Static253.method8220(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static313.method5481(aStringArray23[--anInt5984], false, false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static646.method1788(Static334.anApplet2, "accountcreated");
						return;
					} catch (@Pc(3819) Throwable local3819) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static646.method1788(Static334.anApplet2, "accountcreatestarted");
						return;
					} catch (@Pc(3830) Throwable local3830) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static574.aClipboard1 != null) {
						@Pc(3842) Transferable local3842 = Static574.aClipboard1.getContents(null);
						if (local3842 != null) {
							try {
								local83 = (String) local3842.getTransferData(DataFlavor.stringFlavor);
								if (local83 == null) {
									local83 = "";
								}
							} catch (@Pc(3855) Exception local3855) {
							}
						}
					}
					aStringArray23[anInt5984++] = local83;
					return;
				}
				if (arg0 == 5433) {
					Static103.anInt2857 = anIntArray342[--anInt5986];
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt5986 -= 4;
					local175 = anIntArray342[anInt5986];
					local776 = anIntArray342[anInt5986 + 1];
					local97 = anIntArray342[anInt5986 + 2];
					local103 = anIntArray342[anInt5986 + 3];
					Static164.method3543(local97, (local175 >> 14 & 0x3FFF) - Static84.anInt2565, false, local776 << 2, local103, (local175 & 0x3FFF) - Static32.anInt723);
					return;
				}
				if (arg0 == 5501) {
					anInt5986 -= 4;
					local175 = anIntArray342[anInt5986];
					local776 = anIntArray342[anInt5986 + 1];
					local97 = anIntArray342[anInt5986 + 2];
					local103 = anIntArray342[anInt5986 + 3];
					Static89.method2480((local175 & 0x3FFF) - Static32.anInt723, (local175 >> 14 & 0x3FFF) - Static84.anInt2565, local776 << 2, local103, local97);
					return;
				}
				if (arg0 == 5502) {
					anInt5986 -= 6;
					local175 = anIntArray342[anInt5986];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static13.anInt196 = local175;
					local776 = anIntArray342[anInt5986 + 1];
					if (local776 + 1 >= Static614.anIntArrayArrayArray20[Static13.anInt196].length >> 1) {
						throw new RuntimeException();
					}
					Static497.anInt9200 = local776;
					Static365.anInt7300 = 0;
					Static471.anInt8843 = anIntArray342[anInt5986 + 2];
					Static102.anInt2849 = anIntArray342[anInt5986 + 3];
					local97 = anIntArray342[anInt5986 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static616.anInt10782 = local97;
					local103 = anIntArray342[anInt5986 + 5];
					if (local103 + 1 >= Static614.anIntArrayArrayArray20[Static616.anInt10782].length >> 1) {
						throw new RuntimeException();
					}
					Static573.anInt10251 = local103;
					Static496.anInt9165 = 3;
					Static442.anInt8212 = -1;
					Static194.anInt4508 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static376.method6271();
					return;
				}
				if (arg0 == 5504) {
					anInt5986 -= 2;
					Static3.method8620(anIntArray342[anInt5986], anIntArray342[anInt5986 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray342[anInt5986++] = (int) Static305.aFloat154 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray342[anInt5986++] = (int) Static72.aFloat68 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static228.method4361();
					return;
				}
				if (arg0 == 5508) {
					Static12.method225();
					return;
				}
				if (arg0 == 5509) {
					Static130.method3024();
					return;
				}
				if (arg0 == 5510) {
					Static207.method4092();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray342[--anInt5986];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static84.anInt2565;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static47.anInt1794) {
						local776 = Static47.anInt1794;
					}
					local97 -= Static32.anInt723;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static209.anInt4742) {
						local97 = Static209.anInt4742;
					}
					Static173.anInt4166 = (local776 << 9) + 256;
					Static176.anInt4216 = (local97 << 9) + 256;
					Static496.anInt9165 = 4;
					Static442.anInt8212 = -1;
					Static194.anInt4508 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static167.method3600();
					return;
				}
				if (arg0 == 5514) {
					Static380.anInt7422 = anIntArray342[--anInt5986];
					return;
				}
				if (arg0 == 5516) {
					anIntArray342[anInt5986++] = Static380.anInt7422;
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray342[--anInt5986];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static84.anInt2565;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static47.anInt1794) {
							local776 = Static47.anInt1794;
						}
						local97 -= Static32.anInt723;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static209.anInt4742) {
							local97 = Static209.anInt4742;
						}
						Static194.anInt4508 = (local776 << 9) + 256;
						Static442.anInt8212 = (local97 << 9) + 256;
						return;
					}
					Static194.anInt4508 = -1;
					Static442.anInt8212 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt5984 -= 2;
					local83 = aStringArray23[anInt5984];
					local89 = aStringArray23[anInt5984 + 1];
					local97 = anIntArray342[--anInt5986];
					if (local83.length() > 320) {
						return;
					}
					if (Static529.anInt9623 != 3) {
						return;
					}
					if (Static513.anInt9420 == 0 && Static411.anInt7764 == 0) {
						Static415.aString88 = local83;
						Static456.aString69 = local89;
						Static291.anInt6172 = local97;
						Static66.method8375(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static32.method772();
					return;
				}
				if (arg0 == 5602) {
					if (Static513.anInt9420 == 0) {
						Static353.anInt7027 = -2;
						Static173.anInt4167 = -2;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt5984--;
					if (Static529.anInt9623 != 3) {
						return;
					}
					if (Static513.anInt9420 == 0 && Static411.anInt7764 == 0) {
						Static596.method8754(aStringArray23[anInt5984]);
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt5984 -= 2;
					anInt5986 -= 2;
					if (Static529.anInt9623 != 3) {
						return;
					}
					if (Static513.anInt9420 == 0 && Static411.anInt7764 == 0) {
						Static248.method4588(aStringArray23[anInt5984 + 1], aStringArray23[anInt5984], anIntArray342[anInt5986], anIntArray342[anInt5986 + 1] == 1);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static411.anInt7764 == 0) {
						Static129.anInt3275 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray342[anInt5986++] = Static173.anInt4167;
					return;
				}
				if (arg0 == 5608) {
					anIntArray342[anInt5986++] = Static278.anInt5908;
					return;
				}
				if (arg0 == 5609) {
					anIntArray342[anInt5986++] = Static129.anInt3275;
					return;
				}
				if (arg0 == 5611) {
					anIntArray342[anInt5986++] = Static441.anInt8171;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray342[--anInt5986];
					if (Static529.anInt9623 != 7) {
						return;
					}
					if (Static513.anInt9420 == 0 && Static411.anInt7764 == 0) {
						if (Static272.aClass116_1 != null) {
							Static272.aClass116_1.method3740();
							Static272.aClass116_1 = null;
						}
						Static291.anInt6172 = local175;
						Static66.method8375(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray342[anInt5986++] = Static173.anInt4167;
					return;
				}
				if (arg0 == 5615) {
					anInt5984 -= 2;
					local83 = aStringArray23[anInt5984];
					local89 = aStringArray23[anInt5984 + 1];
					if (local83.length() > 320) {
						return;
					}
					if (Static529.anInt9623 != 3) {
						return;
					}
					if (Static513.anInt9420 == 0 && Static411.anInt7764 == 0) {
						if (Static272.aClass116_1 != null) {
							Static272.aClass116_1.method3740();
							Static272.aClass116_1 = null;
						}
						Static415.aString88 = local83;
						Static456.aString69 = local89;
						Static66.method8375(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static68.method2104(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray342[anInt5986++] = Static353.anInt7027;
					return;
				}
				if (arg0 == 5618) {
					anInt5986--;
					return;
				}
				if (arg0 == 5619) {
					anInt5986--;
					return;
				}
				if (arg0 == 5620) {
					anIntArray342[anInt5986++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt5984 -= 2;
					anInt5986 -= 2;
					return;
				}
				if (arg0 == 5622) {
					return;
				}
				if (arg0 == 5623) {
					if (Static431.aString91 != null) {
						anIntArray342[anInt5986++] = 1;
						return;
					}
					anIntArray342[anInt5986++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray342[anInt5986++] = (int) (Static535.aLong241 >> 32);
					anIntArray342[anInt5986++] = (int) (Static535.aLong241 & 0xFFFFL);
					return;
				}
				if (arg0 == 5625) {
					anIntArray342[anInt5986++] = Static97.aBoolean224 ? 1 : 0;
					return;
				}
				if (arg0 == 5626) {
					Static97.aBoolean224 = true;
					Static585.method8658();
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray342[--anInt5986];
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub18_1, local175);
					Static269.method4952();
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				@Pc(4786) boolean local4786;
				if (arg0 == 6002) {
					local4786 = anIntArray342[--anInt5986] == 1;
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub7_1, local4786 ? 1 : 0);
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub7_2, local4786 ? 1 : 0);
					Static269.method4952();
					Static297.method5315();
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6003) {
					local4786 = anIntArray342[--anInt5986] == 1;
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub21_1, local4786 ? 2 : 1);
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.lb, local4786 ? 2 : 1);
					Static297.method5315();
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6005) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub12_1, anIntArray342[--anInt5986] == 1 ? 1 : 0);
					Static269.method4952();
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6007) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub20_1, anIntArray342[--anInt5986]);
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6008) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub1_1, anIntArray342[--anInt5986] == 1 ? 1 : 0);
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6010) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub28_1, anIntArray342[--anInt5986] == 1 ? 1 : 0);
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6011) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub15_1, anIntArray342[--anInt5986]);
					Static269.method4952();
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6012) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub8_1, anIntArray342[--anInt5986] == 1 ? 1 : 0);
					Static538.method9146();
					Static305.method5400();
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6014) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub25_1, anIntArray342[--anInt5986] == 1 ? 2 : 0);
					Static269.method4952();
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6015) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub23_1, anIntArray342[--anInt5986] == 1 ? 1 : 0);
					Static269.method4952();
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6016) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub27_2, anIntArray342[--anInt5986]);
					Static316.method5509(false, Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945());
					Static318.method5531();
					return;
				}
				if (arg0 == 6017) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub13_1, anIntArray342[--anInt5986] == 1 ? 1 : 0);
					Static23.method608();
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6018) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub6_5, anIntArray342[--anInt5986]);
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray342[--anInt5986];
					local776 = Static74.aClass2_Sub13_5.aClass14_Sub6_4.method3223();
					if (local175 != local776) {
						if (Static104.method2676(Static529.anInt9623)) {
							if (local776 == 0 && Static580.anInt10350 != -1) {
								Static196.method3971(Static580.anInt10350, Static100.aClass157_64, local175);
								Static75.method2188();
								Static301.aBoolean468 = false;
							} else if (local175 == 0) {
								Static348.method5947();
								Static301.aBoolean468 = false;
							} else {
								Static232.method4412(local175);
							}
						}
						Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub6_4, local175);
						Static318.method5531();
						Static475.aBoolean694 = false;
					}
					return;
				}
				if (arg0 == 6020) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub6_2, anIntArray342[--anInt5986]);
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6021) {
					local175 = Static74.aClass2_Sub13_5.aClass14_Sub21_1.method6912();
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.lb, anIntArray342[--anInt5986] == 1 ? 0 : local175);
					Static297.method5315();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray342[--anInt5986];
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub22_1, local175);
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6024) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub27_1, anIntArray342[--anInt5986]);
					Static318.method5531();
					return;
				}
				if (arg0 == 6025) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub14_1, anIntArray342[--anInt5986]);
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray342[--anInt5986];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static631.method9158(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub29_1, anIntArray342[--anInt5986] == 0 ? 0 : 1);
					Static318.method5531();
					return;
				}
				if (arg0 == 6029) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub20_1, anIntArray342[--anInt5986]);
					Static318.method5531();
					return;
				}
				if (arg0 == 6030) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub17_1, anIntArray342[--anInt5986] == 0 ? 0 : 1);
					Static318.method5531();
					Static269.method4952();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray342[--anInt5986];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static316.method5509(false, local175);
					return;
				}
				if (arg0 == 6032) {
					anInt5986 -= 2;
					local175 = anIntArray342[anInt5986];
					local1496 = anIntArray342[anInt5986 + 1] == 1;
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub5_1, local175);
					if (!local1496) {
						Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub9_1, 0);
					}
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6033) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub24_1, anIntArray342[--anInt5986]);
					Static318.method5531();
					return;
				}
				if (arg0 == 6034) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub4_1, anIntArray342[--anInt5986] == 1 ? 1 : 0);
					Static318.method5531();
					Static538.method9146();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6035) {
					local175 = Static74.aClass2_Sub13_5.aClass14_Sub7_1.method3523();
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub7_2, anIntArray342[--anInt5986] == 1 ? 1 : local175);
					Static269.method4952();
					Static297.method5315();
					return;
				}
				if (arg0 == 6036) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub3_1, anIntArray342[--anInt5986]);
					Static318.method5531();
					Static291.aBoolean463 = true;
					return;
				}
				if (arg0 == 6037) {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub6_1, anIntArray342[--anInt5986]);
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray342[--anInt5986];
					local776 = Static74.aClass2_Sub13_5.aClass14_Sub6_3.method3223();
					if (local175 != local776 && Static580.anInt10350 == Static121.anInt9613) {
						if (!Static104.method2676(Static529.anInt9623)) {
							if (local776 == 0) {
								Static196.method3971(Static580.anInt10350, Static100.aClass157_64, local175);
								Static75.method2188();
								Static301.aBoolean468 = false;
							} else if (local175 == 0) {
								Static348.method5947();
								Static301.aBoolean468 = false;
							} else {
								Static232.method4412(local175);
							}
						}
						Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub6_3, local175);
						Static318.method5531();
						Static475.aBoolean694 = false;
					}
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray342[--anInt5986];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static74.aClass2_Sub13_5.aClass14_Sub26_1.method8283()) {
						Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub26_1, local175);
						Static318.method5531();
						Static475.aBoolean694 = false;
					}
					return;
				}
				if (arg0 == 6040) {
					local175 = anIntArray342[--anInt5986];
					if (local175 != Static74.aClass2_Sub13_5.aClass14_Sub11_1.method4676()) {
						Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub11_1, local175);
						Static318.method5531();
						Static475.aBoolean694 = false;
						Static328.method5643();
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub18_1.method6463();
					return;
				}
				if (arg0 == 6102) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub7_1.method3523() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub21_1.method6912() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub12_1.method5129() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub20_1.method6845();
					return;
				}
				if (arg0 == 6108) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub1_1.method316() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub28_1.method8965() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub15_1.method5864();
					return;
				}
				if (arg0 == 6112) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub8_1.method3544() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub25_1.method8177() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub23_1.method7808() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub27_2.method8731();
					return;
				}
				if (arg0 == 6117) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub13_1.method5249() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub6_5.method3223();
					return;
				}
				if (arg0 == 6119) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub6_4.method3223();
					return;
				}
				if (arg0 == 6120) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub6_2.method3223();
					return;
				}
				if (arg0 == 6123) {
					anIntArray342[anInt5986++] = Static327.method5625();
					return;
				}
				if (arg0 == 6124) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub27_1.method8731();
					return;
				}
				if (arg0 == 6125) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub14_1.method5289();
					return;
				}
				if (arg0 == 6127) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub2_1.method655() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub29_1.method9038() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub20_1.method6845();
					return;
				}
				if (arg0 == 6130) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub17_1.method5998() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945();
					return;
				}
				if (arg0 == 6132) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub5_1.method2945();
					return;
				}
				if (arg0 == 6133) {
					anIntArray342[anInt5986++] = Static268.aClass370_3.aBoolean739 && !Static268.aClass370_3.aBoolean740 ? 1 : 0;
					return;
				}
				if (arg0 == 6135) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub24_1.method8147();
					return;
				}
				if (arg0 == 6136) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub4_1.method2491() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray342[anInt5986++] = Static436.method6915(Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945(), 200);
					return;
				}
				if (arg0 == 6139) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub3_1.method1703();
					return;
				}
				if (arg0 == 6142) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub6_1.method3223();
					return;
				}
				if (arg0 == 6143) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub6_3.method3223();
					return;
				}
				if (arg0 == 6144) {
					anIntArray342[anInt5986++] = Static361.aBoolean524 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub26_1.method8283();
					return;
				}
				if (arg0 == 6146) {
					anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub11_1.method4676();
					return;
				}
				if (arg0 == 6147) {
					anIntArray342[anInt5986++] = Static494.aClass2_Sub16_1.anInt3436 < 512 || Static361.aBoolean524 || Static389.aBoolean544 ? 1 : 0;
					return;
				}
				if (arg0 == 6148) {
					anIntArray342[anInt5986++] = Static638.aBoolean751 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt5986 -= 2;
					Static356.aShort73 = (short) anIntArray342[anInt5986];
					if (Static356.aShort73 <= 0) {
						Static356.aShort73 = 256;
					}
					Static50.aShort4 = (short) anIntArray342[anInt5986 + 1];
					if (Static50.aShort4 <= 0) {
						Static50.aShort4 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt5986 -= 2;
					Static431.aShort99 = (short) anIntArray342[anInt5986];
					if (Static431.aShort99 <= 0) {
						Static431.aShort99 = 256;
					}
					Static80.aShort10 = (short) anIntArray342[anInt5986 + 1];
					if (Static80.aShort10 <= 0) {
						Static80.aShort10 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt5986 -= 4;
					Static461.aShort98 = (short) anIntArray342[anInt5986];
					if (Static461.aShort98 <= 0) {
						Static461.aShort98 = 1;
					}
					Static248.aShort53 = (short) anIntArray342[anInt5986 + 1];
					if (Static248.aShort53 <= 0) {
						Static248.aShort53 = 32767;
					} else if (Static248.aShort53 < Static461.aShort98) {
						Static248.aShort53 = Static461.aShort98;
					}
					Static299.aShort67 = (short) anIntArray342[anInt5986 + 2];
					if (Static299.aShort67 <= 0) {
						Static299.aShort67 = 1;
					}
					Static432.aShort100 = (short) anIntArray342[anInt5986 + 3];
					if (Static432.aShort100 <= 0) {
						Static432.aShort100 = 32767;
						return;
					}
					if (Static432.aShort100 < Static299.aShort67) {
						Static432.aShort100 = Static299.aShort67;
					}
					return;
				}
				if (arg0 == 6203) {
					Static328.method5638(0, 0, Static2.aClass24_8.anInt441, false, Static2.aClass24_8.anInt488);
					anIntArray342[anInt5986++] = Static375.anInt3312;
					anIntArray342[anInt5986++] = Static595.anInt10488;
					return;
				}
				if (arg0 == 6204) {
					anIntArray342[anInt5986++] = Static431.aShort99;
					anIntArray342[anInt5986++] = Static80.aShort10;
					return;
				}
				if (arg0 == 6205) {
					anIntArray342[anInt5986++] = Static356.aShort73;
					anIntArray342[anInt5986++] = Static50.aShort4;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray342[anInt5986++] = (int) (Static277.method5091() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray342[anInt5986++] = (int) (Static277.method5091() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt5986 -= 3;
					local175 = anIntArray342[anInt5986];
					local776 = anIntArray342[anInt5986 + 1];
					local97 = anIntArray342[anInt5986 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local97, local776, local175);
					local103 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray342[anInt5986++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static277.method5091()));
					anIntArray342[anInt5986++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray342[--anInt5986];
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
					anIntArray342[anInt5986++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray342[anInt5986++] = Static285.method5168() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray342[anInt5986++] = Static539.method8074() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static529.anInt9623 == 7 && Static513.anInt9420 == 0 && Static411.anInt7764 == 0) {
						if (Static378.aBoolean237) {
							anIntArray342[anInt5986++] = 0;
							return;
						}
						if (Static529.aLong237 > Static277.method5091() - 1000L) {
							anIntArray342[anInt5986++] = 1;
							return;
						}
						Static378.aBoolean237 = true;
						local52 = Static130.method3019(Static361.aClass94_71, Static361.aClass183_1);
						local52.aClass2_Sub11_Sub2_7.method8387(Static65.anInt11081);
						Static96.method2563(local52);
						anIntArray342[anInt5986++] = 0;
						return;
					}
					anIntArray342[anInt5986++] = 1;
					return;
				}
				@Pc(6862) Class359 local6862;
				@Pc(6829) Class206_Sub1 local6829;
				if (arg0 == 6501) {
					local6829 = Static578.method7002();
					if (local6829 != null) {
						anIntArray342[anInt5986++] = local6829.anInt6906;
						anIntArray342[anInt5986++] = local6829.anInt6902;
						aStringArray23[anInt5984++] = local6829.aString74;
						local6862 = local6829.method5902();
						anIntArray342[anInt5986++] = local6862.anInt10557;
						aStringArray23[anInt5984++] = local6862.aString105;
						anIntArray342[anInt5986++] = local6829.anInt6899;
						anIntArray342[anInt5986++] = local6829.anInt6907;
						aStringArray23[anInt5984++] = local6829.aString75;
						return;
					}
					anIntArray342[anInt5986++] = -1;
					anIntArray342[anInt5986++] = 0;
					aStringArray23[anInt5984++] = "";
					anIntArray342[anInt5986++] = 0;
					aStringArray23[anInt5984++] = "";
					anIntArray342[anInt5986++] = 0;
					anIntArray342[anInt5986++] = 0;
					aStringArray23[anInt5984++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6829 = Static16.method334();
					if (local6829 != null) {
						anIntArray342[anInt5986++] = local6829.anInt6906;
						anIntArray342[anInt5986++] = local6829.anInt6902;
						aStringArray23[anInt5984++] = local6829.aString74;
						local6862 = local6829.method5902();
						anIntArray342[anInt5986++] = local6862.anInt10557;
						aStringArray23[anInt5984++] = local6862.aString105;
						anIntArray342[anInt5986++] = local6829.anInt6899;
						anIntArray342[anInt5986++] = local6829.anInt6907;
						aStringArray23[anInt5984++] = local6829.aString75;
						return;
					}
					anIntArray342[anInt5986++] = -1;
					anIntArray342[anInt5986++] = 0;
					aStringArray23[anInt5984++] = "";
					anIntArray342[anInt5986++] = 0;
					aStringArray23[anInt5984++] = "";
					anIntArray342[anInt5986++] = 0;
					anIntArray342[anInt5986++] = 0;
					aStringArray23[anInt5984++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray342[--anInt5986];
					local89 = aStringArray23[--anInt5984];
					if (Static529.anInt9623 == 7 && Static513.anInt9420 == 0 && Static411.anInt7764 == 0) {
						anIntArray342[anInt5986++] = Static268.method4935(local89, local175) ? 1 : 0;
						return;
					}
					anIntArray342[anInt5986++] = 0;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray342[--anInt5986];
					@Pc(7189) Class206_Sub1 local7189 = Static290.method5252(local175);
					if (local7189 != null) {
						anIntArray342[anInt5986++] = local7189.anInt6902;
						aStringArray23[anInt5984++] = local7189.aString74;
						@Pc(7213) Class359 local7213 = local7189.method5902();
						anIntArray342[anInt5986++] = local7213.anInt10557;
						aStringArray23[anInt5984++] = local7213.aString105;
						anIntArray342[anInt5986++] = local7189.anInt6899;
						anIntArray342[anInt5986++] = local7189.anInt6907;
						aStringArray23[anInt5984++] = local7189.aString75;
						return;
					}
					anIntArray342[anInt5986++] = -1;
					aStringArray23[anInt5984++] = "";
					anIntArray342[anInt5986++] = 0;
					aStringArray23[anInt5984++] = "";
					anIntArray342[anInt5986++] = 0;
					anIntArray342[anInt5986++] = 0;
					aStringArray23[anInt5984++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt5986 -= 4;
					local175 = anIntArray342[anInt5986];
					local1496 = anIntArray342[anInt5986 + 1] == 1;
					local97 = anIntArray342[anInt5986 + 2];
					local2107 = anIntArray342[anInt5986 + 3] == 1;
					Static636.method9200(local2107, local97, local175, local1496);
					return;
				}
				if (arg0 == 6508) {
					Static270.method4968();
					return;
				}
				if (arg0 == 6509) {
					if (Static529.anInt9623 != 7) {
						return;
					}
					Static604.aBoolean726 = anIntArray342[--anInt5986] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray342[anInt5986++] = Static553.anInt9912;
					return;
				}
			} else if (arg0 >= 6700) {
				if (arg0 < 6800 && Static201.aClass317_2 == Static611.aClass317_5) {
					if (arg0 == 6700) {
						local175 = Static372.aClass99_51.method3050();
						if (Static475.anInt10143 != -1) {
							local175++;
						}
						anIntArray342[anInt5986++] = local175;
						return;
					}
					if (arg0 == 6701) {
						local175 = anIntArray342[--anInt5986];
						if (Static475.anInt10143 != -1) {
							if (local175 == 0) {
								anIntArray342[anInt5986++] = Static475.anInt10143;
								return;
							}
							local175--;
						}
						@Pc(7461) Class2_Sub48 local7461 = (Class2_Sub48) Static372.aClass99_51.method3060();
						while (local175-- > 0) {
							local7461 = (Class2_Sub48) Static372.aClass99_51.method3058();
						}
						anIntArray342[anInt5986++] = local7461.anInt10125;
						return;
					}
					if (arg0 == 6702) {
						local175 = anIntArray342[--anInt5986];
						if (Static631.aClass24ArrayArray2[local175] == null) {
							aStringArray23[anInt5984++] = "";
							return;
						}
						local89 = Static631.aClass24ArrayArray2[local175][0].aString2;
						if (local89 == null) {
							aStringArray23[anInt5984++] = "";
							return;
						}
						aStringArray23[anInt5984++] = local89.substring(0, local89.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local175 = anIntArray342[--anInt5986];
						if (Static631.aClass24ArrayArray2[local175] == null) {
							anIntArray342[anInt5986++] = 0;
							return;
						}
						anIntArray342[anInt5986++] = Static631.aClass24ArrayArray2[local175].length;
						return;
					}
					if (arg0 == 6704) {
						anInt5986 -= 2;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						if (Static631.aClass24ArrayArray2[local175] == null) {
							aStringArray23[anInt5984++] = "";
							return;
						}
						local181 = Static631.aClass24ArrayArray2[local175][local776].aString2;
						if (local181 == null) {
							aStringArray23[anInt5984++] = "";
							return;
						}
						aStringArray23[anInt5984++] = local181;
						return;
					}
					if (arg0 == 6705) {
						anInt5986 -= 2;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						if (Static631.aClass24ArrayArray2[local175] == null) {
							anIntArray342[anInt5986++] = 0;
							return;
						}
						anIntArray342[anInt5986++] = Static631.aClass24ArrayArray2[local175][local776].anInt457;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt5986 -= 3;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						local97 = anIntArray342[anInt5986 + 2];
						Static206.method4084(local97, "", 1, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6708) {
						anInt5986 -= 3;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						local97 = anIntArray342[anInt5986 + 2];
						Static206.method4084(local97, "", 2, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6709) {
						anInt5986 -= 3;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						local97 = anIntArray342[anInt5986 + 2];
						Static206.method4084(local97, "", 3, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6710) {
						anInt5986 -= 3;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						local97 = anIntArray342[anInt5986 + 2];
						Static206.method4084(local97, "", 4, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6711) {
						anInt5986 -= 3;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						local97 = anIntArray342[anInt5986 + 2];
						Static206.method4084(local97, "", 5, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6712) {
						anInt5986 -= 3;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						local97 = anIntArray342[anInt5986 + 2];
						Static206.method4084(local97, "", 6, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6713) {
						anInt5986 -= 3;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						local97 = anIntArray342[anInt5986 + 2];
						Static206.method4084(local97, "", 7, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6714) {
						anInt5986 -= 3;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						local97 = anIntArray342[anInt5986 + 2];
						Static206.method4084(local97, "", 8, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6715) {
						anInt5986 -= 3;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						local97 = anIntArray342[anInt5986 + 2];
						Static206.method4084(local97, "", 9, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6716) {
						anInt5986 -= 3;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						local97 = anIntArray342[anInt5986 + 2];
						Static206.method4084(local97, "", 10, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6717) {
						anInt5986 -= 3;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						local97 = anIntArray342[anInt5986 + 2];
						@Pc(8049) Class24 local8049 = Static330.method5694(local97, local175 << 16 | local776);
						Static117.method2902();
						@Pc(8054) Class2_Sub50 local8054 = Static76.method2235(local8049);
						Static114.method2845(local8054.anInt10795, local8054.method9008(), local8049);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(8082) Class153 local8082;
					if (arg0 == 6800) {
						local175 = anIntArray342[--anInt5986];
						local8082 = Static361.aClass248_4.method6584(local175);
						if (local8082.aString51 == null) {
							aStringArray23[anInt5984++] = "";
							return;
						}
						aStringArray23[anInt5984++] = local8082.aString51;
						return;
					}
					if (arg0 == 6801) {
						local175 = anIntArray342[--anInt5986];
						local8082 = Static361.aClass248_4.method6584(local175);
						anIntArray342[anInt5986++] = local8082.anInt5224;
						return;
					}
					if (arg0 == 6802) {
						local175 = anIntArray342[--anInt5986];
						local8082 = Static361.aClass248_4.method6584(local175);
						anIntArray342[anInt5986++] = local8082.anInt5223;
						return;
					}
					if (arg0 == 6803) {
						local175 = anIntArray342[--anInt5986];
						local8082 = Static361.aClass248_4.method6584(local175);
						anIntArray342[anInt5986++] = local8082.anInt5239;
						return;
					}
					if (arg0 == 6804) {
						anInt5986 -= 2;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						@Pc(8204) Class335 local8204 = Static229.aClass70_1.method2496(local776);
						if (local8204.method8409()) {
							aStringArray23[anInt5984++] = Static361.aClass248_4.method6584(local175).method4496(local8204.aString102, local776);
							return;
						}
						anIntArray342[anInt5986++] = Static361.aClass248_4.method6584(local175).method4498(local8204.anInt10093, local776);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray342[anInt5986++] = Static209.aBoolean352 && !Static381.aBoolean540 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray342[anInt5986++] = Static362.anInt7191;
						return;
					}
					if (arg0 == 6902) {
						anIntArray342[anInt5986++] = Static274.anInt5851;
						return;
					}
					if (arg0 == 6903) {
						anIntArray342[anInt5986++] = Static8.anInt153;
						return;
					}
					if (arg0 == 6904) {
						anIntArray342[anInt5986++] = Static486.anInt9004;
						return;
					}
					if (arg0 == 6905) {
						local83 = "";
						if (Static374.aClass240_10 != null) {
							if (Static374.aClass240_10.anObject13 == null) {
								local83 = Static56.method1810(Static374.aClass240_10.anInt7568);
							} else {
								local83 = (String) Static374.aClass240_10.anObject13;
							}
						}
						aStringArray23[anInt5984++] = local83;
						return;
					}
					if (arg0 == 6906) {
						anIntArray342[anInt5986++] = Static499.anInt9242;
						return;
					}
					if (arg0 == 6907) {
						anIntArray342[anInt5986++] = Static21.anInt396;
						return;
					}
					if (arg0 == 6908) {
						anIntArray342[anInt5986++] = Static173.anInt4165;
						return;
					}
					if (arg0 == 6909) {
						anIntArray342[anInt5986++] = Static63.aBoolean168 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray342[anInt5986++] = Static20.anInt389;
						return;
					}
					if (arg0 == 6911) {
						anIntArray342[anInt5986++] = Static300.anInt2386;
						return;
					}
					if (arg0 == 6912) {
						anIntArray342[anInt5986++] = Static2.anInt4533;
						return;
					}
				} else if (arg0 < 7100) {
					if (arg0 == 7000) {
						local175 = Static455.method5073();
						anIntArray342[anInt5986++] = Static415.anInt7825 = Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945();
						anIntArray342[anInt5986++] = local175;
						Static269.method4952();
						Static318.method5531();
						Static475.aBoolean694 = false;
						return;
					}
					if (arg0 == 7001) {
						Static381.method6295();
						Static269.method4952();
						Static318.method5531();
						Static475.aBoolean694 = false;
						return;
					}
					if (arg0 == 7002) {
						Static247.method6231();
						Static269.method4952();
						Static318.method5531();
						Static475.aBoolean694 = false;
						return;
					}
					if (arg0 == 7003) {
						Static418.method6758();
						Static269.method4952();
						Static318.method5531();
						Static475.aBoolean694 = false;
						return;
					}
					if (arg0 == 7004) {
						Static27.method681();
						Static269.method4952();
						Static318.method5531();
						Static475.aBoolean694 = false;
						return;
					}
					if (arg0 == 7005) {
						Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub9_1, 0);
						Static318.method5531();
						Static475.aBoolean694 = false;
						return;
					}
					if (arg0 == 7006) {
						if (Static415.anInt7825 == 2) {
							Static509.aBoolean668 = true;
							return;
						}
						if (Static415.anInt7825 == 1) {
							Static97.aBoolean223 = true;
							return;
						}
						if (Static415.anInt7825 == 3) {
							Static2.aBoolean333 = true;
						}
						return;
					}
					if (arg0 == 7007) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub9_1.method3597();
						return;
					}
				} else if (arg0 < 7200) {
					if (arg0 == 7100) {
						anInt5986 -= 2;
						local175 = anIntArray342[anInt5986];
						local776 = anIntArray342[anInt5986 + 1];
						if (local175 != -1) {
							if (local776 > 255) {
								local776 = 255;
							} else if (local776 < 0) {
								local776 = 0;
							}
							Static448.method7067(local776, false, local175);
						}
						return;
					}
					if (arg0 == 7101) {
						local175 = anIntArray342[--anInt5986];
						if (local175 != -1) {
							Static415.method6712(local175);
						}
						return;
					}
					if (arg0 == 7102) {
						local175 = anIntArray342[--anInt5986];
						if (local175 != -1) {
							Static394.method6488(local175);
						}
						return;
					}
					if (arg0 == 7103) {
						anIntArray342[anInt5986++] = Static607.method8908("jagtheora") ? 1 : 0;
						return;
					}
				} else if (arg0 < 7300) {
					if (arg0 == 7201) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub12_1.method5128() ? 1 : 0;
						return;
					}
					if (arg0 == 7202) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub28_1.method8962() ? 1 : 0;
						return;
					}
					if (arg0 == 7203) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub15_1.method5863() ? 1 : 0;
						return;
					}
					if (arg0 == 7204) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub25_1.method8178() ? 1 : 0;
						return;
					}
					if (arg0 == 7205) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub27_1.method8729() && Static186.aClass20_4.method7302() ? 1 : 0;
						return;
					}
					if (arg0 == 7206) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub22_1.method6943() ? 1 : 0;
						return;
					}
					if (arg0 == 7207) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub14_1.method5290() ? 1 : 0;
						return;
					}
					if (arg0 == 7208) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub2_1.method658() && Static186.aClass20_4.method7230() ? 1 : 0;
						return;
					}
					if (arg0 == 7209) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub17_1.method5996() ? 1 : 0;
						return;
					}
					if (arg0 == 7210) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub4_1.method2495() ? 1 : 0;
						return;
					}
					if (arg0 == 7211) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub3_1.method1702() ? 1 : 0;
						return;
					}
					if (arg0 == 7212) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub23_1.method7809() ? 1 : 0;
						return;
					}
					if (arg0 == 7213) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub11_1.method4678() ? 1 : 0;
						return;
					}
					if (arg0 == 7214) {
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub5_1.method2947() ? 1 : 0;
						return;
					}
				} else if (arg0 < 7400) {
					if (arg0 == 7301) {
						local175 = anIntArray342[--anInt5986];
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub12_1.method9033(local175);
						return;
					}
					if (arg0 == 7302) {
						local175 = anIntArray342[--anInt5986];
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub28_1.method9033(local175);
						return;
					}
					if (arg0 == 7303) {
						local175 = anIntArray342[--anInt5986];
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub15_1.method9033(local175);
						return;
					}
					if (arg0 == 7304) {
						local175 = anIntArray342[--anInt5986];
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub25_1.method9033(local175);
						return;
					}
					if (arg0 == 7305) {
						local175 = anIntArray342[--anInt5986];
						if (!Static186.aClass20_4.method7302()) {
							anIntArray342[anInt5986++] = 3;
							return;
						}
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub27_1.method9033(local175);
						return;
					}
					if (arg0 == 7306) {
						local175 = anIntArray342[--anInt5986];
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub22_1.method9033(local175);
						return;
					}
					if (arg0 == 7307) {
						local175 = anIntArray342[--anInt5986];
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub14_1.method9033(local175);
						return;
					}
					if (arg0 == 7308) {
						local175 = anIntArray342[--anInt5986];
						if (!Static186.aClass20_4.method7230()) {
							anIntArray342[anInt5986++] = 3;
							return;
						}
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub2_1.method9033(local175);
						return;
					}
					if (arg0 == 7309) {
						local175 = anIntArray342[--anInt5986];
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub17_1.method9033(local175);
						return;
					}
					if (arg0 == 7310) {
						local175 = anIntArray342[--anInt5986];
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub4_1.method9033(local175);
						return;
					}
					if (arg0 == 7311) {
						local175 = anIntArray342[--anInt5986];
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub3_1.method9033(local175);
						return;
					}
					if (arg0 == 7312) {
						local175 = anIntArray342[--anInt5986];
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub23_1.method9033(local175);
						return;
					}
					if (arg0 == 7313) {
						local175 = anIntArray342[--anInt5986];
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub11_1.method9033(local175);
						return;
					}
					if (arg0 == 7314) {
						local175 = anIntArray342[--anInt5986];
						anIntArray342[anInt5986++] = Static74.aClass2_Sub13_5.aClass14_Sub5_1.method9033(local175);
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!rk;)V")
	public static void method5153(@OriginalArg(0) Class2_Sub44 arg0) {
		method5160(arg0, 200000);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "()V")
	public static void method5154() {
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method5155(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static468.anInt8823 == 0 && (Static209.aBoolean352 && !Static381.aBoolean540 || Static180.aBoolean322)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static588.aClass351_49.method8691(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static588.aClass351_49.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_50.method8691(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static588.aClass351_50.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_51.method8691(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static588.aClass351_51.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_52.method8691(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static588.aClass351_52.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_53.method8691(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static588.aClass351_53.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_54.method8691(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static588.aClass351_54.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_55.method8691(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static588.aClass351_55.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_56.method8691(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static588.aClass351_56.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_57.method8691(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static588.aClass351_57.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_58.method8691(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static588.aClass351_58.method8691(0).length());
		} else if (local11.startsWith(Class351.lb.method8691(0))) {
			local13 = 10;
			arg0 = arg0.substring(Class351.lb.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_59.method8691(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static588.aClass351_59.method8691(0).length());
		} else if (Static476.anInt8915 != 0) {
			if (local11.startsWith(Static588.aClass351_49.method8691(Static476.anInt8915))) {
				local13 = 0;
				arg0 = arg0.substring(Static588.aClass351_49.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_50.method8691(Static476.anInt8915))) {
				local13 = 1;
				arg0 = arg0.substring(Static588.aClass351_50.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_51.method8691(Static476.anInt8915))) {
				local13 = 2;
				arg0 = arg0.substring(Static588.aClass351_51.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_52.method8691(Static476.anInt8915))) {
				local13 = 3;
				arg0 = arg0.substring(Static588.aClass351_52.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_53.method8691(Static476.anInt8915))) {
				local13 = 4;
				arg0 = arg0.substring(Static588.aClass351_53.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_54.method8691(Static476.anInt8915))) {
				local13 = 5;
				arg0 = arg0.substring(Static588.aClass351_54.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_55.method8691(Static476.anInt8915))) {
				local13 = 6;
				arg0 = arg0.substring(Static588.aClass351_55.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_56.method8691(Static476.anInt8915))) {
				local13 = 7;
				arg0 = arg0.substring(Static588.aClass351_56.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_57.method8691(Static476.anInt8915))) {
				local13 = 8;
				arg0 = arg0.substring(Static588.aClass351_57.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_58.method8691(Static476.anInt8915))) {
				local13 = 9;
				arg0 = arg0.substring(Static588.aClass351_58.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Class351.lb.method8691(Static476.anInt8915))) {
				local13 = 10;
				arg0 = arg0.substring(Class351.lb.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_59.method8691(Static476.anInt8915))) {
				local13 = 11;
				arg0 = arg0.substring(Static588.aClass351_59.method8691(Static476.anInt8915).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static588.aClass351_60.method8691(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static588.aClass351_60.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_61.method8691(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static588.aClass351_61.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_62.method8691(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static588.aClass351_62.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_63.method8691(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static588.aClass351_63.method8691(0).length());
		} else if (local11.startsWith(Static588.aClass351_64.method8691(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static588.aClass351_64.method8691(0).length());
		} else if (Static476.anInt8915 != 0) {
			if (local11.startsWith(Static588.aClass351_60.method8691(Static476.anInt8915))) {
				local451 = 1;
				arg0 = arg0.substring(Static588.aClass351_60.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_61.method8691(Static476.anInt8915))) {
				local451 = 2;
				arg0 = arg0.substring(Static588.aClass351_61.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_62.method8691(Static476.anInt8915))) {
				local451 = 3;
				arg0 = arg0.substring(Static588.aClass351_62.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_63.method8691(Static476.anInt8915))) {
				local451 = 4;
				arg0 = arg0.substring(Static588.aClass351_63.method8691(Static476.anInt8915).length());
			} else if (local11.startsWith(Static588.aClass351_64.method8691(Static476.anInt8915))) {
				local451 = 5;
				arg0 = arg0.substring(Static588.aClass351_64.method8691(Static476.anInt8915).length());
			}
		}
		@Pc(641) Class2_Sub52 local641 = Static130.method3019(Static485.aClass94_93, Static361.aClass183_1);
		local641.aClass2_Sub11_Sub2_7.method8374(0);
		@Pc(650) int local650 = local641.aClass2_Sub11_Sub2_7.anInt10066;
		local641.aClass2_Sub11_Sub2_7.method8374(local13);
		local641.aClass2_Sub11_Sub2_7.method8374(local451);
		Static47.method1691(local641.aClass2_Sub11_Sub2_7, arg0);
		local641.aClass2_Sub11_Sub2_7.method8335(local641.aClass2_Sub11_Sub2_7.anInt10066 - local650);
		Static96.method2563(local641);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(C)I")
	private static int method5156(@OriginalArg(0) char arg0) {
		return Static589.method8710(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method5157(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray25[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(IZ)V")
	private static void method5158(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class24 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class24 local35;
		@Pc(13) int local13;
		@Pc(210) Class24 local210;
		@Pc(158) Class24 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt5986 -= 3;
				local13 = anIntArray342[anInt5986];
				local19 = anIntArray342[anInt5986 + 1];
				local25 = anIntArray342[anInt5986 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static87.method8101(local13);
				if (local35.aClass24Array1 == null) {
					local35.aClass24Array1 = new Class24[local25 + 1];
				}
				if (local35.aClass24Array1.length <= local25) {
					@Pc(54) Class24[] local54 = new Class24[local25 + 1];
					for (local56 = 0; local56 < local35.aClass24Array1.length; local56++) {
						local54[local56] = local35.aClass24Array1[local56];
					}
					local35.aClass24Array1 = local54;
				}
				if (local25 > 0 && local35.aClass24Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class24 local99 = new Class24();
				local99.anInt480 = local19;
				local99.anInt511 = local99.anInt510 = local35.anInt510;
				local99.anInt439 = local25;
				local35.aClass24Array1[local25] = local99;
				if (arg1) {
					aClass24_12 = local99;
				} else {
					aClass24_11 = local99;
				}
				Static553.method8248(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass24_12 : aClass24_11;
				if (local137.anInt439 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static87.method8101(local137.anInt510);
				local158.aClass24Array1[local137.anInt439] = null;
				Static553.method8248(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static87.method8101(anIntArray342[--anInt5986]);
				local137.aClass24Array1 = null;
				Static553.method8248(local137);
				return;
			}
			if (arg0 == 200) {
				anInt5986 -= 2;
				local13 = anIntArray342[anInt5986];
				local19 = anIntArray342[anInt5986 + 1];
				local210 = Static330.method5694(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray342[anInt5986++] = 1;
					if (arg1) {
						aClass24_12 = local210;
						return;
					}
					aClass24_11 = local210;
					return;
				}
				anIntArray342[anInt5986++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray342[--anInt5986];
				local158 = Static87.method8101(local13);
				if (local158 != null) {
					anIntArray342[anInt5986++] = 1;
					if (arg1) {
						aClass24_12 = local158;
						return;
					}
					aClass24_11 = local158;
					return;
				}
				anIntArray342[anInt5986++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray342[--anInt5986];
				method5162(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray342[--anInt5986];
				method5150(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt5986 -= 2;
					local13 = anIntArray342[anInt5986];
					local19 = anIntArray342[anInt5986 + 1];
					if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static393.anIntArray481.length; local25++) {
						if (Static393.anIntArray481[local25] == local13) {
							Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1.method6592(Static541.aClass245_2, local19, local25);
							return;
						}
					}
					for (local357 = 0; local357 < Static325.anIntArray394.length; local357++) {
						if (Static325.anIntArray394[local357] == local13) {
							Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1.method6592(Static541.aClass245_2, local19, local357);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt5986 -= 2;
					local13 = anIntArray342[anInt5986];
					local19 = anIntArray342[anInt5986 + 1];
					if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1 == null) {
						return;
					}
					Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1.method6590(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray342[--anInt5986] != 0;
					if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1 == null) {
						return;
					}
					Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1.method6588(local420);
					return;
				}
				if (arg0 == 411) {
					anInt5986 -= 2;
					local13 = anIntArray342[anInt5986];
					local19 = anIntArray342[anInt5986 + 1];
					if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1 == null) {
						return;
					}
					Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1.method6586(local13, local19, Static635.aClass336_2);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static87.method8101(anIntArray342[--anInt5986]);
					} else {
						local137 = arg1 ? aClass24_12 : aClass24_11;
					}
					if (arg0 == 1100) {
						anInt5986 -= 2;
						local137.anInt463 = anIntArray342[anInt5986];
						if (local137.anInt463 > local137.anInt434 - local137.anInt441) {
							local137.anInt463 = local137.anInt434 - local137.anInt441;
						}
						if (local137.anInt463 < 0) {
							local137.anInt463 = 0;
						}
						local137.anInt467 = anIntArray342[anInt5986 + 1];
						if (local137.anInt467 > local137.anInt489 - local137.anInt488) {
							local137.anInt467 = local137.anInt489 - local137.anInt488;
						}
						if (local137.anInt467 < 0) {
							local137.anInt467 = 0;
						}
						Static553.method8248(local137);
						if (local137.anInt439 == -1) {
							Static492.method7633(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt464 = anIntArray342[--anInt5986];
						Static553.method8248(local137);
						if (local137.anInt439 == -1) {
							Static43.method5094(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean42 = anIntArray342[--anInt5986] == 1;
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt433 = anIntArray342[--anInt5986];
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt428 = anIntArray342[--anInt5986];
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray342[--anInt5986];
						if (local137.anInt468 != local19) {
							local137.anInt468 = local19;
							Static553.method8248(local137);
						}
						if (local137.anInt439 == -1) {
							Static483.method7527(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt508 = anIntArray342[--anInt5986];
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean30 = anIntArray342[--anInt5986] == 1;
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt478 = 1;
						local137.anInt466 = anIntArray342[--anInt5986];
						Static553.method8248(local137);
						if (local137.anInt439 == -1) {
							Static161.method6634(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt5986 -= 6;
						local137.anInt499 = anIntArray342[anInt5986];
						local137.anInt485 = anIntArray342[anInt5986 + 1];
						local137.anInt469 = anIntArray342[anInt5986 + 2];
						local137.anInt424 = anIntArray342[anInt5986 + 3];
						local137.anInt447 = anIntArray342[anInt5986 + 4];
						local137.anInt446 = anIntArray342[anInt5986 + 5];
						Static553.method8248(local137);
						if (local137.anInt439 == -1) {
							Static438.method6944(local137.anInt510);
							Static478.method7487(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray342[--anInt5986];
						if (local137.anInt435 != local19) {
							local137.anInt435 = local19;
							local137.anInt491 = 0;
							local137.anInt456 = 1;
							local137.anInt514 = 0;
							@Pc(1110) Class130 local1110 = local137.anInt435 == -1 ? null : Static195.aClass193_1.method5573(local137.anInt435);
							if (local1110 != null) {
								Static573.method8546(local137.anInt491, local1110);
							}
							Static553.method8248(local137);
						}
						if (local137.anInt439 == -1) {
							Static415.method6709(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean29 = anIntArray342[--anInt5986] == 1;
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray23[--anInt5984];
						if (!local1161.equals(local137.aString5)) {
							local137.aString5 = local1161;
							Static553.method8248(local137);
						}
						if (local137.anInt439 == -1) {
							Static450.method7087(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt437 = anIntArray342[--anInt5986];
						Static553.method8248(local137);
						if (local137.anInt439 == -1) {
							Static67.method2079(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt5986 -= 3;
						local137.anInt473 = anIntArray342[anInt5986];
						local137.anInt436 = anIntArray342[anInt5986 + 1];
						local137.anInt422 = anIntArray342[anInt5986 + 2];
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean37 = anIntArray342[--anInt5986] == 1;
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt421 = anIntArray342[--anInt5986];
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt500 = anIntArray342[--anInt5986];
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean40 = anIntArray342[--anInt5986] == 1;
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean32 = anIntArray342[--anInt5986] == 1;
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt5986 -= 2;
						local137.anInt434 = anIntArray342[anInt5986];
						local137.anInt489 = anIntArray342[anInt5986 + 1];
						Static553.method8248(local137);
						if (local137.anInt480 == 0) {
							Static553.method8245(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean35 = anIntArray342[--anInt5986] == 1;
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt446 = anIntArray342[--anInt5986];
						Static553.method8248(local137);
						if (local137.anInt439 == -1) {
							Static438.method6944(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray342[--anInt5986];
						local137.aBoolean34 = local19 == 1;
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt5986 -= 2;
						local137.anInt427 = anIntArray342[anInt5986];
						local137.anInt494 = anIntArray342[anInt5986 + 1];
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt479 = anIntArray342[--anInt5986];
						Static553.method8248(local137);
						return;
					}
					@Pc(1489) Class335 local1489;
					if (arg0 == 1127) {
						anInt5986 -= 2;
						local19 = anIntArray342[anInt5986];
						local25 = anIntArray342[anInt5986 + 1];
						local1489 = Static229.aClass70_1.method2496(local19);
						if (local25 != local1489.anInt10093) {
							local137.method622(local19, local25);
							return;
						}
						local137.method621(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray342[--anInt5986];
						local1523 = aStringArray23[--anInt5984];
						local1489 = Static229.aClass70_1.method2496(local19);
						if (!local1489.aString102.equals(local1523)) {
							local137.method625(local19, local1523);
							return;
						}
						local137.method621(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray342[--anInt5986];
						if (local137.anInt480 != 5 && arg0 == 1129 || local137.anInt480 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt498 != local19) {
							local137.anInt498 = local19;
							Static553.method8248(local137);
						}
						if (local137.anInt439 == -1) {
							Static460.method7176(local137.anInt510);
						}
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2373) int local2373;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static87.method8101(anIntArray342[--anInt5986]);
						} else {
							local137 = arg1 ? aClass24_12 : aClass24_11;
						}
						if (arg0 == 1300) {
							local19 = anIntArray342[--anInt5986] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method624(local19, aStringArray23[--anInt5984]);
								return;
							}
							anInt5984--;
							return;
						}
						if (arg0 == 1301) {
							anInt5986 -= 2;
							local19 = anIntArray342[anInt5986];
							local25 = anIntArray342[anInt5986 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass24_3 = null;
								return;
							}
							local137.aClass24_3 = Static330.method5694(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray342[--anInt5986];
							if (local19 != Static128.anInt3270 && local19 != Static51.anInt1865 && local19 != Static69.anInt2215) {
								return;
							}
							local137.anInt493 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt455 = anIntArray342[--anInt5986];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt438 = anIntArray342[--anInt5986];
							return;
						}
						if (arg0 == 1305) {
							local137.aString3 = aStringArray23[--anInt5984];
							return;
						}
						if (arg0 == 1306) {
							local137.aString4 = aStringArray23[--anInt5984];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray2 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt432 = anIntArray342[--anInt5986];
							local137.anInt504 = anIntArray342[--anInt5986];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray342[--anInt5986];
							local25 = anIntArray342[--anInt5986];
							if (local25 >= 1 && local25 <= 10) {
								local137.method617(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString6 = aStringArray23[--anInt5984];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt444 = anIntArray342[--anInt5986];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt5986 -= 3;
								local19 = anIntArray342[anInt5986] - 1;
								local25 = anIntArray342[anInt5986 + 1];
								local357 = anIntArray342[anInt5986 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt5986 -= 2;
								local19 = 10;
								local25 = anIntArray342[anInt5986];
								local357 = anIntArray342[anInt5986 + 1];
							}
							if (local137.aByteArray15 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray15 = new byte[11];
								local137.aByteArray17 = new byte[11];
								local137.anIntArray27 = new int[11];
							}
							local137.aByteArray15[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean27 = false;
								for (local2373 = 0; local2373 < local137.aByteArray15.length; local2373++) {
									if (local137.aByteArray15[local2373] != 0) {
										local137.aBoolean27 = true;
										break;
									}
								}
							} else {
								local137.aBoolean27 = true;
							}
							local137.aByteArray17[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt449 = anIntArray342[--anInt5986];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static87.method8101(anIntArray342[--anInt5986]);
						} else {
							local137 = arg1 ? aClass24_12 : aClass24_11;
						}
						if (arg0 == 1499) {
							local137.method620();
							return;
						}
						local1161 = aStringArray23[--anInt5984];
						@Pc(2459) int[] local2459 = null;
						if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
							local357 = anIntArray342[--anInt5986];
							if (local357 > 0) {
								local2459 = new int[local357];
								while (local357-- > 0) {
									local2459[local357] = anIntArray342[--anInt5986];
								}
							}
							local1161 = local1161.substring(0, local1161.length() - 1);
						}
						@Pc(2511) Object[] local2511 = new Object[local1161.length() + 1];
						for (local2373 = local2511.length - 1; local2373 >= 1; local2373--) {
							if (local1161.charAt(local2373 - 1) == 's') {
								local2511[local2373] = aStringArray23[--anInt5984];
							} else {
								local2511[local2373] = Integer.valueOf(anIntArray342[--anInt5986]);
							}
						}
						local56 = anIntArray342[--anInt5986];
						if (local56 == -1) {
							local2511 = null;
						} else {
							local2511[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray16 = local2511;
						} else if (arg0 == 1401) {
							local137.anObjectArray21 = local2511;
						} else if (arg0 == 1402) {
							local137.anObjectArray13 = local2511;
						} else if (arg0 == 1403) {
							local137.anObjectArray23 = local2511;
						} else if (arg0 == 1404) {
							local137.anObjectArray4 = local2511;
						} else if (arg0 == 1405) {
							local137.anObjectArray27 = local2511;
						} else if (arg0 == 1406) {
							local137.anObjectArray3 = local2511;
						} else if (arg0 == 1407) {
							local137.anObjectArray18 = local2511;
							local137.anIntArray25 = local2459;
						} else if (arg0 == 1408) {
							local137.anObjectArray17 = local2511;
						} else if (arg0 == 1409) {
							local137.anObjectArray12 = local2511;
						} else if (arg0 == 1410) {
							local137.anObjectArray7 = local2511;
						} else if (arg0 == 1411) {
							local137.anObjectArray19 = local2511;
						} else if (arg0 == 1412) {
							local137.anObjectArray29 = local2511;
						} else if (arg0 == 1414) {
							local137.anObjectArray14 = local2511;
							local137.anIntArray29 = local2459;
						} else if (arg0 == 1415) {
							local137.anObjectArray1 = local2511;
							local137.anIntArray28 = local2459;
						} else if (arg0 == 1416) {
							local137.anObjectArray10 = local2511;
						} else if (arg0 == 1417) {
							local137.anObjectArray20 = local2511;
						} else if (arg0 == 1418) {
							local137.anObjectArray25 = local2511;
						} else if (arg0 == 1419) {
							local137.anObjectArray26 = local2511;
						} else if (arg0 == 1420) {
							local137.lb = local2511;
						} else if (arg0 == 1421) {
							local137.anObjectArray15 = local2511;
						} else if (arg0 == 1422) {
							local137.anObjectArray28 = local2511;
						} else if (arg0 == 1423) {
							local137.anObjectArray30 = local2511;
						} else if (arg0 == 1424) {
							local137.anObjectArray8 = local2511;
						} else if (arg0 == 1425) {
							local137.anObjectArray22 = local2511;
						} else if (arg0 == 1426) {
							local137.anObjectArray6 = local2511;
						} else if (arg0 == 1427) {
							local137.anObjectArray11 = local2511;
						} else if (arg0 == 1428) {
							local137.anObjectArray5 = local2511;
							local137.anIntArray32 = local2459;
						} else if (arg0 == 1429) {
							local137.anObjectArray9 = local2511;
							local137.anIntArray33 = local2459;
						} else if (arg0 == 1430) {
							local137.anObjectArray2 = local2511;
						}
						local137.aBoolean28 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass24_12 : aClass24_11;
						if (arg0 == 1500) {
							anIntArray342[anInt5986++] = local137.anInt495;
							return;
						}
						if (arg0 == 1501) {
							anIntArray342[anInt5986++] = local137.anInt465;
							return;
						}
						if (arg0 == 1502) {
							anIntArray342[anInt5986++] = local137.anInt441;
							return;
						}
						if (arg0 == 1503) {
							anIntArray342[anInt5986++] = local137.anInt488;
							return;
						}
						if (arg0 == 1504) {
							anIntArray342[anInt5986++] = local137.aBoolean43 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray342[anInt5986++] = local137.anInt511;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static524.method8704(local137);
							anIntArray342[anInt5986++] = local158 == null ? -1 : local158.anInt510;
							return;
						}
					} else {
						@Pc(3107) Class335 local3107;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass24_12 : aClass24_11;
							if (arg0 == 1600) {
								anIntArray342[anInt5986++] = local137.anInt463;
								return;
							}
							if (arg0 == 1601) {
								anIntArray342[anInt5986++] = local137.anInt467;
								return;
							}
							if (arg0 == 1602) {
								aStringArray23[anInt5984++] = local137.aString5;
								return;
							}
							if (arg0 == 1603) {
								anIntArray342[anInt5986++] = local137.anInt434;
								return;
							}
							if (arg0 == 1604) {
								anIntArray342[anInt5986++] = local137.anInt489;
								return;
							}
							if (arg0 == 1605) {
								anIntArray342[anInt5986++] = local137.anInt446;
								return;
							}
							if (arg0 == 1606) {
								anIntArray342[anInt5986++] = local137.anInt469;
								return;
							}
							if (arg0 == 1607) {
								anIntArray342[anInt5986++] = local137.anInt447;
								return;
							}
							if (arg0 == 1608) {
								anIntArray342[anInt5986++] = local137.anInt424;
								return;
							}
							if (arg0 == 1609) {
								anIntArray342[anInt5986++] = local137.anInt433;
								return;
							}
							if (arg0 == 1610) {
								anIntArray342[anInt5986++] = local137.anInt499;
								return;
							}
							if (arg0 == 1611) {
								anIntArray342[anInt5986++] = local137.anInt485;
								return;
							}
							if (arg0 == 1612) {
								anIntArray342[anInt5986++] = local137.anInt468;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray342[--anInt5986];
								local3107 = Static229.aClass70_1.method2496(local19);
								if (local3107.method8409()) {
									aStringArray23[anInt5984++] = local137.method615(local19, local3107.aString102);
									return;
								}
								anIntArray342[anInt5986++] = local137.method614(local3107.anInt10093, local19);
								return;
							}
							if (arg0 == 1614) {
								anIntArray342[anInt5986++] = local137.anInt508;
								return;
							}
							if (arg0 == 2614) {
								anIntArray342[anInt5986++] = local137.anInt478 == 1 ? local137.anInt466 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass24_12 : aClass24_11;
							if (arg0 == 1700) {
								anIntArray342[anInt5986++] = local137.anInt501;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt501 != -1) {
									anIntArray342[anInt5986++] = local137.anInt483;
									return;
								}
								anIntArray342[anInt5986++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray342[anInt5986++] = local137.anInt439;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass24_12 : aClass24_11;
							if (arg0 == 1800) {
								anIntArray342[anInt5986++] = Static76.method2235(local137).method9008();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray342[--anInt5986];
								local19--;
								if (local137.aStringArray2 != null && local19 < local137.aStringArray2.length && local137.aStringArray2[local19] != null) {
									aStringArray23[anInt5984++] = local137.aStringArray2[local19];
									return;
								}
								aStringArray23[anInt5984++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString3 == null) {
									aStringArray23[anInt5984++] = "";
									return;
								}
								aStringArray23[anInt5984++] = local137.aString3;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static87.method8101(anIntArray342[--anInt5986]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass24_12 : aClass24_11;
							}
							if (anInt5987 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray11 == null) {
									return;
								}
								@Pc(3376) Class2_Sub44 local3376 = new Class2_Sub44();
								local3376.aClass24_15 = local137;
								local3376.anObjectArray32 = local137.anObjectArray11;
								local3376.anInt9080 = anInt5987 + 1;
								Static98.aClass341_28.method8528(local3376);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static87.method8101(anIntArray342[--anInt5986]);
							if (arg0 == 2500) {
								anIntArray342[anInt5986++] = local137.anInt495;
								return;
							}
							if (arg0 == 2501) {
								anIntArray342[anInt5986++] = local137.anInt465;
								return;
							}
							if (arg0 == 2502) {
								anIntArray342[anInt5986++] = local137.anInt441;
								return;
							}
							if (arg0 == 2503) {
								anIntArray342[anInt5986++] = local137.anInt488;
								return;
							}
							if (arg0 == 2504) {
								anIntArray342[anInt5986++] = local137.aBoolean43 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray342[anInt5986++] = local137.anInt511;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static524.method8704(local137);
								anIntArray342[anInt5986++] = local158 == null ? -1 : local158.anInt510;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static87.method8101(anIntArray342[--anInt5986]);
							if (arg0 == 2600) {
								anIntArray342[anInt5986++] = local137.anInt463;
								return;
							}
							if (arg0 == 2601) {
								anIntArray342[anInt5986++] = local137.anInt467;
								return;
							}
							if (arg0 == 2602) {
								aStringArray23[anInt5984++] = local137.aString5;
								return;
							}
							if (arg0 == 2603) {
								anIntArray342[anInt5986++] = local137.anInt434;
								return;
							}
							if (arg0 == 2604) {
								anIntArray342[anInt5986++] = local137.anInt489;
								return;
							}
							if (arg0 == 2605) {
								anIntArray342[anInt5986++] = local137.anInt446;
								return;
							}
							if (arg0 == 2606) {
								anIntArray342[anInt5986++] = local137.anInt469;
								return;
							}
							if (arg0 == 2607) {
								anIntArray342[anInt5986++] = local137.anInt447;
								return;
							}
							if (arg0 == 2608) {
								anIntArray342[anInt5986++] = local137.anInt424;
								return;
							}
							if (arg0 == 2609) {
								anIntArray342[anInt5986++] = local137.anInt433;
								return;
							}
							if (arg0 == 2610) {
								anIntArray342[anInt5986++] = local137.anInt499;
								return;
							}
							if (arg0 == 2611) {
								anIntArray342[anInt5986++] = local137.anInt485;
								return;
							}
							if (arg0 == 2612) {
								anIntArray342[anInt5986++] = local137.anInt468;
								return;
							}
							if (arg0 == 2613) {
								anIntArray342[anInt5986++] = local137.anInt508;
								return;
							}
							if (arg0 == 2614) {
								anIntArray342[anInt5986++] = local137.anInt478 == 1 ? local137.anInt466 : -1;
								return;
							}
						} else {
							@Pc(3905) Class2_Sub48 local3905;
							@Pc(3803) Class2_Sub48 local3803;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static87.method8101(anIntArray342[--anInt5986]);
									anIntArray342[anInt5986++] = local137.anInt501;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static87.method8101(anIntArray342[--anInt5986]);
									if (local137.anInt501 != -1) {
										anIntArray342[anInt5986++] = local137.anInt483;
										return;
									}
									anIntArray342[anInt5986++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray342[--anInt5986];
									local3803 = (Class2_Sub48) Static372.aClass99_51.method3056((long) local13);
									if (local3803 != null) {
										anIntArray342[anInt5986++] = 1;
										return;
									}
									anIntArray342[anInt5986++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static87.method8101(anIntArray342[--anInt5986]);
									if (local137.aClass24Array1 == null) {
										anIntArray342[anInt5986++] = 0;
										return;
									}
									local19 = local137.aClass24Array1.length;
									for (local25 = 0; local25 < local137.aClass24Array1.length; local25++) {
										if (local137.aClass24Array1[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray342[anInt5986++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt5986 -= 2;
									local13 = anIntArray342[anInt5986];
									local19 = anIntArray342[anInt5986 + 1];
									local3905 = (Class2_Sub48) Static372.aClass99_51.method3056((long) local13);
									if (local3905 != null && local3905.anInt10125 == local19) {
										anIntArray342[anInt5986++] = 1;
										return;
									}
									anIntArray342[anInt5986++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static87.method8101(anIntArray342[--anInt5986]);
								if (arg0 == 2800) {
									anIntArray342[anInt5986++] = Static76.method2235(local137).method9008();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray342[--anInt5986];
									local19--;
									if (local137.aStringArray2 != null && local19 < local137.aStringArray2.length && local137.aStringArray2[local19] != null) {
										aStringArray23[anInt5984++] = local137.aStringArray2[local19];
										return;
									}
									aStringArray23[anInt5984++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString3 == null) {
										aStringArray23[anInt5984++] = "";
										return;
									}
									aStringArray23[anInt5984++] = local137.aString3;
									return;
								}
							} else {
								@Pc(4042) String local4042;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local4042 = aStringArray23[--anInt5984];
										Static463.method7185(local4042);
										return;
									}
									if (arg0 == 3101) {
										anInt5986 -= 2;
										Static201.method4058(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2, anIntArray342[anInt5986], anIntArray342[anInt5986 + 1]);
										return;
									}
									if (arg0 == 3103) {
										Static588.method8688();
										return;
									}
									if (arg0 == 3104) {
										local4042 = aStringArray23[--anInt5984];
										local19 = 0;
										if (Static202.method4067(local4042)) {
											local19 = Static562.method8436(local4042);
										}
										@Pc(4102) Class2_Sub52 local4102 = Static130.method3019(Static243.aClass94_49, Static361.aClass183_1);
										local4102.aClass2_Sub11_Sub2_7.method8387(local19);
										Static96.method2563(local4102);
										return;
									}
									@Pc(4131) Class2_Sub52 local4131;
									if (arg0 == 3105) {
										local4042 = aStringArray23[--anInt5984];
										local4131 = Static130.method3019(Static115.aClass94_26, Static361.aClass183_1);
										local4131.aClass2_Sub11_Sub2_7.method8374(local4042.length() + 1);
										local4131.aClass2_Sub11_Sub2_7.method8329(local4042);
										Static96.method2563(local4131);
										return;
									}
									if (arg0 == 3106) {
										local4042 = aStringArray23[--anInt5984];
										local4131 = Static130.method3019(Static218.aClass94_44, Static361.aClass183_1);
										local4131.aClass2_Sub11_Sub2_7.method8374(local4042.length() + 1);
										local4131.aClass2_Sub11_Sub2_7.method8329(local4042);
										Static96.method2563(local4131);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray342[--anInt5986];
										local1161 = aStringArray23[--anInt5984];
										Static552.method8242(local13, local1161);
										return;
									}
									if (arg0 == 3108) {
										anInt5986 -= 3;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local25 = anIntArray342[anInt5986 + 2];
										local35 = Static87.method8101(local25);
										Static343.method5883(local35, local13, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local210 = arg1 ? aClass24_12 : aClass24_11;
										Static343.method5883(local210, local13, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray342[--anInt5986];
										local4131 = Static130.method3019(Static27.aClass94_9, Static361.aClass183_1);
										local4131.aClass2_Sub11_Sub2_7.method8333(local13);
										Static96.method2563(local4131);
										return;
									}
									if (arg0 == 3111) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local3905 = (Class2_Sub48) Static372.aClass99_51.method3056((long) local13);
										if (local3905 != null) {
											Static133.method3047(local3905.anInt10125 != local19, true, local3905);
										}
										Static113.method2840(local19, local13, 3, true);
										return;
									}
									if (arg0 == 3112) {
										anInt5986--;
										local13 = anIntArray342[anInt5986];
										local3803 = (Class2_Sub48) Static372.aClass99_51.method3056((long) local13);
										if (local3803 != null && local3803.anInt10127 == 3) {
											Static133.method3047(true, true, local3803);
										}
										return;
									}
									if (arg0 == 3113) {
										Static15.method317(aStringArray23[--anInt5984]);
										return;
									}
									if (arg0 == 3114) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local1523 = aStringArray23[--anInt5984];
										Static101.method2658("", local13, local19, local1523, "", "");
										return;
									}
									if (arg0 == 3115) {
										anInt5986 -= 11;
										@Pc(4432) Class309[] local4432 = Static409.method6629();
										@Pc(4435) Class86[] local4435 = Static277.method5088();
										Static584.method4585(anIntArray342[anInt5986 + 9], anIntArray342[anInt5986 + 5], local4432[anIntArray342[anInt5986]], local4435[anIntArray342[anInt5986 + 1]], anIntArray342[anInt5986 + 7], anIntArray342[anInt5986 + 6], anIntArray342[anInt5986 + 4], anIntArray342[anInt5986 + 10], anIntArray342[anInt5986 + 2], anIntArray342[anInt5986 + 3], anIntArray342[anInt5986 + 8]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt5986 -= 3;
										Static269.method4946(255, anIntArray342[anInt5986], anIntArray342[anInt5986 + 1], anIntArray342[anInt5986 + 2], 256);
										return;
									}
									if (arg0 == 3201) {
										Static402.method6562(255, anIntArray342[--anInt5986], 50);
										return;
									}
									if (arg0 == 3202) {
										anInt5986 -= 2;
										Static440.method6960(anIntArray342[anInt5986], 255, anIntArray342[anInt5986 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt5986 -= 4;
										Static269.method4946(anIntArray342[anInt5986 + 3], anIntArray342[anInt5986], anIntArray342[anInt5986 + 1], anIntArray342[anInt5986 + 2], 256);
										return;
									}
									if (arg0 == 3204) {
										anInt5986 -= 3;
										Static402.method6562(anIntArray342[anInt5986 + 1], anIntArray342[anInt5986], anIntArray342[anInt5986 + 2]);
										return;
									}
									if (arg0 == 3205) {
										anInt5986 -= 3;
										Static440.method6960(anIntArray342[anInt5986], anIntArray342[anInt5986 + 2], anIntArray342[anInt5986 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt5986 -= 4;
										Static61.method7220(anIntArray342[anInt5986 + 1], 256, false, anIntArray342[anInt5986 + 3], anIntArray342[anInt5986 + 2], anIntArray342[anInt5986]);
										return;
									}
									if (arg0 == 3207) {
										anInt5986 -= 4;
										Static61.method7220(anIntArray342[anInt5986 + 1], 256, true, anIntArray342[anInt5986 + 3], anIntArray342[anInt5986 + 2], anIntArray342[anInt5986]);
										return;
									}
									if (arg0 == 3208) {
										anInt5986 -= 5;
										Static269.method4946(anIntArray342[anInt5986 + 3], anIntArray342[anInt5986], anIntArray342[anInt5986 + 1], anIntArray342[anInt5986 + 2], anIntArray342[anInt5986 + 4]);
										return;
									}
									if (arg0 == 3209) {
										anInt5986 -= 5;
										Static61.method7220(anIntArray342[anInt5986 + 1], anIntArray342[anInt5986 + 4], false, anIntArray342[anInt5986 + 3], anIntArray342[anInt5986 + 2], anIntArray342[anInt5986]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray342[anInt5986++] = Static407.anInt7704;
										return;
									}
									if (arg0 == 3301) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = Static8.method206(false, local13, local19);
										return;
									}
									if (arg0 == 3302) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = Static529.method8008(local13, false, local19);
										return;
									}
									if (arg0 == 3303) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = Static267.method4909(local19, local13, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static133.aClass349_1.method8645(local13).anInt8172;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static418.anIntArray505[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static564.anIntArray655[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static456.anIntArray376[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4960) byte local4960 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132;
										local19 = (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303 >> 9) + Static84.anInt2565;
										local25 = (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310 >> 9) + Static32.anInt723;
										anIntArray342[anInt5986++] = (local4960 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray342[anInt5986++] = Static378.aBoolean238 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = Static8.method206(true, local13, local19);
										return;
									}
									if (arg0 == 3314) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = Static529.method8008(local13, true, local19);
										return;
									}
									if (arg0 == 3315) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = Static267.method4909(local19, local13, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static468.anInt8823 >= 2) {
											anIntArray342[anInt5986++] = Static468.anInt8823;
											return;
										}
										anIntArray342[anInt5986++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray342[anInt5986++] = Static612.anInt10717;
										return;
									}
									if (arg0 == 3318) {
										anIntArray342[anInt5986++] = Static185.aClass255_2.anInt7912;
										return;
									}
									if (arg0 == 3321) {
										anIntArray342[anInt5986++] = Static67.anInt2178;
										return;
									}
									if (arg0 == 3322) {
										anIntArray342[anInt5986++] = Static376.anInt7386;
										return;
									}
									if (arg0 == 3323) {
										if (Static372.anInt7351 >= 5 && Static372.anInt7351 <= 9) {
											anIntArray342[anInt5986++] = 1;
											return;
										}
										anIntArray342[anInt5986++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static372.anInt7351 >= 5 && Static372.anInt7351 <= 9) {
											anIntArray342[anInt5986++] = Static372.anInt7351;
											return;
										}
										anIntArray342[anInt5986++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray342[anInt5986++] = Static486.aBoolean654 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray342[anInt5986++] = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6106;
										return;
									}
									if (arg0 == 3327) {
										anIntArray342[anInt5986++] = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1 != null && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1.aBoolean550 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray342[anInt5986++] = Static180.aBoolean322 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static641.method9218(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = Static276.method5084(false, local13, local19);
										return;
									}
									if (arg0 == 3332) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = Static276.method5084(true, local13, local19);
										return;
									}
									if (arg0 == 3333) {
										anIntArray342[anInt5986++] = Static291.anInt6172;
										return;
									}
									if (arg0 == 3335) {
										anIntArray342[anInt5986++] = Static476.anInt8915;
										return;
									}
									if (arg0 == 3336) {
										anInt5986 -= 4;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local25 = anIntArray342[anInt5986 + 2];
										local357 = anIntArray342[anInt5986 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local357;
										anIntArray342[anInt5986++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray342[anInt5986++] = Static482.anInt8988;
										return;
									}
									if (arg0 == 3338) {
										anIntArray342[anInt5986++] = Static602.method8804();
										return;
									}
									if (arg0 == 3339) {
										anIntArray342[anInt5986++] = 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray342[anInt5986++] = Static437.aBoolean575 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray342[anInt5986++] = Static179.aBoolean320 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray342[anInt5986++] = Static628.aClass9_1.method803();
										return;
									}
									if (arg0 == 3343) {
										anIntArray342[anInt5986++] = Static628.aClass9_1.method800();
										return;
									}
									if (arg0 == 3344) {
										aStringArray23[anInt5984++] = Static46.method1669();
										return;
									}
									if (arg0 == 3345) {
										aStringArray23[anInt5984++] = Static195.method3950();
										return;
									}
									if (arg0 == 3346) {
										anIntArray342[anInt5986++] = Static79.method2323();
										return;
									}
									if (arg0 == 3347) {
										anIntArray342[anInt5986++] = Static112.anInt3033;
										return;
									}
									if (arg0 == 3349) {
										anIntArray342[anInt5986++] = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass343_7.method8548() >> 3;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5711) Class218 local5711;
									if (arg0 == 3400) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local5711 = Static176.aClass145_1.method4404(local13);
										aStringArray23[anInt5984++] = local5711.method6199(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt5986 -= 4;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local25 = anIntArray342[anInt5986 + 2];
										local357 = anIntArray342[anInt5986 + 3];
										@Pc(5757) Class218 local5757 = Static176.aClass145_1.method4404(local25);
										if (local5757.aChar2 == local13 && local5757.aChar3 == local19) {
											if (local19 == 115) {
												aStringArray23[anInt5984++] = local5757.method6199(local357);
												return;
											}
											anIntArray342[anInt5986++] = local5757.method6198(local357);
											return;
										}
										throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
									}
									if (arg0 == 3409) {
										anInt5986 -= 3;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local25 = anIntArray342[anInt5986 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5843) Class218 local5843 = Static176.aClass145_1.method4404(local19);
										if (local5843.aChar3 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray342[anInt5986++] = local5843.method6192(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray342[--anInt5986];
										local1161 = aStringArray23[--anInt5984];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5711 = Static176.aClass145_1.method4404(local13);
										if (local5711.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray342[anInt5986++] = local5711.method6191(local1161) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray342[--anInt5986];
										@Pc(5941) Class218 local5941 = Static176.aClass145_1.method4404(local13);
										anIntArray342[anInt5986++] = local5941.aClass99_49.method3050();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static372.anInt7359 == 0) {
											anIntArray342[anInt5986++] = -2;
											return;
										}
										if (Static372.anInt7359 == 1) {
											anIntArray342[anInt5986++] = -1;
											return;
										}
										anIntArray342[anInt5986++] = Static604.anInt10620;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray342[--anInt5986];
										if (Static372.anInt7359 == 2 && local13 < Static604.anInt10620) {
											aStringArray23[anInt5984++] = Static314.aStringArray29[local13];
											if (Static101.aStringArray15[local13] != null) {
												aStringArray23[anInt5984++] = Static101.aStringArray15[local13];
												return;
											}
											aStringArray23[anInt5984++] = "";
											return;
										}
										aStringArray23[anInt5984++] = "";
										aStringArray23[anInt5984++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray342[--anInt5986];
										if (Static372.anInt7359 == 2 && local13 < Static604.anInt10620) {
											anIntArray342[anInt5986++] = Static199.anIntArray558[local13];
											return;
										}
										anIntArray342[anInt5986++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray342[--anInt5986];
										if (Static372.anInt7359 == 2 && local13 < Static604.anInt10620) {
											anIntArray342[anInt5986++] = Static433.anIntArray535[local13];
											return;
										}
										anIntArray342[anInt5986++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local4042 = aStringArray23[--anInt5984];
										local19 = anIntArray342[--anInt5986];
										Static570.method8511(local19, local4042);
										return;
									}
									if (arg0 == 3605) {
										local4042 = aStringArray23[--anInt5984];
										Static604.method8884(local4042);
										return;
									}
									if (arg0 == 3606) {
										local4042 = aStringArray23[--anInt5984];
										Static549.method8191(local4042);
										return;
									}
									if (arg0 == 3607) {
										local4042 = aStringArray23[--anInt5984];
										Static224.method4296(local4042, false);
										return;
									}
									if (arg0 == 3608) {
										local4042 = aStringArray23[--anInt5984];
										Static411.method6652(local4042);
										return;
									}
									if (arg0 == 3609) {
										local4042 = aStringArray23[--anInt5984];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray342[anInt5986++] = Static233.method4437(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray342[--anInt5986];
										if (Static372.anInt7359 == 2 && local13 < Static604.anInt10620) {
											aStringArray23[anInt5984++] = Static603.aStringArray33[local13];
											return;
										}
										aStringArray23[anInt5984++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static250.aString81 != null) {
											aStringArray23[anInt5984++] = Static45.method1649(Static250.aString81);
											return;
										}
										aStringArray23[anInt5984++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static250.aString81 != null) {
											anIntArray342[anInt5986++] = Static235.anInt5133;
											return;
										}
										anIntArray342[anInt5986++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray342[--anInt5986];
										if (Static250.aString81 != null && local13 < Static235.anInt5133) {
											aStringArray23[anInt5984++] = Static427.aClass132Array1[local13].aString46;
											return;
										}
										aStringArray23[anInt5984++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray342[--anInt5986];
										if (Static250.aString81 != null && local13 < Static235.anInt5133) {
											anIntArray342[anInt5986++] = Static427.aClass132Array1[local13].anInt4830;
											return;
										}
										anIntArray342[anInt5986++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray342[--anInt5986];
										if (Static250.aString81 != null && local13 < Static235.anInt5133) {
											anIntArray342[anInt5986++] = Static427.aClass132Array1[local13].aByte80;
											return;
										}
										anIntArray342[anInt5986++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray342[anInt5986++] = Static505.aByte124;
										return;
									}
									if (arg0 == 3617) {
										local4042 = aStringArray23[--anInt5984];
										Static640.method9215(local4042);
										return;
									}
									if (arg0 == 3618) {
										anIntArray342[anInt5986++] = Static86.aByte29;
										return;
									}
									if (arg0 == 3619) {
										local4042 = aStringArray23[--anInt5984];
										Static504.method7789(local4042);
										return;
									}
									if (arg0 == 3620) {
										Static532.method8011();
										return;
									}
									if (arg0 == 3621) {
										if (Static372.anInt7359 == 0) {
											anIntArray342[anInt5986++] = -1;
											return;
										}
										anIntArray342[anInt5986++] = Static89.anInt2628;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray342[--anInt5986];
										if (Static372.anInt7359 != 0 && local13 < Static89.anInt2628) {
											aStringArray23[anInt5984++] = Static251.aStringArray20[local13];
											if (Static496.aStringArray38[local13] != null) {
												aStringArray23[anInt5984++] = Static496.aStringArray38[local13];
												return;
											}
											aStringArray23[anInt5984++] = "";
											return;
										}
										aStringArray23[anInt5984++] = "";
										aStringArray23[anInt5984++] = "";
										return;
									}
									if (arg0 == 3623) {
										local4042 = aStringArray23[--anInt5984];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray342[anInt5986++] = Static127.method3003(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray342[--anInt5986];
										if (Static427.aClass132Array1 != null && local13 < Static235.anInt5133 && Static427.aClass132Array1[local13].aString43.equalsIgnoreCase(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aString64)) {
											anIntArray342[anInt5986++] = 1;
											return;
										}
										anIntArray342[anInt5986++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static322.aString70 != null) {
											aStringArray23[anInt5984++] = Static322.aString70;
											return;
										}
										aStringArray23[anInt5984++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray342[--anInt5986];
										if (Static250.aString81 != null && local13 < Static235.anInt5133) {
											aStringArray23[anInt5984++] = Static427.aClass132Array1[local13].aString45;
											return;
										}
										aStringArray23[anInt5984++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray342[--anInt5986];
										if (Static372.anInt7359 == 2 && local13 >= 0 && local13 < Static604.anInt10620) {
											anIntArray342[anInt5986++] = Static370.aBooleanArray17[local13] ? 1 : 0;
											return;
										}
										anIntArray342[anInt5986++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local4042 = aStringArray23[--anInt5984];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray342[anInt5986++] = Static630.method9133(local4042);
										return;
									}
									if (arg0 == 3629) {
										anIntArray342[anInt5986++] = Static199.anInt8569;
										return;
									}
									if (arg0 == 3630) {
										local4042 = aStringArray23[--anInt5984];
										Static224.method4296(local4042, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static537.aBooleanArray24[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray342[--anInt5986];
										if (Static250.aString81 != null && local13 < Static235.anInt5133) {
											aStringArray23[anInt5984++] = Static427.aClass132Array1[local13].aString43;
											return;
										}
										aStringArray23[anInt5984++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray342[--anInt5986];
										if (Static372.anInt7359 != 0 && local13 < Static89.anInt2628) {
											aStringArray23[anInt5984++] = Static370.aStringArray34[local13];
											return;
										}
										aStringArray23[anInt5984++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static145.aClass164Array1[local13].method4737();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static145.aClass164Array1[local13].anInt5505;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static145.aClass164Array1[local13].anInt5511;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static145.aClass164Array1[local13].anInt5503;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static145.aClass164Array1[local13].anInt5512;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static145.aClass164Array1[local13].anInt5509;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray342[--anInt5986];
										local19 = Static145.aClass164Array1[local13].method4740();
										anIntArray342[anInt5986++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray342[--anInt5986];
										local19 = Static145.aClass164Array1[local13].method4740();
										anIntArray342[anInt5986++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray342[--anInt5986];
										local19 = Static145.aClass164Array1[local13].method4740();
										anIntArray342[anInt5986++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray342[--anInt5986];
										local19 = Static145.aClass164Array1[local13].method4740();
										anIntArray342[anInt5986++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt5986 -= 5;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local25 = anIntArray342[anInt5986 + 2];
										local357 = anIntArray342[anInt5986 + 3];
										local2373 = anIntArray342[anInt5986 + 4];
										anIntArray342[anInt5986++] = local13 + (local19 - local13) * (local2373 - local25) / (local357 - local25);
										return;
									}
									@Pc(7451) long local7451;
									@Pc(7444) long local7444;
									if (arg0 == 4007) {
										anInt5986 -= 2;
										local7444 = anIntArray342[anInt5986];
										local7451 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = (int) (local7444 + local7444 * local7451 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										if (local13 == 0) {
											anIntArray342[anInt5986++] = 0;
											return;
										}
										anIntArray342[anInt5986++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										if (local13 == 0) {
											anIntArray342[anInt5986++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray342[anInt5986++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray342[anInt5986++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt5986 -= 3;
										local7444 = anIntArray342[anInt5986];
										local7451 = anIntArray342[anInt5986 + 1];
										@Pc(7832) long local7832 = (long) anIntArray342[anInt5986 + 2];
										anIntArray342[anInt5986++] = (int) (local7444 * local7832 / local7451);
										return;
									}
									if (arg0 == 4019) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										if (local13 > 700 || local19 > 700) {
											anIntArray342[anInt5986++] = 256;
										}
										@Pc(7891) double local7891 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
										anIntArray342[anInt5986++] = (int) (Math.pow(2.0D, local7891) + 0.5D);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local4042 = aStringArray23[--anInt5984];
										local19 = anIntArray342[--anInt5986];
										aStringArray23[anInt5984++] = local4042 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt5984 -= 2;
										local4042 = aStringArray23[anInt5984];
										local1161 = aStringArray23[anInt5984 + 1];
										aStringArray23[anInt5984++] = local4042 + local1161;
										return;
									}
									if (arg0 == 4102) {
										local4042 = aStringArray23[--anInt5984];
										local19 = anIntArray342[--anInt5986];
										aStringArray23[anInt5984++] = local4042 + Static390.method6425(local19, true);
										return;
									}
									if (arg0 == 4103) {
										local4042 = aStringArray23[--anInt5984];
										aStringArray23[anInt5984++] = local4042.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray23[anInt5984++] = method5157(anIntArray342[--anInt5986]);
										return;
									}
									if (arg0 == 4105) {
										anInt5984 -= 2;
										local4042 = aStringArray23[anInt5984];
										local1161 = aStringArray23[anInt5984 + 1];
										if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1 != null && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1.aBoolean550) {
											aStringArray23[anInt5984++] = local1161;
											return;
										}
										aStringArray23[anInt5984++] = local4042;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray342[--anInt5986];
										aStringArray23[anInt5984++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt5984 -= 2;
										anIntArray342[anInt5986++] = Static613.method8964(aStringArray23[anInt5984 + 1], Static476.anInt8915, aStringArray23[anInt5984]);
										return;
									}
									@Pc(8174) Class239 local8174;
									if (arg0 == 4108) {
										local4042 = aStringArray23[--anInt5984];
										anInt5986 -= 2;
										local19 = anIntArray342[anInt5986];
										local25 = anIntArray342[anInt5986 + 1];
										local8174 = Static48.method1704(local25, Static348.aClass157_177);
										anIntArray342[anInt5986++] = local8174.method6489(Static38.aClass46Array2, local4042, local19);
										return;
									}
									if (arg0 == 4109) {
										local4042 = aStringArray23[--anInt5984];
										anInt5986 -= 2;
										local19 = anIntArray342[anInt5986];
										local25 = anIntArray342[anInt5986 + 1];
										local8174 = Static48.method1704(local25, Static348.aClass157_177);
										anIntArray342[anInt5986++] = local8174.method6486(local4042, local19, Static38.aClass46Array2);
										return;
									}
									if (arg0 == 4110) {
										anInt5984 -= 2;
										local4042 = aStringArray23[anInt5984];
										local1161 = aStringArray23[anInt5984 + 1];
										if (anIntArray342[--anInt5986] == 1) {
											aStringArray23[anInt5984++] = local4042;
											return;
										}
										aStringArray23[anInt5984++] = local1161;
										return;
									}
									if (arg0 == 4111) {
										local4042 = aStringArray23[--anInt5984];
										aStringArray23[anInt5984++] = Static621.method9056(local4042);
										return;
									}
									if (arg0 == 4112) {
										local4042 = aStringArray23[--anInt5984];
										local19 = anIntArray342[--anInt5986];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray23[anInt5984++] = local4042 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = method5156((char) local13);
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static149.method3404((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static498.method7727((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static104.method2670((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local4042 = aStringArray23[--anInt5984];
										if (local4042 != null) {
											anIntArray342[anInt5986++] = local4042.length();
											return;
										}
										anIntArray342[anInt5986++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local4042 = aStringArray23[--anInt5984];
										anInt5986 -= 2;
										local19 = anIntArray342[anInt5986];
										local25 = anIntArray342[anInt5986 + 1];
										aStringArray23[anInt5984++] = local4042.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local4042 = aStringArray23[--anInt5984];
										@Pc(8532) StringBuffer local8532 = new StringBuffer(local4042.length());
										@Pc(8534) boolean local8534 = false;
										for (local357 = 0; local357 < local4042.length(); local357++) {
											@Pc(8541) char local8541 = local4042.charAt(local357);
											if (local8541 == '<') {
												local8534 = true;
											} else if (local8541 == '>') {
												local8534 = false;
											} else if (!local8534) {
												local8532.append(local8541);
											}
										}
										aStringArray23[anInt5984++] = local8532.toString();
										return;
									}
									if (arg0 == 4120) {
										local4042 = aStringArray23[--anInt5984];
										anInt5986 -= 2;
										local19 = anIntArray342[anInt5986];
										local25 = anIntArray342[anInt5986 + 1];
										anIntArray342[anInt5986++] = local4042.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt5984 -= 2;
										local4042 = aStringArray23[anInt5984];
										local1161 = aStringArray23[anInt5984 + 1];
										local25 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = local4042.indexOf(local1161, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local420 = anIntArray342[--anInt5986] != 0;
										local19 = anIntArray342[--anInt5986];
										aStringArray23[anInt5984++] = Static136.method3074(0, local420, Static476.anInt8915, (long) local19);
										return;
									}
									if (arg0 == 4125) {
										local4042 = aStringArray23[--anInt5984];
										local19 = anIntArray342[--anInt5986];
										@Pc(8755) Class239 local8755 = Static48.method1704(local19, Static348.aClass157_177);
										anIntArray342[anInt5986++] = local8755.method6485(local4042, Static38.aClass46Array2);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray342[--anInt5986];
										aStringArray23[anInt5984++] = Static635.aClass336_2.method8424(local13).aString97;
										return;
									}
									@Pc(8817) Class301 local8817;
									if (arg0 == 4201) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local8817 = Static635.aClass336_2.method8424(local13);
										if (local19 >= 1 && local19 <= 5 && local8817.aStringArray40[local19 - 1] != null) {
											aStringArray23[anInt5984++] = local8817.aStringArray40[local19 - 1];
											return;
										}
										aStringArray23[anInt5984++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local8817 = Static635.aClass336_2.method8424(local13);
										if (local19 >= 1 && local19 <= 5 && local8817.aStringArray39[local19 - 1] != null) {
											aStringArray23[anInt5984++] = local8817.aStringArray39[local19 - 1];
											return;
										}
										aStringArray23[anInt5984++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static635.aClass336_2.method8424(local13).anInt9218;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static635.aClass336_2.method8424(local13).anInt9219 == 1 ? 1 : 0;
										return;
									}
									@Pc(8980) Class301 local8980;
									if (arg0 == 4205) {
										local13 = anIntArray342[--anInt5986];
										local8980 = Static635.aClass336_2.method8424(local13);
										if (local8980.anInt9230 == -1 && local8980.anInt9171 >= 0) {
											anIntArray342[anInt5986++] = local8980.anInt9171;
											return;
										}
										anIntArray342[anInt5986++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray342[--anInt5986];
										local8980 = Static635.aClass336_2.method8424(local13);
										if (local8980.anInt9230 >= 0 && local8980.anInt9171 >= 0) {
											anIntArray342[anInt5986++] = local8980.anInt9171;
											return;
										}
										anIntArray342[anInt5986++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static635.aClass336_2.method8424(local13).aBoolean661 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local3107 = Static229.aClass70_1.method2496(local19);
										if (local3107.method8409()) {
											aStringArray23[anInt5984++] = Static635.aClass336_2.method8424(local13).method7707(local3107.aString102, local19);
											return;
										}
										anIntArray342[anInt5986++] = Static635.aClass336_2.method8424(local13).method7713(local3107.anInt10093, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1] - 1;
										local8817 = Static635.aClass336_2.method8424(local13);
										if (local8817.anInt9176 == local19) {
											anIntArray342[anInt5986++] = local8817.anInt9217;
											return;
										}
										if (local8817.anInt9181 == local19) {
											anIntArray342[anInt5986++] = local8817.anInt9216;
											return;
										}
										anIntArray342[anInt5986++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local4042 = aStringArray23[--anInt5984];
										local19 = anIntArray342[--anInt5986];
										Static500.method7735(local19 == 1, local4042);
										anIntArray342[anInt5986++] = Static305.anInt6352;
										return;
									}
									if (arg0 == 4211) {
										if (Static468.aShortArray116 != null && Static396.anInt7578 < Static305.anInt6352) {
											anIntArray342[anInt5986++] = Static468.aShortArray116[Static396.anInt7578++] & 0xFFFF;
											return;
										}
										anIntArray342[anInt5986++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static396.anInt7578 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray342[--anInt5986];
										anIntArray342[anInt5986++] = Static635.aClass336_2.method8424(local13).anInt9203;
										return;
									}
									if (arg0 == 4214) {
										local4042 = aStringArray23[--anInt5984];
										anInt5986 -= 3;
										local19 = anIntArray342[anInt5986];
										local25 = anIntArray342[anInt5986 + 1];
										local357 = anIntArray342[anInt5986 + 2];
										Static207.method4089(local357, local19 == 1, local4042, local25);
										anIntArray342[anInt5986++] = Static305.anInt6352;
										return;
									}
									if (arg0 == 4215) {
										anInt5984 -= 2;
										anInt5986 -= 2;
										local4042 = aStringArray23[anInt5984];
										local19 = anIntArray342[anInt5986];
										local25 = anIntArray342[anInt5986 + 1];
										@Pc(9379) String local9379 = aStringArray23[anInt5984 + 1];
										Static15.method315(local19 == 1, local4042, local9379, local25);
										anIntArray342[anInt5986++] = Static305.anInt6352;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local3107 = Static229.aClass70_1.method2496(local19);
										if (local3107.method8409()) {
											aStringArray23[anInt5984++] = Static462.aClass355_2.method8744(local13).method734(local19, local3107.aString102);
											return;
										}
										anIntArray342[anInt5986++] = Static462.aClass355_2.method8744(local13).method738(local3107.anInt10093, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local3107 = Static229.aClass70_1.method2496(local19);
										if (local3107.method8409()) {
											aStringArray23[anInt5984++] = Static27.aClass342_3.method8534(local13).method4601(local3107.aString102, local19);
											return;
										}
										anIntArray342[anInt5986++] = Static27.aClass342_3.method8534(local13).method4613(local19, local3107.anInt10093);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt5986 -= 2;
										local13 = anIntArray342[anInt5986];
										local19 = anIntArray342[anInt5986 + 1];
										local3107 = Static229.aClass70_1.method2496(local19);
										if (local3107.method8409()) {
											aStringArray23[anInt5984++] = Static384.aClass173_1.method5117(local13).method827(local3107.aString102, local19);
											return;
										}
										anIntArray342[anInt5986++] = Static384.aClass173_1.method5117(local13).method823(local19, local3107.anInt10093);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray342[--anInt5986];
									@Pc(9607) Class311 local9607 = Static415.aClass340_1.method8512(local13);
									if (local9607.anIntArray611 != null && local9607.anIntArray611.length > 0) {
										local25 = 0;
										local357 = local9607.anIntArray612[0];
										for (local2373 = 1; local2373 < local9607.anIntArray611.length; local2373++) {
											if (local9607.anIntArray612[local2373] > local357) {
												local25 = local2373;
												local357 = local9607.anIntArray612[local2373];
											}
										}
										anIntArray342[anInt5986++] = local9607.anIntArray611[local25];
										return;
									}
									anIntArray342[anInt5986++] = local9607.anInt9388;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static87.method8101(anIntArray342[--anInt5986]);
					} else {
						local137 = arg1 ? aClass24_12 : aClass24_11;
					}
					Static553.method8248(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt5986 -= 2;
						local19 = anIntArray342[anInt5986];
						local25 = anIntArray342[anInt5986 + 1];
						if (local137.anInt439 == -1) {
							Static298.method5321(local137.anInt510);
							Static438.method6944(local137.anInt510);
							Static478.method7487(local137.anInt510);
						}
						if (local19 == -1) {
							local137.anInt478 = 1;
							local137.anInt466 = -1;
							local137.anInt501 = -1;
							return;
						}
						local137.anInt501 = local19;
						local137.anInt483 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean31 = true;
						} else {
							local137.aBoolean31 = false;
						}
						@Pc(1713) Class301 local1713 = Static635.aClass336_2.method8424(local19);
						local137.anInt469 = local1713.anInt9191;
						local137.anInt424 = local1713.anInt9187;
						local137.anInt447 = local1713.anInt9211;
						local137.anInt499 = local1713.anInt9185;
						local137.anInt485 = local1713.anInt9224;
						local137.anInt446 = local1713.anInt9223;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt425 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt425 = 1;
						} else {
							local137.anInt425 = 2;
						}
						if (local137.anInt492 > 0) {
							local137.anInt446 = local137.anInt446 * 32 / local137.anInt492;
							return;
						}
						if (local137.anInt515 > 0) {
							local137.anInt446 = local137.anInt446 * 32 / local137.anInt515;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt478 = 2;
						local137.anInt466 = anIntArray342[--anInt5986];
						if (local137.anInt439 == -1) {
							Static161.method6634(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt478 = 3;
						local137.anInt466 = -1;
						if (local137.anInt439 == -1) {
							Static161.method6634(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt478 = 6;
						local137.anInt466 = anIntArray342[--anInt5986];
						if (local137.anInt439 == -1) {
							Static161.method6634(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt478 = 5;
						local137.anInt466 = anIntArray342[--anInt5986];
						if (local137.anInt439 == -1) {
							Static161.method6634(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt5986 -= 4;
						local137.anInt440 = anIntArray342[anInt5986];
						local137.anInt423 = anIntArray342[anInt5986 + 1];
						local137.anInt458 = anIntArray342[anInt5986 + 2];
						local137.anInt430 = anIntArray342[anInt5986 + 3];
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt5986 -= 2;
						local137.anInt471 = anIntArray342[anInt5986];
						local137.anInt512 = anIntArray342[anInt5986 + 1];
						Static553.method8248(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt5986 -= 4;
						local137.anInt466 = anIntArray342[anInt5986];
						local137.anInt482 = anIntArray342[anInt5986 + 1];
						if (anIntArray342[anInt5986 + 2] == 1) {
							local137.anInt478 = 9;
						} else {
							local137.anInt478 = 8;
						}
						if (anIntArray342[anInt5986 + 3] == 1) {
							local137.aBoolean31 = true;
						} else {
							local137.aBoolean31 = false;
						}
						if (local137.anInt439 == -1) {
							Static161.method6634(local137.anInt510);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt478 = 5;
						local137.anInt466 = Static569.anInt10211;
						local137.anInt482 = 0;
						if (local137.anInt439 == -1) {
							Static161.method6634(local137.anInt510);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static87.method8101(anIntArray342[--anInt5986]);
				} else {
					local137 = arg1 ? aClass24_12 : aClass24_11;
				}
				if (arg0 == 1000) {
					anInt5986 -= 4;
					local137.anInt487 = anIntArray342[anInt5986];
					local137.anInt461 = anIntArray342[anInt5986 + 1];
					local19 = anIntArray342[anInt5986 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray342[anInt5986 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte9 = (byte) local19;
					local137.aByte6 = (byte) local25;
					Static553.method8248(local137);
					Static357.method6063(local137);
					if (local137.anInt439 == -1) {
						Static252.method4682(local137.anInt510);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt5986 -= 4;
					local137.anInt515 = anIntArray342[anInt5986];
					local137.anInt454 = anIntArray342[anInt5986 + 1];
					local137.anInt492 = 0;
					local137.anInt506 = 0;
					local19 = anIntArray342[anInt5986 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray342[anInt5986 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte8 = (byte) local19;
					local137.aByte7 = (byte) local25;
					Static553.method8248(local137);
					Static357.method6063(local137);
					if (local137.anInt480 == 0) {
						Static553.method8245(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray342[--anInt5986] == 1;
					if (local137.aBoolean43 != local661) {
						local137.aBoolean43 = local661;
						Static553.method8248(local137);
					}
					if (local137.anInt439 == -1) {
						Static350.method5960(local137.anInt510);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt5986 -= 2;
					local137.anInt442 = anIntArray342[anInt5986];
					local137.anInt481 = anIntArray342[anInt5986 + 1];
					Static553.method8248(local137);
					Static357.method6063(local137);
					if (local137.anInt480 == 0) {
						Static553.method8245(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean38 = anIntArray342[--anInt5986] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!jk;I)V")
	private static void method5159(@OriginalArg(0) Class2_Sub6_Sub11 arg0, @OriginalArg(1) int arg1) {
		anInt5986 = 0;
		anInt5984 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray326;
		@Pc(11) int[] local11 = arg0.anIntArray325;
		@Pc(13) byte local13 = -1;
		anInt5974 = 0;
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
						method5158(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method5152(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray342[anInt5986++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray342[anInt5986++] = Static286.aClass263_3.anIntArray530[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static286.aClass263_3.method6855(anIntArray342[--anInt5986], local54);
					} else if (local31 == 3) {
						aStringArray23[anInt5984++] = arg0.aStringArray22[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt5986 -= 2;
						if (anIntArray342[anInt5986] != anIntArray342[anInt5986 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt5986 -= 2;
						if (anIntArray342[anInt5986] == anIntArray342[anInt5986 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt5986 -= 2;
						if (anIntArray342[anInt5986] < anIntArray342[anInt5986 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt5986 -= 2;
						if (anIntArray342[anInt5986] > anIntArray342[anInt5986 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt5974 == 0) {
							return;
						}
						@Pc(216) Class276 local216 = aClass276Array1[--anInt5974];
						arg0 = local216.aClass2_Sub6_Sub11_1;
						local8 = arg0.anIntArray326;
						local11 = arg0.anIntArray325;
						local5 = local216.anInt8396;
						anIntArray343 = local216.anIntArray550;
						aStringArray24 = local216.aStringArray37;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray342[anInt5986++] = Static286.aClass263_3.method6853(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static286.aClass263_3.method6856(local54, anIntArray342[--anInt5986]);
					} else if (local31 == 31) {
						anInt5986 -= 2;
						if (anIntArray342[anInt5986] <= anIntArray342[anInt5986 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt5986 -= 2;
						if (anIntArray342[anInt5986] >= anIntArray342[anInt5986 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray342[anInt5986++] = anIntArray343[local11[local5]];
					} else if (local31 == 34) {
						anIntArray343[local11[local5]] = anIntArray342[--anInt5986];
					} else if (local31 == 35) {
						aStringArray23[anInt5984++] = aStringArray24[local11[local5]];
					} else if (local31 == 36) {
						aStringArray24[local11[local5]] = aStringArray23[--anInt5984];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt5984 -= local54;
						@Pc(400) String local400 = Static422.method6798(local54, aStringArray23, anInt5984);
						aStringArray23[anInt5984++] = local400;
					} else if (local31 == 38) {
						anInt5986--;
					} else if (local31 == 39) {
						anInt5984--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub6_Sub11 local436 = Static94.method7632(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt5667];
							@Pc(450) String[] local450 = new String[local436.anInt5668];
							for (local452 = 0; local452 < local436.anInt5670; local452++) {
								local446[local452] = anIntArray342[anInt5986 + local452 - local436.anInt5670];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt5669; local471++) {
								local450[local471] = aStringArray23[anInt5984 + local471 - local436.anInt5669];
							}
							anInt5986 -= local436.anInt5670;
							anInt5984 -= local436.anInt5669;
							@Pc(502) Class276 local502 = new Class276();
							local502.aClass2_Sub6_Sub11_1 = arg0;
							local502.anInt8396 = local5;
							local502.anIntArray550 = anIntArray343;
							local502.aStringArray37 = aStringArray24;
							if (anInt5974 >= aClass276Array1.length) {
								throw new RuntimeException();
							}
							aClass276Array1[anInt5974++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray326;
							local11 = local436.anIntArray325;
							local5 = -1;
							anIntArray343 = local446;
							aStringArray24 = local450;
						} else if (local31 == 42) {
							anIntArray342[anInt5986++] = Static306.anIntArray372[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static306.anIntArray372[local54] = anIntArray342[--anInt5986];
							Static521.method7895(local54);
							Static453.aBoolean599 |= Static544.aBooleanArray25[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray342[--anInt5986];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray344[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray30[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray342[--anInt5986];
							if (local603 < 0 || local603 >= anIntArray344[local54]) {
								throw new RuntimeException();
							}
							anIntArray342[anInt5986++] = anIntArrayArray30[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt5986 -= 2;
							local603 = anIntArray342[anInt5986];
							if (local603 < 0 || local603 >= anIntArray344[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray30[local54][local603] = anIntArray342[anInt5986 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static443.aStringArray36[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray23[anInt5984++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static443.aStringArray36[local54] = aStringArray23[--anInt5984];
							Static28.method685(local54);
						} else if (local31 == 51) {
							@Pc(774) Class99 local774 = arg0.aClass99Array1[local11[local5]];
							@Pc(787) Class2_Sub43 local787 = (Class2_Sub43) local774.method3056((long) anIntArray342[--anInt5986]);
							if (local787 != null) {
								local5 += local787.anInt9046;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString57 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong278).append(" ");
				for (local603 = anInt5974 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass276Array1[local603].aClass2_Sub6_Sub11_1.aLong278).append(" ");
				}
				local856.append("op: ").append(local13);
				Static408.method6625(local856.toString(), local837);
			} else {
				Static271.method9045("Clientscript error in: " + arg0.aString57);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString57).append("\n");
				for (local603 = anInt5974 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass276Array1[local603].aClass2_Sub6_Sub11_1.aString57).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static408.method6625(local856.toString(), local837);
				Static300.method2224(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!rk;I)V")
	private static void method5160(@OriginalArg(0) Class2_Sub44 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray32;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub6_Sub11 local12 = Static94.method7632(local8);
		if (local12 == null) {
			return;
		}
		anIntArray343 = new int[local12.anInt5667];
		@Pc(21) int local21 = 0;
		aStringArray24 = new String[local12.anInt5668];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt9077;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt9083;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass24_15 == null ? -1 : arg0.aClass24_15.anInt510;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt9079;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass24_15 == null ? -1 : arg0.aClass24_15.anInt439;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass24_14 == null ? -1 : arg0.aClass24_14.anInt510;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass24_14 == null ? -1 : arg0.aClass24_14.anInt439;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt9081;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt9076;
				}
				anIntArray343[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString96;
				}
				aStringArray24[local27++] = local135;
			}
		}
		anInt5987 = arg0.anInt9080;
		method5159(local12, arg1);
	}

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "(I)V")
	private static void method5162(@OriginalArg(0) int arg0) {
		@Pc(3) Class24 local3 = Static87.method8101(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class24[] local13 = Static410.aClass24ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class24[] local19 = Static631.aClass24ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static410.aClass24ArrayArray1[local9] = new Class24[local22];
			Static653.method7721(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static653.method7721(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(IZ)V")
	public static void method5163() {
	}
}
