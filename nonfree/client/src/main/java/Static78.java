import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
	public static int anInt4061;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "[I")
	public static final int[] anIntArray173 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!pn;Z[[[BIB)Z")
	public static boolean method3297(@OriginalArg(0) Class25_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static189.aBoolean281) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt8476 >> Static385.anInt6657;
		@Pc(13) int local13 = arg0.anInt8482 >> Static385.anInt6657;
		if (local8 < Static61.anInt1673 || local8 >= Static586.anInt10185 || local13 < Static439.anInt7775 || local13 >= Static430.anInt7618) {
			return true;
		} else if ((arg2 == null || arg0.aByte117 < arg3 || arg2[arg0.aByte117][local8][local13] != arg4) && arg0.method6646() && !arg0.method6651()) {
			return false;
		} else {
			if (!arg1 && local8 >= Static261.anInt5023 - 16 && local8 <= Static261.anInt5023 + 16 && local13 >= Static216.anInt4499 - 16 && local13 <= Static216.anInt4499 + 16) {
				if (Static538.aBoolean626) {
					Static483.aClass311Array1[Static182.anInt3991++].method6754(arg0);
					Static182.anInt3991 %= Static557.anInt6112;
				} else {
					arg0.method6656(Static68.aClass31_4);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)I")
	public static int method3298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static256.aClass127Array3 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg0 >> 9;
		@Pc(20) int local20 = arg2 >> 9;
		if (local16 < 0 || local20 < 0 || Static345.anInt6228 - 1 < local16 || local20 > Static535.anInt9341 - 1) {
			return 0;
		}
		@Pc(38) int local38 = arg1;
		if (arg1 < 3 && (Static428.aByteArrayArrayArray4[1][local16][local20] & 0x2) != 0) {
			local38 = arg1 + 1;
		}
		return Static256.aClass127Array3[local38].method7860(arg2, arg0);
	}

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "(I)V")
	public static void method3300() {
		@Pc(7) Class272 local7 = null;
		try {
			@Pc(13) Class309 local13 = Static467.aClass168_12.method4080("3", false);
			while (local13.anInt8650 == 0) {
				Static373.method5240(1L);
			}
			if (local13.anInt8650 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class272) local13.anObject15;
			@Pc(45) byte[] local45 = new byte[(int) local7.method6176()];
			if (local45.length == 0) {
				Static223.aString111 = "";
				Static342.aString159 = "";
			} else {
				@Pc(68) int local68;
				for (@Pc(53) int local53 = 0; local53 < local45.length; local53 += local68) {
					local68 = local7.method6177(local53, local45.length - local53, local45);
					if (local68 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(93) Class3_Sub26 local93 = new Class3_Sub26(local45);
				@Pc(97) int local97 = local93.method6814();
				if (local97 > 120) {
					throw new RuntimeException("Bad length");
				}
				local93.anInt8703 = local97 + 1;
				if (!local93.method6779()) {
					throw new RuntimeException("Invalid CRC");
				}
				local93.anInt8703 = 1;
				@Pc(126) int local126 = local93.method6814();
				if (local126 > 3) {
					throw new RuntimeException("Invalid version " + local126);
				}
				Static223.aString111 = local93.method6802();
				Static342.aString159 = local93.method6802();
				if (local126 < 1) {
					Static403.anInt7292 = Static501.anInt8649;
				} else {
					Static403.anInt7292 = local93.method6811();
				}
				if (local126 >= 2) {
					Static330.aLong165 = local93.method6813();
				} else {
					Static330.aLong165 = Static182.aLong91;
				}
				if (local126 < 3) {
					Static387.aString175 = Static303.aString152;
				} else if (local93.method6814() == 1) {
					Static387.aString175 = local93.method6802();
				} else {
					Static387.aString175 = null;
				}
			}
		} catch (@Pc(210) Exception local210) {
			Static223.aString111 = "";
			Static342.aString159 = "";
		}
		try {
			if (local7 != null) {
				local7.method6172();
			}
		} catch (@Pc(223) Exception local223) {
		}
	}
}
