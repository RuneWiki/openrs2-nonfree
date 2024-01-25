import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "Lclient!js;")
	public static final Class157 aClass157_1 = new Class157();

	@OriginalMember(owner = "client!nr", name = "I", descriptor = "Lclient!tda;")
	public static final Class273 aClass273_8 = new Class273(12, 0, 1, 0);

	@OriginalMember(owner = "client!nr", name = "K", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_99 = new Class6(13, 8);

	@OriginalMember(owner = "client!nr", name = "L", descriptor = "I")
	public static int anInt6209 = 0;

	@OriginalMember(owner = "client!nr", name = "M", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_100 = new Class6(113, 0);

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "(I)V")
	public static void method5367() {
		if (!Static25.method1154()) {
			return;
		}
		if (Static300.aStringArray26 == null) {
			Static69.method7887();
		}
		Static473.aBoolean549 = true;
		Static366.anInt7092 = 0;
		try {
			Static542.aClipboard1 = Static496.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(16) Exception local16) {
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(IBI)Z")
	public static boolean method5369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!up;IIZ)J")
	public static long method5370(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) long local14 = 4194304L;
		@Pc(16) long local16 = 2147483648L;
		@Pc(18) long local18 = Long.MIN_VALUE;
		@Pc(25) Class288 local25 = Static365.aClass194_6.method5084(arg0.method7172());
		@Pc(46) long local46 = (long) (arg1 | 0x40000000 | arg2 << 7 | arg0.method7176() << 14 | arg0.method7173() << 20);
		if (local25.anInt8338 == 0) {
			local46 |= local18;
		}
		if (local25.anInt8325 == 1) {
			local46 |= local14;
		}
		if (local25.aBoolean567) {
			local46 |= local16;
		}
		return local46 | (long) arg0.method7172() << 32;
	}
}
