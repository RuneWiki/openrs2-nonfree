import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "[Lclient!vj;")
	public static Class358[] aClass358Array1;

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "[F")
	public static final float[] aFloatArray42 = new float[2];

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[5];

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(III)I")
	public static int method3669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return local16 + (arg1 + (arg1 >>> 31)) % arg0;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLclient!tp;)V")
	public static void method3670(@OriginalArg(1) Class331 arg0) {
		if (!Static147.aBoolean270) {
			return;
		}
		if (arg0.anObjectArray8 != null) {
			@Pc(18) Class331 local18 = Static201.method3722(Static401.anInt7697, Static391.anInt7576);
			if (local18 != null) {
				@Pc(24) Class8_Sub40 local24 = new Class8_Sub40();
				local24.anObjectArray2 = arg0.anObjectArray8;
				local24.aClass331_13 = local18;
				local24.aClass331_14 = arg0;
				Static273.method4698(local24);
			}
		}
		@Pc(41) Class8_Sub31 local41 = Static51.method1418(Static193.aClass257_40, Static608.aClass336_1);
		local41.aClass8_Sub8_Sub2_1.method8523(arg0.anInt9578);
		local41.aClass8_Sub8_Sub2_1.method8546(arg0.anInt9570);
		local41.aClass8_Sub8_Sub2_1.method8548(Static230.anInt5229);
		local41.aClass8_Sub8_Sub2_1.method8551(arg0.anInt9535);
		local41.aClass8_Sub8_Sub2_1.method8547(Static401.anInt7697);
		local41.aClass8_Sub8_Sub2_1.method8546(Static391.anInt7576);
		Static262.method4604(local41);
	}
}
