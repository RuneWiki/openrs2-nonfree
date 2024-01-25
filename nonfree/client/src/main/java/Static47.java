import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "Z")
	public static boolean aBoolean49;

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "Lclient!am;")
	public static Class9 aClass9_3;

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_24 = new Class7("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
	public static int anInt945 = 0;

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_40 = new Class107(58, 6);

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "[I")
	public static final int[] anIntArray69 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Lclient!kn;")
	public static Class1_Sub26 method860() {
		if (Static168.aClass181_3 == null || Static233.aClass162_2 == null) {
			return null;
		}
		for (@Pc(19) Class1_Sub26 local19 = (Class1_Sub26) Static233.aClass162_2.method3757(); local19 != null; local19 = (Class1_Sub26) Static233.aClass162_2.method3757()) {
			@Pc(26) Class202 local26 = Static168.aClass78_2.method2110(local19.anInt3922);
			if (local26 != null && local26.aBoolean397 && local26.method4655(Static168.anInterface8_2)) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ya;I)V")
	public static void method861(@OriginalArg(0) Class39 arg0) {
		if (Static217.anInt4004 < 2 && !Static355.aBoolean412 || Static455.aClass251_14 != null) {
			return;
		}
		@Pc(46) String local46;
		if (Static355.aBoolean412 && Static217.anInt4004 < 2) {
			local46 = Static139.aString22 + Static343.aClass7_151.method331(Static341.anInt5770) + Static289.aString63 + " ->";
		} else if (Static137.aBoolean164 && Static306.aClass155_1.method3516(81) && Static217.anInt4004 > 2) {
			local46 = Static74.method1493((Class1_Sub3) Static55.aClass181_63.aClass1_179.aClass1_262.aClass1_262);
		} else {
			@Pc(53) Class1_Sub3 local53 = (Class1_Sub3) Static55.aClass181_63.aClass1_179.aClass1_262;
			local46 = Static74.method1493(local53);
			@Pc(59) int[] local59 = null;
			if (Static423.method5615(local53.anInt117)) {
				local59 = Static165.aClass19_1.method560((int) local53.aLong10).anIntArray340;
			} else if (local53.anInt120 != -1) {
				local59 = Static165.aClass19_1.method560(local53.anInt120).anIntArray340;
			} else if (Static112.method2066(local53.anInt117)) {
				@Pc(133) Class31_Sub2_Sub1_Sub2 local133 = Static98.aClass31_Sub2_Sub1_Sub2Array1[(int) local53.aLong10];
				if (local133 != null) {
					@Pc(138) Class53 local138 = local133.aClass53_1;
					if (local138.anIntArray131 != null) {
						local138 = local138.method1508(Static394.aClass23_1);
					}
					if (local138 != null) {
						local59 = local138.anIntArray132;
					}
				}
			} else if (Static262.method3883(local53.anInt117)) {
				@Pc(101) Class129 local101;
				if (local53.anInt117 == 1004) {
					local101 = Static349.aClass115_4.method2766((int) local53.aLong10);
				} else {
					local101 = Static349.aClass115_4.method2766((int) (local53.aLong10 >>> 32 & 0x7FFFFFFFL));
				}
				if (local101.anIntArray310 != null) {
					local101 = local101.method3031(Static394.aClass23_1);
				}
				if (local101 != null) {
					local59 = local101.anIntArray308;
				}
			}
			if (local59 != null) {
				local46 = local46 + Static254.method3806(local59);
			}
		}
		if (Static217.anInt4004 > 2) {
			local46 = local46 + "<col=ffffff> / " + (Static217.anInt4004 - 2) + Static28.aClass7_13.method331(Static341.anInt5770);
		}
		if (Static153.aClass251_3 != null) {
			@Pc(257) Class71 local257 = Static153.aClass251_3.method5542(arg0);
			if (local257 == null) {
				local257 = Static178.aClass71_5;
			}
			local257.method5442(Static415.aRandom1, Static121.anInt2468, Static153.aClass251_3.anInt6687, Static23.anIntArray448, Static153.aClass251_3.anInt6677, Static153.aClass251_3.anInt6730, Static153.aClass251_3.anInt6701, Static134.anIntArray208, Static39.anInt790, local46, Static381.anInt6917, Static153.aClass251_3.anInt6720, Static212.aClass143Array6, Static153.aClass251_3.anInt6726);
			Static17.method466(Static23.anIntArray448[1], Static23.anIntArray448[2], Static23.anIntArray448[0], Static23.anIntArray448[3]);
		} else if (Static218.aClass251_7 != null && Static337.aClass61_5 == Static444.aClass61_7) {
			@Pc(238) int local238 = Static178.aClass71_5.method5452(Static415.aRandom1, Static374.anInt6113 + 4, Static212.aClass143Array6, Static134.anIntArray208, Static254.anInt4598 + 16, Static381.anInt6917, local46);
			Static17.method466(Static254.anInt4598, Static3.aClass151_6.method3475(local46) + local238, Static374.anInt6113 + 4, 16);
			return;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public static void method862() {
		for (@Pc(4) Class4_Sub7 local4 = (Class4_Sub7) Static356.aClass141_8.method3357(); local4 != null; local4 = (Class4_Sub7) Static356.aClass141_8.method3360()) {
			local4.method3781();
		}
	}

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "(I)V")
	public static void method863() {
		Static140.aFont1 = null;
		Static304.anImage3 = null;
	}
}
