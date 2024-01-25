import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!it", name = "h", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_46 = new Class231(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!it", name = "g", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_49 = new Class186(61, -2);

	@OriginalMember(owner = "client!it", name = "i", descriptor = "I")
	public static int anInt3049 = 0;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!tf;IBI)J")
	public static long method2747(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = 2147483648L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(21) Class118 local21 = Static113.aClass127_2.method2820(arg0.method5812());
		@Pc(42) long local42 = (long) ((arg1 | 0x800000) << 7 | arg2 | arg0.method5807() << 14 | arg0.method5811() << 20);
		if (local21.anInt2984 == 0) {
			local42 |= local14;
		}
		if (local21.anInt3023 == 1) {
			local42 |= local10;
		}
		if (local21.aBoolean209) {
			local42 |= local12;
		}
		return local42 | (long) arg0.method5812() << 32;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!ha;B)Lclient!et;")
	public static Class6_Sub2 method2749(@OriginalArg(0) Class6_Sub15 arg0) {
		arg0.method3111();
		@Pc(21) int local21 = arg0.method3111();
		@Pc(25) Class6_Sub2 local25 = Static136.method2215(local21);
		local25.anInt7158 = arg0.method3111();
		@Pc(34) int local34 = arg0.method3111();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(42) int local42 = arg0.method3111();
			local25.method5861(arg0, local42);
		}
		local25.method5862();
		return local25;
	}
}
