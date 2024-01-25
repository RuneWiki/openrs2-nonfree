import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!su", name = "j", descriptor = "Z")
	public static boolean aBoolean713 = false;

	@OriginalMember(owner = "client!su", name = "c", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_103 = new Class387(49, 7);

	@OriginalMember(owner = "client!su", name = "i", descriptor = "I")
	public static int anInt9335 = 2;

	@OriginalMember(owner = "client!su", name = "d", descriptor = "Z")
	public static boolean aBoolean714 = true;

	@OriginalMember(owner = "client!su", name = "g", descriptor = "Lclient!um;")
	public static final Class354 aClass354_20 = new Class354("", 13);

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII)V")
	public static void method8006(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(109) Class174 local109 = Static260.aClass174ArrayArrayArray2[arg2][arg0][arg1];
			if (local109 != null) {
				if (arg3 == 1) {
					local109.aShort53 = 0;
				} else if (arg3 == 2) {
					local109.aShort50 = 0;
				}
			}
			Static374.method5472();
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < Static603.anInt10076; local23++) {
			@Pc(29) Class337 local29 = Static265.aClass337Array3[local23];
			if (arg3 == local29.aByte140 && arg0 == local29.aShort112 && arg1 == local29.aShort114 || arg0 == local29.aShort111 && local29.aShort114 == arg1) {
				if (local23 != Static603.anInt10076) {
					Static682.method797(Static265.aClass337Array3, local23 + 1, Static265.aClass337Array3, local23, Static265.aClass337Array3.length - local23 - 1);
				}
				Static603.anInt10076--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!ic;B)V")
	public static void method8007(@OriginalArg(0) Class8_Sub1_Sub3_Sub2_Sub1 arg0) {
		@Pc(11) Class5_Sub22 local11 = (Class5_Sub22) Static679.aClass291_46.method6993((long) arg0.anInt6994, 1);
		if (local11 == null) {
			Static545.method7956(arg0.anIntArray414[0], 0, (Class8_Sub1_Sub3_Sub2_Sub2) null, arg0.aByte145, arg0, arg0.anIntArray415[0], (Class55) null);
		} else {
			local11.method3422();
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIBLclient!fda;)V")
	public static void method8008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class120 arg2) {
		Static110.aClass120ArrayArray1[arg0][arg1] = arg2;
	}
}
