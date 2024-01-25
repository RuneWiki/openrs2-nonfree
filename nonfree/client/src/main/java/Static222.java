import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "B")
	public static byte aByte34;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "[I")
	public static final int[] anIntArray370 = new int[13];

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_152 = new Class18(4, 7);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([JI[Ljava/lang/Object;II)V")
	public static void method4132(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(27) int local27 = (arg3 + arg2) / 2;
		@Pc(29) int local29 = arg2;
		@Pc(33) long local33 = arg0[local27];
		arg0[local27] = arg0[arg3];
		arg0[arg3] = local33;
		@Pc(47) Object local47 = arg1[local27];
		arg1[local27] = arg1[arg3];
		arg1[arg3] = local47;
		for (@Pc(59) int local59 = arg2; local59 < arg3; local59++) {
			if (local33 + (long) (local59 & 0x1) > arg0[local59]) {
				@Pc(80) long local80 = arg0[local59];
				arg0[local59] = arg0[local29];
				arg0[local29] = local80;
				@Pc(94) Object local94 = arg1[local59];
				arg1[local59] = arg1[local29];
				arg1[local29++] = local94;
			}
		}
		arg0[arg3] = arg0[local29];
		arg0[local29] = local33;
		arg1[arg3] = arg1[local29];
		arg1[local29] = local47;
		method4132(arg0, arg1, arg2, local29 - 1);
		method4132(arg0, arg1, local29 + 1, arg3);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)Z")
	public static boolean method4134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Interface4 local9 = (Interface4) Static342.method5727(arg1, arg2, arg0);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static113.method2411(local9) & true;
		}
		local9 = (Interface4) Static138.method2791(arg1, arg2, arg0, jb.class);
		if (local9 != null) {
			local11 &= Static113.method2411(local9);
		}
		local9 = (Interface4) Static109.method2324(arg1, arg2, arg0);
		if (local9 != null) {
			local11 &= Static113.method2411(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BZ)[B")
	public static byte[] method4135(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static374.method2826(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
