import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
	public static int anInt2868;

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIBI)V")
	public static void method2289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static348.aClass1_Sub30_Sub1_1.anInt4863 != 0 && arg1 != 0 && Static507.anInt8646 < 50 && arg0 != -1) {
			Static150.aClass104Array1[Static507.anInt8646++] = new Class104((byte) 1, arg0, arg1, arg2, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I[SZ)[S")
	public static short[] method2291(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static598.method1172(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)V")
	public static void method2292(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(16, arg1);
		local8.method6594();
		local8.anInt8204 = arg0;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IILjava/awt/Component;ILclient!ft;)Lclient!jp;")
	public static Class177 method2293(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class109 arg3) {
		if (Class1_Sub30_Sub1.lb == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(32) Class177 local32 = (Class177) Class.forName("Class177_Sub1").getDeclaredConstructor().newInstance();
			local32.anInt9169 = arg2;
			local32.anIntArray691 = new int[(Static19.aBoolean22 ? 2 : 1) * 256];
			local32.method7513(arg1);
			local32.anInt9170 = (arg2 & 0xFFFFFC00) + 1024;
			if (local32.anInt9170 > 16384) {
				local32.anInt9170 = 16384;
			}
			local32.method7517(local32.anInt9170);
			if (Static517.anInt9665 > 0 && Static541.aClass151_1 == null) {
				Static541.aClass151_1 = new Class151();
				Static541.aClass151_1.aClass109_6 = arg3;
				arg3.method2177(Static541.aClass151_1, Static517.anInt9665);
			}
			if (Static541.aClass151_1 != null) {
				if (Static541.aClass151_1.aClass177Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static541.aClass151_1.aClass177Array1[arg0] = local32;
			}
			return local32;
		} catch (@Pc(105) Throwable local105) {
			try {
				@Pc(111) Class177_Sub2 local111 = new Class177_Sub2(arg3, arg0);
				local111.anIntArray691 = new int[(Static19.aBoolean22 ? 2 : 1) * 256];
				local111.anInt9169 = arg2;
				local111.method7513(arg1);
				local111.anInt9170 = 16384;
				local111.method7517(local111.anInt9170);
				if (Static517.anInt9665 > 0 && Static541.aClass151_1 == null) {
					Static541.aClass151_1 = new Class151();
					Static541.aClass151_1.aClass109_6 = arg3;
					arg3.method2177(Static541.aClass151_1, Static517.anInt9665);
				}
				if (Static541.aClass151_1 != null) {
					if (Static541.aClass151_1.aClass177Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static541.aClass151_1.aClass177Array1[arg0] = local111;
				}
				return local111;
			} catch (@Pc(173) Throwable local173) {
				return new Class177();
			}
		}
	}
}
