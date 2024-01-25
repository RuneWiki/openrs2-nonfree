import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!kea", name = "od", descriptor = "[B")
	public static byte[] aByteArray108;

	@OriginalMember(owner = "client!kea", name = "Pd", descriptor = "I")
	public static int anInt8571;

	@OriginalMember(owner = "client!kea", name = "ab", descriptor = "[F")
	public static final float[] aFloatArray58 = new float[4];

	@OriginalMember(owner = "client!kea", name = "vb", descriptor = "[Lclient!tn;")
	public static final Class6_Sub2_Sub19[] aClass6_Sub2_Sub19Array6 = new Class6_Sub2_Sub19[14];

	@OriginalMember(owner = "client!kea", name = "Cc", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_158 = new Class73(63, 1);

	@OriginalMember(owner = "client!kea", name = "Oc", descriptor = "Lclient!sk;")
	public static Class6_Sub40 aClass6_Sub40_3 = null;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!wda;Z)Z")
	public static boolean method7016(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static133.aClass59Array3 == Static49.aClass59Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7792();
		if (arg0.aShort126 < 0 || arg0.aShort125 < 0 || arg0.aShort123 >= Static401.anInt7022 || arg0.aShort124 >= Static555.anInt9182) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort126; local36 <= arg0.aShort123; local36++) {
			for (local40 = arg0.aShort125; local40 <= arg0.aShort124; local40++) {
				@Pc(47) Class276 local47 = Static417.method5977(arg0.aByte108, local36, local40);
				if (local47 != null) {
					@Pc(51) int local51 = 0;
					if (local36 > arg0.aShort126) {
						local51++;
					}
					if (local36 < arg0.aShort123) {
						local51 += 4;
					}
					if (local40 > arg0.aShort125) {
						local51 += 8;
					}
					if (local40 < arg0.aShort124) {
						local51 += 2;
					}
					@Pc(76) Class267 local76 = Static34.method943(local51, arg0);
					@Pc(79) Class267 local79 = local47.aClass267_3;
					if (local79 == null) {
						local47.aClass267_3 = local76;
					} else {
						while (local79.aClass267_2 != null) {
							local79 = local79.aClass267_2;
						}
						local79.aClass267_2 = local76;
					}
					local47.aByte86 = (byte) (local47.aByte86 | local51);
					if (local6 && (Static314.anIntArrayArray53[local36][local40] & 0xFF000000) != 0) {
						local8 = Static314.anIntArrayArray53[local36][local40];
						local10 = Static132.aShortArrayArray1[local36][local40];
						local12 = Static305.aByteArrayArray4[local36][local40];
					}
					if (local47.aClass4_Sub3_2 != null && local47.aClass4_Sub3_2.aShort76 > local33) {
						local33 = local47.aClass4_Sub3_2.aShort76;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort126; local40 <= arg0.aShort123; local40++) {
				for (@Pc(164) int local164 = arg0.aShort125; local164 <= arg0.aShort124; local164++) {
					if ((Static314.anIntArrayArray53[local40][local164] & 0xFF000000) == 0) {
						Static314.anIntArrayArray53[local40][local164] = local8;
						Static132.aShortArrayArray1[local40][local164] = local10;
						Static305.aByteArrayArray4[local40][local164] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static216.aClass4_Sub1Array1[Static325.anInt5957++] = arg0;
		}
		if (arg1) {
			arg0.anInt9541 -= local33;
		}
		return true;
	}
}
