import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
	public static int anInt4188;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public static int anInt4189;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public static int anInt4192;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Lclient!sc;")
	public static Class102 aClass102_20 = new Class102(16);

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
	public static int anInt4190 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILclient!ij;JZ)V")
	public static void method3243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class119 local6 = new Class119();
		local6.aClass5_9 = arg4;
		local6.anInt4591 = arg1 * 128 + 64;
		local6.anInt4588 = arg2 * 128 + 64;
		local6.anInt4586 = arg3;
		local6.aLong163 = arg5;
		if (Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub7(arg0, arg1, arg2);
		}
		Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass119_1 = local6;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!me;I)Z")
	public static boolean method3244(@OriginalArg(0) Class71 arg0) {
		if (arg0.anIntArray187 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray187.length; local17++) {
			@Pc(24) int local24 = Static37.method652(arg0, local17);
			@Pc(29) int local29 = arg0.anIntArray174[local17];
			if (arg0.anIntArray187[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray187[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray187[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local24 != local29) {
				return false;
			}
		}
		return true;
	}
}
