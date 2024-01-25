import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "[Lclient!wg;")
	public static final Class3_Sub4_Sub16[] aClass3_Sub4_Sub16Array1 = new Class3_Sub4_Sub16[14];

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public static int anInt849 = -1;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[B")
	public static final byte[] aByteArray12 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "[Lclient!rt;")
	public static Class219[] aClass219Array1 = new Class219[50];

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[Lclient!mq;)V")
	public static void method589(@OriginalArg(0) int arg0, @OriginalArg(2) Class156[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class156 local9 = arg1[local3];
			if (local9 != null && arg0 == local9.anInt4839 && !Static53.method1110(local9)) {
				if (local9.anInt4792 == 0) {
					method589(local9.anInt4850, arg1);
					if (local9.aClass156Array2 != null) {
						method589(local9.anInt4850, local9.aClass156Array2);
					}
					@Pc(47) Class3_Sub9 local47 = (Class3_Sub9) Static318.aClass11_42.method324((long) local9.anInt4850);
					if (local47 != null) {
						Static17.method369(local47.anInt1804);
					}
				}
				if (local9.anInt4792 == 6 && local9.lb != -1) {
					@Pc(67) Class128 local67 = Static301.aClass170_3.method3936(local9.lb);
					if (local67 != null) {
						local9.anInt4795 += Static115.anInt2498;
						while (local9.anInt4795 > local67.anIntArray254[local9.anInt4860]) {
							local9.anInt4795 -= local67.anIntArray254[local9.anInt4860];
							local9.anInt4860++;
							if (local9.anInt4860 >= local67.anIntArray252.length) {
								local9.anInt4860 -= local67.anInt3970;
								if (local9.anInt4860 < 0 || local9.anInt4860 >= local67.anIntArray252.length) {
									local9.anInt4860 = 0;
								}
							}
							local9.anInt4851 = local9.anInt4860 + 1;
							if (local67.anIntArray252.length <= local9.anInt4851) {
								local9.anInt4851 -= local67.anInt3970;
								if (local9.anInt4851 < 0 || local67.anIntArray252.length <= local9.anInt4851) {
									local9.anInt4851 = -1;
								}
							}
							Static386.method5010(local9);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(CB)Z")
	public static boolean method590(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)I")
	public static int method591(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!vj;IZ[II)Lclient!mk;")
	public static Class112_Sub2_Sub1 method592(@OriginalArg(0) int arg0, @OriginalArg(1) Class172_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1.aBoolean619 || Static137.method2172(arg2) && Static137.method2172(arg0)) {
			return new Class112_Sub2_Sub1(arg1, 3553, arg2, arg0, false, arg3);
		} else if (arg1.aBoolean607) {
			return new Class112_Sub2_Sub1(arg1, 34037, arg2, arg0, false, arg3);
		} else {
			return new Class112_Sub2_Sub1(arg1, arg2, arg0, Static288.method4088(arg2), Static288.method4088(arg0), arg3);
		}
	}
}
