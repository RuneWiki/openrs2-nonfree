import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!kd;")
	public static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "[Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2[] aClass1_Sub3_Sub1_Sub2Array1;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	public static int anInt55;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Lclient!af;")
	private static Class5 aClass5_31 = Static45.method1937(" seconds)3");

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!af;")
	public static Class5 aClass5_32 = Static45.method1937("leuchten1:");

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!af;")
	public static Class5 aClass5_33 = Static45.method1937("<col=ffb000>");

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!af;")
	private static Class5 aClass5_34 = Static45.method1937("Select");

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!af;")
	public static Class5 aClass5_35 = Static45.method1937("http:)4)4");

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!af;")
	public static Class5 aClass5_36 = aClass5_34;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_37 = Static45.method1937("Benutzername: ");

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public static int anInt54 = 0;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_38 = aClass5_31;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!gd;")
	public static Class28 aClass28_5 = new Class28(30);

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!af;")
	private static Class5 aClass5_39 = Static45.method1937("No response from server)3");

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!af;")
	public static Class5 aClass5_40 = aClass5_39;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "[I")
	public static int[] anIntArray13 = new int[128];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[BII[Lclient!md;IIIILclient!rf;)V")
	public static void method55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class49[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class68 arg9) {
		@Pc(11) Class1_Sub20 local11 = new Class1_Sub20(arg2);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(23) int local23 = local11.method2056();
			if (local23 == 0) {
				return;
			}
			local17 += local23;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local11.method2056();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(54) int local54 = local31 >> 12;
				@Pc(58) int local58 = local11.method2053();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(68) int local68 = local31 >> 6 & 0x3F;
				@Pc(72) int local72 = local58 & 0x3;
				if (arg1 == local54 && local68 >= arg0 && arg0 + 8 > local68 && local50 >= arg3 && local50 < arg3 + 8) {
					@Pc(103) Class1_Sub3_Sub10 local103 = Static131.method2263(local17);
					@Pc(120) int local120 = arg4 + Static21.method532(local103.anInt1693, local103.anInt1696, local68 & 0x7, local50 & 0x7, local72, arg6);
					@Pc(138) int local138 = arg7 + Static6.method191(local50 & 0x7, local103.anInt1693, arg6, local103.anInt1696, local72, local68 & 0x7);
					if (local120 > 0 && local138 > 0 && local120 < 103 && local138 < 103) {
						@Pc(157) int local157 = arg8;
						@Pc(159) Class49 local159 = null;
						if ((Static25.aByteArrayArrayArray1[1][local120][local138] & 0x2) == 2) {
							local157 = arg8 - 1;
						}
						if (local157 >= 0) {
							local159 = arg5[local157];
						}
						Static108.method1886(arg9, arg6 + local72 & 0x3, arg8, local138, local120, local159, local17, local62);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method56() {
		aClass28_5 = null;
		aClass5_36 = null;
		aClass5_34 = null;
		aClass1_Sub3_Sub1_Sub2Array1 = null;
		aClass5_37 = null;
		aClass1_Sub1_Sub3_1 = null;
		aClass5_40 = null;
		aClass5_33 = null;
		aClass5_31 = null;
		anIntArray13 = null;
		aClass5_39 = null;
		aClass5_38 = null;
		aClass5_35 = null;
		aClass5_32 = null;
	}
}
