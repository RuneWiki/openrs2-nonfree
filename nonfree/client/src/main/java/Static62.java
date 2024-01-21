import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!gi", name = "Wb", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_33;

	@OriginalMember(owner = "client!gi", name = "cc", descriptor = "[I")
	public static int[] anIntArray249;

	@OriginalMember(owner = "client!gi", name = "pc", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray30;

	@OriginalMember(owner = "client!gi", name = "rc", descriptor = "Lclient!ag;")
	public static Class4 aClass4_62;

	@OriginalMember(owner = "client!gi", name = "zb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_845 = Static161.method2971("Take");

	@OriginalMember(owner = "client!gi", name = "yb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_844 = aClass13_845;

	@OriginalMember(owner = "client!gi", name = "Pb", descriptor = "Lclient!ld;")
	public static Class47 aClass47_18 = new Class47(64);

	@OriginalMember(owner = "client!gi", name = "nc", descriptor = "I")
	public static int anInt2602 = 255;

	@OriginalMember(owner = "client!gi", name = "qc", descriptor = "I")
	public static int anInt2604 = 0;

	@OriginalMember(owner = "client!gi", name = "sc", descriptor = "I")
	public static int anInt2605 = 0;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(B)V")
	public static void method1886() {
		Static153.aClass1_Sub8_Sub1_2.method1657();
		@Pc(13) int local13 = Static153.aClass1_Sub8_Sub1_2.method1656(8);
		@Pc(22) int local22;
		if (Static74.anInt2127 > local13) {
			for (local22 = local13; local22 < Static74.anInt2127; local22++) {
				Static126.anIntArray312[Static7.anInt3168++] = Static66.anIntArray202[local22];
			}
		}
		if (local13 > Static74.anInt2127) {
			throw new RuntimeException("gnpov1");
		}
		Static74.anInt2127 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(65) int local65 = Static66.anIntArray202[local22];
			@Pc(69) Class1_Sub2_Sub2_Sub2_Sub1 local69 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local65];
			@Pc(74) int local74 = Static153.aClass1_Sub8_Sub1_2.method1656(1);
			if (local74 == 0) {
				Static66.anIntArray202[Static74.anInt2127++] = local65;
				local69.anInt2597 = Static78.anInt2168;
			} else {
				@Pc(94) int local94 = Static153.aClass1_Sub8_Sub1_2.method1656(2);
				if (local94 == 0) {
					Static66.anIntArray202[Static74.anInt2127++] = local65;
					local69.anInt2597 = Static78.anInt2168;
					Static147.anIntArray350[Static156.anInt3694++] = local65;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local94 == 1) {
						Static66.anIntArray202[Static74.anInt2127++] = local65;
						local69.anInt2597 = Static78.anInt2168;
						local136 = Static153.aClass1_Sub8_Sub1_2.method1656(3);
						local69.method1883(false, local136);
						local146 = Static153.aClass1_Sub8_Sub1_2.method1656(1);
						if (local146 == 1) {
							Static147.anIntArray350[Static156.anInt3694++] = local65;
						}
					} else if (local94 == 2) {
						Static66.anIntArray202[Static74.anInt2127++] = local65;
						local69.anInt2597 = Static78.anInt2168;
						local136 = Static153.aClass1_Sub8_Sub1_2.method1656(3);
						local69.method1883(true, local136);
						local146 = Static153.aClass1_Sub8_Sub1_2.method1656(3);
						local69.method1883(true, local146);
						@Pc(198) int local198 = Static153.aClass1_Sub8_Sub1_2.method1656(1);
						if (local198 == 1) {
							Static147.anIntArray350[Static156.anInt3694++] = local65;
						}
					} else if (local94 == 3) {
						Static126.anIntArray312[Static7.anInt3168++] = local65;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "(B)V")
	public static void method1888() {
		aClass13_845 = null;
		aClass13_844 = null;
		aByteArrayArrayArray30 = null;
		aClass4_Sub1_33 = null;
		aClass4_62 = null;
		aClass47_18 = null;
		anIntArray249 = null;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!e;IIILjava/awt/Component;)Lclient!sd;")
	public static Class53 method1890(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3) {
		if (Static135.anInt3382 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(44) Class53 local44 = (Class53) Class.forName("Class53_Sub2").getDeclaredConstructor().newInstance();
			local44.anInt4154 = arg2;
			local44.anIntArray456 = new int[(Static97.aBoolean323 ? 2 : 1) * 256];
			local44.method3046(arg3);
			local44.anInt4155 = (arg2 & 0xFFFFFC00) + 1024;
			if (local44.anInt4155 > 16384) {
				local44.anInt4155 = 16384;
			}
			local44.method3047(local44.anInt4155);
			if (Static162.anInt3811 > 0 && Static159.aClass5_1 == null) {
				Static159.aClass5_1 = new Class5();
				Static159.aClass5_1.aClass16_1 = arg0;
				arg0.method982(Static159.aClass5_1, Static162.anInt3811);
			}
			if (Static159.aClass5_1 != null) {
				if (Static159.aClass5_1.aClass53Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static159.aClass5_1.aClass53Array1[arg1] = local44;
			}
			return local44;
		} catch (@Pc(116) Throwable local116) {
			try {
				@Pc(122) Class53_Sub1 local122 = new Class53_Sub1(arg0, arg1);
				local122.anInt4154 = arg2;
				local122.anIntArray456 = new int[(Static97.aBoolean323 ? 2 : 1) * 256];
				local122.method3046(arg3);
				local122.anInt4155 = 16384;
				local122.method3047(local122.anInt4155);
				if (Static162.anInt3811 > 0 && Static159.aClass5_1 == null) {
					Static159.aClass5_1 = new Class5();
					Static159.aClass5_1.aClass16_1 = arg0;
					arg0.method982(Static159.aClass5_1, Static162.anInt3811);
				}
				if (Static159.aClass5_1 != null) {
					if (Static159.aClass5_1.aClass53Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static159.aClass5_1.aClass53Array1[arg1] = local122;
				}
				return local122;
			} catch (@Pc(181) Throwable local181) {
				return new Class53();
			}
		}
	}
}
