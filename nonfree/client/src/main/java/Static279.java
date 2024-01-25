import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!ti;")
	public static Class1_Sub3_Sub16 aClass1_Sub3_Sub16_3;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_78 = new Class242(82, -1);

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "[I")
	public static final int[] anIntArray355 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "[I")
	public static final int[] anIntArray356 = new int[50];

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!l;)Lclient!za;")
	public static Class117 method3750(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface4 arg2) {
		return new Class117_Sub2(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZZ)V")
	public static void method3752(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0) {
			Static186.aClass117_3 = Static465.method5715(Static126.aClass19_Sub1_1.anInt4218 * 2, Static91.aCanvas2, arg0, Static302.anInterface4_7, Static259.aClass177_2);
		} else {
			if (arg1) {
				Static186.aClass117_3 = Static465.method5715(0, Static91.aCanvas2, 0, Static302.anInterface4_7, Static259.aClass177_2);
				Static186.aClass117_3.t(0);
				@Pc(39) Class252 local39 = Static152.method1914(Static386.aClass185_118, Static4.anInt60);
				@Pc(48) Class137 local48 = Static186.aClass117_3.method5680(local39, Static467.method894(Static178.aClass185_49, Static4.anInt60));
				Static63.method859(true, local48, Static19.aClass142_4.method3118(Static63.anInt981));
				Static186.aClass117_3.method5698();
				Static463.method5975();
				Static186.aClass117_3.method5701();
			}
			try {
				Static186.aClass117_3 = Static465.method5715(Static126.aClass19_Sub1_1.anInt4218 * 2, Static91.aCanvas2, arg0, Static302.anInterface4_7, Static259.aClass177_2);
				if (Static186.aClass117_3.method5711()) {
					@Pc(79) boolean local79 = true;
					try {
						local79 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(89) Throwable local89) {
					}
					@Pc(95) Class1_Sub4 local95;
					if (local79) {
						local95 = Static186.aClass117_3.method5726(146800640);
					} else {
						local95 = Static186.aClass117_3.method5726(104857600);
					}
					Static186.aClass117_3.method5660(local95);
				}
			} catch (@Pc(106) Throwable local106) {
				Static186.aClass117_3 = Static465.method5715(0, Static91.aCanvas2, 0, Static302.anInterface4_7, Static259.aClass177_2);
				arg0 = 0;
			}
		}
		Static214.anInt3968 = arg0;
		Static305.method4061();
		if (!Static186.aClass117_3.method5721()) {
			Static452.anInt7194 = 1;
		}
		Static186.aClass117_3.method5718(Static452.anInt7194);
		Static186.aClass117_3.method5722(0);
		Static186.aClass117_3.ya(8);
		Static329.aClass34_5 = Static186.aClass117_3.method5717();
		Static18.aClass34_4 = Static186.aClass117_3.method5717();
		Static203.method2957();
		Static186.aClass117_3.method5702(!Static126.aClass19_Sub1_1.aBoolean378);
		if (Static186.aClass117_3.method5662()) {
			Static445.method5629(Static126.aClass19_Sub1_1.aBoolean377);
		}
		Static453.method5843(Static186.aClass117_3, Static293.anInt4886 >> 3, Static147.anInt2300 >> 3);
		Static111.method1401();
		Static355.aBoolean515 = false;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!jg;I)V")
	public static void method3753(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1_Sub3 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt3301 > Static98.anInt1304) {
			Static57.method810(arg1);
		} else if (arg1.anInt3341 < Static98.anInt1304) {
			Static283.method5888(arg1, false);
			local9 = Static150.anInt4703;
			local7 = Static63.anInt978;
		} else {
			Static379.method129(arg1);
		}
		if (arg1.anInt6428 < 128 || arg1.anInt6430 < 128 || Static147.anInt2300 * 128 - 128 <= arg1.anInt6428 || arg1.anInt6430 >= (Static293.anInt4886 - 1) * 128) {
			arg1.anInt3301 = 0;
			arg1.anInt3328 = -1;
			arg1.anInt3341 = 0;
			local9 = 0;
			arg1.anInt3266 = -1;
			arg1.anInt3302 = -1;
			local7 = -1;
			arg1.anInt6428 = arg1.anIntArray246[0] * 128 + arg1.method2635() * 64;
			arg1.anInt6430 = arg1.anIntArray247[0] * 128 + arg1.method2635() * 64;
			arg1.method2644();
		}
		if (arg1 == Static94.aClass11_Sub1_Sub3_Sub2_1 && (arg1.anInt6428 < 1536 || arg1.anInt6430 < 1536 || arg1.anInt6428 >= (Static147.anInt2300 - 12) * 128 || Static293.anInt4886 * 128 - 1536 <= arg1.anInt6430)) {
			arg1.anInt3302 = -1;
			local9 = 0;
			arg1.anInt3341 = 0;
			local7 = -1;
			arg1.anInt3328 = -1;
			arg1.anInt3301 = 0;
			arg1.anInt3266 = -1;
			arg1.anInt6428 = arg1.anIntArray246[0] * 128 + arg1.method2635() * 64;
			arg1.anInt6430 = arg1.anIntArray247[0] * 128 + arg1.method2635() * 64;
			arg1.method2644();
		}
		@Pc(207) int local207 = Static252.method3562(arg1);
		Static308.method4081(local7, local207, arg1, local9);
		Static432.method5479(arg1);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method3754(@OriginalArg(0) String arg0) {
		return Static424.method5416(arg0);
	}
}
