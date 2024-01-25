import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "Z")
	public static boolean aBoolean289;

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "Lclient!nv;")
	public static Class171 aClass171_3;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "[Lclient!dq;")
	public static Class6_Sub3_Sub1_Sub1[] aClass6_Sub3_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_72 = new Class119(72, 3);

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!mq;I)V")
	public static void method2733(@OriginalArg(0) Class156 arg0) {
		@Pc(15) Class156 local15 = Static386.method5013(arg0);
		@Pc(19) int local19;
		@Pc(21) int local21;
		if (local15 == null) {
			local19 = Static333.anInt5712;
			local21 = Static123.anInt2625;
		} else {
			local19 = local15.anInt4853;
			local21 = local15.anInt4823;
		}
		Static401.method5187(local21, false, local19, arg0);
		Static344.method4557(arg0, local19, local21);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)Lclient!mt;")
	public static Class6_Sub6 method2735() {
		@Pc(8) Class6_Sub6 local8 = (Class6_Sub6) Static420.aClass138_7.method3305();
		if (local8 == null) {
			return new Class6_Sub6();
		} else {
			Static137.anInt2887--;
			return local8;
		}
	}
}
