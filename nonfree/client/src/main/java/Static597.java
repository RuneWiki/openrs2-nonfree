import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!wu", name = "E", descriptor = "I")
	public static int anInt9819;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "[I")
	public static final int[] anIntArray725 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "Lclient!cp;")
	public static final Class58 aClass58_15 = new Class58();

	@OriginalMember(owner = "client!wu", name = "F", descriptor = "I")
	public static int anInt9820 = -1;

	@OriginalMember(owner = "client!wu", name = "G", descriptor = "[I")
	public static final int[] anIntArray726 = new int[14];

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!vf;ZZ)V")
	public static void method8029(@OriginalArg(1) Class4_Sub49 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt9337;
		@Pc(12) int local12 = (int) arg0.aLong307;
		arg0.method8013();
		if (arg2) {
			Static540.method7504(local8);
		}
		Static122.method6993(local8);
		@Pc(29) Class115 local29 = Static92.method2118(local12);
		if (local29 != null) {
			Static330.method4950(local29);
		}
		Static228.method3965();
		if (!arg1 && Static249.anInt4945 != -1) {
			Static349.method5193(1, Static249.anInt4945);
		}
		@Pc(50) Class112 local50 = new Class112(Static543.aClass183_39);
		for (@Pc(60) Class4_Sub49 local60 = (Class4_Sub49) local50.method3093(); local60 != null; local60 = (Class4_Sub49) local50.method3094()) {
			if (!local60.method8014()) {
				local60 = (Class4_Sub49) local50.method3093();
				if (local60 == null) {
					return;
				}
			}
			if (local60.anInt9334 == 3) {
				@Pc(86) int local86 = (int) local60.aLong307;
				if (local8 == local86 >>> 16) {
					method8029(local60, arg1, true);
				}
			}
		}
	}
}
