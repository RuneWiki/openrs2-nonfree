import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "Lclient!dia;")
	public static final Class74 aClass74_22 = new Class74("", 18);

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	public static int anInt4746 = 1;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_114 = new Class136(20, 4);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([BIIIII)V")
	public static void method4343(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(15) int local15 = arg1 - arg3 >> 2;
		arg2 += arg3;
		while (true) {
			local15--;
			if (local15 < 0) {
				local15 = arg1 - arg3 & 0x3;
				while (true) {
					local15--;
					if (local15 < 0) {
						return;
					}
					arg0[arg2++] = 1;
				}
			}
			@Pc(26) int local26 = arg2 + 1;
			arg0[arg2] = 1;
			@Pc(31) int local31 = local26 + 1;
			arg0[local26] = 1;
			@Pc(36) int local36 = local31 + 1;
			arg0[local31] = 1;
			arg2 = local36 + 1;
			arg0[local36] = 1;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
	public static void method4344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class5_Sub4_Sub13 local10 = Static506.method2916(arg0, 16);
		local10.method4140();
		local10.anInt4508 = arg1;
	}
}
