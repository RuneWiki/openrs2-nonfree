import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "Lclient!ri;")
	public static Class284 aClass284_85;

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
	public static int anInt5258 = 0;

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "I")
	public static int anInt5261 = 0;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIB)V")
	public static void method4205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static263.anInt5058 = arg0;
		Static280.anInt5293 = arg3;
		Static232.anInt5900 = arg1;
		Static117.anInt2730 = arg2;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!r;IIIIIIZZ)V")
	public static void method4206(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static68.aClass31_4 = arg0;
		Static553.anInt9663 = arg1;
		Static538.aBoolean626 = Static553.anInt9663 > 1 && Static68.aClass31_4.method8018();
		Static385.anInt6657 = 9;
		Static331.anInt6010 = 0x1 << Static385.anInt6657;
		Static211.anInt8485 = Static331.anInt6010 >> 1;
		Math.sqrt((double) (Static211.anInt8485 * Static211.anInt8485 + Static211.anInt8485 * Static211.anInt8485));
		Static590.anInt10277 = 4;
		Static349.anInt6237 = arg2;
		Static414.anInt7451 = arg3;
		Static219.anInt4585 = arg4;
		Static7.aClass29_1 = Static129.method2397();
		Static537.method7344();
		Static566.aClass333ArrayArrayArray2 = new Class333[4][Static349.anInt6237][Static414.anInt7451];
		Static420.aClass127Array6 = new Class127[4];
		if (arg5) {
			Static516.anIntArrayArray92 = new int[Static349.anInt6237][Static414.anInt7451];
			Static143.aByteArrayArray14 = new byte[Static349.anInt6237][Static414.anInt7451];
			Static155.aShortArrayArray2 = new short[Static349.anInt6237][Static414.anInt7451];
			Static590.aClass333ArrayArrayArray3 = new Class333[1][Static349.anInt6237][Static414.anInt7451];
			Static108.aClass127Array5 = new Class127[1];
		} else {
			Static516.anIntArrayArray92 = null;
			Static143.aByteArrayArray14 = null;
			Static155.aShortArrayArray2 = null;
			Static590.aClass333ArrayArrayArray3 = null;
			Static108.aClass127Array5 = null;
		}
		if (arg6) {
			Static31.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static196.aClass235Array1 = new Class235[65535];
			Static561.aBooleanArray34 = new boolean[65535];
			Static346.anInt6230 = 0;
		} else {
			Static31.aLongArrayArrayArray1 = null;
			Static196.aClass235Array1 = null;
			Static561.aBooleanArray34 = null;
			Static346.anInt6230 = 0;
		}
		Static593.method8145(false);
		Static530.aClass25_Sub2ArrayArray5 = new Class25_Sub2[2][];
		Static530.aClass25_Sub2ArrayArray5[0] = new Class25_Sub2[Static369.anIntArray361[0]];
		Static530.aClass25_Sub2ArrayArray5[1] = new Class25_Sub2[Static369.anIntArray361[1]];
		Static199.anIntArray186 = new int[2];
		Static468.aClass25_Sub2ArrayArray4 = new Class25_Sub2[2][];
		Static468.aClass25_Sub2ArrayArray4[0] = new Class25_Sub2[Static443.anIntArray467[0]];
		Static468.aClass25_Sub2ArrayArray4[1] = new Class25_Sub2[Static443.anIntArray467[1]];
		Static154.anIntArray135 = new int[2];
		Static69.aClass25_Sub2ArrayArray3 = new Class25_Sub2[2][];
		Static69.aClass25_Sub2ArrayArray3[0] = new Class25_Sub2[Static592.anIntArray396[0]];
		Static69.aClass25_Sub2ArrayArray3[1] = new Class25_Sub2[Static592.anIntArray396[1]];
		Static473.anIntArray482 = new int[2];
		Static364.aClass25_Sub2Array2 = new Class25_Sub2[10000];
		Static505.anInt8754 = 0;
		Static263.aClass25_Sub2Array1 = new Class25_Sub2[5000];
		Static127.anInt2900 = 0;
		Static34.aClass25_Sub2_Sub2Array2 = new Class25_Sub2_Sub2[5000];
		Static283.anInt5319 = 0;
		Static209.aBooleanArrayArray11 = new boolean[Static219.anInt4585 + Static219.anInt4585 + 1][Static219.anInt4585 + Static219.anInt4585 + 1];
		Static290.aBooleanArrayArray6 = new boolean[Static219.anInt4585 + Static219.anInt4585 + 2][Static219.anInt4585 + Static219.anInt4585 + 2];
		if (Static538.aBoolean626) {
			Static205.aBooleanArrayArrayArray1 = new boolean[4][Static219.anInt4585 + Static219.anInt4585 + 1][Static219.anInt4585 + Static219.anInt4585 + 1];
			Static540.aBooleanArrayArrayArray2 = new boolean[4][][];
			if (Static242.aClass176Array1 != null) {
				Static428.method5923();
			}
			Static242.aClass176Array1 = new Class176[Static553.anInt9663];
			Static68.aClass31_4.method8043(Static242.aClass176Array1.length + 1);
			Static68.aClass31_4.method8055(0);
			for (@Pc(247) int local247 = 0; local247 < Static242.aClass176Array1.length; local247++) {
				Static242.aClass176Array1[local247] = new Class176(local247 + 1, Static68.aClass31_4);
				(new Thread(Static242.aClass176Array1[local247], "wr" + local247)).start();
			}
			@Pc(282) byte local282;
			if (Static553.anInt9663 == 2) {
				local282 = 4;
				Static557.anInt6112 = 2;
			} else if (Static553.anInt9663 == 3) {
				local282 = 6;
				Static557.anInt6112 = 3;
			} else {
				local282 = 8;
				Static557.anInt6112 = 4;
			}
			Static483.aClass311Array1 = new Class311[local282];
			for (@Pc(302) int local302 = 0; local302 < local282; local302++) {
				Static483.aClass311Array1[local302] = new Class311(Static107.aStringArrayArray1[Static553.anInt9663 - 2][local302]);
			}
		} else {
			Static557.anInt6112 = 1;
		}
		Static264.anIntArray238 = new int[Static557.anInt6112 - 1];
		Static396.anIntArray393 = new int[Static557.anInt6112 - 1];
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!ie;)V")
	public static void method4207(@OriginalArg(1) Class3_Sub26 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static25.aClass361_1 != null) {
			@Pc(25) int local25;
			try {
				Static25.aClass361_1.method8112(0L);
				Static25.aClass361_1.method8111(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method6824(local13, 24);
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(ILclient!ie;)Lclient!mp;")
	public static Class211 method4209(@OriginalArg(1) Class3_Sub26 arg0) {
		@Pc(7) Class211 local7 = new Class211();
		local7.anInt6132 = arg0.method6811();
		local7.aClass3_Sub7_Sub8_1 = Static212.aClass294_3.method6455(local7.anInt6132);
		return local7;
	}
}
