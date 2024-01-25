import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ih", name = "S", descriptor = "Lclient!lt;")
	public static Class159 aClass159_1;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(Z)V")
	public static void method2915() {
		@Pc(5) Class267 local5 = Static416.aClass267_78;
		synchronized (Static416.aClass267_78) {
			Static416.aClass267_78.method6013();
		}
		local5 = Static284.aClass267_51;
		synchronized (Static284.aClass267_51) {
			Static284.aClass267_51.method6013();
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IZ)Lclient!nd;")
	public static Class40_Sub5 method2916(@OriginalArg(0) int arg0) {
		@Pc(12) Class240[] local12 = Class10_Sub2_Sub28.aClass240Array1;
		synchronized (Class10_Sub2_Sub28.aClass240Array1) {
			@Pc(28) Class40_Sub5 local28;
			if (Class10_Sub2_Sub28.aClass240Array1.length <= arg0 || Class10_Sub2_Sub28.aClass240Array1[arg0].method5235()) {
				local28 = new Class40_Sub5();
				local28.aClass40_Sub8Array1 = new Class40_Sub8[arg0];
				for (@Pc(34) int local34 = 0; local34 < arg0; local34++) {
					local28.aClass40_Sub8Array1[local34] = new Class40_Sub8();
				}
			} else {
				local28 = (Class40_Sub5) Class10_Sub2_Sub28.aClass240Array1[arg0].method5233();
				local28.method4364();
				@Pc(67) int local67 = Static136.anIntArray279[arg0]--;
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(III)I")
	public static int method2920(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 0;
		while (arg1 > 0) {
			local5 = arg0 & 0x1 | local5 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local5;
	}
}
