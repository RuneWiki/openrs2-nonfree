import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
	public static int anInt9713;

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
	public static int anInt9721 = 0;

	@OriginalMember(owner = "client!ug", name = "D", descriptor = "[I")
	public static final int[] anIntArray637 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I")
	public static int method8472(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[B)V")
	public static void method8473(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class6_Sub15 local15 = new Class6_Sub15(arg0);
		@Pc(17) boolean local17 = false;
		while (true) {
			while (true) {
				@Pc(21) int local21 = local15.method3030();
				if (local21 == 0) {
					if (local17) {
						return;
					}
					if (Static325.anIntArray328 == null) {
						Static325.anIntArray328 = new int[4];
						Static108.anIntArray102 = new int[4];
						Static454.anInt7816 = 4;
					}
					for (local21 = 0; local21 < Static325.anIntArray328.length; local21++) {
						Static325.anIntArray328[local21] = 0;
						Static108.anIntArray102[local21] = local21 * 20;
					}
					return;
				}
				if (local21 == 1) {
					if (Static325.anIntArray328 == null) {
						Static454.anInt7816 = 4;
						Static108.anIntArray102 = new int[4];
						Static325.anIntArray328 = new int[4];
					}
					for (@Pc(52) int local52 = 0; local52 < Static325.anIntArray328.length; local52++) {
						Static325.anIntArray328[local52] = local15.method2989();
						Static108.anIntArray102[local52] = local15.method2989();
					}
					local17 = true;
				} else if (local21 == 2) {
					Static226.anInt4403 = local15.method3018();
				} else if (local21 == 3) {
					Static454.anInt7816 = local15.method3030();
					Static108.anIntArray102 = new int[Static454.anInt7816];
					Static325.anIntArray328 = new int[Static454.anInt7816];
				} else if (local21 == 5) {
					Static94.anInt1386 = local15.method2987();
				} else if (local21 == 6) {
					Static370.anInt3440 = local15.method2987();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!jc;I)Lclient!qj;")
	public static Class137 method8475(@OriginalArg(0) Class6_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method3018();
		@Pc(16) Class318 local16 = Static70.method932()[arg0.method3030()];
		@Pc(25) Class238 local25 = Static632.method8588()[arg0.method3030()];
		@Pc(29) int local29 = arg0.method2989();
		@Pc(33) int local33 = arg0.method2989();
		return new Class137(local7, local16, local25, local29, local33);
	}
}
