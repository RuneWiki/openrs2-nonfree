import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "Lclient!aa;")
	public static Class2 aClass2_7;

	@OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
	public static int anInt3710;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "Lclient!la;")
	public static final Class136 aClass136_101 = new Class136(11, 8);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BII)V")
	public static void method3178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(15, 0);
		local8.method1003();
		local8.anInt970 = arg1;
		local8.anInt972 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLclient!wk;)V")
	public static void method3183(@OriginalArg(1) Class1_Sub2_Sub6_Sub2 arg0) {
		@Pc(15) Class3_Sub29 local15 = (Class3_Sub29) Static307.aClass140_32.method3490((long) arg0.anInt7621);
		if (local15 == null) {
			Static331.method5981(0, arg0.anIntArray509[0], null, arg0.aByte101, null, arg0.anIntArray510[0], arg0);
		} else {
			local15.method3256();
		}
	}
}
