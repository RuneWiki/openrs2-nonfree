import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1537 = Static64.method1101(")4");

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "[I")
	public static int[] anIntArray332 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "[I")
	public static int[] anIntArray333 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "S")
	public static short aShort22 = 1;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1538 = Static64.method1101("Loaded textures");

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1539 = aClass51_1538;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Z")
	public static boolean method3452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIZII[Lclient!me;)V")
	public static void method3455(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class71[] arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg4.length; local7++) {
			@Pc(13) Class71 local13 = arg4[local7];
			if (local13 != null && local13.anInt2785 == arg3) {
				Static182.method3079(arg0, arg1, local13, arg2);
				Static131.method2283(arg2, local13, arg0);
				if (local13.anInt2813 - local13.anInt2835 < local13.anInt2779) {
					local13.anInt2779 = local13.anInt2813 - local13.anInt2835;
				}
				if (local13.anInt2842 > local13.anInt2841 - local13.anInt2802) {
					local13.anInt2842 = local13.anInt2841 - local13.anInt2802;
				}
				if (local13.anInt2842 < 0) {
					local13.anInt2842 = 0;
				}
				if (local13.anInt2779 < 0) {
					local13.anInt2779 = 0;
				}
				if (local13.anInt2777 == 0) {
					Static180.method3046(arg1, local13);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I")
	public static int method3456(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIB)V")
	public static void method3459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class124 local9 = Static144.method2492(arg0);
		@Pc(12) int local12 = local9.anInt4668;
		@Pc(15) int local15 = local9.anInt4660;
		@Pc(18) int local18 = local9.anInt4667;
		@Pc(30) int local30 = Class45.anIntArray97[local18 - local15];
		if (arg1 < 0 || arg1 > local30) {
			arg1 = 0;
		}
		local30 <<= local15;
		Static53.method929(local30 & arg1 << local15 | ~local30 & Static86.anIntArray125[local12], local12);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B[B)Lclient!jb;")
	public static Class1_Sub2_Sub11 method3461(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(25) Class1_Sub2_Sub11_Sub1_Sub1 local25 = new Class1_Sub2_Sub11_Sub1_Sub1(arg0, Static65.anIntArray98, Static152.anIntArray225, Static51.anIntArray72, Static89.anIntArray85, Static73.aByteArrayArray4);
			Static134.method2401();
			return local25;
		}
	}
}
