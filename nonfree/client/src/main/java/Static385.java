import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "Lclient!gf;")
	public static Class132 aClass132_1;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
	public static int anInt6671 = 0;

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "[I")
	public static final int[] anIntArray382 = new int[3];

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "[I")
	public static final int[] anIntArray383 = new int[3];

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
	public static void method5929() {
		for (@Pc(3) int local3 = 0; local3 < Static201.anInt4069; local3++) {
			@Pc(9) int local9 = Static531.anIntArray580[local3];
			@Pc(16) Class6_Sub11 local16 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local9);
			if (local16 != null) {
				@Pc(21) Class60_Sub1_Sub1_Sub3_Sub2 local21 = local16.aClass60_Sub1_Sub1_Sub3_Sub2_1;
				Static216.method3957(local21, local21.aClass294_1.anInt8169);
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5930(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BIIILclient!gb;)Z")
	public static boolean method5931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class60_Sub1_Sub3 arg3) {
		if (!Static519.aBoolean664 || !Static26.aBoolean26) {
			return false;
		} else if (Static14.anInt211 < 100) {
			return false;
		} else if (Static240.method4227(arg2, arg1, arg0)) {
			@Pc(33) int local33 = arg0 << Static594.anInt9440;
			@Pc(37) int local37 = arg1 << Static594.anInt9440;
			@Pc(47) int local47 = Static555.aClass96Array3[arg2].method8080(arg0, arg1) - 1;
			@Pc(53) int local53 = arg3.method7922() + local47;
			if (arg3.aShort115 == 1) {
				if (!Static44.method541(local33, local47, local53, local37, local33, local53, local37, local37 + Static234.anInt4537, local33)) {
					return false;
				} else if (Static44.method541(local33, local47, local53, local37, local33, local47, Static234.anInt4537 + local37, Static234.anInt4537 + local37, local33)) {
					Static407.anInt7099++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort115 == 2) {
				if (!Static44.method541(local33, local47, local53, Static234.anInt4537 + local37, local33, local53, local37 + Static234.anInt4537, local37 + Static234.anInt4537, local33 + Static234.anInt4537)) {
					return false;
				} else if (Static44.method541(local33, local47, local47, Static234.anInt4537 + local37, Static234.anInt4537 + local33, local53, Static234.anInt4537 + local37, Static234.anInt4537 + local37, Static234.anInt4537 + local33)) {
					Static407.anInt7099++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort115 == 4) {
				if (!Static44.method541(Static234.anInt4537 + local33, local47, local53, local37, Static234.anInt4537 + local33, local53, local37, local37 + Static234.anInt4537, Static234.anInt4537 + local33)) {
					return false;
				} else if (Static44.method541(local33 + Static234.anInt4537, local47, local53, local37, local33 + Static234.anInt4537, local47, Static234.anInt4537 + local37, local37 - -Static234.anInt4537, local33 + Static234.anInt4537)) {
					Static407.anInt7099++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort115 == 8) {
				if (!Static44.method541(local33, local47, local53, local37, local33, local53, local37, local37, Static234.anInt4537 + local33)) {
					return false;
				} else if (Static44.method541(local33, local47, local47, local37, Static234.anInt4537 + local33, local53, local37, local37, local33 + Static234.anInt4537)) {
					Static407.anInt7099++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort115 == 16) {
				if (Static525.method7546(Static430.anInt3928, local53, local47, Static430.anInt3928, local33, local37 + Static430.anInt3928)) {
					Static407.anInt7099++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort115 == 32) {
				if (Static525.method7546(Static430.anInt3928, local53, local47, Static430.anInt3928, local33 + Static430.anInt3928, Static430.anInt3928 + local37)) {
					Static407.anInt7099++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort115 == 64) {
				if (Static525.method7546(Static430.anInt3928, local53, local47, Static430.anInt3928, local33 + Static430.anInt3928, local37)) {
					Static407.anInt7099++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort115 != 128) {
				return true;
			} else if (Static525.method7546(Static430.anInt3928, local53, local47, Static430.anInt3928, local33, local37)) {
				Static407.anInt7099++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
