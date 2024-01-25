import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!rha", name = "o", descriptor = "Lclient!ob;")
	public static final Class260 aClass260_3 = new Class260();

	@OriginalMember(owner = "client!rha", name = "S", descriptor = "Lclient!ob;")
	public static final Class260 aClass260_4 = new Class260();

	@OriginalMember(owner = "client!rha", name = "j", descriptor = "[Lclient!ob;")
	public static final Class260[] aClass260Array1 = new Class260[] { aClass260_4, aClass260_3 };

	@OriginalMember(owner = "client!rha", name = "e", descriptor = "I")
	public static final int anInt8619 = 4;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(BI[BIII)V")
	public static void method7533(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(17) int local17 = arg0 - arg3 >> 2;
		arg2 += arg3;
		while (true) {
			local17--;
			if (local17 < 0) {
				local17 = arg0 - arg3 & 0x3;
				while (true) {
					local17--;
					if (local17 < 0) {
						return;
					}
					arg1[arg2++] = 1;
				}
			}
			@Pc(26) int local26 = arg2 + 1;
			arg1[arg2] = 1;
			@Pc(31) int local31 = local26 + 1;
			arg1[local26] = 1;
			@Pc(36) int local36 = local31 + 1;
			arg1[local31] = 1;
			arg2 = local36 + 1;
			arg1[local36] = 1;
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V")
	public static void method7540() {
		Static688.aClass359_70.method8507();
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method7546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg4 + arg0;
		@Pc(12) int local12 = arg1 + arg2;
		@Pc(16) int local16 = arg3 + arg5;
		if (!Static44.method541(arg4, local12, local12, arg5, arg4, local12, local16, local16, local8)) {
			return false;
		} else if (Static44.method541(arg4, local12, local12, arg5, local8, local12, arg5, local16, local8)) {
			if (arg4 < Static67.anInt814) {
				if (!Static44.method541(arg4, arg2, local12, local16, arg4, local12, arg5, local16, arg4)) {
					return false;
				}
				if (!Static44.method541(arg4, arg2, arg2, local16, arg4, local12, arg5, arg5, arg4)) {
					return false;
				}
			} else if (!Static44.method541(local8, arg2, local12, local16, local8, local12, arg5, local16, local8)) {
				return false;
			} else if (!Static44.method541(local8, arg2, arg2, local16, local8, local12, arg5, arg5, local8)) {
				return false;
			}
			if (arg5 < Static139.anInt2877) {
				if (!Static44.method541(arg4, arg2, local12, arg5, arg4, local12, arg5, arg5, local8)) {
					return false;
				}
				if (!Static44.method541(arg4, arg2, arg2, arg5, local8, local12, arg5, arg5, local8)) {
					return false;
				}
			} else if (!Static44.method541(arg4, arg2, local12, local16, arg4, local12, local16, local16, local8)) {
				return false;
			} else if (!Static44.method541(arg4, arg2, arg2, local16, local8, local12, local16, local16, local8)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IILclient!fw;II)V")
	public static void method7547(@OriginalArg(1) int arg0, @OriginalArg(2) Class125 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class6_Sub35 local10 = (Class6_Sub35) Static549.aClass340_69.method8124(); local10 != null; local10 = (Class6_Sub35) Static549.aClass340_69.method8134()) {
			if (arg3 == local10.anInt6192 && arg2 << 9 == local10.anInt6189 && local10.anInt6190 == arg0 << 9 && arg1.anInt3629 == local10.aClass125_1.anInt3629) {
				if (local10.aClass6_Sub17_Sub2_2 != null) {
					Static544.aClass6_Sub17_Sub3_2.method4663(local10.aClass6_Sub17_Sub2_2);
					local10.aClass6_Sub17_Sub2_2 = null;
				}
				if (local10.aClass6_Sub17_Sub2_3 != null) {
					Static544.aClass6_Sub17_Sub3_2.method4663(local10.aClass6_Sub17_Sub2_3);
					local10.aClass6_Sub17_Sub2_3 = null;
				}
				local10.method9051();
				return;
			}
		}
	}
}
