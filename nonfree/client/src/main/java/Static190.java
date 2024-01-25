import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	public static int anInt3507;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_76 = new Class254(49, 1);

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_77 = new Class254(4, 16);

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([Ljava/lang/Object;IZI[J)V")
	public static void method3005(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg1) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) long local25 = arg3[local19];
		arg3[local19] = arg3[arg2];
		arg3[arg2] = local25;
		@Pc(39) Object local39 = arg0[local19];
		arg0[local19] = arg0[arg2];
		arg0[arg2] = local39;
		@Pc(57) int local57 = local25 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg1; local59 < arg2; local59++) {
			if (arg3[local59] < (long) (local57 & local59) + local25) {
				@Pc(80) long local80 = arg3[local59];
				arg3[local59] = arg3[local21];
				arg3[local21] = local80;
				@Pc(94) Object local94 = arg0[local59];
				arg0[local59] = arg0[local21];
				arg0[local21++] = local94;
			}
		}
		arg3[arg2] = arg3[local21];
		arg3[local21] = local25;
		arg0[arg2] = arg0[local21];
		arg0[local21] = local39;
		method3005(arg0, arg1, local21 - 1, arg3);
		method3005(arg0, local21 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Lclient!a;")
	public static Class1_Sub1_Sub1 method3007(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub1_Sub1 local15 = (Class1_Sub1_Sub1) Static298.aClass51_16.method930((long) arg1 << 32 | (long) arg0);
		if (local15 == null) {
			local15 = new Class1_Sub1_Sub1(arg1, arg0);
			Static298.aClass51_16.method931(local15, local15.aLong237);
		}
		return local15;
	}
}
