import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!i", name = "v", descriptor = "I")
	public static int anInt2102;

	@OriginalMember(owner = "client!i", name = "w", descriptor = "I")
	public static int anInt2103;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "I")
	public static int anInt2095 = 0;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "I")
	public static int anInt2097 = 0;

	@OriginalMember(owner = "client!i", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString85 = "Members object";

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
	public static void method1825() {
		if (Static241.anInt4885 == 5) {
			Static241.anInt4885 = 6;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)[Lclient!ho;")
	public static Class3_Sub4_Sub12[] method1826() {
		@Pc(4) Class3_Sub4_Sub12[] local4 = new Class3_Sub4_Sub12[Static28.anInt494];
		for (@Pc(6) int local6 = 0; local6 < Static28.anInt494; local6++) {
			@Pc(17) int local17 = Static101.anIntArray185[local6] * Static306.anIntArray618[local6];
			@Pc(21) byte[] local21 = Static314.aByteArrayArray130[local6];
			@Pc(24) int[] local24 = new int[local17];
			for (@Pc(26) int local26 = 0; local26 < local17; local26++) {
				local24[local26] = Static299.anIntArray611[local21[local26] & 0xFF];
			}
			if (Static283.aBoolean393) {
				local4[local6] = new Class3_Sub4_Sub12_Sub1(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[local6], Static35.anIntArray54[local6], Static101.anIntArray185[local6], Static306.anIntArray618[local6], local24);
			} else {
				local4[local6] = new Class3_Sub4_Sub12_Sub2(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[local6], Static35.anIntArray54[local6], Static101.anIntArray185[local6], Static306.anIntArray618[local6], local24);
			}
		}
		Static6.method108();
		return local4;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1827(@OriginalArg(1) String arg0) {
		@Pc(9) int local9 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local9; local17++) {
			local15 = arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method1828(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
