import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "J")
	public static long aLong106 = 0L;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)Z")
	public static boolean method3011(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static96.aBoolean151) {
			return false;
		}
		@Pc(11) int local11 = arg0 >> 16;
		@Pc(15) int local15 = arg0 & 0xFFFF;
		if (Static293.aClass68ArrayArray4[local11] == null || Static293.aClass68ArrayArray4[local11][local15] == null) {
			return false;
		}
		@Pc(40) Class68 local40 = Static293.aClass68ArrayArray4[local11][local15];
		@Pc(54) Class1_Sub35 local54;
		if (arg1 == -1 && local40.anInt2153 == 0) {
			for (local54 = (Class1_Sub35) Static401.aClass203_47.method4548(); local54 != null; local54 = (Class1_Sub35) Static401.aClass203_47.method4545()) {
				if (local54.anInt5839 == 51 || local54.anInt5839 == 1009 || local54.anInt5839 == 2 || local54.anInt5839 == 18 || local54.anInt5839 == 47) {
					for (@Pc(143) Class68 local143 = Static300.method4351(local54.anInt5841); local143 != null; local143 = Static420.method3351(local143)) {
						if (local143.anInt2135 == local40.anInt2135) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class1_Sub35) Static401.aClass203_47.method4548(); local54 != null; local54 = (Class1_Sub35) Static401.aClass203_47.method4545()) {
				if (local54.anInt5842 == arg1 && local54.anInt5841 == local40.anInt2135 && (local54.anInt5839 == 51 || local54.anInt5839 == 1009 || local54.anInt5839 == 2 || local54.anInt5839 == 18 || local54.anInt5839 == 47)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method3012(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = Static244.method3646(arg0.charAt(local10)) + (local8 << 5) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!qs;Lclient!qs;Lclient!qs;ILclient!qs;)V")
	public static void method3013(@OriginalArg(0) Class211 arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(4) Class211 arg3) {
		Static238.aClass211_61 = arg3;
		Static311.aClass211_73 = arg2;
		Static437.aClass211_89 = arg0;
		Static292.aClass211_70 = arg1;
		Static293.aClass68ArrayArray4 = new Class68[Static311.aClass211_73.method4751()][];
		Static412.aBooleanArray24 = new boolean[Static311.aClass211_73.method4751()];
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	public static void method3014() {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			Static58.aBooleanArray8[local6] = true;
		}
	}
}
