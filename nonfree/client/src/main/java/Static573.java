import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "Lclient!bt;")
	public static Class34 aClass34_112;

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_193 = new Class151(112, -2);

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
	public static int anInt8886 = -1;

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "[I")
	public static final int[] anIntArray634 = new int[1000];

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "[F")
	public static final float[] aFloatArray64 = new float[4];

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "[S")
	public static final short[] aShortArray146 = new short[] { 25, 46, 13, 12, 50, 52, 6, 23 };

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!ar;Z)Z")
	public static boolean method7594(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static140.aClass42Array4 == Static146.aClass42Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method8508();
		if (arg0.aShort124 < 0 || arg0.aShort125 < 0 || arg0.aShort123 >= Static51.anInt1108 || arg0.aShort122 >= Static245.anInt7888) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort124; local36 <= arg0.aShort123; local36++) {
			for (local40 = arg0.aShort125; local40 <= arg0.aShort122; local40++) {
				@Pc(47) Class73 local47 = Static558.method7416(arg0.aByte141, local36, local40);
				if (local47 != null) {
					@Pc(53) Class144 local53 = Static485.method6639(arg0);
					@Pc(56) Class144 local56 = local47.aClass144_1;
					if (local56 == null) {
						local47.aClass144_1 = local53;
					} else {
						while (local56.aClass144_2 != null) {
							local56 = local56.aClass144_2;
						}
						local56.aClass144_2 = local53;
					}
					if (local6 && (Static32.anIntArrayArray3[local36][local40] & 0xFF000000) != 0) {
						local8 = Static32.anIntArrayArray3[local36][local40];
						local10 = Static392.aShortArrayArray14[local36][local40];
						local12 = Static50.aByteArrayArray2[local36][local40];
					}
					if (!arg1 && local47.aClass3_Sub1_Sub5_1 != null && local47.aClass3_Sub1_Sub5_1.aShort105 > local33) {
						local33 = local47.aClass3_Sub1_Sub5_1.aShort105;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort124; local40 <= arg0.aShort123; local40++) {
				for (@Pc(136) int local136 = arg0.aShort125; local136 <= arg0.aShort122; local136++) {
					if ((Static32.anIntArrayArray3[local40][local136] & 0xFF000000) == 0) {
						Static32.anIntArrayArray3[local40][local136] = local8;
						Static392.aShortArrayArray14[local40][local136] = local10;
						Static50.aByteArrayArray2[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static321.aClass3_Sub1_Sub2Array1[Static239.anInt3959++] = arg0;
		} else {
			local40 = Static140.aClass42Array4 == Static146.aClass42Array3 ? 1 : 0;
			if (!arg0.method8500()) {
				arg0.aClass3_Sub1_23 = Static596.aClass3_Sub1Array4[local40];
				Static596.aClass3_Sub1Array4[local40] = arg0;
			} else if (arg0.method8501()) {
				arg0.aClass3_Sub1_23 = Static506.aClass3_Sub1Array3[local40];
				Static506.aClass3_Sub1Array3[local40] = arg0;
			} else {
				arg0.aClass3_Sub1_23 = Static114.aClass3_Sub1Array1[local40];
				Static114.aClass3_Sub1Array1[local40] = arg0;
				Static42.aBoolean73 = true;
			}
		}
		if (arg1) {
			arg0.anInt9915 -= local33;
		}
		return true;
	}
}
