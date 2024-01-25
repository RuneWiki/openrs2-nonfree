import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V")
	public static void method2239() {
		if (Static210.aBoolean276) {
			return;
		}
		Static210.aBoolean276 = true;
		Static72.aBoolean114 = true;
		if (Static61.aBoolean94) {
			Static94.aFloat42 = (int) Static94.aFloat42 - 65 & 0xFFFFFF80;
		} else {
			Static214.aFloat83 += (-24.0F - Static214.aFloat83) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lclient!se;")
	public static Class184 method2240(@OriginalArg(1) int arg0) {
		@Pc(10) Class184 local10 = (Class184) Static190.aClass11_85.method209((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static314.aClass143_109.method3745(34, arg0);
		local10 = new Class184();
		if (local20 != null) {
			local10.method4967(new Class14_Sub4(local20), arg0);
		}
		Static190.aClass11_85.method219((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!jd;Z)I")
	public static int method2241(@OriginalArg(0) Class10_Sub3_Sub3 arg0) {
		if (arg0.anInt5922 == 0) {
			return 0;
		}
		@Pc(32) int local32;
		@Pc(39) int local39;
		if (arg0.anInt5921 != -1 && arg0.anInt5921 < 32768) {
			@Pc(23) Class10_Sub3_Sub3_Sub1 local23 = Static266.aClass10_Sub3_Sub3_Sub1Array1[arg0.anInt5921];
			if (local23 != null) {
				local32 = arg0.anInt5910 - local23.anInt5910;
				local39 = arg0.anInt5908 - local23.anInt5908;
				if (local32 != 0 || local39 != 0) {
					arg0.method5354((int) (Math.atan2((double) local32, (double) local39) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(70) int local70;
		if (arg0.anInt5921 >= 32768) {
			local70 = arg0.anInt5921 - 32768;
			if (local70 == Static266.anInt5054) {
				local70 = 2047;
			}
			@Pc(79) Class10_Sub3_Sub3_Sub2 local79 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local70];
			if (local79 != null) {
				local39 = arg0.anInt5910 - local79.anInt5910;
				@Pc(95) int local95 = arg0.anInt5908 - local79.anInt5908;
				if (local39 != 0 || local95 != 0) {
					arg0.method5354((int) (Math.atan2((double) local39, (double) local95) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt5936 != 0 || arg0.anInt5932 != 0) && (arg0.anInt5986 == 0 || arg0.anInt5983 > 0)) {
			local70 = arg0.anInt5910 - (arg0.anInt5936 - Static151.anInt3234 - Static151.anInt3234) * 64;
			local32 = arg0.anInt5908 - (arg0.anInt5932 - Static251.anInt3170 - Static251.anInt3170) * 64;
			if (local70 != 0 || local32 != 0) {
				arg0.method5354((int) (Math.atan2((double) local70, (double) local32) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt5936 = 0;
			arg0.anInt5932 = 0;
		}
		return arg0.method5368();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!e;[[BLclient!lf;[[B[[B[[BII[[IZILclient!lf;I)V")
	public static void method2242(@OriginalArg(0) Class46 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) Class114 arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int[][] arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class114 arg10, @OriginalArg(12) int arg11) {
		if (Static67.anInt1615 == 0 && !Static267.aBoolean340) {
			Static6.method134(arg0, arg8, arg5, arg4, arg7, arg2, arg1, arg3, arg6, arg10, arg9, arg11);
		} else {
			Static143.method2885(arg3, arg10, arg7, arg1, arg6, arg9, arg5, arg4, arg11, arg8, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V")
	public static void method2243() {
		if (Static115.aClass26_7 != null) {
			Static115.aClass26_7.method4225();
		}
		if (Static311.aClass26_12 != null) {
			Static311.aClass26_12.method4225();
		}
		Static275.method4678(Static181.aBoolean239);
		Static115.aClass26_7 = Static240.method5766(Static95.aCanvas2, 0, Static105.aClass15_2, 22050);
		Static115.aClass26_7.method4215(Static174.aClass14_Sub19_Sub4_3);
		Static311.aClass26_12 = Static240.method5766(Static95.aCanvas2, 1, Static105.aClass15_2, 2048);
		Static311.aClass26_12.method4215(Static49.aClass14_Sub19_Sub2_1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2244(@OriginalArg(1) Component arg0) {
		@Pc(13) Method local13 = Static12.aMethod1;
		if (local13 != null) {
			try {
				local13.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(27) Throwable local27) {
			}
		}
		arg0.addKeyListener(Static65.aClass43_3);
		arg0.addFocusListener(Static65.aClass43_3);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!mo;I)V")
	public static void method2245(@OriginalArg(0) Class143 arg0) {
		Static68.aClass143_40 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)V")
	public static void method2246(@OriginalArg(0) int arg0) {
		Static140.anInt2974 = arg0;
		@Pc(7) Class11 local7 = Static20.aClass11_13;
		synchronized (Static20.aClass11_13) {
			Static20.aClass11_13.method213();
		}
		local7 = Static38.aClass11_20;
		synchronized (Static38.aClass11_20) {
			Static38.aClass11_20.method213();
		}
		local7 = Static292.aClass11_128;
		synchronized (Static292.aClass11_128) {
			Static292.aClass11_128.method213();
		}
	}
}
