import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!ql;")
	public static Class278 aClass278_4;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "I")
	public static int anInt7400;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "Lclient!vk;")
	public static Class359 aClass359_1;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "I")
	public static int anInt7402;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public static int anInt7399 = 0;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[4];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!et;B)I")
	public static int method6146(@OriginalArg(0) Class3_Sub1_Sub4 arg0) {
		@Pc(7) String local7 = Static590.method8097(arg0);
		@Pc(14) int[] local14 = null;
		if (Static603.method8220(arg0.anInt3485)) {
			local14 = Static367.aClass281_1.method6975((int) arg0.aLong74).anIntArray441;
		} else if (arg0.anInt3482 != -1) {
			local14 = Static367.aClass281_1.method6975(arg0.anInt3482).anIntArray441;
		} else if (Static438.method6668(arg0.anInt3485)) {
			@Pc(81) Class3_Sub49 local81 = (Class3_Sub49) Static60.aClass307_6.method7424((long) arg0.aLong74);
			if (local81 != null) {
				@Pc(86) Class2_Sub3_Sub1_Sub2_Sub1 local86 = local81.aClass2_Sub3_Sub1_Sub2_Sub1_2;
				@Pc(89) Class22 local89 = local86.aClass22_1;
				if (local89.anIntArray29 != null) {
					local89 = local89.method425(Static514.aClass166_1);
				}
				if (local89 != null) {
					local14 = local89.anIntArray31;
				}
			}
		} else if (Static530.method7543(arg0.anInt3485)) {
			@Pc(46) Class272 local46;
			if (arg0.anInt3485 == 1002) {
				local46 = Static541.aClass349_4.method8123((int) arg0.aLong74);
			} else {
				local46 = Static541.aClass349_4.method8123((int) (arg0.aLong74 >>> 32 & 0x7FFFFFFFL));
			}
			if (local46.anIntArray523 != null) {
				local46 = local46.method6856(Static514.aClass166_1);
			}
			if (local46 != null) {
				local14 = local46.anIntArray524;
			}
		}
		if (local14 != null) {
			local7 = local7 + Static211.method4159(local14);
		}
		@Pc(138) int local138 = Static224.aClass315_11.method7564(Static603.aClass5Array20, local7);
		if (arg0.aBoolean287) {
			local138 += Static112.aClass5_9.method7588() + 4;
		}
		return local138;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public static void method6147() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static394.aClass163Array1[local3] = null;
		}
		Static555.anInt9458 = 0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ha;IBI)V")
	public static void method6149(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static165.aClass260ArrayArray1 = new Class260[arg1][arg2];
		Static174.aClass33_7 = arg0;
		if (Static266.anIntArray528 != null) {
			Static312.aClass4_13 = Static27.method486(Static266.anIntArray528[2], Static266.anIntArray528[3], Static266.anIntArray528[5], Static266.anIntArray528[4], Static266.anIntArray528[0], Static266.anIntArray528[1]);
		}
		Static561.aClass260_2 = new Class260();
		Static39.method752();
	}
}
