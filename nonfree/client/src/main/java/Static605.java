import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!uia", name = "h", descriptor = "I")
	public static int anInt10580;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "Lclient!in;")
	public static final Class169 aClass169_249 = new Class169(121, 12);

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "Lclient!rl;")
	public static final Class320 aClass320_5 = new Class320();

	@OriginalMember(owner = "client!uia", name = "f", descriptor = "I")
	public static int anInt10578 = 0;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lclient!fm;IIILclient!fm;BIIII)V")
	public static void method9055(@OriginalArg(0) Class15_Sub3_Sub3_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class15_Sub3_Sub3_Sub1 arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg2.method3685();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class71 local21 = (Class71) Static317.aClass22_35.method462((long) local7);
		if (local21 == null) {
			@Pc(28) Class67[] local28 = Static676.method1697(Static409.aClass124_84, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static607.aClass101_15.method8063(local28[0], true);
			Static317.aClass22_35.method470((long) local7, local21);
		}
		method9059(0, arg3 >> 1, arg0.anInt11024, arg0.aByte142, arg0.method3690() * 256, arg1 >> 1, arg0.anInt11022);
		@Pc(75) int local75 = arg5 + Static91.anIntArray83[0] - 18;
		@Pc(83) int local83 = local75 + arg4 / 4 * 18;
		@Pc(92) int local92 = arg6 + Static91.anIntArray83[1] - 70;
		@Pc(100) int local100 = local92 + arg4 % 4 * 18;
		local21.method7703(local83, local100);
		if (arg2 == arg0) {
			Static607.aClass101_15.method8103(18, local83 - 1, -256, local100 - 1, 18);
		}
		Static220.method4070(local100 + 18, local100 - 1, local83 - 1, local83 + 18);
		@Pc(141) Class15_Sub1 local141 = Static341.method5720();
		local141.aClass15_Sub3_Sub3_Sub1_1 = arg2;
		local141.anInt325 = local83 + 16;
		local141.anInt328 = local100;
		local141.anInt327 = local100 + 16;
		local141.anInt322 = local83;
		Static41.aClass60_1.method1551(local141);
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IC)C")
	public static char method9056(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lclient!mha;IIZILclient!mha;Z)I")
	public static int method9058(@OriginalArg(0) Class234_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class234_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static435.method7086(arg1, arg0, arg5, arg4);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(33) int local33 = Static435.method7086(arg3, arg0, arg2, arg4);
			return arg2 ? -local33 : local33;
		}
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method9059(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg6 < 512 || arg2 < 512 || (Static222.anInt4533 - 2) * 512 < arg6 || Static668.anInt11370 * 512 - 1024 < arg2) {
			Static91.anIntArray83[0] = Static91.anIntArray83[1] = -1;
			return;
		}
		@Pc(48) int local48 = Static10.method154(arg2, arg6, arg3) - arg0;
		if (Static450.aBoolean606) {
			Static634.method9356(true);
		} else {
			Static435.aClass76_13.method9640(arg4, 0, 0);
			Static607.aClass101_15.method8067(Static435.aClass76_13);
		}
		if (Static110.aBoolean800) {
			Static607.aClass101_15.HA(arg6, local48, arg2, Static165.anInt3552, Static91.anIntArray83);
		} else {
			Static607.aClass101_15.da(arg6, local48, arg2, Static91.anIntArray83);
		}
		if (Static450.aBoolean606) {
			Static560.method8530();
		} else {
			Static435.aClass76_13.method9640(-arg4, 0, 0);
			Static607.aClass101_15.method8067(Static435.aClass76_13);
		}
	}
}
