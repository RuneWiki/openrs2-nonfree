import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!vfa", name = "e", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_147 = new Class276(45, -1);

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I[II[JI)V")
	public static void method8089(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg3) / 2;
		@Pc(17) int local17 = arg0;
		@Pc(21) long local21 = arg2[local15];
		arg2[local15] = arg2[arg3];
		arg2[arg3] = local21;
		@Pc(35) int local35 = arg1[local15];
		arg1[local15] = arg1[arg3];
		arg1[arg3] = local35;
		@Pc(55) int local55 = ~local21 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg0; local57 < arg3; local57++) {
			if (arg2[local57] < (long) (local57 & local55) + local21) {
				@Pc(78) long local78 = arg2[local57];
				arg2[local57] = arg2[local17];
				arg2[local17] = local78;
				@Pc(92) int local92 = arg1[local57];
				arg1[local57] = arg1[local17];
				arg1[local17++] = local92;
			}
		}
		arg2[arg3] = arg2[local17];
		arg2[local17] = local21;
		arg1[arg3] = arg1[local17];
		arg1[local17] = local35;
		method8089(arg0, arg1, arg2, local17 - 1);
		method8089(local17 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!fd;I)Lclient!ku;")
	public static Class3_Sub1 method8091(@OriginalArg(0) Class3_Sub7 arg0) {
		arg0.method6538();
		@Pc(13) int local13 = arg0.method6538();
		@Pc(17) Class3_Sub1 local17 = Static212.method3724(local13);
		local17.anInt10368 = arg0.method6538();
		@Pc(26) int local26 = arg0.method6538();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method6538();
			local17.method8372(local34, arg0);
		}
		local17.method8365();
		return local17;
	}
}
