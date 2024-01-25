import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!wn;")
	public static final Class379 aClass379_11 = new Class379("", 11);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBLclient!rl;[I[II)Lclient!qn;")
	public static Class1_Sub2 method8079(@OriginalArg(0) int arg0, @OriginalArg(2) Class82_Sub3 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg1.method5005(Static280.aClass182_8, Static491.aClass168_11)) {
			@Pc(73) int[] local73 = new int[arg0 * arg4];
			for (local23 = 0; local23 < arg4; local23++) {
				local33 = local23 * arg0 + arg2[local23];
				for (local35 = 0; local35 < arg3[local23]; local35++) {
					local73[local33++] = -16777216;
				}
			}
			return new Class1_Sub2(arg1, arg0, arg4, local73);
		}
		@Pc(21) byte[] local21 = new byte[arg0 * arg4];
		for (local23 = 0; local23 < arg4; local23++) {
			local33 = arg2[local23] + arg0 * local23;
			for (local35 = 0; local35 < arg3[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class1_Sub2(arg1, arg0, arg4, local21);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)I")
	public static int method8081() {
		if (Static253.aBoolean362) {
			return 6;
		} else if (Static165.aClass3_Sub7_Sub19_14 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static165.aClass3_Sub7_Sub19_14.anInt8564;
			if (Static241.method4067(local19)) {
				return 1;
			} else if (Static368.method5890(local19)) {
				return 2;
			} else if (Static110.method1823(local19)) {
				return 3;
			} else if (Static580.method8102(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Lclient!pn;")
	public static Class9_Sub2_Sub3 method8082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static567.aClass351ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass9_Sub2_Sub3_1;
	}
}
