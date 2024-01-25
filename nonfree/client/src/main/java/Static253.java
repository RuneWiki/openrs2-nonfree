import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	public static int anInt4127;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_76 = new Class216(59, 3);

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "Lclient!ifa;")
	public static final Class163 aClass163_23 = new Class163();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
	public static void method3677() {
		if (Static638.aClass64_4 != null) {
			Static638.aClass64_4.method2209();
		}
		if (Static585.aClass64_3 != null) {
			Static585.aClass64_3.method2209();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!kq;)Lclient!kq;")
	public static Class199 method3678(@OriginalArg(1) Class199 arg0) {
		@Pc(11) Class199 local11 = Static75.method1607(arg0);
		if (local11 == null) {
			local11 = arg0.aClass199_8;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public static void method3679() {
		for (@Pc(10) int local10 = 0; local10 < Static257.anInt4179; local10++) {
			@Pc(21) int local21 = Static130.method2322(local10 + Static280.anInt10342, Static257.anInt4179) * Static217.anInt3516;
			for (@Pc(23) int local23 = 0; local23 < Static217.anInt3516; local23++) {
				@Pc(34) int local34 = Static130.method2322(Static473.anInt7504 + local23, Static217.anInt3516) + local21;
				if (Static604.anInt9294 == Static131.anIntArray159[local34]) {
					Static151.anInterface18Array1[local34].method8692(0, 0, Static614.anInt9423, Static567.anInt8756, local23 * Static614.anInt9423, local10 * Static567.anInt8756);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BZ)Z")
	public static boolean method3680(@OriginalArg(1) boolean arg0) {
		@Pc(14) boolean local14 = Static582.aClass33_13.method8136();
		if (local14 == arg0) {
			return true;
		}
		if (!arg0) {
			Static582.aClass33_13.method8073();
		} else if (!Static582.aClass33_13.method8074()) {
			arg0 = false;
		}
		if (local14 == arg0) {
			return false;
		} else {
			Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub29_1, arg0 ? 1 : 0);
			Static361.method4808();
			return true;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([Lclient!gda;II)V")
	public static void method3681(@OriginalArg(0) Class3_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class3_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9920;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9920 > local27 + (local29 & 0x1)) {
				@Pc(44) Class3_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method3681(arg0, arg1, local10 - 1);
		method3681(arg0, local10 + 1, arg2);
	}
}
