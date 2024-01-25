import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "[Lclient!f;")
	public static Class5[] aClass5Array4;

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "Lclient!ma;")
	public static Class216 aClass216_1;

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "[Lclient!vv;")
	public static Class11_Sub1[] aClass11_Sub1Array11;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_9 = new Class208(57, 7);

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "Lclient!tb;")
	public static final Class316 aClass316_1 = new Class316();

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "[I")
	public static final int[] anIntArray23 = new int[14];

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!lj;IIII)Lclient!nea;")
	public static Class46_Sub2_Sub1 method472(@OriginalArg(0) int arg0, @OriginalArg(1) Class78_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.aBoolean412 || Static166.method6223(arg3) && Static166.method6223(arg0)) {
			return new Class46_Sub2_Sub1(arg1, 3553, arg2, arg4, arg3, arg0, true);
		} else if (arg1.aBoolean436) {
			return new Class46_Sub2_Sub1(arg1, 34037, arg2, arg4, arg3, arg0, true);
		} else {
			return new Class46_Sub2_Sub1(arg1, arg2, arg4, arg3, arg0, Static122.method2187(arg3), Static122.method2187(arg0), true);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIZ)I")
	public static int method473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg2;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ac;B)Lclient!kp;")
	public static Class194 method474(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(7) int local7 = arg0.method7974();
		@Pc(14) Class259 local14 = Static179.method2831()[arg0.method7974()];
		@Pc(21) Class216 local21 = Static570.method7672()[arg0.method7974()];
		@Pc(25) int local25 = arg0.method7975();
		@Pc(29) int local29 = arg0.method7975();
		@Pc(33) int local33 = arg0.method7945();
		@Pc(37) int local37 = arg0.method7945();
		@Pc(41) int local41 = arg0.method7940();
		@Pc(45) int local45 = arg0.method7940();
		@Pc(49) int local49 = arg0.method7940();
		@Pc(63) boolean local63 = arg0.method7974() == 1;
		return new Class194(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local63);
	}
}
