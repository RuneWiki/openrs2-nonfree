import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString80 = "";

	@OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
	public static int anInt6821 = 0;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIZII)V")
	public static void method6104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub49 local7 = null;
		for (@Pc(12) Class2_Sub49 local12 = (Class2_Sub49) Static338.aClass271_39.method7177(); local12 != null; local12 = (Class2_Sub49) Static338.aClass271_39.method7175()) {
			if (arg1 == local12.anInt10506 && local12.anInt10499 == arg2 && local12.anInt10505 == arg5 && arg0 == local12.anInt10502) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub49();
			local7.anInt10499 = arg2;
			local7.anInt10502 = arg0;
			local7.anInt10505 = arg5;
			local7.anInt10506 = arg1;
			if (arg2 >= 0 && arg5 >= 0 && Static222.anInt4533 > arg2 && Static668.anInt11370 > arg5) {
				Static532.method8227(local7);
			}
			Static338.aClass271_39.method7174(local7);
		}
		local7.aBoolean768 = false;
		local7.aBoolean767 = true;
		local7.anInt10496 = arg6;
		local7.anInt10507 = arg3;
		local7.anInt10497 = arg4;
	}
}
