import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "Lclient!sha;")
	private static Class321 aClass321_22;

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "[J")
	private static long[] aLongArray16;

	@OriginalMember(owner = "client!kaa", name = "j", descriptor = "[I")
	private static int[] anIntArray284;

	@OriginalMember(owner = "client!kaa", name = "p", descriptor = "Lclient!hga;")
	private static Class141 aClass141_1;

	@OriginalMember(owner = "client!kaa", name = "r", descriptor = "Lclient!hia;")
	private static Class145 aClass145_3;

	@OriginalMember(owner = "client!kaa", name = "v", descriptor = "Lclient!sha;")
	private static Class321 aClass321_23;

	@OriginalMember(owner = "client!kaa", name = "B", descriptor = "Lclient!ag;")
	private static Class6_Sub2 aClass6_Sub2_2;

	@OriginalMember(owner = "client!kaa", name = "E", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray36;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "[I")
	private static final int[] anIntArray283 = new int[5];

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "Lclient!af;")
	public static final Class10 aClass10_24 = new Class10(4);

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "[Lclient!oi;")
	private static final Class256[] aClass256Array1 = new Class256[50];

	@OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
	private static int anInt4952 = 0;

	@OriginalMember(owner = "client!kaa", name = "i", descriptor = "I")
	private static int anInt4953 = 0;

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
	private static int anInt4955 = 0;

	@OriginalMember(owner = "client!kaa", name = "m", descriptor = "[[I")
	private static final int[][] anIntArrayArray27 = new int[5][5000];

	@OriginalMember(owner = "client!kaa", name = "o", descriptor = "[I")
	private static final int[] anIntArray285 = new int[3];

	@OriginalMember(owner = "client!kaa", name = "q", descriptor = "I")
	private static int anInt4957 = 0;

	@OriginalMember(owner = "client!kaa", name = "t", descriptor = "[J")
	private static final long[] aLongArray17 = new long[1000];

	@OriginalMember(owner = "client!kaa", name = "x", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray35 = new String[1000];

	@OriginalMember(owner = "client!kaa", name = "z", descriptor = "[I")
	private static final int[] anIntArray286 = new int[1000];

	@OriginalMember(owner = "client!kaa", name = "F", descriptor = "I")
	private static int anInt4965 = 0;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZ)V")
	private static void method4215(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(52) Class6_Sub26 local52;
		@Pc(776) int local776;
		@Pc(97) int local97;
		@Pc(83) String local83;
		@Pc(175) int local175;
		@Pc(1496) boolean local1496;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray286[anInt4955++] = Static147.anInt2503;
				return;
			}
			if (arg0 == 5001) {
				anInt4955 -= 3;
				Static147.anInt2503 = anIntArray286[anInt4955];
				Static105.aClass203_1 = Static27.method6640(anIntArray286[anInt4955 + 1]);
				if (Static105.aClass203_1 == null) {
					Static105.aClass203_1 = Static506.aClass203_4;
				}
				Static464.anInt8029 = anIntArray286[anInt4955 + 2];
				local52 = Static268.method3981(Static377.aClass15_2, Static355.aClass289_84);
				local52.aClass6_Sub23_Sub1_2.method8366(Static147.anInt2503);
				local52.aClass6_Sub23_Sub1_2.method8366(Static105.aClass203_1.anInt5698);
				local52.aClass6_Sub23_Sub1_2.method8366(Static464.anInt8029);
				Static670.method9077(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt4952 -= 2;
				local83 = aStringArray35[anInt4952];
				local89 = aStringArray35[anInt4952 + 1];
				anInt4955 -= 2;
				local97 = anIntArray286[anInt4955];
				local103 = anIntArray286[anInt4955 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class6_Sub26 local125 = Static268.method3981(Static377.aClass15_2, Static542.aClass289_131);
				local125.aClass6_Sub23_Sub1_2.method8366(Static622.method8568(local83) + Static622.method8568(local89) + 2);
				local125.aClass6_Sub23_Sub1_2.method8398(local83);
				local125.aClass6_Sub23_Sub1_2.method8366(local97 - 1);
				local125.aClass6_Sub23_Sub1_2.method8366(local103);
				local125.aClass6_Sub23_Sub1_2.method8398(local89);
				Static670.method9077(local125);
				return;
			}
			@Pc(179) Class277 local179;
			if (arg0 == 5003) {
				local175 = anIntArray286[--anInt4955];
				local179 = Static512.method7264(local175);
				local181 = "";
				if (local179 != null && local179.aString107 != null) {
					local181 = local179.aString107;
				}
				aStringArray35[anInt4952++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray286[--anInt4955];
				local179 = Static512.method7264(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8015;
				}
				anIntArray286[anInt4955++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static105.aClass203_1 == null) {
					anIntArray286[anInt4955++] = -1;
					return;
				}
				anIntArray286[anInt4955++] = Static105.aClass203_1.anInt5698;
				return;
			}
			@Pc(269) Class6_Sub26 local269;
			if (arg0 == 5006) {
				local175 = anIntArray286[--anInt4955];
				local269 = Static268.method3981(Static377.aClass15_2, Static122.aClass289_37);
				local269.aClass6_Sub23_Sub1_2.method8366(local175);
				Static670.method9077(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray35[--anInt4952];
				method4229(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt4952 -= 2;
				local83 = aStringArray35[anInt4952];
				local89 = aStringArray35[anInt4952 + 1];
				if (Static26.anInt609 != 0 || (!Static322.aBoolean346 || Static377.aBoolean420) && !Static525.aBoolean615) {
					@Pc(328) Class6_Sub26 local328 = Static268.method3981(Static377.aClass15_2, Static309.aClass289_42);
					local328.aClass6_Sub23_Sub1_2.method8366(0);
					local103 = local328.aClass6_Sub23_Sub1_2.anInt9901;
					local328.aClass6_Sub23_Sub1_2.method8398(local83);
					Static174.method2472(local328.aClass6_Sub23_Sub1_2, local89);
					local328.aClass6_Sub23_Sub1_2.method8346(local328.aClass6_Sub23_Sub1_2.anInt9901 - local103);
					Static670.method9077(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray286[--anInt4955];
				local179 = Static512.method7264(local175);
				local181 = "";
				if (local179 != null && local179.aString105 != null) {
					local181 = local179.aString105;
				}
				aStringArray35[anInt4952++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray286[--anInt4955];
				local179 = Static512.method7264(local175);
				local181 = "";
				if (local179 != null && local179.aString106 != null) {
					local181 = local179.aString106;
				}
				aStringArray35[anInt4952++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray286[--anInt4955];
				local179 = Static512.method7264(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8011;
				}
				anIntArray286[anInt4955++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 == null || Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aString46 == null) {
					local83 = "";
				} else {
					local83 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method3519();
				}
				aStringArray35[anInt4952++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray286[anInt4955++] = Static464.anInt8029;
				return;
			}
			if (arg0 == 5017) {
				anIntArray286[anInt4955++] = Static114.method1806();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray286[--anInt4955];
				local179 = Static512.method7264(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt8014;
				}
				anIntArray286[anInt4955++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray286[--anInt4955];
				local179 = Static512.method7264(local175);
				local181 = "";
				if (local179 != null && local179.aString109 != null) {
					local181 = local179.aString109;
				}
				aStringArray35[anInt4952++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 == null || Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aString46 == null) {
					local83 = "";
				} else {
					local83 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method3514();
				}
				aStringArray35[anInt4952++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray286[--anInt4955];
				local179 = Static512.method7264(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8012;
				}
				anIntArray286[anInt4955++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray286[--anInt4955];
				local179 = Static512.method7264(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8013;
				}
				anIntArray286[anInt4955++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray286[--anInt4955];
				local179 = Static512.method7264(local175);
				local181 = "";
				if (local179 != null && local179.aString108 != null) {
					local181 = local179.aString108;
				}
				aStringArray35[anInt4952++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray286[--anInt4955];
				aStringArray35[anInt4952++] = Static474.aClass75_2.method1820(local175).aString117;
				return;
			}
			@Pc(736) Class6_Sub4_Sub17 local736;
			if (arg0 == 5051) {
				local175 = anIntArray286[--anInt4955];
				local736 = Static474.aClass75_2.method1820(local175);
				if (local736.anIntArray564 == null) {
					anIntArray286[anInt4955++] = 0;
					return;
				}
				anIntArray286[anInt4955++] = local736.anIntArray564.length;
				return;
			}
			if (arg0 == 5052) {
				anInt4955 -= 2;
				local175 = anIntArray286[anInt4955];
				local776 = anIntArray286[anInt4955 + 1];
				@Pc(781) Class6_Sub4_Sub17 local781 = Static474.aClass75_2.method1820(local175);
				local103 = local781.anIntArray564[local776];
				anIntArray286[anInt4955++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray286[--anInt4955];
				local736 = Static474.aClass75_2.method1820(local175);
				if (local736.anIntArray565 == null) {
					anIntArray286[anInt4955++] = 0;
					return;
				}
				anIntArray286[anInt4955++] = local736.anIntArray565.length;
				return;
			}
			if (arg0 == 5054) {
				anInt4955 -= 2;
				local175 = anIntArray286[anInt4955];
				local776 = anIntArray286[anInt4955 + 1];
				anIntArray286[anInt4955++] = Static474.aClass75_2.method1820(local175).anIntArray565[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray286[--anInt4955];
				aStringArray35[anInt4952++] = Static418.aClass377_1.method8763(local175).method6582();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray286[--anInt4955];
				@Pc(907) Class6_Sub4_Sub13 local907 = Static418.aClass377_1.method8763(local175);
				if (local907.anIntArray511 == null) {
					anIntArray286[anInt4955++] = 0;
					return;
				}
				anIntArray286[anInt4955++] = local907.anIntArray511.length;
				return;
			}
			if (arg0 == 5057) {
				anInt4955 -= 2;
				local175 = anIntArray286[anInt4955];
				local776 = anIntArray286[anInt4955 + 1];
				anIntArray286[anInt4955++] = Static418.aClass377_1.method8763(local175).anIntArray511[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass141_1 = new Class141();
				aClass141_1.anInt3636 = anIntArray286[--anInt4955];
				aClass141_1.aClass6_Sub4_Sub13_1 = Static418.aClass377_1.method8763(aClass141_1.anInt3636);
				aClass141_1.anIntArray206 = new int[aClass141_1.aClass6_Sub4_Sub13_1.method6579()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static268.method3981(Static377.aClass15_2, Static518.aClass289_66);
				local52.aClass6_Sub23_Sub1_2.method8366(0);
				local776 = local52.aClass6_Sub23_Sub1_2.anInt9901;
				local52.aClass6_Sub23_Sub1_2.method8366(0);
				local52.aClass6_Sub23_Sub1_2.method8347(aClass141_1.anInt3636);
				aClass141_1.aClass6_Sub4_Sub13_1.method6586(aClass141_1.anIntArray206, local52.aClass6_Sub23_Sub1_2);
				local52.aClass6_Sub23_Sub1_2.method8346(local52.aClass6_Sub23_Sub1_2.anInt9901 - local776);
				Static670.method9077(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray35[--anInt4952];
				local269 = Static268.method3981(Static377.aClass15_2, Static10.aClass289_3);
				local269.aClass6_Sub23_Sub1_2.method8366(0);
				local97 = local269.aClass6_Sub23_Sub1_2.anInt9901;
				local269.aClass6_Sub23_Sub1_2.method8398(local83);
				local269.aClass6_Sub23_Sub1_2.method8347(aClass141_1.anInt3636);
				aClass141_1.aClass6_Sub4_Sub13_1.method6586(aClass141_1.anIntArray206, local269.aClass6_Sub23_Sub1_2);
				local269.aClass6_Sub23_Sub1_2.method8346(local269.aClass6_Sub23_Sub1_2.anInt9901 - local97);
				Static670.method9077(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static268.method3981(Static377.aClass15_2, Static518.aClass289_66);
				local52.aClass6_Sub23_Sub1_2.method8366(0);
				local776 = local52.aClass6_Sub23_Sub1_2.anInt9901;
				local52.aClass6_Sub23_Sub1_2.method8366(1);
				local52.aClass6_Sub23_Sub1_2.method8347(aClass141_1.anInt3636);
				aClass141_1.aClass6_Sub4_Sub13_1.method6586(aClass141_1.anIntArray206, local52.aClass6_Sub23_Sub1_2);
				local52.aClass6_Sub23_Sub1_2.method8346(local52.aClass6_Sub23_Sub1_2.anInt9901 - local776);
				Static670.method9077(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt4955 -= 2;
				local175 = anIntArray286[anInt4955];
				local776 = anIntArray286[anInt4955 + 1];
				anIntArray286[anInt4955++] = Static474.aClass75_2.method1820(local175).aCharArray7[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt4955 -= 2;
				local175 = anIntArray286[anInt4955];
				local776 = anIntArray286[anInt4955 + 1];
				anIntArray286[anInt4955++] = Static474.aClass75_2.method1820(local175).aCharArray8[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt4955 -= 2;
				local175 = anIntArray286[anInt4955];
				local776 = anIntArray286[anInt4955 + 1];
				if (local776 == -1) {
					anIntArray286[anInt4955++] = -1;
					return;
				}
				anIntArray286[anInt4955++] = Static474.aClass75_2.method1820(local175).method7290((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt4955 -= 2;
				local175 = anIntArray286[anInt4955];
				local776 = anIntArray286[anInt4955 + 1];
				if (local776 == -1) {
					anIntArray286[anInt4955++] = -1;
					return;
				}
				anIntArray286[anInt4955++] = Static474.aClass75_2.method1820(local175).method7285((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray286[--anInt4955];
				anIntArray286[anInt4955++] = Static418.aClass377_1.method8763(local175).method6579();
				return;
			}
			if (arg0 == 5067) {
				anInt4955 -= 2;
				local175 = anIntArray286[anInt4955];
				local776 = anIntArray286[anInt4955 + 1];
				local97 = Static418.aClass377_1.method8763(local175).method6588(local776).anInt6833;
				anIntArray286[anInt4955++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt4955 -= 2;
				local175 = anIntArray286[anInt4955];
				local776 = anIntArray286[anInt4955 + 1];
				aClass141_1.anIntArray206[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt4955 -= 2;
				local175 = anIntArray286[anInt4955];
				local776 = anIntArray286[anInt4955 + 1];
				aClass141_1.anIntArray206[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt4955 -= 3;
				local175 = anIntArray286[anInt4955];
				local776 = anIntArray286[anInt4955 + 1];
				local97 = anIntArray286[anInt4955 + 2];
				@Pc(1448) Class6_Sub4_Sub13 local1448 = Static418.aClass377_1.method8763(local175);
				if (local1448.method6588(local776).anInt6833 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray286[anInt4955++] = local1448.method6583(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray35[--anInt4952];
				local1496 = anIntArray286[--anInt4955] == 1;
				Static500.method7182(local1496, local83);
				anIntArray286[anInt4955++] = Static403.anInt6786;
				return;
			}
			if (arg0 == 5072) {
				if (Static123.aShortArray41 != null && Static277.anInt4792 < Static403.anInt6786) {
					anIntArray286[anInt4955++] = Static123.aShortArray41[Static277.anInt4792++] & 0xFFFF;
					return;
				}
				anIntArray286[anInt4955++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static277.anInt4792 = 0;
				return;
			}
			if (arg0 == 5074) {
				local52 = Static268.method3981(Static377.aClass15_2, Static518.aClass289_66);
				local52.aClass6_Sub23_Sub1_2.method8366(0);
				local776 = local52.aClass6_Sub23_Sub1_2.anInt9901;
				local52.aClass6_Sub23_Sub1_2.method8366(2);
				local52.aClass6_Sub23_Sub1_2.method8347(aClass141_1.anInt3636);
				aClass141_1.aClass6_Sub4_Sub13_1.method6586(aClass141_1.anIntArray206, local52.aClass6_Sub23_Sub1_2);
				local52.aClass6_Sub23_Sub1_2.method8346(local52.aClass6_Sub23_Sub1_2.anInt9901 - local776);
				Static670.method9077(local52);
				return;
			}
			if (arg0 == 5075) {
				local52 = Static268.method3981(Static377.aClass15_2, Static518.aClass289_66);
				local52.aClass6_Sub23_Sub1_2.method8366(0);
				local776 = local52.aClass6_Sub23_Sub1_2.anInt9901;
				local52.aClass6_Sub23_Sub1_2.method8366(3);
				local52.aClass6_Sub23_Sub1_2.method8347(aClass141_1.anInt3636);
				aClass141_1.aClass6_Sub4_Sub13_1.method6586(aClass141_1.anIntArray206, local52.aClass6_Sub23_Sub1_2);
				local52.aClass6_Sub23_Sub1_2.method8346(local52.aClass6_Sub23_Sub1_2.anInt9901 - local776);
				Static670.method9077(local52);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static170.aClass4_1.method1024(86)) {
					anIntArray286[anInt4955++] = 1;
					return;
				}
				anIntArray286[anInt4955++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static170.aClass4_1.method1024(82)) {
					anIntArray286[anInt4955++] = 1;
					return;
				}
				anIntArray286[anInt4955++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static170.aClass4_1.method1024(81)) {
					anIntArray286[anInt4955++] = 1;
					return;
				}
				anIntArray286[anInt4955++] = 0;
				return;
			}
		} else {
			@Pc(2931) int local2931;
			@Pc(2205) boolean local2205;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static650.method8851(anIntArray286[--anInt4955]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray286[anInt4955++] = Static413.method6210();
					return;
				}
				if (arg0 == 5205) {
					Static17.method475(false, -1, anIntArray286[--anInt4955], -1);
					return;
				}
				@Pc(1794) Class6_Sub4_Sub20 local1794;
				if (arg0 == 5206) {
					local175 = anIntArray286[--anInt4955];
					local1794 = Static528.method4543(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1794 == null) {
						anIntArray286[anInt4955++] = -1;
						return;
					}
					anIntArray286[anInt4955++] = local1794.anInt10637;
					return;
				}
				@Pc(1827) Class6_Sub4_Sub20 local1827;
				if (arg0 == 5207) {
					local1827 = Static528.method4551(anIntArray286[--anInt4955]);
					if (local1827 != null && local1827.aString151 != null) {
						aStringArray35[anInt4952++] = local1827.aString151;
						return;
					}
					aStringArray35[anInt4952++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray286[anInt4955++] = Static340.anInt5881;
					anIntArray286[anInt4955++] = Static630.anInt6216;
					return;
				}
				if (arg0 == 5209) {
					anIntArray286[anInt4955++] = Static417.anInt7258 + Static528.anInt5361;
					anIntArray286[anInt4955++] = Static490.anInt8337 + Static528.anInt5366;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray286[--anInt4955];
					local1794 = Static528.method4551(local175);
					if (local1794 == null) {
						anIntArray286[anInt4955++] = 0;
						anIntArray286[anInt4955++] = 0;
						return;
					}
					anIntArray286[anInt4955++] = local1794.anInt10631 >> 14 & 0x3FFF;
					anIntArray286[anInt4955++] = local1794.anInt10631 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray286[--anInt4955];
					local1794 = Static528.method4551(local175);
					if (local1794 == null) {
						anIntArray286[anInt4955++] = 0;
						anIntArray286[anInt4955++] = 0;
						return;
					}
					anIntArray286[anInt4955++] = local1794.anInt10641 - local1794.anInt10635;
					anIntArray286[anInt4955++] = local1794.anInt10644 - local1794.anInt10634;
					return;
				}
				@Pc(2017) Class6_Sub24 local2017;
				if (arg0 == 5212) {
					local2017 = Static205.method3058();
					if (local2017 == null) {
						anIntArray286[anInt4955++] = -1;
						anIntArray286[anInt4955++] = -1;
						return;
					}
					anIntArray286[anInt4955++] = local2017.anInt3909;
					local776 = local2017.anInt3908 << 28 | local2017.anInt3903 + Static528.anInt5361 << 14 | local2017.anInt3910 + Static528.anInt5366;
					anIntArray286[anInt4955++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local2017 = Static103.method1676();
					if (local2017 == null) {
						anIntArray286[anInt4955++] = -1;
						anIntArray286[anInt4955++] = -1;
						return;
					}
					anIntArray286[anInt4955++] = local2017.anInt3909;
					local776 = local2017.anInt3908 << 28 | local2017.anInt3903 + Static528.anInt5361 << 14 | local2017.anInt3910 + Static528.anInt5366;
					anIntArray286[anInt4955++] = local776;
					return;
				}
				@Pc(2165) boolean local2165;
				if (arg0 == 5214) {
					local175 = anIntArray286[--anInt4955];
					local1794 = Static608.method8329();
					if (local1794 != null) {
						local2165 = local1794.method9026(local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, anIntArray285, local175 & 0x3FFF);
						if (local2165) {
							Static387.method5522(anIntArray285[2], anIntArray285[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt4955 -= 2;
					local175 = anIntArray286[anInt4955];
					local776 = anIntArray286[anInt4955 + 1];
					@Pc(2203) Class384 local2203 = Static528.method4546(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2205 = false;
					for (@Pc(2210) Class6_Sub4_Sub20 local2210 = (Class6_Sub4_Sub20) local2203.method8910(); local2210 != null; local2210 = (Class6_Sub4_Sub20) local2203.method8908()) {
						if (local2210.anInt10637 == local776) {
							local2205 = true;
							break;
						}
					}
					if (local2205) {
						anIntArray286[anInt4955++] = 1;
						return;
					}
					anIntArray286[anInt4955++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray286[--anInt4955];
					local1794 = Static528.method4551(local175);
					if (local1794 == null) {
						anIntArray286[anInt4955++] = -1;
						return;
					}
					anIntArray286[anInt4955++] = local1794.anInt10630;
					return;
				}
				if (arg0 == 5220) {
					anIntArray286[anInt4955++] = Static115.anInt2066 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray286[--anInt4955];
					Static387.method5522(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1827 = Static608.method8329();
					if (local1827 != null) {
						local1496 = local1827.method9030(anIntArray285, Static490.anInt8337 + Static528.anInt5366, Static417.anInt7258 + Static528.anInt5361);
						if (local1496) {
							anIntArray286[anInt4955++] = anIntArray285[1];
							anIntArray286[anInt4955++] = anIntArray285[2];
							return;
						}
						anIntArray286[anInt4955++] = -1;
						anIntArray286[anInt4955++] = -1;
						return;
					}
					anIntArray286[anInt4955++] = -1;
					anIntArray286[anInt4955++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt4955 -= 2;
					local175 = anIntArray286[anInt4955];
					local776 = anIntArray286[anInt4955 + 1];
					Static17.method475(false, local776 >> 14 & 0x3FFF, local175, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray286[--anInt4955];
					local1794 = Static608.method8329();
					if (local1794 != null) {
						local2165 = local1794.method9026(local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, anIntArray285, local175 & 0x3FFF);
						if (local2165) {
							anIntArray286[anInt4955++] = anIntArray285[1];
							anIntArray286[anInt4955++] = anIntArray285[2];
							return;
						}
						anIntArray286[anInt4955++] = -1;
						anIntArray286[anInt4955++] = -1;
						return;
					}
					anIntArray286[anInt4955++] = -1;
					anIntArray286[anInt4955++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray286[--anInt4955];
					local1794 = Static608.method8329();
					if (local1794 != null) {
						local2165 = local1794.method9030(anIntArray285, local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
						if (local2165) {
							anIntArray286[anInt4955++] = anIntArray285[1];
							anIntArray286[anInt4955++] = anIntArray285[2];
							return;
						}
						anIntArray286[anInt4955++] = -1;
						anIntArray286[anInt4955++] = -1;
						return;
					}
					anIntArray286[anInt4955++] = -1;
					anIntArray286[anInt4955++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static391.method5572(anIntArray286[--anInt4955]);
					return;
				}
				if (arg0 == 5227) {
					anInt4955 -= 2;
					local175 = anIntArray286[anInt4955];
					local776 = anIntArray286[anInt4955 + 1];
					Static17.method475(true, local776 >> 14 & 0x3FFF, local175, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static228.aBoolean234 = anIntArray286[--anInt4955] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray286[anInt4955++] = Static228.aBoolean234 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray286[--anInt4955];
					Static216.method3140(local175);
					return;
				}
				@Pc(2723) Class6 local2723;
				if (arg0 == 5231) {
					anInt4955 -= 2;
					local175 = anIntArray286[anInt4955];
					local1496 = anIntArray286[anInt4955 + 1] == 1;
					if (Static187.aClass209_13 != null) {
						local2723 = Static187.aClass209_13.method5038((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9174();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class6();
							Static187.aClass209_13.method5035((long) local175, local2723);
						}
					}
					return;
				}
				@Pc(2765) Class6 local2765;
				if (arg0 == 5232) {
					local175 = anIntArray286[--anInt4955];
					if (Static187.aClass209_13 != null) {
						local2765 = Static187.aClass209_13.method5038((long) local175);
						anIntArray286[anInt4955++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray286[anInt4955++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt4955 -= 2;
					local175 = anIntArray286[anInt4955];
					local1496 = anIntArray286[anInt4955 + 1] == 1;
					if (Static94.aClass209_9 != null) {
						local2723 = Static94.aClass209_9.method5038((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9174();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class6();
							Static94.aClass209_9.method5035((long) local175, local2723);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray286[--anInt4955];
					if (Static94.aClass209_9 != null) {
						local2765 = Static94.aClass209_9.method5038((long) local175);
						anIntArray286[anInt4955++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray286[anInt4955++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray286[anInt4955++] = Static528.aClass6_Sub4_Sub20_2 == null ? -1 : Static528.aClass6_Sub4_Sub20_2.anInt10637;
					return;
				}
				if (arg0 == 5236) {
					anInt4955 -= 2;
					local175 = anIntArray286[anInt4955];
					local776 = anIntArray286[anInt4955 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2931 = Static585.method8094(local103, local175, local97);
					if (local2931 < 0) {
						anIntArray286[anInt4955++] = -1;
						return;
					}
					anIntArray286[anInt4955++] = local2931;
					return;
				}
				if (arg0 == 5237) {
					Static424.method6295();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt4955 -= 2;
					local175 = anIntArray286[anInt4955];
					local776 = anIntArray286[anInt4955 + 1];
					Static138.method2063(3, false, local776, local175);
					anIntArray286[anInt4955++] = Static289.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static289.aFrame1 != null) {
						Static138.method2063(Static96.aClass6_Sub22_7.aClass29_Sub18_2.method6277(), false, -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3017) Class382[] local3017 = Static502.method7195();
					anIntArray286[anInt4955++] = local3017.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray286[--anInt4955];
					@Pc(3041) Class382[] local3041 = Static502.method7195();
					anIntArray286[anInt4955++] = local3041[local175].anInt10494;
					anIntArray286[anInt4955++] = local3041[local175].anInt10491;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static666.anInt10646;
					local776 = Static387.anInt6519;
					local97 = -1;
					@Pc(3076) Class382[] local3076 = Static502.method7195();
					for (local2931 = 0; local2931 < local3076.length; local2931++) {
						@Pc(3083) Class382 local3083 = local3076[local2931];
						if (local3083.anInt10494 == local175 && local3083.anInt10491 == local776) {
							local97 = local2931;
							break;
						}
					}
					anIntArray286[anInt4955++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray286[anInt4955++] = Static455.method6591();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray286[--anInt4955];
					if (local175 >= 1 && local175 <= 2) {
						Static138.method2063(local175, false, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub18_2.method6277();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray286[--anInt4955];
					if (local175 >= 1 && local175 <= 2) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub18_2, local175);
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub18_1, local175);
						Static633.method8698();
						return;
					}
					return;
				}
			} else {
				@Pc(3369) int local3369;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt4952 -= 2;
						local83 = aStringArray35[anInt4952];
						local89 = aStringArray35[anInt4952 + 1];
						local97 = anIntArray286[--anInt4955];
						@Pc(3231) Class6_Sub26 local3231 = Static268.method3981(Static377.aClass15_2, Static652.aClass289_90);
						local3231.aClass6_Sub23_Sub1_2.method8366(Static622.method8568(local83) + Static622.method8568(local89) + 1);
						local3231.aClass6_Sub23_Sub1_2.method8398(local83);
						local3231.aClass6_Sub23_Sub1_2.method8398(local89);
						local3231.aClass6_Sub23_Sub1_2.method8366(local97);
						Static670.method9077(local3231);
						return;
					}
					if (arg0 == 5401) {
						anInt4955 -= 2;
						Static511.aShortArray81[anIntArray286[anInt4955]] = (short) Static553.method7827(anIntArray286[anInt4955 + 1]);
						Static340.aClass121_1.method2644();
						Static340.aClass121_1.method2641();
						Static95.aClass188_1.method4266();
						Static509.method7248();
						return;
					}
					if (arg0 == 5405) {
						anInt4955 -= 2;
						local175 = anIntArray286[anInt4955];
						local776 = anIntArray286[anInt4955 + 1];
						if (local175 >= 0 && local175 < 2) {
							Static150.anIntArrayArrayArray15[local175] = new int[local776 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt4955 -= 7;
						local175 = anIntArray286[anInt4955];
						local776 = anIntArray286[anInt4955 + 1] << 1;
						local97 = anIntArray286[anInt4955 + 2];
						local103 = anIntArray286[anInt4955 + 3];
						local2931 = anIntArray286[anInt4955 + 4];
						local3369 = anIntArray286[anInt4955 + 5];
						@Pc(3375) int local3375 = anIntArray286[anInt4955 + 6];
						if (local175 >= 0 && local175 < 2 && Static150.anIntArrayArrayArray15[local175] != null && local776 >= 0 && local776 < Static150.anIntArrayArrayArray15[local175].length) {
							Static150.anIntArrayArrayArray15[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3375 };
							Static150.anIntArrayArrayArray15[local175][local776 + 1] = new int[] { (local2931 >> 14 & 0x3FFF) << 9, local3369 << 2, (local2931 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local175 = Static150.anIntArrayArrayArray15[anIntArray286[--anInt4955]].length >> 1;
						anIntArray286[anInt4955++] = local175;
						return;
					}
					if (arg0 == 5411) {
						if (Static289.aFrame1 != null) {
							Static138.method2063(Static96.aClass6_Sub22_7.aClass29_Sub18_2.method6277(), false, -1, -1);
						}
						if (Static293.aFrame3 != null) {
							Static472.method6956();
							System.exit(0);
							return;
						}
						local83 = Static617.aString137 == null ? Static399.method5763() : Static617.aString137;
						Static135.method2048(Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() == 1, false, Static569.aClass380_6, local83);
						return;
					}
					if (arg0 == 5419) {
						local83 = "";
						if (Static560.aClass103_3 != null) {
							if (Static560.aClass103_3.anObject9 == null) {
								local83 = Static89.method8410(Static560.aClass103_3.anInt2540);
							} else {
								local83 = (String) Static560.aClass103_3.anObject9;
							}
						}
						aStringArray35[anInt4952++] = local83;
						return;
					}
					if (arg0 == 5420) {
						anIntArray286[anInt4955++] = Static569.aClass380_6.aBoolean729 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static289.aFrame1 != null) {
							Static138.method2063(Static96.aClass6_Sub22_7.aClass29_Sub18_2.method6277(), false, -1, -1);
						}
						local83 = aStringArray35[--anInt4952];
						local1496 = anIntArray286[--anInt4955] == 1;
						local181 = Static399.method5763() + local83;
						Static135.method2048(Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() == 1, local1496, Static569.aClass380_6, local181);
						return;
					}
					if (arg0 == 5422) {
						anInt4952 -= 2;
						local83 = aStringArray35[anInt4952];
						local89 = aStringArray35[anInt4952 + 1];
						local97 = anIntArray286[--anInt4955];
						if (local83.length() > 0) {
							if (Static462.aStringArray49 == null) {
								Static462.aStringArray49 = new String[Static264.anIntArray261[Static457.aClass176_6.anInt4801]];
							}
							Static462.aStringArray49[local97] = local83;
						}
						if (local89.length() > 0) {
							if (Static568.aStringArray57 == null) {
								Static568.aStringArray57 = new String[Static264.anIntArray261[Static457.aClass176_6.anInt4801]];
							}
							Static568.aStringArray57[local97] = local89;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray35[--anInt4952]);
						return;
					}
					if (arg0 == 5424) {
						anInt4955 -= 11;
						Static365.anInt6243 = anIntArray286[anInt4955];
						Static210.anInt3621 = anIntArray286[anInt4955 + 1];
						Static166.anInt2808 = anIntArray286[anInt4955 + 2];
						Static284.anInt4848 = anIntArray286[anInt4955 + 3];
						Static136.anInt2378 = anIntArray286[anInt4955 + 4];
						Static228.anInt3897 = anIntArray286[anInt4955 + 5];
						Static557.anInt9339 = anIntArray286[anInt4955 + 6];
						Static258.anInt4492 = anIntArray286[anInt4955 + 7];
						Static232.anInt3961 = anIntArray286[anInt4955 + 8];
						Static291.anInt4908 = anIntArray286[anInt4955 + 9];
						Static562.anInt9362 = anIntArray286[anInt4955 + 10];
						Static624.aClass8_139.method273(Static136.anInt2378);
						Static624.aClass8_139.method273(Static228.anInt3897);
						Static624.aClass8_139.method273(Static557.anInt9339);
						Static624.aClass8_139.method273(Static258.anInt4492);
						Static624.aClass8_139.method273(Static232.anInt3961);
						Static474.aClass9_30 = null;
						Static308.aClass9_25 = null;
						Static131.aClass9_14 = null;
						Static154.aClass9_17 = null;
						Static256.aClass9_23 = null;
						Static174.aClass9_21 = null;
						Static22.aClass9_2 = null;
						Static149.aClass9_16 = null;
						Static292.aBoolean317 = true;
						return;
					}
					if (arg0 == 5425) {
						Static172.method2461();
						Static292.aBoolean317 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt4955 -= 2;
						Static471.anInt8114 = anIntArray286[anInt4955];
						Static80.anInt1521 = anIntArray286[anInt4955 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt4955 -= 2;
						Static658.anInt10577 = anIntArray286[anInt4955 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt4955 -= 2;
						local175 = anIntArray286[anInt4955];
						local776 = anIntArray286[anInt4955 + 1];
						anIntArray286[anInt4955++] = Static429.method8197(local175, local776) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static623.method8579(false, aStringArray35[--anInt4952], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static683.method5174(Static180.anApplet6, "accountcreated");
							return;
						} catch (@Pc(3917) Throwable local3917) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static683.method5174(Static180.anApplet6, "accountcreatestarted");
							return;
						} catch (@Pc(3928) Throwable local3928) {
							return;
						}
					}
					if (arg0 == 5432) {
						local83 = "";
						if (Static280.aClipboard1 != null) {
							@Pc(3940) Transferable local3940 = Static280.aClipboard1.getContents((Object) null);
							if (local3940 != null) {
								try {
									local83 = (String) local3940.getTransferData(DataFlavor.stringFlavor);
									if (local83 == null) {
										local83 = "";
									}
								} catch (@Pc(3953) Exception local3953) {
								}
							}
						}
						aStringArray35[anInt4952++] = local83;
						return;
					}
					if (arg0 == 5433) {
						Static526.anInt8686 = anIntArray286[--anInt4955];
						return;
					}
					if (arg0 == 5435) {
						anIntArray286[anInt4955++] = Static301.aBoolean334 ? 1 : 0;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt4955 -= 4;
						local175 = anIntArray286[anInt4955];
						local776 = anIntArray286[anInt4955 + 1];
						local97 = anIntArray286[anInt4955 + 2];
						local103 = anIntArray286[anInt4955 + 3];
						Static627.method8632(local103, local776 << 2, local97, (local175 >> 14 & 0x3FFF) - Static534.anInt8753, false, (local175 & 0x3FFF) - Static234.anInt4239);
						return;
					}
					if (arg0 == 5501) {
						anInt4955 -= 4;
						local175 = anIntArray286[anInt4955];
						local776 = anIntArray286[anInt4955 + 1];
						local97 = anIntArray286[anInt4955 + 2];
						local103 = anIntArray286[anInt4955 + 3];
						Static54.method1057((local175 & 0x3FFF) - Static234.anInt4239, local103, local97, (local175 >> 14 & 0x3FFF) - Static534.anInt8753, local776 << 2);
						return;
					}
					if (arg0 == 5502) {
						anInt4955 -= 6;
						local175 = anIntArray286[anInt4955];
						if (local175 >= 2) {
							throw new RuntimeException();
						}
						Static367.anInt6283 = local175;
						local776 = anIntArray286[anInt4955 + 1];
						if (local776 + 1 >= Static150.anIntArrayArrayArray15[Static367.anInt6283].length >> 1) {
							throw new RuntimeException();
						}
						Static558.anInt9348 = local776;
						Static616.anInt10073 = 0;
						Static291.anInt4914 = anIntArray286[anInt4955 + 2];
						Static282.anInt4837 = anIntArray286[anInt4955 + 3];
						local97 = anIntArray286[anInt4955 + 4];
						if (local97 >= 2) {
							throw new RuntimeException();
						}
						Static505.anInt8478 = local97;
						local103 = anIntArray286[anInt4955 + 5];
						if (local103 + 1 >= Static150.anIntArrayArrayArray15[Static505.anInt8478].length >> 1) {
							throw new RuntimeException();
						}
						Static78.anInt1494 = local103;
						Static407.anInt6820 = 3;
						Static258.anInt4491 = -1;
						Static601.anInt9806 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static652.method5481();
						return;
					}
					if (arg0 == 5504) {
						anInt4955 -= 2;
						Static264.method3896(anIntArray286[anInt4955], anIntArray286[anInt4955 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray286[anInt4955++] = (int) Static132.aFloat14 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray286[anInt4955++] = (int) Static228.aFloat26 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static622.method8567();
						return;
					}
					if (arg0 == 5508) {
						Static137.method2059();
						return;
					}
					if (arg0 == 5509) {
						Static558.method7884();
						return;
					}
					if (arg0 == 5510) {
						Static16.method467();
						return;
					}
					if (arg0 == 5511) {
						local175 = anIntArray286[--anInt4955];
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static534.anInt8753;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static491.anInt9856) {
							local776 = Static491.anInt9856;
						}
						local97 -= Static234.anInt4239;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static393.anInt6574) {
							local97 = Static393.anInt6574;
						}
						Static555.anInt9303 = (local776 << 9) + 256;
						Static502.anInt8454 = (local97 << 9) + 256;
						Static407.anInt6820 = 4;
						Static258.anInt4491 = -1;
						Static601.anInt9806 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static641.method8754();
						return;
					}
					if (arg0 == 5514) {
						Static472.anInt8141 = anIntArray286[--anInt4955];
						return;
					}
					if (arg0 == 5516) {
						anIntArray286[anInt4955++] = Static472.anInt8141;
						return;
					}
					if (arg0 == 5517) {
						local175 = anIntArray286[--anInt4955];
						if (local175 == -1) {
							local776 = local175 >> 14 & 0x3FFF;
							local97 = local175 & 0x3FFF;
							local776 -= Static534.anInt8753;
							if (local776 < 0) {
								local776 = 0;
							} else if (local776 >= Static491.anInt9856) {
								local776 = Static491.anInt9856;
							}
							local97 -= Static234.anInt4239;
							if (local97 < 0) {
								local97 = 0;
							} else if (local97 >= Static393.anInt6574) {
								local97 = Static393.anInt6574;
							}
							Static601.anInt9806 = (local776 << 9) + 256;
							Static258.anInt4491 = (local97 << 9) + 256;
							return;
						}
						Static601.anInt9806 = -1;
						Static258.anInt4491 = -1;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt4952 -= 2;
						local83 = aStringArray35[anInt4952];
						local89 = aStringArray35[anInt4952 + 1];
						local97 = anIntArray286[--anInt4955];
						if (local83.length() > 320) {
							return;
						}
						if (Static556.anInt9319 != 3) {
							return;
						}
						if (Static190.anInt3237 == 0 && Static131.anInt2291 == 0) {
							Static12.aString10 = local83;
							Static633.aString140 = local89;
							Static595.anInt9707 = local97;
							Static143.method2106(6);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static496.method8137();
						return;
					}
					if (arg0 == 5602) {
						if (Static190.anInt3237 == 0) {
							Static557.anInt9345 = -2;
							Static182.anInt3145 = -2;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt4952--;
						if (Static556.anInt9319 != 3) {
							return;
						}
						if (Static190.anInt3237 == 0 && Static131.anInt2291 == 0) {
							Static518.method3731(aStringArray35[anInt4952]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt4952 -= 2;
						anInt4955 -= 2;
						if (Static556.anInt9319 != 3) {
							return;
						}
						if (Static190.anInt3237 == 0 && Static131.anInt2291 == 0) {
							Static498.method7170(aStringArray35[anInt4952], anIntArray286[anInt4955 + 1] == 1, aStringArray35[anInt4952 + 1], anIntArray286[anInt4955]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static131.anInt2291 == 0) {
							Static400.anInt6735 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray286[anInt4955++] = Static182.anInt3145;
						return;
					}
					if (arg0 == 5608) {
						anIntArray286[anInt4955++] = Static607.anInt9849;
						return;
					}
					if (arg0 == 5609) {
						anIntArray286[anInt4955++] = Static400.anInt6735;
						return;
					}
					if (arg0 == 5611) {
						anIntArray286[anInt4955++] = Static199.anInt3464;
						return;
					}
					if (arg0 == 5612) {
						local175 = anIntArray286[--anInt4955];
						if (Static556.anInt9319 != 7) {
							return;
						}
						if (Static190.anInt3237 == 0 && Static131.anInt2291 == 0) {
							if (Static163.aClass170_1 != null) {
								Static163.aClass170_1.method8770();
								Static163.aClass170_1 = null;
							}
							Static595.anInt9707 = local175;
							Static143.method2106(9);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray286[anInt4955++] = Static182.anInt3145;
						return;
					}
					if (arg0 == 5615) {
						anInt4952 -= 2;
						local83 = aStringArray35[anInt4952];
						local89 = aStringArray35[anInt4952 + 1];
						if (local83.length() > 320) {
							return;
						}
						if (Static556.anInt9319 != 3) {
							return;
						}
						if (Static190.anInt3237 == 0 && Static131.anInt2291 == 0) {
							if (Static163.aClass170_1 != null) {
								Static163.aClass170_1.method8770();
								Static163.aClass170_1 = null;
							}
							Static12.aString10 = local83;
							Static633.aString140 = local89;
							Static143.method2106(5);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static483.method7043(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray286[anInt4955++] = Static557.anInt9345;
						return;
					}
					if (arg0 == 5618) {
						anInt4955--;
						return;
					}
					if (arg0 == 5619) {
						anInt4955--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray286[anInt4955++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt4952 -= 2;
						anInt4955 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static259.aString53 != null) {
							anIntArray286[anInt4955++] = 1;
							return;
						}
						anIntArray286[anInt4955++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray286[anInt4955++] = (int) (Static106.aLong65 >> 32);
						anIntArray286[anInt4955++] = (int) (Static106.aLong65 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray286[anInt4955++] = Static67.aBoolean67 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static67.aBoolean67 = true;
						Static301.method4339();
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local175 = anIntArray286[--anInt4955];
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub7_1, local175);
						Static641.method8753();
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					@Pc(4900) boolean local4900;
					if (arg0 == 6002) {
						local4900 = anIntArray286[--anInt4955] == 1;
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub4_1, local4900 ? 1 : 0);
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub4_2, local4900 ? 1 : 0);
						Static641.method8753();
						Static369.method5323();
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6003) {
						local4900 = anIntArray286[--anInt4955] == 1;
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub29_1, local4900 ? 2 : 1);
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub29_2, local4900 ? 2 : 1);
						Static369.method5323();
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6005) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub9_1, anIntArray286[--anInt4955] == 1 ? 1 : 0);
						Static641.method8753();
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6007) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub3_1, anIntArray286[--anInt4955]);
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6008) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub10_1, anIntArray286[--anInt4955] == 1 ? 1 : 0);
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6010) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub28_1, anIntArray286[--anInt4955] == 1 ? 1 : 0);
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6011) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub13_1, anIntArray286[--anInt4955]);
						Static641.method8753();
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6012) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub21_1, anIntArray286[--anInt4955] == 1 ? 1 : 0);
						Static180.method8370();
						Static139.method2087();
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6014) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub25_1, anIntArray286[--anInt4955] == 1 ? 2 : 0);
						Static641.method8753();
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6015) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub15_1, anIntArray286[--anInt4955] == 1 ? 1 : 0);
						Static641.method8753();
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6016) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub6_1, anIntArray286[--anInt4955]);
						Static646.method8805(Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742(), false);
						Static633.method8698();
						return;
					}
					if (arg0 == 6017) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub24_1, anIntArray286[--anInt4955] == 1 ? 1 : 0);
						Static557.method7883();
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6018) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub5_5, anIntArray286[--anInt4955]);
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6019) {
						local175 = anIntArray286[--anInt4955];
						local776 = Static96.aClass6_Sub22_7.aClass29_Sub5_2.method1502();
						if (local175 != local776) {
							if (Static126.method8985(Static556.anInt9319)) {
								if (local776 == 0 && Static278.anInt9800 != -1) {
									Static276.method4067(local175, Static278.anInt9800, Static365.aClass8_98);
									Static189.method2689();
									Static416.aBoolean483 = false;
								} else if (local175 == 0) {
									Static536.method7428();
									Static416.aBoolean483 = false;
								} else {
									Static425.method6299(local175);
								}
							}
							Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub5_2, local175);
							Static633.method8698();
							Static274.aBoolean301 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub5_1, anIntArray286[--anInt4955]);
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6021) {
						local175 = Static96.aClass6_Sub22_7.aClass29_Sub29_1.method9003();
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub29_2, anIntArray286[--anInt4955] == 1 ? 0 : local175);
						Static369.method5323();
						return;
					}
					if (arg0 == 6023) {
						local175 = anIntArray286[--anInt4955];
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub17_1, local175);
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6024) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub6_2, anIntArray286[--anInt4955]);
						Static633.method8698();
						return;
					}
					if (arg0 == 6025) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub23_1, anIntArray286[--anInt4955]);
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6027) {
						local175 = anIntArray286[--anInt4955];
						if (local175 < 0 || local175 > 1) {
							local175 = 0;
						}
						Static119.method1849(local175 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub1_1, anIntArray286[--anInt4955] == 0 ? 0 : 1);
						Static633.method8698();
						return;
					}
					if (arg0 == 6029) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub3_1, anIntArray286[--anInt4955]);
						Static633.method8698();
						return;
					}
					if (arg0 == 6030) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub27_1, anIntArray286[--anInt4955] == 0 ? 0 : 1);
						Static633.method8698();
						Static641.method8753();
						return;
					}
					if (arg0 == 6031) {
						local175 = anIntArray286[--anInt4955];
						if (local175 < 0 || local175 > 5) {
							local175 = 2;
						}
						Static646.method8805(local175, false);
						return;
					}
					if (arg0 == 6032) {
						anInt4955 -= 2;
						local175 = anIntArray286[anInt4955];
						local1496 = anIntArray286[anInt4955 + 1] == 1;
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub16_1, local175);
						if (!local1496) {
							Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub11_1, 0);
						}
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6033) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub2_1, anIntArray286[--anInt4955]);
						Static633.method8698();
						return;
					}
					if (arg0 == 6034) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub12_1, anIntArray286[--anInt4955] == 1 ? 1 : 0);
						Static633.method8698();
						Static180.method8370();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6035) {
						local175 = Static96.aClass6_Sub22_7.aClass29_Sub4_1.method1492();
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub4_2, anIntArray286[--anInt4955] == 1 ? 1 : local175);
						Static641.method8753();
						Static369.method5323();
						return;
					}
					if (arg0 == 6036) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub22_1, anIntArray286[--anInt4955]);
						Static633.method8698();
						Static558.aBoolean680 = true;
						return;
					}
					if (arg0 == 6037) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub5_4, anIntArray286[--anInt4955]);
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					if (arg0 == 6038) {
						local175 = anIntArray286[--anInt4955];
						local776 = Static96.aClass6_Sub22_7.aClass29_Sub5_3.method1502();
						if (local175 != local776 && Static278.anInt9800 == Static93.anInt7373) {
							if (!Static126.method8985(Static556.anInt9319)) {
								if (local776 == 0) {
									Static276.method4067(local175, Static278.anInt9800, Static365.aClass8_98);
									Static189.method2689();
									Static416.aBoolean483 = false;
								} else if (local175 == 0) {
									Static536.method7428();
									Static416.aBoolean483 = false;
								} else {
									Static425.method6299(local175);
								}
							}
							Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub5_3, local175);
							Static633.method8698();
							Static274.aBoolean301 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local175 = anIntArray286[--anInt4955];
						if (local175 > 255 || local175 < 0) {
							local175 = 0;
						}
						if (local175 != Static96.aClass6_Sub22_7.aClass29_Sub20_1.method6932()) {
							Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub20_1, local175);
							Static633.method8698();
							Static274.aBoolean301 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local175 = anIntArray286[--anInt4955];
						if (local175 != Static96.aClass6_Sub22_7.aClass29_Sub14_1.method5231()) {
							Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub14_1, local175);
							Static633.method8698();
							Static274.aBoolean301 = false;
							Static49.method969();
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub7_1.method1675();
						return;
					}
					if (arg0 == 6102) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub4_1.method1492() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub29_1.method9003() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub9_1.method2300() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub3_1.method1481();
						return;
					}
					if (arg0 == 6108) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub10_1.method2893() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub28_1.method8981() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub13_1.method4428();
						return;
					}
					if (arg0 == 6112) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub21_1.method6967() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub25_1.method8119() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub15_1.method5422() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub6_1.method1664();
						return;
					}
					if (arg0 == 6117) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub24_1.method7431() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub5_5.method1502();
						return;
					}
					if (arg0 == 6119) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub5_2.method1502();
						return;
					}
					if (arg0 == 6120) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub5_1.method1502();
						return;
					}
					if (arg0 == 6123) {
						anIntArray286[anInt4955++] = Static526.method7372();
						return;
					}
					if (arg0 == 6124) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub6_2.method1664();
						return;
					}
					if (arg0 == 6125) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub23_1.method7364();
						return;
					}
					if (arg0 == 6127) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub26_1.method8504() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub1_1.method679() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub3_1.method1481();
						return;
					}
					if (arg0 == 6130) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub27_1.method8554() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742();
						return;
					}
					if (arg0 == 6132) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub16_1.method5742();
						return;
					}
					if (arg0 == 6133) {
						anIntArray286[anInt4955++] = Static569.aClass380_6.aBoolean729 && !Static569.aClass380_6.aBoolean728 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub2_1.method1397();
						return;
					}
					if (arg0 == 6136) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub12_1.method4082() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray286[anInt4955++] = Static27.method6638(200, Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742());
						return;
					}
					if (arg0 == 6139) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub22_1.method7060();
						return;
					}
					if (arg0 == 6142) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub5_4.method1502();
						return;
					}
					if (arg0 == 6143) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub5_3.method1502();
						return;
					}
					if (arg0 == 6144) {
						anIntArray286[anInt4955++] = Static532.aBoolean620 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub20_1.method6932();
						return;
					}
					if (arg0 == 6146) {
						anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub14_1.method5231();
						return;
					}
					if (arg0 == 6147) {
						anIntArray286[anInt4955++] = Static296.aClass6_Sub33_1.anInt4998 < 512 || Static532.aBoolean620 || Static211.aBoolean214 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray286[anInt4955++] = Static511.aBoolean403 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt4955 -= 2;
						Static73.aShort23 = (short) anIntArray286[anInt4955];
						if (Static73.aShort23 <= 0) {
							Static73.aShort23 = 256;
						}
						Static183.aShort48 = (short) anIntArray286[anInt4955 + 1];
						if (Static183.aShort48 <= 0) {
							Static183.aShort48 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt4955 -= 2;
						Static175.aShort43 = (short) anIntArray286[anInt4955];
						if (Static175.aShort43 <= 0) {
							Static175.aShort43 = 256;
						}
						Static76.aShort24 = (short) anIntArray286[anInt4955 + 1];
						if (Static76.aShort24 <= 0) {
							Static76.aShort24 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt4955 -= 4;
						Static492.aShort80 = (short) anIntArray286[anInt4955];
						if (Static492.aShort80 <= 0) {
							Static492.aShort80 = 1;
						}
						Static423.aShort84 = (short) anIntArray286[anInt4955 + 1];
						if (Static423.aShort84 <= 0) {
							Static423.aShort84 = 32767;
						} else if (Static423.aShort84 < Static492.aShort80) {
							Static423.aShort84 = Static492.aShort80;
						}
						Static168.aShort42 = (short) anIntArray286[anInt4955 + 2];
						if (Static168.aShort42 <= 0) {
							Static168.aShort42 = 1;
						}
						Static372.aShort82 = (short) anIntArray286[anInt4955 + 3];
						if (Static372.aShort82 <= 0) {
							Static372.aShort82 = 32767;
							return;
						}
						if (Static372.aShort82 < Static168.aShort42) {
							Static372.aShort82 = Static168.aShort42;
						}
						return;
					}
					if (arg0 == 6203) {
						Static579.method8046(false, Static14.aClass321_4.anInt9103, 0, Static14.aClass321_4.anInt9077, 0);
						anIntArray286[anInt4955++] = Static24.anInt590;
						anIntArray286[anInt4955++] = Static111.anInt6761;
						return;
					}
					if (arg0 == 6204) {
						anIntArray286[anInt4955++] = Static175.aShort43;
						anIntArray286[anInt4955++] = Static76.aShort24;
						return;
					}
					if (arg0 == 6205) {
						anIntArray286[anInt4955++] = Static73.aShort23;
						anIntArray286[anInt4955++] = Static183.aShort48;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray286[anInt4955++] = (int) (Static566.method7936() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray286[anInt4955++] = (int) (Static566.method7936() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt4955 -= 3;
						local175 = anIntArray286[anInt4955];
						local776 = anIntArray286[anInt4955 + 1];
						local97 = anIntArray286[anInt4955 + 2];
						@Pc(6709) long local6709 = Static478.method6999(local97, local175, local776);
						local3369 = Static460.method6845(local6709);
						if (local97 < 1970) {
							local3369--;
						}
						anIntArray286[anInt4955++] = local3369;
						return;
					}
					if (arg0 == 6303) {
						anIntArray286[anInt4955++] = Static53.method1033(Static566.method7936());
						return;
					}
					if (arg0 == 6304) {
						local175 = anIntArray286[--anInt4955];
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
						anIntArray286[anInt4955++] = local1496 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local175 = anIntArray286[--anInt4955];
						@Pc(6827) int[] local6827 = Static252.method3642(local175);
						Static679.method1569(local6827, 0, anIntArray286, anInt4955, 3);
						anInt4955 += 3;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray286[anInt4955++] = Static219.method3188() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray286[anInt4955++] = Static492.method5182() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static556.anInt9319 == 7 && Static190.anInt3237 == 0 && Static131.anInt2291 == 0) {
							if (Static108.aBoolean122) {
								anIntArray286[anInt4955++] = 0;
								return;
							}
							if (Static526.aLong257 > Static566.method7936() - 1000L) {
								anIntArray286[anInt4955++] = 1;
								return;
							}
							Static108.aBoolean122 = true;
							local52 = Static268.method3981(Static377.aClass15_2, Static585.aClass289_142);
							local52.aClass6_Sub23_Sub1_2.method8364(Static65.anInt1208);
							Static670.method9077(local52);
							anIntArray286[anInt4955++] = 0;
							return;
						}
						anIntArray286[anInt4955++] = 1;
						return;
					}
					@Pc(6987) Class309 local6987;
					@Pc(6954) Class235_Sub1 local6954;
					if (arg0 == 6501) {
						local6954 = Static175.method2474();
						if (local6954 != null) {
							anIntArray286[anInt4955++] = local6954.anInt6483;
							anIntArray286[anInt4955++] = local6954.anInt6469;
							aStringArray35[anInt4952++] = local6954.aString89;
							local6987 = local6954.method5489();
							anIntArray286[anInt4955++] = local6987.anInt8649;
							aStringArray35[anInt4952++] = local6987.aString119;
							anIntArray286[anInt4955++] = local6954.anInt6473;
							anIntArray286[anInt4955++] = local6954.anInt6481;
							aStringArray35[anInt4952++] = local6954.aString90;
							return;
						}
						anIntArray286[anInt4955++] = -1;
						anIntArray286[anInt4955++] = 0;
						aStringArray35[anInt4952++] = "";
						anIntArray286[anInt4955++] = 0;
						aStringArray35[anInt4952++] = "";
						anIntArray286[anInt4955++] = 0;
						anIntArray286[anInt4955++] = 0;
						aStringArray35[anInt4952++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6954 = Static96.method1572();
						if (local6954 != null) {
							anIntArray286[anInt4955++] = local6954.anInt6483;
							anIntArray286[anInt4955++] = local6954.anInt6469;
							aStringArray35[anInt4952++] = local6954.aString89;
							local6987 = local6954.method5489();
							anIntArray286[anInt4955++] = local6987.anInt8649;
							aStringArray35[anInt4952++] = local6987.aString119;
							anIntArray286[anInt4955++] = local6954.anInt6473;
							anIntArray286[anInt4955++] = local6954.anInt6481;
							aStringArray35[anInt4952++] = local6954.aString90;
							return;
						}
						anIntArray286[anInt4955++] = -1;
						anIntArray286[anInt4955++] = 0;
						aStringArray35[anInt4952++] = "";
						anIntArray286[anInt4955++] = 0;
						aStringArray35[anInt4952++] = "";
						anIntArray286[anInt4955++] = 0;
						anIntArray286[anInt4955++] = 0;
						aStringArray35[anInt4952++] = "";
						return;
					}
					if (arg0 == 6503) {
						local175 = anIntArray286[--anInt4955];
						local89 = aStringArray35[--anInt4952];
						if (Static556.anInt9319 == 7 && Static190.anInt3237 == 0 && Static131.anInt2291 == 0) {
							anIntArray286[anInt4955++] = Static627.method8634(local89, local175) ? 1 : 0;
							return;
						}
						anIntArray286[anInt4955++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local175 = anIntArray286[--anInt4955];
						@Pc(7314) Class235_Sub1 local7314 = Static203.method3046(local175);
						if (local7314 != null) {
							anIntArray286[anInt4955++] = local7314.anInt6469;
							aStringArray35[anInt4952++] = local7314.aString89;
							@Pc(7338) Class309 local7338 = local7314.method5489();
							anIntArray286[anInt4955++] = local7338.anInt8649;
							aStringArray35[anInt4952++] = local7338.aString119;
							anIntArray286[anInt4955++] = local7314.anInt6473;
							anIntArray286[anInt4955++] = local7314.anInt6481;
							aStringArray35[anInt4952++] = local7314.aString90;
							return;
						}
						anIntArray286[anInt4955++] = -1;
						aStringArray35[anInt4952++] = "";
						anIntArray286[anInt4955++] = 0;
						aStringArray35[anInt4952++] = "";
						anIntArray286[anInt4955++] = 0;
						anIntArray286[anInt4955++] = 0;
						aStringArray35[anInt4952++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt4955 -= 4;
						local175 = anIntArray286[anInt4955];
						local1496 = anIntArray286[anInt4955 + 1] == 1;
						local97 = anIntArray286[anInt4955 + 2];
						local2205 = anIntArray286[anInt4955 + 3] == 1;
						Static606.method8308(local2205, local1496, local175, local97);
						return;
					}
					if (arg0 == 6508) {
						Static666.method9033();
						return;
					}
					if (arg0 == 6509) {
						if (Static556.anInt9319 != 7) {
							return;
						}
						Static387.aBoolean434 = anIntArray286[--anInt4955] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray286[anInt4955++] = Static434.anInt7423;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static14.aClass286_1 == Static265.aClass286_4) {
						if (arg0 == 6700) {
							local175 = Static262.aClass209_35.method5033();
							if (Static561.anInt9357 != -1) {
								local175++;
							}
							anIntArray286[anInt4955++] = local175;
							return;
						}
						if (arg0 == 6701) {
							local175 = anIntArray286[--anInt4955];
							if (Static561.anInt9357 != -1) {
								if (local175 == 0) {
									anIntArray286[anInt4955++] = Static561.anInt9357;
									return;
								}
								local175--;
							}
							@Pc(7586) Class6_Sub51 local7586 = (Class6_Sub51) Static262.aClass209_35.method5037();
							while (local175-- > 0) {
								local7586 = (Class6_Sub51) Static262.aClass209_35.method5036();
							}
							anIntArray286[anInt4955++] = local7586.anInt9360;
							return;
						}
						if (arg0 == 6702) {
							local175 = anIntArray286[--anInt4955];
							if (Static109.aClass321ArrayArray1[local175] == null) {
								aStringArray35[anInt4952++] = "";
								return;
							}
							local89 = Static109.aClass321ArrayArray1[local175][0].aString125;
							if (local89 == null) {
								aStringArray35[anInt4952++] = "";
								return;
							}
							aStringArray35[anInt4952++] = local89.substring(0, local89.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local175 = anIntArray286[--anInt4955];
							if (Static109.aClass321ArrayArray1[local175] == null) {
								anIntArray286[anInt4955++] = 0;
								return;
							}
							anIntArray286[anInt4955++] = Static109.aClass321ArrayArray1[local175].length;
							return;
						}
						if (arg0 == 6704) {
							anInt4955 -= 2;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							if (Static109.aClass321ArrayArray1[local175] == null) {
								aStringArray35[anInt4952++] = "";
								return;
							}
							local181 = Static109.aClass321ArrayArray1[local175][local776].aString125;
							if (local181 == null) {
								aStringArray35[anInt4952++] = "";
								return;
							}
							aStringArray35[anInt4952++] = local181;
							return;
						}
						if (arg0 == 6705) {
							anInt4955 -= 2;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							if (Static109.aClass321ArrayArray1[local175] == null) {
								anIntArray286[anInt4955++] = 0;
								return;
							}
							anIntArray286[anInt4955++] = Static109.aClass321ArrayArray1[local175][local776].anInt9051;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt4955 -= 3;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							local97 = anIntArray286[anInt4955 + 2];
							Static488.method7083(local97, local175 << 16 | local776, "", 1);
							return;
						}
						if (arg0 == 6708) {
							anInt4955 -= 3;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							local97 = anIntArray286[anInt4955 + 2];
							Static488.method7083(local97, local175 << 16 | local776, "", 2);
							return;
						}
						if (arg0 == 6709) {
							anInt4955 -= 3;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							local97 = anIntArray286[anInt4955 + 2];
							Static488.method7083(local97, local175 << 16 | local776, "", 3);
							return;
						}
						if (arg0 == 6710) {
							anInt4955 -= 3;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							local97 = anIntArray286[anInt4955 + 2];
							Static488.method7083(local97, local175 << 16 | local776, "", 4);
							return;
						}
						if (arg0 == 6711) {
							anInt4955 -= 3;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							local97 = anIntArray286[anInt4955 + 2];
							Static488.method7083(local97, local175 << 16 | local776, "", 5);
							return;
						}
						if (arg0 == 6712) {
							anInt4955 -= 3;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							local97 = anIntArray286[anInt4955 + 2];
							Static488.method7083(local97, local175 << 16 | local776, "", 6);
							return;
						}
						if (arg0 == 6713) {
							anInt4955 -= 3;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							local97 = anIntArray286[anInt4955 + 2];
							Static488.method7083(local97, local175 << 16 | local776, "", 7);
							return;
						}
						if (arg0 == 6714) {
							anInt4955 -= 3;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							local97 = anIntArray286[anInt4955 + 2];
							Static488.method7083(local97, local175 << 16 | local776, "", 8);
							return;
						}
						if (arg0 == 6715) {
							anInt4955 -= 3;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							local97 = anIntArray286[anInt4955 + 2];
							Static488.method7083(local97, local175 << 16 | local776, "", 9);
							return;
						}
						if (arg0 == 6716) {
							anInt4955 -= 3;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							local97 = anIntArray286[anInt4955 + 2];
							Static488.method7083(local97, local175 << 16 | local776, "", 10);
							return;
						}
						if (arg0 == 6717) {
							anInt4955 -= 3;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							local97 = anIntArray286[anInt4955 + 2];
							@Pc(8174) Class321 local8174 = Static640.method8748(local175 << 16 | local776, local97);
							Static221.method3209();
							@Pc(8179) Class6_Sub42 local8179 = Static83.method1453(local8174);
							Static31.method715(local8174, local8179.anInt6749, local8179.method5790());
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8207) Class318 local8207;
						if (arg0 == 6800) {
							local175 = anIntArray286[--anInt4955];
							local8207 = Static252.aClass280_1.method6911(local175);
							if (local8207.aString120 == null) {
								aStringArray35[anInt4952++] = "";
								return;
							}
							aStringArray35[anInt4952++] = local8207.aString120;
							return;
						}
						if (arg0 == 6801) {
							local175 = anIntArray286[--anInt4955];
							local8207 = Static252.aClass280_1.method6911(local175);
							anIntArray286[anInt4955++] = local8207.anInt8722;
							return;
						}
						if (arg0 == 6802) {
							local175 = anIntArray286[--anInt4955];
							local8207 = Static252.aClass280_1.method6911(local175);
							anIntArray286[anInt4955++] = local8207.anInt8720;
							return;
						}
						if (arg0 == 6803) {
							local175 = anIntArray286[--anInt4955];
							local8207 = Static252.aClass280_1.method6911(local175);
							anIntArray286[anInt4955++] = local8207.anInt8700;
							return;
						}
						if (arg0 == 6804) {
							anInt4955 -= 2;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							@Pc(8329) Class325 local8329 = Static280.aClass349_2.method8157(local776);
							if (local8329.method7797()) {
								aStringArray35[anInt4952++] = Static252.aClass280_1.method6911(local175).method7388(local776, local8329.aString129);
								return;
							}
							anIntArray286[anInt4955++] = Static252.aClass280_1.method6911(local175).method7391(local776, local8329.anInt9243);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray286[anInt4955++] = Static322.aBoolean346 && !Static377.aBoolean420 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray286[anInt4955++] = (int) (Static553.aLong264 / 60000L);
							anIntArray286[anInt4955++] = (int) ((Static553.aLong264 - Static566.method7936() - Static662.aLong305) / 60000L);
							anIntArray286[anInt4955++] = Static206.aBoolean211 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray286[anInt4955++] = Static283.anInt4844;
							return;
						}
						if (arg0 == 6903) {
							anIntArray286[anInt4955++] = Static330.anInt155;
							return;
						}
						if (arg0 == 6904) {
							anIntArray286[anInt4955++] = Static328.anInt8843;
							return;
						}
						if (arg0 == 6905) {
							local83 = "";
							if (Static560.aClass103_3 != null) {
								if (Static560.aClass103_3.anObject9 == null) {
									local83 = Static89.method8410(Static560.aClass103_3.anInt2540);
								} else {
									local83 = (String) Static560.aClass103_3.anObject9;
								}
							}
							aStringArray35[anInt4952++] = local83;
							return;
						}
						if (arg0 == 6906) {
							anIntArray286[anInt4955++] = Static581.anInt9565;
							return;
						}
						if (arg0 == 6907) {
							anIntArray286[anInt4955++] = Static139.anInt2421;
							return;
						}
						if (arg0 == 6908) {
							anIntArray286[anInt4955++] = Static365.anInt6246;
							return;
						}
						if (arg0 == 6909) {
							anIntArray286[anInt4955++] = Static467.aBoolean556 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray286[anInt4955++] = Static560.anInt1378;
							return;
						}
						if (arg0 == 6911) {
							anIntArray286[anInt4955++] = Static570.anInt9435;
							return;
						}
						if (arg0 == 6912) {
							anIntArray286[anInt4955++] = Static65.anInt1207;
							return;
						}
						if (arg0 == 6913) {
							anIntArray286[anInt4955++] = Static375.anInt6324;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local175 = Static337.method2274();
							anIntArray286[anInt4955++] = Static191.anInt3244 = Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742();
							anIntArray286[anInt4955++] = local175;
							Static641.method8753();
							Static633.method8698();
							Static274.aBoolean301 = false;
							return;
						}
						if (arg0 == 7001) {
							Static216.method3141();
							Static641.method8753();
							Static633.method8698();
							Static274.aBoolean301 = false;
							return;
						}
						if (arg0 == 7002) {
							Static478.method6996();
							Static641.method8753();
							Static633.method8698();
							Static274.aBoolean301 = false;
							return;
						}
						if (arg0 == 7003) {
							Static551.method7237();
							Static641.method8753();
							Static633.method8698();
							Static274.aBoolean301 = false;
							return;
						}
						if (arg0 == 7004) {
							Static489.method7094();
							Static641.method8753();
							Static633.method8698();
							Static274.aBoolean301 = false;
							return;
						}
						if (arg0 == 7005) {
							Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub11_1, 0);
							Static633.method8698();
							Static274.aBoolean301 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static191.anInt3244 == 2) {
								Static407.aBoolean443 = true;
								return;
							}
							if (Static191.anInt3244 == 1) {
								Static158.aBoolean163 = true;
								return;
							}
							if (Static191.anInt3244 == 3) {
								Static423.aBoolean488 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub11_1.method3250();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt4955 -= 2;
							local175 = anIntArray286[anInt4955];
							local776 = anIntArray286[anInt4955 + 1];
							if (local175 != -1) {
								if (local776 > 255) {
									local776 = 255;
								} else if (local776 < 0) {
									local776 = 0;
								}
								Static380.method5385(local175, false, local776);
							}
							return;
						}
						if (arg0 == 7101) {
							local175 = anIntArray286[--anInt4955];
							if (local175 != -1) {
								Static270.method3993(local175);
							}
							return;
						}
						if (arg0 == 7102) {
							local175 = anIntArray286[--anInt4955];
							if (local175 != -1) {
								Static216.method3143(local175);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray286[anInt4955++] = Static24.method599("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub9_1.method2298() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub28_1.method8980() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub13_1.method4424() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub25_1.method8118() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub6_2.method1662() && Static546.aClass132_13.method7474() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub17_1.method5778() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub23_1.method7365() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub26_1.method8502() && Static546.aClass132_13.method7470() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub27_1.method8553() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub12_1.method4078() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub22_1.method7059() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub15_1.method5423() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub14_1.method5230() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub16_1.method5744() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local175 = anIntArray286[--anInt4955];
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub9_1.method8994(local175);
							return;
						}
						if (arg0 == 7302) {
							local175 = anIntArray286[--anInt4955];
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub28_1.method8994(local175);
							return;
						}
						if (arg0 == 7303) {
							local175 = anIntArray286[--anInt4955];
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub13_1.method8994(local175);
							return;
						}
						if (arg0 == 7304) {
							local175 = anIntArray286[--anInt4955];
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub25_1.method8994(local175);
							return;
						}
						if (arg0 == 7305) {
							local175 = anIntArray286[--anInt4955];
							if (!Static546.aClass132_13.method7474()) {
								anIntArray286[anInt4955++] = 3;
								return;
							}
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub6_2.method8994(local175);
							return;
						}
						if (arg0 == 7306) {
							local175 = anIntArray286[--anInt4955];
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub17_1.method8994(local175);
							return;
						}
						if (arg0 == 7307) {
							local175 = anIntArray286[--anInt4955];
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub23_1.method8994(local175);
							return;
						}
						if (arg0 == 7308) {
							local175 = anIntArray286[--anInt4955];
							if (!Static546.aClass132_13.method7470()) {
								anIntArray286[anInt4955++] = 3;
								return;
							}
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub26_1.method8994(local175);
							return;
						}
						if (arg0 == 7309) {
							local175 = anIntArray286[--anInt4955];
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub27_1.method8994(local175);
							return;
						}
						if (arg0 == 7310) {
							local175 = anIntArray286[--anInt4955];
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub12_1.method8994(local175);
							return;
						}
						if (arg0 == 7311) {
							local175 = anIntArray286[--anInt4955];
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub22_1.method8994(local175);
							return;
						}
						if (arg0 == 7312) {
							local175 = anIntArray286[--anInt4955];
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub15_1.method8994(local175);
							return;
						}
						if (arg0 == 7313) {
							local175 = anIntArray286[--anInt4955];
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub14_1.method8994(local175);
							return;
						}
						if (arg0 == 7314) {
							local175 = anIntArray286[--anInt4955];
							anIntArray286[anInt4955++] = Static96.aClass6_Sub22_7.aClass29_Sub16_1.method8994(local175);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)J")
	private static long method4216(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass145_3.method3157(Static457.aClass176_6.anInt4801 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)I")
	private static int method4218(@OriginalArg(0) int arg0) {
		@Pc(4) Class240 local4 = Static672.aClass198_3.method4604(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(21) Integer local21 = aClass145_3.method3146(Static457.aClass176_6.anInt4801 << 16 | arg0);
		if (local21 == null) {
			return local4.aChar3 == 'i' || local4.aChar3 == '1' ? 0 : -1;
		} else {
			return local21;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)V")
	public static void method4219(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static506.method7223(arg0)) {
			return;
		}
		@Pc(12) Class321[] local12 = Static109.aClass321ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class321 local19 = local12[local14];
			if (local19.anObjectArray12 != null) {
				@Pc(26) Class6_Sub49 local26 = new Class6_Sub49();
				local26.aClass321_44 = local19;
				local26.anObjectArray35 = local19.anObjectArray12;
				method4223(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "(I)V")
	private static void method4220(@OriginalArg(0) int arg0) {
		@Pc(3) Class321 local3 = Static286.method4134(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class321[] local13 = Static202.aClass321ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class321[] local19 = Static109.aClass321ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static202.aClass321ArrayArray2[local9] = new Class321[local22];
			Static679.method1568(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static679.method1568(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!raa;I)V")
	private static void method4221(@OriginalArg(0) Class6_Sub4_Sub16 arg0, @OriginalArg(1) int arg1) {
		anInt4955 = 0;
		anInt4952 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray546;
		@Pc(11) int[] local11 = arg0.anIntArray547;
		@Pc(13) byte local13 = -1;
		anInt4957 = 0;
		@Pc(639) int local639;
		try {
			@Pc(17) int local17 = 0;
			label333: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 150) {
					@Pc(1134) boolean local1134;
					if (local11[local5] == 1) {
						local1134 = true;
					} else {
						local1134 = false;
					}
					if (local31 >= 150 && local31 < 5000) {
						method4230(local31, local1134);
					} else if (local31 >= 5000 && local31 < 10000) {
						method4215(local31, local1134);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray286[anInt4955++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray286[anInt4955++] = Static659.aClass363_3.anIntArray670[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static659.aClass363_3.method8559(anIntArray286[--anInt4955], local54);
					} else if (local31 == 3) {
						aStringArray35[anInt4952++] = arg0.aStringArray52[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt4955 -= 2;
						if (anIntArray286[anInt4955] != anIntArray286[anInt4955 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt4955 -= 2;
						if (anIntArray286[anInt4955] == anIntArray286[anInt4955 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt4955 -= 2;
						if (anIntArray286[anInt4955] < anIntArray286[anInt4955 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt4955 -= 2;
						if (anIntArray286[anInt4955] > anIntArray286[anInt4955 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt4957 == 0) {
							return;
						}
						@Pc(216) Class256 local216 = aClass256Array1[--anInt4957];
						arg0 = local216.aClass6_Sub4_Sub16_1;
						local8 = arg0.anIntArray546;
						local11 = arg0.anIntArray547;
						local5 = local216.anInt7327;
						anIntArray284 = local216.anIntArray454;
						aStringArray36 = local216.aStringArray47;
						aLongArray16 = local216.aLongArray18;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray286[anInt4955++] = Static659.aClass363_3.method8556(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static659.aClass363_3.method8563(anIntArray286[--anInt4955], local54);
					} else if (local31 == 31) {
						anInt4955 -= 2;
						if (anIntArray286[anInt4955] <= anIntArray286[anInt4955 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt4955 -= 2;
						if (anIntArray286[anInt4955] >= anIntArray286[anInt4955 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray286[anInt4955++] = anIntArray284[local11[local5]];
					} else if (local31 == 34) {
						anIntArray284[local11[local5]] = anIntArray286[--anInt4955];
					} else if (local31 == 35) {
						aStringArray35[anInt4952++] = aStringArray36[local11[local5]];
					} else if (local31 == 36) {
						aStringArray36[local11[local5]] = aStringArray35[--anInt4952];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt4952 -= local54;
						@Pc(403) String local403 = Static484.method7046(aStringArray35, anInt4952, local54);
						aStringArray35[anInt4952++] = local403;
					} else if (local31 == 38) {
						anInt4955--;
					} else if (local31 == 39) {
						anInt4952--;
					} else if (local31 == 40) {
						local54 = local11[local5];
						@Pc(439) Class6_Sub4_Sub16 local439 = Static375.method5342(local54);
						if (local439 == null) {
							throw new RuntimeException();
						}
						@Pc(449) int[] local449 = new int[local439.anInt8430];
						@Pc(453) String[] local453 = new String[local439.anInt8429];
						@Pc(457) long[] local457 = new long[local439.anInt8431];
						for (@Pc(459) int local459 = 0; local459 < local439.anInt8428; local459++) {
							local449[local459] = anIntArray286[anInt4955 + local459 - local439.anInt8428];
						}
						for (@Pc(478) int local478 = 0; local478 < local439.anInt8426; local478++) {
							local453[local478] = aStringArray35[anInt4952 + local478 - local439.anInt8426];
						}
						for (@Pc(497) int local497 = 0; local497 < local439.anInt8427; local497++) {
							local457[local497] = aLongArray17[anInt4953 + local497 - local439.anInt8427];
						}
						anInt4955 -= local439.anInt8428;
						anInt4952 -= local439.anInt8426;
						anInt4953 -= local439.anInt8427;
						@Pc(533) Class256 local533 = new Class256();
						local533.aClass6_Sub4_Sub16_1 = arg0;
						local533.anInt7327 = local5;
						local533.anIntArray454 = anIntArray284;
						local533.aStringArray47 = aStringArray36;
						local533.aLongArray18 = aLongArray16;
						if (anInt4957 >= aClass256Array1.length) {
							throw new RuntimeException();
						}
						aClass256Array1[anInt4957++] = local533;
						arg0 = local439;
						local8 = local439.anIntArray546;
						local11 = local439.anIntArray547;
						local5 = -1;
						anIntArray284 = local449;
						aStringArray36 = local453;
						aLongArray16 = local457;
					} else if (local31 == 42) {
						anIntArray286[anInt4955++] = Static466.anIntArray529[local11[local5]];
					} else if (local31 == 43) {
						local54 = local11[local5];
						Static466.anIntArray529[local54] = anIntArray286[--anInt4955];
						Static30.method681(local54);
						Static192.aBoolean195 |= Static620.aBooleanArray33[local54];
					} else if (local31 == 44) {
						local54 = local11[local5] >> 16;
						local639 = local11[local5] & 0xFFFF;
						@Pc(647) int local647 = anIntArray286[--anInt4955];
						if (local647 >= 0 && local647 <= 5000) {
							anIntArray283[local54] = local647;
							@Pc(662) byte local662 = -1;
							if (local639 == 105) {
								local662 = 0;
							}
							@Pc(669) int local669 = 0;
							while (true) {
								if (local669 >= local647) {
									continue label333;
								}
								anIntArrayArray27[local54][local669] = local662;
								local669++;
							}
						}
						throw new RuntimeException();
					} else if (local31 == 45) {
						local54 = local11[local5];
						local639 = anIntArray286[--anInt4955];
						if (local639 < 0 || local639 >= anIntArray283[local54]) {
							throw new RuntimeException();
						}
						anIntArray286[anInt4955++] = anIntArrayArray27[local54][local639];
					} else if (local31 == 46) {
						local54 = local11[local5];
						anInt4955 -= 2;
						local639 = anIntArray286[anInt4955];
						if (local639 < 0 || local639 >= anIntArray283[local54]) {
							throw new RuntimeException();
						}
						anIntArrayArray27[local54][local639] = anIntArray286[anInt4955 + 1];
					} else if (local31 == 47) {
						@Pc(766) String local766 = Static604.aStringArray31[local11[local5]];
						if (local766 == null) {
							local766 = "null";
						}
						aStringArray35[anInt4952++] = local766;
					} else if (local31 == 48) {
						local54 = local11[local5];
						Static604.aStringArray31[local54] = aStringArray35[--anInt4952];
						Static567.method7937(local54);
					} else if (local31 == 51) {
						@Pc(810) Class209 local810 = arg0.aClass209Array1[local11[local5]];
						@Pc(823) Class6_Sub36 local823 = (Class6_Sub36) local810.method5038((long) anIntArray286[--anInt4955]);
						if (local823 != null) {
							local5 += local823.anInt5996;
						}
					} else if (local31 == 54) {
						aLongArray17[anInt4953++] = arg0.aLongArray20[local5];
					} else if (local31 == 55) {
						anInt4953--;
					} else if (local31 == 66) {
						aLongArray17[anInt4953++] = aLongArray16[local11[local5]];
					} else if (local31 == 67) {
						aLongArray16[local11[local5]] = aLongArray17[--anInt4953];
					} else if (local31 == 68) {
						anInt4953 -= 2;
						if (aLongArray17[anInt4953] != aLongArray17[anInt4953 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 69) {
						anInt4953 -= 2;
						if (aLongArray17[anInt4953] == aLongArray17[anInt4953 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 70) {
						anInt4953 -= 2;
						if (aLongArray17[anInt4953] < aLongArray17[anInt4953 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 71) {
						anInt4953 -= 2;
						if (aLongArray17[anInt4953] > aLongArray17[anInt4953 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 72) {
						anInt4953 -= 2;
						if (aLongArray17[anInt4953] <= aLongArray17[anInt4953 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 73) {
						anInt4953 -= 2;
						if (aLongArray17[anInt4953] >= aLongArray17[anInt4953 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 86) {
						if (anIntArray286[--anInt4955] == 1) {
							local5 += local11[local5];
						}
					} else if (local31 == 87) {
						if (anIntArray286[--anInt4955] == 0) {
							local5 += local11[local5];
						}
					} else if (local31 == 112) {
						anIntArray286[anInt4955++] = method4218(local11[local5]);
					} else if (local31 == 113) {
						anIntArray286[anInt4955++] = method4231(local11[local5]);
					} else if (local31 == 114) {
						aLongArray17[anInt4953++] = method4216(local11[local5]);
					} else if (local31 == 115) {
						aStringArray35[anInt4952++] = method4227(local11[local5]);
					}
				}
			}
		} catch (@Pc(1169) Exception local1169) {
			@Pc(1188) StringBuffer local1188;
			if (arg0.aString113 == null) {
				local1188 = new StringBuffer(30);
				local1188.append("CS2: ").append(arg0.aLong314).append(" ");
				for (local639 = anInt4957 - 1; local639 >= 0; local639--) {
					local1188.append("v: ").append(aClass256Array1[local639].aClass6_Sub4_Sub16_1.aLong314).append(" ");
				}
				local1188.append("op: ").append(local13);
				Static664.method9007(local1169, local1188.toString());
			} else {
				Static270.method3991("Clientscript error in: " + arg0.aString113);
				local1188 = new StringBuffer(30);
				local1188.append("Clientscript error in: ").append(arg0.aString113).append("\n");
				for (local639 = anInt4957 - 1; local639 >= 0; local639--) {
					local1188.append("via: ").append(aClass256Array1[local639].aClass6_Sub4_Sub16_1.aString113).append("\n");
				}
				local1188.append("Op: ").append(local13).append("\n");
				@Pc(1228) String local1228 = local1169.getMessage();
				if (local1228 != null && local1228.length() > 0) {
					local1188.append("Message: ").append(local1228).append("\n");
				}
				Static664.method9007(local1169, local1188.toString());
				Static67.method1187(local1188.toString());
			}
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(C)I")
	private static int method4222(@OriginalArg(0) char arg0) {
		return Static498.method7171(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!so;I)V")
	private static void method4223(@OriginalArg(0) Class6_Sub49 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray35;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class6_Sub4_Sub16 local12 = Static375.method5342(local8);
		if (local12 == null) {
			return;
		}
		anIntArray284 = new int[local12.anInt8430];
		@Pc(21) int local21 = 0;
		aStringArray36 = new String[local12.anInt8429];
		@Pc(27) int local27 = 0;
		aLongArray16 = new long[local12.anInt8431];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 1; local35 < local2.length; local35++) {
			if (local2[local35] instanceof Integer) {
				@Pc(47) int local47 = (Integer) local2[local35];
				if (local47 == -2147483647) {
					local47 = arg0.anInt9242;
				}
				if (local47 == -2147483646) {
					local47 = arg0.anInt9235;
				}
				if (local47 == -2147483645) {
					local47 = arg0.aClass321_44 == null ? -1 : arg0.aClass321_44.anInt9040;
				}
				if (local47 == -2147483644) {
					local47 = arg0.anInt9236;
				}
				if (local47 == -2147483643) {
					local47 = arg0.aClass321_44 == null ? -1 : arg0.aClass321_44.anInt9061;
				}
				if (local47 == -2147483642) {
					local47 = arg0.aClass321_43 == null ? -1 : arg0.aClass321_43.anInt9040;
				}
				if (local47 == -2147483641) {
					local47 = arg0.aClass321_43 == null ? -1 : arg0.aClass321_43.anInt9061;
				}
				if (local47 == -2147483640) {
					local47 = arg0.anInt9239;
				}
				if (local47 == -2147483639) {
					local47 = arg0.anInt9240;
				}
				anIntArray284[local21++] = local47;
			} else if (local2[local35] instanceof String) {
				@Pc(141) String local141 = (String) local2[local35];
				if (local141.equals("event_opbase")) {
					local141 = arg0.aString128;
				}
				aStringArray36[local27++] = local141;
			} else if (local2[local35] instanceof Long) {
				@Pc(165) long local165 = (Long) local2[local35];
				aLongArray16[local33++] = local165;
			}
		}
		anInt4965 = arg0.anInt9238;
		method4221(local12, arg1);
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(IZ)V")
	public static void method4224() {
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!ul;II)V")
	public static void method4225(@OriginalArg(0) Class357 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class6_Sub4_Sub16 local5 = Static401.method5789(arg0, arg2, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray284 = new int[local5.anInt8430];
		aStringArray36 = new String[local5.anInt8429];
		if (local5.aClass357_24 == Static2.aClass357_28 || local5.aClass357_24 == Static97.aClass357_7 || local5.aClass357_24 == Static302.aClass357_19) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static562.aClass321_46 != null) {
				local30 = Static562.aClass321_46.anInt9016;
				local32 = Static562.aClass321_46.anInt9072;
			}
			anIntArray284[0] = Static193.aClass128_1.method5191() - local30;
			anIntArray284[1] = Static193.aClass128_1.method5188() - local32;
		}
		method4221(local5, 200000);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!so;)V")
	public static void method4226(@OriginalArg(0) Class6_Sub49 arg0) {
		method4223(arg0, 200000);
	}

	@OriginalMember(owner = "client!kaa", name = "e", descriptor = "(I)Ljava/lang/String;")
	private static String method4227(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass145_3.method3164(Static457.aClass176_6.anInt4801 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "()V")
	public static void method4228() {
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4229(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static26.anInt609 == 0 && (Static322.aBoolean346 && !Static377.aBoolean420 || Static525.aBoolean615)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static52.aClass41_47.method1007(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static52.aClass41_47.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_48.method1007(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static52.aClass41_48.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_49.method1007(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static52.aClass41_49.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_50.method1007(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static52.aClass41_50.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_51.method1007(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static52.aClass41_51.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_52.method1007(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static52.aClass41_52.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_53.method1007(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static52.aClass41_53.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_54.method1007(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static52.aClass41_54.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_55.method1007(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static52.aClass41_55.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_56.method1007(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static52.aClass41_56.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_57.method1007(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static52.aClass41_57.method1007(0).length());
		} else if (local11.startsWith(Class41.lb.method1007(0))) {
			local13 = 11;
			arg0 = arg0.substring(Class41.lb.method1007(0).length());
		} else if (Static616.anInt10077 != 0) {
			if (local11.startsWith(Static52.aClass41_47.method1007(Static616.anInt10077))) {
				local13 = 0;
				arg0 = arg0.substring(Static52.aClass41_47.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_48.method1007(Static616.anInt10077))) {
				local13 = 1;
				arg0 = arg0.substring(Static52.aClass41_48.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_49.method1007(Static616.anInt10077))) {
				local13 = 2;
				arg0 = arg0.substring(Static52.aClass41_49.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_50.method1007(Static616.anInt10077))) {
				local13 = 3;
				arg0 = arg0.substring(Static52.aClass41_50.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_51.method1007(Static616.anInt10077))) {
				local13 = 4;
				arg0 = arg0.substring(Static52.aClass41_51.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_52.method1007(Static616.anInt10077))) {
				local13 = 5;
				arg0 = arg0.substring(Static52.aClass41_52.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_53.method1007(Static616.anInt10077))) {
				local13 = 6;
				arg0 = arg0.substring(Static52.aClass41_53.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_54.method1007(Static616.anInt10077))) {
				local13 = 7;
				arg0 = arg0.substring(Static52.aClass41_54.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_55.method1007(Static616.anInt10077))) {
				local13 = 8;
				arg0 = arg0.substring(Static52.aClass41_55.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_56.method1007(Static616.anInt10077))) {
				local13 = 9;
				arg0 = arg0.substring(Static52.aClass41_56.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_57.method1007(Static616.anInt10077))) {
				local13 = 10;
				arg0 = arg0.substring(Static52.aClass41_57.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Class41.lb.method1007(Static616.anInt10077))) {
				local13 = 11;
				arg0 = arg0.substring(Class41.lb.method1007(Static616.anInt10077).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static52.aClass41_58.method1007(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static52.aClass41_58.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_59.method1007(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static52.aClass41_59.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_60.method1007(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static52.aClass41_60.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_61.method1007(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static52.aClass41_61.method1007(0).length());
		} else if (local11.startsWith(Static52.aClass41_62.method1007(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static52.aClass41_62.method1007(0).length());
		} else if (Static616.anInt10077 != 0) {
			if (local11.startsWith(Static52.aClass41_58.method1007(Static616.anInt10077))) {
				local451 = 1;
				arg0 = arg0.substring(Static52.aClass41_58.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_59.method1007(Static616.anInt10077))) {
				local451 = 2;
				arg0 = arg0.substring(Static52.aClass41_59.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_60.method1007(Static616.anInt10077))) {
				local451 = 3;
				arg0 = arg0.substring(Static52.aClass41_60.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_61.method1007(Static616.anInt10077))) {
				local451 = 4;
				arg0 = arg0.substring(Static52.aClass41_61.method1007(Static616.anInt10077).length());
			} else if (local11.startsWith(Static52.aClass41_62.method1007(Static616.anInt10077))) {
				local451 = 5;
				arg0 = arg0.substring(Static52.aClass41_62.method1007(Static616.anInt10077).length());
			}
		}
		@Pc(641) Class6_Sub26 local641 = Static268.method3981(Static377.aClass15_2, Static358.aClass289_86);
		local641.aClass6_Sub23_Sub1_2.method8366(0);
		@Pc(650) int local650 = local641.aClass6_Sub23_Sub1_2.anInt9901;
		local641.aClass6_Sub23_Sub1_2.method8366(local13);
		local641.aClass6_Sub23_Sub1_2.method8366(local451);
		Static174.method2472(local641.aClass6_Sub23_Sub1_2, arg0);
		local641.aClass6_Sub23_Sub1_2.method8346(local641.aClass6_Sub23_Sub1_2.anInt9901 - local650);
		Static670.method9077(local641);
	}

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(IZ)V")
	private static void method4230(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class321 local137;
		@Pc(19) int local19;
		@Pc(56) int local56;
		@Pc(25) int local25;
		@Pc(35) Class321 local35;
		@Pc(158) Class321 local158;
		@Pc(210) Class321 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt4955 -= 3;
				local13 = anIntArray286[anInt4955];
				local19 = anIntArray286[anInt4955 + 1];
				local25 = anIntArray286[anInt4955 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static286.method4134(local13);
				if (local35.aClass321Array1 == null) {
					local35.aClass321Array1 = new Class321[local25 + 1];
				}
				if (local35.aClass321Array1.length <= local25) {
					@Pc(54) Class321[] local54 = new Class321[local25 + 1];
					for (local56 = 0; local56 < local35.aClass321Array1.length; local56++) {
						local54[local56] = local35.aClass321Array1[local56];
					}
					local35.aClass321Array1 = local54;
				}
				if (local25 > 0 && local35.aClass321Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class321 local99 = new Class321();
				local99.anInt9105 = local19;
				local99.anInt9033 = local99.anInt9040 = local35.anInt9040;
				local99.anInt9061 = local25;
				local35.aClass321Array1[local25] = local99;
				if (arg1) {
					aClass321_23 = local99;
				} else {
					aClass321_22 = local99;
				}
				Static293.method4206(local35);
				return;
			}
			if (arg0 == 151) {
				local137 = arg1 ? aClass321_23 : aClass321_22;
				if (local137.anInt9061 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static286.method4134(local137.anInt9040);
				local158.aClass321Array1[local137.anInt9061] = null;
				Static293.method4206(local158);
				return;
			}
			if (arg0 == 152) {
				local137 = Static286.method4134(anIntArray286[--anInt4955]);
				local137.aClass321Array1 = null;
				Static293.method4206(local137);
				return;
			}
			if (arg0 == 200) {
				anInt4955 -= 2;
				local13 = anIntArray286[anInt4955];
				local19 = anIntArray286[anInt4955 + 1];
				local210 = Static640.method8748(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray286[anInt4955++] = 1;
					if (arg1) {
						aClass321_23 = local210;
						return;
					}
					aClass321_22 = local210;
					return;
				}
				anIntArray286[anInt4955++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray286[--anInt4955];
				local158 = Static286.method4134(local13);
				if (local158 != null) {
					anIntArray286[anInt4955++] = 1;
					if (arg1) {
						aClass321_23 = local158;
						return;
					}
					aClass321_22 = local158;
					return;
				}
				anIntArray286[anInt4955++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray286[--anInt4955];
				method4232(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray286[--anInt4955];
				method4220(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt4955 -= 2;
					local13 = anIntArray286[anInt4955];
					local19 = anIntArray286[anInt4955 + 1];
					if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static606.anIntArray656.length; local25++) {
						if (Static606.anIntArray656[local25] == local13) {
							Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1.method6488(local19, local25, Static416.aClass107_1);
							return;
						}
					}
					for (local357 = 0; local357 < Static612.anIntArray659.length; local357++) {
						if (Static612.anIntArray659[local357] == local13) {
							Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1.method6488(local19, local357, Static416.aClass107_1);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt4955 -= 2;
					local13 = anIntArray286[anInt4955];
					local19 = anIntArray286[anInt4955 + 1];
					if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1 == null) {
						return;
					}
					Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1.method6487(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray286[--anInt4955] != 0;
					if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1 == null) {
						return;
					}
					Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1.method6483(local420);
					return;
				}
				if (arg0 == 411) {
					anInt4955 -= 2;
					local13 = anIntArray286[anInt4955];
					local19 = anIntArray286[anInt4955 + 1];
					if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1 == null) {
						return;
					}
					Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1.method6481(local19, Static340.aClass121_1, local13);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static286.method4134(anIntArray286[--anInt4955]);
				} else {
					local137 = arg1 ? aClass321_23 : aClass321_22;
				}
				if (arg0 == 1000) {
					anInt4955 -= 4;
					local137.anInt9029 = anIntArray286[anInt4955];
					local137.anInt9065 = anIntArray286[anInt4955 + 1];
					local19 = anIntArray286[anInt4955 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray286[anInt4955 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte132 = (byte) local19;
					local137.aByte133 = (byte) local25;
					Static293.method4206(local137);
					Static134.method2031(local137);
					if (local137.anInt9061 == -1) {
						Static329.method5410(local137.anInt9040);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt4955 -= 4;
					local137.anInt9086 = anIntArray286[anInt4955];
					local137.anInt9054 = anIntArray286[anInt4955 + 1];
					local137.anInt9074 = 0;
					local137.anInt9107 = 0;
					local19 = anIntArray286[anInt4955 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray286[anInt4955 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte131 = (byte) local19;
					local137.aByte134 = (byte) local25;
					Static293.method4206(local137);
					Static134.method2031(local137);
					if (local137.anInt9105 == 0) {
						Static351.method5107(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray286[--anInt4955] == 1;
					if (local137.aBoolean656 != local661) {
						local137.aBoolean656 = local661;
						Static293.method4206(local137);
					}
					if (local137.anInt9061 == -1) {
						Static25.method2634(local137.anInt9040);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt4955 -= 2;
					local137.anInt9052 = anIntArray286[anInt4955];
					local137.anInt9021 = anIntArray286[anInt4955 + 1];
					Static293.method4206(local137);
					Static134.method2031(local137);
					if (local137.anInt9105 == 0) {
						Static351.method5107(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean652 = anIntArray286[--anInt4955] == 1;
					return;
				}
			} else {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static286.method4134(anIntArray286[--anInt4955]);
					} else {
						local137 = arg1 ? aClass321_23 : aClass321_22;
					}
					if (arg0 == 1100) {
						anInt4955 -= 2;
						local137.anInt9102 = anIntArray286[anInt4955];
						if (local137.anInt9102 > local137.anInt9075 - local137.anInt9103) {
							local137.anInt9102 = local137.anInt9075 - local137.anInt9103;
						}
						if (local137.anInt9102 < 0) {
							local137.anInt9102 = 0;
						}
						local137.anInt9067 = anIntArray286[anInt4955 + 1];
						if (local137.anInt9067 > local137.anInt9024 - local137.anInt9077) {
							local137.anInt9067 = local137.anInt9024 - local137.anInt9077;
						}
						if (local137.anInt9067 < 0) {
							local137.anInt9067 = 0;
						}
						Static293.method4206(local137);
						if (local137.anInt9061 == -1) {
							Static510.method7252(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt9094 = anIntArray286[--anInt4955];
						Static293.method4206(local137);
						if (local137.anInt9061 == -1) {
							Static615.method8503(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean654 = anIntArray286[--anInt4955] == 1;
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt9028 = anIntArray286[--anInt4955];
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt9091 = anIntArray286[--anInt4955];
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray286[--anInt4955];
						if (local137.anInt9017 != local19) {
							local137.anInt9017 = local19;
							Static293.method4206(local137);
						}
						if (local137.anInt9061 == -1) {
							Static430.method8457(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt9047 = anIntArray286[--anInt4955];
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean653 = anIntArray286[--anInt4955] == 1;
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt9058 = 1;
						local137.anInt9014 = anIntArray286[--anInt4955];
						Static293.method4206(local137);
						if (local137.anInt9061 == -1) {
							Static111.method5802(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt4955 -= 6;
						local137.anInt9022 = anIntArray286[anInt4955];
						local137.anInt9062 = anIntArray286[anInt4955 + 1];
						local137.anInt9053 = anIntArray286[anInt4955 + 2];
						local137.anInt9042 = anIntArray286[anInt4955 + 3];
						local137.anInt9087 = anIntArray286[anInt4955 + 4];
						local137.anInt9088 = anIntArray286[anInt4955 + 5];
						Static293.method4206(local137);
						if (local137.anInt9061 == -1) {
							Static555.method7834(local137.anInt9040);
							Static223.method3249(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray286[--anInt4955];
						if (local137.anInt9018 != local19) {
							local137.anInt9018 = local19;
							local137.anInt9012 = 0;
							local137.anInt9099 = 1;
							local137.anInt9010 = 0;
							@Pc(1110) Class119 local1110 = local137.anInt9018 == -1 ? null : Static334.aClass268_2.method6469(local137.anInt9018);
							if (local1110 != null) {
								Static245.method3612(local137.anInt9012, local1110);
							}
							Static293.method4206(local137);
						}
						if (local137.anInt9061 == -1) {
							Static164.method9056(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean658 = anIntArray286[--anInt4955] == 1;
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray35[--anInt4952];
						if (!local1161.equals(local137.aString126)) {
							local137.aString126 = local1161;
							Static293.method4206(local137);
						}
						if (local137.anInt9061 == -1) {
							Static678.method9179(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt9059 = anIntArray286[--anInt4955];
						Static293.method4206(local137);
						if (local137.anInt9061 == -1) {
							Static466.method6900(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt4955 -= 3;
						local137.anInt9031 = anIntArray286[anInt4955];
						local137.anInt9073 = anIntArray286[anInt4955 + 1];
						local137.anInt9049 = anIntArray286[anInt4955 + 2];
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean663 = anIntArray286[--anInt4955] == 1;
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt9100 = anIntArray286[--anInt4955];
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt9069 = anIntArray286[--anInt4955];
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean662 = anIntArray286[--anInt4955] == 1;
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean661 = anIntArray286[--anInt4955] == 1;
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt4955 -= 2;
						local137.anInt9075 = anIntArray286[anInt4955];
						local137.anInt9024 = anIntArray286[anInt4955 + 1];
						Static293.method4206(local137);
						if (local137.anInt9105 == 0) {
							Static351.method5107(local137, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean650 = anIntArray286[--anInt4955] == 1;
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt9088 = anIntArray286[--anInt4955];
						Static293.method4206(local137);
						if (local137.anInt9061 == -1) {
							Static555.method7834(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray286[--anInt4955];
						local137.aBoolean649 = local19 == 1;
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt4955 -= 2;
						local137.anInt9076 = anIntArray286[anInt4955];
						local137.anInt9104 = anIntArray286[anInt4955 + 1];
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt9041 = anIntArray286[--anInt4955];
						Static293.method4206(local137);
						return;
					}
					@Pc(1489) Class325 local1489;
					if (arg0 == 1127) {
						anInt4955 -= 2;
						local19 = anIntArray286[anInt4955];
						local25 = anIntArray286[anInt4955 + 1];
						local1489 = Static280.aClass349_2.method8157(local19);
						if (local25 != local1489.anInt9243) {
							local137.method7669(local19, local25);
							return;
						}
						local137.method7678(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray286[--anInt4955];
						local1523 = aStringArray35[--anInt4952];
						local1489 = Static280.aClass349_2.method8157(local19);
						if (!local1489.aString129.equals(local1523)) {
							local137.method7677(local1523, local19);
							return;
						}
						local137.method7678(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray286[--anInt4955];
						if ((local137.anInt9105 == 5 || arg0 != 1129) && (local137.anInt9105 == 4 || arg0 != 1130)) {
							if (local137.anInt9045 != local19) {
								local137.anInt9045 = local19;
								Static293.method4206(local137);
							}
							if (local137.anInt9061 == -1) {
								Static352.method5116(local137.anInt9040);
							}
							return;
						}
						return;
					}
					@Pc(1610) short local1610;
					@Pc(1617) short local1617;
					if (arg0 == 1131) {
						anInt4955 -= 3;
						local19 = anIntArray286[anInt4955];
						local1610 = (short) anIntArray286[anInt4955 + 1];
						local1617 = (short) anIntArray286[anInt4955 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method7686(local19, local1617, local1610);
							Static293.method4206(local137);
							if (local137.anInt9061 == -1) {
								Static665.method9021(local19, local137.anInt9040);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt4955 -= 3;
						local19 = anIntArray286[anInt4955];
						local1610 = (short) anIntArray286[anInt4955 + 1];
						local1617 = (short) anIntArray286[anInt4955 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method7673(local1617, local19, local1610);
							Static293.method4206(local137);
							if (local137.anInt9061 == -1) {
								Static394.method5589(local19, local137.anInt9040);
							}
							return;
						}
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2473) int local2473;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static286.method4134(anIntArray286[--anInt4955]);
							} else {
								local137 = arg1 ? aClass321_23 : aClass321_22;
							}
							if (arg0 == 1499) {
								local137.method7690();
								return;
							}
							local1161 = aStringArray35[--anInt4952];
							@Pc(2559) int[] local2559 = null;
							if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
								local357 = anIntArray286[--anInt4955];
								if (local357 > 0) {
									local2559 = new int[local357];
									while (local357-- > 0) {
										local2559[local357] = anIntArray286[--anInt4955];
									}
								}
								local1161 = local1161.substring(0, local1161.length() - 1);
							}
							@Pc(2611) Object[] local2611 = new Object[local1161.length() + 1];
							for (local2473 = local2611.length - 1; local2473 >= 1; local2473--) {
								if (local1161.charAt(local2473 - 1) == 's') {
									local2611[local2473] = aStringArray35[--anInt4952];
								} else if (local1161.charAt(local2473 - 1) == '§') {
									local2611[local2473] = Long.valueOf(aLongArray17[--anInt4953]);
								} else {
									local2611[local2473] = Integer.valueOf(anIntArray286[--anInt4955]);
								}
							}
							local56 = anIntArray286[--anInt4955];
							if (local56 == -1) {
								local2611 = null;
							} else {
								local2611[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray26 = local2611;
							} else if (arg0 == 1401) {
								local137.anObjectArray15 = local2611;
							} else if (arg0 == 1402) {
								local137.anObjectArray19 = local2611;
							} else if (arg0 == 1403) {
								local137.anObjectArray14 = local2611;
							} else if (arg0 == 1404) {
								local137.anObjectArray30 = local2611;
							} else if (arg0 == 1405) {
								local137.anObjectArray28 = local2611;
							} else if (arg0 == 1406) {
								local137.anObjectArray2 = local2611;
							} else if (arg0 == 1407) {
								local137.anObjectArray23 = local2611;
								local137.anIntArray610 = local2559;
							} else if (arg0 == 1408) {
								local137.anObjectArray21 = local2611;
							} else if (arg0 == 1409) {
								local137.anObjectArray22 = local2611;
							} else if (arg0 == 1410) {
								local137.anObjectArray27 = local2611;
							} else if (arg0 == 1411) {
								local137.anObjectArray5 = local2611;
							} else if (arg0 == 1412) {
								local137.anObjectArray7 = local2611;
							} else if (arg0 == 1414) {
								local137.anObjectArray9 = local2611;
								local137.anIntArray609 = local2559;
							} else if (arg0 == 1415) {
								local137.anObjectArray3 = local2611;
								local137.anIntArray611 = local2559;
							} else if (arg0 == 1416) {
								local137.anObjectArray34 = local2611;
							} else if (arg0 == 1417) {
								local137.anObjectArray10 = local2611;
							} else if (arg0 == 1418) {
								local137.anObjectArray33 = local2611;
							} else if (arg0 == 1419) {
								local137.anObjectArray32 = local2611;
							} else if (arg0 == 1420) {
								local137.anObjectArray11 = local2611;
							} else if (arg0 == 1421) {
								local137.anObjectArray6 = local2611;
							} else if (arg0 == 1422) {
								local137.anObjectArray31 = local2611;
							} else if (arg0 == 1423) {
								local137.anObjectArray17 = local2611;
							} else if (arg0 == 1424) {
								local137.anObjectArray24 = local2611;
							} else if (arg0 == 1425) {
								local137.anObjectArray16 = local2611;
							} else if (arg0 == 1426) {
								local137.anObjectArray20 = local2611;
							} else if (arg0 == 1427) {
								local137.anObjectArray25 = local2611;
							} else if (arg0 == 1428) {
								local137.anObjectArray8 = local2611;
								local137.anIntArray607 = local2559;
							} else if (arg0 == 1429) {
								local137.anObjectArray4 = local2611;
								local137.anIntArray613 = local2559;
							} else if (arg0 == 1430) {
								local137.anObjectArray13 = local2611;
							} else if (arg0 == 1431) {
								local137.anObjectArray18 = local2611;
							} else if (arg0 == 1432) {
								local137.anObjectArray29 = local2611;
							}
							local137.aBoolean655 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass321_23 : aClass321_22;
							if (arg0 == 1500) {
								anIntArray286[anInt4955++] = local137.anInt9016;
								return;
							}
							if (arg0 == 1501) {
								anIntArray286[anInt4955++] = local137.anInt9072;
								return;
							}
							if (arg0 == 1502) {
								anIntArray286[anInt4955++] = local137.anInt9103;
								return;
							}
							if (arg0 == 1503) {
								anIntArray286[anInt4955++] = local137.anInt9077;
								return;
							}
							if (arg0 == 1504) {
								anIntArray286[anInt4955++] = local137.aBoolean656 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray286[anInt4955++] = local137.anInt9033;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static97.method1587(local137);
								anIntArray286[anInt4955++] = local158 == null ? -1 : local158.anInt9040;
								return;
							}
						} else {
							@Pc(3242) Class325 local3242;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass321_23 : aClass321_22;
								if (arg0 == 1600) {
									anIntArray286[anInt4955++] = local137.anInt9102;
									return;
								}
								if (arg0 == 1601) {
									anIntArray286[anInt4955++] = local137.anInt9067;
									return;
								}
								if (arg0 == 1602) {
									aStringArray35[anInt4952++] = local137.aString126;
									return;
								}
								if (arg0 == 1603) {
									anIntArray286[anInt4955++] = local137.anInt9075;
									return;
								}
								if (arg0 == 1604) {
									anIntArray286[anInt4955++] = local137.anInt9024;
									return;
								}
								if (arg0 == 1605) {
									anIntArray286[anInt4955++] = local137.anInt9088;
									return;
								}
								if (arg0 == 1606) {
									anIntArray286[anInt4955++] = local137.anInt9053;
									return;
								}
								if (arg0 == 1607) {
									anIntArray286[anInt4955++] = local137.anInt9087;
									return;
								}
								if (arg0 == 1608) {
									anIntArray286[anInt4955++] = local137.anInt9042;
									return;
								}
								if (arg0 == 1609) {
									anIntArray286[anInt4955++] = local137.anInt9028;
									return;
								}
								if (arg0 == 1610) {
									anIntArray286[anInt4955++] = local137.anInt9022;
									return;
								}
								if (arg0 == 1611) {
									anIntArray286[anInt4955++] = local137.anInt9062;
									return;
								}
								if (arg0 == 1612) {
									anIntArray286[anInt4955++] = local137.anInt9017;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray286[--anInt4955];
									local3242 = Static280.aClass349_2.method8157(local19);
									if (local3242.method7797()) {
										aStringArray35[anInt4952++] = local137.method7668(local19, local3242.aString129);
										return;
									}
									anIntArray286[anInt4955++] = local137.method7687(local3242.anInt9243, local19);
									return;
								}
								if (arg0 == 1614) {
									anIntArray286[anInt4955++] = local137.anInt9047;
									return;
								}
								if (arg0 == 2614) {
									anIntArray286[anInt4955++] = local137.anInt9058 == 1 ? local137.anInt9014 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass321_23 : aClass321_22;
								if (arg0 == 1700) {
									anIntArray286[anInt4955++] = local137.anInt9048;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt9048 != -1) {
										anIntArray286[anInt4955++] = local137.anInt9032;
										return;
									}
									anIntArray286[anInt4955++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray286[anInt4955++] = local137.anInt9061;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass321_23 : aClass321_22;
								if (arg0 == 1800) {
									anIntArray286[anInt4955++] = Static83.method1453(local137).method5790();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray286[--anInt4955];
									local19--;
									if (local137.aStringArray55 != null && local19 < local137.aStringArray55.length && local137.aStringArray55[local19] != null) {
										aStringArray35[anInt4952++] = local137.aStringArray55[local19];
										return;
									}
									aStringArray35[anInt4952++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString123 == null) {
										aStringArray35[anInt4952++] = "";
										return;
									}
									aStringArray35[anInt4952++] = local137.aString123;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static286.method4134(anIntArray286[--anInt4955]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass321_23 : aClass321_22;
								}
								if (anInt4965 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray25 == null) {
										return;
									}
									@Pc(3511) Class6_Sub49 local3511 = new Class6_Sub49();
									local3511.aClass321_44 = local137;
									local3511.anObjectArray35 = local137.anObjectArray25;
									local3511.anInt9238 = anInt4965 + 1;
									Static296.aClass362_22.method8536(local3511);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static286.method4134(anIntArray286[--anInt4955]);
								if (arg0 == 2500) {
									anIntArray286[anInt4955++] = local137.anInt9016;
									return;
								}
								if (arg0 == 2501) {
									anIntArray286[anInt4955++] = local137.anInt9072;
									return;
								}
								if (arg0 == 2502) {
									anIntArray286[anInt4955++] = local137.anInt9103;
									return;
								}
								if (arg0 == 2503) {
									anIntArray286[anInt4955++] = local137.anInt9077;
									return;
								}
								if (arg0 == 2504) {
									anIntArray286[anInt4955++] = local137.aBoolean656 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray286[anInt4955++] = local137.anInt9033;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static97.method1587(local137);
									anIntArray286[anInt4955++] = local158 == null ? -1 : local158.anInt9040;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static286.method4134(anIntArray286[--anInt4955]);
								if (arg0 == 2600) {
									anIntArray286[anInt4955++] = local137.anInt9102;
									return;
								}
								if (arg0 == 2601) {
									anIntArray286[anInt4955++] = local137.anInt9067;
									return;
								}
								if (arg0 == 2602) {
									aStringArray35[anInt4952++] = local137.aString126;
									return;
								}
								if (arg0 == 2603) {
									anIntArray286[anInt4955++] = local137.anInt9075;
									return;
								}
								if (arg0 == 2604) {
									anIntArray286[anInt4955++] = local137.anInt9024;
									return;
								}
								if (arg0 == 2605) {
									anIntArray286[anInt4955++] = local137.anInt9088;
									return;
								}
								if (arg0 == 2606) {
									anIntArray286[anInt4955++] = local137.anInt9053;
									return;
								}
								if (arg0 == 2607) {
									anIntArray286[anInt4955++] = local137.anInt9087;
									return;
								}
								if (arg0 == 2608) {
									anIntArray286[anInt4955++] = local137.anInt9042;
									return;
								}
								if (arg0 == 2609) {
									anIntArray286[anInt4955++] = local137.anInt9028;
									return;
								}
								if (arg0 == 2610) {
									anIntArray286[anInt4955++] = local137.anInt9022;
									return;
								}
								if (arg0 == 2611) {
									anIntArray286[anInt4955++] = local137.anInt9062;
									return;
								}
								if (arg0 == 2612) {
									anIntArray286[anInt4955++] = local137.anInt9017;
									return;
								}
								if (arg0 == 2613) {
									anIntArray286[anInt4955++] = local137.anInt9047;
									return;
								}
								if (arg0 == 2614) {
									anIntArray286[anInt4955++] = local137.anInt9058 == 1 ? local137.anInt9014 : -1;
									return;
								}
							} else {
								@Pc(4040) Class6_Sub51 local4040;
								@Pc(3938) Class6_Sub51 local3938;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static286.method4134(anIntArray286[--anInt4955]);
										anIntArray286[anInt4955++] = local137.anInt9048;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static286.method4134(anIntArray286[--anInt4955]);
										if (local137.anInt9048 != -1) {
											anIntArray286[anInt4955++] = local137.anInt9032;
											return;
										}
										anIntArray286[anInt4955++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray286[--anInt4955];
										local3938 = (Class6_Sub51) Static262.aClass209_35.method5038((long) local13);
										if (local3938 != null) {
											anIntArray286[anInt4955++] = 1;
											return;
										}
										anIntArray286[anInt4955++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static286.method4134(anIntArray286[--anInt4955]);
										if (local137.aClass321Array1 == null) {
											anIntArray286[anInt4955++] = 0;
											return;
										}
										local19 = local137.aClass321Array1.length;
										for (local25 = 0; local25 < local137.aClass321Array1.length; local25++) {
											if (local137.aClass321Array1[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray286[anInt4955++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt4955 -= 2;
										local13 = anIntArray286[anInt4955];
										local19 = anIntArray286[anInt4955 + 1];
										local4040 = (Class6_Sub51) Static262.aClass209_35.method5038((long) local13);
										if (local4040 != null && local4040.anInt9360 == local19) {
											anIntArray286[anInt4955++] = 1;
											return;
										}
										anIntArray286[anInt4955++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static286.method4134(anIntArray286[--anInt4955]);
									if (arg0 == 2800) {
										anIntArray286[anInt4955++] = Static83.method1453(local137).method5790();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray286[--anInt4955];
										local19--;
										if (local137.aStringArray55 != null && local19 < local137.aStringArray55.length && local137.aStringArray55[local19] != null) {
											aStringArray35[anInt4952++] = local137.aStringArray55[local19];
											return;
										}
										aStringArray35[anInt4952++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString123 == null) {
											aStringArray35[anInt4952++] = "";
											return;
										}
										aStringArray35[anInt4952++] = local137.aString123;
										return;
									}
								} else {
									@Pc(4266) Class6_Sub26 local4266;
									@Pc(4177) String local4177;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4177 = aStringArray35[--anInt4952];
											Static302.method4363(local4177);
											return;
										}
										if (arg0 == 3101) {
											anInt4955 -= 2;
											Static436.method6429(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2, anIntArray286[anInt4955], anIntArray286[anInt4955 + 1]);
											return;
										}
										if (arg0 == 3103) {
											Static173.method2469();
											return;
										}
										if (arg0 == 3104) {
											local4177 = aStringArray35[--anInt4952];
											local19 = 0;
											if (Static267.method3977(local4177)) {
												local19 = Static368.method5312(local4177);
											}
											@Pc(4237) Class6_Sub26 local4237 = Static268.method3981(Static377.aClass15_2, Static448.aClass289_109);
											local4237.aClass6_Sub23_Sub1_2.method8364(local19);
											Static670.method9077(local4237);
											return;
										}
										if (arg0 == 3105) {
											local4177 = aStringArray35[--anInt4952];
											local4266 = Static268.method3981(Static377.aClass15_2, Static137.aClass289_45);
											local4266.aClass6_Sub23_Sub1_2.method8366(local4177.length() + 1);
											local4266.aClass6_Sub23_Sub1_2.method8398(local4177);
											Static670.method9077(local4266);
											return;
										}
										if (arg0 == 3106) {
											local4177 = aStringArray35[--anInt4952];
											local4266 = Static268.method3981(Static377.aClass15_2, Static112.aClass289_35);
											local4266.aClass6_Sub23_Sub1_2.method8366(local4177.length() + 1);
											local4266.aClass6_Sub23_Sub1_2.method8398(local4177);
											Static670.method9077(local4266);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray286[--anInt4955];
											local1161 = aStringArray35[--anInt4952];
											Static421.method6267(local1161, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt4955 -= 3;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											local25 = anIntArray286[anInt4955 + 2];
											local35 = Static286.method4134(local25);
											Static202.method3045(local35, local19, local13);
											return;
										}
										if (arg0 == 3109) {
											anInt4955 -= 2;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											local210 = arg1 ? aClass321_23 : aClass321_22;
											Static202.method3045(local210, local19, local13);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray286[--anInt4955];
											local4266 = Static268.method3981(Static377.aClass15_2, Static104.aClass289_33);
											local4266.aClass6_Sub23_Sub1_2.method8347(local13);
											Static670.method9077(local4266);
											return;
										}
										if (arg0 == 3111) {
											anInt4955 -= 2;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											local4040 = (Class6_Sub51) Static262.aClass209_35.method5038((long) local13);
											if (local4040 != null) {
												Static199.method2913(local4040.anInt9360 != local19, true, local4040);
											}
											Static418.method6245(true, local19, local13, 3);
											return;
										}
										if (arg0 == 3112) {
											anInt4955--;
											local13 = anIntArray286[anInt4955];
											local3938 = (Class6_Sub51) Static262.aClass209_35.method5038((long) local13);
											if (local3938 != null && local3938.anInt9358 == 3) {
												Static199.method2913(true, true, local3938);
											}
											return;
										}
										if (arg0 == 3113) {
											Static587.method8141(aStringArray35[--anInt4952]);
											return;
										}
										if (arg0 == 3114) {
											anInt4955 -= 2;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											local1523 = aStringArray35[--anInt4952];
											Static55.method3549("", "", "", local13, local19, local1523);
											return;
										}
										if (arg0 == 3115) {
											anInt4955 -= 11;
											@Pc(4567) Class7[] local4567 = Static262.method5239();
											@Pc(4570) Class249[] local4570 = Static119.method1848();
											Static550.method7818(anIntArray286[anInt4955 + 2], anIntArray286[anInt4955 + 6], anIntArray286[anInt4955 + 3], anIntArray286[anInt4955 + 9], anIntArray286[anInt4955 + 7], anIntArray286[anInt4955 + 4], local4570[anIntArray286[anInt4955 + 1]], anIntArray286[anInt4955 + 5], local4567[anIntArray286[anInt4955]], anIntArray286[anInt4955 + 8], anIntArray286[anInt4955 + 10]);
											return;
										}
										if (arg0 == 3116) {
											local13 = anIntArray286[--anInt4955];
											local4266 = Static268.method3981(Static377.aClass15_2, Static279.aClass289_69);
											local4266.aClass6_Sub23_Sub1_2.method8347(local13);
											Static670.method9077(local4266);
											return;
										}
										if (arg0 == 3117) {
											local4177 = aStringArray35[--anInt4952];
											local4266 = Static268.method3981(Static377.aClass15_2, Static394.aClass289_96);
											local4266.aClass6_Sub23_Sub1_2.method8366(local4177.length() + 1);
											local4266.aClass6_Sub23_Sub1_2.method8398(local4177);
											Static670.method9077(local4266);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt4955 -= 3;
											Static424.method6293(anIntArray286[anInt4955], anIntArray286[anInt4955 + 1], 256, anIntArray286[anInt4955 + 2], 255);
											return;
										}
										if (arg0 == 3201) {
											Static426.method6547(anIntArray286[--anInt4955], 255, 50);
											return;
										}
										if (arg0 == 3202) {
											anInt4955 -= 2;
											Static228.method3314(255, anIntArray286[anInt4955], anIntArray286[anInt4955 + 1]);
											return;
										}
										if (arg0 == 3203) {
											anInt4955 -= 4;
											Static424.method6293(anIntArray286[anInt4955], anIntArray286[anInt4955 + 1], 256, anIntArray286[anInt4955 + 2], anIntArray286[anInt4955 + 3]);
											return;
										}
										if (arg0 == 3204) {
											anInt4955 -= 3;
											Static426.method6547(anIntArray286[anInt4955], anIntArray286[anInt4955 + 1], anIntArray286[anInt4955 + 2]);
											return;
										}
										if (arg0 == 3205) {
											anInt4955 -= 3;
											Static228.method3314(anIntArray286[anInt4955 + 2], anIntArray286[anInt4955], anIntArray286[anInt4955 + 1]);
											return;
										}
										if (arg0 == 3206) {
											anInt4955 -= 4;
											Static351.method5110(anIntArray286[anInt4955 + 1], anIntArray286[anInt4955 + 3], false, anIntArray286[anInt4955 + 2], anIntArray286[anInt4955], 256);
											return;
										}
										if (arg0 == 3207) {
											anInt4955 -= 4;
											Static351.method5110(anIntArray286[anInt4955 + 1], anIntArray286[anInt4955 + 3], true, anIntArray286[anInt4955 + 2], anIntArray286[anInt4955], 256);
											return;
										}
										if (arg0 == 3208) {
											anInt4955 -= 5;
											Static424.method6293(anIntArray286[anInt4955], anIntArray286[anInt4955 + 1], anIntArray286[anInt4955 + 4], anIntArray286[anInt4955 + 2], anIntArray286[anInt4955 + 3]);
											return;
										}
										if (arg0 == 3209) {
											anInt4955 -= 5;
											Static351.method5110(anIntArray286[anInt4955 + 1], anIntArray286[anInt4955 + 3], false, anIntArray286[anInt4955 + 2], anIntArray286[anInt4955], anIntArray286[anInt4955 + 4]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray286[anInt4955++] = Static90.anInt1698;
											return;
										}
										if (arg0 == 3301) {
											anInt4955 -= 2;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											anIntArray286[anInt4955++] = Static156.method2212(local19, local13, false);
											return;
										}
										if (arg0 == 3302) {
											anInt4955 -= 2;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											anIntArray286[anInt4955++] = Static642.method8767(local19, false, local13);
											return;
										}
										if (arg0 == 3303) {
											anInt4955 -= 2;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											anIntArray286[anInt4955++] = Static192.method2712(local19, false, local13);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = Static646.aClass388_1.method9031(local13).anInt3128;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = Static439.anIntArray496[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = Static147.anIntArray146[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = Static242.anIntArray253[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(5157) byte local5157 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140;
											local19 = (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006 >> 9) + Static534.anInt8753;
											local25 = (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001 >> 9) + Static234.anInt4239;
											anIntArray286[anInt4955++] = (local5157 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray286[anInt4955++] = Static618.aBoolean707 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt4955 -= 2;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											anIntArray286[anInt4955++] = Static156.method2212(local19, local13, true);
											return;
										}
										if (arg0 == 3314) {
											anInt4955 -= 2;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											anIntArray286[anInt4955++] = Static642.method8767(local19, true, local13);
											return;
										}
										if (arg0 == 3315) {
											anInt4955 -= 2;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											anIntArray286[anInt4955++] = Static192.method2712(local19, true, local13);
											return;
										}
										if (arg0 == 3316) {
											if (Static26.anInt609 >= 2) {
												anIntArray286[anInt4955++] = Static26.anInt609;
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray286[anInt4955++] = Static551.anInt8501;
											return;
										}
										if (arg0 == 3318) {
											anIntArray286[anInt4955++] = Static406.aClass354_3.anInt9837;
											return;
										}
										if (arg0 == 3321) {
											anIntArray286[anInt4955++] = Static233.anInt4181;
											return;
										}
										if (arg0 == 3322) {
											anIntArray286[anInt4955++] = Static14.anInt432;
											return;
										}
										if (arg0 == 3323) {
											if (Static556.anInt9320 >= 5 && Static556.anInt9320 <= 9) {
												anIntArray286[anInt4955++] = 1;
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static556.anInt9320 >= 5 && Static556.anInt9320 <= 9) {
												anIntArray286[anInt4955++] = Static556.anInt9320;
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray286[anInt4955++] = Static272.aBoolean295 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray286[anInt4955++] = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4182;
											return;
										}
										if (arg0 == 3327) {
											anIntArray286[anInt4955++] = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1 != null && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1.aBoolean501 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray286[anInt4955++] = Static525.aBoolean615 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = Static254.method3662(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt4955 -= 2;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											anIntArray286[anInt4955++] = Static462.method6857(local13, false, local19);
											return;
										}
										if (arg0 == 3332) {
											anInt4955 -= 2;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											anIntArray286[anInt4955++] = Static462.method6857(local13, true, local19);
											return;
										}
										if (arg0 == 3333) {
											anIntArray286[anInt4955++] = Static595.anInt9707;
											return;
										}
										if (arg0 == 3335) {
											anIntArray286[anInt4955++] = Static616.anInt10077;
											return;
										}
										if (arg0 == 3336) {
											anInt4955 -= 4;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											local25 = anIntArray286[anInt4955 + 2];
											local357 = anIntArray286[anInt4955 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local357;
											anIntArray286[anInt4955++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray286[anInt4955++] = Static506.anInt8485;
											return;
										}
										if (arg0 == 3338) {
											anIntArray286[anInt4955++] = Static256.method3695();
											return;
										}
										if (arg0 == 3339) {
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray286[anInt4955++] = Static247.aBoolean271 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray286[anInt4955++] = Static645.aBoolean726 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray286[anInt4955++] = Static193.aClass128_1.method5191();
											return;
										}
										if (arg0 == 3343) {
											anIntArray286[anInt4955++] = Static193.aClass128_1.method5188();
											return;
										}
										if (arg0 == 3344) {
											aStringArray35[anInt4952++] = Static553.method7828();
											return;
										}
										if (arg0 == 3345) {
											aStringArray35[anInt4952++] = Static10.method401();
											return;
										}
										if (arg0 == 3346) {
											anIntArray286[anInt4955++] = Static14.method454();
											return;
										}
										if (arg0 == 3347) {
											anIntArray286[anInt4955++] = Static390.anInt6561;
											return;
										}
										if (arg0 == 3349) {
											anIntArray286[anInt4955++] = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.lb.method8507() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5908) Class255 local5908;
										if (arg0 == 3400) {
											anInt4955 -= 2;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											local5908 = Static28.aClass190_1.method4283(local13);
											aStringArray35[anInt4952++] = local5908.method6280(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt4955 -= 4;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											local25 = anIntArray286[anInt4955 + 2];
											local357 = anIntArray286[anInt4955 + 3];
											@Pc(5954) Class255 local5954 = Static28.aClass190_1.method4283(local25);
											if (local5954.aChar5 == local13 && local5954.aChar4 == local19) {
												if (local19 == 115) {
													aStringArray35[anInt4952++] = local5954.method6280(local357);
													return;
												}
												anIntArray286[anInt4955++] = local5954.method6287(local357);
												return;
											}
											throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
										}
										if (arg0 == 3409) {
											anInt4955 -= 3;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											local25 = anIntArray286[anInt4955 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(6040) Class255 local6040 = Static28.aClass190_1.method4283(local19);
											if (local6040.aChar4 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray286[anInt4955++] = local6040.method6282(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray286[--anInt4955];
											local1161 = aStringArray35[--anInt4952];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5908 = Static28.aClass190_1.method4283(local13);
											if (local5908.aChar4 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray286[anInt4955++] = local5908.method6285(local1161) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray286[--anInt4955];
											@Pc(6138) Class255 local6138 = Static28.aClass190_1.method4283(local13);
											anIntArray286[anInt4955++] = local6138.aClass209_43.method5033();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static511.anInt6141 == 0) {
												anIntArray286[anInt4955++] = -2;
												return;
											}
											if (Static511.anInt6141 == 1) {
												anIntArray286[anInt4955++] = -1;
												return;
											}
											anIntArray286[anInt4955++] = Static96.anInt1739;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray286[--anInt4955];
											if (Static511.anInt6141 == 2 && local13 < Static96.anInt1739) {
												aStringArray35[anInt4952++] = Static480.aStringArray50[local13];
												if (Static306.aStringArray38[local13] != null) {
													aStringArray35[anInt4952++] = Static306.aStringArray38[local13];
													return;
												}
												aStringArray35[anInt4952++] = "";
												return;
											}
											aStringArray35[anInt4952++] = "";
											aStringArray35[anInt4952++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray286[--anInt4955];
											if (Static511.anInt6141 == 2 && local13 < Static96.anInt1739) {
												anIntArray286[anInt4955++] = Static577.anIntArray643[local13];
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray286[--anInt4955];
											if (Static511.anInt6141 == 2 && local13 < Static96.anInt1739) {
												anIntArray286[anInt4955++] = Static188.anIntArray181[local13];
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4177 = aStringArray35[--anInt4952];
											local19 = anIntArray286[--anInt4955];
											Static194.method2753(local4177, local19);
											return;
										}
										if (arg0 == 3605) {
											local4177 = aStringArray35[--anInt4952];
											Static71.method1248(local4177);
											return;
										}
										if (arg0 == 3606) {
											local4177 = aStringArray35[--anInt4952];
											Static112.method1781(local4177);
											return;
										}
										if (arg0 == 3607) {
											local4177 = aStringArray35[--anInt4952];
											Static491.method8327(false, local4177);
											return;
										}
										if (arg0 == 3608) {
											local4177 = aStringArray35[--anInt4952];
											Static583.method8076(local4177);
											return;
										}
										if (arg0 == 3609) {
											local4177 = aStringArray35[--anInt4952];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray286[anInt4955++] = Static585.method8093(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray286[--anInt4955];
											if (Static511.anInt6141 == 2 && local13 < Static96.anInt1739) {
												aStringArray35[anInt4952++] = Static52.aStringArray10[local13];
												return;
											}
											aStringArray35[anInt4952++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static145.aString26 != null) {
												aStringArray35[anInt4952++] = Static532.method7397(Static145.aString26);
												return;
											}
											aStringArray35[anInt4952++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static145.aString26 != null) {
												anIntArray286[anInt4955++] = Static619.anInt10114;
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray286[--anInt4955];
											if (Static145.aString26 != null && local13 < Static619.anInt10114) {
												aStringArray35[anInt4952++] = Static365.aClass232Array1[local13].aString87;
												return;
											}
											aStringArray35[anInt4952++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray286[--anInt4955];
											if (Static145.aString26 != null && local13 < Static619.anInt10114) {
												anIntArray286[anInt4955++] = Static365.aClass232Array1[local13].anInt6343;
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray286[--anInt4955];
											if (Static145.aString26 != null && local13 < Static619.anInt10114) {
												anIntArray286[anInt4955++] = Static365.aClass232Array1[local13].aByte107;
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray286[anInt4955++] = Static648.aByte147;
											return;
										}
										if (arg0 == 3617) {
											local4177 = aStringArray35[--anInt4952];
											Static307.method4405(local4177);
											return;
										}
										if (arg0 == 3618) {
											anIntArray286[anInt4955++] = Static509.aByte124;
											return;
										}
										if (arg0 == 3619) {
											local4177 = aStringArray35[--anInt4952];
											Static202.method3044(local4177);
											return;
										}
										if (arg0 == 3620) {
											Static438.method2189();
											return;
										}
										if (arg0 == 3621) {
											if (Static511.anInt6141 == 0) {
												anIntArray286[anInt4955++] = -1;
												return;
											}
											anIntArray286[anInt4955++] = Static477.anInt8198;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray286[--anInt4955];
											if (Static511.anInt6141 != 0 && local13 < Static477.anInt8198) {
												aStringArray35[anInt4952++] = Static572.aStringArray58[local13];
												if (Static602.aStringArray63[local13] != null) {
													aStringArray35[anInt4952++] = Static602.aStringArray63[local13];
													return;
												}
												aStringArray35[anInt4952++] = "";
												return;
											}
											aStringArray35[anInt4952++] = "";
											aStringArray35[anInt4952++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4177 = aStringArray35[--anInt4952];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray286[anInt4955++] = Static225.method3276(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray286[--anInt4955];
											if (Static365.aClass232Array1 != null && local13 < Static619.anInt10114 && Static365.aClass232Array1[local13].aString86.equalsIgnoreCase(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aString45)) {
												anIntArray286[anInt4955++] = 1;
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static508.aString136 != null) {
												aStringArray35[anInt4952++] = Static508.aString136;
												return;
											}
											aStringArray35[anInt4952++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray286[--anInt4955];
											if (Static145.aString26 != null && local13 < Static619.anInt10114) {
												aStringArray35[anInt4952++] = Static365.aClass232Array1[local13].aString88;
												return;
											}
											aStringArray35[anInt4952++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray286[--anInt4955];
											if (Static511.anInt6141 == 2 && local13 >= 0 && local13 < Static96.anInt1739) {
												anIntArray286[anInt4955++] = Static2.aBooleanArray32[local13] ? 1 : 0;
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4177 = aStringArray35[--anInt4952];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray286[anInt4955++] = Static337.method2275(local4177);
											return;
										}
										if (arg0 == 3629) {
											anIntArray286[anInt4955++] = Static483.anInt8262;
											return;
										}
										if (arg0 == 3630) {
											local4177 = aStringArray35[--anInt4952];
											Static491.method8327(true, local4177);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = Static287.aBooleanArray17[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray286[--anInt4955];
											if (Static145.aString26 != null && local13 < Static619.anInt10114) {
												aStringArray35[anInt4952++] = Static365.aClass232Array1[local13].aString86;
												return;
											}
											aStringArray35[anInt4952++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray286[--anInt4955];
											if (Static511.anInt6141 != 0 && local13 < Static477.anInt8198) {
												aStringArray35[anInt4952++] = Static658.aStringArray65[local13];
												return;
											}
											aStringArray35[anInt4952++] = "";
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static150.aClass145_1 != null) {
												anIntArray286[anInt4955++] = 1;
												aClass145_3 = Static150.aClass145_1;
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static150.aClass145_2 != null) {
												anIntArray286[anInt4955++] = 1;
												aClass145_3 = Static150.aClass145_2;
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray35[anInt4952++] = aClass145_3.aString37;
											return;
										}
										if (arg0 == 3703) {
											anIntArray286[anInt4955++] = aClass145_3.aBoolean217 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray286[anInt4955++] = aClass145_3.aByte54;
											return;
										}
										if (arg0 == 3705) {
											anIntArray286[anInt4955++] = aClass145_3.aByte55;
											return;
										}
										if (arg0 == 3706) {
											anIntArray286[anInt4955++] = aClass145_3.aByte53;
											return;
										}
										if (arg0 == 3707) {
											anIntArray286[anInt4955++] = aClass145_3.aByte52;
											return;
										}
										if (arg0 == 3709) {
											anIntArray286[anInt4955++] = aClass145_3.anInt3689;
											return;
										}
										if (arg0 == 3710) {
											local13 = anIntArray286[--anInt4955];
											aStringArray35[anInt4952++] = aClass145_3.aStringArray23[local13];
											return;
										}
										if (arg0 == 3711) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = aClass145_3.aByteArray46[local13];
											return;
										}
										if (arg0 == 3712) {
											anIntArray286[anInt4955++] = aClass145_3.anInt3676;
											return;
										}
										if (arg0 == 3713) {
											local13 = anIntArray286[--anInt4955];
											aStringArray35[anInt4952++] = aClass145_3.aStringArray24[local13];
											return;
										}
										if (arg0 == 3714) {
											anInt4955 -= 3;
											local13 = anIntArray286[anInt4955];
											local19 = anIntArray286[anInt4955 + 1];
											local25 = anIntArray286[anInt4955 + 2];
											anIntArray286[anInt4955++] = aClass145_3.method3154(local19, local13, local25);
											return;
										}
										if (arg0 == 3715) {
											anIntArray286[anInt4955++] = aClass145_3.anInt3699;
											return;
										}
										if (arg0 == 3716) {
											anIntArray286[anInt4955++] = aClass145_3.anInt3679;
											return;
										}
										if (arg0 == 3717) {
											anIntArray286[anInt4955++] = aClass145_3.method3161(aStringArray35[--anInt4952]);
											return;
										}
										if (arg0 == 3718) {
											anIntArray286[anInt4955 - 1] = aClass145_3.method3148()[anIntArray286[anInt4955 - 1]];
											return;
										}
										if (arg0 == 3750) {
											if (Static34.aClass6_Sub2_1 != null) {
												anIntArray286[anInt4955++] = 1;
												aClass6_Sub2_2 = Static34.aClass6_Sub2_1;
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static303.aClass6_Sub2_3 != null) {
												anIntArray286[anInt4955++] = 1;
												aClass6_Sub2_2 = Static303.aClass6_Sub2_3;
												return;
											}
											anIntArray286[anInt4955++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray35[anInt4952++] = aClass6_Sub2_2.aString9;
											return;
										}
										if (arg0 == 3753) {
											anIntArray286[anInt4955++] = aClass6_Sub2_2.aByte13;
											return;
										}
										if (arg0 == 3754) {
											anIntArray286[anInt4955++] = aClass6_Sub2_2.aByte12;
											return;
										}
										if (arg0 == 3755) {
											anIntArray286[anInt4955++] = aClass6_Sub2_2.anInt373;
											return;
										}
										if (arg0 == 3756) {
											local13 = anIntArray286[--anInt4955];
											aStringArray35[anInt4952++] = aClass6_Sub2_2.aClass157Array1[local13].aString50;
											return;
										}
										if (arg0 == 3757) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = aClass6_Sub2_2.aClass157Array1[local13].aByte77;
											return;
										}
										if (arg0 == 3758) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = aClass6_Sub2_2.aClass157Array1[local13].anInt4293;
											return;
										}
										if (arg0 == 3759) {
											local13 = anIntArray286[--anInt4955];
											Static294.method8646(aClass6_Sub2_2 == Static303.aClass6_Sub2_3, local13);
											return;
										}
										if (arg0 == 3760) {
											anIntArray286[anInt4955++] = aClass6_Sub2_2.method407(aStringArray35[--anInt4952]);
											return;
										}
										if (arg0 == 3761) {
											anIntArray286[anInt4955 - 1] = aClass6_Sub2_2.method413()[anIntArray286[anInt4955 - 1]];
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = Static490.aClass70Array1[local13].method1753();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = Static490.aClass70Array1[local13].anInt1985;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = Static490.aClass70Array1[local13].anInt1990;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = Static490.aClass70Array1[local13].anInt1991;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = Static490.aClass70Array1[local13].anInt1986;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray286[--anInt4955];
											anIntArray286[anInt4955++] = Static490.aClass70Array1[local13].anInt1987;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray286[--anInt4955];
											local19 = Static490.aClass70Array1[local13].method1751();
											anIntArray286[anInt4955++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray286[--anInt4955];
											local19 = Static490.aClass70Array1[local13].method1751();
											anIntArray286[anInt4955++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray286[--anInt4955];
											local19 = Static490.aClass70Array1[local13].method1751();
											anIntArray286[anInt4955++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray286[--anInt4955];
											local19 = Static490.aClass70Array1[local13].method1751();
											anIntArray286[anInt4955++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(8207) long local8207;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = local13 + local19;
												return;
											}
											if (arg0 == 4001) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = local13 - local19;
												return;
											}
											if (arg0 == 4002) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = local13 * local19;
												return;
											}
											if (arg0 == 4003) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = local13 / local19;
												return;
											}
											if (arg0 == 4004) {
												local13 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = (int) (Math.random() * (double) local13);
												return;
											}
											if (arg0 == 4005) {
												local13 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = (int) (Math.random() * (double) (local13 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt4955 -= 5;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												local25 = anIntArray286[anInt4955 + 2];
												local357 = anIntArray286[anInt4955 + 3];
												local2473 = anIntArray286[anInt4955 + 4];
												anIntArray286[anInt4955++] = local13 + (local19 - local13) * (local2473 - local25) / (local357 - local25);
												return;
											}
											@Pc(8214) long local8214;
											if (arg0 == 4007) {
												anInt4955 -= 2;
												local8207 = (long) anIntArray286[anInt4955];
												local8214 = (long) anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = (int) (local8207 + local8207 * local8214 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = local13 | 0x1 << local19;
												return;
											}
											if (arg0 == 4009) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = local13 & -(0x1 << local19) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = local13 % local19;
												return;
											}
											if (arg0 == 4012) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												if (local13 == 0) {
													anIntArray286[anInt4955++] = 0;
													return;
												}
												anIntArray286[anInt4955++] = (int) Math.pow((double) local13, (double) local19);
												return;
											}
											if (arg0 == 4013) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												if (local13 == 0) {
													anIntArray286[anInt4955++] = 0;
													return;
												}
												if (local19 == 0) {
													anIntArray286[anInt4955++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray286[anInt4955++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
												return;
											}
											if (arg0 == 4014) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = local13 & local19;
												return;
											}
											if (arg0 == 4015) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = local13 | local19;
												return;
											}
											if (arg0 == 4016) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = local13 < local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4017) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = local13 > local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4018) {
												anInt4955 -= 3;
												local8207 = (long) anIntArray286[anInt4955];
												local8214 = (long) anIntArray286[anInt4955 + 1];
												@Pc(8595) long local8595 = (long) anIntArray286[anInt4955 + 2];
												anIntArray286[anInt4955++] = (int) (local8207 * local8595 / local8214);
												return;
											}
											if (arg0 == 4019) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												if (local13 > 700 || local19 > 700) {
													anIntArray286[anInt4955++] = 256;
												}
												@Pc(8654) double local8654 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
												anIntArray286[anInt4955++] = (int) (Math.pow(2.0D, local8654) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local13 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = Static310.anIntArray309[Static372.method5335(local13) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4177 = aStringArray35[--anInt4952];
												local19 = anIntArray286[--anInt4955];
												aStringArray35[anInt4952++] = local4177 + local19;
												return;
											}
											if (arg0 == 4101) {
												anInt4952 -= 2;
												local4177 = aStringArray35[anInt4952];
												local1161 = aStringArray35[anInt4952 + 1];
												aStringArray35[anInt4952++] = local4177 + local1161;
												return;
											}
											if (arg0 == 4102) {
												local4177 = aStringArray35[--anInt4952];
												local19 = anIntArray286[--anInt4955];
												aStringArray35[anInt4952++] = local4177 + Static260.method8772(local19, true);
												return;
											}
											if (arg0 == 4103) {
												local4177 = aStringArray35[--anInt4952];
												aStringArray35[anInt4952++] = local4177.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray35[anInt4952++] = Static418.method6244(Static232.method3401(anIntArray286[--anInt4955]), Static616.anInt10077);
												return;
											}
											if (arg0 == 4105) {
												anInt4952 -= 2;
												local4177 = aStringArray35[anInt4952];
												local1161 = aStringArray35[anInt4952 + 1];
												if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1 != null && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1.aBoolean501) {
													aStringArray35[anInt4952++] = local1161;
													return;
												}
												aStringArray35[anInt4952++] = local4177;
												return;
											}
											if (arg0 == 4106) {
												local13 = anIntArray286[--anInt4955];
												aStringArray35[anInt4952++] = Integer.toString(local13);
												return;
											}
											if (arg0 == 4107) {
												anInt4952 -= 2;
												anIntArray286[anInt4955++] = Static613.method8478(Static616.anInt10077, aStringArray35[anInt4952 + 1], aStringArray35[anInt4952]);
												return;
											}
											@Pc(8967) Class151 local8967;
											if (arg0 == 4108) {
												local4177 = aStringArray35[--anInt4952];
												anInt4955 -= 2;
												local19 = anIntArray286[anInt4955];
												local25 = anIntArray286[anInt4955 + 1];
												local8967 = Static462.method6858(Static466.aClass8_114, local25);
												anIntArray286[anInt4955++] = local8967.method3330(local19, local4177, Static418.aClass9Array125);
												return;
											}
											if (arg0 == 4109) {
												local4177 = aStringArray35[--anInt4952];
												anInt4955 -= 2;
												local19 = anIntArray286[anInt4955];
												local25 = anIntArray286[anInt4955 + 1];
												local8967 = Static462.method6858(Static466.aClass8_114, local25);
												anIntArray286[anInt4955++] = local8967.method3327(local19, Static418.aClass9Array125, local4177);
												return;
											}
											if (arg0 == 4110) {
												anInt4952 -= 2;
												local4177 = aStringArray35[anInt4952];
												local1161 = aStringArray35[anInt4952 + 1];
												if (anIntArray286[--anInt4955] == 1) {
													aStringArray35[anInt4952++] = local4177;
													return;
												}
												aStringArray35[anInt4952++] = local1161;
												return;
											}
											if (arg0 == 4111) {
												local4177 = aStringArray35[--anInt4952];
												aStringArray35[anInt4952++] = Static648.method8832(local4177);
												return;
											}
											if (arg0 == 4112) {
												local4177 = aStringArray35[--anInt4952];
												local19 = anIntArray286[--anInt4955];
												if (local19 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray35[anInt4952++] = local4177 + (char) local19;
												return;
											}
											if (arg0 == 4113) {
												local13 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = method4222((char) local13);
												return;
											}
											if (arg0 == 4114) {
												local13 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = Static418.method6243((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local13 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = Static185.method2654((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local13 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = Static260.method8774((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4177 = aStringArray35[--anInt4952];
												if (local4177 != null) {
													anIntArray286[anInt4955++] = local4177.length();
													return;
												}
												anIntArray286[anInt4955++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4177 = aStringArray35[--anInt4952];
												anInt4955 -= 2;
												local19 = anIntArray286[anInt4955];
												local25 = anIntArray286[anInt4955 + 1];
												aStringArray35[anInt4952++] = local4177.substring(local19, local25);
												return;
											}
											if (arg0 == 4119) {
												local4177 = aStringArray35[--anInt4952];
												@Pc(9325) StringBuffer local9325 = new StringBuffer(local4177.length());
												@Pc(9327) boolean local9327 = false;
												for (local357 = 0; local357 < local4177.length(); local357++) {
													@Pc(9334) char local9334 = local4177.charAt(local357);
													if (local9334 == '<') {
														local9327 = true;
													} else if (local9334 == '>') {
														local9327 = false;
													} else if (!local9327) {
														local9325.append(local9334);
													}
												}
												aStringArray35[anInt4952++] = local9325.toString();
												return;
											}
											if (arg0 == 4120) {
												local4177 = aStringArray35[--anInt4952];
												anInt4955 -= 2;
												local19 = anIntArray286[anInt4955];
												local25 = anIntArray286[anInt4955 + 1];
												anIntArray286[anInt4955++] = local4177.indexOf(local19, local25);
												return;
											}
											if (arg0 == 4121) {
												anInt4952 -= 2;
												local4177 = aStringArray35[anInt4952];
												local1161 = aStringArray35[anInt4952 + 1];
												local25 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = local4177.indexOf(local1161, local25);
												return;
											}
											if (arg0 == 4122) {
												local13 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = Character.toLowerCase((char) local13);
												return;
											}
											if (arg0 == 4123) {
												local13 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = Character.toUpperCase((char) local13);
												return;
											}
											if (arg0 == 4124) {
												local420 = anIntArray286[--anInt4955] != 0;
												local19 = anIntArray286[--anInt4955];
												aStringArray35[anInt4952++] = Static377.method5353(local420, 0, Static616.anInt10077, (long) local19);
												return;
											}
											if (arg0 == 4125) {
												local4177 = aStringArray35[--anInt4952];
												local19 = anIntArray286[--anInt4955];
												@Pc(9548) Class151 local9548 = Static462.method6858(Static466.aClass8_114, local19);
												anIntArray286[anInt4955++] = local9548.method3326(Static418.aClass9Array125, local4177);
												return;
											}
											if (arg0 == 4126) {
												aStringArray35[anInt4952++] = Static268.method3979(Static616.anInt10077, (long) anIntArray286[--anInt4955] * 60000L) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local8207 = aLongArray17[--anInt4953];
												aStringArray35[anInt4952++] = local8207 == -1L ? "" : Long.toString(local8207, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local13 = anIntArray286[--anInt4955];
												aStringArray35[anInt4952++] = Static340.aClass121_1.method2647(local13).aString77;
												return;
											}
											@Pc(9671) Class216 local9671;
											if (arg0 == 4201) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												local9671 = Static340.aClass121_1.method2647(local13);
												if (local19 >= 1 && local19 <= 5 && local9671.aStringArray44[local19 - 1] != null) {
													aStringArray35[anInt4952++] = local9671.aStringArray44[local19 - 1];
													return;
												}
												aStringArray35[anInt4952++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												local9671 = Static340.aClass121_1.method2647(local13);
												if (local19 >= 1 && local19 <= 5 && local9671.aStringArray45[local19 - 1] != null) {
													aStringArray35[anInt4952++] = local9671.aStringArray45[local19 - 1];
													return;
												}
												aStringArray35[anInt4952++] = "";
												return;
											}
											if (arg0 == 4203) {
												local13 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = Static340.aClass121_1.method2647(local13).anInt6075;
												return;
											}
											if (arg0 == 4204) {
												local13 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = Static340.aClass121_1.method2647(local13).anInt6041 == 1 ? 1 : 0;
												return;
											}
											@Pc(9834) Class216 local9834;
											if (arg0 == 4205) {
												local13 = anIntArray286[--anInt4955];
												local9834 = Static340.aClass121_1.method2647(local13);
												if (local9834.anInt6088 == -1 && local9834.anInt6046 >= 0) {
													anIntArray286[anInt4955++] = local9834.anInt6046;
													return;
												}
												anIntArray286[anInt4955++] = local13;
												return;
											}
											if (arg0 == 4206) {
												local13 = anIntArray286[--anInt4955];
												local9834 = Static340.aClass121_1.method2647(local13);
												if (local9834.anInt6088 >= 0 && local9834.anInt6046 >= 0) {
													anIntArray286[anInt4955++] = local9834.anInt6046;
													return;
												}
												anIntArray286[anInt4955++] = local13;
												return;
											}
											if (arg0 == 4207) {
												local13 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = Static340.aClass121_1.method2647(local13).aBoolean401 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												local3242 = Static280.aClass349_2.method8157(local19);
												if (local3242.method7797()) {
													aStringArray35[anInt4952++] = Static340.aClass121_1.method2647(local13).method5143(local19, local3242.aString129);
													return;
												}
												anIntArray286[anInt4955++] = Static340.aClass121_1.method2647(local13).method5149(local3242.anInt9243, local19);
												return;
											}
											if (arg0 == 4209) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1] - 1;
												local9671 = Static340.aClass121_1.method2647(local13);
												if (local9671.anInt6080 == local19) {
													anIntArray286[anInt4955++] = local9671.anInt6091;
													return;
												}
												if (local9671.anInt6051 == local19) {
													anIntArray286[anInt4955++] = local9671.anInt6068;
													return;
												}
												anIntArray286[anInt4955++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4177 = aStringArray35[--anInt4952];
												local19 = anIntArray286[--anInt4955];
												Static129.method1977(local4177, local19 == 1);
												anIntArray286[anInt4955++] = Static403.anInt6786;
												return;
											}
											if (arg0 == 4211) {
												if (Static123.aShortArray41 != null && Static277.anInt4792 < Static403.anInt6786) {
													anIntArray286[anInt4955++] = Static123.aShortArray41[Static277.anInt4792++] & 0xFFFF;
													return;
												}
												anIntArray286[anInt4955++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static277.anInt4792 = 0;
												return;
											}
											if (arg0 == 4213) {
												local13 = anIntArray286[--anInt4955];
												anIntArray286[anInt4955++] = Static340.aClass121_1.method2647(local13).anInt6089;
												return;
											}
											if (arg0 == 4214) {
												local4177 = aStringArray35[--anInt4952];
												anInt4955 -= 3;
												local19 = anIntArray286[anInt4955];
												local25 = anIntArray286[anInt4955 + 1];
												local357 = anIntArray286[anInt4955 + 2];
												Static551.method7238(local357, local4177, local19 == 1, local25);
												anIntArray286[anInt4955++] = Static403.anInt6786;
												return;
											}
											if (arg0 == 4215) {
												anInt4952 -= 2;
												anInt4955 -= 2;
												local4177 = aStringArray35[anInt4952];
												local19 = anIntArray286[anInt4955];
												local25 = anIntArray286[anInt4955 + 1];
												@Pc(10233) String local10233 = aStringArray35[anInt4952 + 1];
												Static269.method3990(local4177, local10233, local19 == 1, local25);
												anIntArray286[anInt4955++] = Static403.anInt6786;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												local3242 = Static280.aClass349_2.method8157(local19);
												if (local3242.method7797()) {
													aStringArray35[anInt4952++] = Static95.aClass188_1.method4262(local13).method2037(local19, local3242.aString129);
													return;
												}
												anIntArray286[anInt4955++] = Static95.aClass188_1.method4262(local13).method2039(local3242.anInt9243, local19);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												local3242 = Static280.aClass349_2.method8157(local19);
												if (local3242.method7797()) {
													aStringArray35[anInt4952++] = Static411.aClass88_3.method2024(local13).method7296(local19, local3242.aString129);
													return;
												}
												anIntArray286[anInt4955++] = Static411.aClass88_3.method2024(local13).method7302(local19, local3242.anInt9243);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt4955 -= 2;
												local13 = anIntArray286[anInt4955];
												local19 = anIntArray286[anInt4955 + 1];
												local3242 = Static280.aClass349_2.method8157(local19);
												if (local3242.method7797()) {
													aStringArray35[anInt4952++] = Static604.aClass76_3.method1832(local13).method7011(local19, local3242.aString129);
													return;
												}
												anIntArray286[anInt4955++] = Static604.aClass76_3.method1832(local13).method7012(local3242.anInt9243, local19);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local13 = anIntArray286[--anInt4955];
												@Pc(10461) Class389 local10461 = Static12.aClass368_1.method8689(local13);
												if (local10461.anIntArray711 != null && local10461.anIntArray711.length > 0) {
													local25 = 0;
													local357 = local10461.anIntArray712[0];
													for (local2473 = 1; local2473 < local10461.anIntArray711.length; local2473++) {
														if (local10461.anIntArray712[local2473] > local357) {
															local25 = local2473;
															local357 = local10461.anIntArray712[local2473];
														}
													}
													anIntArray286[anInt4955++] = local10461.anIntArray711[local25];
													return;
												}
												anIntArray286[anInt4955++] = local10461.anInt10693;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray286[anInt4955++] = Static141.aBoolean156 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4177 = aStringArray35[--anInt4952];
												if (Static556.anInt9319 == 7 && Static190.anInt3237 == 0) {
													if (local4177.length() > 20) {
														Static152.aByte45 = -4;
														return;
													}
													Static152.aByte45 = -1;
													local4266 = Static268.method3981(Static377.aClass15_2, Static132.aClass289_43);
													local4266.aClass6_Sub23_Sub1_2.method8366(0);
													local25 = local4266.aClass6_Sub23_Sub1_2.anInt9901;
													local4266.aClass6_Sub23_Sub1_2.method8398(local4177);
													local4266.aClass6_Sub23_Sub1_2.method8346(local4266.aClass6_Sub23_Sub1_2.anInt9901 - local25);
													Static670.method9077(local4266);
													return;
												}
												Static152.aByte45 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray286[anInt4955++] = Static152.aByte45;
												if (Static152.aByte45 != -1) {
													Static152.aByte45 = -6;
												}
												return;
											}
										}
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static286.method4134(anIntArray286[--anInt4955]);
						} else {
							local137 = arg1 ? aClass321_23 : aClass321_22;
						}
						if (arg0 == 1300) {
							local19 = anIntArray286[--anInt4955] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method7670(aStringArray35[--anInt4952], local19);
								return;
							}
							anInt4952--;
							return;
						}
						if (arg0 == 1301) {
							anInt4955 -= 2;
							local19 = anIntArray286[anInt4955];
							local25 = anIntArray286[anInt4955 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass321_41 = null;
								return;
							}
							local137.aClass321_41 = Static640.method8748(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray286[--anInt4955];
							if (local19 != Static221.anInt3751 && local19 != Static652.anInt6475 && local19 != Static136.anInt2382) {
								return;
							}
							local137.anInt9060 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt9092 = anIntArray286[--anInt4955];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt9106 = anIntArray286[--anInt4955];
							return;
						}
						if (arg0 == 1305) {
							local137.aString123 = aStringArray35[--anInt4952];
							return;
						}
						if (arg0 == 1306) {
							local137.aString122 = aStringArray35[--anInt4952];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray55 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt9082 = anIntArray286[--anInt4955];
							local137.anInt9026 = anIntArray286[--anInt4955];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray286[--anInt4955];
							local25 = anIntArray286[--anInt4955];
							if (local25 >= 1 && local25 <= 10) {
								local137.method7674(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString124 = aStringArray35[--anInt4952];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt9020 = anIntArray286[--anInt4955];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt4955 -= 3;
								local19 = anIntArray286[anInt4955] - 1;
								local25 = anIntArray286[anInt4955 + 1];
								local357 = anIntArray286[anInt4955 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt4955 -= 2;
								local19 = 10;
								local25 = anIntArray286[anInt4955];
								local357 = anIntArray286[anInt4955 + 1];
							}
							if (local137.aByteArray97 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray97 = new byte[11];
								local137.aByteArray96 = new byte[11];
								local137.anIntArray612 = new int[11];
							}
							local137.aByteArray97[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean659 = false;
								for (local2473 = 0; local2473 < local137.aByteArray97.length; local2473++) {
									if (local137.aByteArray97[local2473] != 0) {
										local137.aBoolean659 = true;
										break;
									}
								}
							} else {
								local137.aBoolean659 = true;
							}
							local137.aByteArray96[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt9019 = anIntArray286[--anInt4955];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static286.method4134(anIntArray286[--anInt4955]);
					} else {
						local137 = arg1 ? aClass321_23 : aClass321_22;
					}
					Static293.method4206(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt4955 -= 2;
						local19 = anIntArray286[anInt4955];
						local25 = anIntArray286[anInt4955 + 1];
						if (local137.anInt9061 == -1) {
							Static83.method1457(local137.anInt9040);
							Static555.method7834(local137.anInt9040);
							Static223.method3249(local137.anInt9040);
						}
						if (local19 == -1) {
							local137.anInt9058 = 1;
							local137.anInt9014 = -1;
							local137.anInt9048 = -1;
							return;
						}
						local137.anInt9048 = local19;
						local137.anInt9032 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean660 = true;
						} else {
							local137.aBoolean660 = false;
						}
						@Pc(1813) Class216 local1813 = Static340.aClass121_1.method2647(local19);
						local137.anInt9053 = local1813.anInt6072;
						local137.anInt9042 = local1813.anInt6078;
						local137.anInt9087 = local1813.anInt6079;
						local137.anInt9022 = local1813.anInt6081;
						local137.anInt9062 = local1813.anInt6040;
						local137.anInt9088 = local1813.anInt6050;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt9068 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt9068 = 1;
						} else {
							local137.anInt9068 = 2;
						}
						if (local137.anInt9074 > 0) {
							local137.anInt9088 = local137.anInt9088 * 32 / local137.anInt9074;
							return;
						}
						if (local137.anInt9086 > 0) {
							local137.anInt9088 = local137.anInt9088 * 32 / local137.anInt9086;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt9058 = 2;
						local137.anInt9014 = anIntArray286[--anInt4955];
						if (local137.anInt9061 == -1) {
							Static111.method5802(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt9058 = 3;
						local137.anInt9014 = -1;
						if (local137.anInt9061 == -1) {
							Static111.method5802(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt9058 = 6;
						local137.anInt9014 = anIntArray286[--anInt4955];
						if (local137.anInt9061 == -1) {
							Static111.method5802(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt9058 = 5;
						local137.anInt9014 = anIntArray286[--anInt4955];
						if (local137.anInt9061 == -1) {
							Static111.method5802(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt4955 -= 4;
						local137.anInt9071 = anIntArray286[anInt4955];
						local137.anInt9034 = anIntArray286[anInt4955 + 1];
						local137.anInt9038 = anIntArray286[anInt4955 + 2];
						local137.anInt9011 = anIntArray286[anInt4955 + 3];
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt4955 -= 2;
						local137.anInt9064 = anIntArray286[anInt4955];
						local137.anInt9025 = anIntArray286[anInt4955 + 1];
						Static293.method4206(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt4955 -= 4;
						local137.anInt9014 = anIntArray286[anInt4955];
						local137.anInt9046 = anIntArray286[anInt4955 + 1];
						if (anIntArray286[anInt4955 + 2] == 1) {
							local137.anInt9058 = 9;
						} else {
							local137.anInt9058 = 8;
						}
						if (anIntArray286[anInt4955 + 3] == 1) {
							local137.aBoolean660 = true;
						} else {
							local137.aBoolean660 = false;
						}
						if (local137.anInt9061 == -1) {
							Static111.method5802(local137.anInt9040);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt9058 = 5;
						local137.anInt9014 = Static659.anInt7559;
						local137.anInt9046 = 0;
						if (local137.anInt9061 == -1) {
							Static111.method5802(local137.anInt9040);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kaa", name = "f", descriptor = "(I)I")
	private static int method4231(@OriginalArg(0) int arg0) {
		@Pc(4) Class240 local4 = Static672.aClass198_3.method4604(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(26) Integer local26 = aClass145_3.method3155(local4.anInt6573, local4.anInt6571, Static457.aClass176_6.anInt4801 << 16 | local4.anInt6567);
		return local26 == null ? 0 : local26;
	}

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "(I)V")
	private static void method4232(@OriginalArg(0) int arg0) {
		@Pc(3) Class321 local3 = Static286.method4134(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class321[] local13 = Static202.aClass321ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class321[] local19 = Static109.aClass321ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static202.aClass321ArrayArray2[local9] = new Class321[local22];
			Static679.method1568(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static679.method1568(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}
}
