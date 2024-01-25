import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!dm", name = "s", descriptor = "Lclient!ir;")
	public static Class100 aClass100_37;

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "Lclient!m;")
	public static final Class127 aClass127_6 = new Class127();

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZZIIZII)V")
	public static void method1707(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 <= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg2 + arg4) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) Class58_Sub1 local21 = Static302.aClass58_Sub1Array2[local15];
		Static302.aClass58_Sub1Array2[local15] = Static302.aClass58_Sub1Array2[arg4];
		Static302.aClass58_Sub1Array2[arg4] = local21;
		for (@Pc(33) int local33 = arg2; local33 < arg4; local33++) {
			if (Static232.method3998(arg5, arg1, local21, arg3, arg0, Static302.aClass58_Sub1Array2[local33]) <= 0) {
				@Pc(53) Class58_Sub1 local53 = Static302.aClass58_Sub1Array2[local33];
				Static302.aClass58_Sub1Array2[local33] = Static302.aClass58_Sub1Array2[local17];
				Static302.aClass58_Sub1Array2[local17++] = local53;
			}
		}
		Static302.aClass58_Sub1Array2[arg4] = Static302.aClass58_Sub1Array2[local17];
		Static302.aClass58_Sub1Array2[local17] = local21;
		method1707(arg0, arg1, arg2, arg3, local17 - 1, arg5);
		method1707(arg0, arg1, local17 + 1, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public static void method1709() {
		Static243.aClass198_46.method5230();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIZ)I")
	public static int method1710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static89.anIntArray561[arg0 & 0x3] : 256;
	}
}
