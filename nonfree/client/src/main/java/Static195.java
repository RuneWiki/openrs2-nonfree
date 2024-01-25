import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "F")
	public static float aFloat127;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
	public static int anInt3778;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
	public static void method3371() {
		if (Static136.anInt2909 < 102) {
			Static136.anInt2909 += 6;
		}
		@Pc(23) int local23;
		if (Static524.anInt9933 != -1 && Static574.method8210() > Static205.aLong111) {
			for (local23 = Static524.anInt9933; local23 < Static45.aStringArray9.length; local23++) {
				if (Static45.aStringArray9[local23].startsWith("pause")) {
					@Pc(33) int local33 = 5;
					try {
						local33 = Integer.parseInt(Static45.aStringArray9[local23].substring(6));
					} catch (@Pc(42) Exception local42) {
					}
					Static82.method1376("Pausing for " + local33 + " seconds...");
					Static524.anInt9933 = local23 + 1;
					Static205.aLong111 = (long) (local33 * 1000) + Static574.method8210();
					return;
				}
				Static41.aString3 = Static45.aStringArray9[local23];
				Static62.method1015(false);
			}
			Static524.anInt9933 = -1;
		}
		if (Static581.anInt10088 != 0) {
			Static282.anInt4641 -= Static581.anInt10088 * 5;
			if (Static295.anInt10019 <= Static282.anInt4641) {
				Static282.anInt4641 = Static295.anInt10019 - 1;
			}
			Static581.anInt10088 = 0;
			if (Static282.anInt4641 < 0) {
				Static282.anInt4641 = 0;
			}
		}
		for (local23 = 0; local23 < Static114.anInt9774; local23++) {
			@Pc(120) Interface2 local120 = Static84.anInterface2Array2[local23];
			@Pc(124) int local124 = local120.method5852();
			@Pc(128) char local128 = local120.method5851();
			@Pc(132) int local132 = local120.method5853();
			if (local124 == 84) {
				Static62.method1015(false);
			}
			if (local124 == 80) {
				Static62.method1015(true);
			} else if (local124 == 66 && (local132 & 0x4) != 0) {
				if (Static580.aClipboard2 != null) {
					@Pc(157) String local157 = "";
					for (@Pc(162) int local162 = Static573.aStringArray70.length - 1; local162 >= 0; local162--) {
						if (Static573.aStringArray70[local162] != null && Static573.aStringArray70[local162].length() > 0) {
							local157 = local157 + Static573.aStringArray70[local162] + '\n';
						}
					}
					Static580.aClipboard2.setContents(new StringSelection(local157), null);
				}
			} else if (local124 == 67 && (local132 & 0x4) != 0) {
				if (Static580.aClipboard2 != null) {
					@Pc(219) Transferable local219 = Static580.aClipboard2.getContents(null);
					if (local219 != null) {
						try {
							@Pc(226) String local226 = (String) local219.getTransferData(DataFlavor.stringFlavor);
							if (local226 != null) {
								@Pc(233) String[] local233 = Static175.method3185('\n', local226);
								Static222.method3618(local233);
							}
						} catch (@Pc(238) Exception local238) {
						}
					}
				}
			} else if (local124 == 85 && Static463.anInt7202 > 0) {
				Static41.aString3 = Static41.aString3.substring(0, Static463.anInt7202 - 1) + Static41.aString3.substring(Static463.anInt7202);
				Static463.anInt7202--;
			} else if (local124 == 101 && Static463.anInt7202 < Static41.aString3.length()) {
				Static41.aString3 = Static41.aString3.substring(0, Static463.anInt7202) + Static41.aString3.substring(Static463.anInt7202 + 1);
			} else if (local124 == 96 && Static463.anInt7202 > 0) {
				Static463.anInt7202--;
			} else if (local124 == 97 && Static463.anInt7202 < Static41.aString3.length()) {
				Static463.anInt7202++;
			} else if (local124 == 102) {
				Static463.anInt7202 = 0;
			} else if (local124 == 103) {
				Static463.anInt7202 = Static41.aString3.length();
			} else if (local124 == 104 && Static407.anInt7738 < Static573.aStringArray70.length) {
				Static407.anInt7738++;
				Static363.method5854();
				Static463.anInt7202 = Static41.aString3.length();
			} else if (local124 == 105 && Static407.anInt7738 > 0) {
				Static407.anInt7738--;
				Static363.method5854();
				Static463.anInt7202 = Static41.aString3.length();
			} else if (Static129.method2632(local128) || local128 == '\\' || local128 == '/' || local128 == '.' || local128 == ':' || local128 == ',' || local128 == ' ' || local128 == '_' || local128 == '-' || local128 == '+' || local128 == '[' || local128 == ']') {
				Static41.aString3 = Static41.aString3.substring(0, Static463.anInt7202) + Static84.anInterface2Array2[local23].method5851() + Static41.aString3.substring(Static463.anInt7202);
				Static463.anInt7202++;
			}
		}
		Static114.anInt9774 = 0;
		Static566.anInt9917 = 0;
		Static523.method7617();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFIIFIII)[F")
	public static float[] method3372(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(22) float[] local22 = new float[9];
		@Pc(30) float local30 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(38) float local38 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local6[3] = 0.0F;
		local6[8] = local30;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[1] = 0.0F;
		local6[5] = 0.0F;
		local6[0] = local30;
		local6[2] = local38;
		local6[6] = -local38;
		@Pc(82) float[] local82 = new float[9];
		@Pc(84) float local84 = 1.0F;
		@Pc(89) float local89 = (float) arg6 / 32767.0F;
		@Pc(91) float local91 = 0.0F;
		@Pc(102) float local102 = -((float) Math.sqrt((double) (1.0F - local89 * local89)));
		@Pc(107) float local107 = 1.0F - local89;
		@Pc(118) float local118 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3));
		if (local118 == 0.0F && local89 == 0.0F) {
			local22 = local6;
		} else {
			if (local118 != 0.0F) {
				local91 = (float) arg5 / local118;
				local84 = (float) -arg3 / local118;
			}
			local82[4] = local89;
			local82[5] = local102 * local84;
			local82[8] = local91 * local91 * local107 + local89;
			local82[2] = local84 * local91 * local107;
			local82[3] = -local91 * local102;
			local82[7] = -local84 * local102;
			local82[6] = local107 * local91 * local84;
			local82[1] = local91 * local102;
			local82[0] = local89 + local84 * local84 * local107;
			local22[0] = local6[2] * local82[6] + local6[0] * local82[0] + local82[3] * local6[1];
			local22[1] = local6[2] * local82[7] + local82[4] * local6[1] + local82[1] * local6[0];
			local22[3] = local6[3] * local82[0] + local82[3] * local6[4] + local82[6] * local6[5];
			local22[2] = local6[0] * local82[2] + local82[5] * local6[1] + local82[8] * local6[2];
			local22[4] = local82[1] * local6[3] + local6[4] * local82[4] + local82[7] * local6[5];
			local22[6] = local82[6] * local6[8] + local82[0] * local6[6] + local6[7] * local82[3];
			local22[5] = local6[3] * local82[2] + local6[4] * local82[5] + local6[5] * local82[8];
			local22[7] = local82[1] * local6[6] + local82[4] * local6[7] + local6[8] * local82[7];
			local22[8] = local6[8] * local82[8] + local6[6] * local82[2] + local82[5] * local6[7];
		}
		local22[6] *= arg1;
		local22[2] *= arg0;
		local22[1] *= arg0;
		local22[0] *= arg0;
		local22[4] *= arg4;
		local22[3] *= arg4;
		local22[8] *= arg1;
		local22[7] *= arg1;
		local22[5] *= arg4;
		return local22;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V")
	public static void method3373() {
		@Pc(9) int local9 = Static319.aClass4_Sub11_Sub1_2.method4955();
		@Pc(13) int local13 = Static319.aClass4_Sub11_Sub1_2.method4936();
		Static358.anInt6981 = Static319.aClass4_Sub11_Sub1_2.method4916();
		@Pc(21) int local21 = Static319.aClass4_Sub11_Sub1_2.method4938();
		@Pc(30) boolean local30 = Static319.aClass4_Sub11_Sub1_2.method4916() == 1;
		Static364.method5859();
		Static463.method5949(local21);
		Static319.aClass4_Sub11_Sub1_2.method1531();
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static428.anInt8046 >> 3; local44++) {
				for (local48 = 0; local48 < Static119.anInt2717 >> 3; local48++) {
					local55 = Static319.aClass4_Sub11_Sub1_2.method1530(1);
					if (local55 == 1) {
						Static160.anIntArrayArrayArray4[local40][local44][local48] = Static319.aClass4_Sub11_Sub1_2.method1530(26);
					} else {
						Static160.anIntArrayArrayArray4[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static319.aClass4_Sub11_Sub1_2.method1537();
		local44 = (Static186.anInt3680 - Static319.aClass4_Sub11_Sub1_2.anInt5831) / 16;
		Static498.anIntArrayArray55 = new int[local44][4];
		for (local48 = 0; local48 < local44; local48++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static498.anIntArrayArray55[local48][local55] = Static319.aClass4_Sub11_Sub1_2.method4931();
			}
		}
		Static85.aByteArrayArray6 = new byte[local44][];
		Static215.aByteArrayArray13 = null;
		Static542.anIntArray516 = new int[local44];
		Static75.anIntArray18 = new int[local44];
		Static24.aByteArrayArray1 = new byte[local44][];
		Static83.anIntArray82 = null;
		Static407.anIntArray393 = new int[local44];
		Static160.aByteArrayArray10 = new byte[local44][];
		Static172.anIntArray164 = new int[local44];
		Static125.anIntArray128 = new int[local44];
		Static28.aByteArrayArray2 = new byte[local44][];
		local44 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(186) int local186 = 0; local186 < Static428.anInt8046 >> 3; local186++) {
				for (@Pc(190) int local190 = 0; local190 < Static119.anInt2717 >> 3; local190++) {
					@Pc(200) int local200 = Static160.anIntArrayArrayArray4[local55][local186][local190];
					if (local200 != -1) {
						@Pc(209) int local209 = local200 >> 14 & 0x3FF;
						@Pc(215) int local215 = local200 >> 3 & 0x7FF;
						@Pc(225) int local225 = (local209 / 8 << 8) + local215 / 8;
						for (@Pc(227) int local227 = 0; local227 < local44; local227++) {
							if (local225 == Static75.anIntArray18[local227]) {
								local225 = -1;
								break;
							}
						}
						if (local225 != -1) {
							Static75.anIntArray18[local44] = local225;
							@Pc(263) int local263 = local225 >> 8 & 0xFF;
							@Pc(267) int local267 = local225 & 0xFF;
							Static542.anIntArray516[local44] = Static261.aClass176_69.method3998("m" + local263 + "_" + local267);
							Static125.anIntArray128[local44] = Static261.aClass176_69.method3998("l" + local263 + "_" + local267);
							Static407.anIntArray393[local44] = Static261.aClass176_69.method3998("um" + local263 + "_" + local267);
							Static172.anIntArray164[local44] = Static261.aClass176_69.method3998("ul" + local263 + "_" + local267);
							local44++;
						}
					}
				}
			}
		}
		Static285.method5612(local30, 11, local13, local9);
	}
}
