import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!mm", name = "K", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_69 = new Class186(48, 1);

	@OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
	public static int anInt4245 = 0;

	@OriginalMember(owner = "client!mm", name = "O", descriptor = "Lclient!te;")
	public static final Class6_Sub35 aClass6_Sub35_1 = new Class6_Sub35(0, 0);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IILclient!lt;I)Lclient!wr;")
	public static Class266 method3846(@OriginalArg(0) int arg0, @OriginalArg(2) Class158 arg1) {
		@Pc(9) byte[] local9 = arg1.method3672(0, arg0);
		return local9 == null ? null : new Class266(local9);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!hf;IB)I")
	public static int method3847(@OriginalArg(0) Class103 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V")
	public static void method3848() {
		Static56.method1055();
		Static88.method1553();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([Ljava/lang/Object;II[II)V")
	public static void method3849(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(23) int local23 = (arg2 + arg1) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) int local29 = arg3[local23];
		arg3[local23] = arg3[arg2];
		arg3[arg2] = local29;
		@Pc(43) Object local43 = arg0[local23];
		arg0[local23] = arg0[arg2];
		arg0[arg2] = local43;
		@Pc(60) int local60 = local29 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg1; local62 < arg2; local62++) {
			if (local29 + (local60 & local62) > arg3[local62]) {
				@Pc(78) int local78 = arg3[local62];
				arg3[local62] = arg3[local25];
				arg3[local25] = local78;
				@Pc(92) Object local92 = arg0[local62];
				arg0[local62] = arg0[local25];
				arg0[local25++] = local92;
			}
		}
		arg3[arg2] = arg3[local25];
		arg3[local25] = local29;
		arg0[arg2] = arg0[local25];
		arg0[local25] = local43;
		method3849(arg0, arg1, local25 - 1, arg3);
		method3849(arg0, local25 + 1, arg2, arg3);
	}
}
