import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_42;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1519 = Static51.method932(" ");

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	public static int anInt3514 = 0;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1520 = aClass10_1519;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1521 = null;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)[Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3[] method2471() {
		@Pc(8) Class2_Sub1_Sub4_Sub3[] local8 = new Class2_Sub1_Sub4_Sub3[Static73.anInt1747];
		for (@Pc(15) int local15 = 0; local15 < Static73.anInt1747; local15++) {
			@Pc(21) Class2_Sub1_Sub4_Sub3 local21 = new Class2_Sub1_Sub4_Sub3();
			local21.anInt2634 = Static148.anInt3209;
			local21.anInt2633 = Static171.anInt3704;
			local21.anInt2631 = Static96.anIntArray401[local15];
			local21.anInt2630 = Static14.anIntArray26[local15];
			local21.anInt2635 = Static68.anIntArray178[local15];
			local21.anInt2632 = Static98.anIntArray240[local15];
			local21.anIntArray279 = Static118.anIntArray284;
			local21.aByteArray34 = Static115.aByteArrayArray9[local15];
			local8[local15] = local21;
		}
		Static155.method2394();
		return local8;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!cd;BLclient!cd;Lclient!cd;)V")
	public static void method2472(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) Class10 arg3) {
		for (@Pc(8) int local8 = 99; local8 > 0; local8--) {
			Static129.anIntArray320[local8] = Static129.anIntArray320[local8 - 1];
			Static58.aClass10Array8[local8] = Static58.aClass10Array8[local8 - 1];
			Static135.aClass10Array22[local8] = Static135.aClass10Array22[local8 - 1];
			Static143.aClass10Array23[local8] = Static143.aClass10Array23[local8 - 1];
		}
		Static58.aClass10Array8[0] = arg3;
		Static135.aClass10Array22[0] = arg2;
		Static72.anInt1720 = Static12.anInt364;
		Static143.aClass10Array23[0] = arg1;
		Static95.anInt2254++;
		Static129.anIntArray320[0] = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method2473() {
		aClass2_Sub1_Sub4_Sub2_42 = null;
		aClass10_1520 = null;
		aClass10_1521 = null;
		aClass10_1519 = null;
	}
}
