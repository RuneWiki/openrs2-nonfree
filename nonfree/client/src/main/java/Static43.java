import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "Lclient!aa;")
	public static Class2 aClass2_2;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
	public static int anInt850 = -1;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "[I")
	public static final int[] anIntArray62 = new int[5];

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "[I")
	public static final int[] anIntArray63 = new int[14];

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
	public static int anInt852 = -1;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZLclient!ms;)V")
	public static void method650(@OriginalArg(1) Class137 arg0) {
		if (!Static103.aBoolean118) {
			return;
		}
		Static313.aClass11_Sub25_Sub1_5.method2454(117);
		Static313.aClass11_Sub25_Sub1_5.method5168(arg0.anInt4044);
		Static313.aClass11_Sub25_Sub1_5.method5170(Static122.anInt2282);
		Static313.aClass11_Sub25_Sub1_5.method5182(Static219.anInt4454);
		Static313.aClass11_Sub25_Sub1_5.method5191(arg0.anInt4095);
		Static313.aClass11_Sub25_Sub1_5.method5170(arg0.anInt4112);
		Static313.aClass11_Sub25_Sub1_5.method5196(Static66.anInt2101);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!nq;ILclient!nq;)I")
	public static int method653(@OriginalArg(0) Class144 arg0, @OriginalArg(2) Class144 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method3910(Static82.anInt1505)) {
			local5++;
		}
		if (arg0.method3910(Static229.anInt4581)) {
			local5++;
		}
		if (arg0.method3910(Static82.anInt1502)) {
			local5++;
		}
		if (arg1.method3910(Static82.anInt1505)) {
			local5++;
		}
		if (arg1.method3910(Static229.anInt4581)) {
			local5++;
		}
		if (arg1.method3910(Static82.anInt1502)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BC)C")
	public static char method654(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
	public static void method656() {
		@Pc(5) Class26 local5 = Static196.aClass26_38;
		synchronized (Static196.aClass26_38) {
			Static196.aClass26_38.method329(5);
		}
		local5 = Static281.aClass26_51;
		synchronized (Static281.aClass26_51) {
			Static281.aClass26_51.method329(5);
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
	public static void method657() {
		if (Static103.aClass2_4 == null) {
			return;
		}
		if (Static103.aClass2_4.anInt6 == 1) {
			Static103.aClass2_4 = null;
			return;
		}
		if (Static103.aClass2_4.anInt6 == 2) {
			Static135.method2123(Static59.aClass118_1, Static32.aString8, 2);
			Static103.aClass2_4 = null;
			return;
		}
	}
}
