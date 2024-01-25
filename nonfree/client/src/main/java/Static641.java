import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "Lclient!d;")
	public static Interface5 anInterface5_12;

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "Lclient!da;")
	public static Class25 aClass25_14;

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
	public static int anInt10516;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "[I")
	public static final int[] anIntArray626 = new int[25];

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "[I")
	public static final int[] anIntArray627 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "[I")
	public static final int[] anIntArray628 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method8642(@OriginalArg(0) Class33 arg0) {
		if (Static113.anInt10083 != Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 && (Static170.aClass106ArrayArrayArray1 != null && Static57.method8562(arg0, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128))) {
			Static113.anInt10083 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)V")
	public static void method8644(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub1_Sub21 local16 = Static57.method8561(arg0, 7);
		local16.method8628();
	}
}
