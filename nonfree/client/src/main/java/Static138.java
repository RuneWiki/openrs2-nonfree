import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!h", name = "q", descriptor = "Lclient!mg;")
	public static Class160 aClass160_20;

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Lclient!wj;")
	public static Class265 aClass265_54 = null;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
	public static void method2339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static184.anInt3600 = arg0;
		Static8.anInt223 = 0;
		Static181.anInt3543 = arg1;
		Static430.anInt7123 = 0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V")
	public static void method2340(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static88.aFloat68 = 3.0F;
		} else if (arg0 == 50) {
			Static88.aFloat68 = 4.0F;
		} else if (arg0 == 75) {
			Static88.aFloat68 = 6.0F;
		} else if (arg0 == 100) {
			Static88.aFloat68 = 8.0F;
		} else if (arg0 == 200) {
			Static88.aFloat68 = 16.0F;
		}
		Static314.anInt5538 = -1;
		Static314.anInt5538 = -1;
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V")
	public static void method2341() {
		Static150.aClass171_35.method3936();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lclient!em;I)V")
	public static void method2343(@OriginalArg(1) Class68[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(21) Class68 local21 = arg0[local7];
			if (local21 != null) {
				if (local21.anInt2249 == 0) {
					if (local21.aClass68Array1 != null) {
						method2343(local21.aClass68Array1, arg1);
					}
					@Pc(45) Class2_Sub35 local45 = (Class2_Sub35) Static113.aClass163_11.method3769((long) local21.anInt2229);
					if (local45 != null) {
						Static76.method1390(local45.anInt5537, arg1);
					}
				}
				@Pc(61) Class2_Sub30 local61;
				if (arg1 == 0 && local21.anObjectArray33 != null) {
					local61 = new Class2_Sub30();
					local61.aClass68_12 = local21;
					local61.anObjectArray35 = local21.anObjectArray33;
					Static168.method2731(local61);
				}
				if (arg1 == 1 && local21.anObjectArray26 != null) {
					if (local21.anInt2215 >= 0) {
						@Pc(87) Class68 local87 = Static165.method2704(local21.anInt2229);
						if (local87 == null || local87.aClass68Array1 == null || local21.anInt2215 >= local87.aClass68Array1.length || local87.aClass68Array1[local21.anInt2215] != local21) {
							continue;
						}
					}
					local61 = new Class2_Sub30();
					local61.anObjectArray35 = local21.anObjectArray26;
					local61.aClass68_12 = local21;
					Static168.method2731(local61);
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)I")
	public static int method2344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static58.anIntArray88[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIBII)V")
	public static void method2345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static104.anInt2441; local8++) {
			@Pc(14) Rectangle local14 = Class200.aRectangleArray3[local8];
			if (local14.x + local14.width > arg3 && arg3 + arg0 > local14.x && local14.y + local14.height > arg2 && arg1 + arg2 > local14.y) {
				Static367.aBooleanArray23[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method2346(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static307.anInt5425 = 7;
		Static8.anInt242 = 0x1 << Static307.anInt5425;
		Static414.anInt6898 = Static8.anInt242 >> 1;
		Static164.anInt3278 = (int) Math.sqrt((double) (Static414.anInt6898 * Static414.anInt6898 + Static414.anInt6898 * Static414.anInt6898));
		Static368.anInt6317 = Static8.anInt242 >> 2;
		Static314.anInt5536 = Static8.anInt242;
		Static42.anInt4340 = arg0;
		Static386.anInt6463 = arg1;
		Static182.anInt3568 = arg2;
		Static195.aClass106ArrayArrayArray2 = new Class106[4][Static42.anInt4340][Static386.anInt6463];
		Static263.aClass64Array2 = new Class64[4];
		if (arg3) {
			Static225.anIntArrayArray41 = new int[Static42.anInt4340][Static386.anInt6463];
			Static360.aByteArrayArray56 = new byte[Static42.anInt4340][Static386.anInt6463];
			Static74.aByteArrayArray12 = new byte[Static42.anInt4340][Static386.anInt6463];
			Static79.aClass106ArrayArrayArray1 = new Class106[1][Static42.anInt4340][Static386.anInt6463];
			Static440.aClass64Array3 = new Class64[1];
		} else {
			Static225.anIntArrayArray41 = null;
			Static360.aByteArrayArray56 = null;
			Static74.aByteArrayArray12 = null;
			Static79.aClass106ArrayArrayArray1 = null;
			Static440.aClass64Array3 = null;
		}
		if (arg4) {
			Static351.aLongArrayArrayArray2 = new long[4][arg0][arg1];
			Static140.aClass170Array1 = new Class170[65535];
			Static69.aBooleanArray8 = new boolean[65535];
			Static48.anInt963 = 0;
		} else {
			Static351.aLongArrayArrayArray2 = null;
			Static140.aClass170Array1 = null;
			Static69.aBooleanArray8 = null;
			Static48.anInt963 = 0;
		}
		Static423.method5843(false);
		Static143.aClass210Array1 = new Class210[1000];
		Static358.anInt6072 = 0;
		Static385.aClass210Array2 = new Class210[1000];
		Static405.anInt6755 = 0;
		Static386.anIntArrayArrayArray12 = new int[4][Static42.anInt4340 + 1][Static386.anInt6463 + 1];
		Static96.aClass3_Sub2Array2 = new Class3_Sub2[5000];
		Static177.anInt3468 = 0;
		Static281.aBooleanArrayArray41 = new boolean[Static182.anInt3568 + Static182.anInt3568 + 1][Static182.anInt3568 + Static182.anInt3568 + 1];
		Static223.aBooleanArrayArray19 = new boolean[Static182.anInt3568 + Static182.anInt3568 + 2][Static182.anInt3568 + Static182.anInt3568 + 2];
		Static260.aClass37_1 = null;
	}
}
