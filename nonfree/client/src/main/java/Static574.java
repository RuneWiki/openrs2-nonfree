import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
	public static int anInt8994;

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "[Lclient!ip;")
	public static final Class4_Sub1_Sub1_Sub2_Sub1[] aClass4_Sub1_Sub1_Sub2_Sub1Array1 = new Class4_Sub1_Sub1_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
	public static int anInt8997 = 0;

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)V")
	public static void method7720(@OriginalArg(0) int arg0) {
		@Pc(16) Class5_Sub1_Sub18 local16 = Static123.method1827((long) arg0, 2);
		local16.method7444();
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!ha;IZI)Lclient!jv;")
	public static Class194 method7722(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 == -1) {
			return null;
		}
		if (Static54.anIntArray64 != null) {
			for (@Pc(17) int local17 = 0; local17 < Static54.anIntArray64.length; local17++) {
				if (arg1 == Static54.anIntArray64[local17]) {
					return Static645.aClass194Array1[local17];
				}
			}
		}
		@Pc(51) Class194 local51 = (Class194) Static68.aClass168_60.method3860((long) arg1);
		if (local51 != null) {
			if (arg2 && local51.aClass196_20 == null) {
				@Pc(67) Class196 local67 = Static321.method4907(Static153.aClass126_88, arg1);
				if (local67 == null) {
					return null;
				}
				local51.aClass196_20 = local67;
			}
			return local51;
		}
		@Pc(81) Class362[] local81 = Static692.method8270(Static471.aClass126_219, arg1);
		if (local81 == null) {
			return null;
		}
		@Pc(91) Class196 local91 = Static321.method4907(Static153.aClass126_88, arg1);
		if (local91 == null) {
			return null;
		}
		if (arg2) {
			local51 = new Class194(arg0.method8612(local91, local81), local91);
		} else {
			local51 = new Class194(arg0.method8612(local91, local81));
		}
		Static68.aClass168_60.method3853((long) arg1, local51);
		return local51;
	}
}
