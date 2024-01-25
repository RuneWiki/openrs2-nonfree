import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!vt", name = "K", descriptor = "[I")
	public static int[] anIntArray705;

	@OriginalMember(owner = "client!vt", name = "z", descriptor = "I")
	public static int anInt10181 = 0;

	@OriginalMember(owner = "client!vt", name = "B", descriptor = "Lclient!hga;")
	public static final Class4_Sub22 aClass4_Sub22_1 = new Class4_Sub22(0, 0);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!kg;I)V")
	public static void method8632(@OriginalArg(0) Class3_Sub1_Sub2_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt9987 == Static177.anInt3088 || arg0.anInt9981 == -1 || arg0.anInt9934 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class124 local26 = Static99.aClass2_1.method22(arg0.anInt9981);
			if (local26.aBoolean219 || arg0.anInt9941 + 1 > local26.anIntArray221[arg0.anInt9960]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt9987 - arg0.anInt9945;
			@Pc(60) int local60 = Static177.anInt3088 - arg0.anInt9945;
			@Pc(72) int local72 = arg0.anInt9952 * 512 + arg0.method8514() * 256;
			@Pc(84) int local84 = arg0.anInt9969 * 512 + arg0.method8514() * 256;
			@Pc(95) int local95 = arg0.anInt9933 * 512 + arg0.method8514() * 256;
			@Pc(107) int local107 = arg0.anInt9966 * 512 + arg0.method8514() * 256;
			arg0.anInt9925 = (local95 * local60 + (local54 - local60) * local72) / local54;
			arg0.anInt9917 = (local60 * local107 + local84 * (local54 - local60)) / local54;
		}
		arg0.anInt10002 = 0;
		if (arg0.anInt9979 == 0) {
			arg0.method8526(8192, false);
		}
		if (arg0.anInt9979 == 1) {
			arg0.method8526(12288, false);
		}
		if (arg0.anInt9979 == 2) {
			arg0.method8526(0, false);
		}
		if (arg0.anInt9979 == 3) {
			arg0.method8526(4096, false);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
	public static void method8634(@OriginalArg(1) int arg0) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg0, 10);
		local9.method3956();
	}
}
