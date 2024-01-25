import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	public static int anInt2742;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "Z")
	public static boolean aBoolean217 = false;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "Z")
	public static boolean aBoolean218 = false;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
	public static int anInt2741 = -1;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V")
	public static void method2895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(10, arg1);
		local8.method2648();
		local8.anInt2507 = arg3;
		local8.anInt2511 = arg2;
		local8.anInt2510 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mb;IIILclient!ja;)V")
	public static void method2896(@OriginalArg(0) Class132 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class81 arg3) {
		if (arg0.anInt3524 == 2) {
			for (@Pc(16) int local16 = arg2; local16 <= arg1; local16++) {
				@Pc(25) int local25 = arg0.anIntArray414[local16] - 1;
				if (local25 != -1) {
					@Pc(61) boolean local61;
					if (Static14.anInt257 == 1 && local16 == Static102.anInt5263 && Static338.anInt6174 == arg0.anInt3551) {
						local61 = Static71.method1267(arg0.anInt3504, 2, local25, arg3, arg0.anIntArray411[local16], null, 0) == null;
						if (local61) {
							Static122.aClass211_20.method5585(new Class6_Sub40(local25, arg0.anIntArray411[local16], 2, 0, arg0.anInt3504, false));
						}
					} else {
						local61 = Static71.method1267(arg0.anInt3504, 1, local25, arg3, arg0.anIntArray411[local16], null, -13623264) == null;
						if (local61) {
							Static122.aClass211_20.method5585(new Class6_Sub40(local25, arg0.anIntArray411[local16], 1, -13623264, arg0.anInt3504, false));
						}
					}
				}
			}
		} else if (arg0.anInt3524 == 5) {
			@Pc(154) boolean local154 = Static71.method1267(arg0.anInt3504, arg0.anInt3547, arg0.anInt3508, arg3, arg0.anInt3494, arg0.aBoolean267 ? Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2 : null, arg0.anInt3526 | 0xFF000000) == null;
			if (local154) {
				Static122.aClass211_20.method5585(new Class6_Sub40(arg0.anInt3508, arg0.anInt3494, arg0.anInt3547, arg0.anInt3526 | 0xFF000000, arg0.anInt3504, arg0.aBoolean267));
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
	public static void method2897() {
		if (Static129.anInt2374 == 10) {
			Static290.method4952(28);
		}
		if (Static129.anInt2374 == 30) {
			Static290.method4952(25);
		}
	}
}
