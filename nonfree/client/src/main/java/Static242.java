import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	public static int anInt5012 = 0;

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "[I")
	public static int[] anIntArray465 = new int[128];

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "Lclient!pa;")
	public static Class128 aClass128_1 = new Class128();

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method3788(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!wf;IB)V")
	public static void method3789(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2) {
		if (Static181.anInt3973 < 2 && Static24.anInt662 == 0 && !Static230.aBoolean185) {
			return;
		}
		@Pc(30) String local30 = Static269.method4071();
		if (arg1 == null) {
			@Pc(47) int local47 = Static176.aClass1_Sub3_Sub5_2.method3519(local30, arg0 + 4, arg2 - -15, Static134.aRandom1, Static308.anInt6132);
			Static155.method2520(arg0 + 4, arg2, Static176.aClass1_Sub3_Sub5_2.method3510(local30) + local47, 15);
			return;
		}
		@Pc(67) Class1_Sub3_Sub5 local67 = arg1.method4675(Static225.aClass46Array5);
		if (local67 == null) {
			local67 = Static176.aClass1_Sub3_Sub5_2;
		}
		local67.method3497(local30, arg0, arg2, arg1.anInt6088, arg1.anInt6128, arg1.anInt6083, arg1.anInt6109, arg1.anInt6108, arg1.anInt6153, Static134.aRandom1, Static308.anInt6132, Static219.anIntArray429);
		Static155.method2520(Static219.anIntArray429[0], Static219.anIntArray429[1], Static219.anIntArray429[2], Static219.anIntArray429[3]);
	}
}
