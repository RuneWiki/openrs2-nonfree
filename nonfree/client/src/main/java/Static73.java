import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "[S")
	public static short[] aShortArray39;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "Lclient!dp;")
	public static Class53 aClass53_37;

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "Lclient!dp;")
	public static Class53 aClass53_38;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "[I")
	public static final int[] anIntArray148 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[5];

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "J")
	public static long aLong42 = 0L;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!pf;Z)Z")
	public static boolean method1271(@OriginalArg(0) Class44_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static203.aClass106Array3 == Static84.aClass106Array1;
		@Pc(8) int local8 = 0;
		arg0.method5789();
		if (arg0.aShort90 < 0 || arg0.aShort89 < 0 || arg0.aShort87 >= Static310.anInt5828 || arg0.aShort88 >= Static163.anInt3084) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort90; local30 <= arg0.aShort87; local30++) {
			for (local34 = arg0.aShort89; local34 <= arg0.aShort88; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort90) {
					local37++;
				}
				if (local30 < arg0.aShort87) {
					local37 += 4;
				}
				if (local34 > arg0.aShort89) {
					local37 += 8;
				}
				if (local34 < arg0.aShort88) {
					local37 += 2;
				}
				Static101.method2079(arg0.aByte90, local30, local34);
				@Pc(71) Class187 local71 = Static39.aClass187ArrayArrayArray1[arg0.aByte90][local30][local34];
				@Pc(76) Class214 local76 = Static59.method978(arg0, local37);
				@Pc(79) Class214 local79 = local71.aClass214_19;
				if (local79 == null) {
					local71.aClass214_19 = local76;
				} else {
					while (local79.aClass214_21 != null) {
						local79 = local79.aClass214_21;
					}
					local79.aClass214_21 = local76;
				}
				local71.aByte80 = (byte) (local71.aByte80 | local37);
				if (local6 && Static291.anIntArrayArray183[local30][local34] != 0) {
					local8 = Static291.anIntArrayArray183[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort90; local34 <= arg0.aShort87; local34++) {
				for (local37 = arg0.aShort89; local37 <= arg0.aShort88; local37++) {
					if (Static291.anIntArrayArray183[local34][local37] == 0) {
						Static291.anIntArrayArray183[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static9.aClass44_Sub4Array1[Static113.anInt2094++] = arg0;
		}
		return true;
	}
}
