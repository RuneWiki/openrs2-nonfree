import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
	public static int anInt2892;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "Lclient!ko;")
	public static final Class134 aClass134_4 = new Class134("LIVE", 0);

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
	public static int anInt2891 = 0;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_51 = new Class217(31, 8);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "([SI[Ljava/lang/String;IB)V")
	public static void method2174(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(12) int local12 = (arg1 + arg3) / 2;
		@Pc(14) int local14 = arg1;
		@Pc(18) String local18 = arg2[local12];
		arg2[local12] = arg2[arg3];
		arg2[arg3] = local18;
		@Pc(32) short local32 = arg0[local12];
		arg0[local12] = arg0[arg3];
		arg0[arg3] = local32;
		for (@Pc(44) int local44 = arg1; local44 < arg3; local44++) {
			if (local18 == null || arg2[local44] != null && arg2[local44].compareTo(local18) < (local44 & 0x1)) {
				@Pc(68) String local68 = arg2[local44];
				arg2[local44] = arg2[local14];
				arg2[local14] = local68;
				@Pc(82) short local82 = arg0[local44];
				arg0[local44] = arg0[local14];
				arg0[local14++] = local82;
			}
		}
		arg2[arg3] = arg2[local14];
		arg2[local14] = local18;
		arg0[arg3] = arg0[local14];
		arg0[local14] = local32;
		method2174(arg0, arg1, arg2, local14 - 1);
		method2174(arg0, local14 + 1, arg2, arg3);
	}
}
