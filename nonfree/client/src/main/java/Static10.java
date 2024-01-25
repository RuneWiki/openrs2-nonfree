import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "bb", descriptor = "Lclient!ps;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!aj", name = "Cb", descriptor = "Lclient!lm;")
	public static Class134 aClass134_7;

	@OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
	public static int anInt163 = -1;

	@OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
	public static int anInt164 = -1;

	@OriginalMember(owner = "client!aj", name = "jb", descriptor = "I")
	public static final int anInt176 = 52;

	@OriginalMember(owner = "client!aj", name = "qb", descriptor = "I")
	public static int anInt181 = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	public static void method160() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("availableProcessors");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local21.invoke(local25, (Object[]) null);
					Static126.anInt2452 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public static void method162() {
		@Pc(10) Class37 local10 = Static352.aClass37_111;
		synchronized (Static352.aClass37_111) {
			Static352.aClass37_111.method914();
		}
		local10 = Static337.aClass37_107;
		synchronized (Static337.aClass37_107) {
			Static337.aClass37_107.method914();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLclient!lm;)V")
	public static void method164(@OriginalArg(1) Class134 arg0) {
		Static142.anInt2786 = arg0.method3018("p11_full");
		Static223.anInt1488 = arg0.method3018("p12_full");
		Static117.anInt2266 = arg0.method3018("b12_full");
		Static269.anInt5547 = arg0.method3018("hitmarks");
		Static295.anInt5959 = arg0.method3018("hitbar_default");
		Static136.anInt2692 = arg0.method3018("timerbar_default");
		Static317.anInt6315 = arg0.method3018("headicons_pk");
		Static314.anInt6245 = arg0.method3018("headicons_prayer");
		Static296.anInt5984 = arg0.method3018("hint_headicons");
		Static153.anInt3153 = arg0.method3018("hint_mapmarkers");
		Static170.anInt3580 = arg0.method3018("mapflag");
		Static254.anInt5238 = arg0.method3018("cross");
		Static167.anInt3455 = arg0.method3018("mapdots");
		Static41.anInt1122 = arg0.method3018("scrollbar");
		Static64.anInt1440 = arg0.method3018("name_icons");
		Static309.anInt6153 = arg0.method3018("floorshadows");
		Static231.anInt4826 = arg0.method3018("compass");
		Static347.anInt6681 = arg0.method3018("hint_mapedge");
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)I")
	public static int method165() {
		try {
			if (Static232.anInt4831 == 0) {
				if (Static292.method5114() - 5000L < Static175.aLong99) {
					return 0;
				}
				Static74.aClass193_3 = Static197.aClass215_5.method5673(Static233.anInt4834, Static30.aString23);
				Static238.aLong142 = Static292.method5114();
				Static232.anInt4831 = 1;
			}
			if (Static292.method5114() > Static238.aLong142 + 30000L) {
				return Static328.method438(1000);
			}
			@Pc(76) int local76;
			@Pc(119) int local119;
			if (Static232.anInt4831 == 1) {
				if (Static74.aClass193_3.anInt5986 == 2) {
					return Static328.method438(1001);
				}
				if (Static74.aClass193_3.anInt5986 != 1) {
					return -1;
				}
				Static81.aClass202_3 = new Class202((Socket) Static74.aClass193_3.anObject7, Static197.aClass215_5);
				Static74.aClass193_3 = null;
				local76 = 0;
				Static305.aClass1_Sub21_Sub2_3.anInt6611 = 0;
				if (Static220.aBoolean372) {
					local76 = Static310.anInt6183;
				}
				Static305.aClass1_Sub21_Sub2_3.method5718(23);
				Static305.aClass1_Sub21_Sub2_3.method5702(local76);
				Static81.aClass202_3.method5480(Static305.aClass1_Sub21_Sub2_3.anInt6611, Static305.aClass1_Sub21_Sub2_3.aByteArray82);
				if (Static205.aClass125_1 != null) {
					Static205.aClass125_1.method5316();
				}
				if (Static310.aClass125_2 != null) {
					Static310.aClass125_2.method5316();
				}
				local119 = Static81.aClass202_3.method5478();
				if (Static205.aClass125_1 != null) {
					Static205.aClass125_1.method5316();
				}
				if (Static310.aClass125_2 != null) {
					Static310.aClass125_2.method5316();
				}
				if (local119 != 0) {
					return Static328.method438(local119);
				}
				Static232.anInt4831 = 2;
			}
			if (Static232.anInt4831 == 2) {
				if (Static81.aClass202_3.method5473() < 2) {
					return -1;
				}
				Static221.anInt4692 = Static81.aClass202_3.method5478();
				Static221.anInt4692 <<= 0x8;
				Static221.anInt4692 += Static81.aClass202_3.method5478();
				Static127.aByteArray22 = new byte[Static221.anInt4692];
				Static232.anInt4831 = 3;
				Static54.anInt1303 = 0;
			}
			if (Static232.anInt4831 != 3) {
				return -1;
			}
			local76 = Static81.aClass202_3.method5473();
			if (local76 < 1) {
				return -1;
			}
			if (local76 > Static221.anInt4692 - Static54.anInt1303) {
				local76 = Static221.anInt4692 - Static54.anInt1303;
			}
			Static81.aClass202_3.method5476(Static54.anInt1303, Static127.aByteArray22, local76);
			Static54.anInt1303 += local76;
			if (Static221.anInt4692 > Static54.anInt1303) {
				return -1;
			} else if (Static71.method1256(Static127.aByteArray22)) {
				Static157.aClass127_Sub1Array1 = new Class127_Sub1[Static78.anInt1577];
				local119 = 0;
				for (@Pc(234) int local234 = Static287.anInt5763; local234 <= Static222.anInt4708; local234++) {
					@Pc(242) Class127_Sub1 local242 = Static345.method5772(local234);
					if (local242 != null) {
						Static157.aClass127_Sub1Array1[local119++] = local242;
					}
				}
				Static101.aClass1_Sub34_1 = null;
				Static340.anInt6563 = 0;
				Static81.aClass202_3.method5477();
				Static232.anInt4831 = 0;
				Static81.aClass202_3 = null;
				Static127.aByteArray22 = null;
				Static253.anInt5228 = 0;
				Static175.aLong99 = Static292.method5114();
				return 0;
			} else {
				return Static328.method438(1002);
			}
		} catch (@Pc(274) IOException local274) {
			return Static328.method438(1003);
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
	public static void method166() {
		Static61.anInt1413 = 0;
		Static58.aClass14_4.method305();
		Static58.aClass14_4.method300(Static67.aClass1_Sub12_1);
		Static61.anInt1413++;
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)V")
	public static void method170() {
		@Pc(6) Class37 local6 = Static265.aClass37_86;
		synchronized (Static265.aClass37_86) {
			Static265.aClass37_86.method919();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZIII)V")
	public static void method171(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static24.anInt437 == 0) {
			Static353.method5842(false);
		} else {
			Static100.anInt1934 = Static24.anInt437;
			Static20.method360(0);
		}
		Static158.anInt3302 = arg2;
		Static50.aBoolean84 = arg0;
		Static331.anInt3764 = arg1;
		Static150.method2248(arg3);
	}
}
