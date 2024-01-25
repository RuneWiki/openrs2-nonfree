import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "l", descriptor = "Lclient!gu;")
	public static Class97 aClass97_3;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "I")
	public static int anInt5215;

	@OriginalMember(owner = "client!am", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!am", name = "v", descriptor = "Z")
	public static boolean aBoolean407;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "S")
	public static short aShort69 = 1;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_73 = new Class244(79, 4);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)I")
	public static int method4662(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)Z")
	public static boolean method4663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(15) Class60 local15 = Static97.aClass217_4.method5007(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local15.method1192(arg0);
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
	public static void method4664() {
		if (Static164.aClass154_Sub1_1.method5400(Static2.anInt68) || Static363.anInt6170 == Static24.anInt332) {
			Static234.method3883(Static347.aClass155_9);
			if (Static363.anInt6170 != Static115.anInt2221) {
				Static326.method5013();
			}
		} else {
			Static279.method5262(Static1.anInt10, false, Static336.anInt2336, false);
		}
	}
}
