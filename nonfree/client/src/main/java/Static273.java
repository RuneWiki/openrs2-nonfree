import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[I")
	private static int[] anIntArray332;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!tp;")
	private static Class331 aClass331_9;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!tp;")
	private static Class331 aClass331_10;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Lclient!wu;")
	private static Class377 aClass377_1;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray14;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lclient!pu;")
	private static final Class266[] aClass266Array1 = new Class266[50];

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	private static int anInt5745 = 0;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
	private static final int[] anIntArray333 = new int[1000];

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13 = new String[1000];

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "[I")
	private static final int[] anIntArray334 = new int[5];

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
	private static int anInt5748 = 0;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "[[I")
	private static final int[][] anIntArrayArray31 = new int[5][5000];

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
	private static int anInt5756 = 0;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray15 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "[I")
	private static final int[] anIntArray335 = new int[3];

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "Lclient!of;")
	public static final Class236 aClass236_52 = new Class236(4);

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
	private static int anInt5757 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	private static void method4686(@OriginalArg(0) int arg0) {
		@Pc(3) Class331 local3 = Static178.method3435(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class331[] local13 = Static21.aClass331ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class331[] local19 = Static368.aClass331ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static21.aClass331ArrayArray1[local9] = new Class331[local22];
			Static649.method5530(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static649.method5530(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V")
	private static void method4687(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class8_Sub31 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray333[anInt5745++] = Static446.anInt7846;
				return;
			}
			if (arg0 == 5001) {
				anInt5745 -= 3;
				Static446.anInt7846 = anIntArray333[anInt5745];
				Static520.aClass251_10 = Static130.method2873(anIntArray333[anInt5745 + 1]);
				if (Static520.aClass251_10 == null) {
					Static520.aClass251_10 = Static80.aClass251_11;
				}
				Static19.anInt3640 = anIntArray333[anInt5745 + 2];
				local52 = Static51.method1418(Static634.aClass257_103, Static608.aClass336_1);
				local52.aClass8_Sub8_Sub2_1.method8562(Static446.anInt7846);
				local52.aClass8_Sub8_Sub2_1.method8562(Static520.aClass251_10.anInt7941);
				local52.aClass8_Sub8_Sub2_1.method8562(Static19.anInt3640);
				Static262.method4604(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt5748 -= 2;
				local83 = aStringArray13[anInt5748];
				local89 = aStringArray13[anInt5748 + 1];
				anInt5745 -= 2;
				local97 = anIntArray333[anInt5745];
				local103 = anIntArray333[anInt5745 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class8_Sub31 local125 = Static51.method1418(Static571.aClass257_110, Static608.aClass336_1);
				local125.aClass8_Sub8_Sub2_1.method8562(Static643.method8631(local83) + Static643.method8631(local89) + 2);
				local125.aClass8_Sub8_Sub2_1.method8582(local83);
				local125.aClass8_Sub8_Sub2_1.method8562(local97 - 1);
				local125.aClass8_Sub8_Sub2_1.method8562(local103);
				local125.aClass8_Sub8_Sub2_1.method8582(local89);
				Static262.method4604(local125);
				return;
			}
			@Pc(179) Class57 local179;
			if (arg0 == 5003) {
				local175 = anIntArray333[--anInt5745];
				local179 = Static640.method8615(local175);
				local181 = "";
				if (local179 != null && local179.aString23 != null) {
					local181 = local179.aString23;
				}
				aStringArray13[anInt5748++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray333[--anInt5745];
				local179 = Static640.method8615(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2177;
				}
				anIntArray333[anInt5745++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static520.aClass251_10 == null) {
					anIntArray333[anInt5745++] = -1;
					return;
				}
				anIntArray333[anInt5745++] = Static520.aClass251_10.anInt7941;
				return;
			}
			@Pc(269) Class8_Sub31 local269;
			if (arg0 == 5006) {
				local175 = anIntArray333[--anInt5745];
				local269 = Static51.method1418(Static444.aClass257_85, Static608.aClass336_1);
				local269.aClass8_Sub8_Sub2_1.method8562(local175);
				Static262.method4604(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray13[--anInt5748];
				method4688(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt5748 -= 2;
				local83 = aStringArray13[anInt5748];
				local89 = aStringArray13[anInt5748 + 1];
				if (Static190.anInt7431 != 0 || (!Static408.aBoolean563 || Static599.aBoolean732) && !Static321.aBoolean449) {
					@Pc(328) Class8_Sub31 local328 = Static51.method1418(Static223.aClass257_115, Static608.aClass336_1);
					local328.aClass8_Sub8_Sub2_1.method8562(0);
					local103 = local328.aClass8_Sub8_Sub2_1.anInt10588;
					local328.aClass8_Sub8_Sub2_1.method8582(local83);
					Static128.method2843(local328.aClass8_Sub8_Sub2_1, local89);
					local328.aClass8_Sub8_Sub2_1.method8536(local328.aClass8_Sub8_Sub2_1.anInt10588 - local103);
					Static262.method4604(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray333[--anInt5745];
				local179 = Static640.method8615(local175);
				local181 = "";
				if (local179 != null && local179.aString22 != null) {
					local181 = local179.aString22;
				}
				aStringArray13[anInt5748++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray333[--anInt5745];
				local179 = Static640.method8615(local175);
				local181 = "";
				if (local179 != null && local179.aString21 != null) {
					local181 = local179.aString21;
				}
				aStringArray13[anInt5748++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray333[--anInt5745];
				local179 = Static640.method8615(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2175;
				}
				anIntArray333[anInt5745++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 == null || Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aString36 == null) {
					local83 = "";
				} else {
					local83 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method2759();
				}
				aStringArray13[anInt5748++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray333[anInt5745++] = Static19.anInt3640;
				return;
			}
			if (arg0 == 5017) {
				anIntArray333[anInt5745++] = Static319.method5218();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray333[--anInt5745];
				local179 = Static640.method8615(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt2178;
				}
				anIntArray333[anInt5745++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray333[--anInt5745];
				local179 = Static640.method8615(local175);
				local181 = "";
				if (local179 != null && local179.aString20 != null) {
					local181 = local179.aString20;
				}
				aStringArray13[anInt5748++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 == null || Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aString36 == null) {
					local83 = "";
				} else {
					local83 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method2762();
				}
				aStringArray13[anInt5748++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray333[--anInt5745];
				local179 = Static640.method8615(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2176;
				}
				anIntArray333[anInt5745++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray333[--anInt5745];
				local179 = Static640.method8615(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2180;
				}
				anIntArray333[anInt5745++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray333[--anInt5745];
				local179 = Static640.method8615(local175);
				local181 = "";
				if (local179 != null && local179.aString24 != null) {
					local181 = local179.aString24;
				}
				aStringArray13[anInt5748++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray333[--anInt5745];
				aStringArray13[anInt5748++] = Static240.aClass208_1.method5471(local175).aString9;
				return;
			}
			@Pc(736) Class8_Sub5_Sub2 local736;
			if (arg0 == 5051) {
				local175 = anIntArray333[--anInt5745];
				local736 = Static240.aClass208_1.method5471(local175);
				if (local736.anIntArray39 == null) {
					anIntArray333[anInt5745++] = 0;
					return;
				}
				anIntArray333[anInt5745++] = local736.anIntArray39.length;
				return;
			}
			if (arg0 == 5052) {
				anInt5745 -= 2;
				local175 = anIntArray333[anInt5745];
				local776 = anIntArray333[anInt5745 + 1];
				@Pc(781) Class8_Sub5_Sub2 local781 = Static240.aClass208_1.method5471(local175);
				local103 = local781.anIntArray39[local776];
				anIntArray333[anInt5745++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray333[--anInt5745];
				local736 = Static240.aClass208_1.method5471(local175);
				if (local736.anIntArray38 == null) {
					anIntArray333[anInt5745++] = 0;
					return;
				}
				anIntArray333[anInt5745++] = local736.anIntArray38.length;
				return;
			}
			if (arg0 == 5054) {
				anInt5745 -= 2;
				local175 = anIntArray333[anInt5745];
				local776 = anIntArray333[anInt5745 + 1];
				anIntArray333[anInt5745++] = Static240.aClass208_1.method5471(local175).anIntArray38[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray333[--anInt5745];
				aStringArray13[anInt5748++] = Static105.aClass49_1.method1677(local175).method7705();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray333[--anInt5745];
				@Pc(907) Class8_Sub5_Sub17 local907 = Static105.aClass49_1.method1677(local175);
				if (local907.anIntArray518 == null) {
					anIntArray333[anInt5745++] = 0;
					return;
				}
				anIntArray333[anInt5745++] = local907.anIntArray518.length;
				return;
			}
			if (arg0 == 5057) {
				anInt5745 -= 2;
				local175 = anIntArray333[anInt5745];
				local776 = anIntArray333[anInt5745 + 1];
				anIntArray333[anInt5745++] = Static105.aClass49_1.method1677(local175).anIntArray518[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass377_1 = new Class377();
				aClass377_1.anInt10684 = anIntArray333[--anInt5745];
				aClass377_1.aClass8_Sub5_Sub17_1 = Static105.aClass49_1.method1677(aClass377_1.anInt10684);
				aClass377_1.anIntArray625 = new int[aClass377_1.aClass8_Sub5_Sub17_1.method7707()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static51.method1418(Static364.aClass257_67, Static608.aClass336_1);
				local52.aClass8_Sub8_Sub2_1.method8562(0);
				local776 = local52.aClass8_Sub8_Sub2_1.anInt10588;
				local52.aClass8_Sub8_Sub2_1.method8562(0);
				local52.aClass8_Sub8_Sub2_1.method8548(aClass377_1.anInt10684);
				aClass377_1.aClass8_Sub5_Sub17_1.method7706(local52.aClass8_Sub8_Sub2_1, aClass377_1.anIntArray625);
				local52.aClass8_Sub8_Sub2_1.method8536(local52.aClass8_Sub8_Sub2_1.anInt10588 - local776);
				Static262.method4604(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray13[--anInt5748];
				local269 = Static51.method1418(Static566.aClass257_108, Static608.aClass336_1);
				local269.aClass8_Sub8_Sub2_1.method8562(0);
				local97 = local269.aClass8_Sub8_Sub2_1.anInt10588;
				local269.aClass8_Sub8_Sub2_1.method8582(local83);
				local269.aClass8_Sub8_Sub2_1.method8548(aClass377_1.anInt10684);
				aClass377_1.aClass8_Sub5_Sub17_1.method7706(local269.aClass8_Sub8_Sub2_1, aClass377_1.anIntArray625);
				local269.aClass8_Sub8_Sub2_1.method8536(local269.aClass8_Sub8_Sub2_1.anInt10588 - local97);
				Static262.method4604(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static51.method1418(Static364.aClass257_67, Static608.aClass336_1);
				local52.aClass8_Sub8_Sub2_1.method8562(0);
				local776 = local52.aClass8_Sub8_Sub2_1.anInt10588;
				local52.aClass8_Sub8_Sub2_1.method8562(1);
				local52.aClass8_Sub8_Sub2_1.method8548(aClass377_1.anInt10684);
				aClass377_1.aClass8_Sub5_Sub17_1.method7706(local52.aClass8_Sub8_Sub2_1, aClass377_1.anIntArray625);
				local52.aClass8_Sub8_Sub2_1.method8536(local52.aClass8_Sub8_Sub2_1.anInt10588 - local776);
				Static262.method4604(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt5745 -= 2;
				local175 = anIntArray333[anInt5745];
				local776 = anIntArray333[anInt5745 + 1];
				anIntArray333[anInt5745++] = Static240.aClass208_1.method5471(local175).aCharArray1[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt5745 -= 2;
				local175 = anIntArray333[anInt5745];
				local776 = anIntArray333[anInt5745 + 1];
				anIntArray333[anInt5745++] = Static240.aClass208_1.method5471(local175).aCharArray2[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt5745 -= 2;
				local175 = anIntArray333[anInt5745];
				local776 = anIntArray333[anInt5745 + 1];
				if (local776 == -1) {
					anIntArray333[anInt5745++] = -1;
					return;
				}
				anIntArray333[anInt5745++] = Static240.aClass208_1.method5471(local175).method1113((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt5745 -= 2;
				local175 = anIntArray333[anInt5745];
				local776 = anIntArray333[anInt5745 + 1];
				if (local776 == -1) {
					anIntArray333[anInt5745++] = -1;
					return;
				}
				anIntArray333[anInt5745++] = Static240.aClass208_1.method5471(local175).method1109((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray333[--anInt5745];
				anIntArray333[anInt5745++] = Static105.aClass49_1.method1677(local175).method7707();
				return;
			}
			if (arg0 == 5067) {
				anInt5745 -= 2;
				local175 = anIntArray333[anInt5745];
				local776 = anIntArray333[anInt5745 + 1];
				local97 = Static105.aClass49_1.method1677(local175).method7713(local776).anInt9106;
				anIntArray333[anInt5745++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt5745 -= 2;
				local175 = anIntArray333[anInt5745];
				local776 = anIntArray333[anInt5745 + 1];
				aClass377_1.anIntArray625[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt5745 -= 2;
				local175 = anIntArray333[anInt5745];
				local776 = anIntArray333[anInt5745 + 1];
				aClass377_1.anIntArray625[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt5745 -= 3;
				local175 = anIntArray333[anInt5745];
				local776 = anIntArray333[anInt5745 + 1];
				local97 = anIntArray333[anInt5745 + 2];
				@Pc(1448) Class8_Sub5_Sub17 local1448 = Static105.aClass49_1.method1677(local175);
				if (local1448.method7713(local776).anInt9106 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray333[anInt5745++] = local1448.method7711(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray13[--anInt5748];
				local1496 = anIntArray333[--anInt5745] == 1;
				Static386.method6168(local1496, local83);
				anIntArray333[anInt5745++] = Static474.anInt8507;
				return;
			}
			if (arg0 == 5072) {
				if (Static621.aShortArray148 != null && Static169.anInt4129 < Static474.anInt8507) {
					anIntArray333[anInt5745++] = Static621.aShortArray148[Static169.anInt4129++] & 0xFFFF;
					return;
				}
				anIntArray333[anInt5745++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static169.anInt4129 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static295.aClass209_1.method5482(86)) {
					anIntArray333[anInt5745++] = 1;
					return;
				}
				anIntArray333[anInt5745++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static295.aClass209_1.method5482(82)) {
					anIntArray333[anInt5745++] = 1;
					return;
				}
				anIntArray333[anInt5745++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static295.aClass209_1.method5482(81)) {
					anIntArray333[anInt5745++] = 1;
					return;
				}
				anIntArray333[anInt5745++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static644.method8642(anIntArray333[--anInt5745]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray333[anInt5745++] = Static288.method3438();
					return;
				}
				if (arg0 == 5205) {
					Static252.method4539(-1, anIntArray333[--anInt5745], -1, false);
					return;
				}
				@Pc(1696) Class8_Sub5_Sub4 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray333[--anInt5745];
					local1696 = Static110.method6399(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray333[anInt5745++] = -1;
						return;
					}
					anIntArray333[anInt5745++] = local1696.anInt2512;
					return;
				}
				@Pc(1729) Class8_Sub5_Sub4 local1729;
				if (arg0 == 5207) {
					local1729 = Static110.method6392(anIntArray333[--anInt5745]);
					if (local1729 != null && local1729.aString27 != null) {
						aStringArray13[anInt5748++] = local1729.aString27;
						return;
					}
					aStringArray13[anInt5748++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray333[anInt5745++] = Static407.anInt7789;
					anIntArray333[anInt5745++] = Class15_Sub1_Sub4_Sub2.lb;
					return;
				}
				if (arg0 == 5209) {
					anIntArray333[anInt5745++] = Static227.anInt5187 + Static110.anInt7708;
					anIntArray333[anInt5745++] = Static561.anInt9691 + Static110.anInt7703;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray333[--anInt5745];
					local1696 = Static110.method6392(local175);
					if (local1696 == null) {
						anIntArray333[anInt5745++] = 0;
						anIntArray333[anInt5745++] = 0;
						return;
					}
					anIntArray333[anInt5745++] = local1696.anInt2505 >> 14 & 0x3FFF;
					anIntArray333[anInt5745++] = local1696.anInt2505 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray333[--anInt5745];
					local1696 = Static110.method6392(local175);
					if (local1696 == null) {
						anIntArray333[anInt5745++] = 0;
						anIntArray333[anInt5745++] = 0;
						return;
					}
					anIntArray333[anInt5745++] = local1696.anInt2506 - local1696.anInt2514;
					anIntArray333[anInt5745++] = local1696.anInt2515 - local1696.anInt2508;
					return;
				}
				@Pc(1919) Class8_Sub35 local1919;
				if (arg0 == 5212) {
					local1919 = Static490.method7185();
					if (local1919 == null) {
						anIntArray333[anInt5745++] = -1;
						anIntArray333[anInt5745++] = -1;
						return;
					}
					anIntArray333[anInt5745++] = local1919.anInt6533;
					local776 = local1919.anInt6535 << 28 | local1919.anInt6532 + Static110.anInt7708 << 14 | local1919.anInt6536 + Static110.anInt7703;
					anIntArray333[anInt5745++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static379.method6033();
					if (local1919 == null) {
						anIntArray333[anInt5745++] = -1;
						anIntArray333[anInt5745++] = -1;
						return;
					}
					anIntArray333[anInt5745++] = local1919.anInt6533;
					local776 = local1919.anInt6535 << 28 | local1919.anInt6532 + Static110.anInt7708 << 14 | local1919.anInt6536 + Static110.anInt7703;
					anIntArray333[anInt5745++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray333[--anInt5745];
					local1696 = Static329.method5389();
					if (local1696 != null) {
						local2067 = local1696.method2131(local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray335);
						if (local2067) {
							Static220.method4148(anIntArray335[1], anIntArray335[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt5745 -= 2;
					local175 = anIntArray333[anInt5745];
					local776 = anIntArray333[anInt5745 + 1];
					@Pc(2105) Class302 local2105 = Static110.method6390(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class8_Sub5_Sub4 local2112 = (Class8_Sub5_Sub4) local2105.method7327(); local2112 != null; local2112 = (Class8_Sub5_Sub4) local2105.method7326()) {
						if (local2112.anInt2512 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray333[anInt5745++] = 1;
						return;
					}
					anIntArray333[anInt5745++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray333[--anInt5745];
					local1696 = Static110.method6392(local175);
					if (local1696 == null) {
						anIntArray333[anInt5745++] = -1;
						return;
					}
					anIntArray333[anInt5745++] = local1696.anInt2503;
					return;
				}
				if (arg0 == 5220) {
					anIntArray333[anInt5745++] = Static489.anInt8687 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray333[--anInt5745];
					Static220.method4148(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static329.method5389();
					if (local1729 != null) {
						local1496 = local1729.method2127(Static561.anInt9691 + Static110.anInt7703, anIntArray335, Static227.anInt5187 + Static110.anInt7708);
						if (local1496) {
							anIntArray333[anInt5745++] = anIntArray335[1];
							anIntArray333[anInt5745++] = anIntArray335[2];
							return;
						}
						anIntArray333[anInt5745++] = -1;
						anIntArray333[anInt5745++] = -1;
						return;
					}
					anIntArray333[anInt5745++] = -1;
					anIntArray333[anInt5745++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt5745 -= 2;
					local175 = anIntArray333[anInt5745];
					local776 = anIntArray333[anInt5745 + 1];
					Static252.method4539(local776 >> 14 & 0x3FFF, local175, local776 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray333[--anInt5745];
					local1696 = Static329.method5389();
					if (local1696 != null) {
						local2067 = local1696.method2131(local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray335);
						if (local2067) {
							anIntArray333[anInt5745++] = anIntArray335[1];
							anIntArray333[anInt5745++] = anIntArray335[2];
							return;
						}
						anIntArray333[anInt5745++] = -1;
						anIntArray333[anInt5745++] = -1;
						return;
					}
					anIntArray333[anInt5745++] = -1;
					anIntArray333[anInt5745++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray333[--anInt5745];
					local1696 = Static329.method5389();
					if (local1696 != null) {
						local2067 = local1696.method2127(local175 & 0x3FFF, anIntArray335, local175 >> 14 & 0x3FFF);
						if (local2067) {
							anIntArray333[anInt5745++] = anIntArray335[1];
							anIntArray333[anInt5745++] = anIntArray335[2];
							return;
						}
						anIntArray333[anInt5745++] = -1;
						anIntArray333[anInt5745++] = -1;
						return;
					}
					anIntArray333[anInt5745++] = -1;
					anIntArray333[anInt5745++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static183.method3495(anIntArray333[--anInt5745]);
					return;
				}
				if (arg0 == 5227) {
					anInt5745 -= 2;
					local175 = anIntArray333[anInt5745];
					local776 = anIntArray333[anInt5745 + 1];
					Static252.method4539(local776 >> 14 & 0x3FFF, local175, local776 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static304.aBoolean433 = anIntArray333[--anInt5745] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray333[anInt5745++] = Static304.aBoolean433 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray333[--anInt5745];
					Static118.method5766(local175);
					return;
				}
				@Pc(2625) Class8 local2625;
				if (arg0 == 5231) {
					anInt5745 -= 2;
					local175 = anIntArray333[anInt5745];
					local1496 = anIntArray333[anInt5745 + 1] == 1;
					if (Static207.aClass253_13 != null) {
						local2625 = Static207.aClass253_13.method6594((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8640();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class8();
							Static207.aClass253_13.method6591(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class8 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray333[--anInt5745];
					if (Static207.aClass253_13 != null) {
						local2667 = Static207.aClass253_13.method6594((long) local175);
						anIntArray333[anInt5745++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray333[anInt5745++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt5745 -= 2;
					local175 = anIntArray333[anInt5745];
					local1496 = anIntArray333[anInt5745 + 1] == 1;
					if (Static332.aClass253_23 != null) {
						local2625 = Static332.aClass253_23.method6594((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8640();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class8();
							Static332.aClass253_23.method6591(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray333[--anInt5745];
					if (Static332.aClass253_23 != null) {
						local2667 = Static332.aClass253_23.method6594((long) local175);
						anIntArray333[anInt5745++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray333[anInt5745++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray333[anInt5745++] = Static110.aClass8_Sub5_Sub4_3 == null ? -1 : Static110.aClass8_Sub5_Sub4_3.anInt2512;
					return;
				}
				if (arg0 == 5236) {
					anInt5745 -= 2;
					local175 = anIntArray333[anInt5745];
					local776 = anIntArray333[anInt5745 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static84.method2092(local175, local103, local97);
					if (local2833 < 0) {
						anIntArray333[anInt5745++] = -1;
						return;
					}
					anIntArray333[anInt5745++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static402.method6407();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt5745 -= 2;
					local175 = anIntArray333[anInt5745];
					local776 = anIntArray333[anInt5745 + 1];
					Static327.method5366(local175, local776, 3, false);
					anIntArray333[anInt5745++] = Static197.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static197.aFrame1 != null) {
						Static327.method5366(-1, -1, Static155.aClass8_Sub25_6.aClass36_Sub5_1.method3307(), false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2919) Class358[] local2919 = Static182.method3475();
					anIntArray333[anInt5745++] = local2919.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray333[--anInt5745];
					@Pc(2943) Class358[] local2943 = Static182.method3475();
					anIntArray333[anInt5745++] = local2943[local175].anInt10258;
					anIntArray333[anInt5745++] = local2943[local175].anInt10252;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static239.anInt5360;
					local776 = Static296.anInt5972;
					local97 = -1;
					@Pc(2978) Class358[] local2978 = Static182.method3475();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class358 local2985 = local2978[local2833];
						if (local2985.anInt10258 == local175 && local2985.anInt10252 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray333[anInt5745++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray333[anInt5745++] = Static383.method6158();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray333[--anInt5745];
					if (local175 >= 1 && local175 <= 2) {
						Static327.method5366(-1, -1, local175, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub5_1.method3307();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray333[--anInt5745];
					if (local175 >= 1 && local175 <= 2) {
						Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub5_1, local175);
						Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub5_2, local175);
						Static35.method7912();
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt5748 -= 2;
					local83 = aStringArray13[anInt5748];
					local89 = aStringArray13[anInt5748 + 1];
					local97 = anIntArray333[--anInt5745];
					@Pc(3133) Class8_Sub31 local3133 = Static51.method1418(Static26.aClass257_9, Static608.aClass336_1);
					local3133.aClass8_Sub8_Sub2_1.method8562(Static643.method8631(local83) + Static643.method8631(local89) + 1);
					local3133.aClass8_Sub8_Sub2_1.method8582(local83);
					local3133.aClass8_Sub8_Sub2_1.method8582(local89);
					local3133.aClass8_Sub8_Sub2_1.method8562(local97);
					Static262.method4604(local3133);
					return;
				}
				if (arg0 == 5401) {
					anInt5745 -= 2;
					Static487.aShortArray107[anIntArray333[anInt5745]] = (short) Static355.method5610(anIntArray333[anInt5745 + 1]);
					Static497.aClass258_21.method6646();
					Static497.aClass258_21.method6649();
					Static297.aClass338_1.method7852();
					Static121.method2707();
					return;
				}
				if (arg0 == 5405) {
					anInt5745 -= 2;
					local175 = anIntArray333[anInt5745];
					local776 = anIntArray333[anInt5745 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static412.anIntArrayArrayArray11[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt5745 -= 7;
					local175 = anIntArray333[anInt5745];
					local776 = anIntArray333[anInt5745 + 1] << 1;
					local97 = anIntArray333[anInt5745 + 2];
					local103 = anIntArray333[anInt5745 + 3];
					local2833 = anIntArray333[anInt5745 + 4];
					@Pc(3271) int local3271 = anIntArray333[anInt5745 + 5];
					@Pc(3277) int local3277 = anIntArray333[anInt5745 + 6];
					if (local175 >= 0 && local175 < 2 && Static412.anIntArrayArrayArray11[local175] != null && local776 >= 0 && local776 < Static412.anIntArrayArrayArray11[local175].length) {
						Static412.anIntArrayArrayArray11[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3277 };
						Static412.anIntArrayArrayArray11[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3271 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static412.anIntArrayArrayArray11[anIntArray333[--anInt5745]].length >> 1;
					anIntArray333[anInt5745++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static197.aFrame1 != null) {
						Static327.method5366(-1, -1, Static155.aClass8_Sub25_6.aClass36_Sub5_1.method3307(), false);
					}
					if (Static602.aFrame3 != null) {
						Static579.method8093();
						System.exit(0);
						return;
					}
					local83 = Static447.aString56 == null ? Static292.method4861() : Static447.aString56;
					Static453.method6874(Static51.aClass118_1, local83, false, Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() == 1);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static557.aClass301_8 != null) {
						if (Static557.aClass301_8.anObject18 == null) {
							local83 = Static236.method4339(Static557.aClass301_8.anInt8918);
						} else {
							local83 = (String) Static557.aClass301_8.anObject18;
						}
					}
					aStringArray13[anInt5748++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray333[anInt5745++] = Static51.aClass118_1.aBoolean302 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static197.aFrame1 != null) {
						Static327.method5366(-1, -1, Static155.aClass8_Sub25_6.aClass36_Sub5_1.method3307(), false);
					}
					local83 = aStringArray13[--anInt5748];
					local1496 = anIntArray333[--anInt5745] == 1;
					local181 = Static292.method4861() + local83;
					Static453.method6874(Static51.aClass118_1, local181, local1496, Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() == 1);
					return;
				}
				if (arg0 == 5422) {
					anInt5748 -= 2;
					local83 = aStringArray13[anInt5748];
					local89 = aStringArray13[anInt5748 + 1];
					local97 = anIntArray333[--anInt5745];
					if (local83.length() > 0) {
						if (Static600.aStringArray39 == null) {
							Static600.aStringArray39 = new String[Static330.anIntArray233[Static18.aClass217_1.anInt6835]];
						}
						Static600.aStringArray39[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static434.aStringArray22 == null) {
							Static434.aStringArray22 = new String[Static330.anIntArray233[Static18.aClass217_1.anInt6835]];
						}
						Static434.aStringArray22[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray13[--anInt5748]);
					return;
				}
				if (arg0 == 5424) {
					anInt5745 -= 11;
					Static171.anInt4136 = anIntArray333[anInt5745];
					Static396.anInt9381 = anIntArray333[anInt5745 + 1];
					Static188.anInt4405 = anIntArray333[anInt5745 + 2];
					Static414.anInt7873 = anIntArray333[anInt5745 + 3];
					Static384.anInt7466 = anIntArray333[anInt5745 + 4];
					Static254.anInt4213 = anIntArray333[anInt5745 + 5];
					Static376.anInt7101 = anIntArray333[anInt5745 + 6];
					Static480.anInt8592 = anIntArray333[anInt5745 + 7];
					Static464.anInt8444 = anIntArray333[anInt5745 + 8];
					Static220.anInt5056 = anIntArray333[anInt5745 + 9];
					Static328.anInt9773 = anIntArray333[anInt5745 + 10];
					Static630.aClass237_149.method6296(Static384.anInt7466);
					Static630.aClass237_149.method6296(Static254.anInt4213);
					Static630.aClass237_149.method6296(Static376.anInt7101);
					Static630.aClass237_149.method6296(Static480.anInt8592);
					Static630.aClass237_149.method6296(Static464.anInt8444);
					Static517.aClass21_30 = null;
					Static464.aClass21_28 = null;
					Static310.aClass21_11 = null;
					Static21.aClass21_1 = null;
					Static292.aClass21_9 = null;
					Static640.aClass21_34 = null;
					Static212.aClass21_8 = null;
					Static619.aClass21_33 = null;
					Static238.aBoolean398 = true;
					return;
				}
				if (arg0 == 5425) {
					Static351.method5558();
					Static238.aBoolean398 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt5745 -= 2;
					Static553.anInt9618 = anIntArray333[anInt5745];
					Static394.anInt7610 = anIntArray333[anInt5745 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt5745 -= 2;
					Static468.anInt10558 = anIntArray333[anInt5745 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt5745 -= 2;
					local175 = anIntArray333[anInt5745];
					local776 = anIntArray333[anInt5745 + 1];
					anIntArray333[anInt5745++] = Static263.method4605(local175, local776) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static120.method2685(false, false, aStringArray13[--anInt5748]);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static646.method1435("accountcreated", Static152.anApplet1);
						return;
					} catch (@Pc(3819) Throwable local3819) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static646.method1435("accountcreatestarted", Static152.anApplet1);
						return;
					} catch (@Pc(3830) Throwable local3830) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static3.aClipboard1 != null) {
						@Pc(3842) Transferable local3842 = Static3.aClipboard1.getContents(null);
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
					aStringArray13[anInt5748++] = local83;
					return;
				}
				if (arg0 == 5433) {
					Static201.anInt4619 = anIntArray333[--anInt5745];
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt5745 -= 4;
					local175 = anIntArray333[anInt5745];
					local776 = anIntArray333[anInt5745 + 1];
					local97 = anIntArray333[anInt5745 + 2];
					local103 = anIntArray333[anInt5745 + 3];
					Static63.method1686(local97, local103, (local175 & 0x3FFF) - Static594.anInt10160, local776 << 2, false, (local175 >> 14 & 0x3FFF) - Static628.anInt10493);
					return;
				}
				if (arg0 == 5501) {
					anInt5745 -= 4;
					local175 = anIntArray333[anInt5745];
					local776 = anIntArray333[anInt5745 + 1];
					local97 = anIntArray333[anInt5745 + 2];
					local103 = anIntArray333[anInt5745 + 3];
					Static78.method2056(local776 << 2, local97, (local175 >> 14 & 0x3FFF) - Static628.anInt10493, (local175 & 0x3FFF) - Static594.anInt10160, local103);
					return;
				}
				if (arg0 == 5502) {
					anInt5745 -= 6;
					local175 = anIntArray333[anInt5745];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static44.anInt1555 = local175;
					local776 = anIntArray333[anInt5745 + 1];
					if (local776 + 1 >= Static412.anIntArrayArrayArray11[Static44.anInt1555].length >> 1) {
						throw new RuntimeException();
					}
					Static583.anInt10014 = local776;
					Static456.anInt8379 = 0;
					Static114.anInt2996 = anIntArray333[anInt5745 + 2];
					Static642.anInt10687 = anIntArray333[anInt5745 + 3];
					local97 = anIntArray333[anInt5745 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static266.anInt5675 = local97;
					local103 = anIntArray333[anInt5745 + 5];
					if (local103 + 1 >= Static412.anIntArrayArrayArray11[Static266.anInt5675].length >> 1) {
						throw new RuntimeException();
					}
					Static532.anInt9170 = local103;
					Static427.anInt8005 = 3;
					Static621.anInt10407 = -1;
					Static460.anInt8416 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static254.method3442();
					return;
				}
				if (arg0 == 5504) {
					anInt5745 -= 2;
					Static465.method6988(anIntArray333[anInt5745 + 1], anIntArray333[anInt5745]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray333[anInt5745++] = (int) Static64.aFloat44 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray333[anInt5745++] = (int) Static499.aFloat185 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static236.method4342();
					return;
				}
				if (arg0 == 5508) {
					Static39.method1279();
					return;
				}
				if (arg0 == 5509) {
					Static388.method6212();
					return;
				}
				if (arg0 == 5510) {
					Static542.method7657();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray333[--anInt5745];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static628.anInt10493;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static372.anInt7082) {
						local776 = Static372.anInt7082;
					}
					local97 -= Static594.anInt10160;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static218.anInt5023) {
						local97 = Static218.anInt5023;
					}
					Static4.anInt24 = (local776 << 9) + 256;
					Static93.anInt2585 = (local97 << 9) + 256;
					Static427.anInt8005 = 4;
					Static621.anInt10407 = -1;
					Static460.anInt8416 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static586.method8143();
					return;
				}
				if (arg0 == 5514) {
					Static115.anInt3010 = anIntArray333[--anInt5745];
					return;
				}
				if (arg0 == 5516) {
					anIntArray333[anInt5745++] = Static115.anInt3010;
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray333[--anInt5745];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static628.anInt10493;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static372.anInt7082) {
							local776 = Static372.anInt7082;
						}
						local97 -= Static594.anInt10160;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static218.anInt5023) {
							local97 = Static218.anInt5023;
						}
						Static460.anInt8416 = (local776 << 9) + 256;
						Static621.anInt10407 = (local97 << 9) + 256;
						return;
					}
					Static460.anInt8416 = -1;
					Static621.anInt10407 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt5748 -= 2;
					local83 = aStringArray13[anInt5748];
					local89 = aStringArray13[anInt5748 + 1];
					local97 = anIntArray333[--anInt5745];
					if (local83.length() > 320) {
						return;
					}
					if (Static435.anInt8191 != 3) {
						return;
					}
					if (Static453.anInt8320 == 0 && Static354.anInt6822 == 0) {
						Static95.aString32 = local83;
						Static191.aString57 = local89;
						Static99.anInt2642 = local97;
						Static63.method1687(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static75.method1958();
					return;
				}
				if (arg0 == 5602) {
					if (Static453.anInt8320 == 0) {
						Static177.anInt3823 = -2;
						Static128.anInt3420 = -2;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt5748--;
					if (Static435.anInt8191 != 3) {
						return;
					}
					if (Static453.anInt8320 == 0 && Static354.anInt6822 == 0) {
						Static414.method6513(aStringArray13[anInt5748]);
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt5748 -= 2;
					anInt5745 -= 2;
					if (Static435.anInt8191 != 3) {
						return;
					}
					if (Static453.anInt8320 == 0 && Static354.anInt6822 == 0) {
						Static641.method8621(aStringArray13[anInt5748 + 1], anIntArray333[anInt5745], anIntArray333[anInt5745 + 1] == 1, aStringArray13[anInt5748]);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static354.anInt6822 == 0) {
						Static98.anInt2635 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray333[anInt5745++] = Static128.anInt3420;
					return;
				}
				if (arg0 == 5608) {
					anIntArray333[anInt5745++] = Static643.anInt10695;
					return;
				}
				if (arg0 == 5609) {
					anIntArray333[anInt5745++] = Static98.anInt2635;
					return;
				}
				if (arg0 == 5611) {
					anIntArray333[anInt5745++] = Static9.anInt129;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray333[--anInt5745];
					if (Static435.anInt8191 != 7) {
						return;
					}
					if (Static453.anInt8320 == 0 && Static354.anInt6822 == 0) {
						if (Static319.aClass240_2 != null) {
							Static319.aClass240_2.method6372();
							Static319.aClass240_2 = null;
						}
						Static99.anInt2642 = local175;
						Static63.method1687(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray333[anInt5745++] = Static128.anInt3420;
					return;
				}
				if (arg0 == 5615) {
					anInt5748 -= 2;
					local83 = aStringArray13[anInt5748];
					local89 = aStringArray13[anInt5748 + 1];
					if (local83.length() > 320) {
						return;
					}
					if (Static435.anInt8191 != 3) {
						return;
					}
					if (Static453.anInt8320 == 0 && Static354.anInt6822 == 0) {
						if (Static319.aClass240_2 != null) {
							Static319.aClass240_2.method6372();
							Static319.aClass240_2 = null;
						}
						Static95.aString32 = local83;
						Static191.aString57 = local89;
						Static63.method1687(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static232.method4294(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray333[anInt5745++] = Static177.anInt3823;
					return;
				}
				if (arg0 == 5618) {
					anInt5745--;
					return;
				}
				if (arg0 == 5619) {
					anInt5745--;
					return;
				}
				if (arg0 == 5620) {
					anIntArray333[anInt5745++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt5748 -= 2;
					anInt5745 -= 2;
					return;
				}
				if (arg0 == 5622) {
					return;
				}
				if (arg0 == 5623) {
					if (Static193.aString58 != null) {
						anIntArray333[anInt5745++] = 1;
						return;
					}
					anIntArray333[anInt5745++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray333[anInt5745++] = (int) (Static161.aLong101 >> 32);
					anIntArray333[anInt5745++] = (int) (Static161.aLong101 & 0xFFFFL);
					return;
				}
				if (arg0 == 5625) {
					anIntArray333[anInt5745++] = Static69.aBoolean557 ? 1 : 0;
					return;
				}
				if (arg0 == 5626) {
					Static69.aBoolean557 = true;
					Static436.method6740();
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray333[--anInt5745];
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub25_1, local175);
					Static33.method1194();
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				@Pc(4786) boolean local4786;
				if (arg0 == 6002) {
					local4786 = anIntArray333[--anInt5745] == 1;
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub13_2, local4786 ? 1 : 0);
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub13_1, local4786 ? 1 : 0);
					Static33.method1194();
					Static140.method2960();
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6003) {
					local4786 = anIntArray333[--anInt5745] == 1;
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub3_1, local4786 ? 2 : 1);
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub3_2, local4786 ? 2 : 1);
					Static140.method2960();
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6005) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub1_1, anIntArray333[--anInt5745] == 1 ? 1 : 0);
					Static33.method1194();
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6007) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub16_1, anIntArray333[--anInt5745]);
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6008) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub27_1, anIntArray333[--anInt5745] == 1 ? 1 : 0);
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6010) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub4_1, anIntArray333[--anInt5745] == 1 ? 1 : 0);
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6011) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub14_1, anIntArray333[--anInt5745]);
					Static33.method1194();
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6012) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub21_1, anIntArray333[--anInt5745] == 1 ? 1 : 0);
					Static180.method3451();
					Static364.method5679();
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6014) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub2_1, anIntArray333[--anInt5745] == 1 ? 2 : 0);
					Static33.method1194();
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6015) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub12_1, anIntArray333[--anInt5745] == 1 ? 1 : 0);
					Static33.method1194();
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6016) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub26_1, anIntArray333[--anInt5745]);
					Static553.method7773(false, Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358());
					Static35.method7912();
					return;
				}
				if (arg0 == 6017) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub18_1, anIntArray333[--anInt5745] == 1 ? 1 : 0);
					Static82.method2079();
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6018) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub6_1, anIntArray333[--anInt5745]);
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray333[--anInt5745];
					local776 = Static155.aClass8_Sub25_6.aClass36_Sub6_2.method3331();
					if (local175 != local776) {
						if (Static564.method7850(Static435.anInt8191)) {
							if (local776 == 0 && Static505.anInt8909 != -1) {
								Static540.method7649(local175, Static628.aClass237_148, Static505.anInt8909);
								Static117.method2615();
								Static424.aBoolean575 = false;
							} else if (local175 == 0) {
								Static117.method2610();
								Static424.aBoolean575 = false;
							} else {
								Static45.method1361(local175);
							}
						}
						Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub6_2, local175);
						Static35.method7912();
						Static497.aBoolean740 = false;
					}
					return;
				}
				if (arg0 == 6020) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub6_5, anIntArray333[--anInt5745]);
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6021) {
					local175 = Static155.aClass8_Sub25_6.aClass36_Sub3_1.method2233();
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub3_2, anIntArray333[--anInt5745] == 1 ? 0 : local175);
					Static140.method2960();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray333[--anInt5745];
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub9_1, local175);
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6024) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub26_2, anIntArray333[--anInt5745]);
					Static35.method7912();
					return;
				}
				if (arg0 == 6025) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub7_1, anIntArray333[--anInt5745]);
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray333[--anInt5745];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static38.method1275(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub24_1, anIntArray333[--anInt5745] == 0 ? 0 : 1);
					Static35.method7912();
					return;
				}
				if (arg0 == 6029) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub16_1, anIntArray333[--anInt5745]);
					Static35.method7912();
					return;
				}
				if (arg0 == 6030) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub20_1, anIntArray333[--anInt5745] == 0 ? 0 : 1);
					Static35.method7912();
					Static33.method1194();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray333[--anInt5745];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static553.method7773(false, local175);
					return;
				}
				if (arg0 == 6032) {
					anInt5745 -= 2;
					local175 = anIntArray333[anInt5745];
					local1496 = anIntArray333[anInt5745 + 1] == 1;
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub19_1, local175);
					if (!local1496) {
						Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub15_1, 0);
					}
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6033) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub8_1, anIntArray333[--anInt5745]);
					Static35.method7912();
					return;
				}
				if (arg0 == 6034) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub17_1, anIntArray333[--anInt5745] == 1 ? 1 : 0);
					Static35.method7912();
					Static180.method3451();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6035) {
					local175 = Static155.aClass8_Sub25_6.aClass36_Sub13_2.method4838();
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub13_1, anIntArray333[--anInt5745] == 1 ? 1 : local175);
					Static33.method1194();
					Static140.method2960();
					return;
				}
				if (arg0 == 6036) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub11_1, anIntArray333[--anInt5745]);
					Static35.method7912();
					Static226.aBoolean386 = true;
					return;
				}
				if (arg0 == 6037) {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub6_4, anIntArray333[--anInt5745]);
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray333[--anInt5745];
					local776 = Static155.aClass8_Sub25_6.aClass36_Sub6_3.method3331();
					if (local175 != local776 && Static505.anInt8909 == Static282.anInt5836) {
						if (!Static564.method7850(Static435.anInt8191)) {
							if (local776 == 0) {
								Static540.method7649(local175, Static628.aClass237_148, Static505.anInt8909);
								Static117.method2615();
								Static424.aBoolean575 = false;
							} else if (local175 == 0) {
								Static117.method2610();
								Static424.aBoolean575 = false;
							} else {
								Static45.method1361(local175);
							}
						}
						Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub6_3, local175);
						Static35.method7912();
						Static497.aBoolean740 = false;
					}
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray333[--anInt5745];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static155.aClass8_Sub25_6.aClass36_Sub10_1.method4062()) {
						Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub10_1, local175);
						Static35.method7912();
						Static497.aBoolean740 = false;
					}
					return;
				}
				if (arg0 == 6040) {
					local175 = anIntArray333[--anInt5745];
					if (local175 != Static155.aClass8_Sub25_6.aClass36_Sub23_1.method7382()) {
						Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub23_1, local175);
						Static35.method7912();
						Static497.aBoolean740 = false;
						Static582.method8107();
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub25_1.method7512();
					return;
				}
				if (arg0 == 6102) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub13_2.method4838() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub3_1.method2233() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub1_1.method1349() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub16_1.method5358();
					return;
				}
				if (arg0 == 6108) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub27_1.method8108() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub4_1.method3042() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub14_1.method4894();
					return;
				}
				if (arg0 == 6112) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub21_1.method6959() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub2_1.method1626() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub12_1.method4665() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub26_1.method7794();
					return;
				}
				if (arg0 == 6117) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub18_1.method5526() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub6_1.method3331();
					return;
				}
				if (arg0 == 6119) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub6_2.method3331();
					return;
				}
				if (arg0 == 6120) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub6_5.method3331();
					return;
				}
				if (arg0 == 6123) {
					anIntArray333[anInt5745++] = Static525.method7461();
					return;
				}
				if (arg0 == 6124) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub26_2.method7794();
					return;
				}
				if (arg0 == 6125) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub7_1.method3620();
					return;
				}
				if (arg0 == 6127) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub29_1.method8472() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub24_1.method7400() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub16_1.method5358();
					return;
				}
				if (arg0 == 6130) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub20_1.method6729() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358();
					return;
				}
				if (arg0 == 6132) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub19_1.method6358();
					return;
				}
				if (arg0 == 6133) {
					anIntArray333[anInt5745++] = Static51.aClass118_1.aBoolean302 && !Static51.aClass118_1.aBoolean301 ? 1 : 0;
					return;
				}
				if (arg0 == 6135) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub8_1.method3635();
					return;
				}
				if (arg0 == 6136) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub17_1.method5459() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray333[anInt5745++] = Static95.method2214(200, Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358());
					return;
				}
				if (arg0 == 6139) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub11_1.method4435();
					return;
				}
				if (arg0 == 6142) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub6_4.method3331();
					return;
				}
				if (arg0 == 6143) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub6_3.method3331();
					return;
				}
				if (arg0 == 6144) {
					anIntArray333[anInt5745++] = Static216.aBoolean373 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub10_1.method4062();
					return;
				}
				if (arg0 == 6146) {
					anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub23_1.method7382();
					return;
				}
				if (arg0 == 6147) {
					anIntArray333[anInt5745++] = Static38.aClass8_Sub15_1.anInt2575 < 512 || Static216.aBoolean373 || Static593.aBoolean729 ? 1 : 0;
					return;
				}
				if (arg0 == 6148) {
					anIntArray333[anInt5745++] = Static636.aBoolean754 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt5745 -= 2;
					Static90.aShort27 = (short) anIntArray333[anInt5745];
					if (Static90.aShort27 <= 0) {
						Static90.aShort27 = 256;
					}
					Static117.aShort30 = (short) anIntArray333[anInt5745 + 1];
					if (Static117.aShort30 <= 0) {
						Static117.aShort30 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt5745 -= 2;
					Static67.aShort16 = (short) anIntArray333[anInt5745];
					if (Static67.aShort16 <= 0) {
						Static67.aShort16 = 256;
					}
					Static372.aShort74 = (short) anIntArray333[anInt5745 + 1];
					if (Static372.aShort74 <= 0) {
						Static372.aShort74 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt5745 -= 4;
					Static434.aShort89 = (short) anIntArray333[anInt5745];
					if (Static434.aShort89 <= 0) {
						Static434.aShort89 = 1;
					}
					Static262.aShort60 = (short) anIntArray333[anInt5745 + 1];
					if (Static262.aShort60 <= 0) {
						Static262.aShort60 = 32767;
					} else if (Static262.aShort60 < Static434.aShort89) {
						Static262.aShort60 = Static434.aShort89;
					}
					Static456.aShort91 = (short) anIntArray333[anInt5745 + 2];
					if (Static456.aShort91 <= 0) {
						Static456.aShort91 = 1;
					}
					Static200.aShort54 = (short) anIntArray333[anInt5745 + 3];
					if (Static200.aShort54 <= 0) {
						Static200.aShort54 = 32767;
						return;
					}
					if (Static200.aShort54 < Static456.aShort91) {
						Static200.aShort54 = Static456.aShort91;
					}
					return;
				}
				if (arg0 == 6203) {
					Static469.method7021(0, false, 0, Static224.aClass331_7.anInt9553, Static224.aClass331_7.anInt9505);
					anIntArray333[anInt5745++] = Static563.anInt9711;
					anIntArray333[anInt5745++] = Static122.anInt3287;
					return;
				}
				if (arg0 == 6204) {
					anIntArray333[anInt5745++] = Static67.aShort16;
					anIntArray333[anInt5745++] = Static372.aShort74;
					return;
				}
				if (arg0 == 6205) {
					anIntArray333[anInt5745++] = Static90.aShort27;
					anIntArray333[anInt5745++] = Static117.aShort30;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray333[anInt5745++] = (int) (Static342.method5463() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray333[anInt5745++] = (int) (Static342.method5463() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt5745 -= 3;
					local175 = anIntArray333[anInt5745];
					local776 = anIntArray333[anInt5745 + 1];
					local97 = anIntArray333[anInt5745 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local97, local776, local175);
					local103 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray333[anInt5745++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static342.method5463()));
					anIntArray333[anInt5745++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray333[--anInt5745];
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
					anIntArray333[anInt5745++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray333[anInt5745++] = Static159.method7192() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray333[anInt5745++] = Static93.method2182() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static435.anInt8191 == 7 && Static453.anInt8320 == 0 && Static354.anInt6822 == 0) {
						if (Static161.aBoolean290) {
							anIntArray333[anInt5745++] = 0;
							return;
						}
						if (Static10.aLong5 > Static342.method5463() - 1000L) {
							anIntArray333[anInt5745++] = 1;
							return;
						}
						Static161.aBoolean290 = true;
						local52 = Static51.method1418(Static602.aClass257_119, Static608.aClass336_1);
						local52.aClass8_Sub8_Sub2_1.method8523(Static315.anInt9133);
						Static262.method4604(local52);
						anIntArray333[anInt5745++] = 0;
						return;
					}
					anIntArray333[anInt5745++] = 1;
					return;
				}
				@Pc(6862) Class279 local6862;
				@Pc(6829) Class98_Sub1 local6829;
				if (arg0 == 6501) {
					local6829 = Static279.method4731();
					if (local6829 != null) {
						anIntArray333[anInt5745++] = local6829.anInt3682;
						anIntArray333[anInt5745++] = local6829.anInt3678;
						aStringArray13[anInt5748++] = local6829.aString40;
						local6862 = local6829.method3025();
						anIntArray333[anInt5745++] = local6862.anInt8488;
						aStringArray13[anInt5748++] = local6862.aString86;
						anIntArray333[anInt5745++] = local6829.anInt3674;
						anIntArray333[anInt5745++] = local6829.anInt3681;
						aStringArray13[anInt5748++] = local6829.aString39;
						return;
					}
					anIntArray333[anInt5745++] = -1;
					anIntArray333[anInt5745++] = 0;
					aStringArray13[anInt5748++] = "";
					anIntArray333[anInt5745++] = 0;
					aStringArray13[anInt5748++] = "";
					anIntArray333[anInt5745++] = 0;
					anIntArray333[anInt5745++] = 0;
					aStringArray13[anInt5748++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6829 = Static101.method2307();
					if (local6829 != null) {
						anIntArray333[anInt5745++] = local6829.anInt3682;
						anIntArray333[anInt5745++] = local6829.anInt3678;
						aStringArray13[anInt5748++] = local6829.aString40;
						local6862 = local6829.method3025();
						anIntArray333[anInt5745++] = local6862.anInt8488;
						aStringArray13[anInt5748++] = local6862.aString86;
						anIntArray333[anInt5745++] = local6829.anInt3674;
						anIntArray333[anInt5745++] = local6829.anInt3681;
						aStringArray13[anInt5748++] = local6829.aString39;
						return;
					}
					anIntArray333[anInt5745++] = -1;
					anIntArray333[anInt5745++] = 0;
					aStringArray13[anInt5748++] = "";
					anIntArray333[anInt5745++] = 0;
					aStringArray13[anInt5748++] = "";
					anIntArray333[anInt5745++] = 0;
					anIntArray333[anInt5745++] = 0;
					aStringArray13[anInt5748++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray333[--anInt5745];
					local89 = aStringArray13[--anInt5748];
					if (Static435.anInt8191 == 7 && Static453.anInt8320 == 0 && Static354.anInt6822 == 0) {
						anIntArray333[anInt5745++] = Static164.method3284(local89, local175) ? 1 : 0;
						return;
					}
					anIntArray333[anInt5745++] = 0;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray333[--anInt5745];
					@Pc(7189) Class98_Sub1 local7189 = Static309.method5083(local175);
					if (local7189 != null) {
						anIntArray333[anInt5745++] = local7189.anInt3678;
						aStringArray13[anInt5748++] = local7189.aString40;
						@Pc(7213) Class279 local7213 = local7189.method3025();
						anIntArray333[anInt5745++] = local7213.anInt8488;
						aStringArray13[anInt5748++] = local7213.aString86;
						anIntArray333[anInt5745++] = local7189.anInt3674;
						anIntArray333[anInt5745++] = local7189.anInt3681;
						aStringArray13[anInt5748++] = local7189.aString39;
						return;
					}
					anIntArray333[anInt5745++] = -1;
					aStringArray13[anInt5748++] = "";
					anIntArray333[anInt5745++] = 0;
					aStringArray13[anInt5748++] = "";
					anIntArray333[anInt5745++] = 0;
					anIntArray333[anInt5745++] = 0;
					aStringArray13[anInt5748++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt5745 -= 4;
					local175 = anIntArray333[anInt5745];
					local1496 = anIntArray333[anInt5745 + 1] == 1;
					local97 = anIntArray333[anInt5745 + 2];
					local2107 = anIntArray333[anInt5745 + 3] == 1;
					Static184.method3508(local1496, local175, local97, local2107);
					return;
				}
				if (arg0 == 6508) {
					Static121.method2705();
					return;
				}
				if (arg0 == 6509) {
					if (Static435.anInt8191 != 7) {
						return;
					}
					Static82.aBoolean187 = anIntArray333[--anInt5745] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray333[anInt5745++] = Static349.anInt6743;
					return;
				}
			} else if (arg0 >= 6700) {
				if (arg0 < 6800 && Static51.aClass348_2 == Static558.aClass348_3) {
					if (arg0 == 6700) {
						local175 = Static218.aClass253_14.method6592();
						if (Static212.anInt4965 != -1) {
							local175++;
						}
						anIntArray333[anInt5745++] = local175;
						return;
					}
					if (arg0 == 6701) {
						local175 = anIntArray333[--anInt5745];
						if (Static212.anInt4965 != -1) {
							if (local175 == 0) {
								anIntArray333[anInt5745++] = Static212.anInt4965;
								return;
							}
							local175--;
						}
						@Pc(7461) Class8_Sub51 local7461 = (Class8_Sub51) Static218.aClass253_14.method6593();
						while (local175-- > 0) {
							local7461 = (Class8_Sub51) Static218.aClass253_14.method6595();
						}
						anIntArray333[anInt5745++] = local7461.anInt10454;
						return;
					}
					if (arg0 == 6702) {
						local175 = anIntArray333[--anInt5745];
						if (Static368.aClass331ArrayArray2[local175] == null) {
							aStringArray13[anInt5748++] = "";
							return;
						}
						local89 = Static368.aClass331ArrayArray2[local175][0].aString98;
						if (local89 == null) {
							aStringArray13[anInt5748++] = "";
							return;
						}
						aStringArray13[anInt5748++] = local89.substring(0, local89.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local175 = anIntArray333[--anInt5745];
						if (Static368.aClass331ArrayArray2[local175] == null) {
							anIntArray333[anInt5745++] = 0;
							return;
						}
						anIntArray333[anInt5745++] = Static368.aClass331ArrayArray2[local175].length;
						return;
					}
					if (arg0 == 6704) {
						anInt5745 -= 2;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						if (Static368.aClass331ArrayArray2[local175] == null) {
							aStringArray13[anInt5748++] = "";
							return;
						}
						local181 = Static368.aClass331ArrayArray2[local175][local776].aString98;
						if (local181 == null) {
							aStringArray13[anInt5748++] = "";
							return;
						}
						aStringArray13[anInt5748++] = local181;
						return;
					}
					if (arg0 == 6705) {
						anInt5745 -= 2;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						if (Static368.aClass331ArrayArray2[local175] == null) {
							anIntArray333[anInt5745++] = 0;
							return;
						}
						anIntArray333[anInt5745++] = Static368.aClass331ArrayArray2[local175][local776].anInt9569;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt5745 -= 3;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						local97 = anIntArray333[anInt5745 + 2];
						Static267.method4636(local175 << 16 | local776, 1, "", local97);
						return;
					}
					if (arg0 == 6708) {
						anInt5745 -= 3;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						local97 = anIntArray333[anInt5745 + 2];
						Static267.method4636(local175 << 16 | local776, 2, "", local97);
						return;
					}
					if (arg0 == 6709) {
						anInt5745 -= 3;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						local97 = anIntArray333[anInt5745 + 2];
						Static267.method4636(local175 << 16 | local776, 3, "", local97);
						return;
					}
					if (arg0 == 6710) {
						anInt5745 -= 3;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						local97 = anIntArray333[anInt5745 + 2];
						Static267.method4636(local175 << 16 | local776, 4, "", local97);
						return;
					}
					if (arg0 == 6711) {
						anInt5745 -= 3;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						local97 = anIntArray333[anInt5745 + 2];
						Static267.method4636(local175 << 16 | local776, 5, "", local97);
						return;
					}
					if (arg0 == 6712) {
						anInt5745 -= 3;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						local97 = anIntArray333[anInt5745 + 2];
						Static267.method4636(local175 << 16 | local776, 6, "", local97);
						return;
					}
					if (arg0 == 6713) {
						anInt5745 -= 3;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						local97 = anIntArray333[anInt5745 + 2];
						Static267.method4636(local175 << 16 | local776, 7, "", local97);
						return;
					}
					if (arg0 == 6714) {
						anInt5745 -= 3;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						local97 = anIntArray333[anInt5745 + 2];
						Static267.method4636(local175 << 16 | local776, 8, "", local97);
						return;
					}
					if (arg0 == 6715) {
						anInt5745 -= 3;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						local97 = anIntArray333[anInt5745 + 2];
						Static267.method4636(local175 << 16 | local776, 9, "", local97);
						return;
					}
					if (arg0 == 6716) {
						anInt5745 -= 3;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						local97 = anIntArray333[anInt5745 + 2];
						Static267.method4636(local175 << 16 | local776, 10, "", local97);
						return;
					}
					if (arg0 == 6717) {
						anInt5745 -= 3;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						local97 = anIntArray333[anInt5745 + 2];
						@Pc(8049) Class331 local8049 = Static201.method3722(local175 << 16 | local776, local97);
						Static8.method91();
						@Pc(8054) Class8_Sub34 local8054 = Static73.method1921(local8049);
						Static471.method7031(local8049, local8054.anInt6429, local8054.method5219());
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(8082) Class17 local8082;
					if (arg0 == 6800) {
						local175 = anIntArray333[--anInt5745];
						local8082 = Static612.aClass12_4.method136(local175);
						if (local8082.aString8 == null) {
							aStringArray13[anInt5748++] = "";
							return;
						}
						aStringArray13[anInt5748++] = local8082.aString8;
						return;
					}
					if (arg0 == 6801) {
						local175 = anIntArray333[--anInt5745];
						local8082 = Static612.aClass12_4.method136(local175);
						anIntArray333[anInt5745++] = local8082.anInt783;
						return;
					}
					if (arg0 == 6802) {
						local175 = anIntArray333[--anInt5745];
						local8082 = Static612.aClass12_4.method136(local175);
						anIntArray333[anInt5745++] = local8082.anInt802;
						return;
					}
					if (arg0 == 6803) {
						local175 = anIntArray333[--anInt5745];
						local8082 = Static612.aClass12_4.method136(local175);
						anIntArray333[anInt5745++] = local8082.anInt811;
						return;
					}
					if (arg0 == 6804) {
						anInt5745 -= 2;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						@Pc(8204) Class82 local8204 = Static144.aClass274_1.method6933(local776);
						if (local8204.method2612()) {
							aStringArray13[anInt5748++] = Static612.aClass12_4.method136(local175).method767(local8204.aString33, local776);
							return;
						}
						anIntArray333[anInt5745++] = Static612.aClass12_4.method136(local175).method759(local8204.anInt3023, local776);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray333[anInt5745++] = Static408.aBoolean563 && !Static599.aBoolean732 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray333[anInt5745++] = Static225.anInt10608;
						return;
					}
					if (arg0 == 6902) {
						anIntArray333[anInt5745++] = Static181.anInt4233;
						return;
					}
					if (arg0 == 6903) {
						anIntArray333[anInt5745++] = Static174.anInt4170;
						return;
					}
					if (arg0 == 6904) {
						anIntArray333[anInt5745++] = Static557.anInt9674;
						return;
					}
					if (arg0 == 6905) {
						local83 = "";
						if (Static557.aClass301_8 != null) {
							if (Static557.aClass301_8.anObject18 == null) {
								local83 = Static236.method4339(Static557.aClass301_8.anInt8918);
							} else {
								local83 = (String) Static557.aClass301_8.anObject18;
							}
						}
						aStringArray13[anInt5748++] = local83;
						return;
					}
					if (arg0 == 6906) {
						anIntArray333[anInt5745++] = Static603.anInt10256;
						return;
					}
					if (arg0 == 6907) {
						anIntArray333[anInt5745++] = Static472.anInt8796;
						return;
					}
					if (arg0 == 6908) {
						anIntArray333[anInt5745++] = Static135.anInt3564;
						return;
					}
					if (arg0 == 6909) {
						anIntArray333[anInt5745++] = Static59.aBoolean130 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray333[anInt5745++] = Static55.anInt1865;
						return;
					}
					if (arg0 == 6911) {
						anIntArray333[anInt5745++] = Static294.anInt5951;
						return;
					}
					if (arg0 == 6912) {
						anIntArray333[anInt5745++] = Static17.anInt869;
						return;
					}
				} else if (arg0 < 7100) {
					if (arg0 == 7000) {
						local175 = Static58.method1629();
						anIntArray333[anInt5745++] = Static61.anInt1951 = Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358();
						anIntArray333[anInt5745++] = local175;
						Static33.method1194();
						Static35.method7912();
						Static497.aBoolean740 = false;
						return;
					}
					if (arg0 == 7001) {
						Static426.method6634();
						Static33.method1194();
						Static35.method7912();
						Static497.aBoolean740 = false;
						return;
					}
					if (arg0 == 7002) {
						Static139.method2957();
						Static33.method1194();
						Static35.method7912();
						Static497.aBoolean740 = false;
						return;
					}
					if (arg0 == 7003) {
						Static127.method2816();
						Static33.method1194();
						Static35.method7912();
						Static497.aBoolean740 = false;
						return;
					}
					if (arg0 == 7004) {
						Static169.method3359();
						Static33.method1194();
						Static35.method7912();
						Static497.aBoolean740 = false;
						return;
					}
					if (arg0 == 7005) {
						Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub15_1, 0);
						Static35.method7912();
						Static497.aBoolean740 = false;
						return;
					}
					if (arg0 == 7006) {
						if (Static61.anInt1951 == 2) {
							Static277.aBoolean411 = true;
							return;
						}
						if (Static61.anInt1951 == 1) {
							Static231.aBoolean393 = true;
							return;
						}
						if (Static61.anInt1951 == 3) {
							Static299.aBoolean428 = true;
						}
						return;
					}
					if (arg0 == 7007) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub15_1.method5339();
						return;
					}
				} else if (arg0 < 7200) {
					if (arg0 == 7100) {
						anInt5745 -= 2;
						local175 = anIntArray333[anInt5745];
						local776 = anIntArray333[anInt5745 + 1];
						if (local175 != -1) {
							if (local776 > 255) {
								local776 = 255;
							} else if (local776 < 0) {
								local776 = 0;
							}
							Static64.method1711(local175, false, local776);
						}
						return;
					}
					if (arg0 == 7101) {
						local175 = anIntArray333[--anInt5745];
						if (local175 != -1) {
							Static373.method7299(local175);
						}
						return;
					}
					if (arg0 == 7102) {
						local175 = anIntArray333[--anInt5745];
						if (local175 != -1) {
							Static245.method8267(local175);
						}
						return;
					}
					if (arg0 == 7103) {
						anIntArray333[anInt5745++] = Static343.method5468("jagtheora") ? 1 : 0;
						return;
					}
				} else if (arg0 < 7300) {
					if (arg0 == 7201) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub1_1.method1348() ? 1 : 0;
						return;
					}
					if (arg0 == 7202) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub4_1.method3043() ? 1 : 0;
						return;
					}
					if (arg0 == 7203) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub14_1.method4896() ? 1 : 0;
						return;
					}
					if (arg0 == 7204) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub2_1.method1627() ? 1 : 0;
						return;
					}
					if (arg0 == 7205) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub26_2.method7795() && Static171.aClass16_5.method6138() ? 1 : 0;
						return;
					}
					if (arg0 == 7206) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub9_1.method4039() ? 1 : 0;
						return;
					}
					if (arg0 == 7207) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub7_1.method3619() ? 1 : 0;
						return;
					}
					if (arg0 == 7208) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub29_1.method8471() && Static171.aClass16_5.method6077() ? 1 : 0;
						return;
					}
					if (arg0 == 7209) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub20_1.method6728() ? 1 : 0;
						return;
					}
					if (arg0 == 7210) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub17_1.method5458() ? 1 : 0;
						return;
					}
					if (arg0 == 7211) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub11_1.method4434() ? 1 : 0;
						return;
					}
					if (arg0 == 7212) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub12_1.method4663() ? 1 : 0;
						return;
					}
					if (arg0 == 7213) {
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub23_1.method7384() ? 1 : 0;
						return;
					}
				} else if (arg0 < 7400) {
					if (arg0 == 7301) {
						local175 = anIntArray333[--anInt5745];
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub1_1.method8466(local175);
						return;
					}
					if (arg0 == 7302) {
						local175 = anIntArray333[--anInt5745];
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub4_1.method8466(local175);
						return;
					}
					if (arg0 == 7303) {
						local175 = anIntArray333[--anInt5745];
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub14_1.method8466(local175);
						return;
					}
					if (arg0 == 7304) {
						local175 = anIntArray333[--anInt5745];
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub2_1.method8466(local175);
						return;
					}
					if (arg0 == 7305) {
						local175 = anIntArray333[--anInt5745];
						if (!Static171.aClass16_5.method6138()) {
							anIntArray333[anInt5745++] = 3;
							return;
						}
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub26_2.method8466(local175);
						return;
					}
					if (arg0 == 7306) {
						local175 = anIntArray333[--anInt5745];
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub9_1.method8466(local175);
						return;
					}
					if (arg0 == 7307) {
						local175 = anIntArray333[--anInt5745];
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub7_1.method8466(local175);
						return;
					}
					if (arg0 == 7308) {
						local175 = anIntArray333[--anInt5745];
						if (!Static171.aClass16_5.method6077()) {
							anIntArray333[anInt5745++] = 3;
							return;
						}
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub29_1.method8466(local175);
						return;
					}
					if (arg0 == 7309) {
						local175 = anIntArray333[--anInt5745];
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub20_1.method8466(local175);
						return;
					}
					if (arg0 == 7310) {
						local175 = anIntArray333[--anInt5745];
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub17_1.method8466(local175);
						return;
					}
					if (arg0 == 7311) {
						local175 = anIntArray333[--anInt5745];
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub11_1.method8466(local175);
						return;
					}
					if (arg0 == 7312) {
						local175 = anIntArray333[--anInt5745];
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub12_1.method8466(local175);
						return;
					}
					if (arg0 == 7313) {
						local175 = anIntArray333[--anInt5745];
						anIntArray333[anInt5745++] = Static155.aClass8_Sub25_6.aClass36_Sub23_1.method8466(local175);
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4688(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static190.anInt7431 == 0 && (Static408.aBoolean563 && !Static599.aBoolean732 || Static321.aBoolean449)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static121.aClass84_47.method2710(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static121.aClass84_47.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_48.method2710(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static121.aClass84_48.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_49.method2710(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static121.aClass84_49.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_50.method2710(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static121.aClass84_50.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_51.method2710(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static121.aClass84_51.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_52.method2710(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static121.aClass84_52.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_53.method2710(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static121.aClass84_53.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_54.method2710(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static121.aClass84_54.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_55.method2710(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static121.aClass84_55.method2710(0).length());
		} else if (local11.startsWith(Class84.lb.method2710(0))) {
			local13 = 9;
			arg0 = arg0.substring(Class84.lb.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_56.method2710(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static121.aClass84_56.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_57.method2710(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static121.aClass84_57.method2710(0).length());
		} else if (Static372.anInt7083 != 0) {
			if (local11.startsWith(Static121.aClass84_47.method2710(Static372.anInt7083))) {
				local13 = 0;
				arg0 = arg0.substring(Static121.aClass84_47.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_48.method2710(Static372.anInt7083))) {
				local13 = 1;
				arg0 = arg0.substring(Static121.aClass84_48.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_49.method2710(Static372.anInt7083))) {
				local13 = 2;
				arg0 = arg0.substring(Static121.aClass84_49.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_50.method2710(Static372.anInt7083))) {
				local13 = 3;
				arg0 = arg0.substring(Static121.aClass84_50.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_51.method2710(Static372.anInt7083))) {
				local13 = 4;
				arg0 = arg0.substring(Static121.aClass84_51.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_52.method2710(Static372.anInt7083))) {
				local13 = 5;
				arg0 = arg0.substring(Static121.aClass84_52.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_53.method2710(Static372.anInt7083))) {
				local13 = 6;
				arg0 = arg0.substring(Static121.aClass84_53.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_54.method2710(Static372.anInt7083))) {
				local13 = 7;
				arg0 = arg0.substring(Static121.aClass84_54.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_55.method2710(Static372.anInt7083))) {
				local13 = 8;
				arg0 = arg0.substring(Static121.aClass84_55.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Class84.lb.method2710(Static372.anInt7083))) {
				local13 = 9;
				arg0 = arg0.substring(Class84.lb.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_56.method2710(Static372.anInt7083))) {
				local13 = 10;
				arg0 = arg0.substring(Static121.aClass84_56.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_57.method2710(Static372.anInt7083))) {
				local13 = 11;
				arg0 = arg0.substring(Static121.aClass84_57.method2710(Static372.anInt7083).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static121.aClass84_58.method2710(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static121.aClass84_58.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_59.method2710(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static121.aClass84_59.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_60.method2710(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static121.aClass84_60.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_61.method2710(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static121.aClass84_61.method2710(0).length());
		} else if (local11.startsWith(Static121.aClass84_62.method2710(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static121.aClass84_62.method2710(0).length());
		} else if (Static372.anInt7083 != 0) {
			if (local11.startsWith(Static121.aClass84_58.method2710(Static372.anInt7083))) {
				local451 = 1;
				arg0 = arg0.substring(Static121.aClass84_58.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_59.method2710(Static372.anInt7083))) {
				local451 = 2;
				arg0 = arg0.substring(Static121.aClass84_59.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_60.method2710(Static372.anInt7083))) {
				local451 = 3;
				arg0 = arg0.substring(Static121.aClass84_60.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_61.method2710(Static372.anInt7083))) {
				local451 = 4;
				arg0 = arg0.substring(Static121.aClass84_61.method2710(Static372.anInt7083).length());
			} else if (local11.startsWith(Static121.aClass84_62.method2710(Static372.anInt7083))) {
				local451 = 5;
				arg0 = arg0.substring(Static121.aClass84_62.method2710(Static372.anInt7083).length());
			}
		}
		@Pc(641) Class8_Sub31 local641 = Static51.method1418(Static276.aClass257_48, Static608.aClass336_1);
		local641.aClass8_Sub8_Sub2_1.method8562(0);
		@Pc(650) int local650 = local641.aClass8_Sub8_Sub2_1.anInt10588;
		local641.aClass8_Sub8_Sub2_1.method8562(local13);
		local641.aClass8_Sub8_Sub2_1.method8562(local451);
		Static128.method2843(local641.aClass8_Sub8_Sub2_1, arg0);
		local641.aClass8_Sub8_Sub2_1.method8536(local641.aClass8_Sub8_Sub2_1.anInt10588 - local650);
		Static262.method4604(local641);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!vga;I)V")
	private static void method4689(@OriginalArg(0) Class8_Sub5_Sub20 arg0, @OriginalArg(1) int arg1) {
		anInt5745 = 0;
		anInt5748 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray598;
		@Pc(11) int[] local11 = arg0.anIntArray599;
		@Pc(13) byte local13 = -1;
		anInt5756 = 0;
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
						method4695(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method4687(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray333[anInt5745++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray333[anInt5745++] = Static420.aClass77_1.anIntArray137[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static420.aClass77_1.method2394(local54, anIntArray333[--anInt5745]);
					} else if (local31 == 3) {
						aStringArray13[anInt5748++] = arg0.aStringArray38[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt5745 -= 2;
						if (anIntArray333[anInt5745] != anIntArray333[anInt5745 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt5745 -= 2;
						if (anIntArray333[anInt5745] == anIntArray333[anInt5745 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt5745 -= 2;
						if (anIntArray333[anInt5745] < anIntArray333[anInt5745 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt5745 -= 2;
						if (anIntArray333[anInt5745] > anIntArray333[anInt5745 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt5756 == 0) {
							return;
						}
						@Pc(216) Class266 local216 = aClass266Array1[--anInt5756];
						arg0 = local216.aClass8_Sub5_Sub20_1;
						local8 = arg0.anIntArray598;
						local11 = arg0.anIntArray599;
						local5 = local216.anInt8228;
						anIntArray332 = local216.anIntArray441;
						aStringArray14 = local216.aStringArray23;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray333[anInt5745++] = Static420.aClass77_1.method2386(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static420.aClass77_1.method2392(local54, anIntArray333[--anInt5745]);
					} else if (local31 == 31) {
						anInt5745 -= 2;
						if (anIntArray333[anInt5745] <= anIntArray333[anInt5745 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt5745 -= 2;
						if (anIntArray333[anInt5745] >= anIntArray333[anInt5745 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray333[anInt5745++] = anIntArray332[local11[local5]];
					} else if (local31 == 34) {
						anIntArray332[local11[local5]] = anIntArray333[--anInt5745];
					} else if (local31 == 35) {
						aStringArray13[anInt5748++] = aStringArray14[local11[local5]];
					} else if (local31 == 36) {
						aStringArray14[local11[local5]] = aStringArray13[--anInt5748];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt5748 -= local54;
						@Pc(400) String local400 = Static266.method4633(aStringArray13, anInt5748, local54);
						aStringArray13[anInt5748++] = local400;
					} else if (local31 == 38) {
						anInt5745--;
					} else if (local31 == 39) {
						anInt5748--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class8_Sub5_Sub20 local436 = Static378.method5983(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt10212];
							@Pc(450) String[] local450 = new String[local436.anInt10213];
							for (local452 = 0; local452 < local436.anInt10211; local452++) {
								local446[local452] = anIntArray333[anInt5745 + local452 - local436.anInt10211];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt10216; local471++) {
								local450[local471] = aStringArray13[anInt5748 + local471 - local436.anInt10216];
							}
							anInt5745 -= local436.anInt10211;
							anInt5748 -= local436.anInt10216;
							@Pc(502) Class266 local502 = new Class266();
							local502.aClass8_Sub5_Sub20_1 = arg0;
							local502.anInt8228 = local5;
							local502.anIntArray441 = anIntArray332;
							local502.aStringArray23 = aStringArray14;
							if (anInt5756 >= aClass266Array1.length) {
								throw new RuntimeException();
							}
							aClass266Array1[anInt5756++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray598;
							local11 = local436.anIntArray599;
							local5 = -1;
							anIntArray332 = local446;
							aStringArray14 = local450;
						} else if (local31 == 42) {
							anIntArray333[anInt5745++] = Static69.anIntArray417[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static69.anIntArray417[local54] = anIntArray333[--anInt5745];
							Static31.method1117(local54);
							Static359.aBoolean485 |= Static378.aBooleanArray19[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray333[--anInt5745];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray334[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray31[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray333[--anInt5745];
							if (local603 < 0 || local603 >= anIntArray334[local54]) {
								throw new RuntimeException();
							}
							anIntArray333[anInt5745++] = anIntArrayArray31[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt5745 -= 2;
							local603 = anIntArray333[anInt5745];
							if (local603 < 0 || local603 >= anIntArray334[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray31[local54][local603] = anIntArray333[anInt5745 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static2.aStringArray12[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray13[anInt5748++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static2.aStringArray12[local54] = aStringArray13[--anInt5748];
							Static69.method6415(local54);
						} else if (local31 == 51) {
							@Pc(774) Class253 local774 = arg0.aClass253Array1[local11[local5]];
							@Pc(787) Class8_Sub17 local787 = (Class8_Sub17) local774.method6594((long) anIntArray333[--anInt5745]);
							if (local787 != null) {
								local5 += local787.anInt2919;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString109 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong285).append(" ");
				for (local603 = anInt5756 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass266Array1[local603].aClass8_Sub5_Sub20_1.aLong285).append(" ");
				}
				local856.append("op: ").append(local13);
				Static596.method8231(local856.toString(), local837);
			} else {
				Static353.method5583("Clientscript error in: " + arg0.aString109);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString109).append("\n");
				for (local603 = anInt5756 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass266Array1[local603].aClass8_Sub5_Sub20_1.aString109).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static596.method8231(local856.toString(), local837);
				Static481.method7139(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public static void method4691(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static498.method7246(arg0)) {
			return;
		}
		@Pc(12) Class331[] local12 = Static368.aClass331ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class331 local19 = local12[local14];
			if (local19.anObjectArray18 != null) {
				@Pc(26) Class8_Sub40 local26 = new Class8_Sub40();
				local26.aClass331_14 = local19;
				local26.anObjectArray2 = local19.anObjectArray18;
				method4696(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!jt;II)V")
	public static void method4692(@OriginalArg(0) Class165 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class8_Sub5_Sub20 local5 = Static268.method4644(arg2, arg0, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray332 = new int[local5.anInt10212];
		aStringArray14 = new String[local5.anInt10213];
		if (local5.aClass165_12 == Static281.aClass165_3 || local5.aClass165_12 == Static297.aClass165_4 || local5.aClass165_12 == Static162.aClass165_2) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static261.aClass331_8 != null) {
				local30 = Static261.aClass331_8.anInt9528;
				local32 = Static261.aClass331_8.anInt9541;
			}
			anIntArray332[0] = Static288.aClass35_6.method5764() - local30;
			anIntArray332[1] = Static288.aClass35_6.method5761() - local32;
		}
		method4689(local5, 200000);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method4693(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray15[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(IZ)V")
	public static void method4694() {
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(IZ)V")
	private static void method4695(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class331 local137;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(158) Class331 local158;
		@Pc(35) Class331 local35;
		@Pc(210) Class331 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt5745 -= 3;
				local13 = anIntArray333[anInt5745];
				local19 = anIntArray333[anInt5745 + 1];
				local25 = anIntArray333[anInt5745 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static178.method3435(local13);
				if (local35.aClass331Array2 == null) {
					local35.aClass331Array2 = new Class331[local25 + 1];
				}
				if (local35.aClass331Array2.length <= local25) {
					@Pc(54) Class331[] local54 = new Class331[local25 + 1];
					for (local56 = 0; local56 < local35.aClass331Array2.length; local56++) {
						local54[local56] = local35.aClass331Array2[local56];
					}
					local35.aClass331Array2 = local54;
				}
				if (local25 > 0 && local35.aClass331Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class331 local99 = new Class331();
				local99.anInt9490 = local19;
				local99.anInt9509 = local99.anInt9578 = local35.anInt9578;
				local99.anInt9535 = local25;
				local35.aClass331Array2[local25] = local99;
				if (arg1) {
					aClass331_10 = local99;
				} else {
					aClass331_9 = local99;
				}
				Static86.method2113(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass331_10 : aClass331_9;
				if (local137.anInt9535 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static178.method3435(local137.anInt9578);
				local158.aClass331Array2[local137.anInt9535] = null;
				Static86.method2113(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static178.method3435(anIntArray333[--anInt5745]);
				local137.aClass331Array2 = null;
				Static86.method2113(local137);
				return;
			}
			if (arg0 == 200) {
				anInt5745 -= 2;
				local13 = anIntArray333[anInt5745];
				local19 = anIntArray333[anInt5745 + 1];
				local210 = Static201.method3722(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray333[anInt5745++] = 1;
					if (arg1) {
						aClass331_10 = local210;
						return;
					}
					aClass331_9 = local210;
					return;
				}
				anIntArray333[anInt5745++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray333[--anInt5745];
				local158 = Static178.method3435(local13);
				if (local158 != null) {
					anIntArray333[anInt5745++] = 1;
					if (arg1) {
						aClass331_10 = local158;
						return;
					}
					aClass331_9 = local158;
					return;
				}
				anIntArray333[anInt5745++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray333[--anInt5745];
				method4699(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray333[--anInt5745];
				method4686(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt5745 -= 2;
					local13 = anIntArray333[anInt5745];
					local19 = anIntArray333[anInt5745 + 1];
					for (local25 = 0; local25 < Static581.anIntArray581.length; local25++) {
						if (Static581.anIntArray581[local25] == local13) {
							Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1.method7841(Static314.aClass79_1, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static247.anIntArray318.length; local353++) {
						if (Static247.anIntArray318[local353] == local13) {
							Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1.method7841(Static314.aClass79_1, local353, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt5745 -= 2;
					local13 = anIntArray333[anInt5745];
					local19 = anIntArray333[anInt5745 + 1];
					Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1.method7844(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray333[--anInt5745] != 0;
					Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1.method7848(local412);
					return;
				}
				if (arg0 == 411) {
					anInt5745 -= 2;
					local13 = anIntArray333[anInt5745];
					local19 = anIntArray333[anInt5745 + 1];
					Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1.method7842(Static497.aClass258_21, local13, local19);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static178.method3435(anIntArray333[--anInt5745]);
				} else {
					local137 = arg1 ? aClass331_10 : aClass331_9;
				}
				if (arg0 == 1000) {
					anInt5745 -= 4;
					local137.anInt9533 = anIntArray333[anInt5745];
					local137.anInt9510 = anIntArray333[anInt5745 + 1];
					local19 = anIntArray333[anInt5745 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray333[anInt5745 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte107 = (byte) local19;
					local137.aByte110 = (byte) local25;
					Static86.method2113(local137);
					Static191.method3621(local137);
					if (local137.anInt9535 == -1) {
						Static77.method1989(local137.anInt9578);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt5745 -= 4;
					local137.anInt9504 = anIntArray333[anInt5745];
					local137.anInt9571 = anIntArray333[anInt5745 + 1];
					local137.anInt9549 = 0;
					local137.anInt9531 = 0;
					local19 = anIntArray333[anInt5745 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray333[anInt5745 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte109 = (byte) local19;
					local137.aByte108 = (byte) local25;
					Static86.method2113(local137);
					Static191.method3621(local137);
					if (local137.anInt9490 == 0) {
						Static279.method4732(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray333[--anInt5745] == 1;
					if (local137.aBoolean681 != local645) {
						local137.aBoolean681 = local645;
						Static86.method2113(local137);
					}
					if (local137.anInt9535 == -1) {
						Static451.method6859(local137.anInt9578);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt5745 -= 2;
					local137.anInt9542 = anIntArray333[anInt5745];
					local137.anInt9521 = anIntArray333[anInt5745 + 1];
					Static86.method2113(local137);
					Static191.method3621(local137);
					if (local137.anInt9490 == 0) {
						Static279.method4732(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean680 = anIntArray333[--anInt5745] == 1;
					return;
				}
			} else {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static178.method3435(anIntArray333[--anInt5745]);
					} else {
						local137 = arg1 ? aClass331_10 : aClass331_9;
					}
					if (arg0 == 1100) {
						anInt5745 -= 2;
						local137.anInt9501 = anIntArray333[anInt5745];
						if (local137.anInt9501 > local137.anInt9525 - local137.anInt9553) {
							local137.anInt9501 = local137.anInt9525 - local137.anInt9553;
						}
						if (local137.anInt9501 < 0) {
							local137.anInt9501 = 0;
						}
						local137.anInt9503 = anIntArray333[anInt5745 + 1];
						if (local137.anInt9503 > local137.anInt9575 - local137.anInt9505) {
							local137.anInt9503 = local137.anInt9575 - local137.anInt9505;
						}
						if (local137.anInt9503 < 0) {
							local137.anInt9503 = 0;
						}
						Static86.method2113(local137);
						if (local137.anInt9535 == -1) {
							Static89.method2148(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt9572 = anIntArray333[--anInt5745];
						Static86.method2113(local137);
						if (local137.anInt9535 == -1) {
							Static556.method7814(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean669 = anIntArray333[--anInt5745] == 1;
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt9564 = anIntArray333[--anInt5745];
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt9530 = anIntArray333[--anInt5745];
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray333[--anInt5745];
						if (local137.anInt9577 != local19) {
							local137.anInt9577 = local19;
							Static86.method2113(local137);
						}
						if (local137.anInt9535 == -1) {
							Static540.method7646(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt9580 = anIntArray333[--anInt5745];
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean672 = anIntArray333[--anInt5745] == 1;
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt9566 = 1;
						local137.anInt9518 = anIntArray333[--anInt5745];
						Static86.method2113(local137);
						if (local137.anInt9535 == -1) {
							Static522.method7445(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt5745 -= 6;
						local137.anInt9500 = anIntArray333[anInt5745];
						local137.anInt9524 = anIntArray333[anInt5745 + 1];
						local137.anInt9517 = anIntArray333[anInt5745 + 2];
						local137.anInt9550 = anIntArray333[anInt5745 + 3];
						local137.anInt9492 = anIntArray333[anInt5745 + 4];
						local137.anInt9552 = anIntArray333[anInt5745 + 5];
						Static86.method2113(local137);
						if (local137.anInt9535 == -1) {
							Static276.method4708(local137.anInt9578);
							Static16.method758(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray333[--anInt5745];
						if (local137.anInt9579 != local19) {
							local137.anInt9579 = local19;
							local137.anInt9493 = 0;
							local137.anInt9573 = 1;
							local137.anInt9538 = 0;
							@Pc(1094) Class97 local1094 = local137.anInt9579 == -1 ? null : Static28.aClass220_1.method5670(local137.anInt9579);
							if (local1094 != null) {
								Static168.method3340(local1094, local137.anInt9493);
							}
							Static86.method2113(local137);
						}
						if (local137.anInt9535 == -1) {
							Static441.method6808(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean684 = anIntArray333[--anInt5745] == 1;
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray13[--anInt5748];
						if (!local1145.equals(local137.aString100)) {
							local137.aString100 = local1145;
							Static86.method2113(local137);
						}
						if (local137.anInt9535 == -1) {
							Static90.method2150(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt9523 = anIntArray333[--anInt5745];
						Static86.method2113(local137);
						if (local137.anInt9535 == -1) {
							Static145.method3024(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt5745 -= 3;
						local137.anInt9562 = anIntArray333[anInt5745];
						local137.anInt9548 = anIntArray333[anInt5745 + 1];
						local137.anInt9568 = anIntArray333[anInt5745 + 2];
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean677 = anIntArray333[--anInt5745] == 1;
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt9546 = anIntArray333[--anInt5745];
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt9508 = anIntArray333[--anInt5745];
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean674 = anIntArray333[--anInt5745] == 1;
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean670 = anIntArray333[--anInt5745] == 1;
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt5745 -= 2;
						local137.anInt9525 = anIntArray333[anInt5745];
						local137.anInt9575 = anIntArray333[anInt5745 + 1];
						Static86.method2113(local137);
						if (local137.anInt9490 == 0) {
							Static279.method4732(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean683 = anIntArray333[--anInt5745] == 1;
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt9552 = anIntArray333[--anInt5745];
						Static86.method2113(local137);
						if (local137.anInt9535 == -1) {
							Static276.method4708(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray333[--anInt5745];
						local137.aBoolean676 = local19 == 1;
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt5745 -= 2;
						local137.anInt9576 = anIntArray333[anInt5745];
						local137.anInt9559 = anIntArray333[anInt5745 + 1];
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt9497 = anIntArray333[--anInt5745];
						Static86.method2113(local137);
						return;
					}
					@Pc(1473) Class82 local1473;
					if (arg0 == 1127) {
						anInt5745 -= 2;
						local19 = anIntArray333[anInt5745];
						local25 = anIntArray333[anInt5745 + 1];
						local1473 = Static144.aClass274_1.method6933(local19);
						if (local25 != local1473.anInt3023) {
							local137.method7739(local25, local19);
							return;
						}
						local137.method7738(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray333[--anInt5745];
						local1507 = aStringArray13[--anInt5748];
						local1473 = Static144.aClass274_1.method6933(local19);
						if (!local1473.aString33.equals(local1507)) {
							local137.method7743(local19, local1507);
							return;
						}
						local137.method7738(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray333[--anInt5745];
						if (local137.anInt9490 != 5 && arg0 == 1129 || local137.anInt9490 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt9567 != local19) {
							local137.anInt9567 = local19;
							Static86.method2113(local137);
						}
						if (local137.anInt9535 == -1) {
							Static425.method5123(local137.anInt9578);
						}
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static178.method3435(anIntArray333[--anInt5745]);
					} else {
						local137 = arg1 ? aClass331_10 : aClass331_9;
					}
					Static86.method2113(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt5745 -= 2;
						local19 = anIntArray333[anInt5745];
						local25 = anIntArray333[anInt5745 + 1];
						if (local137.anInt9535 == -1) {
							Static603.method8284(local137.anInt9578);
							Static276.method4708(local137.anInt9578);
							Static16.method758(local137.anInt9578);
						}
						if (local19 == -1) {
							local137.anInt9566 = 1;
							local137.anInt9518 = -1;
							local137.anInt9570 = -1;
							return;
						}
						local137.anInt9570 = local19;
						local137.anInt9516 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean685 = true;
						} else {
							local137.aBoolean685 = false;
						}
						@Pc(1697) Class284 local1697 = Static497.aClass258_21.method6652(local19);
						local137.anInt9517 = local1697.anInt8522;
						local137.anInt9550 = local1697.anInt8574;
						local137.anInt9492 = local1697.anInt8549;
						local137.anInt9500 = local1697.anInt8575;
						local137.anInt9524 = local1697.anInt8571;
						local137.anInt9552 = local1697.lb;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt9520 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt9520 = 1;
						} else {
							local137.anInt9520 = 2;
						}
						if (local137.anInt9549 > 0) {
							local137.anInt9552 = local137.anInt9552 * 32 / local137.anInt9549;
							return;
						} else {
							if (local137.anInt9504 > 0) {
								local137.anInt9552 = local137.anInt9552 * 32 / local137.anInt9504;
							}
							return;
						}
					}
					if (arg0 == 1201) {
						local137.anInt9566 = 2;
						local137.anInt9518 = anIntArray333[--anInt5745];
						if (local137.anInt9535 == -1) {
							Static522.method7445(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt9566 = 3;
						local137.anInt9518 = -1;
						if (local137.anInt9535 == -1) {
							Static522.method7445(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt9566 = 6;
						local137.anInt9518 = anIntArray333[--anInt5745];
						if (local137.anInt9535 == -1) {
							Static522.method7445(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt9566 = 5;
						local137.anInt9518 = anIntArray333[--anInt5745];
						if (local137.anInt9535 == -1) {
							Static522.method7445(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt5745 -= 4;
						local137.anInt9529 = anIntArray333[anInt5745];
						local137.anInt9539 = anIntArray333[anInt5745 + 1];
						local137.anInt9560 = anIntArray333[anInt5745 + 2];
						local137.anInt9545 = anIntArray333[anInt5745 + 3];
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt5745 -= 2;
						local137.anInt9582 = anIntArray333[anInt5745];
						local137.anInt9532 = anIntArray333[anInt5745 + 1];
						Static86.method2113(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt5745 -= 4;
						local137.anInt9518 = anIntArray333[anInt5745];
						local137.anInt9495 = anIntArray333[anInt5745 + 1];
						if (anIntArray333[anInt5745 + 2] == 1) {
							local137.anInt9566 = 9;
						} else {
							local137.anInt9566 = 8;
						}
						if (anIntArray333[anInt5745 + 3] == 1) {
							local137.aBoolean685 = true;
						} else {
							local137.aBoolean685 = false;
						}
						if (local137.anInt9535 == -1) {
							Static522.method7445(local137.anInt9578);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt9566 = 5;
						local137.anInt9518 = Static616.anInt10362;
						local137.anInt9495 = 0;
						if (local137.anInt9535 == -1) {
							Static522.method7445(local137.anInt9578);
						}
						return;
					}
				} else {
					@Pc(2357) int local2357;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static178.method3435(anIntArray333[--anInt5745]);
							} else {
								local137 = arg1 ? aClass331_10 : aClass331_9;
							}
							if (arg0 == 1499) {
								local137.method7736();
								return;
							}
							local1145 = aStringArray13[--anInt5748];
							@Pc(2443) int[] local2443 = null;
							if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
								local353 = anIntArray333[--anInt5745];
								if (local353 > 0) {
									local2443 = new int[local353];
									while (local353-- > 0) {
										local2443[local353] = anIntArray333[--anInt5745];
									}
								}
								local1145 = local1145.substring(0, local1145.length() - 1);
							}
							@Pc(2495) Object[] local2495 = new Object[local1145.length() + 1];
							for (local2357 = local2495.length - 1; local2357 >= 1; local2357--) {
								if (local1145.charAt(local2357 - 1) == 's') {
									local2495[local2357] = aStringArray13[--anInt5748];
								} else {
									local2495[local2357] = Integer.valueOf(anIntArray333[--anInt5745]);
								}
							}
							local56 = anIntArray333[--anInt5745];
							if (local56 == -1) {
								local2495 = null;
							} else {
								local2495[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray6 = local2495;
							} else if (arg0 == 1401) {
								local137.anObjectArray29 = local2495;
							} else if (arg0 == 1402) {
								local137.anObjectArray14 = local2495;
							} else if (arg0 == 1403) {
								local137.anObjectArray11 = local2495;
							} else if (arg0 == 1404) {
								local137.anObjectArray24 = local2495;
							} else if (arg0 == 1405) {
								local137.anObjectArray4 = local2495;
							} else if (arg0 == 1406) {
								local137.anObjectArray31 = local2495;
							} else if (arg0 == 1407) {
								local137.anObjectArray21 = local2495;
								local137.anIntArray526 = local2443;
							} else if (arg0 == 1408) {
								local137.anObjectArray30 = local2495;
							} else if (arg0 == 1409) {
								local137.anObjectArray10 = local2495;
							} else if (arg0 == 1410) {
								local137.anObjectArray17 = local2495;
							} else if (arg0 == 1411) {
								local137.anObjectArray3 = local2495;
							} else if (arg0 == 1412) {
								local137.anObjectArray9 = local2495;
							} else if (arg0 == 1414) {
								local137.anObjectArray13 = local2495;
								local137.anIntArray522 = local2443;
							} else if (arg0 == 1415) {
								local137.anObjectArray28 = local2495;
								local137.anIntArray528 = local2443;
							} else if (arg0 == 1416) {
								local137.anObjectArray20 = local2495;
							} else if (arg0 == 1417) {
								local137.anObjectArray22 = local2495;
							} else if (arg0 == 1418) {
								local137.anObjectArray19 = local2495;
							} else if (arg0 == 1419) {
								local137.anObjectArray5 = local2495;
							} else if (arg0 == 1420) {
								local137.anObjectArray12 = local2495;
							} else if (arg0 == 1421) {
								local137.anObjectArray25 = local2495;
							} else if (arg0 == 1422) {
								local137.anObjectArray32 = local2495;
							} else if (arg0 == 1423) {
								local137.anObjectArray7 = local2495;
							} else if (arg0 == 1424) {
								local137.anObjectArray15 = local2495;
							} else if (arg0 == 1425) {
								local137.anObjectArray26 = local2495;
							} else if (arg0 == 1426) {
								local137.anObjectArray27 = local2495;
							} else if (arg0 == 1427) {
								local137.lb = local2495;
							} else if (arg0 == 1428) {
								local137.anObjectArray16 = local2495;
								local137.anIntArray527 = local2443;
							} else if (arg0 == 1429) {
								local137.anObjectArray23 = local2495;
								local137.anIntArray520 = local2443;
							} else if (arg0 == 1430) {
								local137.anObjectArray8 = local2495;
							}
							local137.aBoolean673 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass331_10 : aClass331_9;
							if (arg0 == 1500) {
								anIntArray333[anInt5745++] = local137.anInt9528;
								return;
							}
							if (arg0 == 1501) {
								anIntArray333[anInt5745++] = local137.anInt9541;
								return;
							}
							if (arg0 == 1502) {
								anIntArray333[anInt5745++] = local137.anInt9553;
								return;
							}
							if (arg0 == 1503) {
								anIntArray333[anInt5745++] = local137.anInt9505;
								return;
							}
							if (arg0 == 1504) {
								anIntArray333[anInt5745++] = local137.aBoolean681 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray333[anInt5745++] = local137.anInt9509;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static222.method4170(local137);
								anIntArray333[anInt5745++] = local158 == null ? -1 : local158.anInt9578;
								return;
							}
						} else {
							@Pc(3091) Class82 local3091;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass331_10 : aClass331_9;
								if (arg0 == 1600) {
									anIntArray333[anInt5745++] = local137.anInt9501;
									return;
								}
								if (arg0 == 1601) {
									anIntArray333[anInt5745++] = local137.anInt9503;
									return;
								}
								if (arg0 == 1602) {
									aStringArray13[anInt5748++] = local137.aString100;
									return;
								}
								if (arg0 == 1603) {
									anIntArray333[anInt5745++] = local137.anInt9525;
									return;
								}
								if (arg0 == 1604) {
									anIntArray333[anInt5745++] = local137.anInt9575;
									return;
								}
								if (arg0 == 1605) {
									anIntArray333[anInt5745++] = local137.anInt9552;
									return;
								}
								if (arg0 == 1606) {
									anIntArray333[anInt5745++] = local137.anInt9517;
									return;
								}
								if (arg0 == 1607) {
									anIntArray333[anInt5745++] = local137.anInt9492;
									return;
								}
								if (arg0 == 1608) {
									anIntArray333[anInt5745++] = local137.anInt9550;
									return;
								}
								if (arg0 == 1609) {
									anIntArray333[anInt5745++] = local137.anInt9564;
									return;
								}
								if (arg0 == 1610) {
									anIntArray333[anInt5745++] = local137.anInt9500;
									return;
								}
								if (arg0 == 1611) {
									anIntArray333[anInt5745++] = local137.anInt9524;
									return;
								}
								if (arg0 == 1612) {
									anIntArray333[anInt5745++] = local137.anInt9577;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray333[--anInt5745];
									local3091 = Static144.aClass274_1.method6933(local19);
									if (local3091.method2612()) {
										aStringArray13[anInt5748++] = local137.method7751(local3091.aString33, local19);
										return;
									}
									anIntArray333[anInt5745++] = local137.method7734(local3091.anInt3023, local19);
									return;
								}
								if (arg0 == 1614) {
									anIntArray333[anInt5745++] = local137.anInt9580;
									return;
								}
								if (arg0 == 2614) {
									anIntArray333[anInt5745++] = local137.anInt9566 == 1 ? local137.anInt9518 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass331_10 : aClass331_9;
								if (arg0 == 1700) {
									anIntArray333[anInt5745++] = local137.anInt9570;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt9570 != -1) {
										anIntArray333[anInt5745++] = local137.anInt9516;
										return;
									}
									anIntArray333[anInt5745++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray333[anInt5745++] = local137.anInt9535;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass331_10 : aClass331_9;
								if (arg0 == 1800) {
									anIntArray333[anInt5745++] = Static73.method1921(local137).method5219();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray333[--anInt5745];
									local19--;
									if (local137.aStringArray34 != null && local19 < local137.aStringArray34.length && local137.aStringArray34[local19] != null) {
										aStringArray13[anInt5748++] = local137.aStringArray34[local19];
										return;
									}
									aStringArray13[anInt5748++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString101 == null) {
										aStringArray13[anInt5748++] = "";
										return;
									}
									aStringArray13[anInt5748++] = local137.aString101;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static178.method3435(anIntArray333[--anInt5745]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass331_10 : aClass331_9;
								}
								if (anInt5757 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.lb == null) {
										return;
									}
									@Pc(3360) Class8_Sub40 local3360 = new Class8_Sub40();
									local3360.aClass331_14 = local137;
									local3360.anObjectArray2 = local137.lb;
									local3360.anInt7830 = anInt5757 + 1;
									Static203.aClass43_28.method1424(local3360);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static178.method3435(anIntArray333[--anInt5745]);
								if (arg0 == 2500) {
									anIntArray333[anInt5745++] = local137.anInt9528;
									return;
								}
								if (arg0 == 2501) {
									anIntArray333[anInt5745++] = local137.anInt9541;
									return;
								}
								if (arg0 == 2502) {
									anIntArray333[anInt5745++] = local137.anInt9553;
									return;
								}
								if (arg0 == 2503) {
									anIntArray333[anInt5745++] = local137.anInt9505;
									return;
								}
								if (arg0 == 2504) {
									anIntArray333[anInt5745++] = local137.aBoolean681 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray333[anInt5745++] = local137.anInt9509;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static222.method4170(local137);
									anIntArray333[anInt5745++] = local158 == null ? -1 : local158.anInt9578;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static178.method3435(anIntArray333[--anInt5745]);
								if (arg0 == 2600) {
									anIntArray333[anInt5745++] = local137.anInt9501;
									return;
								}
								if (arg0 == 2601) {
									anIntArray333[anInt5745++] = local137.anInt9503;
									return;
								}
								if (arg0 == 2602) {
									aStringArray13[anInt5748++] = local137.aString100;
									return;
								}
								if (arg0 == 2603) {
									anIntArray333[anInt5745++] = local137.anInt9525;
									return;
								}
								if (arg0 == 2604) {
									anIntArray333[anInt5745++] = local137.anInt9575;
									return;
								}
								if (arg0 == 2605) {
									anIntArray333[anInt5745++] = local137.anInt9552;
									return;
								}
								if (arg0 == 2606) {
									anIntArray333[anInt5745++] = local137.anInt9517;
									return;
								}
								if (arg0 == 2607) {
									anIntArray333[anInt5745++] = local137.anInt9492;
									return;
								}
								if (arg0 == 2608) {
									anIntArray333[anInt5745++] = local137.anInt9550;
									return;
								}
								if (arg0 == 2609) {
									anIntArray333[anInt5745++] = local137.anInt9564;
									return;
								}
								if (arg0 == 2610) {
									anIntArray333[anInt5745++] = local137.anInt9500;
									return;
								}
								if (arg0 == 2611) {
									anIntArray333[anInt5745++] = local137.anInt9524;
									return;
								}
								if (arg0 == 2612) {
									anIntArray333[anInt5745++] = local137.anInt9577;
									return;
								}
								if (arg0 == 2613) {
									anIntArray333[anInt5745++] = local137.anInt9580;
									return;
								}
								if (arg0 == 2614) {
									anIntArray333[anInt5745++] = local137.anInt9566 == 1 ? local137.anInt9518 : -1;
									return;
								}
							} else {
								@Pc(3889) Class8_Sub51 local3889;
								@Pc(3787) Class8_Sub51 local3787;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static178.method3435(anIntArray333[--anInt5745]);
										anIntArray333[anInt5745++] = local137.anInt9570;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static178.method3435(anIntArray333[--anInt5745]);
										if (local137.anInt9570 != -1) {
											anIntArray333[anInt5745++] = local137.anInt9516;
											return;
										}
										anIntArray333[anInt5745++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray333[--anInt5745];
										local3787 = (Class8_Sub51) Static218.aClass253_14.method6594((long) local13);
										if (local3787 != null) {
											anIntArray333[anInt5745++] = 1;
											return;
										}
										anIntArray333[anInt5745++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static178.method3435(anIntArray333[--anInt5745]);
										if (local137.aClass331Array2 == null) {
											anIntArray333[anInt5745++] = 0;
											return;
										}
										local19 = local137.aClass331Array2.length;
										for (local25 = 0; local25 < local137.aClass331Array2.length; local25++) {
											if (local137.aClass331Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray333[anInt5745++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt5745 -= 2;
										local13 = anIntArray333[anInt5745];
										local19 = anIntArray333[anInt5745 + 1];
										local3889 = (Class8_Sub51) Static218.aClass253_14.method6594((long) local13);
										if (local3889 != null && local3889.anInt10454 == local19) {
											anIntArray333[anInt5745++] = 1;
											return;
										}
										anIntArray333[anInt5745++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static178.method3435(anIntArray333[--anInt5745]);
									if (arg0 == 2800) {
										anIntArray333[anInt5745++] = Static73.method1921(local137).method5219();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray333[--anInt5745];
										local19--;
										if (local137.aStringArray34 != null && local19 < local137.aStringArray34.length && local137.aStringArray34[local19] != null) {
											aStringArray13[anInt5748++] = local137.aStringArray34[local19];
											return;
										}
										aStringArray13[anInt5748++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString101 == null) {
											aStringArray13[anInt5748++] = "";
											return;
										}
										aStringArray13[anInt5748++] = local137.aString101;
										return;
									}
								} else {
									@Pc(4026) String local4026;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4026 = aStringArray13[--anInt5748];
											Static489.method7178(local4026);
											return;
										}
										if (arg0 == 3101) {
											anInt5745 -= 2;
											Static361.method5673(anIntArray333[anInt5745 + 1], Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2, anIntArray333[anInt5745]);
											return;
										}
										if (arg0 == 3103) {
											Static466.method7017();
											return;
										}
										if (arg0 == 3104) {
											local4026 = aStringArray13[--anInt5748];
											local19 = 0;
											if (Static577.method8064(local4026)) {
												local19 = Static82.method2080(local4026);
											}
											@Pc(4086) Class8_Sub31 local4086 = Static51.method1418(Static519.aClass257_97, Static608.aClass336_1);
											local4086.aClass8_Sub8_Sub2_1.method8523(local19);
											Static262.method4604(local4086);
											return;
										}
										@Pc(4115) Class8_Sub31 local4115;
										if (arg0 == 3105) {
											local4026 = aStringArray13[--anInt5748];
											local4115 = Static51.method1418(Static391.aClass257_73, Static608.aClass336_1);
											local4115.aClass8_Sub8_Sub2_1.method8562(local4026.length() + 1);
											local4115.aClass8_Sub8_Sub2_1.method8582(local4026);
											Static262.method4604(local4115);
											return;
										}
										if (arg0 == 3106) {
											local4026 = aStringArray13[--anInt5748];
											local4115 = Static51.method1418(Static602.aClass257_118, Static608.aClass336_1);
											local4115.aClass8_Sub8_Sub2_1.method8562(local4026.length() + 1);
											local4115.aClass8_Sub8_Sub2_1.method8582(local4026);
											Static262.method4604(local4115);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray333[--anInt5745];
											local1145 = aStringArray13[--anInt5748];
											Static344.method5472(local1145, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt5745 -= 3;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local25 = anIntArray333[anInt5745 + 2];
											local35 = Static178.method3435(local25);
											Static282.method4764(local19, local35, local13);
											return;
										}
										if (arg0 == 3109) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local210 = arg1 ? aClass331_10 : aClass331_9;
											Static282.method4764(local19, local210, local13);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray333[--anInt5745];
											local4115 = Static51.method1418(Static325.aClass257_62, Static608.aClass336_1);
											local4115.aClass8_Sub8_Sub2_1.method8548(local13);
											Static262.method4604(local4115);
											return;
										}
										if (arg0 == 3111) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local3889 = (Class8_Sub51) Static218.aClass253_14.method6594((long) local13);
											if (local3889 != null) {
												Static406.method6452(local3889.anInt10454 != local19, local3889, true);
											}
											Static36.method1265(true, local13, 3, local19);
											return;
										}
										if (arg0 == 3112) {
											anInt5745--;
											local13 = anIntArray333[anInt5745];
											local3787 = (Class8_Sub51) Static218.aClass253_14.method6594((long) local13);
											if (local3787 != null && local3787.anInt10453 == 3) {
												Static406.method6452(true, local3787, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static139.method2953(aStringArray13[--anInt5748]);
											return;
										}
										if (arg0 == 3114) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local1507 = aStringArray13[--anInt5748];
											Static170.method3363(local1507, "", local13, local19, "", "");
											return;
										}
										if (arg0 == 3115) {
											anInt5745 -= 11;
											@Pc(4416) Class173[] local4416 = Static148.method5412();
											@Pc(4419) Class60[] local4419 = Static593.method8190();
											Static560.method7827(anIntArray333[anInt5745 + 4], anIntArray333[anInt5745 + 3], anIntArray333[anInt5745 + 8], anIntArray333[anInt5745 + 7], anIntArray333[anInt5745 + 9], anIntArray333[anInt5745 + 6], anIntArray333[anInt5745 + 10], anIntArray333[anInt5745 + 5], anIntArray333[anInt5745 + 2], local4419[anIntArray333[anInt5745 + 1]], local4416[anIntArray333[anInt5745]]);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt5745 -= 3;
											Static143.method2988(256, anIntArray333[anInt5745 + 1], anIntArray333[anInt5745], 255, anIntArray333[anInt5745 + 2]);
											return;
										}
										if (arg0 == 3201) {
											Static103.method2362(50, anIntArray333[--anInt5745], 255);
											return;
										}
										if (arg0 == 3202) {
											anInt5745 -= 2;
											Static163.method3265(255, anIntArray333[anInt5745 + 1], anIntArray333[anInt5745]);
											return;
										}
										if (arg0 == 3203) {
											anInt5745 -= 4;
											Static143.method2988(256, anIntArray333[anInt5745 + 1], anIntArray333[anInt5745], anIntArray333[anInt5745 + 3], anIntArray333[anInt5745 + 2]);
											return;
										}
										if (arg0 == 3204) {
											anInt5745 -= 3;
											Static103.method2362(anIntArray333[anInt5745 + 2], anIntArray333[anInt5745], anIntArray333[anInt5745 + 1]);
											return;
										}
										if (arg0 == 3205) {
											anInt5745 -= 3;
											Static163.method3265(anIntArray333[anInt5745 + 2], anIntArray333[anInt5745 + 1], anIntArray333[anInt5745]);
											return;
										}
										if (arg0 == 3206) {
											anInt5745 -= 4;
											Static343.method5470(anIntArray333[anInt5745 + 2], false, anIntArray333[anInt5745 + 1], 256, anIntArray333[anInt5745], anIntArray333[anInt5745 + 3]);
											return;
										}
										if (arg0 == 3207) {
											anInt5745 -= 4;
											Static343.method5470(anIntArray333[anInt5745 + 2], true, anIntArray333[anInt5745 + 1], 256, anIntArray333[anInt5745], anIntArray333[anInt5745 + 3]);
											return;
										}
										if (arg0 == 3208) {
											anInt5745 -= 5;
											Static143.method2988(anIntArray333[anInt5745 + 4], anIntArray333[anInt5745 + 1], anIntArray333[anInt5745], anIntArray333[anInt5745 + 3], anIntArray333[anInt5745 + 2]);
											return;
										}
										if (arg0 == 3209) {
											anInt5745 -= 5;
											Static343.method5470(anIntArray333[anInt5745 + 2], false, anIntArray333[anInt5745 + 1], anIntArray333[anInt5745 + 4], anIntArray333[anInt5745], anIntArray333[anInt5745 + 3]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray333[anInt5745++] = Static435.anInt8192;
											return;
										}
										if (arg0 == 3301) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = Static629.method8473(local19, false, local13);
											return;
										}
										if (arg0 == 3302) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = Static243.method4441(local13, false, local19);
											return;
										}
										if (arg0 == 3303) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = Static206.method7638(false, local13, local19);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static446.aClass92_3.method2947(local13).anInt8340;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static42.anIntArray60[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static99.anIntArray117[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static560.anIntArray532[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4944) byte local4944 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124;
											local19 = (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301 >> 9) + Static628.anInt10493;
											local25 = (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298 >> 9) + Static594.anInt10160;
											anIntArray333[anInt5745++] = (local4944 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray333[anInt5745++] = Static565.aBoolean307 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = Static629.method8473(local19, true, local13);
											return;
										}
										if (arg0 == 3314) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = Static243.method4441(local13, true, local19);
											return;
										}
										if (arg0 == 3315) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = Static206.method7638(true, local13, local19);
											return;
										}
										if (arg0 == 3316) {
											if (Static190.anInt7431 >= 2) {
												anIntArray333[anInt5745++] = Static190.anInt7431;
												return;
											}
											anIntArray333[anInt5745++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray333[anInt5745++] = Static128.anInt3427;
											return;
										}
										if (arg0 == 3318) {
											anIntArray333[anInt5745++] = Static471.aClass280_2.anInt8497;
											return;
										}
										if (arg0 == 3321) {
											anIntArray333[anInt5745++] = Static176.anInt4174;
											return;
										}
										if (arg0 == 3322) {
											anIntArray333[anInt5745++] = Static624.anInt10422;
											return;
										}
										if (arg0 == 3323) {
											if (Static218.anInt5024 >= 5 && Static218.anInt5024 <= 9) {
												anIntArray333[anInt5745++] = 1;
												return;
											}
											anIntArray333[anInt5745++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static218.anInt5024 >= 5 && Static218.anInt5024 <= 9) {
												anIntArray333[anInt5745++] = Static218.anInt5024;
												return;
											}
											anIntArray333[anInt5745++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray333[anInt5745++] = Static420.aBoolean573 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray333[anInt5745++] = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3300;
											return;
										}
										if (arg0 == 3327) {
											anIntArray333[anInt5745++] = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1.aBoolean689 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray333[anInt5745++] = Static321.aBoolean449 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static140.method2958(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = Static295.method4892(false, local19, local13);
											return;
										}
										if (arg0 == 3332) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = Static295.method4892(true, local19, local13);
											return;
										}
										if (arg0 == 3333) {
											anIntArray333[anInt5745++] = Static99.anInt2642;
											return;
										}
										if (arg0 == 3335) {
											anIntArray333[anInt5745++] = Static372.anInt7083;
											return;
										}
										if (arg0 == 3336) {
											anInt5745 -= 4;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local25 = anIntArray333[anInt5745 + 2];
											local353 = anIntArray333[anInt5745 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray333[anInt5745++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray333[anInt5745++] = Static60.anInt1930;
											return;
										}
										if (arg0 == 3338) {
											anIntArray333[anInt5745++] = Static341.method5460();
											return;
										}
										if (arg0 == 3339) {
											anIntArray333[anInt5745++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray333[anInt5745++] = Static216.aBoolean372 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray333[anInt5745++] = Static150.aBoolean273 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray333[anInt5745++] = Static288.aClass35_6.method5764();
											return;
										}
										if (arg0 == 3343) {
											anIntArray333[anInt5745++] = Static288.aClass35_6.method5761();
											return;
										}
										if (arg0 == 3344) {
											aStringArray13[anInt5748++] = Static274.method4701();
											return;
										}
										if (arg0 == 3345) {
											aStringArray13[anInt5748++] = Static246.method4460();
											return;
										}
										if (arg0 == 3346) {
											anIntArray333[anInt5745++] = Static560.method7829();
											return;
										}
										if (arg0 == 3347) {
											anIntArray333[anInt5745++] = Static601.anInt10242;
											return;
										}
										if (arg0 == 3349) {
											anIntArray333[anInt5745++] = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass371_7.method8432() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5692) Class315 local5692;
										if (arg0 == 3400) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local5692 = Static592.aClass95_1.method2955(local13);
											aStringArray13[anInt5748++] = local5692.method7453(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt5745 -= 4;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local25 = anIntArray333[anInt5745 + 2];
											local353 = anIntArray333[anInt5745 + 3];
											@Pc(5738) Class315 local5738 = Static592.aClass95_1.method2955(local25);
											if (local5738.aChar5 == local13 && local5738.aChar4 == local19) {
												if (local19 == 115) {
													aStringArray13[anInt5748++] = local5738.method7453(local353);
													return;
												}
												anIntArray333[anInt5745++] = local5738.method7451(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt5745 -= 3;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local25 = anIntArray333[anInt5745 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5814) Class315 local5814 = Static592.aClass95_1.method2955(local19);
											if (local5814.aChar4 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray333[anInt5745++] = local5814.method7452(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray333[--anInt5745];
											local1145 = aStringArray13[--anInt5748];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5692 = Static592.aClass95_1.method2955(local13);
											if (local5692.aChar4 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray333[anInt5745++] = local5692.method7456(local1145) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray333[--anInt5745];
											@Pc(5912) Class315 local5912 = Static592.aClass95_1.method2955(local13);
											anIntArray333[anInt5745++] = local5912.aClass253_35.method6592();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static469.anInt8486 == 0) {
												anIntArray333[anInt5745++] = -2;
												return;
											}
											if (Static469.anInt8486 == 1) {
												anIntArray333[anInt5745++] = -1;
												return;
											}
											anIntArray333[anInt5745++] = Static530.anInt9157;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray333[--anInt5745];
											if (Static469.anInt8486 == 2 && local13 < Static530.anInt9157) {
												aStringArray13[anInt5748++] = Static54.aStringArray6[local13];
												if (Static582.aStringArray36[local13] != null) {
													aStringArray13[anInt5748++] = Static582.aStringArray36[local13];
													return;
												}
												aStringArray13[anInt5748++] = "";
												return;
											}
											aStringArray13[anInt5748++] = "";
											aStringArray13[anInt5748++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray333[--anInt5745];
											if (Static469.anInt8486 == 2 && local13 < Static530.anInt9157) {
												anIntArray333[anInt5745++] = Static620.anIntArray608[local13];
												return;
											}
											anIntArray333[anInt5745++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray333[--anInt5745];
											if (Static469.anInt8486 == 2 && local13 < Static530.anInt9157) {
												anIntArray333[anInt5745++] = Static101.anIntArray135[local13];
												return;
											}
											anIntArray333[anInt5745++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4026 = aStringArray13[--anInt5748];
											local19 = anIntArray333[--anInt5745];
											Static301.method4917(local4026, local19);
											return;
										}
										if (arg0 == 3605) {
											local4026 = aStringArray13[--anInt5748];
											Static590.method8154(local4026);
											return;
										}
										if (arg0 == 3606) {
											local4026 = aStringArray13[--anInt5748];
											Static312.method5162(local4026);
											return;
										}
										if (arg0 == 3607) {
											local4026 = aStringArray13[--anInt5748];
											Static422.method6596(false, local4026);
											return;
										}
										if (arg0 == 3608) {
											local4026 = aStringArray13[--anInt5748];
											Static316.method5208(local4026);
											return;
										}
										if (arg0 == 3609) {
											local4026 = aStringArray13[--anInt5748];
											if (local4026.startsWith("<img=0>") || local4026.startsWith("<img=1>")) {
												local4026 = local4026.substring(7);
											}
											anIntArray333[anInt5745++] = Static127.method2820(local4026) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray333[--anInt5745];
											if (Static469.anInt8486 == 2 && local13 < Static530.anInt9157) {
												aStringArray13[anInt5748++] = Static3.aStringArray2[local13];
												return;
											}
											aStringArray13[anInt5748++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static220.aString61 != null) {
												aStringArray13[anInt5748++] = Static520.method7417(Static220.aString61);
												return;
											}
											aStringArray13[anInt5748++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static220.aString61 != null) {
												anIntArray333[anInt5745++] = Static198.anInt4608;
												return;
											}
											anIntArray333[anInt5745++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray333[--anInt5745];
											if (Static220.aString61 != null && local13 < Static198.anInt4608) {
												aStringArray13[anInt5748++] = Static29.aClass249Array1[local13].aString82;
												return;
											}
											aStringArray13[anInt5748++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray333[--anInt5745];
											if (Static220.aString61 != null && local13 < Static198.anInt4608) {
												anIntArray333[anInt5745++] = Static29.aClass249Array1[local13].anInt7875;
												return;
											}
											anIntArray333[anInt5745++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray333[--anInt5745];
											if (Static220.aString61 != null && local13 < Static198.anInt4608) {
												anIntArray333[anInt5745++] = Static29.aClass249Array1[local13].aByte79;
												return;
											}
											anIntArray333[anInt5745++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray333[anInt5745++] = Static638.aByte130;
											return;
										}
										if (arg0 == 3617) {
											local4026 = aStringArray13[--anInt5748];
											Static617.method8374(local4026);
											return;
										}
										if (arg0 == 3618) {
											anIntArray333[anInt5745++] = Static20.aByte5;
											return;
										}
										if (arg0 == 3619) {
											local4026 = aStringArray13[--anInt5748];
											Static299.method4908(local4026);
											return;
										}
										if (arg0 == 3620) {
											Static432.method6714();
											return;
										}
										if (arg0 == 3621) {
											if (Static469.anInt8486 == 0) {
												anIntArray333[anInt5745++] = -1;
												return;
											}
											anIntArray333[anInt5745++] = Static554.anInt9637;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray333[--anInt5745];
											if (Static469.anInt8486 != 0 && local13 < Static554.anInt9637) {
												aStringArray13[anInt5748++] = Static525.aStringArray32[local13];
												if (Static304.aStringArray18[local13] != null) {
													aStringArray13[anInt5748++] = Static304.aStringArray18[local13];
													return;
												}
												aStringArray13[anInt5748++] = "";
												return;
											}
											aStringArray13[anInt5748++] = "";
											aStringArray13[anInt5748++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4026 = aStringArray13[--anInt5748];
											if (local4026.startsWith("<img=0>") || local4026.startsWith("<img=1>")) {
												local4026 = local4026.substring(7);
											}
											anIntArray333[anInt5745++] = Static342.method5461(local4026) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray333[--anInt5745];
											if (Static29.aClass249Array1 != null && local13 < Static198.anInt4608 && Static29.aClass249Array1[local13].aString79.equalsIgnoreCase(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aString35)) {
												anIntArray333[anInt5745++] = 1;
												return;
											}
											anIntArray333[anInt5745++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static340.aString70 != null) {
												aStringArray13[anInt5748++] = Static340.aString70;
												return;
											}
											aStringArray13[anInt5748++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray333[--anInt5745];
											if (Static220.aString61 != null && local13 < Static198.anInt4608) {
												aStringArray13[anInt5748++] = Static29.aClass249Array1[local13].aString81;
												return;
											}
											aStringArray13[anInt5748++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray333[--anInt5745];
											if (Static469.anInt8486 == 2 && local13 >= 0 && local13 < Static530.anInt9157) {
												anIntArray333[anInt5745++] = Static102.aBooleanArray5[local13] ? 1 : 0;
												return;
											}
											anIntArray333[anInt5745++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4026 = aStringArray13[--anInt5748];
											if (local4026.startsWith("<img=0>") || local4026.startsWith("<img=1>")) {
												local4026 = local4026.substring(7);
											}
											anIntArray333[anInt5745++] = Static517.method7404(local4026);
											return;
										}
										if (arg0 == 3629) {
											anIntArray333[anInt5745++] = Static550.anInt10292;
											return;
										}
										if (arg0 == 3630) {
											local4026 = aStringArray13[--anInt5748];
											Static422.method6596(true, local4026);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static423.aBooleanArray23[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray333[--anInt5745];
											if (Static220.aString61 != null && local13 < Static198.anInt4608) {
												aStringArray13[anInt5748++] = Static29.aClass249Array1[local13].aString79;
												return;
											}
											aStringArray13[anInt5748++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray333[--anInt5745];
											if (Static469.anInt8486 != 0 && local13 < Static554.anInt9637) {
												aStringArray13[anInt5748++] = Static512.aStringArray31[local13];
												return;
											}
											aStringArray13[anInt5748++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static28.aClass305Array1[local13].method7345();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static28.aClass305Array1[local13].anInt8951;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static28.aClass305Array1[local13].anInt8946;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static28.aClass305Array1[local13].anInt8949;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static28.aClass305Array1[local13].anInt8945;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static28.aClass305Array1[local13].anInt8948;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray333[--anInt5745];
											local19 = Static28.aClass305Array1[local13].method7346();
											anIntArray333[anInt5745++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray333[--anInt5745];
											local19 = Static28.aClass305Array1[local13].method7346();
											anIntArray333[anInt5745++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray333[--anInt5745];
											local19 = Static28.aClass305Array1[local13].method7346();
											anIntArray333[anInt5745++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray333[--anInt5745];
											local19 = Static28.aClass305Array1[local13].method7346();
											anIntArray333[anInt5745++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt5745 -= 5;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local25 = anIntArray333[anInt5745 + 2];
											local353 = anIntArray333[anInt5745 + 3];
											local2357 = anIntArray333[anInt5745 + 4];
											anIntArray333[anInt5745++] = local13 + (local19 - local13) * (local2357 - local25) / (local353 - local25);
											return;
										}
										@Pc(7422) long local7422;
										@Pc(7415) long local7415;
										if (arg0 == 4007) {
											anInt5745 -= 2;
											local7415 = anIntArray333[anInt5745];
											local7422 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = (int) (local7415 + local7415 * local7422 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											if (local13 == 0) {
												anIntArray333[anInt5745++] = 0;
												return;
											}
											anIntArray333[anInt5745++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											if (local13 == 0) {
												anIntArray333[anInt5745++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray333[anInt5745++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray333[anInt5745++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt5745 -= 3;
											local7415 = anIntArray333[anInt5745];
											local7422 = anIntArray333[anInt5745 + 1];
											@Pc(7803) long local7803 = (long) anIntArray333[anInt5745 + 2];
											anIntArray333[anInt5745++] = (int) (local7415 * local7803 / local7422);
											return;
										}
										if (arg0 == 4019) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											if (local13 > 700 || local19 > 700) {
												anIntArray333[anInt5745++] = 256;
											}
											@Pc(7862) double local7862 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
											anIntArray333[anInt5745++] = (int) (Math.pow(2.0D, local7862) + 0.5D);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local4026 = aStringArray13[--anInt5748];
											local19 = anIntArray333[--anInt5745];
											aStringArray13[anInt5748++] = local4026 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt5748 -= 2;
											local4026 = aStringArray13[anInt5748];
											local1145 = aStringArray13[anInt5748 + 1];
											aStringArray13[anInt5748++] = local4026 + local1145;
											return;
										}
										if (arg0 == 4102) {
											local4026 = aStringArray13[--anInt5748];
											local19 = anIntArray333[--anInt5745];
											aStringArray13[anInt5748++] = local4026 + Static230.method4273(local19);
											return;
										}
										if (arg0 == 4103) {
											local4026 = aStringArray13[--anInt5748];
											aStringArray13[anInt5748++] = local4026.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray13[anInt5748++] = method4693(anIntArray333[--anInt5745]);
											return;
										}
										if (arg0 == 4105) {
											anInt5748 -= 2;
											local4026 = aStringArray13[anInt5748];
											local1145 = aStringArray13[anInt5748 + 1];
											if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1 != null && Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1.aBoolean689) {
												aStringArray13[anInt5748++] = local1145;
												return;
											}
											aStringArray13[anInt5748++] = local4026;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray333[--anInt5745];
											aStringArray13[anInt5748++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt5748 -= 2;
											anIntArray333[anInt5745++] = Static35.method7918(aStringArray13[anInt5748 + 1], Static372.anInt7083, aStringArray13[anInt5748]);
											return;
										}
										@Pc(8145) Class345 local8145;
										if (arg0 == 4108) {
											local4026 = aStringArray13[--anInt5748];
											anInt5745 -= 2;
											local19 = anIntArray333[anInt5745];
											local25 = anIntArray333[anInt5745 + 1];
											local8145 = Static288.method3439(Static264.aClass237_69, local25);
											anIntArray333[anInt5745++] = local8145.method8111(Static158.aClass21Array8, local4026, local19);
											return;
										}
										if (arg0 == 4109) {
											local4026 = aStringArray13[--anInt5748];
											anInt5745 -= 2;
											local19 = anIntArray333[anInt5745];
											local25 = anIntArray333[anInt5745 + 1];
											local8145 = Static288.method3439(Static264.aClass237_69, local25);
											anIntArray333[anInt5745++] = local8145.method8116(Static158.aClass21Array8, local4026, local19);
											return;
										}
										if (arg0 == 4110) {
											anInt5748 -= 2;
											local4026 = aStringArray13[anInt5748];
											local1145 = aStringArray13[anInt5748 + 1];
											if (anIntArray333[--anInt5745] == 1) {
												aStringArray13[anInt5748++] = local4026;
												return;
											}
											aStringArray13[anInt5748++] = local1145;
											return;
										}
										if (arg0 == 4111) {
											local4026 = aStringArray13[--anInt5748];
											aStringArray13[anInt5748++] = Static378.method5954(local4026);
											return;
										}
										if (arg0 == 4112) {
											local4026 = aStringArray13[--anInt5748];
											local19 = anIntArray333[--anInt5745];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray13[anInt5748++] = local4026 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = method4700((char) local13);
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static308.method5079((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static573.method7975((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static423.method6600((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local4026 = aStringArray13[--anInt5748];
											if (local4026 != null) {
												anIntArray333[anInt5745++] = local4026.length();
												return;
											}
											anIntArray333[anInt5745++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local4026 = aStringArray13[--anInt5748];
											anInt5745 -= 2;
											local19 = anIntArray333[anInt5745];
											local25 = anIntArray333[anInt5745 + 1];
											aStringArray13[anInt5748++] = local4026.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local4026 = aStringArray13[--anInt5748];
											@Pc(8503) StringBuffer local8503 = new StringBuffer(local4026.length());
											@Pc(8505) boolean local8505 = false;
											for (local353 = 0; local353 < local4026.length(); local353++) {
												@Pc(8512) char local8512 = local4026.charAt(local353);
												if (local8512 == '<') {
													local8505 = true;
												} else if (local8512 == '>') {
													local8505 = false;
												} else if (!local8505) {
													local8503.append(local8512);
												}
											}
											aStringArray13[anInt5748++] = local8503.toString();
											return;
										}
										if (arg0 == 4120) {
											local4026 = aStringArray13[--anInt5748];
											anInt5745 -= 2;
											local19 = anIntArray333[anInt5745];
											local25 = anIntArray333[anInt5745 + 1];
											anIntArray333[anInt5745++] = local4026.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt5748 -= 2;
											local4026 = aStringArray13[anInt5748];
											local1145 = aStringArray13[anInt5748 + 1];
											local25 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = local4026.indexOf(local1145, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray333[--anInt5745] != 0;
											local19 = anIntArray333[--anInt5745];
											aStringArray13[anInt5748++] = Static506.method7325(Static372.anInt7083, 0, local412, (long) local19);
											return;
										}
										if (arg0 == 4125) {
											local4026 = aStringArray13[--anInt5748];
											local19 = anIntArray333[--anInt5745];
											@Pc(8726) Class345 local8726 = Static288.method3439(Static264.aClass237_69, local19);
											anIntArray333[anInt5745++] = local8726.method8114(local4026, Static158.aClass21Array8);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray333[--anInt5745];
											aStringArray13[anInt5748++] = Static497.aClass258_21.method6652(local13).aString88;
											return;
										}
										@Pc(8788) Class284 local8788;
										if (arg0 == 4201) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local8788 = Static497.aClass258_21.method6652(local13);
											if (local19 >= 1 && local19 <= 5 && local8788.aStringArray26[local19 - 1] != null) {
												aStringArray13[anInt5748++] = local8788.aStringArray26[local19 - 1];
												return;
											}
											aStringArray13[anInt5748++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local8788 = Static497.aClass258_21.method6652(local13);
											if (local19 >= 1 && local19 <= 5 && local8788.aStringArray25[local19 - 1] != null) {
												aStringArray13[anInt5748++] = local8788.aStringArray25[local19 - 1];
												return;
											}
											aStringArray13[anInt5748++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static497.aClass258_21.method6652(local13).anInt8515;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static497.aClass258_21.method6652(local13).anInt8550 == 1 ? 1 : 0;
											return;
										}
										@Pc(8951) Class284 local8951;
										if (arg0 == 4205) {
											local13 = anIntArray333[--anInt5745];
											local8951 = Static497.aClass258_21.method6652(local13);
											if (local8951.anInt8566 == -1 && local8951.anInt8563 >= 0) {
												anIntArray333[anInt5745++] = local8951.anInt8563;
												return;
											}
											anIntArray333[anInt5745++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray333[--anInt5745];
											local8951 = Static497.aClass258_21.method6652(local13);
											if (local8951.anInt8566 >= 0 && local8951.anInt8563 >= 0) {
												anIntArray333[anInt5745++] = local8951.anInt8563;
												return;
											}
											anIntArray333[anInt5745++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static497.aClass258_21.method6652(local13).aBoolean604 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local3091 = Static144.aClass274_1.method6933(local19);
											if (local3091.method2612()) {
												aStringArray13[anInt5748++] = Static497.aClass258_21.method6652(local13).method7056(local3091.aString33, local19);
												return;
											}
											anIntArray333[anInt5745++] = Static497.aClass258_21.method6652(local13).method7058(local19, local3091.anInt3023);
											return;
										}
										if (arg0 == 4209) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1] - 1;
											local8788 = Static497.aClass258_21.method6652(local13);
											if (local8788.anInt8576 == local19) {
												anIntArray333[anInt5745++] = local8788.anInt8516;
												return;
											}
											if (local8788.anInt8551 == local19) {
												anIntArray333[anInt5745++] = local8788.anInt8536;
												return;
											}
											anIntArray333[anInt5745++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local4026 = aStringArray13[--anInt5748];
											local19 = anIntArray333[--anInt5745];
											Static644.method8644(local4026, local19 == 1);
											anIntArray333[anInt5745++] = Static474.anInt8507;
											return;
										}
										if (arg0 == 4211) {
											if (Static621.aShortArray148 != null && Static169.anInt4129 < Static474.anInt8507) {
												anIntArray333[anInt5745++] = Static621.aShortArray148[Static169.anInt4129++] & 0xFFFF;
												return;
											}
											anIntArray333[anInt5745++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static169.anInt4129 = 0;
											return;
										}
										if (arg0 == 4213) {
											local13 = anIntArray333[--anInt5745];
											anIntArray333[anInt5745++] = Static497.aClass258_21.method6652(local13).anInt8526;
											return;
										}
										if (arg0 == 4214) {
											local4026 = aStringArray13[--anInt5748];
											anInt5745 -= 3;
											local19 = anIntArray333[anInt5745];
											local25 = anIntArray333[anInt5745 + 1];
											local353 = anIntArray333[anInt5745 + 2];
											Static304.method4969(local353, local19 == 1, local25, local4026);
											anIntArray333[anInt5745++] = Static474.anInt8507;
											return;
										}
										if (arg0 == 4215) {
											anInt5748 -= 2;
											anInt5745 -= 2;
											local4026 = aStringArray13[anInt5748];
											local19 = anIntArray333[anInt5745];
											local25 = anIntArray333[anInt5745 + 1];
											@Pc(9350) String local9350 = aStringArray13[anInt5748 + 1];
											Static496.method7235(local25, local9350, local19 == 1, local4026);
											anIntArray333[anInt5745++] = Static474.anInt8507;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local3091 = Static144.aClass274_1.method6933(local19);
											if (local3091.method2612()) {
												aStringArray13[anInt5748++] = Static297.aClass338_1.method7851(local13).method7307(local19, local3091.aString33);
												return;
											}
											anIntArray333[anInt5745++] = Static297.aClass338_1.method7851(local13).method7313(local3091.anInt3023, local19);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local3091 = Static144.aClass274_1.method6933(local19);
											if (local3091.method2612()) {
												aStringArray13[anInt5748++] = Static437.aClass199_3.method5342(local13).method8161(local19, local3091.aString33);
												return;
											}
											anIntArray333[anInt5745++] = Static437.aClass199_3.method5342(local13).method8177(local3091.anInt3023, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt5745 -= 2;
											local13 = anIntArray333[anInt5745];
											local19 = anIntArray333[anInt5745 + 1];
											local3091 = Static144.aClass274_1.method6933(local19);
											if (local3091.method2612()) {
												aStringArray13[anInt5748++] = Static6.aClass233_1.method6159(local13).method5579(local19, local3091.aString33);
												return;
											}
											anIntArray333[anInt5745++] = Static6.aClass233_1.method6159(local13).method5581(local3091.anInt3023, local19);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray333[--anInt5745];
										@Pc(9578) Class102 local9578 = Static472.aClass202_4.method5415(local13);
										if (local9578.anIntArray195 != null && local9578.anIntArray195.length > 0) {
											local25 = 0;
											local353 = local9578.anIntArray193[0];
											for (local2357 = 1; local2357 < local9578.anIntArray195.length; local2357++) {
												if (local9578.anIntArray193[local2357] > local353) {
													local25 = local2357;
													local353 = local9578.anIntArray193[local2357];
												}
											}
											anIntArray333[anInt5745++] = local9578.anIntArray195[local25];
											return;
										}
										anIntArray333[anInt5745++] = local9578.anInt3725;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static178.method3435(anIntArray333[--anInt5745]);
						} else {
							local137 = arg1 ? aClass331_10 : aClass331_9;
						}
						if (arg0 == 1300) {
							local19 = anIntArray333[--anInt5745] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method7749(local19, aStringArray13[--anInt5748]);
								return;
							}
							anInt5748--;
							return;
						}
						if (arg0 == 1301) {
							anInt5745 -= 2;
							local19 = anIntArray333[anInt5745];
							local25 = anIntArray333[anInt5745 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass331_18 = null;
								return;
							}
							local137.aClass331_18 = Static201.method3722(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray333[--anInt5745];
							if (local19 != Static95.anInt2616 && local19 != Static102.anInt2749 && local19 != Static452.anInt8305) {
								return;
							}
							local137.anInt9496 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt9555 = anIntArray333[--anInt5745];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt9513 = anIntArray333[--anInt5745];
							return;
						}
						if (arg0 == 1305) {
							local137.aString101 = aStringArray13[--anInt5748];
							return;
						}
						if (arg0 == 1306) {
							local137.aString97 = aStringArray13[--anInt5748];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray34 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt9519 = anIntArray333[--anInt5745];
							local137.anInt9494 = anIntArray333[--anInt5745];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray333[--anInt5745];
							local25 = anIntArray333[--anInt5745];
							if (local25 >= 1 && local25 <= 10) {
								local137.method7744(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString99 = aStringArray13[--anInt5748];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt9547 = anIntArray333[--anInt5745];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt5745 -= 3;
								local19 = anIntArray333[anInt5745] - 1;
								local25 = anIntArray333[anInt5745 + 1];
								local353 = anIntArray333[anInt5745 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt5745 -= 2;
								local19 = 10;
								local25 = anIntArray333[anInt5745];
								local353 = anIntArray333[anInt5745 + 1];
							}
							if (local137.aByteArray86 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray86 = new byte[11];
								local137.aByteArray87 = new byte[11];
								local137.anIntArray524 = new int[11];
							}
							local137.aByteArray86[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean671 = false;
								for (local2357 = 0; local2357 < local137.aByteArray86.length; local2357++) {
									if (local137.aByteArray86[local2357] != 0) {
										local137.aBoolean671 = true;
										break;
									}
								}
							} else {
								local137.aBoolean671 = true;
							}
							local137.aByteArray87[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt9514 = anIntArray333[--anInt5745];
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!paa;I)V")
	private static void method4696(@OriginalArg(0) Class8_Sub40 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray2;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class8_Sub5_Sub20 local12 = Static378.method5983(local8);
		if (local12 == null) {
			return;
		}
		anIntArray332 = new int[local12.anInt10212];
		@Pc(21) int local21 = 0;
		aStringArray14 = new String[local12.anInt10213];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt7833;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt7837;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass331_14 == null ? -1 : arg0.aClass331_14.anInt9578;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt7836;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass331_14 == null ? -1 : arg0.aClass331_14.anInt9535;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass331_13 == null ? -1 : arg0.aClass331_13.anInt9578;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass331_13 == null ? -1 : arg0.aClass331_13.anInt9535;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt7832;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt7831;
				}
				anIntArray332[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString78;
				}
				aStringArray14[local27++] = local135;
			}
		}
		anInt5757 = arg0.anInt7830;
		method4689(local12, arg1);
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
	public static void method4697() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!paa;)V")
	public static void method4698(@OriginalArg(0) Class8_Sub40 arg0) {
		method4696(arg0, 200000);
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	private static void method4699(@OriginalArg(0) int arg0) {
		@Pc(3) Class331 local3 = Static178.method3435(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class331[] local13 = Static21.aClass331ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class331[] local19 = Static368.aClass331ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static21.aClass331ArrayArray1[local9] = new Class331[local22];
			Static649.method5530(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static649.method5530(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(C)I")
	private static int method4700(@OriginalArg(0) char arg0) {
		return Static360.method5660(arg0) ? 1 : 0;
	}
}
