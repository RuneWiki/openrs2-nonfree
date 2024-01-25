import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!ija", name = "I", descriptor = "Lclient!ne;")
	public static Class247 aClass247_9;

	@OriginalMember(owner = "client!ija", name = "N", descriptor = "I")
	public static int anInt4782;

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(Lclient!jha;I)I")
	public static int method4024(@OriginalArg(0) Class28_Sub1_Sub4_Sub2_Sub2 arg0) {
		@Pc(11) int local11 = arg0.anInt5550;
		@Pc(15) Class167 local15 = arg0.method4580();
		if (arg0.anInt5479 == -1 || arg0.aBoolean470) {
			local11 = arg0.anInt5563;
		} else if (arg0.anInt5479 == local15.anInt4897 || arg0.anInt5479 == local15.anInt4909 || local15.anInt4900 == arg0.anInt5479 || local15.anInt4893 == arg0.anInt5479) {
			local11 = arg0.anInt5529;
		} else if (local15.anInt4881 == arg0.anInt5479 || local15.anInt4879 == arg0.anInt5479 || arg0.anInt5479 == local15.anInt4882 || local15.anInt4876 == arg0.anInt5479) {
			local11 = arg0.anInt5532;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(ZIII)V")
	public static void method4026(@OriginalArg(0) boolean arg0) {
		Static58.anInt859 = 2;
		Static143.aBoolean243 = arg0;
		Static302.anInt5797 = 22050;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(Lclient!ft;B)I")
	public static int method4028(@OriginalArg(0) Class28_Sub1_Sub4_Sub2_Sub1 arg0) {
		@Pc(14) Class134 local14 = arg0.aClass134_1;
		if (local14.anIntArray191 != null) {
			local14 = local14.method3276(Static161.aClass237_3);
			if (local14 == null) {
				return -1;
			}
		}
		@Pc(29) int local29 = local14.anInt3815;
		@Pc(33) Class167 local33 = arg0.method4580();
		if (arg0.anInt5479 == -1 || arg0.aBoolean470) {
			local29 = local14.anInt3828;
		} else if (local33.anInt4897 == arg0.anInt5479 || local33.anInt4909 == arg0.anInt5479 || local33.anInt4900 == arg0.anInt5479 || arg0.anInt5479 == local33.anInt4893) {
			local29 = local14.lb;
		} else if (arg0.anInt5479 == local33.anInt4881 || arg0.anInt5479 == local33.anInt4879 || arg0.anInt5479 == local33.anInt4882 || arg0.anInt5479 == local33.anInt4876) {
			local29 = local14.anInt3843;
		}
		return local29;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(IZ)Z")
	public static boolean method4029(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
