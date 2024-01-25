import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ju", name = "J", descriptor = "I")
	public static int anInt4984;

	@OriginalMember(owner = "client!ju", name = "M", descriptor = "Lclient!an;")
	public static Class16 aClass16_65;

	@OriginalMember(owner = "client!ju", name = "T", descriptor = "I")
	public static int anInt4993;

	@OriginalMember(owner = "client!ju", name = "D", descriptor = "J")
	public static long aLong131 = 20000000L;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)Lclient!bi;")
	public static Class33 method4181(@OriginalArg(0) int arg0) {
		@Pc(8) Class33[] local8 = Static344.method5419();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class33 local16 = local8[local10];
			if (local16.anInt788 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([JIII[I)V")
	public static void method4184(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg2) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) long local25 = arg0[local19];
		arg0[local19] = arg0[arg1];
		arg0[arg1] = local25;
		@Pc(39) int local39 = arg3[local19];
		arg3[local19] = arg3[arg1];
		arg3[arg1] = local39;
		@Pc(57) int local57 = local25 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg2; local59 < arg1; local59++) {
			if (arg0[local59] < local25 + (long) (local57 & local59)) {
				@Pc(76) long local76 = arg0[local59];
				arg0[local59] = arg0[local21];
				arg0[local21] = local76;
				@Pc(90) int local90 = arg3[local59];
				arg3[local59] = arg3[local21];
				arg3[local21++] = local90;
			}
		}
		arg0[arg1] = arg0[local21];
		arg0[local21] = local25;
		arg3[arg1] = arg3[local21];
		arg3[local21] = local39;
		method4184(arg0, local21 - 1, arg2, arg3);
		method4184(arg0, arg1, local21 + 1, arg3);
	}
}
