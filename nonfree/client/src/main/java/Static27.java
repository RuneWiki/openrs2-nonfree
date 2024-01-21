import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "[Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array16;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public static int anInt818;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "Lclient!rd;")
	public static Class42_Sub1 aClass42_Sub1_18;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "[I")
	public static int[] anIntArray62 = new int[500];

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	public static int anInt811 = 0;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	public static int anInt813 = 0;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Lclient!v;")
	private static Class62 aClass62_344 = Static45.method753("Add ignore");

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!v;")
	public static Class62 aClass62_342 = aClass62_344;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!v;")
	public static Class62 aClass62_343 = Static45.method753("Benutzen Sie die (WPasswort \u001c1ndern(W Option");

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
	public static int anInt822 = 0;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
	public static int anInt824 = 0;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Lclient!v;")
	private static Class62 aClass62_345 = Static45.method753("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "Lclient!v;")
	private static Class62 aClass62_346 = Static45.method753("Loaded title screen");

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "Lclient!v;")
	public static Class62 aClass62_347 = Static45.method753(" hat sich eingeloggt)3");

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "Lclient!v;")
	private static Class62 aClass62_348 = Static45.method753("Prepared visibility map");

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Lclient!v;")
	public static Class62 aClass62_349 = aClass62_346;

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "Lclient!v;")
	public static Class62 aClass62_350 = aClass62_348;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
	public static int anInt825 = 0;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "Lclient!v;")
	public static Class62 aClass62_351 = aClass62_345;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "Lclient!v;")
	public static Class62 aClass62_352 = Static45.method753("Aus");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZIIIBILclient!rd;)V")
	public static void method526(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42_Sub1 arg5) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg4);
		@Pc(16) Class3_Sub1_Sub10 local16 = (Class3_Sub1_Sub10) Static46.aClass43_6.method1079(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub10) Static41.aClass43_4.method1079(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub10) Static13.aClass43_1.method1079(local10);
		if (local16 == null) {
			if (!arg0) {
				local16 = (Class3_Sub1_Sub10) Static17.aClass43_10.method1079(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class3_Sub1_Sub10();
			local16.aClass42_Sub1_42 = arg5;
			local16.anInt1930 = arg2;
			local16.aByte2 = arg3;
			if (arg0) {
				Static46.aClass43_6.method1081(local10, local16);
				Static98.anInt2584++;
			} else {
				Static22.aClass40_1.method982(local16);
				Static13.aClass43_1.method1081(local10, local16);
				Static62.anInt1716++;
			}
		} else if (arg0) {
			local16.method1839();
			Static46.aClass43_6.method1081(local10, local16);
			Static98.anInt2584++;
			Static62.anInt1716--;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public static void method532() {
		aClass62_351 = null;
		aClass62_346 = null;
		aClass62_349 = null;
		aClass62_344 = null;
		aByteArrayArrayArray5 = null;
		aClass62_342 = null;
		aClass62_350 = null;
		anIntArray62 = null;
		aClass62_347 = null;
		aClass62_345 = null;
		aClass62_343 = null;
		aClass62_352 = null;
		aClass62_348 = null;
		aClass42_Sub1_18 = null;
		aClass3_Sub1_Sub1_Sub4Array16 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
	public static void method533() {
		for (@Pc(18) int local18 = 0; local18 < Static90.anInt2427; local18++) {
			@Pc(24) int local24 = Static98.anIntArray283[local18];
			@Pc(28) Class3_Sub1_Sub3_Sub1_Sub1 local28 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local24];
			@Pc(32) int local32 = Static10.aClass3_Sub8_Sub1_5.method1803();
			if ((local32 & 0x20) != 0) {
				local32 += Static10.aClass3_Sub8_Sub1_5.method1803() << 8;
			}
			Static8.method212(local32, local24, local28);
		}
	}
}
