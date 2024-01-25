import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!om", name = "I", descriptor = "Lclient!oq;")
	public static Class189 aClass189_2;

	@OriginalMember(owner = "client!om", name = "L", descriptor = "Lclient!oi;")
	public static Class185 aClass185_16;

	@OriginalMember(owner = "client!om", name = "N", descriptor = "Z")
	private static boolean aBoolean113;

	@OriginalMember(owner = "client!om", name = "O", descriptor = "I")
	private static int anInt852;

	@OriginalMember(owner = "client!om", name = "P", descriptor = "I")
	private static int anInt853;

	@OriginalMember(owner = "client!om", name = "Q", descriptor = "Z")
	private static boolean aBoolean114;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_12 = new Class142("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIII)V")
	public static void method730(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class78[] local7 = Static13.aClass78Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class78 local15 = local7[local9];
			if (local15 != null && local15.anInt1697 == 2) {
				Static150.method3716(arg0 >> 1, local15.anInt1702, local15.anInt1700, local15.anInt1698 * 2, arg3 >> 1, local15.anInt1703);
				if (Static99.anIntArray133[0] > -1 && Static98.anInt1304 % 20 < 10) {
					Static277.aClass85Array9[local15.anInt1701].method5406(arg1 + Static99.anIntArray133[0] - 12, arg2 + -28 - -Static99.anIntArray133[1]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)Lclient!jj;")
	public static Class111_Sub2 method732() {
		@Pc(8) Class111_Sub2 local8 = (Class111_Sub2) Static328.aClass63_6.method1016();
		if (local8 == null) {
			return new Class111_Sub2();
		} else {
			Static391.anInt6297--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!om", name = "providesignlink", descriptor = "(Lclient!nt;)V")
	private static void method734(@OriginalArg(0) Class177 arg0) {
		Static259.aClass177_2 = arg0;
		Static457.aClass177_5 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IBI)V")
	public static void method735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub3_Sub1 local16 = Static427.method5426(arg0, 1);
		local16.method384();
		local16.anInt381 = arg1;
	}
}
