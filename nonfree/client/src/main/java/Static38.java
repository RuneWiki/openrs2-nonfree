import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bca", name = "Lb", descriptor = "I")
	public static int anInt792 = 1;

	@OriginalMember(owner = "client!bca", name = "Ob", descriptor = "Lclient!in;")
	public static final Class169 aClass169_24 = new Class169(91, 6);

	@OriginalMember(owner = "client!bca", name = "Qb", descriptor = "[I")
	public static final int[] anIntArray44 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I[II[IILclient!mj;)Lclient!lh;")
	public static Class1_Sub3 method787(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class101_Sub1 arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg4.method5850(Static612.aClass244_15, Static114.aClass79_7)) {
			@Pc(69) int[] local69 = new int[arg3 * arg0];
			for (local23 = 0; local23 < arg0; local23++) {
				local33 = local23 * arg3 + arg2[local23];
				for (local35 = 0; local35 < arg1[local23]; local35++) {
					local69[local33++] = -16777216;
				}
			}
			return new Class1_Sub3(arg4, arg3, arg0, local69);
		}
		@Pc(21) byte[] local21 = new byte[arg3 * arg0];
		for (local23 = 0; local23 < arg0; local23++) {
			local33 = arg2[local23] + local23 * arg3;
			for (local35 = 0; local35 < arg1[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class1_Sub3(arg4, arg3, arg0, local21);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILclient!vi;)V")
	public static void method791(@OriginalArg(1) Class2_Sub52 arg0) {
		Static283.aClass271_28.method7174(arg0);
		arg0.anInt10944 = arg0.aClass2_Sub8_Sub2_2.anInt5725;
		arg0.aClass2_Sub8_Sub2_2.anInt5725 = 0;
		Static544.anInt9515 += arg0.anInt10944;
	}
}
