import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!ro", name = "u", descriptor = "[S")
	public static final short[] aShortArray92 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ro", name = "z", descriptor = "I")
	public static int anInt6243 = -1;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIBI)V")
	public static void method5187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 - arg0 >= Static165.anInt3313 && arg3 + arg0 <= Static152.anInt3132 && arg4 - arg0 >= Static172.anInt3442 && Static324.anInt5590 >= arg4 + arg0) {
			Static96.method5058(arg5, arg4, arg2, arg3, arg0, arg1);
		} else {
			Static81.method1552(arg1, arg3, arg5, arg4, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
	public static void method5190() {
		@Pc(19) int local19 = Static291.aClass28_Sub1_1.method830(Static294.anInt5208);
		if (local19 == 0) {
			Static112.aByteArrayArrayArray4 = null;
			Static75.method1490(0);
		} else if (local19 == 1) {
			Static370.method5559((byte) 0);
			Static75.method1490(512);
			if (Static203.aByteArrayArrayArray11 != null) {
				Static191.method3039();
			}
		} else {
			Static370.method5559((byte) (Static347.anInt6264 - 4 & 0xFF));
			Static75.method1490(2);
		}
		Static447.anInt7425 = Static388.anInt6870;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BIZI)Ljava/lang/String;")
	public static String method5196(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		for (@Pc(38) int local38 = arg0 / 10; local38 != 0; local38 /= 10) {
			local34++;
		}
		@Pc(53) char[] local53 = new char[local34];
		local53[0] = '+';
		for (@Pc(66) int local66 = local34 - 1; local66 > 0; local66--) {
			@Pc(70) int local70 = arg0;
			arg0 /= 10;
			@Pc(81) int local81 = local70 - arg0 * 10;
			if (local81 < 10) {
				local53[local66] = (char) (local81 + 48);
			} else {
				local53[local66] = (char) (local81 + 87);
			}
		}
		return new String(local53);
	}
}
