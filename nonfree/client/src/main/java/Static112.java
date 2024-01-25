import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "Lclient!o;")
	public static Class6 aClass6_21;

	@OriginalMember(owner = "client!fl", name = "I", descriptor = "Lclient!qm;")
	public static Class1_Sub6_Sub2 aClass1_Sub6_Sub2_2;

	@OriginalMember(owner = "client!fl", name = "L", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_92 = new Class103(73, 1);

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "[S")
	public static final short[] aShortArray46 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!fl", name = "S", descriptor = "[I")
	public static final int[] anIntArray144 = new int[4];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!ta;IILclient!jk;ILclient!o;B)V")
	public static void method1800(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class124 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static333.anInt5693 == 4) {
			local16 = (int) Static98.aFloat20 & 0x3FFF;
		} else {
			local16 = (int) Static98.aFloat20 + Static378.anInt2798 & 0x3FFF;
		}
		@Pc(50) int local50 = Math.max(arg4.anInt3376 / 2, arg4.anInt3356 / 2) + 10;
		@Pc(58) int local58 = arg3 * arg3 + arg5 * arg5;
		if (local58 > local50 * local50) {
			return;
		}
		@Pc(72) int local72 = Class1_Sub4_Sub8_Sub1.anIntArray50[local16];
		@Pc(76) int local76 = Class1_Sub4_Sub8_Sub1.anIntArray49[local16];
		if (Static333.anInt5693 != 4) {
			local76 = local76 * 256 / (Static435.anInt7311 + 256);
			local72 = local72 * 256 / (Static435.anInt7311 + 256);
		}
		@Pc(105) int local105 = arg3 * local72 + local76 * arg5 >> 15;
		@Pc(116) int local116 = arg3 * local76 - arg5 * local72 >> 15;
		arg6.method5892(arg4.anInt3376 / 2 + arg0 + local105 - arg6.RA() / 2, -local116 + (arg4.anInt3356 / 2 + arg2 - arg6.Q() / 2), arg1, arg0, arg2);
	}
}
