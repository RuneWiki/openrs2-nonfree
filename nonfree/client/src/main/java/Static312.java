import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "Lclient!qt;")
	private static Class282 aClass282_1;

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "[I")
	private static int[] anIntArray297;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "Lclient!wp;")
	private static Class361 aClass361_9;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "Lclient!wp;")
	private static Class361 aClass361_10;

	@OriginalMember(owner = "client!lr", name = "q", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray23;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "[I")
	private static final int[] anIntArray296 = new int[1000];

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray22 = new String[1000];

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "[Lclient!uh;")
	private static final Class337[] aClass337Array1 = new Class337[50];

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
	private static int anInt5303 = 0;

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
	private static int anInt5308 = 0;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "[I")
	private static final int[] anIntArray298 = new int[5];

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "[[I")
	private static final int[][] anIntArrayArray121 = new int[5][5000];

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
	private static int anInt5315 = 0;

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_35 = new Class6(4);

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray24 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!lr", name = "B", descriptor = "[I")
	private static final int[] anIntArray299 = new int[3];

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
	private static int anInt5316 = 0;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	public static void method4561(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static293.method3974(arg0)) {
			return;
		}
		@Pc(12) Class361[] local12 = Static380.aClass361ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class361 local19 = local12[local14];
			if (local19.anObjectArray18 != null) {
				@Pc(26) Class3_Sub32 local26 = new Class3_Sub32();
				local26.aClass361_6 = local19;
				local26.anObjectArray1 = local19.anObjectArray18;
				method4567(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZ)V")
	public static void method4562() {
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(IZ)V")
	private static void method4563(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class3_Sub42 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray296[anInt5315++] = Static475.anInt7863;
				return;
			}
			if (arg0 == 5001) {
				anInt5315 -= 3;
				Static475.anInt7863 = anIntArray296[anInt5315];
				Static183.aClass122_3 = Static359.method5542(anIntArray296[anInt5315 + 1]);
				if (Static183.aClass122_3 == null) {
					Static183.aClass122_3 = Static469.aClass122_4;
				}
				Static572.anInt9292 = anIntArray296[anInt5315 + 2];
				local52 = Static591.method7910(Static9.aClass199_3, Static286.aClass303_58);
				local52.aClass3_Sub11_Sub1_1.method5213(Static475.anInt7863);
				local52.aClass3_Sub11_Sub1_1.method5213(Static183.aClass122_3.anInt3616);
				local52.aClass3_Sub11_Sub1_1.method5213(Static572.anInt9292);
				Static511.method6885(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt5308 -= 2;
				local83 = aStringArray22[anInt5308];
				local89 = aStringArray22[anInt5308 + 1];
				anInt5315 -= 2;
				local97 = anIntArray296[anInt5315];
				local103 = anIntArray296[anInt5315 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class3_Sub42 local125 = Static591.method7910(Static9.aClass199_3, Static285.aClass303_57);
				local125.aClass3_Sub11_Sub1_1.method5213(Static325.method4707(local83) + Static325.method4707(local89) + 2);
				local125.aClass3_Sub11_Sub1_1.method5227(local83);
				local125.aClass3_Sub11_Sub1_1.method5213(local97 - 1);
				local125.aClass3_Sub11_Sub1_1.method5213(local103);
				local125.aClass3_Sub11_Sub1_1.method5227(local89);
				Static511.method6885(local125);
				return;
			}
			@Pc(179) Class359 local179;
			if (arg0 == 5003) {
				local175 = anIntArray296[--anInt5315];
				local179 = Static596.method7954(local175);
				local181 = "";
				if (local179 != null && local179.aString88 != null) {
					local181 = local179.aString88;
				}
				aStringArray22[anInt5308++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray296[--anInt5315];
				local179 = Static596.method7954(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9339;
				}
				anIntArray296[anInt5315++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static183.aClass122_3 == null) {
					anIntArray296[anInt5315++] = -1;
					return;
				}
				anIntArray296[anInt5315++] = Static183.aClass122_3.anInt3616;
				return;
			}
			@Pc(269) Class3_Sub42 local269;
			if (arg0 == 5006) {
				local175 = anIntArray296[--anInt5315];
				local269 = Static591.method7910(Static9.aClass199_3, Static464.aClass303_83);
				local269.aClass3_Sub11_Sub1_1.method5213(local175);
				Static511.method6885(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray22[--anInt5308];
				method4564(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt5308 -= 2;
				local83 = aStringArray22[anInt5308];
				local89 = aStringArray22[anInt5308 + 1];
				if (Static500.anInt8114 != 0 || (!Static297.aBoolean376 || Static559.aBoolean709) && !Static450.aBoolean734) {
					@Pc(328) Class3_Sub42 local328 = Static591.method7910(Static9.aClass199_3, Static274.aClass303_55);
					local328.aClass3_Sub11_Sub1_1.method5213(0);
					local103 = local328.aClass3_Sub11_Sub1_1.anInt6128;
					local328.aClass3_Sub11_Sub1_1.method5227(local83);
					Static337.method4789(local89, local328.aClass3_Sub11_Sub1_1);
					local328.aClass3_Sub11_Sub1_1.method5197(local328.aClass3_Sub11_Sub1_1.anInt6128 - local103);
					Static511.method6885(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray296[--anInt5315];
				local179 = Static596.method7954(local175);
				local181 = "";
				if (local179 != null && local179.aString91 != null) {
					local181 = local179.aString91;
				}
				aStringArray22[anInt5308++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray296[--anInt5315];
				local179 = Static596.method7954(local175);
				local181 = "";
				if (local179 != null && local179.aString92 != null) {
					local181 = local179.aString92;
				}
				aStringArray22[anInt5308++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray296[--anInt5315];
				local179 = Static596.method7954(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9341;
				}
				anIntArray296[anInt5315++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == null || Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aString96 == null) {
					local83 = Static196.aString85;
				} else {
					local83 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.method7884();
				}
				aStringArray22[anInt5308++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray296[anInt5315++] = Static572.anInt9292;
				return;
			}
			if (arg0 == 5017) {
				anIntArray296[anInt5315++] = Static3.method5706();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray296[--anInt5315];
				local179 = Static596.method7954(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt9346;
				}
				anIntArray296[anInt5315++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray296[--anInt5315];
				local179 = Static596.method7954(local175);
				local181 = "";
				if (local179 != null && local179.aString90 != null) {
					local181 = local179.aString90;
				}
				aStringArray22[anInt5308++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == null || Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aString96 == null) {
					local83 = Static196.aString85;
				} else {
					local83 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.method7879();
				}
				aStringArray22[anInt5308++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray296[--anInt5315];
				local179 = Static596.method7954(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9340;
				}
				anIntArray296[anInt5315++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray296[--anInt5315];
				local179 = Static596.method7954(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9342;
				}
				anIntArray296[anInt5315++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray296[--anInt5315];
				local179 = Static596.method7954(local175);
				local181 = "";
				if (local179 != null && local179.aString89 != null) {
					local181 = local179.aString89;
				}
				aStringArray22[anInt5308++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray296[--anInt5315];
				aStringArray22[anInt5308++] = Static520.aClass69_5.method1746(local175).aString86;
				return;
			}
			@Pc(736) Class3_Sub7_Sub19 local736;
			if (arg0 == 5051) {
				local175 = anIntArray296[--anInt5315];
				local736 = Static520.aClass69_5.method1746(local175);
				if (local736.anIntArray589 == null) {
					anIntArray296[anInt5315++] = 0;
					return;
				}
				anIntArray296[anInt5315++] = local736.anIntArray589.length;
				return;
			}
			if (arg0 == 5052) {
				anInt5315 -= 2;
				local175 = anIntArray296[anInt5315];
				local776 = anIntArray296[anInt5315 + 1];
				@Pc(781) Class3_Sub7_Sub19 local781 = Static520.aClass69_5.method1746(local175);
				local103 = local781.anIntArray589[local776];
				anIntArray296[anInt5315++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray296[--anInt5315];
				local736 = Static520.aClass69_5.method1746(local175);
				if (local736.anIntArray588 == null) {
					anIntArray296[anInt5315++] = 0;
					return;
				}
				anIntArray296[anInt5315++] = local736.anIntArray588.length;
				return;
			}
			if (arg0 == 5054) {
				anInt5315 -= 2;
				local175 = anIntArray296[anInt5315];
				local776 = anIntArray296[anInt5315 + 1];
				anIntArray296[anInt5315++] = Static520.aClass69_5.method1746(local175).anIntArray588[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray296[--anInt5315];
				aStringArray22[anInt5308++] = Static111.aClass149_11.method3568(local175).method2878();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray296[--anInt5315];
				@Pc(907) Class3_Sub7_Sub10 local907 = Static111.aClass149_11.method3568(local175);
				if (local907.anIntArray151 == null) {
					anIntArray296[anInt5315++] = 0;
					return;
				}
				anIntArray296[anInt5315++] = local907.anIntArray151.length;
				return;
			}
			if (arg0 == 5057) {
				anInt5315 -= 2;
				local175 = anIntArray296[anInt5315];
				local776 = anIntArray296[anInt5315 + 1];
				anIntArray296[anInt5315++] = Static111.aClass149_11.method3568(local175).anIntArray151[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass282_1 = new Class282();
				aClass282_1.anInt7422 = anIntArray296[--anInt5315];
				aClass282_1.aClass3_Sub7_Sub10_1 = Static111.aClass149_11.method3568(aClass282_1.anInt7422);
				aClass282_1.anIntArray464 = new int[aClass282_1.aClass3_Sub7_Sub10_1.method2876()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static591.method7910(Static9.aClass199_3, Static294.aClass303_80);
				local52.aClass3_Sub11_Sub1_1.method5213(0);
				local776 = local52.aClass3_Sub11_Sub1_1.anInt6128;
				local52.aClass3_Sub11_Sub1_1.method5213(0);
				local52.aClass3_Sub11_Sub1_1.method5200(aClass282_1.anInt7422);
				aClass282_1.aClass3_Sub7_Sub10_1.method2882(aClass282_1.anIntArray464, local52.aClass3_Sub11_Sub1_1);
				local52.aClass3_Sub11_Sub1_1.method5197(local52.aClass3_Sub11_Sub1_1.anInt6128 - local776);
				Static511.method6885(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray22[--anInt5308];
				local269 = Static591.method7910(Static9.aClass199_3, Static573.aClass303_101);
				local269.aClass3_Sub11_Sub1_1.method5213(0);
				local97 = local269.aClass3_Sub11_Sub1_1.anInt6128;
				local269.aClass3_Sub11_Sub1_1.method5227(local83);
				local269.aClass3_Sub11_Sub1_1.method5200(aClass282_1.anInt7422);
				aClass282_1.aClass3_Sub7_Sub10_1.method2882(aClass282_1.anIntArray464, local269.aClass3_Sub11_Sub1_1);
				local269.aClass3_Sub11_Sub1_1.method5197(local269.aClass3_Sub11_Sub1_1.anInt6128 - local97);
				Static511.method6885(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static591.method7910(Static9.aClass199_3, Static294.aClass303_80);
				local52.aClass3_Sub11_Sub1_1.method5213(0);
				local776 = local52.aClass3_Sub11_Sub1_1.anInt6128;
				local52.aClass3_Sub11_Sub1_1.method5213(1);
				local52.aClass3_Sub11_Sub1_1.method5200(aClass282_1.anInt7422);
				aClass282_1.aClass3_Sub7_Sub10_1.method2882(aClass282_1.anIntArray464, local52.aClass3_Sub11_Sub1_1);
				local52.aClass3_Sub11_Sub1_1.method5197(local52.aClass3_Sub11_Sub1_1.anInt6128 - local776);
				Static511.method6885(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt5315 -= 2;
				local175 = anIntArray296[anInt5315];
				local776 = anIntArray296[anInt5315 + 1];
				anIntArray296[anInt5315++] = Static520.aClass69_5.method1746(local175).aCharArray18[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt5315 -= 2;
				local175 = anIntArray296[anInt5315];
				local776 = anIntArray296[anInt5315 + 1];
				anIntArray296[anInt5315++] = Static520.aClass69_5.method1746(local175).aCharArray17[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt5315 -= 2;
				local175 = anIntArray296[anInt5315];
				local776 = anIntArray296[anInt5315 + 1];
				if (local776 == -1) {
					anIntArray296[anInt5315++] = -1;
					return;
				}
				anIntArray296[anInt5315++] = Static520.aClass69_5.method1746(local175).method7617((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt5315 -= 2;
				local175 = anIntArray296[anInt5315];
				local776 = anIntArray296[anInt5315 + 1];
				if (local776 == -1) {
					anIntArray296[anInt5315++] = -1;
					return;
				}
				anIntArray296[anInt5315++] = Static520.aClass69_5.method1746(local175).method7621((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray296[--anInt5315];
				anIntArray296[anInt5315++] = Static111.aClass149_11.method3568(local175).method2876();
				return;
			}
			if (arg0 == 5067) {
				anInt5315 -= 2;
				local175 = anIntArray296[anInt5315];
				local776 = anIntArray296[anInt5315 + 1];
				local97 = Static111.aClass149_11.method3568(local175).method2877(local776).anInt9317;
				anIntArray296[anInt5315++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt5315 -= 2;
				local175 = anIntArray296[anInt5315];
				local776 = anIntArray296[anInt5315 + 1];
				aClass282_1.anIntArray464[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt5315 -= 2;
				local175 = anIntArray296[anInt5315];
				local776 = anIntArray296[anInt5315 + 1];
				aClass282_1.anIntArray464[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt5315 -= 3;
				local175 = anIntArray296[anInt5315];
				local776 = anIntArray296[anInt5315 + 1];
				local97 = anIntArray296[anInt5315 + 2];
				@Pc(1448) Class3_Sub7_Sub10 local1448 = Static111.aClass149_11.method3568(local175);
				if (local1448.method2877(local776).anInt9317 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray296[anInt5315++] = local1448.method2885(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray22[--anInt5308];
				local1496 = anIntArray296[--anInt5315] == 1;
				Static474.method6520(local83, local1496);
				anIntArray296[anInt5315++] = Static132.anInt9446;
				return;
			}
			if (arg0 == 5072) {
				if (Static184.aShortArray46 != null && Static67.anInt1539 < Static132.anInt9446) {
					anIntArray296[anInt5315++] = Static184.aShortArray46[Static67.anInt1539++] & 0xFFFF;
					return;
				}
				anIntArray296[anInt5315++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static67.anInt1539 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static140.aClass195_1.method4499(86)) {
					anIntArray296[anInt5315++] = 1;
					return;
				}
				anIntArray296[anInt5315++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static140.aClass195_1.method4499(82)) {
					anIntArray296[anInt5315++] = 1;
					return;
				}
				anIntArray296[anInt5315++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static140.aClass195_1.method4499(81)) {
					anIntArray296[anInt5315++] = 1;
					return;
				}
				anIntArray296[anInt5315++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static70.method1496(anIntArray296[--anInt5315]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray296[anInt5315++] = Static40.method658();
					return;
				}
				if (arg0 == 5205) {
					Static288.method4272(-1, anIntArray296[--anInt5315], -1, false);
					return;
				}
				@Pc(1696) Class3_Sub7_Sub17 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray296[--anInt5315];
					local1696 = Static44.method7653(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray296[anInt5315++] = -1;
						return;
					}
					anIntArray296[anInt5315++] = local1696.anInt8083;
					return;
				}
				@Pc(1729) Class3_Sub7_Sub17 local1729;
				if (arg0 == 5207) {
					local1729 = Static44.method7652(anIntArray296[--anInt5315]);
					if (local1729 != null && local1729.aString77 != null) {
						aStringArray22[anInt5308++] = local1729.aString77;
						return;
					}
					aStringArray22[anInt5308++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray296[anInt5315++] = Static207.anInt3792;
					anIntArray296[anInt5315++] = Static446.anInt7473;
					return;
				}
				if (arg0 == 5209) {
					anIntArray296[anInt5315++] = Static56.anInt1176 + Static44.anInt9258;
					anIntArray296[anInt5315++] = Static334.anInt5600 + Static44.anInt9263;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray296[--anInt5315];
					local1696 = Static44.method7652(local175);
					if (local1696 == null) {
						anIntArray296[anInt5315++] = 0;
						anIntArray296[anInt5315++] = 0;
						return;
					}
					anIntArray296[anInt5315++] = local1696.anInt8076 >> 14 & 0x3FFF;
					anIntArray296[anInt5315++] = local1696.anInt8076 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray296[--anInt5315];
					local1696 = Static44.method7652(local175);
					if (local1696 == null) {
						anIntArray296[anInt5315++] = 0;
						anIntArray296[anInt5315++] = 0;
						return;
					}
					anIntArray296[anInt5315++] = local1696.anInt8080 - local1696.anInt8081;
					anIntArray296[anInt5315++] = local1696.anInt8085 - local1696.anInt8075;
					return;
				}
				@Pc(1919) Class3_Sub51 local1919;
				if (arg0 == 5212) {
					local1919 = Static151.method2865();
					if (local1919 == null) {
						anIntArray296[anInt5315++] = -1;
						anIntArray296[anInt5315++] = -1;
						return;
					}
					anIntArray296[anInt5315++] = local1919.anInt9426;
					local776 = local1919.anInt9431 << 28 | local1919.anInt9434 + Static44.anInt9258 << 14 | local1919.anInt9427 + Static44.anInt9263;
					anIntArray296[anInt5315++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static88.method1707();
					if (local1919 == null) {
						anIntArray296[anInt5315++] = -1;
						anIntArray296[anInt5315++] = -1;
						return;
					}
					anIntArray296[anInt5315++] = local1919.anInt9426;
					local776 = local1919.anInt9431 << 28 | local1919.anInt9434 + Static44.anInt9258 << 14 | local1919.anInt9427 + Static44.anInt9263;
					anIntArray296[anInt5315++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray296[--anInt5315];
					local1696 = Static339.method5033();
					if (local1696 != null) {
						local2067 = local1696.method6705(local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray299, local175 >> 28 & 0x3);
						if (local2067) {
							Static155.method2921(anIntArray299[1], anIntArray299[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt5315 -= 2;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					@Pc(2105) Class325 local2105 = Static44.method7666(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class3_Sub7_Sub17 local2112 = (Class3_Sub7_Sub17) local2105.method6859(); local2112 != null; local2112 = (Class3_Sub7_Sub17) local2105.method6863()) {
						if (local2112.anInt8083 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray296[anInt5315++] = 1;
						return;
					}
					anIntArray296[anInt5315++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray296[--anInt5315];
					local1696 = Static44.method7652(local175);
					if (local1696 == null) {
						anIntArray296[anInt5315++] = -1;
						return;
					}
					anIntArray296[anInt5315++] = local1696.anInt8077;
					return;
				}
				if (arg0 == 5220) {
					anIntArray296[anInt5315++] = Static454.anInt7639 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray296[--anInt5315];
					Static155.method2921(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static339.method5033();
					if (local1729 != null) {
						local1496 = local1729.method6708(Static56.anInt1176 + Static44.anInt9258, anIntArray299, Static334.anInt5600 + Static44.anInt9263);
						if (local1496) {
							anIntArray296[anInt5315++] = anIntArray299[1];
							anIntArray296[anInt5315++] = anIntArray299[2];
							return;
						}
						anIntArray296[anInt5315++] = -1;
						anIntArray296[anInt5315++] = -1;
						return;
					}
					anIntArray296[anInt5315++] = -1;
					anIntArray296[anInt5315++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt5315 -= 2;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					Static288.method4272(local776 >> 14 & 0x3FFF, local175, local776 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray296[--anInt5315];
					local1696 = Static339.method5033();
					if (local1696 != null) {
						local2067 = local1696.method6705(local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray299, local175 >> 28 & 0x3);
						if (local2067) {
							anIntArray296[anInt5315++] = anIntArray299[1];
							anIntArray296[anInt5315++] = anIntArray299[2];
							return;
						}
						anIntArray296[anInt5315++] = -1;
						anIntArray296[anInt5315++] = -1;
						return;
					}
					anIntArray296[anInt5315++] = -1;
					anIntArray296[anInt5315++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray296[--anInt5315];
					local1696 = Static339.method5033();
					if (local1696 != null) {
						local2067 = local1696.method6708(local175 >> 14 & 0x3FFF, anIntArray299, local175 & 0x3FFF);
						if (local2067) {
							anIntArray296[anInt5315++] = anIntArray299[1];
							anIntArray296[anInt5315++] = anIntArray299[2];
							return;
						}
						anIntArray296[anInt5315++] = -1;
						anIntArray296[anInt5315++] = -1;
						return;
					}
					anIntArray296[anInt5315++] = -1;
					anIntArray296[anInt5315++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static529.method7060(anIntArray296[--anInt5315]);
					return;
				}
				if (arg0 == 5227) {
					anInt5315 -= 2;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					Static288.method4272(local776 >> 14 & 0x3FFF, local175, local776 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static68.aBoolean127 = anIntArray296[--anInt5315] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray296[anInt5315++] = Static68.aBoolean127 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray296[--anInt5315];
					Static85.method1680(local175);
					return;
				}
				@Pc(2625) Class3 local2625;
				if (arg0 == 5231) {
					anInt5315 -= 2;
					local175 = anIntArray296[anInt5315];
					local1496 = anIntArray296[anInt5315 + 1] == 1;
					if (Static522.aClass354_40 != null) {
						local2625 = Static522.aClass354_40.method7689((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7825();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static522.aClass354_40.method7691(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class3 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray296[--anInt5315];
					if (Static522.aClass354_40 != null) {
						local2667 = Static522.aClass354_40.method7689((long) local175);
						anIntArray296[anInt5315++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray296[anInt5315++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt5315 -= 2;
					local175 = anIntArray296[anInt5315];
					local1496 = anIntArray296[anInt5315 + 1] == 1;
					if (Static160.aClass354_12 != null) {
						local2625 = Static160.aClass354_12.method7689((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7825();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static160.aClass354_12.method7691(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray296[--anInt5315];
					if (Static160.aClass354_12 != null) {
						local2667 = Static160.aClass354_12.method7689((long) local175);
						anIntArray296[anInt5315++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray296[anInt5315++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray296[anInt5315++] = Static44.aClass3_Sub7_Sub17_3 == null ? -1 : Static44.aClass3_Sub7_Sub17_3.anInt8083;
					return;
				}
				if (arg0 == 5236) {
					anInt5315 -= 2;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static283.method4223(local103, local175, local97);
					if (local2833 < 0) {
						anIntArray296[anInt5315++] = -1;
						return;
					}
					anIntArray296[anInt5315++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static139.method2700();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt5315 -= 2;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					Static3.method5708(false, local175, local776, 3);
					anIntArray296[anInt5315++] = Static376.aFrame4 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static376.aFrame4 != null) {
						Static3.method5708(false, -1, -1, Static405.aClass3_Sub3_Sub1_1.anInt7570);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2917) Class306[] local2917 = Static157.method2954();
					anIntArray296[anInt5315++] = local2917.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray296[--anInt5315];
					@Pc(2941) Class306[] local2941 = Static157.method2954();
					anIntArray296[anInt5315++] = local2941[local175].anInt7912;
					anIntArray296[anInt5315++] = local2941[local175].anInt7911;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static405.aClass3_Sub3_Sub1_1.anInt7569;
					local776 = Static405.aClass3_Sub3_Sub1_1.anInt7560;
					local97 = -1;
					@Pc(2978) Class306[] local2978 = Static157.method2954();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class306 local2985 = local2978[local2833];
						if (local2985.anInt7912 == local175 && local2985.anInt7911 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray296[anInt5315++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray296[anInt5315++] = Static38.method626();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray296[--anInt5315];
					if (local175 >= 1 && local175 <= 2) {
						Static3.method5708(false, -1, -1, local175);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7570;
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray296[--anInt5315];
					if (local175 >= 1 && local175 <= 2) {
						Static405.aClass3_Sub3_Sub1_1.anInt7570 = local175;
						Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt5308 -= 2;
					local83 = aStringArray22[anInt5308];
					local89 = aStringArray22[anInt5308 + 1];
					local97 = anIntArray296[--anInt5315];
					@Pc(3124) Class3_Sub42 local3124 = Static591.method7910(Static9.aClass199_3, Static538.aClass303_95);
					local3124.aClass3_Sub11_Sub1_1.method5213(Static325.method4707(local83) + Static325.method4707(local89) + 1);
					local3124.aClass3_Sub11_Sub1_1.method5227(local83);
					local3124.aClass3_Sub11_Sub1_1.method5227(local89);
					local3124.aClass3_Sub11_Sub1_1.method5213(local97);
					Static511.method6885(local3124);
					return;
				}
				if (arg0 == 5401) {
					anInt5315 -= 2;
					Static242.aShortArray66[anIntArray296[anInt5315]] = (short) Static28.method463(anIntArray296[anInt5315 + 1]);
					Static6.aClass92_1.method2682();
					Static6.aClass92_1.method2674();
					Static361.aClass229_13.method5391();
					Static238.method3668();
					return;
				}
				if (arg0 == 5405) {
					anInt5315 -= 2;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static145.anIntArrayArrayArray8[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt5315 -= 7;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1] << 1;
					local97 = anIntArray296[anInt5315 + 2];
					local103 = anIntArray296[anInt5315 + 3];
					local2833 = anIntArray296[anInt5315 + 4];
					@Pc(3262) int local3262 = anIntArray296[anInt5315 + 5];
					@Pc(3268) int local3268 = anIntArray296[anInt5315 + 6];
					if (local175 >= 0 && local175 < 2 && Static145.anIntArrayArrayArray8[local175] != null && local776 >= 0 && local776 < Static145.anIntArrayArrayArray8[local175].length) {
						Static145.anIntArrayArrayArray8[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3268 };
						Static145.anIntArrayArrayArray8[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3262 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static145.anIntArrayArrayArray8[anIntArray296[--anInt5315]].length >> 1;
					anIntArray296[anInt5315++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static376.aFrame4 != null) {
						Static3.method5708(false, -1, -1, Static405.aClass3_Sub3_Sub1_1.anInt7570);
					}
					if (Static203.aFrame3 != null) {
						Static549.method7294();
						System.exit(0);
						return;
					}
					local83 = Static297.aString36 == null ? Static488.method6616() : Static297.aString36;
					Static515.method2749(false, Static237.aClass258_3, local83, Static60.anInt1312 == 1);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static446.aClass39_5 != null) {
						if (Static446.aClass39_5.anObject2 == null) {
							local83 = Static14.method209(Static446.aClass39_5.anInt893);
						} else {
							local83 = (String) Static446.aClass39_5.anObject2;
						}
					}
					aStringArray22[anInt5308++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray296[anInt5315++] = Static237.aClass258_3.aBoolean524 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static376.aFrame4 != null) {
						Static3.method5708(false, -1, -1, Static405.aClass3_Sub3_Sub1_1.anInt7570);
					}
					local83 = aStringArray22[--anInt5308];
					local1496 = anIntArray296[--anInt5315] == 1;
					local181 = Static488.method6616() + local83;
					Static515.method2749(local1496, Static237.aClass258_3, local181, Static60.anInt1312 == 1);
					return;
				}
				if (arg0 == 5422) {
					anInt5308 -= 2;
					local83 = aStringArray22[anInt5308];
					local89 = aStringArray22[anInt5308 + 1];
					local97 = anIntArray296[--anInt5315];
					if (local83.length() > 0) {
						if (Static453.aStringArray31 == null) {
							Static453.aStringArray31 = new String[Static342.anIntArray322[Static121.aClass274_1.anInt7264]];
						}
						Static453.aStringArray31[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static421.aStringArray29 == null) {
							Static421.aStringArray29 = new String[Static342.anIntArray322[Static121.aClass274_1.anInt7264]];
						}
						Static421.aStringArray29[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray22[--anInt5308]);
					return;
				}
				if (arg0 == 5424) {
					anInt5315 -= 11;
					Static342.anInt6008 = anIntArray296[anInt5315];
					Static64.anInt1499 = anIntArray296[anInt5315 + 1];
					Static179.anInt3467 = anIntArray296[anInt5315 + 2];
					Static303.anInt5117 = anIntArray296[anInt5315 + 3];
					Static180.anInt3476 = anIntArray296[anInt5315 + 4];
					Static41.anInt764 = anIntArray296[anInt5315 + 5];
					Static91.anInt1907 = anIntArray296[anInt5315 + 6];
					Static372.anInt6394 = anIntArray296[anInt5315 + 7];
					Static35.anInt640 = anIntArray296[anInt5315 + 8];
					Static393.anInt6879 = anIntArray296[anInt5315 + 9];
					Static509.anInt8273 = anIntArray296[anInt5315 + 10];
					Static552.aClass322_150.method6797(Static180.anInt3476);
					Static552.aClass322_150.method6797(Static41.anInt764);
					Static552.aClass322_150.method6797(Static91.anInt1907);
					Static552.aClass322_150.method6797(Static372.anInt6394);
					Static552.aClass322_150.method6797(Static35.anInt640);
					Static117.aClass14_8 = null;
					Static83.aClass14_6 = null;
					Static317.aClass14_17 = null;
					Static70.aClass14_5 = null;
					Static377.aClass14_19 = null;
					Static591.aClass14_34 = null;
					Static60.aClass14_4 = null;
					Static138.aClass14_9 = null;
					Static270.aBoolean347 = true;
					return;
				}
				if (arg0 == 5425) {
					Static123.method2518();
					Static270.aBoolean347 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt5315 -= 2;
					Static87.anInt5456 = anIntArray296[anInt5315];
					Static559.anInt9109 = anIntArray296[anInt5315 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt5315 -= 2;
					Static417.anInt7072 = anIntArray296[anInt5315 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt5315 -= 2;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					anIntArray296[anInt5315++] = Static300.method4435(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static237.method3663(false, false, aStringArray22[--anInt5308]);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static600.method2617("accountcreated", Static31.anApplet1);
						return;
					} catch (@Pc(3800) Throwable local3800) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static600.method2617("accountcreatestarted", Static31.anApplet1);
						return;
					} catch (@Pc(3811) Throwable local3811) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static377.aClipboard1 != null) {
						@Pc(3823) Transferable local3823 = Static377.aClipboard1.getContents(null);
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
					aStringArray22[anInt5308++] = local83;
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt5315 -= 4;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					local103 = anIntArray296[anInt5315 + 3];
					Static587.method7874((local175 & 0x3FFF) - Static246.anInt4344, local103, false, local97, local776 << 2, (local175 >> 14 & 0x3FFF) - Static335.anInt5608);
					return;
				}
				if (arg0 == 5501) {
					anInt5315 -= 4;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					local103 = anIntArray296[anInt5315 + 3];
					Static112.method1929(local97, local776 << 2, local103, (local175 & 0x3FFF) - Static246.anInt4344, (local175 >> 14 & 0x3FFF) - Static335.anInt5608);
					return;
				}
				if (arg0 == 5502) {
					anInt5315 -= 6;
					local175 = anIntArray296[anInt5315];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static91.anInt1908 = local175;
					local776 = anIntArray296[anInt5315 + 1];
					if (local776 + 1 >= Static145.anIntArrayArrayArray8[Static91.anInt1908].length >> 1) {
						throw new RuntimeException();
					}
					Static113.anInt2217 = local776;
					Static147.anInt3127 = 0;
					Static155.anInt3246 = anIntArray296[anInt5315 + 2];
					Static58.anInt1264 = anIntArray296[anInt5315 + 3];
					local97 = anIntArray296[anInt5315 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static1.anInt1 = local97;
					local103 = anIntArray296[anInt5315 + 5];
					if (local103 + 1 >= Static145.anIntArrayArrayArray8[Static1.anInt1].length >> 1) {
						throw new RuntimeException();
					}
					Static309.anInt5225 = local103;
					Static379.anInt6482 = 3;
					Static391.anInt6856 = -1;
					Static18.anInt314 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static154.method2914();
					return;
				}
				if (arg0 == 5504) {
					anInt5315 -= 2;
					Static228.method3542(anIntArray296[anInt5315], anIntArray296[anInt5315 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray296[anInt5315++] = (int) Static126.aFloat84 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray296[anInt5315++] = (int) Static43.aFloat20 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static517.method6935();
					return;
				}
				if (arg0 == 5508) {
					Static237.method3662();
					return;
				}
				if (arg0 == 5509) {
					Static402.method5825();
					return;
				}
				if (arg0 == 5510) {
					Static320.method4669();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray296[--anInt5315];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static335.anInt5608;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static54.anInt1038) {
						local776 = Static54.anInt1038;
					}
					local97 -= Static246.anInt4344;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static140.anInt3026) {
						local97 = Static140.anInt3026;
					}
					Static28.anInt516 = (local776 << 9) + 256;
					Static521.anInt8385 = (local97 << 9) + 256;
					Static379.anInt6482 = 4;
					Static391.anInt6856 = -1;
					Static18.anInt314 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static555.method7345();
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray296[--anInt5315];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static335.anInt5608;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static54.anInt1038) {
							local776 = Static54.anInt1038;
						}
						local97 -= Static246.anInt4344;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static140.anInt3026) {
							local97 = Static140.anInt3026;
						}
						Static18.anInt314 = (local776 << 9) + 256;
						Static391.anInt6856 = (local97 << 9) + 256;
						return;
					}
					Static18.anInt314 = -1;
					Static391.anInt6856 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt5308 -= 2;
					local83 = aStringArray22[anInt5308];
					local89 = aStringArray22[anInt5308 + 1];
					local97 = anIntArray296[--anInt5315];
					if (Static32.anInt602 != 3) {
						return;
					}
					if (Static407.anInt7011 == 0 && Static126.anInt2887 == 0) {
						Static196.aString85 = local83;
						Static173.aString18 = local89;
						Static61.anInt1462 = local97;
						Static25.method439(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static500.method6739();
					return;
				}
				if (arg0 == 5602) {
					if (Static407.anInt7011 == 0) {
						Static562.anInt9184 = -2;
						Static204.anInt3748 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt5315 -= 4;
					if (Static32.anInt602 != 3) {
						return;
					}
					if (Static407.anInt7011 == 0 && Static126.anInt2887 == 0) {
						Static354.method5252(anIntArray296[anInt5315 + 1], anIntArray296[anInt5315], anIntArray296[anInt5315 + 3], anIntArray296[anInt5315 + 2]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt5308--;
					if (Static32.anInt602 != 3) {
						return;
					}
					if (Static407.anInt7011 == 0 && Static126.anInt2887 == 0) {
						Static578.method7757(Static554.method7335(aStringArray22[anInt5308]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt5308 -= 2;
					if (Static32.anInt602 != 3) {
						return;
					}
					if (Static407.anInt7011 == 0 && Static126.anInt2887 == 0) {
						Static56.method1001(Static554.method7335(aStringArray22[anInt5308]), aStringArray22[anInt5308 + 1], false);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static126.anInt2887 == 0) {
						Static479.anInt8303 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray296[anInt5315++] = Static204.anInt3748;
					return;
				}
				if (arg0 == 5608) {
					anIntArray296[anInt5315++] = Static337.anInt5633;
					return;
				}
				if (arg0 == 5609) {
					anIntArray296[anInt5315++] = Static479.anInt8303;
					return;
				}
				if (arg0 == 5610) {
					for (local175 = 0; local175 < 5; local175++) {
						aStringArray22[anInt5308++] = Static506.aStringArray35 == null || Static506.aStringArray35.length <= local175 ? "" : Static417.method5941(Static506.aStringArray35[local175]);
					}
					Static506.aStringArray35 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray296[anInt5315++] = Static120.anInt2777;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray296[--anInt5315];
					if (Static32.anInt602 != 7) {
						return;
					}
					if (Static407.anInt7011 == 0 && Static126.anInt2887 == 0) {
						if (Static324.aClass165_2 != null) {
							Static324.aClass165_2.method3977();
							Static324.aClass165_2 = null;
						}
						Static61.anInt1462 = local175;
						Static25.method439(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray296[anInt5315++] = Static204.anInt3748;
					return;
				}
				if (arg0 == 5615) {
					anInt5308 -= 2;
					local83 = aStringArray22[anInt5308];
					local89 = aStringArray22[anInt5308 + 1];
					if (Static32.anInt602 != 3) {
						return;
					}
					if (Static407.anInt7011 == 0 && Static126.anInt2887 == 0) {
						if (Static324.aClass165_2 != null) {
							Static324.aClass165_2.method3977();
							Static324.aClass165_2 = null;
						}
						Static196.aString85 = local83;
						Static173.aString18 = local89;
						Static25.method439(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static326.method4711(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray296[anInt5315++] = Static562.anInt9184;
					return;
				}
				if (arg0 == 5618) {
					local175 = anIntArray296[--anInt5315];
					Static262.method4019(false, local175);
					return;
				}
				if (arg0 == 5619) {
					local175 = anIntArray296[--anInt5315];
					Static262.method4019(true, local175);
					return;
				}
				if (arg0 == 5620) {
					Static214.method3432();
					if (Static501.aString78 != "" && Static501.aString78 != "") {
						anIntArray296[anInt5315++] = 1;
						return;
					}
					anIntArray296[anInt5315++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt5308 -= 2;
					if (Static32.anInt602 != 3) {
						return;
					}
					if (Static407.anInt7011 == 0 && Static126.anInt2887 == 0) {
						Static56.method1001(Static554.method7335(aStringArray22[anInt5308]), aStringArray22[anInt5308 + 1], true);
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4719) Class39 local4719 = Static237.aClass258_3.method5895("3", false);
					while (local4719.anInt894 == 0) {
						Static589.method7892(1L);
					}
					if (local4719.anInt894 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4739) Class204 local4739 = (Class204) local4719.anObject2;
					if (local4739.method4680().exists()) {
						@Pc(4749) Class3_Sub11 local4749 = new Class3_Sub11(50);
						try {
							local4739.method4678(50, 0, local4749.aByteArray62);
						} catch (@Pc(4758) IOException local4758) {
						}
					}
					try {
						local4739.method4677();
						return;
					} catch (@Pc(4764) Exception local4764) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static205.aString25 != null) {
						anIntArray296[anInt5315++] = 1;
						return;
					}
					anIntArray296[anInt5315++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray296[anInt5315++] = (int) (Static149.aLong80 >> 32);
					anIntArray296[anInt5315++] = (int) (Static149.aLong80 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 1) {
						local175 = 1;
					}
					if (local175 > 4) {
						local175 = 4;
					}
					Static405.aClass3_Sub3_Sub1_1.anInt7552 = local175;
					Static444.method6194();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6002) {
					Static405.aClass3_Sub3_Sub1_1.method6321(anIntArray296[--anInt5315] == 1);
					Static444.method6194();
					Static286.method4255();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6003) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean585 = anIntArray296[--anInt5315] == 1;
					Static286.method4255();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6005) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean591 = anIntArray296[--anInt5315] == 1;
					Static444.method6194();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6006) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean581 = anIntArray296[--anInt5315] == 1;
					Static505.aClass45_11.method7385(!Static405.aClass3_Sub3_Sub1_1.aBoolean581);
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6007) {
					Static405.aClass3_Sub3_Sub1_1.anInt7576 = anIntArray296[--anInt5315];
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6008) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean583 = anIntArray296[--anInt5315] == 1;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6009) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean590 = anIntArray296[--anInt5315] == 1;
					Static444.method6194();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6010) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean576 = anIntArray296[--anInt5315] == 1;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6011) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static405.aClass3_Sub3_Sub1_1.method6298(local175, Static60.anInt1312);
					Static444.method6194();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6012) {
					Static405.aClass3_Sub3_Sub1_1.method6295(Static60.anInt1312, anIntArray296[--anInt5315] == 1);
					Static563.method7599();
					Static428.method6060();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6014) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean589 = anIntArray296[--anInt5315] == 1;
					Static444.method6194();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6015) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean584 = anIntArray296[--anInt5315] == 1;
					Static444.method6194();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6016) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static405.aClass3_Sub3_Sub1_1.anInt7557 = local175;
					Static486.method6610(Static60.anInt1312);
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					return;
				}
				if (arg0 == 6017) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean586 = anIntArray296[--anInt5315] == 1;
					Static90.method1711();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6018) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static405.aClass3_Sub3_Sub1_1.anInt7559 = local175;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static405.aClass3_Sub3_Sub1_1.anInt7553) {
						if (Static405.aClass3_Sub3_Sub1_1.anInt7553 == 0 && Static416.anInt7067 != -1) {
							Static434.method6090(Static416.anInt7067, Static287.aClass322_120, local175);
							Static6.aBoolean1 = false;
						} else if (local175 == 0) {
							Static524.method7017();
							Static6.aBoolean1 = false;
						} else {
							Static390.method5744(local175);
						}
						Static405.aClass3_Sub3_Sub1_1.anInt7553 = local175;
					}
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6020) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static405.aClass3_Sub3_Sub1_1.anInt7577 = local175;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6021) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean598 = anIntArray296[--anInt5315] == 1;
					Static286.method4255();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray296[--anInt5315];
					local1496 = false;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 2) {
						local175 = 2;
					}
					if (Static350.anInt6083 < 96) {
						local175 = 0;
						local1496 = true;
					}
					Static213.method6528(local175);
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					anIntArray296[anInt5315++] = local1496 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static405.aClass3_Sub3_Sub1_1.anInt7565 = local175;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					return;
				}
				if (arg0 == 6025) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0 || local175 > Static53.method844(Static350.anInt6083)) {
						local175 = 0;
					}
					Static405.aClass3_Sub3_Sub1_1.anInt7571 = local175;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static228.method3543(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean587 = anIntArray296[--anInt5315] != 0;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					return;
				}
				if (arg0 == 6029) {
					Static405.aClass3_Sub3_Sub1_1.anInt7576 = anIntArray296[--anInt5315];
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					return;
				}
				if (arg0 == 6030) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean588 = anIntArray296[--anInt5315] != 0;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static444.method6194();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static486.method6610(local175);
					return;
				}
				if (arg0 == 6032) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static405.aClass3_Sub3_Sub1_1.anInt7562 = local175;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6033) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0 || local175 > 4) {
						local175 = 2;
					}
					Static405.aClass3_Sub3_Sub1_1.anInt7568 = local175;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					return;
				}
				if (arg0 == 6034) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean579 = anIntArray296[--anInt5315] == 1;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static563.method7599();
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6035) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean597 = anIntArray296[--anInt5315] == 1;
					Static444.method6194();
					Static286.method4255();
					return;
				}
				if (arg0 == 6036) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static405.aClass3_Sub3_Sub1_1.method6303(local175);
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					return;
				}
				if (arg0 == 6037) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static405.aClass3_Sub3_Sub1_1.anInt7561 = local175;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray296[--anInt5315];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static405.aClass3_Sub3_Sub1_1.anInt7555 && Static416.anInt7067 == Static591.anInt9673) {
						if (Static405.aClass3_Sub3_Sub1_1.anInt7555 == 0) {
							Static434.method6090(Static416.anInt7067, Static287.aClass322_120, local175);
							Static6.aBoolean1 = false;
						} else if (local175 == 0) {
							Static524.method7017();
							Static6.aBoolean1 = false;
						} else {
							Static390.method5744(local175);
						}
					}
					Static405.aClass3_Sub3_Sub1_1.anInt7555 = local175;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray296[--anInt5315];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static405.aClass3_Sub3_Sub1_1.anInt7551) {
						Static405.aClass3_Sub3_Sub1_1.anInt7551 = local175;
						Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
						Static206.aBoolean283 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7552;
					return;
				}
				if (arg0 == 6102) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.method6315(Static60.anInt1312) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean585 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean591 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean581 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7576;
					return;
				}
				if (arg0 == 6108) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean583 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean590 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean576 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.method6299(Static60.anInt1312);
					return;
				}
				if (arg0 == 6112) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.method6297(Static60.anInt1312) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean589 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean584 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7557;
					return;
				}
				if (arg0 == 6117) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean586 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7559;
					return;
				}
				if (arg0 == 6119) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7553;
					return;
				}
				if (arg0 == 6120) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7577;
					return;
				}
				if (arg0 == 6121) {
					anIntArray296[anInt5315++] = Static505.aClass45_11.method7389() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray296[anInt5315++] = Static562.method7589();
					return;
				}
				if (arg0 == 6124) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7565;
					return;
				}
				if (arg0 == 6125) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7571;
					return;
				}
				if (arg0 == 6126) {
					anIntArray296[anInt5315++] = Static505.aClass45_11.method7433() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean580 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean587 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7576;
					return;
				}
				if (arg0 == 6130) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean588 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray296[anInt5315++] = Static60.anInt1312;
					return;
				}
				if (arg0 == 6132) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7562;
					return;
				}
				if (arg0 == 6133) {
					anIntArray296[anInt5315++] = Static237.aClass258_3.aBoolean524 && !Static237.aClass258_3.aBoolean523 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray296[anInt5315++] = Static53.method844(Static350.anInt6083);
					return;
				}
				if (arg0 == 6135) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7568;
					return;
				}
				if (arg0 == 6136) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean579 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6352) boolean local6352 = true;
					try {
						local6352 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6362) Throwable local6362) {
					}
					anIntArray296[anInt5315++] = local6352 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray296[anInt5315++] = Static311.method4560(200, Static60.anInt1312);
					return;
				}
				if (arg0 == 6139) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.method6310(Static60.anInt1312);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6410) byte local6410 = 0;
					if (Static477.method6558(Static60.anInt1312) && Static350.anInt6083 < 96) {
						local6410 = 1;
					}
					anIntArray296[anInt5315++] = local6410;
					return;
				}
				if (arg0 == 6141) {
					if (Static350.anInt6083 < 96) {
						anIntArray296[anInt5315++] = 0;
						return;
					}
					anIntArray296[anInt5315++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7561;
					return;
				}
				if (arg0 == 6143) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7555;
					return;
				}
				if (arg0 == 6144) {
					anIntArray296[anInt5315++] = Static472.aBoolean612 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7551;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt5315 -= 2;
					Static50.aShort3 = (short) anIntArray296[anInt5315];
					if (Static50.aShort3 <= 0) {
						Static50.aShort3 = 256;
					}
					Static177.aShort43 = (short) anIntArray296[anInt5315 + 1];
					if (Static177.aShort43 <= 0) {
						Static177.aShort43 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt5315 -= 2;
					Static282.aShort77 = (short) anIntArray296[anInt5315];
					if (Static282.aShort77 <= 0) {
						Static282.aShort77 = 256;
					}
					Static87.aShort83 = (short) anIntArray296[anInt5315 + 1];
					if (Static87.aShort83 <= 0) {
						Static87.aShort83 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt5315 -= 4;
					Static277.aShort76 = (short) anIntArray296[anInt5315];
					if (Static277.aShort76 <= 0) {
						Static277.aShort76 = 1;
					}
					Static389.aShort2 = (short) anIntArray296[anInt5315 + 1];
					if (Static389.aShort2 <= 0) {
						Static389.aShort2 = 32767;
					} else if (Static389.aShort2 < Static277.aShort76) {
						Static389.aShort2 = Static277.aShort76;
					}
					Static104.aShort27 = (short) anIntArray296[anInt5315 + 2];
					if (Static104.aShort27 <= 0) {
						Static104.aShort27 = 1;
					}
					Static450.aShort143 = (short) anIntArray296[anInt5315 + 3];
					if (Static450.aShort143 <= 0) {
						Static450.aShort143 = 32767;
						return;
					}
					if (Static450.aShort143 < Static104.aShort27) {
						Static450.aShort143 = Static104.aShort27;
					}
					return;
				}
				if (arg0 == 6203) {
					Static189.method3212(0, false, Static159.aClass361_3.anInt9650, 0, Static159.aClass361_3.anInt9668);
					anIntArray296[anInt5315++] = Static111.anInt8659;
					anIntArray296[anInt5315++] = Static569.anInt3538;
					return;
				}
				if (arg0 == 6204) {
					anIntArray296[anInt5315++] = Static282.aShort77;
					anIntArray296[anInt5315++] = Static87.aShort83;
					return;
				}
				if (arg0 == 6205) {
					anIntArray296[anInt5315++] = Static50.aShort3;
					anIntArray296[anInt5315++] = Static177.aShort43;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray296[anInt5315++] = (int) (Static158.method2936() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray296[anInt5315++] = (int) (Static158.method2936() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt5315 -= 3;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local97, local776, local175);
					local103 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray296[anInt5315++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static158.method2936()));
					anIntArray296[anInt5315++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray296[--anInt5315];
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
					anIntArray296[anInt5315++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray296[anInt5315++] = Static265.method4044() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray296[anInt5315++] = Static414.method5926() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static32.anInt602 == 7 && Static407.anInt7011 == 0 && Static126.anInt2887 == 0) {
						if (Static209.aBoolean287) {
							anIntArray296[anInt5315++] = 0;
							return;
						}
						if (Static313.aLong147 > Static158.method2936() - 1000L) {
							anIntArray296[anInt5315++] = 1;
							return;
						}
						Static209.aBoolean287 = true;
						local52 = Static591.method7910(Static9.aClass199_3, Static325.aClass303_62);
						local52.aClass3_Sub11_Sub1_1.method5215(Static64.anInt1498);
						Static511.method6885(local52);
						anIntArray296[anInt5315++] = 0;
						return;
					}
					anIntArray296[anInt5315++] = 1;
					return;
				}
				@Pc(7033) Class163 local7033;
				@Pc(7000) Class119_Sub1 local7000;
				if (arg0 == 6501) {
					local7000 = Static593.method7930();
					if (local7000 != null) {
						anIntArray296[anInt5315++] = local7000.anInt3548;
						anIntArray296[anInt5315++] = local7000.anInt3539;
						aStringArray22[anInt5308++] = local7000.aString21;
						local7033 = local7000.method3168();
						anIntArray296[anInt5315++] = local7033.anInt4533;
						aStringArray22[anInt5308++] = local7033.aString28;
						anIntArray296[anInt5315++] = local7000.anInt3540;
						anIntArray296[anInt5315++] = local7000.anInt3547;
						aStringArray22[anInt5308++] = local7000.aString20;
						return;
					}
					anIntArray296[anInt5315++] = -1;
					anIntArray296[anInt5315++] = 0;
					aStringArray22[anInt5308++] = "";
					anIntArray296[anInt5315++] = 0;
					aStringArray22[anInt5308++] = "";
					anIntArray296[anInt5315++] = 0;
					anIntArray296[anInt5315++] = 0;
					aStringArray22[anInt5308++] = "";
					return;
				}
				if (arg0 == 6502) {
					local7000 = Static460.method5154();
					if (local7000 != null) {
						anIntArray296[anInt5315++] = local7000.anInt3548;
						anIntArray296[anInt5315++] = local7000.anInt3539;
						aStringArray22[anInt5308++] = local7000.aString21;
						local7033 = local7000.method3168();
						anIntArray296[anInt5315++] = local7033.anInt4533;
						aStringArray22[anInt5308++] = local7033.aString28;
						anIntArray296[anInt5315++] = local7000.anInt3540;
						anIntArray296[anInt5315++] = local7000.anInt3547;
						aStringArray22[anInt5308++] = local7000.aString20;
						return;
					}
					anIntArray296[anInt5315++] = -1;
					anIntArray296[anInt5315++] = 0;
					aStringArray22[anInt5308++] = "";
					anIntArray296[anInt5315++] = 0;
					aStringArray22[anInt5308++] = "";
					anIntArray296[anInt5315++] = 0;
					anIntArray296[anInt5315++] = 0;
					aStringArray22[anInt5308++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray296[--anInt5315];
					local89 = aStringArray22[--anInt5308];
					if (Static32.anInt602 == 7 && Static407.anInt7011 == 0 && Static126.anInt2887 == 0) {
						anIntArray296[anInt5315++] = Static323.method4687(local175, local89) ? 1 : 0;
						return;
					}
					anIntArray296[anInt5315++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static405.aClass3_Sub3_Sub1_1.anInt7574 = anIntArray296[--anInt5315];
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					return;
				}
				if (arg0 == 6505) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7574;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray296[--anInt5315];
					@Pc(7390) Class119_Sub1 local7390 = Static368.method5399(local175);
					if (local7390 != null) {
						anIntArray296[anInt5315++] = local7390.anInt3539;
						aStringArray22[anInt5308++] = local7390.aString21;
						@Pc(7414) Class163 local7414 = local7390.method3168();
						anIntArray296[anInt5315++] = local7414.anInt4533;
						aStringArray22[anInt5308++] = local7414.aString28;
						anIntArray296[anInt5315++] = local7390.anInt3540;
						anIntArray296[anInt5315++] = local7390.anInt3547;
						aStringArray22[anInt5308++] = local7390.aString20;
						return;
					}
					anIntArray296[anInt5315++] = -1;
					aStringArray22[anInt5308++] = "";
					anIntArray296[anInt5315++] = 0;
					aStringArray22[anInt5308++] = "";
					anIntArray296[anInt5315++] = 0;
					anIntArray296[anInt5315++] = 0;
					aStringArray22[anInt5308++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt5315 -= 4;
					local175 = anIntArray296[anInt5315];
					local1496 = anIntArray296[anInt5315 + 1] == 1;
					local97 = anIntArray296[anInt5315 + 2];
					local2107 = anIntArray296[anInt5315 + 3] == 1;
					Static434.method6089(local97, local2107, local1496, local175);
					return;
				}
				if (arg0 == 6508) {
					Static34.method545();
					return;
				}
				if (arg0 == 6509) {
					if (Static32.anInt602 != 7) {
						return;
					}
					Static292.aBoolean365 = anIntArray296[--anInt5315] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray296[anInt5315++] = Static503.anInt8181;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean577 = anIntArray296[--anInt5315] == 1;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					return;
				}
				if (arg0 == 6601) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.aBoolean577 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static180.aClass183_4 == Static355.aClass183_6) {
				if (arg0 == 6700) {
					local175 = Static216.aClass354_18.method7688();
					if (Static353.anInt6188 != -1) {
						local175++;
					}
					anIntArray296[anInt5315++] = local175;
					return;
				}
				if (arg0 == 6701) {
					local175 = anIntArray296[--anInt5315];
					if (Static353.anInt6188 != -1) {
						if (local175 == 0) {
							anIntArray296[anInt5315++] = Static353.anInt6188;
							return;
						}
						local175--;
					}
					@Pc(7701) Class3_Sub49 local7701 = (Class3_Sub49) Static216.aClass354_18.method7694();
					while (local175-- > 0) {
						local7701 = (Class3_Sub49) Static216.aClass354_18.method7692();
					}
					anIntArray296[anInt5315++] = local7701.anInt8836;
					return;
				}
				if (arg0 == 6702) {
					local175 = anIntArray296[--anInt5315];
					if (Static380.aClass361ArrayArray2[local175] == null) {
						aStringArray22[anInt5308++] = "";
						return;
					}
					local89 = Static380.aClass361ArrayArray2[local175][0].aString98;
					if (local89 == null) {
						aStringArray22[anInt5308++] = "";
						return;
					}
					aStringArray22[anInt5308++] = local89.substring(0, local89.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local175 = anIntArray296[--anInt5315];
					if (Static380.aClass361ArrayArray2[local175] == null) {
						anIntArray296[anInt5315++] = 0;
						return;
					}
					anIntArray296[anInt5315++] = Static380.aClass361ArrayArray2[local175].length;
					return;
				}
				if (arg0 == 6704) {
					anInt5315 -= 2;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					if (Static380.aClass361ArrayArray2[local175] == null) {
						aStringArray22[anInt5308++] = "";
						return;
					}
					local181 = Static380.aClass361ArrayArray2[local175][local776].aString98;
					if (local181 == null) {
						aStringArray22[anInt5308++] = "";
						return;
					}
					aStringArray22[anInt5308++] = local181;
					return;
				}
				if (arg0 == 6705) {
					anInt5315 -= 2;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					if (Static380.aClass361ArrayArray2[local175] == null) {
						anIntArray296[anInt5315++] = 0;
						return;
					}
					anIntArray296[anInt5315++] = Static380.aClass361ArrayArray2[local175][local776].anInt9654;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt5315 -= 3;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					Static470.method6498(local175 << 16 | local776, 1, "", local97);
					return;
				}
				if (arg0 == 6708) {
					anInt5315 -= 3;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					Static470.method6498(local175 << 16 | local776, 2, "", local97);
					return;
				}
				if (arg0 == 6709) {
					anInt5315 -= 3;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					Static470.method6498(local175 << 16 | local776, 3, "", local97);
					return;
				}
				if (arg0 == 6710) {
					anInt5315 -= 3;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					Static470.method6498(local175 << 16 | local776, 4, "", local97);
					return;
				}
				if (arg0 == 6711) {
					anInt5315 -= 3;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					Static470.method6498(local175 << 16 | local776, 5, "", local97);
					return;
				}
				if (arg0 == 6712) {
					anInt5315 -= 3;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					Static470.method6498(local175 << 16 | local776, 6, "", local97);
					return;
				}
				if (arg0 == 6713) {
					anInt5315 -= 3;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					Static470.method6498(local175 << 16 | local776, 7, "", local97);
					return;
				}
				if (arg0 == 6714) {
					anInt5315 -= 3;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					Static470.method6498(local175 << 16 | local776, 8, "", local97);
					return;
				}
				if (arg0 == 6715) {
					anInt5315 -= 3;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					Static470.method6498(local175 << 16 | local776, 9, "", local97);
					return;
				}
				if (arg0 == 6716) {
					anInt5315 -= 3;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					Static470.method6498(local175 << 16 | local776, 10, "", local97);
					return;
				}
				if (arg0 == 6717) {
					anInt5315 -= 3;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					local97 = anIntArray296[anInt5315 + 2];
					@Pc(8289) Class361 local8289 = Static556.method7352(local175 << 16 | local776, local97);
					Static296.method4392();
					@Pc(8294) Class3_Sub36 local8294 = Static71.method1520(local8289);
					Static463.method6426(local8289, local8294.method5121(), local8294.anInt6062);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8322) Class174 local8322;
				if (arg0 == 6800) {
					local175 = anIntArray296[--anInt5315];
					local8322 = Static39.aClass102_1.method2925(local175);
					if (local8322.aString30 == null) {
						aStringArray22[anInt5308++] = "";
						return;
					}
					aStringArray22[anInt5308++] = local8322.aString30;
					return;
				}
				if (arg0 == 6801) {
					local175 = anIntArray296[--anInt5315];
					local8322 = Static39.aClass102_1.method2925(local175);
					anIntArray296[anInt5315++] = local8322.anInt4772;
					return;
				}
				if (arg0 == 6802) {
					local175 = anIntArray296[--anInt5315];
					local8322 = Static39.aClass102_1.method2925(local175);
					anIntArray296[anInt5315++] = local8322.anInt4787;
					return;
				}
				if (arg0 == 6803) {
					local175 = anIntArray296[--anInt5315];
					local8322 = Static39.aClass102_1.method2925(local175);
					anIntArray296[anInt5315++] = local8322.anInt4760;
					return;
				}
				if (arg0 == 6804) {
					anInt5315 -= 2;
					local175 = anIntArray296[anInt5315];
					local776 = anIntArray296[anInt5315 + 1];
					@Pc(8444) Class10 local8444 = Static137.aClass124_1.method3255(local776);
					if (local8444.method151()) {
						aStringArray22[anInt5308++] = Static39.aClass102_1.method2925(local175).method4112(local776, local8444.aString1);
						return;
					}
					anIntArray296[anInt5315++] = Static39.aClass102_1.method2925(local175).method4114(local776, local8444.anInt193);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray296[anInt5315++] = Static297.aBoolean376 && !Static559.aBoolean709 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray296[anInt5315++] = Static550.anInt8759;
					return;
				}
				if (arg0 == 6902) {
					anIntArray296[anInt5315++] = Static37.anInt1628;
					return;
				}
				if (arg0 == 6903) {
					anIntArray296[anInt5315++] = Static463.anInt7727;
					return;
				}
				if (arg0 == 6904) {
					anIntArray296[anInt5315++] = Static136.anInt2960;
					return;
				}
				if (arg0 == 6905) {
					local83 = "";
					if (Static446.aClass39_5 != null) {
						if (Static446.aClass39_5.anObject2 == null) {
							local83 = Static14.method209(Static446.aClass39_5.anInt893);
						} else {
							local83 = (String) Static446.aClass39_5.anObject2;
						}
					}
					aStringArray22[anInt5308++] = local83;
					return;
				}
				if (arg0 == 6906) {
					anIntArray296[anInt5315++] = Static269.anInt4733;
					return;
				}
				if (arg0 == 6907) {
					anIntArray296[anInt5315++] = Static65.anInt1510;
					return;
				}
				if (arg0 == 6908) {
					anIntArray296[anInt5315++] = Static591.anInt9676;
					return;
				}
				if (arg0 == 6909) {
					anIntArray296[anInt5315++] = Static365.aBoolean456 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray296[anInt5315++] = Static423.anInt7194;
					return;
				}
				if (arg0 == 6911) {
					anIntArray296[anInt5315++] = Static269.anInt4731;
					return;
				}
				if (arg0 == 6912) {
					anIntArray296[anInt5315++] = Static472.anInt7818;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local175 = Static405.aClass3_Sub3_Sub1_1.method6305();
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7592 = Static60.anInt1312;
					anIntArray296[anInt5315++] = local175;
					Static444.method6194();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 7001) {
					Static405.aClass3_Sub3_Sub1_1.method6319();
					Static444.method6194();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 7002) {
					Static405.aClass3_Sub3_Sub1_1.method6306();
					Static444.method6194();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 7003) {
					Static405.aClass3_Sub3_Sub1_1.method6307();
					Static444.method6194();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 7004) {
					Static405.aClass3_Sub3_Sub1_1.method6314(true);
					Static444.method6194();
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 7005) {
					Static405.aClass3_Sub3_Sub1_1.anInt7572 = 0;
					Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
					Static206.aBoolean283 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static405.aClass3_Sub3_Sub1_1.anInt7592 == 2) {
						Static405.aClass3_Sub3_Sub1_1.aBoolean595 = true;
						return;
					}
					if (Static405.aClass3_Sub3_Sub1_1.anInt7592 == 1) {
						Static405.aClass3_Sub3_Sub1_1.aBoolean596 = true;
						return;
					}
					if (Static405.aClass3_Sub3_Sub1_1.anInt7592 == 3) {
						Static405.aClass3_Sub3_Sub1_1.lb = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray296[anInt5315++] = Static405.aClass3_Sub3_Sub1_1.anInt7572;
					return;
				}
				if (arg0 == 7008) {
					if (Static60.anInt1312 == 0 && Static350.anInt6083 < 96) {
						anIntArray296[anInt5315++] = 1;
						return;
					}
					anIntArray296[anInt5315++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4564(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static500.anInt8114 == 0 && (Static297.aBoolean376 && !Static559.aBoolean709 || Static450.aBoolean734)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static544.aClass343_51.method7222(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static544.aClass343_51.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_52.method7222(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static544.aClass343_52.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_53.method7222(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static544.aClass343_53.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_54.method7222(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static544.aClass343_54.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_55.method7222(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static544.aClass343_55.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_56.method7222(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static544.aClass343_56.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_57.method7222(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static544.aClass343_57.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_58.method7222(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static544.aClass343_58.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_59.method7222(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static544.aClass343_59.method7222(0).length());
		} else if (local11.startsWith(Class343.lb.method7222(0))) {
			local13 = 9;
			arg0 = arg0.substring(Class343.lb.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_60.method7222(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static544.aClass343_60.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_61.method7222(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static544.aClass343_61.method7222(0).length());
		} else if (Static256.anInt4535 != 0) {
			if (local11.startsWith(Static544.aClass343_51.method7222(Static256.anInt4535))) {
				local13 = 0;
				arg0 = arg0.substring(Static544.aClass343_51.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_52.method7222(Static256.anInt4535))) {
				local13 = 1;
				arg0 = arg0.substring(Static544.aClass343_52.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_53.method7222(Static256.anInt4535))) {
				local13 = 2;
				arg0 = arg0.substring(Static544.aClass343_53.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_54.method7222(Static256.anInt4535))) {
				local13 = 3;
				arg0 = arg0.substring(Static544.aClass343_54.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_55.method7222(Static256.anInt4535))) {
				local13 = 4;
				arg0 = arg0.substring(Static544.aClass343_55.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_56.method7222(Static256.anInt4535))) {
				local13 = 5;
				arg0 = arg0.substring(Static544.aClass343_56.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_57.method7222(Static256.anInt4535))) {
				local13 = 6;
				arg0 = arg0.substring(Static544.aClass343_57.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_58.method7222(Static256.anInt4535))) {
				local13 = 7;
				arg0 = arg0.substring(Static544.aClass343_58.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_59.method7222(Static256.anInt4535))) {
				local13 = 8;
				arg0 = arg0.substring(Static544.aClass343_59.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Class343.lb.method7222(Static256.anInt4535))) {
				local13 = 9;
				arg0 = arg0.substring(Class343.lb.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_60.method7222(Static256.anInt4535))) {
				local13 = 10;
				arg0 = arg0.substring(Static544.aClass343_60.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_61.method7222(Static256.anInt4535))) {
				local13 = 11;
				arg0 = arg0.substring(Static544.aClass343_61.method7222(Static256.anInt4535).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static544.aClass343_62.method7222(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static544.aClass343_62.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_63.method7222(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static544.aClass343_63.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_64.method7222(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static544.aClass343_64.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_65.method7222(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static544.aClass343_65.method7222(0).length());
		} else if (local11.startsWith(Static544.aClass343_66.method7222(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static544.aClass343_66.method7222(0).length());
		} else if (Static256.anInt4535 != 0) {
			if (local11.startsWith(Static544.aClass343_62.method7222(Static256.anInt4535))) {
				local451 = 1;
				arg0 = arg0.substring(Static544.aClass343_62.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_63.method7222(Static256.anInt4535))) {
				local451 = 2;
				arg0 = arg0.substring(Static544.aClass343_63.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_64.method7222(Static256.anInt4535))) {
				local451 = 3;
				arg0 = arg0.substring(Static544.aClass343_64.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_65.method7222(Static256.anInt4535))) {
				local451 = 4;
				arg0 = arg0.substring(Static544.aClass343_65.method7222(Static256.anInt4535).length());
			} else if (local11.startsWith(Static544.aClass343_66.method7222(Static256.anInt4535))) {
				local451 = 5;
				arg0 = arg0.substring(Static544.aClass343_66.method7222(Static256.anInt4535).length());
			}
		}
		@Pc(641) Class3_Sub42 local641 = Static591.method7910(Static9.aClass199_3, Static341.aClass303_65);
		local641.aClass3_Sub11_Sub1_1.method5213(0);
		@Pc(650) int local650 = local641.aClass3_Sub11_Sub1_1.anInt6128;
		local641.aClass3_Sub11_Sub1_1.method5213(local13);
		local641.aClass3_Sub11_Sub1_1.method5213(local451);
		Static337.method4789(arg0, local641.aClass3_Sub11_Sub1_1);
		local641.aClass3_Sub11_Sub1_1.method5197(local641.aClass3_Sub11_Sub1_1.anInt6128 - local650);
		Static511.method6885(local641);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
	private static void method4565(@OriginalArg(0) int arg0) {
		@Pc(3) Class361 local3 = Static265.method4040(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class361[] local13 = Static259.aClass361ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class361[] local19 = Static380.aClass361ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static259.aClass361ArrayArray1[local9] = new Class361[local22];
			Static601.method2819(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static601.method2819(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!kc;)V")
	public static void method4566(@OriginalArg(0) Class3_Sub32 arg0) {
		method4567(arg0, 200000);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!kc;I)V")
	private static void method4567(@OriginalArg(0) Class3_Sub32 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub7_Sub3 local12 = Static542.method7211(local8);
		if (local12 == null) {
			return;
		}
		anIntArray297 = new int[local12.anInt1033];
		@Pc(21) int local21 = 0;
		aStringArray23 = new String[local12.anInt1032];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt4748;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt4750;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass361_6 == null ? -1 : arg0.aClass361_6.anInt9594;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt4753;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass361_6 == null ? -1 : arg0.aClass361_6.anInt9608;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass361_7 == null ? -1 : arg0.aClass361_7.anInt9594;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass361_7 == null ? -1 : arg0.aClass361_7.anInt9608;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt4752;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt4749;
				}
				anIntArray297[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString29;
				}
				aStringArray23[local27++] = local135;
			}
		}
		anInt5316 = arg0.anInt4754;
		method4569(local12, arg1);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "()V")
	public static void method4568() {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!bu;I)V")
	private static void method4569(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1) {
		anInt5315 = 0;
		anInt5308 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray46;
		@Pc(11) int[] local11 = arg0.anIntArray45;
		@Pc(13) byte local13 = -1;
		anInt5303 = 0;
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
						method4572(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method4563(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray296[anInt5315++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray296[anInt5315++] = Static491.aClass318_1.anIntArray519[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static491.aClass318_1.method6740(local54, anIntArray296[--anInt5315]);
					} else if (local31 == 3) {
						aStringArray22[anInt5308++] = arg0.aStringArray3[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt5315 -= 2;
						if (anIntArray296[anInt5315] != anIntArray296[anInt5315 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt5315 -= 2;
						if (anIntArray296[anInt5315] == anIntArray296[anInt5315 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt5315 -= 2;
						if (anIntArray296[anInt5315] < anIntArray296[anInt5315 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt5315 -= 2;
						if (anIntArray296[anInt5315] > anIntArray296[anInt5315 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt5303 == 0) {
							return;
						}
						@Pc(216) Class337 local216 = aClass337Array1[--anInt5303];
						arg0 = local216.aClass3_Sub7_Sub3_1;
						local8 = arg0.anIntArray46;
						local11 = arg0.anIntArray45;
						local5 = local216.anInt8533;
						anIntArray297 = local216.anIntArray559;
						aStringArray23 = local216.aStringArray37;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray296[anInt5315++] = Static491.aClass318_1.method6736(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static491.aClass318_1.method6743(anIntArray296[--anInt5315], local54);
					} else if (local31 == 31) {
						anInt5315 -= 2;
						if (anIntArray296[anInt5315] <= anIntArray296[anInt5315 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt5315 -= 2;
						if (anIntArray296[anInt5315] >= anIntArray296[anInt5315 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray296[anInt5315++] = anIntArray297[local11[local5]];
					} else if (local31 == 34) {
						anIntArray297[local11[local5]] = anIntArray296[--anInt5315];
					} else if (local31 == 35) {
						aStringArray22[anInt5308++] = aStringArray23[local11[local5]];
					} else if (local31 == 36) {
						aStringArray23[local11[local5]] = aStringArray22[--anInt5308];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt5308 -= local54;
						@Pc(400) String local400 = Static148.method2831(anInt5308, local54, aStringArray22);
						aStringArray22[anInt5308++] = local400;
					} else if (local31 == 38) {
						anInt5315--;
					} else if (local31 == 39) {
						anInt5308--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class3_Sub7_Sub3 local436 = Static542.method7211(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt1033];
							@Pc(450) String[] local450 = new String[local436.anInt1032];
							for (local452 = 0; local452 < local436.anInt1035; local452++) {
								local446[local452] = anIntArray296[anInt5315 + local452 - local436.anInt1035];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt1037; local471++) {
								local450[local471] = aStringArray22[anInt5308 + local471 - local436.anInt1037];
							}
							anInt5315 -= local436.anInt1035;
							anInt5308 -= local436.anInt1037;
							@Pc(502) Class337 local502 = new Class337();
							local502.aClass3_Sub7_Sub3_1 = arg0;
							local502.anInt8533 = local5;
							local502.anIntArray559 = anIntArray297;
							local502.aStringArray37 = aStringArray23;
							if (anInt5303 >= aClass337Array1.length) {
								throw new RuntimeException();
							}
							aClass337Array1[anInt5303++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray46;
							local11 = local436.anIntArray45;
							local5 = -1;
							anIntArray297 = local446;
							aStringArray23 = local450;
						} else if (local31 == 42) {
							anIntArray296[anInt5315++] = Static468.anIntArray497[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static468.anIntArray497[local54] = anIntArray296[--anInt5315];
							Static467.method6466(local54);
							Static11.aBoolean7 |= Static351.aBooleanArray21[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray296[--anInt5315];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray298[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray121[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray296[--anInt5315];
							if (local603 < 0 || local603 >= anIntArray298[local54]) {
								throw new RuntimeException();
							}
							anIntArray296[anInt5315++] = anIntArrayArray121[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt5315 -= 2;
							local603 = anIntArray296[anInt5315];
							if (local603 < 0 || local603 >= anIntArray298[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray121[local54][local603] = anIntArray296[anInt5315 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static137.aStringArray11[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray22[anInt5308++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static137.aStringArray11[local54] = aStringArray22[--anInt5308];
							Static77.method1599(local54);
						} else if (local31 == 51) {
							@Pc(774) Class354 local774 = arg0.aClass354Array1[local11[local5]];
							@Pc(787) Class3_Sub17 local787 = (Class3_Sub17) local774.method7689((long) anIntArray296[--anInt5315]);
							if (local787 != null) {
								local5 += local787.anInt3217;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString7 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong273).append(" ");
				for (local603 = anInt5303 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass337Array1[local603].aClass3_Sub7_Sub3_1.aLong273).append(" ");
				}
				local856.append("op: ").append(local13);
				Static172.method7826(local837, local856.toString());
			} else {
				Static550.method7295("Clientscript error in: " + arg0.aString7);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString7).append("\n");
				for (local603 = anInt5303 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass337Array1[local603].aClass3_Sub7_Sub3_1.aString7).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static172.method7826(local837, local856.toString());
				Static359.method5539(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
	private static void method4570(@OriginalArg(0) int arg0) {
		@Pc(3) Class361 local3 = Static265.method4040(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class361[] local13 = Static259.aClass361ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class361[] local19 = Static380.aClass361ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static259.aClass361ArrayArray1[local9] = new Class361[local22];
			Static601.method2819(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static601.method2819(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(IZ)V")
	private static void method4572(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class361 local137;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(35) Class361 local35;
		@Pc(210) Class361 local210;
		@Pc(13) int local13;
		@Pc(158) Class361 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt5315 -= 3;
				local13 = anIntArray296[anInt5315];
				local19 = anIntArray296[anInt5315 + 1];
				local25 = anIntArray296[anInt5315 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static265.method4040(local13);
				if (local35.aClass361Array2 == null) {
					local35.aClass361Array2 = new Class361[local25 + 1];
				}
				if (local35.aClass361Array2.length <= local25) {
					@Pc(54) Class361[] local54 = new Class361[local25 + 1];
					for (local56 = 0; local56 < local35.aClass361Array2.length; local56++) {
						local54[local56] = local35.aClass361Array2[local56];
					}
					local35.aClass361Array2 = local54;
				}
				if (local25 > 0 && local35.aClass361Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class361 local99 = new Class361();
				local99.anInt9665 = local19;
				local99.anInt9663 = local99.anInt9594 = local35.anInt9594;
				local99.anInt9608 = local25;
				local35.aClass361Array2[local25] = local99;
				if (arg1) {
					aClass361_9 = local99;
				} else {
					aClass361_10 = local99;
				}
				Static186.method3170(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass361_9 : aClass361_10;
				if (local137.anInt9608 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static265.method4040(local137.anInt9594);
				local158.aClass361Array2[local137.anInt9608] = null;
				Static186.method3170(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static265.method4040(anIntArray296[--anInt5315]);
				local137.aClass361Array2 = null;
				Static186.method3170(local137);
				return;
			}
			if (arg0 == 200) {
				anInt5315 -= 2;
				local13 = anIntArray296[anInt5315];
				local19 = anIntArray296[anInt5315 + 1];
				local210 = Static556.method7352(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray296[anInt5315++] = 1;
					if (arg1) {
						aClass361_9 = local210;
						return;
					}
					aClass361_10 = local210;
					return;
				}
				anIntArray296[anInt5315++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray296[--anInt5315];
				local158 = Static265.method4040(local13);
				if (local158 != null) {
					anIntArray296[anInt5315++] = 1;
					if (arg1) {
						aClass361_9 = local158;
						return;
					}
					aClass361_10 = local158;
					return;
				}
				anIntArray296[anInt5315++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray296[--anInt5315];
				method4570(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray296[--anInt5315];
				method4565(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt5315 -= 2;
					local13 = anIntArray296[anInt5315];
					local19 = anIntArray296[anInt5315 + 1];
					for (local25 = 0; local25 < Static139.anIntArray137.length; local25++) {
						if (Static139.anIntArray137[local25] == local13) {
							Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1.method1909(local19, Static43.aClass23_1, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static459.anIntArray495.length; local353++) {
						if (Static459.anIntArray495[local353] == local13) {
							Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1.method1909(local19, Static43.aClass23_1, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt5315 -= 2;
					local13 = anIntArray296[anInt5315];
					local19 = anIntArray296[anInt5315 + 1];
					Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1.method1916(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray296[--anInt5315] != 0;
					Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1.method1920(local412);
					return;
				}
				if (arg0 == 411) {
					anInt5315 -= 2;
					local13 = anIntArray296[anInt5315];
					local19 = anIntArray296[anInt5315 + 1];
					Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1.method1911(local19, local13, Static6.aClass92_1);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static265.method4040(anIntArray296[--anInt5315]);
				} else {
					local137 = arg1 ? aClass361_9 : aClass361_10;
				}
				if (arg0 == 1000) {
					anInt5315 -= 4;
					local137.anInt9587 = anIntArray296[anInt5315];
					local137.anInt9600 = anIntArray296[anInt5315 + 1];
					local19 = anIntArray296[anInt5315 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray296[anInt5315 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte127 = (byte) local19;
					local137.aByte129 = (byte) local25;
					Static186.method3170(local137);
					Static252.method3883(local137);
					if (local137.anInt9608 == -1) {
						Static279.method7836(local137.anInt9594);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt5315 -= 4;
					local137.anInt9662 = anIntArray296[anInt5315];
					local137.anInt9605 = anIntArray296[anInt5315 + 1];
					local137.anInt9604 = 0;
					local137.anInt9658 = 0;
					local19 = anIntArray296[anInt5315 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray296[anInt5315 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte128 = (byte) local19;
					local137.aByte130 = (byte) local25;
					Static186.method3170(local137);
					Static252.method3883(local137);
					if (local137.anInt9665 == 0) {
						Static70.method1495(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray296[--anInt5315] == 1;
					if (local137.aBoolean761 != local645) {
						local137.aBoolean761 = local645;
						Static186.method3170(local137);
					}
					if (local137.anInt9608 == -1) {
						Static142.method2763(local137.anInt9594);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt5315 -= 2;
					local137.anInt9611 = anIntArray296[anInt5315];
					local137.anInt9584 = anIntArray296[anInt5315 + 1];
					Static186.method3170(local137);
					Static252.method3883(local137);
					if (local137.anInt9665 == 0) {
						Static70.method1495(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean757 = anIntArray296[--anInt5315] == 1;
					return;
				}
			} else {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static265.method4040(anIntArray296[--anInt5315]);
					} else {
						local137 = arg1 ? aClass361_9 : aClass361_10;
					}
					if (arg0 == 1100) {
						anInt5315 -= 2;
						local137.anInt9633 = anIntArray296[anInt5315];
						if (local137.anInt9633 > local137.anInt9595 - local137.anInt9668) {
							local137.anInt9633 = local137.anInt9595 - local137.anInt9668;
						}
						if (local137.anInt9633 < 0) {
							local137.anInt9633 = 0;
						}
						local137.anInt9655 = anIntArray296[anInt5315 + 1];
						if (local137.anInt9655 > local137.anInt9651 - local137.anInt9650) {
							local137.anInt9655 = local137.anInt9651 - local137.anInt9650;
						}
						if (local137.anInt9655 < 0) {
							local137.anInt9655 = 0;
						}
						Static186.method3170(local137);
						if (local137.anInt9608 == -1) {
							Static433.method6086(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt9593 = anIntArray296[--anInt5315];
						Static186.method3170(local137);
						if (local137.anInt9608 == -1) {
							Static171.method3053(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean758 = anIntArray296[--anInt5315] == 1;
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt9626 = anIntArray296[--anInt5315];
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt9640 = anIntArray296[--anInt5315];
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray296[--anInt5315];
						if (local137.anInt9635 != local19) {
							local137.anInt9635 = local19;
							Static186.method3170(local137);
						}
						if (local137.anInt9608 == -1) {
							Static309.method4522(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt9597 = anIntArray296[--anInt5315];
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean755 = anIntArray296[--anInt5315] == 1;
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt9582 = 1;
						local137.anInt9628 = anIntArray296[--anInt5315];
						Static186.method3170(local137);
						if (local137.anInt9608 == -1) {
							Static14.method212(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt5315 -= 6;
						local137.anInt9636 = anIntArray296[anInt5315];
						local137.anInt9622 = anIntArray296[anInt5315 + 1];
						local137.anInt9667 = anIntArray296[anInt5315 + 2];
						local137.anInt9639 = anIntArray296[anInt5315 + 3];
						local137.anInt9588 = anIntArray296[anInt5315 + 4];
						local137.anInt9615 = anIntArray296[anInt5315 + 5];
						Static186.method3170(local137);
						if (local137.anInt9608 == -1) {
							Static542.method7212(local137.anInt9594);
							Static478.method6563(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray296[--anInt5315];
						if (local137.lb != local19) {
							local137.lb = local19;
							local137.anInt9644 = 0;
							local137.anInt9664 = 1;
							local137.anInt9596 = 0;
							@Pc(1094) Class185 local1094 = local137.lb == -1 ? null : Static545.aClass240_2.method5680(local137.lb);
							if (local1094 != null) {
								Static407.method5864(local1094, local137.anInt9644);
							}
							Static186.method3170(local137);
						}
						if (local137.anInt9608 == -1) {
							Static22.method388(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean754 = anIntArray296[--anInt5315] == 1;
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray22[--anInt5308];
						if (!local1145.equals(local137.aString100)) {
							local137.aString100 = local1145;
							Static186.method3170(local137);
						}
						if (local137.anInt9608 == -1) {
							Static392.method5752(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt9648 = anIntArray296[--anInt5315];
						Static186.method3170(local137);
						if (local137.anInt9608 == -1) {
							Static465.method6441(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt5315 -= 3;
						local137.anInt9602 = anIntArray296[anInt5315];
						local137.anInt9592 = anIntArray296[anInt5315 + 1];
						local137.anInt9630 = anIntArray296[anInt5315 + 2];
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean759 = anIntArray296[--anInt5315] == 1;
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt9623 = anIntArray296[--anInt5315];
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt9653 = anIntArray296[--anInt5315];
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean763 = anIntArray296[--anInt5315] == 1;
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean752 = anIntArray296[--anInt5315] == 1;
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt5315 -= 2;
						local137.anInt9595 = anIntArray296[anInt5315];
						local137.anInt9651 = anIntArray296[anInt5315 + 1];
						Static186.method3170(local137);
						if (local137.anInt9665 == 0) {
							Static70.method1495(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean749 = anIntArray296[--anInt5315] == 1;
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt9615 = anIntArray296[--anInt5315];
						Static186.method3170(local137);
						if (local137.anInt9608 == -1) {
							Static542.method7212(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray296[--anInt5315];
						local137.aBoolean762 = local19 == 1;
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt5315 -= 2;
						local137.anInt9581 = anIntArray296[anInt5315];
						local137.anInt9625 = anIntArray296[anInt5315 + 1];
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt9598 = anIntArray296[--anInt5315];
						Static186.method3170(local137);
						return;
					}
					@Pc(1473) Class10 local1473;
					if (arg0 == 1127) {
						anInt5315 -= 2;
						local19 = anIntArray296[anInt5315];
						local25 = anIntArray296[anInt5315 + 1];
						local1473 = Static137.aClass124_1.method3255(local19);
						if (local25 != local1473.anInt193) {
							local137.method7898(local19, local25);
							return;
						}
						local137.method7889(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray296[--anInt5315];
						local1507 = aStringArray22[--anInt5308];
						local1473 = Static137.aClass124_1.method3255(local19);
						if (!local1473.aString1.equals(local1507)) {
							local137.method7893(local19, local1507);
							return;
						}
						local137.method7889(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2309) int local2309;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static265.method4040(anIntArray296[--anInt5315]);
							} else {
								local137 = arg1 ? aClass361_9 : aClass361_10;
							}
							if (arg0 == 1499) {
								local137.method7890();
								return;
							}
							local1145 = aStringArray22[--anInt5308];
							@Pc(2395) int[] local2395 = null;
							if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
								local353 = anIntArray296[--anInt5315];
								if (local353 > 0) {
									local2395 = new int[local353];
									while (local353-- > 0) {
										local2395[local353] = anIntArray296[--anInt5315];
									}
								}
								local1145 = local1145.substring(0, local1145.length() - 1);
							}
							@Pc(2447) Object[] local2447 = new Object[local1145.length() + 1];
							for (local2309 = local2447.length - 1; local2309 >= 1; local2309--) {
								if (local1145.charAt(local2309 - 1) == 's') {
									local2447[local2309] = aStringArray22[--anInt5308];
								} else {
									local2447[local2309] = Integer.valueOf(anIntArray296[--anInt5315]);
								}
							}
							local56 = anIntArray296[--anInt5315];
							if (local56 == -1) {
								local2447 = null;
							} else {
								local2447[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray26 = local2447;
							} else if (arg0 == 1401) {
								local137.anObjectArray28 = local2447;
							} else if (arg0 == 1402) {
								local137.anObjectArray33 = local2447;
							} else if (arg0 == 1403) {
								local137.anObjectArray19 = local2447;
							} else if (arg0 == 1404) {
								local137.anObjectArray9 = local2447;
							} else if (arg0 == 1405) {
								local137.anObjectArray32 = local2447;
							} else if (arg0 == 1406) {
								local137.anObjectArray15 = local2447;
							} else if (arg0 == 1407) {
								local137.anObjectArray13 = local2447;
								local137.anIntArray638 = local2395;
							} else if (arg0 == 1408) {
								local137.anObjectArray7 = local2447;
							} else if (arg0 == 1409) {
								local137.anObjectArray4 = local2447;
							} else if (arg0 == 1410) {
								local137.anObjectArray23 = local2447;
							} else if (arg0 == 1411) {
								local137.anObjectArray27 = local2447;
							} else if (arg0 == 1412) {
								local137.anObjectArray14 = local2447;
							} else if (arg0 == 1414) {
								local137.anObjectArray11 = local2447;
								local137.anIntArray634 = local2395;
							} else if (arg0 == 1415) {
								local137.anObjectArray21 = local2447;
								local137.anIntArray636 = local2395;
							} else if (arg0 == 1416) {
								local137.anObjectArray16 = local2447;
							} else if (arg0 == 1417) {
								local137.anObjectArray8 = local2447;
							} else if (arg0 == 1418) {
								local137.anObjectArray29 = local2447;
							} else if (arg0 == 1419) {
								local137.anObjectArray3 = local2447;
							} else if (arg0 == 1420) {
								local137.anObjectArray5 = local2447;
							} else if (arg0 == 1421) {
								local137.anObjectArray10 = local2447;
							} else if (arg0 == 1422) {
								local137.anObjectArray12 = local2447;
							} else if (arg0 == 1423) {
								local137.anObjectArray31 = local2447;
							} else if (arg0 == 1424) {
								local137.anObjectArray22 = local2447;
							} else if (arg0 == 1425) {
								local137.anObjectArray30 = local2447;
							} else if (arg0 == 1426) {
								local137.anObjectArray20 = local2447;
							} else if (arg0 == 1427) {
								local137.anObjectArray6 = local2447;
							} else if (arg0 == 1428) {
								local137.anObjectArray24 = local2447;
								local137.anIntArray637 = local2395;
							} else if (arg0 == 1429) {
								local137.anObjectArray25 = local2447;
								local137.anIntArray635 = local2395;
							} else if (arg0 == 1430) {
								local137.anObjectArray17 = local2447;
							}
							local137.aBoolean764 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass361_9 : aClass361_10;
							if (arg0 == 1500) {
								anIntArray296[anInt5315++] = local137.anInt9606;
								return;
							}
							if (arg0 == 1501) {
								anIntArray296[anInt5315++] = local137.anInt9659;
								return;
							}
							if (arg0 == 1502) {
								anIntArray296[anInt5315++] = local137.anInt9668;
								return;
							}
							if (arg0 == 1503) {
								anIntArray296[anInt5315++] = local137.anInt9650;
								return;
							}
							if (arg0 == 1504) {
								anIntArray296[anInt5315++] = local137.aBoolean761 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray296[anInt5315++] = local137.anInt9663;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static418.method5948(local137);
								anIntArray296[anInt5315++] = local158 == null ? -1 : local158.anInt9594;
								return;
							}
						} else {
							@Pc(3043) Class10 local3043;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass361_9 : aClass361_10;
								if (arg0 == 1600) {
									anIntArray296[anInt5315++] = local137.anInt9633;
									return;
								}
								if (arg0 == 1601) {
									anIntArray296[anInt5315++] = local137.anInt9655;
									return;
								}
								if (arg0 == 1602) {
									aStringArray22[anInt5308++] = local137.aString100;
									return;
								}
								if (arg0 == 1603) {
									anIntArray296[anInt5315++] = local137.anInt9595;
									return;
								}
								if (arg0 == 1604) {
									anIntArray296[anInt5315++] = local137.anInt9651;
									return;
								}
								if (arg0 == 1605) {
									anIntArray296[anInt5315++] = local137.anInt9615;
									return;
								}
								if (arg0 == 1606) {
									anIntArray296[anInt5315++] = local137.anInt9667;
									return;
								}
								if (arg0 == 1607) {
									anIntArray296[anInt5315++] = local137.anInt9588;
									return;
								}
								if (arg0 == 1608) {
									anIntArray296[anInt5315++] = local137.anInt9639;
									return;
								}
								if (arg0 == 1609) {
									anIntArray296[anInt5315++] = local137.anInt9626;
									return;
								}
								if (arg0 == 1610) {
									anIntArray296[anInt5315++] = local137.anInt9636;
									return;
								}
								if (arg0 == 1611) {
									anIntArray296[anInt5315++] = local137.anInt9622;
									return;
								}
								if (arg0 == 1612) {
									anIntArray296[anInt5315++] = local137.anInt9635;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray296[--anInt5315];
									local3043 = Static137.aClass124_1.method3255(local19);
									if (local3043.method151()) {
										aStringArray22[anInt5308++] = local137.method7887(local19, local3043.aString1);
										return;
									}
									anIntArray296[anInt5315++] = local137.method7896(local19, local3043.anInt193);
									return;
								}
								if (arg0 == 1614) {
									anIntArray296[anInt5315++] = local137.anInt9597;
									return;
								}
								if (arg0 == 2614) {
									anIntArray296[anInt5315++] = local137.anInt9582 == 1 ? local137.anInt9628 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass361_9 : aClass361_10;
								if (arg0 == 1700) {
									anIntArray296[anInt5315++] = local137.anInt9645;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt9645 != -1) {
										anIntArray296[anInt5315++] = local137.anInt9607;
										return;
									}
									anIntArray296[anInt5315++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray296[anInt5315++] = local137.anInt9608;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass361_9 : aClass361_10;
								if (arg0 == 1800) {
									anIntArray296[anInt5315++] = Static71.method1520(local137).method5121();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray296[--anInt5315];
									local19--;
									if (local137.aStringArray40 != null && local19 < local137.aStringArray40.length && local137.aStringArray40[local19] != null) {
										aStringArray22[anInt5308++] = local137.aStringArray40[local19];
										return;
									}
									aStringArray22[anInt5308++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString99 == null) {
										aStringArray22[anInt5308++] = "";
										return;
									}
									aStringArray22[anInt5308++] = local137.aString99;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static265.method4040(anIntArray296[--anInt5315]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass361_9 : aClass361_10;
								}
								if (anInt5316 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray6 == null) {
										return;
									}
									@Pc(3312) Class3_Sub32 local3312 = new Class3_Sub32();
									local3312.aClass361_6 = local137;
									local3312.anObjectArray1 = local137.anObjectArray6;
									local3312.anInt4754 = anInt5316 + 1;
									Static12.aClass112_54.method3079(local3312);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static265.method4040(anIntArray296[--anInt5315]);
								if (arg0 == 2500) {
									anIntArray296[anInt5315++] = local137.anInt9606;
									return;
								}
								if (arg0 == 2501) {
									anIntArray296[anInt5315++] = local137.anInt9659;
									return;
								}
								if (arg0 == 2502) {
									anIntArray296[anInt5315++] = local137.anInt9668;
									return;
								}
								if (arg0 == 2503) {
									anIntArray296[anInt5315++] = local137.anInt9650;
									return;
								}
								if (arg0 == 2504) {
									anIntArray296[anInt5315++] = local137.aBoolean761 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray296[anInt5315++] = local137.anInt9663;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static418.method5948(local137);
									anIntArray296[anInt5315++] = local158 == null ? -1 : local158.anInt9594;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static265.method4040(anIntArray296[--anInt5315]);
								if (arg0 == 2600) {
									anIntArray296[anInt5315++] = local137.anInt9633;
									return;
								}
								if (arg0 == 2601) {
									anIntArray296[anInt5315++] = local137.anInt9655;
									return;
								}
								if (arg0 == 2602) {
									aStringArray22[anInt5308++] = local137.aString100;
									return;
								}
								if (arg0 == 2603) {
									anIntArray296[anInt5315++] = local137.anInt9595;
									return;
								}
								if (arg0 == 2604) {
									anIntArray296[anInt5315++] = local137.anInt9651;
									return;
								}
								if (arg0 == 2605) {
									anIntArray296[anInt5315++] = local137.anInt9615;
									return;
								}
								if (arg0 == 2606) {
									anIntArray296[anInt5315++] = local137.anInt9667;
									return;
								}
								if (arg0 == 2607) {
									anIntArray296[anInt5315++] = local137.anInt9588;
									return;
								}
								if (arg0 == 2608) {
									anIntArray296[anInt5315++] = local137.anInt9639;
									return;
								}
								if (arg0 == 2609) {
									anIntArray296[anInt5315++] = local137.anInt9626;
									return;
								}
								if (arg0 == 2610) {
									anIntArray296[anInt5315++] = local137.anInt9636;
									return;
								}
								if (arg0 == 2611) {
									anIntArray296[anInt5315++] = local137.anInt9622;
									return;
								}
								if (arg0 == 2612) {
									anIntArray296[anInt5315++] = local137.anInt9635;
									return;
								}
								if (arg0 == 2613) {
									anIntArray296[anInt5315++] = local137.anInt9597;
									return;
								}
								if (arg0 == 2614) {
									anIntArray296[anInt5315++] = local137.anInt9582 == 1 ? local137.anInt9628 : -1;
									return;
								}
							} else {
								@Pc(3841) Class3_Sub49 local3841;
								@Pc(3739) Class3_Sub49 local3739;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static265.method4040(anIntArray296[--anInt5315]);
										anIntArray296[anInt5315++] = local137.anInt9645;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static265.method4040(anIntArray296[--anInt5315]);
										if (local137.anInt9645 != -1) {
											anIntArray296[anInt5315++] = local137.anInt9607;
											return;
										}
										anIntArray296[anInt5315++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray296[--anInt5315];
										local3739 = (Class3_Sub49) Static216.aClass354_18.method7689((long) local13);
										if (local3739 != null) {
											anIntArray296[anInt5315++] = 1;
											return;
										}
										anIntArray296[anInt5315++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static265.method4040(anIntArray296[--anInt5315]);
										if (local137.aClass361Array2 == null) {
											anIntArray296[anInt5315++] = 0;
											return;
										}
										local19 = local137.aClass361Array2.length;
										for (local25 = 0; local25 < local137.aClass361Array2.length; local25++) {
											if (local137.aClass361Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray296[anInt5315++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt5315 -= 2;
										local13 = anIntArray296[anInt5315];
										local19 = anIntArray296[anInt5315 + 1];
										local3841 = (Class3_Sub49) Static216.aClass354_18.method7689((long) local13);
										if (local3841 != null && local3841.anInt8836 == local19) {
											anIntArray296[anInt5315++] = 1;
											return;
										}
										anIntArray296[anInt5315++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static265.method4040(anIntArray296[--anInt5315]);
									if (arg0 == 2800) {
										anIntArray296[anInt5315++] = Static71.method1520(local137).method5121();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray296[--anInt5315];
										local19--;
										if (local137.aStringArray40 != null && local19 < local137.aStringArray40.length && local137.aStringArray40[local19] != null) {
											aStringArray22[anInt5308++] = local137.aStringArray40[local19];
											return;
										}
										aStringArray22[anInt5308++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString99 == null) {
											aStringArray22[anInt5308++] = "";
											return;
										}
										aStringArray22[anInt5308++] = local137.aString99;
										return;
									}
								} else {
									@Pc(3978) String local3978;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3978 = aStringArray22[--anInt5308];
											Static211.method3413(local3978);
											return;
										}
										if (arg0 == 3101) {
											anInt5315 -= 2;
											Static205.method3349(anIntArray296[anInt5315], anIntArray296[anInt5315 + 1], Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2);
											return;
										}
										if (arg0 == 3103) {
											Static286.method4256();
											return;
										}
										if (arg0 == 3104) {
											local3978 = aStringArray22[--anInt5308];
											local19 = 0;
											if (Static368.method5388(local3978)) {
												local19 = Static213.method6524(local3978);
											}
											@Pc(4038) Class3_Sub42 local4038 = Static591.method7910(Static9.aClass199_3, Static92.aClass303_24);
											local4038.aClass3_Sub11_Sub1_1.method5215(local19);
											Static511.method6885(local4038);
											return;
										}
										@Pc(4067) Class3_Sub42 local4067;
										if (arg0 == 3105) {
											local3978 = aStringArray22[--anInt5308];
											local4067 = Static591.method7910(Static9.aClass199_3, Static375.aClass303_69);
											local4067.aClass3_Sub11_Sub1_1.method5213(local3978.length() + 1);
											local4067.aClass3_Sub11_Sub1_1.method5227(local3978);
											Static511.method6885(local4067);
											return;
										}
										if (arg0 == 3106) {
											local3978 = aStringArray22[--anInt5308];
											local4067 = Static591.method7910(Static9.aClass199_3, Static355.aClass303_68);
											local4067.aClass3_Sub11_Sub1_1.method5213(local3978.length() + 1);
											local4067.aClass3_Sub11_Sub1_1.method5227(local3978);
											Static511.method6885(local4067);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray296[--anInt5315];
											local1145 = aStringArray22[--anInt5308];
											Static211.method3412(local1145, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt5315 -= 3;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local25 = anIntArray296[anInt5315 + 2];
											local35 = Static265.method4040(local25);
											Static98.method1814(local19, local35, local13);
											return;
										}
										if (arg0 == 3109) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local210 = arg1 ? aClass361_9 : aClass361_10;
											Static98.method1814(local19, local210, local13);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray296[--anInt5315];
											local4067 = Static591.method7910(Static9.aClass199_3, Static114.aClass303_32);
											local4067.aClass3_Sub11_Sub1_1.method5200(local13);
											Static511.method6885(local4067);
											return;
										}
										if (arg0 == 3111) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local3841 = (Class3_Sub49) Static216.aClass354_18.method7689((long) local13);
											if (local3841 != null) {
												Static250.method3868(local3841, true, local3841.anInt8836 != local19);
											}
											Static406.method5861(local19, true, 3, local13);
											return;
										}
										if (arg0 == 3112) {
											anInt5315--;
											local13 = anIntArray296[anInt5315];
											local3739 = (Class3_Sub49) Static216.aClass354_18.method7689((long) local13);
											if (local3739 != null && local3739.anInt8837 == 3) {
												Static250.method3868(local3739, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static576.method7737(aStringArray22[--anInt5308]);
											return;
										}
										if (arg0 == 3114) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local1507 = aStringArray22[--anInt5308];
											Static180.method3112(local1507, "", "", local19, local13, "");
											return;
										}
										if (arg0 == 3115) {
											anInt5315 -= 11;
											@Pc(4368) Class63[] local4368 = Static407.method5865();
											@Pc(4371) Class249[] local4371 = Static448.method7373();
											Static158.method2935(anIntArray296[anInt5315 + 7], anIntArray296[anInt5315 + 5], anIntArray296[anInt5315 + 10], anIntArray296[anInt5315 + 2], local4368[anIntArray296[anInt5315]], local4371[anIntArray296[anInt5315 + 1]], anIntArray296[anInt5315 + 3], anIntArray296[anInt5315 + 9], anIntArray296[anInt5315 + 8], anIntArray296[anInt5315 + 4], anIntArray296[anInt5315 + 6]);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt5315 -= 3;
											Static32.method540(255, anIntArray296[anInt5315], anIntArray296[anInt5315 + 2], anIntArray296[anInt5315 + 1]);
											return;
										}
										if (arg0 == 3201) {
											Static179.method3105(255, 50, anIntArray296[--anInt5315]);
											return;
										}
										if (arg0 == 3202) {
											anInt5315 -= 2;
											Static581.method6767(anIntArray296[anInt5315 + 1], anIntArray296[anInt5315], 255);
											return;
										}
										if (arg0 == 3203) {
											anInt5315 -= 4;
											Static32.method540(anIntArray296[anInt5315 + 3], anIntArray296[anInt5315], anIntArray296[anInt5315 + 2], anIntArray296[anInt5315 + 1]);
											return;
										}
										if (arg0 == 3204) {
											anInt5315 -= 3;
											Static179.method3105(anIntArray296[anInt5315 + 1], anIntArray296[anInt5315 + 2], anIntArray296[anInt5315]);
											return;
										}
										if (arg0 == 3205) {
											anInt5315 -= 3;
											Static581.method6767(anIntArray296[anInt5315 + 1], anIntArray296[anInt5315], anIntArray296[anInt5315 + 2]);
											return;
										}
										if (arg0 == 3206) {
											anInt5315 -= 4;
											Static39.method648(anIntArray296[anInt5315 + 3], anIntArray296[anInt5315 + 2], anIntArray296[anInt5315], anIntArray296[anInt5315 + 1], false);
											return;
										}
										if (arg0 == 3207) {
											anInt5315 -= 4;
											Static39.method648(anIntArray296[anInt5315 + 3], anIntArray296[anInt5315 + 2], anIntArray296[anInt5315], anIntArray296[anInt5315 + 1], true);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray296[anInt5315++] = Static506.anInt8251;
											return;
										}
										if (arg0 == 3301) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = Static305.method4614(local19, false, local13);
											return;
										}
										if (arg0 == 3302) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = Static364.method578(local13, false, local19);
											return;
										}
										if (arg0 == 3303) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = Static102.method1869(local19, false, local13);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static112.aClass157_1.method3677(local13).anInt3181;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static135.anIntArray134[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static320.anIntArray308[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static143.anIntArray141[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4825) byte local4825 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117;
											local19 = (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444 >> 9) + Static335.anInt5608;
											local25 = (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442 >> 9) + Static246.anInt4344;
											anIntArray296[anInt5315++] = (local4825 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray296[anInt5315++] = Static191.aBoolean273 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = Static305.method4614(local19, true, local13);
											return;
										}
										if (arg0 == 3314) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = Static364.method578(local13, true, local19);
											return;
										}
										if (arg0 == 3315) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = Static102.method1869(local19, true, local13);
											return;
										}
										if (arg0 == 3316) {
											if (Static500.anInt8114 >= 2) {
												anIntArray296[anInt5315++] = Static500.anInt8114;
												return;
											}
											anIntArray296[anInt5315++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray296[anInt5315++] = Static35.anInt636;
											return;
										}
										if (arg0 == 3318) {
											anIntArray296[anInt5315++] = Static221.aClass51_1.anInt1589;
											return;
										}
										if (arg0 == 3321) {
											anIntArray296[anInt5315++] = Static70.anInt1593;
											return;
										}
										if (arg0 == 3322) {
											anIntArray296[anInt5315++] = Static334.anInt5598;
											return;
										}
										if (arg0 == 3323) {
											if (Static54.anInt1039 >= 5 && Static54.anInt1039 <= 9) {
												anIntArray296[anInt5315++] = 1;
												return;
											}
											anIntArray296[anInt5315++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static54.anInt1039 >= 5 && Static54.anInt1039 <= 9) {
												anIntArray296[anInt5315++] = Static54.anInt1039;
												return;
											}
											anIntArray296[anInt5315++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray296[anInt5315++] = Static65.aBoolean118 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray296[anInt5315++] = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9571;
											return;
										}
										if (arg0 == 3327) {
											anIntArray296[anInt5315++] = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1.aBoolean170 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray296[anInt5315++] = Static450.aBoolean734 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static27.method2796(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = Static573.method7707(false, local13, local19);
											return;
										}
										if (arg0 == 3332) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = Static573.method7707(true, local13, local19);
											return;
										}
										if (arg0 == 3333) {
											anIntArray296[anInt5315++] = Static61.anInt1462;
											return;
										}
										if (arg0 == 3335) {
											anIntArray296[anInt5315++] = Static256.anInt4535;
											return;
										}
										if (arg0 == 3336) {
											anInt5315 -= 4;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local25 = anIntArray296[anInt5315 + 2];
											local353 = anIntArray296[anInt5315 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray296[anInt5315++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray296[anInt5315++] = Static535.anInt8570;
											return;
										}
										if (arg0 == 3338) {
											anIntArray296[anInt5315++] = Static363.method5169();
											return;
										}
										if (arg0 == 3339) {
											anIntArray296[anInt5315++] = Static270.aBoolean348 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray296[anInt5315++] = Static301.aBoolean389 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray296[anInt5315++] = Static400.aBoolean521 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray296[anInt5315++] = Static465.aClass86_1.method7267();
											return;
										}
										if (arg0 == 3343) {
											anIntArray296[anInt5315++] = Static465.aClass86_1.method7265();
											return;
										}
										if (arg0 == 3344) {
											aStringArray22[anInt5308++] = Static109.method1919();
											return;
										}
										if (arg0 == 3345) {
											aStringArray22[anInt5308++] = Static540.method7198();
											return;
										}
										if (arg0 == 3346) {
											anIntArray296[anInt5315++] = Static544.method7219();
											return;
										}
										if (arg0 == 3347) {
											anIntArray296[anInt5315++] = Static322.anInt5445;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5560) Class233 local5560;
										if (arg0 == 3400) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local5560 = Static584.aClass138_1.method3398(local13);
											aStringArray22[anInt5308++] = local5560.method5426(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt5315 -= 4;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local25 = anIntArray296[anInt5315 + 2];
											local353 = anIntArray296[anInt5315 + 3];
											@Pc(5606) Class233 local5606 = Static584.aClass138_1.method3398(local25);
											if (local5606.aChar4 == local13 && local5606.aChar5 == local19) {
												if (local19 == 115) {
													aStringArray22[anInt5308++] = local5606.method5426(local353);
													return;
												}
												anIntArray296[anInt5315++] = local5606.method5423(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt5315 -= 3;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local25 = anIntArray296[anInt5315 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5682) Class233 local5682 = Static584.aClass138_1.method3398(local19);
											if (local5682.aChar5 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray296[anInt5315++] = local5682.method5418(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray296[--anInt5315];
											local1145 = aStringArray22[--anInt5308];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5560 = Static584.aClass138_1.method3398(local13);
											if (local5560.aChar5 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray296[anInt5315++] = local5560.method5427(local1145) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray296[--anInt5315];
											@Pc(5780) Class233 local5780 = Static584.aClass138_1.method3398(local13);
											anIntArray296[anInt5315++] = local5780.aClass354_31.method7688();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static495.anInt8058 == 0) {
												anIntArray296[anInt5315++] = -2;
												return;
											}
											if (Static495.anInt8058 == 1) {
												anIntArray296[anInt5315++] = -1;
												return;
											}
											anIntArray296[anInt5315++] = Static591.anInt9675;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray296[--anInt5315];
											if (Static495.anInt8058 == 2 && local13 < Static591.anInt9675) {
												aStringArray22[anInt5308++] = Static22.aStringArray1[local13];
												if (Static91.aStringArray6[local13] != null) {
													aStringArray22[anInt5308++] = Static91.aStringArray6[local13];
													return;
												}
												aStringArray22[anInt5308++] = "";
												return;
											}
											aStringArray22[anInt5308++] = "";
											aStringArray22[anInt5308++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray296[--anInt5315];
											if (Static495.anInt8058 == 2 && local13 < Static591.anInt9675) {
												anIntArray296[anInt5315++] = Static438.anIntArray451[local13];
												return;
											}
											anIntArray296[anInt5315++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray296[--anInt5315];
											if (Static495.anInt8058 == 2 && local13 < Static591.anInt9675) {
												anIntArray296[anInt5315++] = Static273.anIntArray260[local13];
												return;
											}
											anIntArray296[anInt5315++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3978 = aStringArray22[--anInt5308];
											local19 = anIntArray296[--anInt5315];
											Static125.method2537(local3978, local19);
											return;
										}
										if (arg0 == 3605) {
											local3978 = aStringArray22[--anInt5308];
											Static64.method1420(local3978);
											return;
										}
										if (arg0 == 3606) {
											local3978 = aStringArray22[--anInt5308];
											Static386.method5715(local3978);
											return;
										}
										if (arg0 == 3607) {
											local3978 = aStringArray22[--anInt5308];
											Static502.method6763(local3978, false);
											return;
										}
										if (arg0 == 3608) {
											local3978 = aStringArray22[--anInt5308];
											Static418.method5944(local3978);
											return;
										}
										if (arg0 == 3609) {
											local3978 = aStringArray22[--anInt5308];
											if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
												local3978 = local3978.substring(7);
											}
											anIntArray296[anInt5315++] = Static154.method2915(local3978) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray296[--anInt5315];
											if (Static495.anInt8058 == 2 && local13 < Static591.anInt9675) {
												aStringArray22[anInt5308++] = Static167.aStringArray15[local13];
												return;
											}
											aStringArray22[anInt5308++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static138.aString13 != null) {
												aStringArray22[anInt5308++] = Static417.method5941(Static138.aString13);
												return;
											}
											aStringArray22[anInt5308++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static138.aString13 != null) {
												anIntArray296[anInt5315++] = Static507.anInt8256;
												return;
											}
											anIntArray296[anInt5315++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray296[--anInt5315];
											if (Static138.aString13 != null && local13 < Static507.anInt8256) {
												aStringArray22[anInt5308++] = Static187.aClass103Array1[local13].aString17;
												return;
											}
											aStringArray22[anInt5308++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray296[--anInt5315];
											if (Static138.aString13 != null && local13 < Static507.anInt8256) {
												anIntArray296[anInt5315++] = Static187.aClass103Array1[local13].anInt3256;
												return;
											}
											anIntArray296[anInt5315++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray296[--anInt5315];
											if (Static138.aString13 != null && local13 < Static507.anInt8256) {
												anIntArray296[anInt5315++] = Static187.aClass103Array1[local13].aByte34;
												return;
											}
											anIntArray296[anInt5315++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray296[anInt5315++] = Static7.aByte35;
											return;
										}
										if (arg0 == 3617) {
											local3978 = aStringArray22[--anInt5308];
											Static218.method3483(local3978);
											return;
										}
										if (arg0 == 3618) {
											anIntArray296[anInt5315++] = Static492.aByte108;
											return;
										}
										if (arg0 == 3619) {
											local3978 = aStringArray22[--anInt5308];
											Static150.method2848(local3978);
											return;
										}
										if (arg0 == 3620) {
											Static524.method7014();
											return;
										}
										if (arg0 == 3621) {
											if (Static495.anInt8058 == 0) {
												anIntArray296[anInt5315++] = -1;
												return;
											}
											anIntArray296[anInt5315++] = Static579.anInt9370;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray296[--anInt5315];
											if (Static495.anInt8058 != 0 && local13 < Static579.anInt9370) {
												aStringArray22[anInt5308++] = Static483.aStringArray33[local13];
												if (Static527.aStringArray36[local13] != null) {
													aStringArray22[anInt5308++] = Static527.aStringArray36[local13];
													return;
												}
												aStringArray22[anInt5308++] = "";
												return;
											}
											aStringArray22[anInt5308++] = "";
											aStringArray22[anInt5308++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3978 = aStringArray22[--anInt5308];
											if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
												local3978 = local3978.substring(7);
											}
											anIntArray296[anInt5315++] = Static503.method6787(local3978) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray296[--anInt5315];
											if (Static187.aClass103Array1 != null && local13 < Static507.anInt8256 && Static187.aClass103Array1[local13].aString16.equalsIgnoreCase(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aString95)) {
												anIntArray296[anInt5315++] = 1;
												return;
											}
											anIntArray296[anInt5315++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static107.aString10 != null) {
												aStringArray22[anInt5308++] = Static107.aString10;
												return;
											}
											aStringArray22[anInt5308++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray296[--anInt5315];
											if (Static138.aString13 != null && local13 < Static507.anInt8256) {
												aStringArray22[anInt5308++] = Static187.aClass103Array1[local13].aString14;
												return;
											}
											aStringArray22[anInt5308++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray296[--anInt5315];
											if (Static495.anInt8058 == 2 && local13 >= 0 && local13 < Static591.anInt9675) {
												anIntArray296[anInt5315++] = Static166.aBooleanArray11[local13] ? 1 : 0;
												return;
											}
											anIntArray296[anInt5315++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3978 = aStringArray22[--anInt5308];
											if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
												local3978 = local3978.substring(7);
											}
											anIntArray296[anInt5315++] = Static189.method3214(local3978);
											return;
										}
										if (arg0 == 3629) {
											anIntArray296[anInt5315++] = Static345.anInt6051;
											return;
										}
										if (arg0 == 3630) {
											local3978 = aStringArray22[--anInt5308];
											Static502.method6763(local3978, true);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static160.aBooleanArray10[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray296[--anInt5315];
											if (Static138.aString13 != null && local13 < Static507.anInt8256) {
												aStringArray22[anInt5308++] = Static187.aClass103Array1[local13].aString16;
												return;
											}
											aStringArray22[anInt5308++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray296[--anInt5315];
											if (Static495.anInt8058 != 0 && local13 < Static579.anInt9370) {
												aStringArray22[anInt5308++] = Static189.aStringArray16[local13];
												return;
											}
											aStringArray22[anInt5308++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static450.aClass211Array20[local13].method4785();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static450.aClass211Array20[local13].anInt5616;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static450.aClass211Array20[local13].anInt5619;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static450.aClass211Array20[local13].anInt5621;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static450.aClass211Array20[local13].anInt5613;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static450.aClass211Array20[local13].anInt5620;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray296[--anInt5315];
											local19 = Static450.aClass211Array20[local13].method4784();
											anIntArray296[anInt5315++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray296[--anInt5315];
											local19 = Static450.aClass211Array20[local13].method4784();
											anIntArray296[anInt5315++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray296[--anInt5315];
											local19 = Static450.aClass211Array20[local13].method4784();
											anIntArray296[anInt5315++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray296[--anInt5315];
											local19 = Static450.aClass211Array20[local13].method4784();
											anIntArray296[anInt5315++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt5315 -= 5;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local25 = anIntArray296[anInt5315 + 2];
											local353 = anIntArray296[anInt5315 + 3];
											local2309 = anIntArray296[anInt5315 + 4];
											anIntArray296[anInt5315++] = local13 + (local19 - local13) * (local2309 - local25) / (local353 - local25);
											return;
										}
										@Pc(7290) long local7290;
										@Pc(7283) long local7283;
										if (arg0 == 4007) {
											anInt5315 -= 2;
											local7283 = anIntArray296[anInt5315];
											local7290 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = (int) (local7283 + local7283 * local7290 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											if (local13 == 0) {
												anIntArray296[anInt5315++] = 0;
												return;
											}
											anIntArray296[anInt5315++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											if (local13 == 0) {
												anIntArray296[anInt5315++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray296[anInt5315++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray296[anInt5315++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt5315 -= 3;
											local7283 = anIntArray296[anInt5315];
											local7290 = anIntArray296[anInt5315 + 1];
											@Pc(7671) long local7671 = (long) anIntArray296[anInt5315 + 2];
											anIntArray296[anInt5315++] = (int) (local7283 * local7671 / local7290);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3978 = aStringArray22[--anInt5308];
											local19 = anIntArray296[--anInt5315];
											aStringArray22[anInt5308++] = local3978 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt5308 -= 2;
											local3978 = aStringArray22[anInt5308];
											local1145 = aStringArray22[anInt5308 + 1];
											aStringArray22[anInt5308++] = local3978 + local1145;
											return;
										}
										if (arg0 == 4102) {
											local3978 = aStringArray22[--anInt5308];
											local19 = anIntArray296[--anInt5315];
											aStringArray22[anInt5308++] = local3978 + Static367.method5384(local19);
											return;
										}
										if (arg0 == 4103) {
											local3978 = aStringArray22[--anInt5308];
											aStringArray22[anInt5308++] = local3978.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray22[anInt5308++] = method4574(anIntArray296[--anInt5315]);
											return;
										}
										if (arg0 == 4105) {
											anInt5308 -= 2;
											local3978 = aStringArray22[anInt5308];
											local1145 = aStringArray22[anInt5308 + 1];
											if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1 != null && Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1.aBoolean170) {
												aStringArray22[anInt5308++] = local1145;
												return;
											}
											aStringArray22[anInt5308++] = local3978;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray296[--anInt5315];
											aStringArray22[anInt5308++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt5308 -= 2;
											anIntArray296[anInt5315++] = Static317.method4655(aStringArray22[anInt5308], Static256.anInt4535, aStringArray22[anInt5308 + 1]);
											return;
										}
										@Pc(7954) Class134 local7954;
										if (arg0 == 4108) {
											local3978 = aStringArray22[--anInt5308];
											anInt5315 -= 2;
											local19 = anIntArray296[anInt5315];
											local25 = anIntArray296[anInt5315 + 1];
											local7954 = Static403.method5839(Static154.aClass322_61, local25);
											anIntArray296[anInt5315++] = local7954.method3352(Static494.aClass14Array14, local19, local3978);
											return;
										}
										if (arg0 == 4109) {
											local3978 = aStringArray22[--anInt5308];
											anInt5315 -= 2;
											local19 = anIntArray296[anInt5315];
											local25 = anIntArray296[anInt5315 + 1];
											local7954 = Static403.method5839(Static154.aClass322_61, local25);
											anIntArray296[anInt5315++] = local7954.method3355(local3978, Static494.aClass14Array14, local19);
											return;
										}
										if (arg0 == 4110) {
											anInt5308 -= 2;
											local3978 = aStringArray22[anInt5308];
											local1145 = aStringArray22[anInt5308 + 1];
											if (anIntArray296[--anInt5315] == 1) {
												aStringArray22[anInt5308++] = local3978;
												return;
											}
											aStringArray22[anInt5308++] = local1145;
											return;
										}
										if (arg0 == 4111) {
											local3978 = aStringArray22[--anInt5308];
											aStringArray22[anInt5308++] = Static261.method3998(local3978);
											return;
										}
										if (arg0 == 4112) {
											local3978 = aStringArray22[--anInt5308];
											local19 = anIntArray296[--anInt5315];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray22[anInt5308++] = local3978 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static81.method1668((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static3.method5712((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static547.method7286((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static143.method2769((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3978 = aStringArray22[--anInt5308];
											if (local3978 != null) {
												anIntArray296[anInt5315++] = local3978.length();
												return;
											}
											anIntArray296[anInt5315++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3978 = aStringArray22[--anInt5308];
											anInt5315 -= 2;
											local19 = anIntArray296[anInt5315];
											local25 = anIntArray296[anInt5315 + 1];
											aStringArray22[anInt5308++] = local3978.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3978 = aStringArray22[--anInt5308];
											@Pc(8317) StringBuffer local8317 = new StringBuffer(local3978.length());
											@Pc(8319) boolean local8319 = false;
											for (local353 = 0; local353 < local3978.length(); local353++) {
												@Pc(8326) char local8326 = local3978.charAt(local353);
												if (local8326 == '<') {
													local8319 = true;
												} else if (local8326 == '>') {
													local8319 = false;
												} else if (!local8319) {
													local8317.append(local8326);
												}
											}
											aStringArray22[anInt5308++] = local8317.toString();
											return;
										}
										if (arg0 == 4120) {
											local3978 = aStringArray22[--anInt5308];
											anInt5315 -= 2;
											local19 = anIntArray296[anInt5315];
											local25 = anIntArray296[anInt5315 + 1];
											anIntArray296[anInt5315++] = local3978.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt5308 -= 2;
											local3978 = aStringArray22[anInt5308];
											local1145 = aStringArray22[anInt5308 + 1];
											local25 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = local3978.indexOf(local1145, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray296[--anInt5315] != 0;
											local19 = anIntArray296[--anInt5315];
											aStringArray22[anInt5308++] = Static443.method6035(Static256.anInt4535, 0, (long) local19, local412);
											return;
										}
										if (arg0 == 4125) {
											local3978 = aStringArray22[--anInt5308];
											local19 = anIntArray296[--anInt5315];
											@Pc(8540) Class134 local8540 = Static403.method5839(Static154.aClass322_61, local19);
											anIntArray296[anInt5315++] = local8540.method3347(local3978, Static494.aClass14Array14);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray296[--anInt5315];
											aStringArray22[anInt5308++] = Static6.aClass92_1.method2673(local13).aString38;
											return;
										}
										@Pc(8602) Class197 local8602;
										if (arg0 == 4201) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local8602 = Static6.aClass92_1.method2673(local13);
											if (local19 >= 1 && local19 <= 5 && local8602.aStringArray21[local19 - 1] != null) {
												aStringArray22[anInt5308++] = local8602.aStringArray21[local19 - 1];
												return;
											}
											aStringArray22[anInt5308++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local8602 = Static6.aClass92_1.method2673(local13);
											if (local19 >= 1 && local19 <= 5 && local8602.aStringArray20[local19 - 1] != null) {
												aStringArray22[anInt5308++] = local8602.aStringArray20[local19 - 1];
												return;
											}
											aStringArray22[anInt5308++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static6.aClass92_1.method2673(local13).anInt5237;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static6.aClass92_1.method2673(local13).anInt5238 == 1 ? 1 : 0;
											return;
										}
										@Pc(8765) Class197 local8765;
										if (arg0 == 4205) {
											local13 = anIntArray296[--anInt5315];
											local8765 = Static6.aClass92_1.method2673(local13);
											if (local8765.anInt5214 == -1 && local8765.anInt5201 >= 0) {
												anIntArray296[anInt5315++] = local8765.anInt5201;
												return;
											}
											anIntArray296[anInt5315++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray296[--anInt5315];
											local8765 = Static6.aClass92_1.method2673(local13);
											if (local8765.anInt5214 >= 0 && local8765.anInt5201 >= 0) {
												anIntArray296[anInt5315++] = local8765.anInt5201;
												return;
											}
											anIntArray296[anInt5315++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static6.aClass92_1.method2673(local13).aBoolean387 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local3043 = Static137.aClass124_1.method3255(local19);
											if (local3043.method151()) {
												aStringArray22[anInt5308++] = Static6.aClass92_1.method2673(local13).method4528(local19, local3043.aString1);
												return;
											}
											anIntArray296[anInt5315++] = Static6.aClass92_1.method2673(local13).method4527(local3043.anInt193, local19);
											return;
										}
										if (arg0 == 4209) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1] - 1;
											local8602 = Static6.aClass92_1.method2673(local13);
											if (local8602.anInt5248 == local19) {
												anIntArray296[anInt5315++] = local8602.anInt5217;
												return;
											}
											if (local8602.anInt5226 == local19) {
												anIntArray296[anInt5315++] = local8602.anInt5213;
												return;
											}
											anIntArray296[anInt5315++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3978 = aStringArray22[--anInt5308];
											local19 = anIntArray296[--anInt5315];
											Static467.method6468(local19 == 1, local3978);
											anIntArray296[anInt5315++] = Static132.anInt9446;
											return;
										}
										if (arg0 == 4211) {
											if (Static184.aShortArray46 != null && Static67.anInt1539 < Static132.anInt9446) {
												anIntArray296[anInt5315++] = Static184.aShortArray46[Static67.anInt1539++] & 0xFFFF;
												return;
											}
											anIntArray296[anInt5315++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static67.anInt1539 = 0;
											return;
										}
										if (arg0 == 4213) {
											local13 = anIntArray296[--anInt5315];
											anIntArray296[anInt5315++] = Static6.aClass92_1.method2673(local13).anInt5232;
											return;
										}
										if (arg0 == 4214) {
											local3978 = aStringArray22[--anInt5308];
											anInt5315 -= 3;
											local19 = anIntArray296[anInt5315];
											local25 = anIntArray296[anInt5315 + 1];
											local353 = anIntArray296[anInt5315 + 2];
											Static379.method5534(local3978, local19 == 1, local353, local25);
											anIntArray296[anInt5315++] = Static132.anInt9446;
											return;
										}
										if (arg0 == 4215) {
											anInt5308 -= 2;
											anInt5315 -= 2;
											local3978 = aStringArray22[anInt5308];
											local19 = anIntArray296[anInt5315];
											local25 = anIntArray296[anInt5315 + 1];
											@Pc(9164) String local9164 = aStringArray22[anInt5308 + 1];
											Static409.method5902(local3978, local19 == 1, local25, local9164);
											anIntArray296[anInt5315++] = Static132.anInt9446;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local3043 = Static137.aClass124_1.method3255(local19);
											if (local3043.method151()) {
												aStringArray22[anInt5308++] = Static361.aClass229_13.method5396(local13).method5993(local3043.aString1, local19);
												return;
											}
											anIntArray296[anInt5315++] = Static361.aClass229_13.method5396(local13).method5995(local3043.anInt193, local19);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local3043 = Static137.aClass124_1.method3255(local19);
											if (local3043.method151()) {
												aStringArray22[anInt5308++] = Static478.aClass212_3.method4793(local13).method6174(local19, local3043.aString1);
												return;
											}
											anIntArray296[anInt5315++] = Static478.aClass212_3.method4793(local13).method6170(local3043.anInt193, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt5315 -= 2;
											local13 = anIntArray296[anInt5315];
											local19 = anIntArray296[anInt5315 + 1];
											local3043 = Static137.aClass124_1.method3255(local19);
											if (local3043.method151()) {
												aStringArray22[anInt5308++] = Static164.aClass239_1.method5569(local13).method3009(local19, local3043.aString1);
												return;
											}
											anIntArray296[anInt5315++] = Static164.aClass239_1.method5569(local13).method3007(local3043.anInt193, local19);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray296[--anInt5315];
										@Pc(9392) Class365 local9392 = Static401.aClass33_1.method659(local13);
										if (local9392.anIntArray643 != null && local9392.anIntArray643.length > 0) {
											local25 = 0;
											local353 = local9392.anIntArray642[0];
											for (local2309 = 1; local2309 < local9392.anIntArray643.length; local2309++) {
												if (local9392.anIntArray642[local2309] > local353) {
													local25 = local2309;
													local353 = local9392.anIntArray642[local2309];
												}
											}
											anIntArray296[anInt5315++] = local9392.anIntArray643[local25];
											return;
										}
										anIntArray296[anInt5315++] = local9392.anInt9741;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static265.method4040(anIntArray296[--anInt5315]);
						} else {
							local137 = arg1 ? aClass361_9 : aClass361_10;
						}
						if (arg0 == 1300) {
							local19 = anIntArray296[--anInt5315] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method7888(local19, aStringArray22[--anInt5308]);
								return;
							}
							anInt5308--;
							return;
						}
						if (arg0 == 1301) {
							anInt5315 -= 2;
							local19 = anIntArray296[anInt5315];
							local25 = anIntArray296[anInt5315 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass361_18 = null;
								return;
							}
							local137.aClass361_18 = Static556.method7352(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray296[--anInt5315];
							if (local19 != Static542.anInt8662 && local19 != Static148.anInt3136 && local19 != Static346.anInt6069) {
								return;
							}
							local137.anInt9612 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt9619 = anIntArray296[--anInt5315];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt9656 = anIntArray296[--anInt5315];
							return;
						}
						if (arg0 == 1305) {
							local137.aString99 = aStringArray22[--anInt5308];
							return;
						}
						if (arg0 == 1306) {
							local137.aString97 = aStringArray22[--anInt5308];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray40 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt9631 = anIntArray296[--anInt5315];
							local137.anInt9613 = anIntArray296[--anInt5315];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray296[--anInt5315];
							local25 = anIntArray296[--anInt5315];
							if (local25 >= 1 && local25 <= 10) {
								local137.method7901(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString101 = aStringArray22[--anInt5308];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt9589 = anIntArray296[--anInt5315];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt5315 -= 3;
								local19 = anIntArray296[anInt5315] - 1;
								local25 = anIntArray296[anInt5315 + 1];
								local353 = anIntArray296[anInt5315 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt5315 -= 2;
								local19 = 10;
								local25 = anIntArray296[anInt5315];
								local353 = anIntArray296[anInt5315 + 1];
							}
							if (local137.aByteArray104 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray104 = new byte[11];
								local137.aByteArray103 = new byte[11];
								local137.anIntArray640 = new int[11];
							}
							local137.aByteArray104[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean748 = false;
								for (local2309 = 0; local2309 < local137.aByteArray104.length; local2309++) {
									if (local137.aByteArray104[local2309] != 0) {
										local137.aBoolean748 = true;
										break;
									}
								}
							} else {
								local137.aBoolean748 = true;
							}
							local137.aByteArray103[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt9610 = anIntArray296[--anInt5315];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static265.method4040(anIntArray296[--anInt5315]);
					} else {
						local137 = arg1 ? aClass361_9 : aClass361_10;
					}
					Static186.method3170(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt5315 -= 2;
						local19 = anIntArray296[anInt5315];
						local25 = anIntArray296[anInt5315 + 1];
						if (local137.anInt9608 == -1) {
							Static559.method7529(local137.anInt9594);
							Static542.method7212(local137.anInt9594);
							Static478.method6563(local137.anInt9594);
						}
						if (local19 == -1) {
							local137.anInt9582 = 1;
							local137.anInt9628 = -1;
							local137.anInt9645 = -1;
							return;
						}
						local137.anInt9645 = local19;
						local137.anInt9607 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean750 = true;
						} else {
							local137.aBoolean750 = false;
						}
						@Pc(1649) Class197 local1649 = Static6.aClass92_1.method2673(local19);
						local137.anInt9667 = local1649.anInt5240;
						local137.anInt9639 = local1649.anInt5243;
						local137.anInt9588 = local1649.anInt5191;
						local137.anInt9636 = local1649.anInt5224;
						local137.anInt9622 = local1649.anInt5220;
						local137.anInt9615 = local1649.anInt5210;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt9627 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt9627 = 1;
						} else {
							local137.anInt9627 = 2;
						}
						if (local137.anInt9604 > 0) {
							local137.anInt9615 = local137.anInt9615 * 32 / local137.anInt9604;
							return;
						}
						if (local137.anInt9662 > 0) {
							local137.anInt9615 = local137.anInt9615 * 32 / local137.anInt9662;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt9582 = 2;
						local137.anInt9628 = anIntArray296[--anInt5315];
						if (local137.anInt9608 == -1) {
							Static14.method212(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt9582 = 3;
						local137.anInt9628 = -1;
						if (local137.anInt9608 == -1) {
							Static14.method212(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt9582 = 6;
						local137.anInt9628 = anIntArray296[--anInt5315];
						if (local137.anInt9608 == -1) {
							Static14.method212(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt9582 = 5;
						local137.anInt9628 = anIntArray296[--anInt5315];
						if (local137.anInt9608 == -1) {
							Static14.method212(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt5315 -= 4;
						local137.anInt9618 = anIntArray296[anInt5315];
						local137.anInt9586 = anIntArray296[anInt5315 + 1];
						local137.anInt9583 = anIntArray296[anInt5315 + 2];
						local137.anInt9616 = anIntArray296[anInt5315 + 3];
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt5315 -= 2;
						local137.anInt9641 = anIntArray296[anInt5315];
						local137.anInt9634 = anIntArray296[anInt5315 + 1];
						Static186.method3170(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt5315 -= 4;
						local137.anInt9628 = anIntArray296[anInt5315];
						local137.anInt9629 = anIntArray296[anInt5315 + 1];
						if (anIntArray296[anInt5315 + 2] == 1) {
							local137.anInt9582 = 9;
						} else {
							local137.anInt9582 = 8;
						}
						if (anIntArray296[anInt5315 + 3] == 1) {
							local137.aBoolean750 = true;
						} else {
							local137.aBoolean750 = false;
						}
						if (local137.anInt9608 == -1) {
							Static14.method212(local137.anInt9594);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt9582 = 5;
						local137.anInt9628 = Static166.anInt3327;
						local137.anInt9629 = 0;
						if (local137.anInt9608 == -1) {
							Static14.method212(local137.anInt9594);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!ht;II)V")
	public static void method4573(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub7_Sub3 local5 = Static53.method839(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray297 = new int[local5.anInt1033];
		aStringArray23 = new String[local5.anInt1032];
		if (local5.aClass137_3 == Static42.aClass137_1 || local5.aClass137_3 == Static131.aClass137_7 || local5.aClass137_3 == Static59.aClass137_4) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static493.aClass361_17 != null) {
				local30 = Static493.aClass361_17.anInt9606;
				local32 = Static493.aClass361_17.anInt9659;
			}
			anIntArray297[0] = Static465.aClass86_1.method7267() - local30;
			anIntArray297[1] = Static465.aClass86_1.method7265() - local32;
		}
		method4569(local5, 200000);
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method4574(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray24[local20] + "-" + local24;
	}
}
