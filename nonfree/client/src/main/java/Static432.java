import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "Lclient!s;")
	public static final Class217 aClass217_159 = new Class217(106, 12);

	@OriginalMember(owner = "client!vm", name = "x", descriptor = "Lclient!wm;")
	public static final Class267 aClass267_82 = new Class267(8);

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_105 = new Class27(50, 7);

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	public static void method5718() {
		Static273.anInt4772 = 0;
		@Pc(11) int local11 = Static203.aClass10_Sub8_Sub2_1.method2520();
		@Pc(15) int local15 = Static203.aClass10_Sub8_Sub2_1.method2503();
		@Pc(19) int local19 = Static203.aClass10_Sub8_Sub2_1.method2485();
		@Pc(30) boolean local30 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
		Static210.method281();
		Static168.method2797(local15);
		@Pc(43) int local43 = (Static10.anInt154 - Static203.aClass10_Sub8_Sub2_1.anInt2989) / 16;
		Static372.anIntArrayArray59 = new int[local43][4];
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static372.anIntArrayArray59[local49][local53] = Static203.aClass10_Sub8_Sub2_1.method2459();
			}
		}
		Static226.anIntArray421 = new int[local43];
		Static164.aByteArrayArray27 = null;
		Static384.anIntArray636 = new int[local43];
		Static49.anIntArray72 = new int[local43];
		Static378.aByteArrayArray44 = new byte[local43][];
		Static144.anIntArray288 = new int[local43];
		Static86.aByteArrayArray13 = new byte[local43][];
		Static148.aByteArrayArray21 = new byte[local43][];
		Static236.aByteArrayArray31 = new byte[local43][];
		Static222.anIntArray416 = null;
		Static195.anIntArray390 = new int[local43];
		local43 = 0;
		for (local53 = (local11 - (Static2.anInt7 >> 4)) / 8; local53 <= (local11 + (Static2.anInt7 >> 4)) / 8; local53++) {
			for (@Pc(133) int local133 = (local19 - (Static17.anInt315 >> 4)) / 8; local133 <= (local19 + (Static17.anInt315 >> 4)) / 8; local133++) {
				Static144.anIntArray288[local43] = local133 + (local53 << 8);
				Static195.anIntArray390[local43] = Static77.aClass187_32.method4278("m" + local53 + "_" + local133);
				Static384.anIntArray636[local43] = Static77.aClass187_32.method4278("l" + local53 + "_" + local133);
				Static49.anIntArray72[local43] = Static77.aClass187_32.method4278("um" + local53 + "_" + local133);
				Static226.anIntArray421[local43] = Static77.aClass187_32.method4278("ul" + local53 + "_" + local133);
				local43++;
			}
		}
		Static344.method4660(local30, 10, local19, local11);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void method5720(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(12) String local12 = "";
			if (arg1 != null) {
				local12 = Static294.method5898(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local12 = local12 + " | ";
				}
				local12 = local12 + arg0;
			}
			Static278.method4706(local12);
			local12 = Static323.method4420(local12, ":", "%3a");
			local12 = Static323.method4420(local12, "@", "%40");
			local12 = Static323.method4420(local12, "&", "%26");
			local12 = Static323.method4420(local12, "#", "%23");
			if (Static418.aClass159_5.anApplet1 != null) {
				@Pc(104) Class270 local104 = Static418.aClass159_5.method3523(new URL(Static418.aClass159_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static411.anInt6881 + "&u=" + Static28.aLong20 + "&v1=" + Static240.aString39 + "&v2=" + Static240.aString45 + "&e=" + local12));
				while (local104.anInt7548 == 0) {
					Static328.method5696(1L);
				}
				if (local104.anInt7548 == 1) {
					@Pc(123) DataInputStream local123 = (DataInputStream) local104.anObject9;
					local123.read();
					local123.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V")
	public static void method5721() {
		if (Static412.aClass50_8.method5875()) {
			Static412.aClass50_8.method5871(Static412.aCanvas7);
			Static95.method1723();
			Static412.aClass50_8.method5880(Static412.aCanvas7);
			Static412.aClass50_8.method5827(Static412.aCanvas7);
		} else {
			Static178.method2951(Static423.anInt7114);
		}
		Static448.method5473();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!ph;)V")
	public static void method5722(@OriginalArg(1) Class187 arg0) {
		Static128.anInt7165 = 0;
		Static61.anInt1131 = 0;
		Static364.aClass240_5 = new Class240();
		Static152.aClass40_Sub2_Sub1_Sub1Array1 = new Class40_Sub2_Sub1_Sub1[1024];
		Static430.method5709(arg0);
		Static323.method4421(arg0);
	}
}
