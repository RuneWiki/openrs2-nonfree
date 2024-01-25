import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "[[[Lclient!mf;")
	public static Class226[][][] aClass226ArrayArrayArray1;

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "F")
	public static float aFloat142;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "Lclient!cja;")
	public static final Class64 aClass64_3 = new Class64();

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6136(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(11) Class5_Sub3_Sub17 local11 = Static358.method5408(2, (long) arg0);
		local11.method7286();
		local11.aString82 = arg1;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIILclient!fa;)V")
	public static void method6137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class28_Sub1_Sub1 arg4) {
		@Pc(4) Class226 local4 = Static288.method4659(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10781 = (arg1 << Static588.anInt9672) + Static558.anInt7322;
		arg4.anInt10779 = arg3;
		arg4.anInt10784 = (arg2 << Static588.anInt9672) + Static558.anInt7322;
		local4.aClass28_Sub1_Sub1_1 = arg4;
		@Pc(33) int local33 = Static495.aClass109Array4 == Static111.aClass109Array3 ? 1 : 0;
		if (arg4.method8963()) {
			if (arg4.method8965()) {
				arg4.aClass28_Sub1_23 = Static135.aClass28_Sub1Array2[local33];
				Static135.aClass28_Sub1Array2[local33] = arg4;
				return;
			}
			arg4.aClass28_Sub1_23 = Static654.aClass28_Sub1Array5[local33];
			Static654.aClass28_Sub1Array5[local33] = arg4;
			Static375.aBoolean591 = true;
			return;
		}
		arg4.aClass28_Sub1_23 = Static110.aClass28_Sub1Array1[local33];
		Static110.aClass28_Sub1Array1[local33] = arg4;
	}
}
