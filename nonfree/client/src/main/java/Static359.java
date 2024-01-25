import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
	public static int anInt6547;

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_83 = new Class208(1, 7);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([IILclient!nv;I[II)Lclient!k;")
	public static Class181_Sub1 method5306(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class78_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg1.method6869(Static243.aClass172_9, Static268.aClass271_7)) {
			@Pc(69) int[] local69 = new int[arg4 * arg2];
			for (local23 = 0; local23 < arg4; local23++) {
				local33 = arg0[local23] + local23 * arg2;
				for (local35 = 0; local35 < arg3[local23]; local35++) {
					local69[local33++] = -16777216;
				}
			}
			return new Class181_Sub1(arg1, arg2, arg4, local69);
		}
		@Pc(21) byte[] local21 = new byte[arg4 * arg2];
		for (local23 = 0; local23 < arg4; local23++) {
			local33 = arg0[local23] + local23 * arg2;
			for (local35 = 0; local35 < arg3[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class181_Sub1(arg1, arg2, arg4, local21);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method5308(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static99.anInt1760; local16++) {
			if (arg0.equalsIgnoreCase(Static187.aStringArray6[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aString35);
	}
}
