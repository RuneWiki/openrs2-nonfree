import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
	public static int anInt4138;

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_42 = new Class185(77, -1);

	@OriginalMember(owner = "client!gl", name = "M", descriptor = "Lclient!cm;")
	public static final Class52 aClass52_67 = new Class52();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3507(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBI)Z")
	public static boolean method3512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static406.method6371(arg0, arg1) & Static9.method494(arg0, arg1);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([Lclient!gg;II)V")
	public static void method3513(@OriginalArg(0) Class9_Sub4[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class9_Sub4 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10359;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10359 > local27 + (local29 & 0x1)) {
				@Pc(44) Class9_Sub4 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method3513(arg0, arg1, local10 - 1);
		method3513(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I[BIIIII[BI)V")
	public static void method3514(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(23) int local23 = -(arg4 >> 2);
		@Pc(28) int local28 = -(arg4 & 0x3);
		for (@Pc(31) int local31 = -arg2; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local23; local35 < 0; local35++) {
				local39 = arg7++;
				arg1[local39] += arg6[arg0++];
				@Pc(51) int local51 = arg7++;
				arg1[local51] += arg6[arg0++];
				@Pc(63) int local63 = arg7++;
				arg1[local63] += arg6[arg0++];
				@Pc(75) int local75 = arg7++;
				arg1[local75] += arg6[arg0++];
			}
			for (@Pc(90) int local90 = local28; local90 < 0; local90++) {
				local39 = arg7++;
				arg1[local39] += arg6[arg0++];
			}
			arg0 += arg5;
			arg7 += arg3;
		}
	}
}
