import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "[I")
	public static int[] anIntArray504;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_87 = new Class215(56, -1);

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Lclient!ib;")
	public static final Class102 aClass102_38 = new Class102(16);

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
	public static int anInt6617 = 999999;

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "Z")
	public static boolean aBoolean599 = false;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Lclient!nt;")
	public static Class164 method5175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static202.aClass164ArrayArrayArray5[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static202.aClass164ArrayArrayArray5[0][arg1][arg2] != null && Static202.aClass164ArrayArrayArray5[0][arg1][arg2].aClass164_1 != null;
			if (local28 && arg0 >= Static235.anInt4487 - 1) {
				return null;
			}
			Static172.method2809(arg0, arg1, arg2);
		}
		return Static202.aClass164ArrayArrayArray5[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
	public static void method5178() {
		@Pc(5) Class68 local5 = Static221.aClass68_24;
		synchronized (Static221.aClass68_24) {
			Static221.aClass68_24.method1791();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)I")
	public static int method5180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(16) int local16 = local7 < 8 ? arg1 : arg0;
		@Pc(35) int local35 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg1 : arg2) : arg0;
		return ((local7 & 0x1) == 0 ? local16 : -local16) + ((local7 & 0x2) == 0 ? local35 : -local35);
	}
}
