import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Lclient!lf;")
	public static Class7 aClass7_6;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!ge;")
	public static Class1_Sub3_Sub2 aClass1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "Lclient!fc;")
	public static Class25 aClass25_385 = Static78.method1313(")2");

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
	public static int anInt909 = 255;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "[Lclient!ca;")
	public static Class12[] aClass12Array1 = new Class12[16];

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
	public static int anInt911 = 0;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!fc;")
	private static Class25 aClass25_387 = Static78.method1313("Walk here");

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "Lclient!fc;")
	public static Class25 aClass25_386 = aClass25_387;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	public static int anInt916 = -1;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "Lclient!fc;")
	public static Class25 aClass25_388 = Static78.method1313("blinken1:");

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public static int anInt917 = -1;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
	public static int anInt920 = 0;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	public static int anInt921 = 0;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!fc;")
	public static Class25 aClass25_389 = Static78.method1313("(U");

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
	public static int anInt922 = -1;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method735() {
		Static100.aClass63_20.method1513();
		Static42.aClass63_6.method1513();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)Lclient!pe;")
	public static Class1_Sub2_Sub16 method736(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub16 local10 = (Class1_Sub2_Sub16) Static93.aClass63_17.method1517((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static99.aClass56_71.method1269(10, arg0);
		local10 = new Class1_Sub2_Sub16();
		local10.anInt2155 = arg0;
		if (local20 != null) {
			local10.method1592(new Class1_Sub5(local20));
		}
		local10.method1586();
		if (local10.anInt2147 != -1) {
			local10.method1583(method736(local10.anInt2144), method736(local10.anInt2147));
		}
		if (!Static37.aBoolean44 && local10.aBoolean104) {
			local10.anInt2132 = 0;
			local10.aClass25Array18 = null;
			local10.aClass25_1018 = Static93.aClass25_1004;
			local10.aClass25Array19 = null;
		}
		Static93.aClass63_17.method1520(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!oc;ILclient!oc;Lclient!oc;)V")
	public static void method737(@OriginalArg(0) Class56 arg0, @OriginalArg(2) Class56 arg1, @OriginalArg(3) Class56 arg2) {
		Static45.aClass56_42 = arg2;
		Static84.aClass56_58 = arg1;
		Static46.aClass56_43 = arg0;
		Static56.aClass1_Sub2_Sub14ArrayArray1 = new Class1_Sub2_Sub14[Static45.aClass56_42.method1267()][];
		Static2.aBooleanArray1 = new boolean[Static45.aClass56_42.method1267()];
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	public static void method738() {
		aClass25_388 = null;
		aClass12Array1 = null;
		aClass7_6 = null;
		aClass25_389 = null;
		aClass1_Sub3_Sub2_1 = null;
		aClass25_385 = null;
		aClass25_387 = null;
		aClass25_386 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)Lclient!de;")
	public static Class1_Sub2_Sub5 method739(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub2_Sub5 local12 = (Class1_Sub2_Sub5) Static25.aClass63_3.method1517((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(29) byte[] local29 = Static25.aClass56_Sub1_4.method1269(arg0, 0);
		if (local29 == null) {
			return null;
		}
		local12 = new Class1_Sub2_Sub5();
		@Pc(39) int local39 = 0;
		@Pc(44) Class1_Sub5 local44 = new Class1_Sub5(local29);
		local44.anInt792 = local44.aByteArray13.length - 12;
		@Pc(55) int local55 = local44.method663();
		local12.anInt698 = local44.method651();
		local12.anInt695 = local44.method651();
		local12.anInt696 = local44.method651();
		local12.anInt697 = local44.method651();
		local12.aClass25Array3 = new Class25[local55];
		local44.anInt792 = 0;
		local12.anIntArray147 = new int[local55];
		local12.anIntArray149 = new int[local55];
		while (local44.anInt792 < local44.aByteArray13.length - 12) {
			@Pc(96) int local96 = local44.method651();
			if (local96 == 3) {
				local12.aClass25Array3[local39] = local44.method654();
			} else if (local96 >= 100 || local96 == 21 || local96 == 38 || local96 == 39) {
				local12.anIntArray149[local39] = local44.method672();
			} else {
				local12.anIntArray149[local39] = local44.method663();
			}
			local12.anIntArray147[local39++] = local96;
		}
		Static25.aClass63_3.method1520(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public static void method740() {
		for (@Pc(6) Class1_Sub4 local6 = (Class1_Sub4) Static71.aClass2_8.method22(); local6 != null; local6 = (Class1_Sub4) Static71.aClass2_8.method23()) {
			if (local6.aClass1_Sub2_Sub6_1 != null) {
				local6.method489();
			}
		}
	}
}
