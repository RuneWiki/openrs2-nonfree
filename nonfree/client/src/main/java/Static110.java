import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
	public static int anInt2934;

	@OriginalMember(owner = "client!jd", name = "S", descriptor = "Z")
	public static boolean aBoolean160;

	@OriginalMember(owner = "client!jd", name = "T", descriptor = "Lclient!hc;")
	public static Class51 aClass51_37;

	@OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
	public static int anInt2935;

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "Lclient!h;")
	public static Class1_Sub13_Sub1 aClass1_Sub13_Sub1_2 = new Class1_Sub13_Sub1(5000);

	@OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
	public static int anInt2936 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)I")
	public static int method2244(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(19) Class1_Sub23 local19 = (Class1_Sub23) Static249.aClass140_17.method4014((long) arg0);
		if (local19 == null) {
			return Static179.method3057(arg0).anInt114;
		}
		@Pc(28) int local28 = 0;
		for (@Pc(38) int local38 = 0; local38 < local19.anIntArray342.length; local38++) {
			if (local19.anIntArray342[local38] == -1) {
				local28++;
			}
		}
		return local28 + Static179.method3057(arg0).anInt114 - local19.anIntArray342.length;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
	public static int method2245(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local6 | local6 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)I")
	public static int method2246() {
		return 0;
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
	public static void method2247() {
		@Pc(3) boolean local3 = false;
		while (!local3) {
			local3 = true;
			for (@Pc(14) int local14 = 0; local14 < Static230.anInt5417 - 1; local14++) {
				if (Static57.aShortArray26[local14] < 1000 && Static57.aShortArray26[local14 + 1] > 1000) {
					local3 = false;
					@Pc(36) String local36 = Static174.aStringArray33[local14];
					Static174.aStringArray33[local14] = Static174.aStringArray33[local14 + 1];
					Static174.aStringArray33[local14 + 1] = local36;
					@Pc(54) String local54 = Static8.aStringArray3[local14];
					Static8.aStringArray3[local14] = Static8.aStringArray3[local14 + 1];
					Static8.aStringArray3[local14 + 1] = local54;
					@Pc(72) int local72 = Static216.anIntArray379[local14];
					Static216.anIntArray379[local14] = Static216.anIntArray379[local14 + 1];
					Static216.anIntArray379[local14 + 1] = local72;
					@Pc(90) int local90 = Static161.anIntArray281[local14];
					Static161.anIntArray281[local14] = Static161.anIntArray281[local14 + 1];
					Static161.anIntArray281[local14 + 1] = local90;
					@Pc(108) int local108 = Static170.anIntArray299[local14];
					Static170.anIntArray299[local14] = Static170.anIntArray299[local14 + 1];
					Static170.anIntArray299[local14 + 1] = local108;
					@Pc(126) short local126 = Static57.aShortArray26[local14];
					Static57.aShortArray26[local14] = Static57.aShortArray26[local14 + 1];
					Static57.aShortArray26[local14 + 1] = local126;
					@Pc(144) long local144 = Static84.aLongArray14[local14];
					Static84.aLongArray14[local14] = Static84.aLongArray14[local14 + 1];
					Static84.aLongArray14[local14 + 1] = local144;
				}
			}
		}
	}
}
