import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
	public static int anInt3386;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
	public static int anInt3387;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_54 = new Class208(54, -1);

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "[I")
	public static final int[] anIntArray280 = new int[1];

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "[I")
	public static final int[] anIntArray281 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_65 = new Class231("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Z")
	public static boolean method2779(@OriginalArg(1) int arg0) {
		if (Static219.aBooleanArray19[arg0]) {
			return true;
		} else if (Static166.aClass171_41.method3656(arg0)) {
			@Pc(23) int local23 = Static166.aClass171_41.method3662(arg0);
			if (local23 == 0) {
				Static219.aBooleanArray19[arg0] = true;
				return true;
			}
			if (Static188.aClass93ArrayArray4[arg0] == null) {
				Static188.aClass93ArrayArray4[arg0] = new Class93[local23];
			}
			for (@Pc(43) int local43 = 0; local43 < local23; local43++) {
				if (Static188.aClass93ArrayArray4[arg0][local43] == null) {
					@Pc(57) byte[] local57 = Static166.aClass171_41.method3658(arg0, local43);
					if (local57 != null) {
						@Pc(69) Class93 local69 = Static188.aClass93ArrayArray4[arg0][local43] = new Class93();
						local69.anInt2508 = (arg0 << 16) + local43;
						if (local57[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local69.method2113(new Class2_Sub17(local57));
					}
				}
			}
			Static219.aBooleanArray19[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II[Lclient!gi;)V")
	public static void method2780(@OriginalArg(1) int arg0, @OriginalArg(2) Class93[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class93 local17 = arg1[local11];
			if (local17 != null) {
				if (local17.anInt2494 == 0) {
					if (local17.aClass93Array1 != null) {
						method2780(arg0, local17.aClass93Array1);
					}
					@Pc(38) Class2_Sub9 local38 = (Class2_Sub9) Static394.aClass220_45.method5099((long) local17.anInt2508);
					if (local38 != null) {
						Static233.method3189(local38.anInt1143, arg0);
					}
				}
				@Pc(54) Class2_Sub18 local54;
				if (arg0 == 0 && local17.anObjectArray17 != null) {
					local54 = new Class2_Sub18();
					local54.aClass93_10 = local17;
					local54.anObjectArray33 = local17.anObjectArray17;
					Static76.method1143(local54);
				}
				if (arg0 == 1 && local17.anObjectArray15 != null) {
					if (local17.anInt2424 >= 0) {
						@Pc(79) Class93 local79 = Static160.method2380(local17.anInt2508);
						if (local79 == null || local79.aClass93Array1 == null || local17.anInt2424 >= local79.aClass93Array1.length || local79.aClass93Array1[local17.anInt2424] != local17) {
							continue;
						}
					}
					local54 = new Class2_Sub18();
					local54.aClass93_10 = local17;
					local54.anObjectArray33 = local17.anObjectArray15;
					Static76.method1143(local54);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	public static String method2781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)Z")
	public static boolean method2783() {
		@Pc(12) Class2 local12 = Static93.aClass181_7.aClass2_156.aClass2_267;
		if (local12 == null || Static93.aClass181_7.aClass2_156 == local12) {
			return false;
		}
		@Pc(23) Class2_Sub35 local23 = (Class2_Sub35) local12;
		if (local23.anInt5875 >= 2000) {
			local23.anInt5875 -= 2000;
		}
		return local23.anInt5875 == 1012;
	}
}
