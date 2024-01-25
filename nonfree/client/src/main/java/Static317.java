import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!pv", name = "p", descriptor = "Lclient!jk;")
	public static final Class121 aClass121_2 = new Class121("stellardawn", 1);

	@OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
	public static int anInt5521 = 13156520;

	@OriginalMember(owner = "client!pv", name = "z", descriptor = "[I")
	public static final int[] anIntArray378 = new int[14];

	@OriginalMember(owner = "client!pv", name = "A", descriptor = "I")
	public static int anInt5523 = 0;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V")
	public static void method4231() {
		Static57.aClass19_7.UA(Static352.anInt6110, Static323.aClass50_Sub1_1.aBoolean298 ? Static8.anInt116 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(B)I")
	public static int method4232() {
		@Pc(10) Class68 local10 = Static442.aClass68_58;
		synchronized (Static442.aClass68_58) {
			return Static442.aClass68_58.method1786();
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!fs;ILclient!fs;)V")
	public static void method4234(@OriginalArg(0) Class76 arg0, @OriginalArg(2) Class76 arg1) {
		Static10.aClass76_1 = arg0;
		Static414.aClass76_96 = arg1;
	}
}
