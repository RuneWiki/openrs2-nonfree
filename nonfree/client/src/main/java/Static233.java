import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!on", name = "xb", descriptor = "Lclient!tq;")
	public static Class191 aClass191_150;

	@OriginalMember(owner = "client!on", name = "C", descriptor = "[S")
	public static final short[] aShortArray74 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IBI)B")
	public static byte method4043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V")
	public static void method4045(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(7, arg0);
		local8.method5539();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IC)Z")
	public static boolean method4050(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
