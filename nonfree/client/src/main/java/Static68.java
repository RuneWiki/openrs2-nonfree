import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!el", name = "m", descriptor = "I")
	public static int anInt1317;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray11 = new byte[50][];

	@OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
	public static int[] anIntArray99 = new int[1000];

	@OriginalMember(owner = "client!el", name = "f", descriptor = "Lclient!cc;")
	public static Class26 aClass26_12 = new Class26(260);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
	public static void method1064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static149.aClass26_28 = new Class26(arg0);
		Static125.aClass26_23 = new Class26(arg1);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lclient!cm;")
	public static Class32 method1065(@OriginalArg(0) int arg0) {
		@Pc(10) Class32 local10 = (Class32) Static131.aClass26_25.method518((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(42) byte[] local42 = Static241.aClass58_86.method1372(Static11.method192(arg0), Static262.method4127(arg0));
		local10 = new Class32();
		if (local42 != null) {
			local10.method695(new Class4_Sub10(local42));
		}
		Static131.aClass26_25.method510(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public static void method1066() {
		Static164.aClass26_30.method515();
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V")
	public static void method1067() {
		Static268.aClass26_54.method517(5);
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public static void method1068() {
		Static188.aClass189ArrayArray115 = new Class189[Static126.aClass58_56.method1351()][];
		Static93.aBooleanArray12 = new boolean[Static126.aClass58_56.method1351()];
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method1069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static79.method1364(arg0)) {
			Static224.method3591(arg3, -1, arg7, Static188.aClass189ArrayArray115[arg0], arg4, arg6, arg1, arg2, arg5);
		} else if (arg7 == -1) {
			for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
				Static85.aBooleanArray8[local25] = true;
			}
		} else {
			Static85.aBooleanArray8[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1071(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!fd;)V")
	public static void method1072(@OriginalArg(1) Class4_Sub10 arg0) {
		@Pc(9) int local9 = arg0.method4616();
		Static236.aClass154Array1 = new Class154[local9];
		@Pc(14) int local14;
		for (local14 = 0; local14 < local9; local14++) {
			Static236.aClass154Array1[local14] = new Class154();
			Static236.aClass154Array1[local14].anInt4470 = arg0.method4616();
			Static236.aClass154Array1[local14].aString277 = arg0.method4670();
		}
		Static243.anInt4616 = arg0.method4616();
		Static39.anInt645 = arg0.method4616();
		Static93.anInt2580 = arg0.method4616();
		Static75.aClass63_Sub1Array1 = new Class63_Sub1[Static39.anInt645 + 1 - Static243.anInt4616];
		for (local14 = 0; local14 < Static93.anInt2580; local14++) {
			@Pc(80) int local80 = arg0.method4616();
			@Pc(88) Class63_Sub1 local88 = Static75.aClass63_Sub1Array1[local80] = new Class63_Sub1();
			local88.anInt2021 = arg0.method4666();
			local88.anInt2020 = arg0.method4632();
			local88.anInt2037 = Static243.anInt4616 + local80;
			local88.aString110 = arg0.method4670();
			local88.aString111 = arg0.method4670();
		}
		Static145.anInt2842 = arg0.method4632();
		Static258.aBoolean339 = true;
	}
}
