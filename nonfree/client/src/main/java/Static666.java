import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static666 {

	@OriginalMember(owner = "client!wn", name = "F", descriptor = "[F")
	public static final float[] aFloatArray77 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!wn", name = "L", descriptor = "I")
	public static final int anInt11367 = 1403;

	@OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
	public static int anInt11368 = 0;

	@OriginalMember(owner = "client!wn", name = "N", descriptor = "[I")
	public static final int[] anIntArray595 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLclient!fm;)I")
	public static int method9729(@OriginalArg(1) Class15_Sub3_Sub3_Sub1 arg0) {
		if (arg0.anInt4024 == 0) {
			return 0;
		}
		@Pc(74) int local74;
		@Pc(67) int local67;
		if (arg0.anInt3979 != -1) {
			@Pc(25) Class15_Sub3_Sub3_Sub1 local25 = null;
			if (arg0.anInt3979 < 32768) {
				@Pc(53) Class2_Sub6 local53 = (Class2_Sub6) Static630.aClass335_29.method8357((long) arg0.anInt3979);
				if (local53 != null) {
					local25 = local53.aClass15_Sub3_Sub3_Sub1_Sub2_1;
				}
			} else if (arg0.anInt3979 >= 32768) {
				local25 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[arg0.anInt3979 - 32768];
			}
			if (local25 != null) {
				local67 = arg0.anInt11022 - local25.anInt11022;
				local74 = arg0.anInt11024 - local25.anInt11024;
				if (local67 != 0 || local74 != 0) {
					arg0.method3681((int) (Math.atan2((double) local67, (double) local74) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class15_Sub3_Sub3_Sub1_Sub1) {
			@Pc(174) Class15_Sub3_Sub3_Sub1_Sub1 local174 = (Class15_Sub3_Sub3_Sub1_Sub1) arg0;
			if (local174.anInt2376 != -1 && (local174.anInt4039 == 0 || local174.anInt4040 > 0)) {
				local174.method3681(local174.anInt2376);
				local174.anInt2376 = -1;
			}
		} else if (arg0 instanceof Class15_Sub3_Sub3_Sub1_Sub2) {
			@Pc(103) Class15_Sub3_Sub3_Sub1_Sub2 local103 = (Class15_Sub3_Sub3_Sub1_Sub2) arg0;
			if (local103.anInt4050 != -1 && (local103.anInt4039 == 0 || local103.anInt4040 > 0)) {
				local67 = local103.anInt11022 - (local103.anInt4050 - Static640.anInt11085 - Static640.anInt11085) * 256;
				local74 = local103.anInt11024 - (local103.anInt4043 - Static490.anInt8763 - Static490.anInt8763) * 256;
				if (local67 != 0 || local74 != 0) {
					local103.method3681((int) (Math.atan2((double) local67, (double) local74) * 2607.5945876176133D) & 0x3FFF);
				}
				local103.anInt4050 = -1;
			}
		}
		return arg0.method3674();
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)I")
	public static int method9731(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
