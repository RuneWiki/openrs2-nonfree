import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "[Lclient!n;")
	public static Class4_Sub2_Sub4_Sub2[] aClass4_Sub2_Sub4_Sub2Array1;

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
	public static int anInt74;

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "[J")
	public static long[] aLongArray1 = new long[1000];

	@OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
	public static int anInt70 = -1;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)I")
	public static int method62() {
		return Static168.aBoolean217 && Static113.aBooleanArray18[81] && Static286.anInt5602 > 2 ? Static102.anIntArray167[Static286.anInt5602 - 2] : Static102.anIntArray167[Static286.anInt5602 - 1];
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)V")
	public static void method63() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("maxMemory");
			if (local12 != null) {
				try {
					@Pc(17) Runtime local17 = Runtime.getRuntime();
					@Pc(24) Long local24 = (Long) local12.invoke(local17, (Object[]) null);
					Static160.anInt3283 = (int) (local24 / 1048576L) + 1;
				} catch (@Pc(34) Throwable local34) {
				}
			}
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)V")
	public static void method64(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub2_Sub15 local12 = Static131.method1210(arg0, 7);
		local12.method2875();
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(III)J")
	public static long method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2694; local13++) {
			@Pc(22) Class99 local22 = local7.aClass99Array19[local13];
			if ((local22.aLong117 >> 29 & 0x3L) == 2L && local22.anInt3225 == arg1 && local22.anInt3222 == arg2) {
				return local22.aLong117;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!qe;)I")
	public static int method66(@OriginalArg(1) Class13_Sub5_Sub1 arg0) {
		@Pc(4) int local4 = arg0.anInt4472;
		@Pc(12) Class33 local12 = arg0.method4212();
		if (local12.anInt1156 == arg0.anInt5307) {
			local4 = arg0.anInt4459;
		} else if (arg0.anInt5307 == local12.anInt1139 || local12.anInt1142 == arg0.anInt5307 || local12.anInt1140 == arg0.anInt5307 || arg0.anInt5307 == local12.anInt1135) {
			local4 = arg0.anInt4466;
		} else if (local12.anInt1157 == arg0.anInt5307 || local12.anInt1160 == arg0.anInt5307 || arg0.anInt5307 == local12.anInt1130 || arg0.anInt5307 == local12.anInt1153) {
			local4 = arg0.anInt4463;
		}
		return local4;
	}
}
