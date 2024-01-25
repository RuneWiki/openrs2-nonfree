import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!za", name = "o", descriptor = "I")
	public static int anInt7756;

	@OriginalMember(owner = "client!za", name = "p", descriptor = "[I")
	public static int[] anIntArray726;

	@OriginalMember(owner = "client!za", name = "h", descriptor = "Lclient!ob;")
	public static Class184 aClass184_4 = new Class184();

	@OriginalMember(owner = "client!za", name = "q", descriptor = "[I")
	public static final int[] anIntArray727 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!nv;ILclient!l;II)Lclient!za;")
	public static synchronized Class106 method5919(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class183 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			if (!Static423.aBooleanArray25[local7]) {
				local5 = local7;
				break;
			}
		}
		if (local5 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(51) Class106 local51;
		if (arg4 == 0) {
			local51 = Static114.method1849(arg3, arg0, local5);
		} else if (arg4 == 1) {
			local51 = Static188.method3082(arg1, arg3, local5, arg2, arg0);
		} else if (arg4 == 2) {
			local51 = Static9.method2256(arg1, local5, arg0, arg3);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static423.aBooleanArray25[local5] = true;
		return local51;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(III)V")
	public static void method5937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static248.method3707(arg1, 14);
		local8.method2957();
		local8.anInt3820 = arg0;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([JIBI[Ljava/lang/Object;)V")
	public static void method5962(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg1) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) long local28 = arg0[local22];
		arg0[local22] = arg0[arg2];
		arg0[arg2] = local28;
		@Pc(42) Object local42 = arg3[local22];
		arg3[local22] = arg3[arg2];
		arg3[arg2] = local42;
		@Pc(60) int local60 = local28 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg1; local62 < arg2; local62++) {
			if (local28 + (long) (local60 & local62) > arg0[local62]) {
				@Pc(79) long local79 = arg0[local62];
				arg0[local62] = arg0[local24];
				arg0[local24] = local79;
				@Pc(93) Object local93 = arg3[local62];
				arg3[local62] = arg3[local24];
				arg3[local24++] = local93;
			}
		}
		arg0[arg2] = arg0[local24];
		arg0[local24] = local28;
		arg3[arg2] = arg3[local24];
		arg3[local24] = local42;
		method5962(arg0, arg1, local24 - 1, arg3);
		method5962(arg0, local24 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!ol;")
	public static Class30_Sub1 method5974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class252 local7 = Static67.aClass252ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class208 local14 = local7.aClass208_3; local14 != null; local14 = local14.aClass208_2) {
			@Pc(18) Class30_Sub1 local18 = local14.aClass30_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort104 == arg1 && local18.aShort103 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
