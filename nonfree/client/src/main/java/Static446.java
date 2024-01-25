import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!vs", name = "Ub", descriptor = "I")
	public static int anInt7635 = 1;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZIC)I")
	public static int method6090(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[B)[B")
	public static byte[] method6096(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static474.method3327(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "(I)V")
	public static void method6101() {
		@Pc(7) int local7 = Static402.anInt7091;
		@Pc(9) int[] local9 = Static144.anIntArray244;
		for (@Pc(19) int local19 = 0; local19 < local7; local19++) {
			@Pc(27) Class11_Sub5_Sub2_Sub1 local27 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local9[local19]];
			if (local27 != null) {
				Static467.method6342(local27, local27.method5302());
			}
		}
	}
}
