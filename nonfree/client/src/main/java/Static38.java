import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "Lclient!ke;")
	public static Class41_Sub1 aClass41_Sub1_7;

	@OriginalMember(owner = "client!ge", name = "W", descriptor = "J")
	public static long aLong31;

	@OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
	public static int anInt907;

	@OriginalMember(owner = "client!ge", name = "ab", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "Lclient!rd;")
	public static Class64 aClass64_585 = Static69.method1153("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "Lclient!rd;")
	private static Class64 aClass64_586 = Static69.method1153("Loaded update list");

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "Lclient!rd;")
	public static Class64 aClass64_587 = aClass64_586;

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "[B")
	public static byte[] aByteArray7 = new byte[520];

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "Lclient!rd;")
	public static Class64 aClass64_588 = Static69.method1153("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "Lclient!rd;")
	public static Class64 aClass64_589 = Static69.method1153("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!ge", name = "Z", descriptor = "Lclient!rd;")
	private static Class64 aClass64_590 = Static69.method1153("Existing user");

	@OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_591 = aClass64_590;

	@OriginalMember(owner = "client!ge", name = "cb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_592 = Static69.method1153("Cancel");

	@OriginalMember(owner = "client!ge", name = "db", descriptor = "Lclient!rd;")
	public static Class64 aClass64_593 = aClass64_592;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!rd;Lclient!pb;ZLclient!rd;)Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 method682(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(3) Class64 arg2) {
		@Pc(4) int local4 = arg1.method1066(arg0);
		@Pc(15) int local15 = arg1.method1050(arg2, local4);
		return Static52.method2080(arg1, local4, local15);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)I")
	public static int method683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg2 & 0x3;
		if (local8 == 0) {
			return arg1;
		} else if (local8 == 1) {
			return 7 - arg0;
		} else if (local8 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
	public static void method684() {
		aClass64_589 = null;
		aClass64_593 = null;
		Class2_Sub2.anIntArray140 = null;
		aByteArray7 = null;
		aClass41_Sub1_7 = null;
		aClass64_590 = null;
		aClass64_585 = null;
		aClass64_592 = null;
		aClass64_588 = null;
		aClass64_591 = null;
		aClass64_587 = null;
		anIntArrayArray7 = null;
		aClass64_586 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!oa;B)V")
	public static void method685(@OriginalArg(0) Class1_Sub1_Sub5_Sub3 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static6.anIntArray47.length; local11++) {
			Static6.anIntArray47[local11] = 0;
		}
		@Pc(40) int local40;
		for (@Pc(30) int local30 = 0; local30 < 5000; local30++) {
			local40 = (int) (Math.random() * 128.0D * (double) 256);
			Static6.anIntArray47[local40] = (int) (Math.random() * 256.0D);
		}
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(71) int local71;
		for (local40 = 0; local40 < 20; local40++) {
			for (local59 = 1; local59 < 255; local59++) {
				for (local63 = 1; local63 < 127; local63++) {
					local71 = (local59 << 7) + local63;
					Static51.anIntArray166[local71] = (Static6.anIntArray47[local71 + 1] + Static6.anIntArray47[local71 - 1] + Static6.anIntArray47[local71 + -128] + Static6.anIntArray47[local71 + 128]) / 4;
				}
			}
			@Pc(113) int[] local113 = Static6.anIntArray47;
			Static6.anIntArray47 = Static51.anIntArray166;
			Static51.anIntArray166 = local113;
		}
		if (arg0 == null) {
			return;
		}
		local59 = 0;
		for (local63 = 0; local63 < arg0.anInt1800; local63++) {
			for (local71 = 0; local71 < arg0.anInt1799; local71++) {
				if (arg0.aByteArray22[local59++] != 0) {
					@Pc(152) int local152 = local63 + arg0.anInt1797 + 16;
					@Pc(159) int local159 = arg0.anInt1796 + local71 + 16;
					@Pc(165) int local165 = (local152 << 7) + local159;
					Static6.anIntArray47[local165] = 0;
				}
			}
		}
	}
}
