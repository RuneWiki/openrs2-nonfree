import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!nn", name = "M", descriptor = "Lclient!tr;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!nn", name = "O", descriptor = "I")
	public static int anInt4400;

	@OriginalMember(owner = "client!nn", name = "P", descriptor = "[Lclient!sg;")
	public static Class97[] aClass97Array18;

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_76 = new Class117("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!nn", name = "A", descriptor = "I")
	public static int anInt4389 = 0;

	@OriginalMember(owner = "client!nn", name = "N", descriptor = "[I")
	public static final int[] anIntArray338 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V")
	public static void method3857() {
		Static168.aClass26_30.method328();
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(B)Z")
	public static boolean method3859() {
		if (Static67.aBoolean77) {
			try {
				if ((Boolean) Static360.method555("showingVideoAd", Static77.aClass118_7.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(26) Throwable local26) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(III)V")
	public static void method3861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static271.aFloat48 > Static271.aFloat47) {
			Static271.aFloat47 = (float) ((double) Static271.aFloat47 + (double) Static271.aFloat47 / 30.0D);
			if (Static271.aFloat47 > Static271.aFloat48) {
				Static271.aFloat47 = Static271.aFloat48;
			}
			Static32.method457();
			Static271.anInt4329 = (int) Static271.aFloat47 >> 1;
			Static271.aByteArrayArrayArray7 = Static229.method4046(Static271.anInt4329);
		} else if (Static271.aFloat48 < Static271.aFloat47) {
			Static271.aFloat47 = (float) ((double) Static271.aFloat47 - (double) Static271.aFloat47 / 30.0D);
			if (Static271.aFloat48 > Static271.aFloat47) {
				Static271.aFloat47 = Static271.aFloat48;
			}
			Static32.method457();
			Static271.anInt4329 = (int) Static271.aFloat47 >> 1;
			Static271.aByteArrayArrayArray7 = Static229.method4046(Static271.anInt4329);
		}
		if (Static155.anInt2944 != -1 && Static307.anInt4795 != -1) {
			@Pc(84) int local84 = Static155.anInt2944 - Static247.anInt4959;
			if (local84 < 2 || local84 > 2) {
				local84 /= 8;
			}
			@Pc(101) int local101 = Static307.anInt4795 - Static140.anInt2591;
			Static247.anInt4959 += local84;
			if (local101 < 2 || local101 > 2) {
				local101 /= 8;
			}
			Static140.anInt2591 -= -local101;
			if (local84 == 0 && local101 == 0) {
				Static307.anInt4795 = -1;
				Static155.anInt2944 = -1;
			}
			Static32.method457();
		}
		if (Static247.anInt4961 > 0) {
			Static292.anInt5791--;
			if (Static292.anInt5791 == 0) {
				Static292.anInt5791 = 100;
				Static247.anInt4961--;
			}
		} else {
			Static31.anInt550 = -1;
			Static124.anInt2296 = -1;
		}
		if (!Static48.aBoolean58 || Static4.aClass16_1 == null) {
			return;
		}
		for (@Pc(166) Class11_Sub37 local166 = (Class11_Sub37) Static4.aClass16_1.method193(); local166 != null; local166 = (Class11_Sub37) Static4.aClass16_1.method188()) {
			@Pc(174) Class23 local174 = Static212.method3827(local166.aClass11_Sub8_1.anInt863);
			if (Static235.anInt4730 == 0 && local166.method4895(arg0, arg1)) {
				if (local174.aStringArray1 != null) {
					if (local174.aStringArray1[4] != null) {
						Static87.method1252(0, local174.anInt297, 1012, local174.aString6, -1, (long) local166.aClass11_Sub8_1.anInt863, local174.aStringArray1[4]);
					}
					if (local174.aStringArray1[3] != null) {
						Static87.method1252(0, local174.anInt297, 1001, local174.aString6, -1, (long) local166.aClass11_Sub8_1.anInt863, local174.aStringArray1[3]);
					}
					if (local174.aStringArray1[2] != null) {
						Static87.method1252(0, local174.anInt297, 1007, local174.aString6, -1, (long) local166.aClass11_Sub8_1.anInt863, local174.aStringArray1[2]);
					}
					if (local174.aStringArray1[1] != null) {
						Static87.method1252(0, local174.anInt297, 1009, local174.aString6, -1, (long) local166.aClass11_Sub8_1.anInt863, local174.aStringArray1[1]);
					}
					if (local174.aStringArray1[0] != null) {
						Static87.method1252(0, local174.anInt297, 1008, local174.aString6, -1, (long) local166.aClass11_Sub8_1.anInt863, local174.aStringArray1[0]);
					}
				}
				if (!local166.aClass11_Sub8_1.aBoolean53) {
					local166.aClass11_Sub8_1.aBoolean53 = true;
					Static93.method1351(15, local166.aClass11_Sub8_1.anInt863, local174.anInt297);
				}
				if (local166.aClass11_Sub8_1.aBoolean53) {
					Static93.method1351(17, local166.aClass11_Sub8_1.anInt863, local174.anInt297);
				}
			} else if (local166.aClass11_Sub8_1.aBoolean53) {
				local166.aClass11_Sub8_1.aBoolean53 = false;
				Static93.method1351(16, local166.aClass11_Sub8_1.anInt863, local174.anInt297);
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!nq;)V")
	public static void method3863(@OriginalArg(1) Class144 arg0) {
		Static171.aClass144_43 = arg0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZIIZ)I")
	public static int method3867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class11_Sub6 local8 = Static158.method2534(arg1, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && local8.anIntArray46.length > arg0) {
			return local8.anIntArray46[arg0];
		} else {
			return 0;
		}
	}
}
