import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
	public static int anInt3774;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "Lclient!ke;")
	public static Class52 aClass52_37;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_35 = new Class85(64);

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1810 = Static193.method3027("white:");

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1808 = aClass70_1810;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1809 = Static193.method3027("mem=");

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1811 = Static193.method3027("Einloggen");

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "[I")
	public static int[] anIntArray325 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	public static int anInt3775 = -1;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1812 = Static193.method3027("titlebutton");

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1813 = aClass70_1810;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BZ)V")
	public static void method2900(@OriginalArg(1) boolean arg0) {
		if (Static167.aClass33_3 == null) {
			return;
		}
		try {
			@Pc(11) Class3_Sub4 local11 = new Class3_Sub4(4);
			local11.method1239(arg0 ? 2 : 3);
			local11.method1276(0);
			Static167.aClass33_3.method924(4, local11.aByteArray12);
		} catch (@Pc(38) IOException local38) {
			try {
				Static167.aClass33_3.method925();
			} catch (@Pc(43) Exception local43) {
			}
			Static167.aClass33_3 = null;
			Static54.anInt1163++;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!vh;I)V")
	public static void method2901(@OriginalArg(0) Class3_Sub26 arg0) {
		Static19.method318(arg0, 200000);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Lclient!qc;")
	public static Class3_Sub3_Sub2_Sub2 method2902() {
		@Pc(3) Class3_Sub3_Sub2_Sub2 local3 = new Class3_Sub3_Sub2_Sub2();
		local3.anIntArray235 = Static63.anIntArray75;
		local3.anInt3218 = Static160.anIntArray245[0];
		local3.anInt3220 = Static163.anIntArray250[0];
		local3.anInt3217 = Static88.anInt1712;
		local3.anInt3219 = Static176.anIntArray295[0];
		local3.aByteArray32 = Static204.aByteArrayArray9[0];
		local3.anInt3216 = Static172.anIntArray284[0];
		local3.anInt3221 = Static126.anInt2492;
		Static161.method2418();
		return local3;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BJ)V")
	public static void method2903(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static61.anInt1297 >= 100) {
			Static135.method1934(Static134.aClass70_1273, 0, Static61.aClass70_596);
			return;
		}
		@Pc(25) Class70 local25 = Static113.method1641(arg0).method2033();
		for (@Pc(27) int local27 = 0; local27 < Static61.anInt1297; local27++) {
			if (Static183.aLongArray6[local27] == arg0) {
				Static135.method1934(Static207.method3296(new Class70[] { local25, Static39.aClass70_421 }), 0, Static61.aClass70_596);
				return;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static13.anInt318; local57++) {
			if (arg0 == Static70.aLongArray1[local57]) {
				Static135.method1934(Static207.method3296(new Class70[] { Static106.aClass70_1069, local25, Static71.aClass70_672 }), 0, Static61.aClass70_596);
				return;
			}
		}
		if (local25.method2032(Static144.aClass26_Sub2_Sub1_1.aClass70_952)) {
			Static135.method1934(Static107.aClass70_1579, 0, Static61.aClass70_596);
			return;
		}
		Static183.aLongArray6[Static61.anInt1297] = arg0;
		Static160.aClass70Array58[Static61.anInt1297++] = Static113.method1641(arg0);
		Static33.anInt719 = Static86.anInt1703;
		Static93.aClass3_Sub4_Sub1_18.method1298(198);
		Static93.aClass3_Sub4_Sub1_18.method1250(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIILclient!b;)V")
	public static void method2905(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6 arg3) {
		if (Static211.anInt4256 >= 3) {
			Static104.method3093(arg2, arg1, arg3.anIntArray13, arg3.anIntArray19);
		} else {
			Static52.aClass3_Sub3_Sub2_Sub1_4.method179(arg2, arg1, arg3.anInt244, arg3.anInt217, Static52.aClass3_Sub3_Sub2_Sub1_4.anInt164 / 2, Static52.aClass3_Sub3_Sub2_Sub1_4.anInt165 / 2, Static179.anInt1329, arg3.anIntArray13, arg3.anIntArray19);
		}
		Static70.aBooleanArray3[arg0] = true;
	}
}
