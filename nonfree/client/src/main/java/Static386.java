import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
	public static int anInt7581;

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "Lclient!vo;")
	public static Class348 aClass348_93;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Lclient!la;")
	public static Class45 aClass45_6;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "J")
	public static long aLong199 = -1L;

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "[[F")
	public static final float[][] aFloatArrayArray11 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method5961(@OriginalArg(0) int arg0) {
		@Pc(23) byte[] local23;
		if (arg0 == 100 && Static437.anInt8362 > 0) {
			local23 = Static412.aByteArrayArray25[--Static437.anInt8362];
			Static412.aByteArrayArray25[Static437.anInt8362] = null;
			return local23;
		} else if (arg0 == 5000 && Static194.anInt4042 > 0) {
			local23 = Static578.aByteArrayArray32[--Static194.anInt4042];
			Static578.aByteArrayArray32[Static194.anInt4042] = null;
			return local23;
		} else if (arg0 == 30000 && Static89.anInt2295 > 0) {
			local23 = Static90.aByteArrayArray8[--Static89.anInt2295];
			Static90.aByteArrayArray8[Static89.anInt2295] = null;
			return local23;
		} else {
			if (Static556.aByteArrayArrayArray19 != null) {
				for (@Pc(76) int local76 = 0; local76 < Static129.anIntArray132.length; local76++) {
					if (arg0 == Static129.anIntArray132[local76] && Static157.anIntArray164[local76] > 0) {
						@Pc(106) byte[] local106 = Static556.aByteArrayArrayArray19[local76][--Static157.anIntArray164[local76]];
						Static556.aByteArrayArrayArray19[local76][Static157.anIntArray164[local76]] = null;
						return local106;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z[B)V")
	public static synchronized void method5962(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static437.anInt8362 < 1000) {
			Static412.aByteArrayArray25[Static437.anInt8362++] = arg0;
		} else if (arg0.length == 5000 && Static194.anInt4042 < 250) {
			Static578.aByteArrayArray32[Static194.anInt4042++] = arg0;
		} else if (arg0.length == 30000 && Static89.anInt2295 < 50) {
			Static90.aByteArrayArray8[Static89.anInt2295++] = arg0;
		} else if (Static556.aByteArrayArrayArray19 != null) {
			for (@Pc(63) int local63 = 0; local63 < Static129.anIntArray132.length; local63++) {
				if (Static129.anIntArray132[local63] == arg0.length && Static157.anIntArray164[local63] < Static556.aByteArrayArrayArray19[local63].length) {
					Static556.aByteArrayArrayArray19[local63][Static157.anIntArray164[local63]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIB[BII[BI)V")
	public static void method5964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg2 >> 2);
		@Pc(20) int local20 = -(arg2 & 0x3);
		for (@Pc(23) int local23 = -arg5; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg0++;
				arg3[local31] += arg6[arg1++];
				@Pc(43) int local43 = arg0++;
				arg3[local43] += arg6[arg1++];
				@Pc(55) int local55 = arg0++;
				arg3[local55] += arg6[arg1++];
				@Pc(67) int local67 = arg0++;
				arg3[local67] += arg6[arg1++];
			}
			for (@Pc(82) int local82 = local20; local82 < 0; local82++) {
				local31 = arg0++;
				arg3[local31] += arg6[arg1++];
			}
			arg1 += arg4;
			arg0 += arg7;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)Z")
	public static boolean method5965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static131.method2389(arg0, arg1) | Static148.method2544(arg0, arg1)) & Static448.method7384(arg1, arg0);
	}
}
