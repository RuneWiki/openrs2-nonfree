import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
	public static int anInt6125;

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray54;

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
	public static int anInt6137 = -1;

	@OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
	public static int anInt6139 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)Lclient!im;")
	public static Class1_Sub16 method4747() {
		@Pc(8) Class1_Sub16 local8 = new Class1_Sub16(34);
		local8.method2621(11);
		local8.method2621(Static20.anInt5576);
		local8.method2621(Static138.aBoolean162 ? 1 : 0);
		local8.method2621(Static53.aBoolean84 ? 1 : 0);
		local8.method2621(Static135.aBoolean157 ? 1 : 0);
		local8.method2621(Static45.aBoolean75 ? 1 : 0);
		local8.method2621(Static64.aBoolean92 ? 1 : 0);
		local8.method2621(Static135.aBoolean154 ? 1 : 0);
		local8.method2621(Static50.aBoolean80 ? 1 : 0);
		local8.method2621(Static263.aBoolean302 ? 1 : 0);
		local8.method2621(Static265.anInt5769);
		local8.method2621(Static10.aBoolean12 ? 1 : 0);
		local8.method2621(Static119.aBoolean141 ? 1 : 0);
		local8.method2621(Static70.aBoolean96 ? 1 : 0);
		local8.method2621(Static8.anInt4429);
		local8.method2621(Static153.aBoolean183 ? 1 : 0);
		local8.method2621(Static11.anInt2931);
		local8.method2621(Static239.anInt5264);
		local8.method2621(Static210.anInt4682);
		local8.method2624(Static180.anInt4075);
		local8.method2624(Static275.anInt5914);
		local8.method2621(Static155.method2875());
		local8.method2606(Static265.anInt5770);
		local8.method2621(Static272.anInt5852);
		local8.method2621(Static157.aBoolean187 ? 1 : 0);
		local8.method2621(Static205.aBoolean243 ? 1 : 0);
		local8.method2621(Static204.anInt4555);
		local8.method2621(Static28.aBoolean42 ? 1 : 0);
		local8.method2621(Static111.aBoolean136 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)V")
	public static void method4750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub2_Sub6 local10 = Static104.method831(arg2, 9);
		local10.method1192();
		local10.anInt1565 = arg0;
		local10.anInt1558 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)Z")
	public static boolean method4752(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!kb;B)Lclient!fj;")
	public static Class7 method4753(@OriginalArg(0) int arg0, @OriginalArg(1) Class83 arg1) {
		return Static182.method3508(arg1, arg0) ? Static104.method847() : null;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
	public static void method4754(@OriginalArg(0) int arg0) {
		Static174.anInt3964 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static212.anInt4717; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static293.anInt6189; local8++) {
				if (Static132.aClass1_Sub14ArrayArrayArray2[arg0][local3][local8] == null) {
					Static132.aClass1_Sub14ArrayArrayArray2[arg0][local3][local8] = new Class1_Sub14(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
	public static void method4759() {
		Static262.aClass155_42.method4362();
	}
}
