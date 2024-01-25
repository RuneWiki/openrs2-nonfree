import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!wha", name = "g", descriptor = "I")
	public static int anInt10415;

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
	public static void method8555() {
		Static377.method5989();
		Static165.aClass260ArrayArray1 = null;
		Static459.aClass4_11 = null;
		Static52.aClass4_3 = null;
		Static312.aClass4_13 = null;
		Static174.aClass33_7 = null;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(BI)V")
	public static void method8556() {
		Static401.aClass112_45.method3637(50);
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(Lclient!kba;B)I")
	public static int method8557(@OriginalArg(0) Class2_Sub3_Sub1_Sub2 arg0) {
		if (arg0.anInt6275 == 0) {
			return 0;
		}
		@Pc(72) int local72;
		@Pc(65) int local65;
		if (arg0.anInt6331 != -1) {
			@Pc(23) Class2_Sub3_Sub1_Sub2 local23 = null;
			if (arg0.anInt6331 < 32768) {
				@Pc(37) Class3_Sub49 local37 = (Class3_Sub49) Static60.aClass307_6.method7424((long) arg0.anInt6331);
				if (local37 != null) {
					local23 = local37.aClass2_Sub3_Sub1_Sub2_Sub1_2;
				}
			} else if (arg0.anInt6331 >= 32768) {
				local23 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[arg0.anInt6331 - 32768];
			}
			if (local23 != null) {
				local65 = arg0.anInt10428 - local23.anInt10428;
				local72 = arg0.anInt10424 - local23.anInt10424;
				if (local65 != 0 || local72 != 0) {
					arg0.method5319((int) (Math.atan2((double) local65, (double) local72) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class2_Sub3_Sub1_Sub2_Sub2) {
			@Pc(95) Class2_Sub3_Sub1_Sub2_Sub2 local95 = (Class2_Sub3_Sub1_Sub2_Sub2) arg0;
			if (local95.anInt6384 != -1 && (local95.anInt6343 == 0 || local95.anInt6345 > 0)) {
				local95.method5319(local95.anInt6384);
				local95.anInt6384 = -1;
			}
		} else if (arg0 instanceof Class2_Sub3_Sub1_Sub2_Sub1) {
			@Pc(124) Class2_Sub3_Sub1_Sub2_Sub1 local124 = (Class2_Sub3_Sub1_Sub2_Sub1) arg0;
			if (local124.anInt2889 != -1 && (local124.anInt6343 == 0 || local124.anInt6345 > 0)) {
				local65 = local124.anInt10428 - (local124.anInt2889 - Static446.anInt8090 - Static446.anInt8090) * 256;
				local72 = local124.anInt10424 - (local124.anInt2896 - Static124.anInt3150 - Static124.anInt3150) * 256;
				if (local65 != 0 || local72 != 0) {
					local124.method5319((int) (Math.atan2((double) local65, (double) local72) * 2607.5945876176133D) & 0x3FFF);
				}
				local124.anInt2889 = -1;
			}
		}
		return arg0.method5316();
	}
}
