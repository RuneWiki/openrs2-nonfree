import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "Z")
	public static boolean aBoolean207;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Lclient!cg;")
	public static Class22 aClass22_57;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!pc;")
	public static Class129 aClass129_1 = new Class129();

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
	public static int anInt3217 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(JI)V")
	public static void method2533(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static149.anInt2911; local12++) {
			if (arg0 == Static262.aLongArray9[local12]) {
				Static149.anInt2911--;
				for (@Pc(35) int local35 = local12; local35 < Static149.anInt2911; local35++) {
					Static135.aStringArray15[local35] = Static135.aStringArray15[local35 + 1];
					Static73.anIntArray139[local35] = Static73.anIntArray139[local35 + 1];
					Static71.aStringArray8[local35] = Static71.aStringArray8[local35 + 1];
					Static262.aLongArray9[local35] = Static262.aLongArray9[local35 + 1];
					Static133.anIntArray225[local35] = Static133.anIntArray225[local35 + 1];
					Static39.aBooleanArray13[local35] = Static39.aBooleanArray13[local35 + 1];
				}
				Static279.anInt5479 = Static131.anInt1441;
				Static175.aClass4_Sub24_Sub1_1.method3123(233);
				Static175.aClass4_Sub24_Sub1_1.method3079(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII)Lclient!in;")
	public static Class78 method2536(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(27) long local27 = ((long) arg3 & 0xFFFFL) << 16 | ((long) arg1 & 0xFFFFL) << 48 | ((long) arg0 & 0xFFFFL) << 32 | (long) arg2 & 0xFFFFL;
		@Pc(33) Class78 local33 = (Class78) Static144.aClass172_24.method4347(local27);
		if (local33 != null) {
			return local33;
		}
		@Pc(49) Class6[] local49 = null;
		@Pc(53) Class102 local53 = Static92.method1529(arg2);
		if (local53.anIntArray271 != null) {
			local49 = new Class6[local53.anIntArray271.length];
			for (@Pc(63) int local63 = 0; local63 < local49.length; local63++) {
				@Pc(74) Class7 local74 = Static191.method3159(local53.anIntArray271[local63]);
				local49[local63] = new Class6(local74.anInt137, local74.anInt130, local74.anInt139, local74.anInt143, local74.anInt135, local74.anInt131, local74.anInt141, local74.aBoolean12);
			}
		}
		local33 = new Class78(local53.anInt3304, local49, local53.anInt3305, arg1, arg0, arg3);
		Static144.aClass172_24.method4345(local33, local27);
		return local33;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2537(@OriginalArg(1) long arg0) {
		return Static114.method1915(arg0);
	}
}
