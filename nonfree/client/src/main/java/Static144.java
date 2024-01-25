import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "Lclient!dn;")
	public static Class56 aClass56_36;

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "[I")
	public static int[] anIntArray241;

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "Lclient!tu;")
	public static final Class229 aClass229_24 = new Class229();

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "[I")
	public static final int[] anIntArray242 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
	public static int anInt3223 = 0;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "([BZIIILclient!gk;II)Lclient!cw;")
	public static Class42_Sub1_Sub1 method2562(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class75_Sub2 arg2, @OriginalArg(7) int arg3) {
		if (arg2.aBoolean239 || Static39.method920(arg3) && Static39.method920(arg1)) {
			return new Class42_Sub1_Sub1(arg2, 3553, 6406, arg3, arg1, false, arg0, 6406);
		} else if (arg2.aBoolean244) {
			return new Class42_Sub1_Sub1(arg2, 34037, 6406, arg3, arg1, false, arg0, 6406);
		} else {
			return new Class42_Sub1_Sub1(arg2, 6406, arg3, arg1, Static350.method4984(arg3), Static350.method4984(arg1), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = Static439.method5863(arg0, Static163.anInt3488, Static161.anInt3448);
		@Pc(15) int local15 = Static439.method5863(arg3, Static163.anInt3488, Static161.anInt3448);
		@Pc(21) int local21 = Static439.method5863(arg4, Static450.anInt7594, Static142.anInt3212);
		@Pc(27) int local27 = Static439.method5863(arg2, Static450.anInt7594, Static142.anInt3212);
		@Pc(35) int local35 = Static439.method5863(arg6 + arg0, Static163.anInt3488, Static161.anInt3448);
		@Pc(44) int local44 = Static439.method5863(arg3 - arg6, Static163.anInt3488, Static161.anInt3448);
		for (@Pc(46) int local46 = local9; local46 < local35; local46++) {
			Static15.method463(arg1, Static376.anIntArrayArray64[local46], local21, local27);
		}
		for (@Pc(61) int local61 = local15; local61 > local44; local61--) {
			Static15.method463(arg1, Static376.anIntArrayArray64[local61], local21, local27);
		}
		@Pc(87) int local87 = Static439.method5863(arg6 + arg4, Static450.anInt7594, Static142.anInt3212);
		@Pc(96) int local96 = Static439.method5863(arg2 - arg6, Static450.anInt7594, Static142.anInt3212);
		for (@Pc(98) int local98 = local35; local98 <= local44; local98++) {
			@Pc(103) int[] local103 = Static376.anIntArrayArray64[local98];
			Static15.method463(arg1, local103, local21, local87);
			Static15.method463(arg5, local103, local87, local96);
			Static15.method463(arg1, local103, local96, local27);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!eo;III)V")
	public static void method2565(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static364.aClass68_11 = arg0;
		Static50.anInt1231 = arg1;
		Static214.anInt4209 = arg2;
	}
}
