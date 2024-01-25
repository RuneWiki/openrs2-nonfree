import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Lclient!wv;")
	public static Class395 aClass395_1;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	public static int anInt5858;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
	public static int anInt5865 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!hd;Z)Z")
	public static boolean method4867(@OriginalArg(0) Class28_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static495.aClass109Array4 == Static111.aClass109Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method8981();
		if (arg0.aShort124 < 0 || arg0.aShort121 < 0 || arg0.aShort122 >= Static216.anInt4042 || arg0.aShort123 >= Static233.anInt4238) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort124; local36 <= arg0.aShort122; local36++) {
			for (local40 = arg0.aShort121; local40 <= arg0.aShort123; local40++) {
				@Pc(47) Class226 local47 = Static288.method4659(arg0.aByte145, local36, local40);
				if (local47 != null) {
					@Pc(53) Class41 local53 = Static279.method4511(arg0);
					@Pc(56) Class41 local56 = local47.aClass41_3;
					if (local56 == null) {
						local47.aClass41_3 = local53;
					} else {
						while (local56.aClass41_2 != null) {
							local56 = local56.aClass41_2;
						}
						local56.aClass41_2 = local53;
					}
					if (local6 && (Static390.anIntArrayArray33[local36][local40] & 0xFF000000) != 0) {
						local8 = Static390.anIntArrayArray33[local36][local40];
						local10 = Static293.aShortArrayArray7[local36][local40];
						local12 = Static25.aByteArrayArray1[local36][local40];
					}
					if (!arg1 && local47.aClass28_Sub1_Sub2_1 != null && local47.aClass28_Sub1_Sub2_1.aShort106 > local33) {
						local33 = local47.aClass28_Sub1_Sub2_1.aShort106;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort124; local40 <= arg0.aShort122; local40++) {
				for (@Pc(136) int local136 = arg0.aShort121; local136 <= arg0.aShort123; local136++) {
					if ((Static390.anIntArrayArray33[local40][local136] & 0xFF000000) == 0) {
						Static390.anIntArrayArray33[local40][local136] = local8;
						Static293.aShortArrayArray7[local40][local136] = local10;
						Static25.aByteArrayArray1[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static213.aClass28_Sub1_Sub4Array4[Static518.anInt8629++] = arg0;
		} else {
			local40 = Static495.aClass109Array4 == Static111.aClass109Array3 ? 1 : 0;
			if (!arg0.method8963()) {
				arg0.aClass28_Sub1_23 = Static110.aClass28_Sub1Array1[local40];
				Static110.aClass28_Sub1Array1[local40] = arg0;
			} else if (arg0.method8965()) {
				arg0.aClass28_Sub1_23 = Static135.aClass28_Sub1Array2[local40];
				Static135.aClass28_Sub1Array2[local40] = arg0;
			} else {
				arg0.aClass28_Sub1_23 = Static654.aClass28_Sub1Array5[local40];
				Static654.aClass28_Sub1Array5[local40] = arg0;
				Static375.aBoolean591 = true;
			}
		}
		if (arg1) {
			arg0.anInt10779 -= local33;
		}
		return true;
	}
}
