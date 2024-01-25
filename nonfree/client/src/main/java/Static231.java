import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
	public static int anInt4824;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "Lclient!cq;")
	public static Class8 aClass8_21;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
	public static int anInt4826;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
	public static int anInt4827 = 0;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
	public static int anInt4828 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class1_Sub23 local7 = null;
		for (@Pc(14) Class1_Sub23 local14 = (Class1_Sub23) Static271.aClass14_28.method302(); local14 != null; local14 = (Class1_Sub23) Static271.aClass14_28.method313()) {
			if (local14.anInt3747 == arg6 && local14.anInt3746 == arg5 && local14.anInt3755 == arg8 && arg7 == local14.anInt3749) {
				local7 = local14;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub23();
			local7.anInt3746 = arg5;
			local7.anInt3749 = arg7;
			local7.anInt3747 = arg6;
			local7.anInt3755 = arg8;
			Static298.method5217(local7);
			Static271.aClass14_28.method300(local7);
		}
		local7.anInt3754 = arg1;
		local7.anInt3752 = arg2;
		local7.anInt3753 = arg3;
		local7.anInt3761 = arg0;
		local7.anInt3757 = arg4;
	}
}
