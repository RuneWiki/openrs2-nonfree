import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
	public static int anInt1415 = 0;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "Lclient!lf;")
	public static Class48 aClass48_28 = new Class48(64);

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	public static int anInt1443 = 0;

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "Lclient!ic;")
	private static Class34 aClass34_706 = method816("No reply from loginserver)3");

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "Lclient!ic;")
	public static Class34 aClass34_704 = aClass34_706;

	@OriginalMember(owner = "client!ic", name = "ab", descriptor = "Lclient!ic;")
	private static Class34 aClass34_708 = method816("Loading)3)3)3");

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "Lclient!ic;")
	public static Class34 aClass34_705 = aClass34_708;

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lclient!ic;")
	private static Class34 aClass34_707 = method816("Walk here");

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
	public static int anInt1447 = 0;

	@OriginalMember(owner = "client!ic", name = "db", descriptor = "Lclient!ic;")
	public static Class34 aClass34_709 = aClass34_707;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	public static void method813() {
		for (@Pc(11) Class8_Sub1_Sub1_Sub7 local11 = (Class8_Sub1_Sub1_Sub7) Static82.aClass49_8.method1107(); local11 != null; local11 = (Class8_Sub1_Sub1_Sub7) Static82.aClass49_8.method1109()) {
			if (Static42.anInt1024 != local11.anInt2962 || local11.anInt2968 < Static21.anInt655) {
				local11.method2013();
			} else if (local11.anInt2961 <= Static21.anInt655) {
				if (local11.anInt2981 > 0) {
					@Pc(52) Class8_Sub1_Sub1_Sub4_Sub2 local52 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local11.anInt2981 - 1];
					if (local52 != null && local52.anInt2043 >= 0 && local52.anInt2043 < 13312 && local52.anInt2059 >= 0 && local52.anInt2059 < 13312) {
						local11.method1968(local52.anInt2043, Static123.method1945(local52.anInt2059, local11.anInt2962, local52.anInt2043) - local11.anInt2972, local52.anInt2059, Static21.anInt655);
					}
				}
				if (local11.anInt2981 < 0) {
					@Pc(99) int local99 = -local11.anInt2981 - 1;
					@Pc(104) Class8_Sub1_Sub1_Sub4_Sub1 local104;
					if (Static2.anInt33 == local99) {
						local104 = Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1;
					} else {
						local104 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local99];
					}
					if (local104 != null && local104.anInt2043 >= 0 && local104.anInt2043 < 13312 && local104.anInt2059 >= 0 && local104.anInt2059 < 13312) {
						local11.method1968(local104.anInt2043, Static123.method1945(local104.anInt2059, local11.anInt2962, local104.anInt2043) - local11.anInt2972, local104.anInt2059, Static21.anInt655);
					}
				}
				local11.method1962(Static69.anInt1683);
				Static3.aClass64_1.method1419(Static42.anInt1024, (int) local11.aDouble6, (int) local11.aDouble8, (int) local11.aDouble5, 60, local11, local11.anInt2965, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ic;")
	public static Class34 method816(@OriginalArg(1) String arg0) {
		@Pc(2) byte[] local2 = arg0.getBytes();
		@Pc(4) int local4 = 0;
		@Pc(7) int local7 = local2.length;
		@Pc(11) Class34 local11 = new Class34();
		local11.aByteArray20 = new byte[local7];
		while (local7 > local4) {
			@Pc(27) int local27 = local2[local4++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local7 <= local4) {
					break;
				}
				@Pc(65) int local65 = local2[local4++] & 0xFF;
				local11.aByteArray20[local11.anInt1418++] = (byte) (local27 * 43 + local65 - 1720 - 48);
			} else if (local27 != 0) {
				local11.aByteArray20[local11.anInt1418++] = (byte) local27;
			}
		}
		local11.method819();
		return local11.method814();
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
	public static void method821() {
		if (Static90.aClass25_2 != null) {
			Static90.aClass25_2.method588();
		}
	}

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)V")
	public static void method837() {
		aClass34_705 = null;
		aClass34_708 = null;
		aClass34_706 = null;
		aClass34_704 = null;
		aClass34_709 = null;
		aClass34_707 = null;
		aClass48_28 = null;
	}
}
