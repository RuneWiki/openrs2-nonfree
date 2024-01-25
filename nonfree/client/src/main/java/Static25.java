import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Lclient!il;")
	public static final Class93 aClass93_7 = new Class93(8, 7);

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_47 = new Class106("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
	public static final int[] anIntArray81 = new int[25];

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "[B")
	public static final byte[] aByteArray21 = new byte[2048];

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)V")
	public static void method1281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0];
		@Pc(19) int local19 = Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0];
		if (Static215.aClass81_2 == Static285.aClass81_4) {
			if (!Static366.method6070(0, arg1, -2, 1, false, arg0, local14, 1, 0, local19)) {
				Static366.method6070(0, arg1, -3, 1, false, arg0, local14, 1, 0, local19);
			}
		} else if (!Static366.method6070(0, arg1, -3, 1, false, arg0, local14, 1, 0, local19)) {
			Static366.method6070(0, arg1, -2, 1, false, arg0, local14, 1, 0, local19);
		}
	}

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)I")
	public static int method1282() {
		@Pc(10) Class21 local10 = Static362.aClass21_179;
		synchronized (Static362.aClass21_179) {
			return Static362.aClass21_179.method855();
		}
	}
}
