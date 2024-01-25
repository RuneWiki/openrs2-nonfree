import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_6 = new Class109(16);

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public static int anInt456 = 1;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
	public static final int[] anIntArray57 = new int[50];

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public static void method423() {
		@Pc(1) Class109 local1 = Static174.aClass109_39;
		synchronized (Static174.aClass109_39) {
			Static174.aClass109_39.method2858();
		}
		local1 = Static38.aClass109_11;
		synchronized (Static38.aClass109_11) {
			Static38.aClass109_11.method2858();
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Lclient!ge;")
	public static Class5_Sub1_Sub6 method425() {
		return Static290.aClass5_Sub1_Sub6_2;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[Lclient!vg;I)V")
	public static void method428(@OriginalArg(0) int arg0, @OriginalArg(1) Class201[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class201 local17 = arg1[local11];
			if (local17 != null && local17.anInt6491 == arg0 && !Static45.method710(local17)) {
				if (local17.anInt6559 == 0) {
					method428(local17.anInt6541, arg1);
					if (local17.aClass201Array121 != null) {
						method428(local17.anInt6541, local17.aClass201Array121);
					}
					@Pc(51) Class5_Sub18 local51 = (Class5_Sub18) Static198.aClass190_21.method5466((long) local17.anInt6541);
					if (local51 != null) {
						Static28.method629(local51.anInt1871);
					}
				}
				if (local17.anInt6559 == 6 && local17.anInt6526 != -1) {
					@Pc(72) Class89 local72 = Static162.method2849(local17.anInt6526);
					if (local72 != null) {
						local17.anInt6534 += Static26.anInt519;
						while (local72.anIntArray244[local17.anInt6490] < local17.anInt6534) {
							local17.anInt6534 -= local72.anIntArray244[local17.anInt6490];
							local17.anInt6490++;
							if (local72.anIntArray245.length <= local17.anInt6490) {
								local17.anInt6490 -= local72.anInt2466;
								if (local17.anInt6490 < 0 || local72.anIntArray245.length <= local17.anInt6490) {
									local17.anInt6490 = 0;
								}
							}
							local17.anInt6549 = local17.anInt6490 + 1;
							if (local17.anInt6549 >= local72.anIntArray245.length) {
								local17.anInt6549 -= local72.anInt2466;
								if (local17.anInt6549 < 0 || local17.anInt6549 >= local72.anIntArray245.length) {
									local17.anInt6549 = -1;
								}
							}
							Static189.method3383(local17);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method431(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)Z")
	public static boolean method432() {
		try {
			if (Static250.anInt4969 == 2) {
				if (Static162.aClass5_Sub6_2 == null) {
					Static162.aClass5_Sub6_2 = Static358.method353(Static56.aClass93_22, Static297.anInt5809, Static115.anInt2139);
					if (Static162.aClass5_Sub6_2 == null) {
						return false;
					}
				}
				if (Static193.aClass217_2 == null) {
					Static193.aClass217_2 = new Class217(Static109.aClass93_44, Static346.aClass93_129);
				}
				if (Static188.aClass5_Sub16_Sub1_3.method1682(Static193.aClass217_2, Static26.aClass93_10, Static162.aClass5_Sub6_2)) {
					Static188.aClass5_Sub16_Sub1_3.method1663();
					Static188.aClass5_Sub16_Sub1_3.method1674(Static51.anInt966);
					Static188.aClass5_Sub16_Sub1_3.method1677(Static162.aClass5_Sub6_2, Static249.aBoolean518);
					Static56.aClass93_22 = null;
					Static162.aClass5_Sub6_2 = null;
					Static193.aClass217_2 = null;
					Static250.anInt4969 = 0;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static188.aClass5_Sub16_Sub1_3.method1660();
			Static193.aClass217_2 = null;
			Static56.aClass93_22 = null;
			Static250.anInt4969 = 0;
			Static162.aClass5_Sub6_2 = null;
		}
		return false;
	}
}
