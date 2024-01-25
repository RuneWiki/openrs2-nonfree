import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gfa", name = "q", descriptor = "[F")
	public static final float[] aFloatArray15 = new float[4];

	@OriginalMember(owner = "client!gfa", name = "z", descriptor = "[Lclient!at;")
	public static final Class20_Sub1[] aClass20_Sub1Array2 = new Class20_Sub1[37];

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
	public static void method2638() {
		if (!Static196.aBoolean242) {
			return;
		}
		while (true) {
			while (Static606.anInt9764 < Static1.aClass89_Sub1Array6.length) {
				@Pc(26) Class89_Sub1 local26 = Static1.aClass89_Sub1Array6[Static606.anInt9764];
				if (local26 != null && local26.anInt2236 == -1) {
					if (Static262.aClass2_Sub32_5 == null) {
						Static262.aClass2_Sub32_5 = Static308.aClass253_1.method5495(local26.aString20);
					}
					@Pc(50) int local50 = Static262.aClass2_Sub32_5.anInt5896;
					if (local50 == -1) {
						return;
					}
					local26.anInt2236 = local50;
					Static606.anInt9764++;
					Static262.aClass2_Sub32_5 = null;
				} else {
					Static606.anInt9764++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)I")
	public static int method2639(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static502.anIntArray200[arg1 & 0x3] : Static385.anIntArray441[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIIIILclient!ha;I)V")
	public static void method2640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) Class95 arg4) {
		Static361.aClass95_9 = arg4;
		Static372.aClass177_5 = Static361.aClass95_9.method7001();
		Static539.aClass177_10 = Static361.aClass95_9.method7001();
		Static469.aClass177_2 = Static361.aClass95_9.method7001();
		Static151.anInt2698 = 2;
		Static151.anInterface4_1 = null;
		Static240.anInt543 = 2;
		Static598.anInt9689 = arg2;
		Static281.anInt4510 = arg3;
		Static491.anInt8078 = 1;
		Static233.anInt3794 = 0;
		Static472.anInt7535 = 0;
		Static15.method230(arg1, arg0);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILclient!vj;)Lclient!te;")
	public static Class3_Sub3 method2641(@OriginalArg(1) Class2_Sub22 arg0) {
		return new Class3_Sub3(arg0.method8526(), arg0.method8526(), arg0.method8526(), arg0.method8526(), arg0.method8526(), arg0.method8526(), arg0.method8526(), arg0.method8526(), arg0.method8539(), arg0.method8547());
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(III)Z")
	public static boolean method2642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < Static27.aByteArrayArrayArray1[1].length && arg0 < Static27.aByteArrayArrayArray1[1][arg1].length) {
			return (Static27.aByteArrayArrayArray1[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2643(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg1, 3);
		local8.method662();
		local8.aString10 = arg0;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIZ)V")
	public static void method2644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(0, 15);
		local8.method662();
		local8.anInt823 = arg1;
		local8.anInt817 = arg0;
	}
}
