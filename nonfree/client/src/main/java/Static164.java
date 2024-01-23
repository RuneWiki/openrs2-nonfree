import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!qe", name = "Qb", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!qe", name = "Vb", descriptor = "Lclient!ld;")
	public static Class67 aClass67_7;

	@OriginalMember(owner = "client!qe", name = "Hb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1252 = Static64.method1101("Continue");

	@OriginalMember(owner = "client!qe", name = "Ib", descriptor = "I")
	public static int anInt3633 = 0;

	@OriginalMember(owner = "client!qe", name = "Jb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1253 = aClass51_1252;

	@OriginalMember(owner = "client!qe", name = "Ob", descriptor = "I")
	public static int anInt3637 = -1;

	@OriginalMember(owner = "client!qe", name = "Pb", descriptor = "[I")
	public static int[] anIntArray239 = new int[100];

	@OriginalMember(owner = "client!qe", name = "Rb", descriptor = "I")
	public static int anInt3638 = 0;

	@OriginalMember(owner = "client!qe", name = "Ub", descriptor = "I")
	public static int anInt3641 = -1;

	@OriginalMember(owner = "client!qe", name = "Xb", descriptor = "I")
	public static int anInt3643 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!ia;Lclient!ia;)V")
	public static void method2798(@OriginalArg(1) int arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) Class51 arg2) {
		Static216.method3597(-1, arg2, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lclient!ic;")
	public static Class52 method2799(@OriginalArg(0) int arg0) {
		@Pc(6) Class52 local6 = (Class52) Static80.aClass53_16.method1501((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static187.aClass70_38.method3509(arg0, 3);
		local6 = new Class52();
		if (local20 != null) {
			local6.method1465(new Class1_Sub16(local20));
		}
		Static80.aClass53_16.method1497(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Lclient!ak;")
	public static Class1_Sub2_Sub1_Sub1 method2801() {
		@Pc(18) int local18 = Static89.anIntArray85[0] * Static51.anIntArray72[0];
		@Pc(22) byte[] local22 = Static73.aByteArrayArray4[0];
		@Pc(66) Class1_Sub2_Sub1_Sub1 local66;
		if (Static112.aBooleanArray15[0]) {
			@Pc(72) byte[] local72 = Static191.aByteArrayArray12[0];
			@Pc(75) int[] local75 = new int[local18];
			for (@Pc(77) int local77 = 0; local77 < local18; local77++) {
				local75[local77] = (local72[local77] & 0xFF) << 24 | Static52.anIntArray74[local22[local77] & 0xFF];
			}
			local66 = new Class1_Sub2_Sub1_Sub1_Sub1(Static30.anInt2197, Static141.anInt3050, Static65.anIntArray98[0], Static152.anIntArray225[0], Static51.anIntArray72[0], Static89.anIntArray85[0], local75);
		} else {
			@Pc(29) int[] local29 = new int[local18];
			for (@Pc(31) int local31 = 0; local31 < local18; local31++) {
				local29[local31] = Static52.anIntArray74[local22[local31] & 0xFF];
			}
			local66 = new Class1_Sub2_Sub1_Sub1(Static30.anInt2197, Static141.anInt3050, Static65.anIntArray98[0], Static152.anIntArray225[0], Static51.anIntArray72[0], Static89.anIntArray85[0], local29);
		}
		Static134.method2401();
		return local66;
	}
}
