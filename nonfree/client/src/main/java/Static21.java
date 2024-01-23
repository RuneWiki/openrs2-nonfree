import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bk", name = "Q", descriptor = "Z")
	public static boolean aBoolean23;

	@OriginalMember(owner = "client!bk", name = "U", descriptor = "Lclient!mb;")
	public static Class70 aClass70_8;

	@OriginalMember(owner = "client!bk", name = "W", descriptor = "Lclient!te;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!bk", name = "I", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array3 = new Class51[500];

	@OriginalMember(owner = "client!bk", name = "K", descriptor = "Z")
	public static boolean aBoolean22 = true;

	@OriginalMember(owner = "client!bk", name = "O", descriptor = "Lclient!ia;")
	public static Class51 aClass51_190 = Static64.method1101("headicons_pk");

	@OriginalMember(owner = "client!bk", name = "S", descriptor = "Lclient!ia;")
	public static Class51 aClass51_191 = Static64.method1101("l");

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZIII[Lclient!q;IIII[B)V")
	public static void method464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class90[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) byte[] arg8) {
		@Pc(11) Class1_Sub16 local11 = new Class1_Sub16(arg8);
		@Pc(13) int local13 = -1;
		while (true) {
			@Pc(17) int local17 = local11.method3795();
			if (local17 == 0) {
				return;
			}
			@Pc(21) int local21 = 0;
			local13 += local17;
			while (true) {
				@Pc(29) int local29 = local11.method3797();
				if (local29 == 0) {
					break;
				}
				local21 += local29 - 1;
				@Pc(44) int local44 = local21 & 0x3F;
				@Pc(50) int local50 = local21 >> 6 & 0x3F;
				@Pc(54) int local54 = local21 >> 12;
				@Pc(58) int local58 = local11.method3793();
				@Pc(62) int local62 = local58 & 0x3;
				@Pc(66) int local66 = local58 >> 2;
				if (arg6 == local54 && local50 >= arg2 && arg2 + 8 > local50 && arg5 <= local44 && arg5 + 8 > local44) {
					@Pc(93) Class82 local93 = Static9.method132(local13);
					@Pc(111) int local111 = arg1 + Static8.method110(local44 & 0x7, local62, arg7, local50 & 0x7, local93.anInt3258, local93.anInt3279);
					@Pc(129) int local129 = arg0 + Static8.method111(local93.anInt3258, local62, local93.anInt3279, local44 & 0x7, arg7, local50 & 0x7);
					if (local111 > 0 && local129 > 0 && local111 < 103 && local129 < 103) {
						@Pc(146) Class90 local146 = null;
						@Pc(150) int local150 = arg3;
						if ((Static150.aByteArrayArrayArray9[1][local111][local129] & 0x2) == 2) {
							local150 = arg3 - 1;
						}
						if (local150 >= 0) {
							local146 = arg4[local150];
						}
						Static169.method2898(local146, local62 + arg7 & 0x3, true, arg3, local111, local129, arg3, local66, local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(II)I")
	public static int method465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)I")
	public static int method466() {
		return ((Static18.aBoolean16 ? 1 : 0) << 19) + ((Static161.anInt3478 & 0x3) << 17) + ((Static19.aBoolean195 ? 1 : 0) << 15) + ((Static16.anInt387 & 0x3) << 11) + ((aBoolean22 ? 1 : 0) << 10) + ((Static103.aBoolean214 ? 1 : 0) << 9) + ((Static184.aBoolean185 ? 1 : 0) << 8) + ((Static6.aBoolean6 ? 1 : 0) << 7) + ((Static107.aBoolean98 ? 1 : 0) << 5) + ((Static51.aBoolean60 ? 1 : 0) << 4) + (Static42.anInt4800 & 0x7) + ((Static45.aBoolean52 ? 1 : 0) << 3) + ((Static18.aBoolean17 ? 1 : 0) << 6) + ((Static142.aBoolean140 ? 1 : 0) << 13) + ((Static68.aBoolean73 ? 1 : 0) << 16) + ((Static84.anInt1961 == 0 ? 0 : 1) << 20) + ((Static155.anInt3424 == 0 ? 0 : 1) << 21) + ((Static123.anInt2717 == 0 ? 0 : 1) << 22);
	}
}
