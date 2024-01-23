import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "M", descriptor = "[Lclient!nb;")
	public static Class1_Sub1_Sub6_Sub1[] aClass1_Sub1_Sub6_Sub1Array1;

	@OriginalMember(owner = "client!a", name = "T", descriptor = "I")
	public static int anInt42;

	@OriginalMember(owner = "client!a", name = "X", descriptor = "Lclient!ai;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!a", name = "I", descriptor = "Lclient!kh;")
	public static Class60 aClass60_22 = Static200.method3116("hint_mapmarkers");

	@OriginalMember(owner = "client!a", name = "J", descriptor = "Lclient!kh;")
	private static Class60 aClass60_23 = Static200.method3116("Error connecting to server)3");

	@OriginalMember(owner = "client!a", name = "K", descriptor = "Lclient!kh;")
	public static Class60 aClass60_24 = Static200.method3116("event_opbase");

	@OriginalMember(owner = "client!a", name = "L", descriptor = "I")
	public static int anInt39 = 0;

	@OriginalMember(owner = "client!a", name = "O", descriptor = "[I")
	public static int[] anIntArray9 = new int[100];

	@OriginalMember(owner = "client!a", name = "S", descriptor = "Lclient!kh;")
	private static Class60 aClass60_27 = Static200.method3116("Created gameworld");

	@OriginalMember(owner = "client!a", name = "P", descriptor = "Lclient!kh;")
	public static Class60 aClass60_25 = aClass60_27;

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "Lclient!kh;")
	private static Class60 aClass60_26 = Static200.method3116("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!a", name = "V", descriptor = "Lclient!kh;")
	public static Class60 aClass60_28 = aClass60_26;

	@OriginalMember(owner = "client!a", name = "W", descriptor = "Lclient!kh;")
	public static Class60 aClass60_29 = aClass60_23;

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "[Lclient!sj;")
	public static Class9_Sub4_Sub2[] aClass9_Sub4_Sub2Array1 = new Class9_Sub4_Sub2[32768];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
	public static int method27(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
	public static void method28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class1_Sub22 local28 = Static100.aClass1_Sub22ArrayArrayArray3[local9][arg0][arg1] = Static100.aClass1_Sub22ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt3360--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt3358; local38++) {
					@Pc(44) Class29 local44 = local28.aClass29Array3[local38];
					if ((local44.aLong43 >> 29 & 0x3L) == 2L && local44.anInt1437 == arg0 && local44.anInt1423 == arg1) {
						local44.anInt1434--;
					}
				}
			}
		}
		if (Static100.aClass1_Sub22ArrayArrayArray3[0][arg0][arg1] == null) {
			Static100.aClass1_Sub22ArrayArrayArray3[0][arg0][arg1] = new Class1_Sub22(0, arg0, arg1);
		}
		Static100.aClass1_Sub22ArrayArrayArray3[0][arg0][arg1].aClass1_Sub22_1 = local7;
		Static100.aClass1_Sub22ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Z")
	public static boolean method29() {
		try {
			if (Static186.anInt3973 == 2) {
				if (Static11.aClass1_Sub23_105 == null) {
					Static11.aClass1_Sub23_105 = Static228.method2704(Static190.aClass7_35, Static136.anInt2985, Static59.anInt1505);
					if (Static11.aClass1_Sub23_105 == null) {
						return false;
					}
				}
				if (Static206.aClass75_1 == null) {
					Static206.aClass75_1 = new Class75(Static103.aClass7_20, Static141.aClass7_30);
				}
				if (Static37.aClass1_Sub7_Sub3_2.method3422(Static199.aClass7_38, Static11.aClass1_Sub23_105, Static206.aClass75_1)) {
					Static37.aClass1_Sub7_Sub3_2.method3427();
					Static37.aClass1_Sub7_Sub3_2.method3426(Static156.anInt3478);
					Static37.aClass1_Sub7_Sub3_2.method3401(Static11.aClass1_Sub23_105, Static62.aBoolean79);
					Static186.anInt3973 = 0;
					Static11.aClass1_Sub23_105 = null;
					Static206.aClass75_1 = null;
					Static190.aClass7_35 = null;
					return true;
				}
			}
		} catch (@Pc(67) Exception local67) {
			local67.printStackTrace();
			Static37.aClass1_Sub7_Sub3_2.method3404();
			Static186.anInt3973 = 0;
			Static11.aClass1_Sub23_105 = null;
			Static190.aClass7_35 = null;
			Static206.aClass75_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(II)I")
	public static int method30(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
