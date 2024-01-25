import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "Z")
	public static boolean aBoolean358;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!bt;")
	public static Class34 aClass34_68;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)[Lclient!ps;")
	public static Class291[] method4279() {
		return new Class291[] { Static81.aClass291_1, Static436.aClass291_11, Static452.aClass291_10 };
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BB)C")
	public static char method4280(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(45) char local45 = Static295.aCharArray4[local12 - 128];
			if (local45 == '\u0000') {
				local45 = '?';
			}
			local12 = local45;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "()V")
	public static void method4281() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static21.aClass73ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static21.aClass73ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static51.anInt1108; local6++) {
					for (local9 = 0; local9 < Static245.anInt7888; local9++) {
						if (Static21.aClass73ArrayArrayArray1[local3][local6][local9] != null) {
							Static21.aClass73ArrayArrayArray1[local3][local6][local9].method2069();
						}
						Static21.aClass73ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static21.aClass73ArrayArrayArray1 = null;
		Static655.aClass42Array5 = null;
		if (Static540.aClass73ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static540.aClass73ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static51.anInt1108; local6++) {
					for (local9 = 0; local9 < Static245.anInt7888; local9++) {
						if (Static540.aClass73ArrayArrayArray3[local3][local6][local9] != null) {
							Static540.aClass73ArrayArrayArray3[local3][local6][local9].method2069();
						}
						Static540.aClass73ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static540.aClass73ArrayArrayArray3 = null;
		Static146.aClass42Array3 = null;
		Static267.aClass73ArrayArrayArray2 = null;
		Static140.aClass42Array4 = null;
		Static537.aBooleanArrayArray32 = null;
		Static211.aBooleanArrayArray37 = null;
		Static443.anIntArray478 = null;
		Static444.aBooleanArrayArrayArray1 = null;
		Static471.aBooleanArrayArrayArray2 = null;
		Static221.method3265();
		if (Static321.aClass3_Sub1_Sub2Array1 != null) {
			for (local3 = 0; local3 < Static239.anInt3959; local3++) {
				Static321.aClass3_Sub1_Sub2Array1[local3] = null;
			}
			Static239.anInt3959 = 0;
		}
		Static114.aClass3_Sub1Array1 = null;
		Static506.aClass3_Sub1Array3 = null;
		Static596.aClass3_Sub1Array4 = null;
		if (Static668.aClass3_Sub1Array5 != null) {
			for (local3 = 0; local3 < Static668.aClass3_Sub1Array5.length; local3++) {
				Static668.aClass3_Sub1Array5[local3] = null;
			}
			Static215.anInt3488 = 0;
		}
		if (Static269.aClass3_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static269.aClass3_Sub1Array2.length; local3++) {
				Static269.aClass3_Sub1Array2[local3] = null;
			}
			Static522.anInt8084 = 0;
		}
		if (Static217.aClass85Array1 != null) {
			for (local3 = 0; local3 < Static355.anInt5402; local3++) {
				Static217.aClass85Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static539.anInt8345; local6++) {
				for (local9 = 0; local9 < Static51.anInt1108; local9++) {
					for (@Pc(195) int local195 = 0; local195 < Static245.anInt7888; local195++) {
						Static432.aLongArrayArrayArray1[local6][local9][local195] = 0L;
					}
				}
			}
			Static355.anInt5402 = 0;
		}
		Static147.method7908();
		Static419.aClass223_4 = Static419.aClass223_3;
		Static419.aClass223_4.method4810();
		Static50.aByteArrayArray2 = null;
		Static32.anIntArrayArray3 = null;
		Static392.aShortArrayArray14 = null;
		if (Static409.aClass10Array1 != null) {
			Static407.method2205();
			Static246.aClass33_6.method8111(1);
			Static246.aClass33_6.method8109(0);
		}
		if (Static48.aClass394Array1 != null) {
			Static48.aClass394Array1 = null;
		}
		Static246.aClass33_6 = null;
	}
}
