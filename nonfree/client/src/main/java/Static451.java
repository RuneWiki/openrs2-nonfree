import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "Lclient!cea;")
	public static Class2_Sub11 aClass2_Sub11_5;

	@OriginalMember(owner = "client!qda", name = "p", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_84 = new Class94(79, 3);

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!ha;II)Lclient!mi;")
	public static Class46 method7097(@OriginalArg(0) Class20 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub26 local10 = (Class2_Sub26) Static224.aClass99_38.method3056((long) arg1);
		if (local10 != null) {
			@Pc(17) Class2_Sub5_Sub2 local17 = local10.aClass165_Sub1_1.method7049();
			local10.aBoolean388 = true;
			if (local17 != null) {
				return local17.method6127(arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)V")
	public static void method7098() {
		@Pc(13) Class2_Sub6_Sub6 local13 = Static139.method3119(0, 15);
		local13.method3093();
	}
}
