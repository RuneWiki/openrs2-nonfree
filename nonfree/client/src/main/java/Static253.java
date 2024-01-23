import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
	public static int anInt5224;

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "Lclient!fk;")
	public static Class56 aClass56_24 = new Class56();

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString184 = "Drop";

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "Z")
	public static boolean aBoolean361 = false;

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
	public static int anInt5223 = 0;

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "[I")
	public static int[] anIntArray547 = new int[1024];

	@OriginalMember(owner = "client!sj", name = "A", descriptor = "[I")
	public static int[] anIntArray548 = new int[4];

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)I")
	public static int method4285(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 >>> 31;
		return (local3 + arg1) / arg0 - local3;
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)Z")
	public static boolean method4286() {
		if (Static109.aBoolean207) {
			try {
				return !((Boolean) Static325.method4166(Static274.aClass176_4.anApplet1, "showingVideoAd"));
			} catch (@Pc(24) Throwable local24) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI)V")
	public static void method4287(@OriginalArg(1) int arg0) {
		Static257.anInt5294 = arg0;
		Static157.anInt2942 = 100;
		Static300.anInt5934 = -1;
		Static135.anInt2616 = 3;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(BI)Lclient!bg;")
	public static Class15 method4288(@OriginalArg(1) int arg0) {
		@Pc(10) Class15 local10 = (Class15) Static259.aClass98_43.method2570((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static201.aClass155_85.method4121(Static171.method2844(arg0), Static256.method4335(arg0));
		local10 = new Class15();
		local10.anInt417 = arg0;
		if (local26 != null) {
			local10.method357(new Class3_Sub26(local26));
		}
		local10.method351();
		Static259.aClass98_43.method2568(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIILclient!f;II)V")
	public static void method4290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class49 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg1 & 0x3;
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (local9 == 1 || local9 == 3) {
			local20 = arg5.anInt1360;
			local23 = arg5.anInt1329;
		} else {
			local23 = arg5.anInt1360;
			local20 = arg5.anInt1329;
		}
		@Pc(43) int local43;
		@Pc(41) int local41;
		if (arg3 + local23 > 104) {
			local41 = arg3 + 1;
			local43 = arg3;
		} else {
			local41 = arg3 + (local23 + 1 >> 1);
			local43 = arg3 + (local23 >> 1);
		}
		@Pc(70) int local70 = (arg3 << 7) + (local23 << 6);
		@Pc(79) int local79 = (arg7 << 7) + (local20 << 6);
		@Pc(108) int local108;
		@Pc(102) int local102;
		if (arg7 + local20 <= 104) {
			local102 = arg7 + (local20 + 1 >> 1);
			local108 = (local20 >> 1) + arg7;
		} else {
			local108 = arg7;
			local102 = arg7 + 1;
		}
		@Pc(120) int[][] local120 = Static256.anIntArrayArrayArray14[arg0];
		@Pc(146) int local146 = local120[local43][local102] + local120[local43][local108] + local120[local41][local108] + local120[local41][local102] >> 2;
		@Pc(148) int local148 = 0;
		@Pc(157) int[][] local157;
		if (arg0 != 0) {
			local157 = Static256.anIntArrayArrayArray14[0];
			local148 = local146 - (local157[local43][local108] + local157[local41][local108] + local157[local43][local102] + local157[local41][local102] >> 2);
		}
		local157 = null;
		if (arg0 < 3) {
			local157 = Static256.anIntArrayArrayArray14[arg0 + 1];
		}
		@Pc(218) Class174 local218 = arg5.method1115(false, local79, local120, arg2, null, local70, local146, true, arg1, local157);
		Static193.method3206(local218.aClass81_Sub2_4, local70 - arg6, local148, local79 - arg4);
	}
}
