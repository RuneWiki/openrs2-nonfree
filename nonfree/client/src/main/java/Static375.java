import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!st", name = "d", descriptor = "I")
	public static int anInt6122 = 0;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5099(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = (local8 << 5) + Static372.method5075(arg0.charAt(local10)) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)Z")
	public static boolean method5101(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIZI)V")
	public static void method5103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg4 | (arg3 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class1_Sub14 local20 = (Class1_Sub14) Static314.aClass96_33.method2335(local14);
		if (local20 == null) {
			local20 = new Class1_Sub14();
			Static314.aClass96_33.method2341(local14, local20);
		}
		if (arg2 >= local20.anIntArray146.length) {
			@Pc(54) int[] local54 = new int[arg2 + 1];
			@Pc(59) int[] local59 = new int[arg2 + 1];
			for (@Pc(61) int local61 = 0; local61 < local20.anIntArray146.length; local61++) {
				local54[local61] = local20.anIntArray146[local61];
				local59[local61] = local20.anIntArray145[local61];
			}
			for (@Pc(87) int local87 = local20.anIntArray146.length; local87 < arg2; local87++) {
				local54[local87] = -1;
				local59[local87] = 0;
			}
			local20.anIntArray145 = local59;
			local20.anIntArray146 = local54;
		}
		local20.anIntArray146[arg2] = arg0;
		local20.anIntArray145[arg2] = arg1;
	}
}
