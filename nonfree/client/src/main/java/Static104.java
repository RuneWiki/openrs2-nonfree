import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	public static int anInt2255;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "Lclient!tk;")
	public static Class192 aClass192_1;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLclient!en;)V")
	public static void method2063(@OriginalArg(1) Class59 arg0) {
		if (Static60.aClass211_3.method5610() == 0) {
			return;
		}
		@Pc(61) Class5_Sub41 local61;
		if (Static134.anInt2746 == 0 || Static134.anInt2746 == 2) {
			for (local61 = (Class5_Sub41) Static60.aClass211_3.method5608(); local61 != null; local61 = (Class5_Sub41) Static60.aClass211_3.method5603()) {
				Static108.method2168(local61.anInt6348, local61.anInt6350, arg0, local61.anInt6351, false, local61.anInt6346, arg0, Static247.aClass91_9, local61.aBoolean471 ? Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1 : null, false, local61.anInt6347);
				local61.method5803();
			}
			Static241.method4110();
			return;
		}
		if (Static277.aClass59_7 == null) {
			@Pc(31) Canvas local31 = new Canvas();
			local31.setSize(36, 32);
			Static277.aClass59_7 = Static129.method2469(0, Static112.anInterface1_2, 0, local31, Static202.aClass10_3);
			Static338.aClass91_10 = Static277.aClass59_7.method4813(Static61.method1256(Static202.aClass170_75, Static106.anInt2306), Static360.method918(Static317.aClass170_114, Static106.anInt2306));
		}
		for (local61 = (Class5_Sub41) Static60.aClass211_3.method5608(); local61 != null; local61 = (Class5_Sub41) Static60.aClass211_3.method5603()) {
			Static108.method2168(local61.anInt6348, local61.anInt6350, arg0, local61.anInt6351, false, local61.anInt6346, Static277.aClass59_7, Static338.aClass91_10, local61.aBoolean471 ? Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1 : null, false, local61.anInt6347);
			local61.method5803();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!jf;Ljava/lang/String;)Ljava/lang/String;")
	public static String method2064(@OriginalArg(1) Class96 arg0, @OriginalArg(2) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(11) int local11 = arg1.indexOf("%1");
			if (local11 == -1) {
				while (true) {
					local11 = arg1.indexOf("%2");
					if (local11 == -1) {
						while (true) {
							local11 = arg1.indexOf("%3");
							if (local11 == -1) {
								while (true) {
									local11 = arg1.indexOf("%4");
									if (local11 == -1) {
										while (true) {
											local11 = arg1.indexOf("%5");
											if (local11 == -1) {
												while (true) {
													local11 = arg1.indexOf("%dns");
													if (local11 == -1) {
														return arg1;
													}
													@Pc(178) String local178 = "";
													if (Static345.aClass60_7 != null) {
														if (Static345.aClass60_7.anObject2 == null) {
															local178 = Static254.method4682(Static345.aClass60_7.anInt1837);
														} else {
															local178 = (String) Static345.aClass60_7.anObject2;
														}
													}
													arg1 = arg1.substring(0, local11) + local178 + arg1.substring(local11 + 4);
												}
											}
											arg1 = arg1.substring(0, local11) + Static28.method714(Static195.method3508(arg0, 4)) + arg1.substring(local11 + 2);
										}
									}
									arg1 = arg1.substring(0, local11) + Static28.method714(Static195.method3508(arg0, 3)) + arg1.substring(local11 + 2);
								}
							}
							arg1 = arg1.substring(0, local11) + Static28.method714(Static195.method3508(arg0, 2)) + arg1.substring(local11 + 2);
						}
					}
					arg1 = arg1.substring(0, local11) + Static28.method714(Static195.method3508(arg0, 1)) + arg1.substring(local11 + 2);
				}
			}
			arg1 = arg1.substring(0, local11) + Static28.method714(Static195.method3508(arg0, 0)) + arg1.substring(local11 + 2);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!fk;")
	public static Class53 method2065(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(12) Class local12 = Class.forName("Class53_Sub1");
			@Pc(16) Class53 local16 = (Class53) local12.getDeclaredConstructor().newInstance();
			local16.method1386(arg0);
			return local16;
		} catch (@Pc(23) Throwable local23) {
			@Pc(27) Class53_Sub2 local27 = new Class53_Sub2();
			local27.method1386(arg0);
			return local27;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)Lclient!ch;")
	public static Class33 method2066(@OriginalArg(0) int arg0) {
		@Pc(5) Class66 local5 = Static261.aClass66_88;
		@Pc(14) Class33 local14;
		synchronized (Static261.aClass66_88) {
			local14 = (Class33) Static261.aClass66_88.method1939((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(35) byte[] local35 = Static225.aClass170_78.method4584(32, arg0);
		local14 = new Class33();
		if (local35 != null) {
			local14.method879(new Class5_Sub1(local35));
		}
		local14.method881();
		@Pc(53) Class66 local53 = Static261.aClass66_88;
		synchronized (Static261.aClass66_88) {
			Static261.aClass66_88.method1936((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)[B")
	public static byte[] method2067(@OriginalArg(1) int arg0) {
		@Pc(12) Class5_Sub9_Sub10 local12 = (Class5_Sub9_Sub10) Static226.aClass215_8.method5683((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(47) int local47 = 255 - local40;
				@Pc(52) int local52 = Static210.method4979(local47, local23);
				@Pc(56) byte local56 = local17[local52];
				local17[local52] = local17[local47];
				local17[local47] = local17[511 - local40] = local56;
			}
			local12 = new Class5_Sub9_Sub10(local17);
			Static226.aClass215_8.method5687(local12, (long) arg0);
		}
		return local12.aByteArray22;
	}
}
