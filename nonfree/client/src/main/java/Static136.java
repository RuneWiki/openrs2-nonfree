import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!faa", name = "D", descriptor = "I")
	public static int anInt3255;

	@OriginalMember(owner = "client!faa", name = "S", descriptor = "I")
	public static int anInt3266;

	@OriginalMember(owner = "client!faa", name = "L", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_105 = new Class123(45, -2);

	@OriginalMember(owner = "client!faa", name = "R", descriptor = "Lclient!sba;")
	public static final Class297 aClass297_11 = new Class297(16);

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I[BIIIB)V")
	public static void method2655(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		arg1 += arg3;
		@Pc(24) int local24 = arg2 - arg3 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg2 - arg3 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(29) int local29 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg0[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg0[local34] = 1;
			arg1 = local39 + 1;
			arg0[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILclient!pca;)Lclient!pca;")
	public static Class251 method2656(@OriginalArg(1) Class251 arg0) {
		if (arg0.anInt7280 != -1) {
			return Static105.method2180(arg0.anInt7280);
		}
		@Pc(19) int local19 = arg0.anInt7279 >>> 16;
		@Pc(24) Class242 local24 = new Class242(Static204.aClass297_16);
		for (@Pc(29) Class3_Sub49 local29 = (Class3_Sub49) local24.method5560(); local29 != null; local29 = (Class3_Sub49) local24.method5563()) {
			if (local29.anInt9244 == local19) {
				return Static105.method2180((int) local29.aLong262);
			}
		}
		return null;
	}
}
