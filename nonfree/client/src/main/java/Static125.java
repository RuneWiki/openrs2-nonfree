import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!ws;")
	public static Class251 aClass251_2;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	public static int anInt2370;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_64 = new Class41(10, 2);

	@OriginalMember(owner = "client!h", name = "n", descriptor = "I")
	public static int anInt2377 = 13156520;

	@OriginalMember(owner = "client!h", name = "o", descriptor = "I")
	public static int anInt2378 = 0;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!ve;")
	public static Class46 method2256(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class46_Sub2");
			@Pc(10) Class46 local10 = (Class46) local6.getDeclaredConstructor().newInstance();
			local10.method2196(arg0);
			return local10;
		} catch (@Pc(23) Throwable local23) {
			@Pc(27) Class46_Sub1 local27 = new Class46_Sub1();
			local27.method2196(arg0);
			return local27;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	public static void method2257() {
		if (Static289.anInt5127 == 0) {
			return;
		}
		try {
			if (++Static265.anInt4677 > 2000) {
				if (Static169.aClass124_3 != null) {
					Static169.aClass124_3.method2714();
					Static169.aClass124_3 = null;
				}
				if (Static343.anInt6052 >= 1) {
					Static304.anInt2193 = -5;
					Static289.anInt5127 = 0;
					return;
				}
				Static265.anInt4677 = 0;
				Static289.anInt5127 = 1;
				if (Static225.anInt4195 == Static33.anInt704) {
					Static225.anInt4195 = Static230.anInt4259;
				} else {
					Static225.anInt4195 = Static33.anInt704;
				}
				Static343.anInt6052++;
			}
			if (Static289.anInt5127 == 1) {
				Static383.aClass1_10 = Static92.aClass53_2.method1179(Static329.aString57, Static225.anInt4195);
				Static289.anInt5127 = 2;
			}
			@Pc(125) int local125;
			if (Static289.anInt5127 == 2) {
				if (Static383.aClass1_10.anInt2 == 2) {
					throw new IOException();
				}
				if (Static383.aClass1_10.anInt2 != 1) {
					return;
				}
				Static169.aClass124_3 = new Class124((Socket) Static383.aClass1_10.anObject1, Static92.aClass53_2);
				Static383.aClass1_10 = null;
				Static169.aClass124_3.method2717(Static39.aClass2_Sub13_Sub2_4.anInt4788, Static39.aClass2_Sub13_Sub2_4.aByteArray77);
				if (Static124.aClass45_3 != null) {
					Static124.aClass45_3.method3371();
				}
				if (Static267.aClass45_2 != null) {
					Static267.aClass45_2.method3371();
				}
				local125 = Static169.aClass124_3.method2712();
				if (Static124.aClass45_3 != null) {
					Static124.aClass45_3.method3371();
				}
				if (Static267.aClass45_2 != null) {
					Static267.aClass45_2.method3371();
				}
				if (local125 != 21) {
					Static289.anInt5127 = 0;
					Static304.anInt2193 = local125;
					Static169.aClass124_3.method2714();
					Static169.aClass124_3 = null;
					return;
				}
				Static289.anInt5127 = 3;
			}
			if (Static289.anInt5127 == 3) {
				if (Static169.aClass124_3.method2716() < 1) {
					return;
				}
				Static227.aStringArray27 = new String[Static169.aClass124_3.method2712()];
				Static289.anInt5127 = 4;
			}
			if (Static289.anInt5127 == 4 && Static169.aClass124_3.method2716() >= Static227.aStringArray27.length * 8) {
				Static85.aClass2_Sub13_Sub2_11.anInt4788 = 0;
				Static169.aClass124_3.method2720(Static85.aClass2_Sub13_Sub2_11.aByteArray77, Static227.aStringArray27.length * 8, 0);
				for (local125 = 0; local125 < Static227.aStringArray27.length; local125++) {
					Static227.aStringArray27[local125] = Static68.method1249(Static85.aClass2_Sub13_Sub2_11.method4231());
				}
				Static289.anInt5127 = 0;
				Static304.anInt2193 = 21;
				Static169.aClass124_3.method2714();
				Static169.aClass124_3 = null;
			}
		} catch (@Pc(237) IOException local237) {
			if (Static169.aClass124_3 != null) {
				Static169.aClass124_3.method2714();
				Static169.aClass124_3 = null;
			}
			if (Static343.anInt6052 >= 1) {
				Static289.anInt5127 = 0;
				Static304.anInt2193 = -4;
			} else {
				Static265.anInt4677 = 0;
				Static343.anInt6052++;
				if (Static33.anInt704 == Static225.anInt4195) {
					Static225.anInt4195 = Static230.anInt4259;
				} else {
					Static225.anInt4195 = Static33.anInt704;
				}
				Static289.anInt5127 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!fc;Z)V")
	public static void method2259(@OriginalArg(0) Class71 arg0) {
		Static259.anInt4617 = arg0.method1568("p11_full");
		Static263.anInt4664 = arg0.method1568("p12_full");
		Static274.anInt1079 = arg0.method1568("b12_full");
		Static275.anInt4906 = arg0.method1568("hitmarks");
		Static187.anInt3330 = arg0.method1568("hitbar_default");
		Static328.anInt5776 = arg0.method1568("timerbar_default");
		Static323.anInt5674 = arg0.method1568("headicons_pk");
		Static180.anInt3217 = arg0.method1568("headicons_prayer");
		Static136.anInt2532 = arg0.method1568("hint_headicons");
		Static356.anInt6266 = arg0.method1568("hint_mapmarkers");
		Static237.anInt4348 = arg0.method1568("mapflag");
		Static41.anInt897 = arg0.method1568("cross");
		Static232.anInt4268 = arg0.method1568("mapdots");
		Static147.anInt2680 = arg0.method1568("scrollbar");
		Static365.anInt2304 = arg0.method1568("name_icons");
		Static116.anInt2256 = arg0.method1568("floorshadows");
		Static337.anInt5930 = arg0.method1568("compass");
		Static236.anInt4336 = arg0.method1568("otherlevel");
		Static191.anInt3362 = arg0.method1568("hint_mapedge");
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([IB[Ljava/lang/Object;II)V")
	public static void method2260(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg3) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) int local16 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local16;
		@Pc(30) Object local30 = arg1[local10];
		arg1[local10] = arg1[arg3];
		arg1[arg3] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg3; local42++) {
			if (arg0[local42] < local16 + (local42 & 0x1)) {
				@Pc(61) int local61 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12] = local61;
				@Pc(75) Object local75 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12++] = local75;
			}
		}
		arg0[arg3] = arg0[local12];
		arg0[local12] = local16;
		arg1[arg3] = arg1[local12];
		arg1[local12] = local30;
		method2260(arg0, arg1, arg2, local12 - 1);
		method2260(arg0, arg1, local12 + 1, arg3);
	}
}
