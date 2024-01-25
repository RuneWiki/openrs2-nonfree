import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "I")
	public static int anInt1822;

	@OriginalMember(owner = "client!dda", name = "p", descriptor = "Lclient!ug;")
	public static Class43 aClass43_3;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIII)Lclient!jga;")
	public static Class2_Sub33 method1596(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class2_Sub33 local5 = null;
		if (arg2 == 0) {
			local5 = Static592.method8154(Static142.aClass349_70, Static487.aClass221_2.aClass48_1);
		}
		if (arg2 == 1) {
			local5 = Static592.method8154(Static331.aClass349_78, Static487.aClass221_2.aClass48_1);
		}
		local5.aClass2_Sub20_Sub2_1.method8550(Static102.aClass184_1.method6058(82) ? 1 : 0);
		local5.aClass2_Sub20_Sub2_1.method8533(3774, Static243.anInt3820 + arg0);
		local5.aClass2_Sub20_Sub2_1.method8533(3774, arg1 + Static224.anInt11062);
		Static392.anInt6487 = arg0;
		Static397.aBoolean554 = false;
		Static371.anInt5924 = arg1;
		Static566.method7859();
		return local5;
	}
}
