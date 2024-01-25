import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array14;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
	public static int anInt6106;

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "Lclient!lm;")
	public static Class134 aClass134_135;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
	public static int anInt6108;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
	public static int anInt6105 = -1;

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "[S")
	public static final short[] aShortArray102 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZII)I")
	public static int method5291(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(41) int local41 = (arg0 & 0x7F) * 96 >> 7;
			if (local41 < 2) {
				local41 = 2;
			} else if (local41 > 126) {
				local41 = 126;
			}
			return local41 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!va;Z)Z")
	public static boolean method5292(@OriginalArg(0) Class10_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static263.aClass12Array2 == Static81.aClass12Array1;
		@Pc(8) int local8 = 0;
		arg0.method5828();
		if (arg0.aShort94 < 0 || arg0.aShort91 < 0 || arg0.aShort93 >= Static97.anInt1852 || arg0.aShort92 >= Static3.anInt38) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort94; local30 <= arg0.aShort93; local30++) {
			for (local34 = arg0.aShort91; local34 <= arg0.aShort92; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort94) {
					local37++;
				}
				if (local30 < arg0.aShort93) {
					local37 += 4;
				}
				if (local34 > arg0.aShort91) {
					local37 += 8;
				}
				if (local34 < arg0.aShort92) {
					local37 += 2;
				}
				Static313.method5368(arg0.aByte73, local30, local34);
				@Pc(71) Class83 local71 = Static347.aClass83ArrayArrayArray3[arg0.aByte73][local30][local34];
				@Pc(76) Class59 local76 = Static239.method2413(arg0, local37);
				@Pc(79) Class59 local79 = local71.aClass59_2;
				if (local79 == null) {
					local71.aClass59_2 = local76;
				} else {
					while (local79.aClass59_1 != null) {
						local79 = local79.aClass59_1;
					}
					local79.aClass59_1 = local76;
				}
				local71.aByte32 = (byte) (local71.aByte32 | local37);
				if (local6 && Static345.anIntArrayArray60[local30][local34] != 0) {
					local8 = Static345.anIntArrayArray60[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort94; local34 <= arg0.aShort93; local34++) {
				for (local37 = arg0.aShort91; local37 <= arg0.aShort92; local37++) {
					if (Static345.anIntArrayArray60[local34][local37] == 0) {
						Static345.anIntArrayArray60[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static51.aClass10_Sub1Array1[Static44.anInt1171++] = arg0;
		}
		return true;
	}
}
