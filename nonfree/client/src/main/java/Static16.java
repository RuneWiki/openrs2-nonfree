import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "[Lclient!g;")
	public static final Class118[] aClass118Array1 = new Class118[8];

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "I")
	public static int anInt245 = -1;

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZBI)V")
	public static void method246(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub52 local10 = Static504.method7331(arg0, arg1);
		if (local10 != null) {
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray653.length; local23++) {
				local10.anIntArray653[local23] = -1;
				local10.anIntArray654[local23] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIII[BII)Z")
	public static boolean method247(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(30) int local30 = -((arg3 + 8 - 1) / 8);
		@Pc(39) int local39 = -((arg4 + 8 - 1) / 8);
		for (@Pc(41) int local41 = local30; local41 < 0; local41++) {
			for (@Pc(45) int local45 = local39; local45 < 0; local45++) {
				if (arg2[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local16;
			if (arg2[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg0;
		}
		return false;
	}
}
