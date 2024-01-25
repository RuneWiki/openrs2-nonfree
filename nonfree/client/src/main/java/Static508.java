import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "F")
	public static float aFloat353;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
	public static int anInt8632 = 0;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	public static int anInt8634 = 765;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[BILjava/lang/String;)I")
	public static int method6979(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg2.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(29) int local29 = Static84.method1457(arg2.charAt(local12));
			@Pc(48) int local48 = local10 > local12 + 1 ? Static84.method1457(arg2.charAt(local12 + 1)) : -1;
			@Pc(67) int local67 = local12 + 2 < local10 ? Static84.method1457(arg2.charAt(local12 + 2)) : -1;
			@Pc(86) int local86 = local12 + 3 >= local10 ? -1 : Static84.method1457(arg2.charAt(local12 + 3));
			arg0[arg1++] = (byte) (local29 << 2 | local48 >>> 4);
			if (local67 == -1) {
				break;
			}
			arg0[arg1++] = (byte) (local67 >>> 2 | (local48 & 0xF) << 4);
			if (local86 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local67 & 0x3) << 6 | local86);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!tk;IILclient!qa;IZ)V")
	public static void method6981(@OriginalArg(0) Class283 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class62 arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class260 local9 = Static196.aClass274_1.method6382(arg0.anInt8166);
		if (local9.anInt7677 == -1) {
			return;
		}
		if (arg0.aBoolean581) {
			@Pc(28) int local28 = arg4 + arg0.anInt8147;
			arg4 = local28 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(44) Class25 local44 = local9.method6213(arg0.aBoolean584, arg3, arg4);
		if (local44 == null) {
			return;
		}
		@Pc(50) int local50 = arg0.anInt8184;
		@Pc(53) int local53 = arg0.anInt8153;
		if ((arg4 & 0x1) == 1) {
			local50 = arg0.anInt8153;
			local53 = arg0.anInt8184;
		}
		@Pc(67) int local67 = local44.EA();
		@Pc(70) int local70 = local44.ma();
		if (local9.aBoolean544) {
			local70 = local53 * 4;
			local67 = local50 * 4;
		}
		if (local9.anInt7676 == 0) {
			local44.method6960(arg1, arg2 - (local53 - 1) * 4, local67, local70);
		} else {
			local44.ra(arg1, arg2 - (local53 - 1) * 4, local67, local70, 0, local9.anInt7676 | 0xFF000000, 1);
		}
	}
}
