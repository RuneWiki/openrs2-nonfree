import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static721 {

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "[S")
	public static short[] aShortArray66;

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "[I")
	public static int[] anIntArray400;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BILclient!hr;III)V")
	public static void method4956(@OriginalArg(1) int arg0, @OriginalArg(2) Class165 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) Class3_Sub57 local15 = null;
		for (@Pc(20) Class3_Sub57 local20 = (Class3_Sub57) Static226.aClass342_35.method7644(); local20 != null; local20 = (Class3_Sub57) Static226.aClass342_35.method7650()) {
			if (local20.anInt10802 == arg2 && arg3 == local20.anInt10797 && arg0 == local20.anInt10805 && local20.anInt10800 == arg4) {
				local15 = local20;
				break;
			}
		}
		if (local15 == null) {
			local15 = new Class3_Sub57();
			local15.anInt10800 = arg4;
			local15.anInt10797 = arg3;
			local15.anInt10805 = arg0;
			local15.anInt10802 = arg2;
			Static226.aClass342_35.method7654(local15);
		}
		local15.aBoolean734 = false;
		local15.aClass165_2 = arg1;
		local15.aBoolean733 = true;
	}
}
