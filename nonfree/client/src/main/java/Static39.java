import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray3 = new byte[250][];

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	public static int anInt1027 = 0;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	public static int anInt1032 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V")
	public static void method726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static26.anInt679; local5++) {
			if (arg2 < Static150.anIntArray283[local5] + Static114.anIntArray203[local5] && arg3 + arg2 > Static150.anIntArray283[local5] && Static138.anIntArray253[local5] + Static145.anIntArray274[local5] > arg1 && Static145.anIntArray274[local5] < arg0 + arg1) {
				Static62.aBooleanArray7[local5] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIBI)V")
	public static void method727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static1.anInt63 == 1) {
			Static26.aClass1_Sub2_Sub8_Sub3Array6[Static178.anInt3964 / 100].method2347(Static192.anInt4305 - 8, Static79.anInt1889 + -8);
		}
		if (Static1.anInt63 == 2) {
			Static26.aClass1_Sub2_Sub8_Sub3Array6[Static178.anInt3964 / 100 + 4].method2347(Static192.anInt4305 - 8, Static79.anInt1889 + -8);
		}
		Static103.method1786();
		if (!Static43.aBoolean61) {
			return;
		}
		@Pc(50) int local50 = arg1 + 512 - 5;
		@Pc(54) int local54 = arg3 + 20;
		Static67.aClass1_Sub2_Sub8_Sub1_Sub1_2.method1271(Static63.method1281(new Class24[] { Static107.aClass24_722, Static175.method3020(Static194.anInt4323) }), local50, local54, 16776960, -1);
		@Pc(78) Runtime local78 = Runtime.getRuntime();
		@Pc(87) int local87 = (int) ((local78.totalMemory() - local78.freeMemory()) / 1024L);
		@Pc(88) int local88 = local54 + 15;
		@Pc(90) int local90 = 16776960;
		if (local87 > 32768 && Static30.aBoolean35) {
			local90 = 16711680;
		}
		if (local87 > 65536 && !Static30.aBoolean35) {
			local90 = 16711680;
		}
		Static67.aClass1_Sub2_Sub8_Sub1_Sub1_2.method1271(Static63.method1281(new Class24[] { Static89.aClass24_623, Static175.method3020(local87), Static41.aClass24_366 }), local50, local88, local90, -1);
		local54 = local88 + 15;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Lclient!pa;")
	public static Class1_Sub2_Sub18 method729(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub18 local10 = (Class1_Sub2_Sub18) Static74.aClass86_27.method2816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static33.aClass69_7.method2208(1, arg0);
		local10 = new Class1_Sub2_Sub18();
		if (local20 != null) {
			local10.method2454(new Class1_Sub7(local20), arg0);
		}
		Static74.aClass86_27.method2821(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([IIIII)V")
	public static void method731(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = arg2 - 1;
		@Pc(8) int local8 = local4 - 7;
		arg1--;
		while (arg1 < local8) {
			@Pc(12) int local12 = arg1 + 1;
			arg0[local12] = arg3;
			@Pc(17) int local17 = local12 + 1;
			arg0[local17] = arg3;
			@Pc(22) int local22 = local17 + 1;
			arg0[local22] = arg3;
			@Pc(27) int local27 = local22 + 1;
			arg0[local27] = arg3;
			@Pc(32) int local32 = local27 + 1;
			arg0[local32] = arg3;
			@Pc(37) int local37 = local32 + 1;
			arg0[local37] = arg3;
			@Pc(42) int local42 = local37 + 1;
			arg0[local42] = arg3;
			arg1 = local42 + 1;
			arg0[arg1] = arg3;
		}
		while (arg1 < local4) {
			arg1++;
			arg0[arg1] = arg3;
		}
	}
}
