import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
	public static int anInt1122;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_419 = Static41.method597("null");

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "[S")
	public static short[] aShortArray17 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IJ)V")
	public static void method626(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static59.anInt1560; local12++) {
			if (arg0 == Static26.aLongArray3[local12]) {
				Static59.anInt1560--;
				for (@Pc(36) int local36 = local12; local36 < Static59.anInt1560; local36++) {
					Static26.aLongArray3[local36] = Static26.aLongArray3[local36 + 1];
				}
				Static8.anInt94 = Static87.anInt2052;
				Static14.aClass4_Sub9_Sub1_1.method826(1);
				Static14.aClass4_Sub9_Sub1_1.method805(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method627() {
		aClass60_419 = null;
		aShortArray17 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tf;I)V")
	public static void method628(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static77.aClass16_8 != null) {
			@Pc(25) int local25;
			try {
				Static77.aClass16_8.method431(0L);
				Static77.aClass16_8.method434(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(52) Exception local52) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method824(local13, 24);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([BZ)V")
	public static void method629(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub9 local10 = new Class4_Sub9(arg0);
		local10.anInt1312 = arg0.length - 2;
		Static65.anInt1635 = local10.method816();
		Static29.anIntArray91 = new int[Static65.anInt1635];
		Static125.anIntArray341 = new int[Static65.anInt1635];
		Static113.anIntArray132 = new int[Static65.anInt1635];
		Static2.anIntArray1 = new int[Static65.anInt1635];
		Static56.aByteArrayArray7 = new byte[Static65.anInt1635][];
		local10.anInt1312 = arg0.length - Static65.anInt1635 * 8 - 7;
		Static31.anInt910 = local10.method816();
		Static5.anInt70 = local10.method816();
		@Pc(61) int local61 = (local10.method773() & 0xFF) + 1;
		for (@Pc(63) int local63 = 0; local63 < Static65.anInt1635; local63++) {
			Static2.anIntArray1[local63] = local10.method816();
		}
		for (@Pc(77) int local77 = 0; local77 < Static65.anInt1635; local77++) {
			Static29.anIntArray91[local77] = local10.method816();
		}
		for (@Pc(95) int local95 = 0; local95 < Static65.anInt1635; local95++) {
			Static125.anIntArray341[local95] = local10.method816();
		}
		for (@Pc(109) int local109 = 0; local109 < Static65.anInt1635; local109++) {
			Static113.anIntArray132[local109] = local10.method816();
		}
		local10.anInt1312 = arg0.length - Static65.anInt1635 * 8 - (local61 + -1) * 3 - 7;
		Static75.anIntArray125 = new int[local61];
		for (@Pc(147) int local147 = 1; local147 < local61; local147++) {
			Static75.anIntArray125[local147] = local10.method806();
			if (Static75.anIntArray125[local147] == 0) {
				Static75.anIntArray125[local147] = 1;
			}
		}
		local10.anInt1312 = 0;
		for (@Pc(175) int local175 = 0; local175 < Static65.anInt1635; local175++) {
			@Pc(181) int local181 = Static125.anIntArray341[local175];
			@Pc(185) int local185 = Static113.anIntArray132[local175];
			@Pc(189) int local189 = local185 * local181;
			@Pc(192) byte[] local192 = new byte[local189];
			Static56.aByteArrayArray7[local175] = local192;
			@Pc(200) int local200 = local10.method773();
			@Pc(207) int local207;
			if (local200 == 0) {
				for (local207 = 0; local207 < local189; local207++) {
					local192[local207] = local10.method797();
				}
			} else if (local200 == 1) {
				for (local207 = 0; local207 < local181; local207++) {
					for (@Pc(211) int local211 = 0; local211 < local185; local211++) {
						local192[local207 + local181 * local211] = local10.method797();
					}
				}
			}
		}
	}
}
