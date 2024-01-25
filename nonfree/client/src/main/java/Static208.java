import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_98 = new Class85("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!na", name = "e", descriptor = "I")
	public static int anInt4114 = 0;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "Lclient!vg;")
	public static Class201 aClass201_9 = null;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "I")
	public static int anInt4116 = 0;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Lclient!ae;")
	public static Class6_Sub1 method3803() {
		return Static241.aClass6_Sub1Array2.length > Static274.anInt5446 ? Static241.aClass6_Sub1Array2[Static274.anInt5446++] : null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)I")
	public static int method3804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static8.aClass51Array1 == null) {
			return 0;
		}
		@Pc(17) int local17 = arg1 >> 7;
		@Pc(21) int local21 = arg2 >> 7;
		if (local17 < 0 || local21 < 0 || local17 > Static22.anInt481 - 1 || Static269.anInt5281 - 1 < local21) {
			return 0;
		}
		@Pc(49) int local49 = arg0;
		if (arg0 < 3 && (Static255.aByteArrayArrayArray13[1][local17][local21] & 0x2) != 0) {
			local49 = arg0 + 1;
		}
		return Static8.aClass51Array1[local49].method1844(arg1, arg2);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
	public static void method3805(@OriginalArg(0) int arg0) {
		@Pc(14) Class5_Sub1_Sub2 local14 = Static166.method3027(arg0, 16);
		local14.method856();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V")
	public static void method3807(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub1_Sub2 local12 = Static166.method3027(arg0, 11);
		local12.method856();
	}
}
