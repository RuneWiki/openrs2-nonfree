import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "I")
	public static int anInt3151;

	@OriginalMember(owner = "client!hp", name = "B", descriptor = "Lclient!f;")
	public static Class8 aClass8_11;

	@OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
	public static int anInt3155;

	@OriginalMember(owner = "client!hp", name = "v", descriptor = "[I")
	public static final int[] anIntArray202 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!hp", name = "z", descriptor = "Lclient!gr;")
	public static final Class95 aClass95_8 = new Class95(11, 5);

	@OriginalMember(owner = "client!hp", name = "C", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_67 = new Class119(4, 20);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IBLclient!qa;Lclient!ug;I)V")
	public static void method2535(@OriginalArg(2) Class172 arg0, @OriginalArg(3) Class243 arg1) {
		Static132.aClass243_17.method5200();
		if (Static268.aBoolean445) {
			return;
		}
		for (@Pc(24) Class3_Sub26 local24 = (Class3_Sub26) arg1.method5208(); local24 != null; local24 = (Class3_Sub26) arg1.method5203()) {
			@Pc(32) Class90 local32 = Static144.aClass171_4.method3940(local24.anInt3892);
			if (Static64.method1303(local32)) {
				@Pc(44) boolean local44 = Static172.method2770(local24, local32, arg0);
				if (local44) {
					Static260.method4834(local32, local24, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!nu;)V")
	public static void method2537(@OriginalArg(0) Class7_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort71; local2 <= arg0.aShort72; local2++) {
			for (@Pc(6) int local6 = arg0.aShort73; local6 <= arg0.aShort70; local6++) {
				@Pc(16) Class118 local16 = Static263.aClass118ArrayArrayArray2[arg0.aByte77][local2][local6];
				if (local16 != null) {
					@Pc(21) Class179 local21 = local16.aClass179_2;
					@Pc(23) Class179 local23 = null;
					while (local21 != null) {
						if (local21.aClass7_Sub2_2 == arg0) {
							if (local23 == null) {
								local16.aClass179_2 = local21.aClass179_3;
							} else {
								local23.aClass179_3 = local21.aClass179_3;
							}
							local21.method4096();
							break;
						}
						local23 = local21;
						local21 = local21.aClass179_3;
					}
					local16.aByte62 = 0;
					for (@Pc(56) Class179 local56 = local16.aClass179_2; local56 != null; local56 = local56.aClass179_3) {
						local16.aByte62 = (byte) (local16.aByte62 | local56.anInt5239);
					}
				}
			}
		}
	}
}
