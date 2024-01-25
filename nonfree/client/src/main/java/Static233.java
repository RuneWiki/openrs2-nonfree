import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!in", name = "c", descriptor = "Lclient!efa;")
	public static Class15_Sub1_Sub2_Sub2_Sub1 aClass15_Sub1_Sub2_Sub2_Sub1_2;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "J")
	public static long aLong132 = 20000000L;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "Lclient!jl;")
	public static final Class159 aClass159_3 = new Class159(64);

	@OriginalMember(owner = "client!in", name = "f", descriptor = "I")
	public static int anInt5269 = 0;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I[ILclient!pk;I)V")
	public static void method4304(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class15_Sub1_Sub2_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg1.anIntArray434 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg1.anIntArray434.length; local12++) {
				if (arg1.anIntArray434[local12] != arg0[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg1.anInt8105 != -1) {
				@Pc(49) Class97 local49 = Static28.aClass220_1.method5670(arg1.anInt8105);
				@Pc(52) int local52 = local49.anInt3603;
				if (local52 == 1) {
					arg1.anInt8049 = 1;
					arg1.anInt8094 = arg2;
					arg1.anInt8119 = 0;
					arg1.anInt8063 = 0;
					arg1.anInt8080 = 0;
					if (!arg1.aBoolean583) {
						Static522.method7447(arg1, local49, arg1.anInt8063);
					}
				}
				if (local52 == 2) {
					arg1.anInt8119 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] != -1) {
				local10 = false;
			}
			if (arg1.anIntArray434 == null || arg1.anIntArray434[local12] == -1 || Static28.aClass220_1.method5670(arg0[local12]).anInt3613 >= Static28.aClass220_1.method5670(arg1.anIntArray434[local12]).anInt3613) {
				arg1.anIntArray434 = arg0;
				arg1.anInt8140 = arg1.anInt8137;
				arg1.anInt8094 = arg2;
			}
		}
		if (local10) {
			arg1.anIntArray434 = arg0;
			arg1.anInt8140 = arg1.anInt8137;
			arg1.anInt8094 = arg2;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)I")
	public static int method4305(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}
}
