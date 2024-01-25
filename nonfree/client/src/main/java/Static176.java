import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
	public static int anInt3970;

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
	public static int anInt3972;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Lclient!f;")
	public static Class65 aClass65_1 = new Class65(8);

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
	public static int anInt3967 = -1;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
	public static int anInt3968 = 0;

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_94 = new Class140(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
	public static int anInt3971 = 0;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)V")
	public static void method3420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class51 local7 = Static196.aClass51ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class51 local28 = Static196.aClass51ArrayArrayArray3[local9][arg0][arg1] = Static196.aClass51ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte10--;
				for (@Pc(40) Class11 local40 = local28.aClass11_2; local40 != null; local40 = local40.aClass11_1) {
					@Pc(44) Class1_Sub2 local44 = local40.aClass1_Sub2_1;
					if (local44.aShort89 == arg0 && local44.aShort90 == arg1) {
						local44.aByte77--;
					}
				}
			}
		}
		if (Static196.aClass51ArrayArrayArray3[0][arg0][arg1] == null) {
			Static196.aClass51ArrayArrayArray3[0][arg0][arg1] = new Class51(0, arg0, arg1);
			Static196.aClass51ArrayArrayArray3[0][arg0][arg1].aByte9 = 1;
		}
		Static196.aClass51ArrayArrayArray3[0][arg0][arg1].aClass51_1 = local7;
		Static196.aClass51ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)Lclient!mm;")
	public static Class2_Sub9_Sub15 method3422(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub9_Sub15 local10 = (Class2_Sub9_Sub15) Static183.aClass144_4.method4186((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static255.aClass104_136.method2756(11, arg0);
		local10 = new Class2_Sub9_Sub15();
		if (local20 != null) {
			local10.method3876(new Class2_Sub12(local20));
		}
		Static183.aClass144_4.method4188((long) arg0, local10);
		return local10;
	}
}
