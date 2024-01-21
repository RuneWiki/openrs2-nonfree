import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "Lclient!ec;")
	public static Class22 aClass22_115 = Static60.method1113("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "Lclient!ec;")
	public static Class22 aClass22_116 = Static60.method1113("Untersuchen");

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_117 = Static60.method1113("Stufe)2");

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "[I")
	public static int[] anIntArray39 = new int[25];

	@OriginalMember(owner = "client!cb", name = "hb", descriptor = "[I")
	public static int[] anIntArray40 = new int[100];

	@OriginalMember(owner = "client!cb", name = "ib", descriptor = "Lclient!ec;")
	public static Class22 aClass22_118 = Static60.method1113("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!cb", name = "kb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_119 = Static60.method1113(":chalreq:");

	@OriginalMember(owner = "client!cb", name = "lb", descriptor = "[I")
	public static int[] anIntArray41 = new int[5];

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)I")
	public static int method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(25) int local25 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local25;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
	public static void method275() {
		aClass22_119 = null;
		aClass22_117 = null;
		aClass22_118 = null;
		anIntArray39 = null;
		anIntArray40 = null;
		aClass22_115 = null;
		anIntArray41 = null;
		aClass22_116 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!f;II)V")
	public static void method276(@OriginalArg(1) Class4_Sub7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static133.aClass4_Sub7_16 != null || Static22.aBoolean250 || (arg0 == null || Static122.method948(arg0) == null)) {
			return;
		}
		Static133.aClass4_Sub7_16 = arg0;
		Static97.aClass4_Sub7_13 = Static122.method948(arg0);
		Static39.anInt973 = arg2;
		Static73.anInt1952 = arg1;
		Static64.aBoolean163 = false;
		Static8.anInt2380 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
	public static void method277() {
		Static51.aClass33_19.method1003();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V")
	public static void method278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static113.anInt2788 == 1) {
			Static1.aClass4_Sub1_Sub2_Sub2Array1[Static130.anInt3100 / 100].method790(Static23.anInt555 - 8, Static130.anInt3102 + -8);
		}
		if (Static113.anInt2788 == 2) {
			Static1.aClass4_Sub1_Sub2_Sub2Array1[Static130.anInt3100 / 100 + 4].method790(Static23.anInt555 - 8, Static130.anInt3102 + -8);
		}
		Static91.method1590();
		if (!Static132.aBoolean283) {
			return;
		}
		@Pc(50) int local50 = arg2 + 507;
		@Pc(54) int local54 = arg0 + 20;
		@Pc(56) int local56 = 16776960;
		Static101.aClass4_Sub1_Sub2_Sub4_Sub1_4.method1400(Static44.method856(new Class22[] { Static65.aClass22_491, Static134.method2042(Static80.anInt2200) }), local50, local54, 16776960, -1);
		@Pc(78) Runtime local78 = Runtime.getRuntime();
		@Pc(79) int local79 = local54 + 15;
		@Pc(88) int local88 = (int) ((local78.totalMemory() - local78.freeMemory()) / 1024L);
		if (local88 > 32768 && Static130.aBoolean279) {
			local56 = 16711680;
		}
		if (local88 > 65536 && !Static130.aBoolean279) {
			local56 = 16711680;
		}
		Static101.aClass4_Sub1_Sub2_Sub4_Sub1_4.method1400(Static44.method856(new Class22[] { Static11.aClass22_931, Static134.method2042(local88), Static93.aClass22_734 }), local50, local79, local56, -1);
		local54 = local79 + 15;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)Lclient!o;")
	public static Class4_Sub1_Sub10 method279(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub1_Sub10 local6 = (Class4_Sub1_Sub10) Static8.aClass33_27.method998((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static130.aClass20_61.method597(9, arg0);
		local6 = new Class4_Sub1_Sub10();
		local6.anInt2174 = arg0;
		if (local25 != null) {
			local6.method1435(new Class4_Sub11(local25));
		}
		local6.method1439();
		Static8.aClass33_27.method997((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method280(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static33.aClass44_1);
		arg0.removeFocusListener(Static33.aClass44_1);
		Static12.anInt215 = -1;
	}
}
