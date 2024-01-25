import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!nfa", name = "q", descriptor = "Lclient!om;")
	public static Class246 aClass246_122;

	@OriginalMember(owner = "client!nfa", name = "w", descriptor = "I")
	public static int anInt4606;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class3_Sub42 local7 = null;
		for (@Pc(12) Class3_Sub42 local12 = (Class3_Sub42) Static475.aClass130_47.method3543(); local12 != null; local12 = (Class3_Sub42) Static475.aClass130_47.method3551()) {
			if (arg2 == local12.anInt7384 && local12.anInt7385 == arg1 && local12.anInt7381 == arg0 && arg4 == local12.anInt7377) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub42();
			local7.anInt7384 = arg2;
			local7.anInt7385 = arg1;
			local7.anInt7381 = arg0;
			local7.anInt7377 = arg4;
			if (arg1 >= 0 && arg0 >= 0 && Static400.anInt6818 > arg1 && arg0 < Static271.anInt5050) {
				Static219.method3809(local7);
			}
			Static475.aClass130_47.method3548(local7);
		}
		local7.anInt7383 = -1;
		local7.anInt7379 = 0;
		local7.anInt7375 = arg3;
		local7.anInt7386 = arg6;
		local7.anInt7387 = arg5;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)V")
	public static void method4080(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(arg0, 11);
		local8.method845();
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(III)Lclient!fh;")
	public static Class95 method4081(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class95 local7 = new Class95();
		local7.anInt3057 = -1;
		local7.anInt3060 = arg1 + 5 + 1;
		local7.anInt3052 = arg0 + 6;
		local7.anInt3047 = -1;
		local7.anIntArrayArray22 = new int[local7.anInt3052][local7.anInt3060];
		local7.method2739();
		return local7;
	}
}
