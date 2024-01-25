import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "Lclient!pe;")
	public static Class156 aClass156_1 = new Class156();

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "[I")
	public static final int[] anIntArray508 = new int[50];

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "[I")
	public static final int[] anIntArray509 = new int[32];

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40 = null;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method5180(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static277.anInt5542 >= 100) {
			Static164.method5307(Static278.aString197);
			return;
		}
		@Pc(19) String local19 = Static179.method2989(arg0);
		if (local19 == null) {
			return;
		}
		@Pc(64) String local64;
		for (@Pc(29) int local29 = 0; local29 < Static277.anInt5542; local29++) {
			@Pc(37) String local37 = Static179.method2989(Static152.aStringArray21[local29]);
			if (local37 != null && local37.equals(local19)) {
				Static164.method5307(arg0 + Static165.aString123);
				return;
			}
			if (Static253.aStringArray31[local29] != null) {
				local64 = Static179.method2989(Static253.aStringArray31[local29]);
				if (local64 != null && local64.equals(local19)) {
					Static164.method5307(arg0 + Static165.aString123);
					return;
				}
			}
		}
		for (@Pc(91) int local91 = 0; local91 < Static220.anInt4548; local91++) {
			local64 = Static179.method2989(Static12.aStringArray1[local91]);
			if (local64 != null && local64.equals(local19)) {
				Static164.method5307(Static256.aString183 + arg0 + Static40.aString239);
				return;
			}
			if (Static25.aStringArray5[local91] != null) {
				@Pc(128) String local128 = Static179.method2989(Static25.aStringArray5[local91]);
				if (local128 != null && local128.equals(local19)) {
					Static164.method5307(Static256.aString183 + arg0 + Static40.aString239);
					return;
				}
			}
		}
		if (Static179.method2989(Static349.aClass5_Sub4_Sub4_Sub1_2.aString126).equals(local19)) {
			Static164.method5307(Static167.aString129);
		} else {
			Static291.aClass3_Sub4_Sub2_3.method3682(163);
			Static291.aClass3_Sub4_Sub2_3.method3614(Static54.method909(arg0) + 1);
			Static291.aClass3_Sub4_Sub2_3.method3624(arg0);
			Static291.aClass3_Sub4_Sub2_3.method3614(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIII)I")
	public static int method5181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 255 - arg0;
		@Pc(31) int local31 = ((arg1 & 0xFF00) * arg0 & 0xFF0000 | (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
		return local31 + ((local8 * (arg2 & 0xFF00FF) & 0xFF00FF00 | local8 * (arg2 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIILclient!dm;)V")
	public static void method5182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub2 arg4) {
		arg4.anInt2112 = (arg1 << 7) + 64;
		arg4.anInt2108 = arg3;
		arg4.anInt2116 = (arg2 << 7) + 64;
		@Pc(24) Class45 local24 = Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class160 local31 = local24.aClass160_1; local31 != null; local31 = local31.aClass160_3) {
				if (local31.aClass5_Sub4_1.aBoolean402) {
					@Pc(41) int local41 = local31.aClass5_Sub4_1.method5039();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt2108 += local28;
				arg4.aBoolean107 = true;
			}
		}
		if (Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static128.method2212(arg0, arg1, arg2);
		}
		Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2].aClass5_Sub2_1 = arg4;
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
	public static void method5184() {
		if (Static271.anInt5440 == 0) {
			return;
		}
		try {
			if (++Static272.anInt5451 > 1500) {
				if (Static76.aClass16_2 != null) {
					Static76.aClass16_2.method392();
					Static76.aClass16_2 = null;
				}
				if (Static297.anInt5928 >= 1) {
					Static271.anInt5440 = 0;
					Static84.anInt1683 = -5;
					return;
				}
				Static272.anInt5451 = 0;
				if (Static86.anInt4277 == Static147.anInt2909) {
					Static147.anInt2909 = Static7.anInt203;
				} else {
					Static147.anInt2909 = Static86.anInt4277;
				}
				Static297.anInt5928++;
				Static271.anInt5440 = 1;
			}
			if (Static271.anInt5440 == 1) {
				Static277.aClass207_7 = Static353.aClass42_5.method960(Static147.anInt2909, Static323.aString232);
				Static271.anInt5440 = 2;
			}
			@Pc(119) int local119;
			if (Static271.anInt5440 == 2) {
				if (Static277.aClass207_7.anInt6346 == 2) {
					throw new IOException();
				}
				if (Static277.aClass207_7.anInt6346 != 1) {
					return;
				}
				Static76.aClass16_2 = new Class16((Socket) Static277.aClass207_7.anObject7, Static353.aClass42_5);
				Static277.aClass207_7 = null;
				Static76.aClass16_2.method397(Static291.aClass3_Sub4_Sub2_3.aByteArray70, Static291.aClass3_Sub4_Sub2_3.anInt4268);
				if (Static348.aClass30_2 != null) {
					Static348.aClass30_2.method4515();
				}
				if (Static194.aClass30_1 != null) {
					Static194.aClass30_1.method4515();
				}
				local119 = Static76.aClass16_2.method394();
				if (Static348.aClass30_2 != null) {
					Static348.aClass30_2.method4515();
				}
				if (Static194.aClass30_1 != null) {
					Static194.aClass30_1.method4515();
				}
				if (local119 != 101) {
					Static271.anInt5440 = 0;
					Static84.anInt1683 = local119;
					Static76.aClass16_2.method392();
					Static76.aClass16_2 = null;
					return;
				}
				Static271.anInt5440 = 3;
			}
			if (Static271.anInt5440 == 3 && Static76.aClass16_2.method391() >= 2) {
				local119 = Static76.aClass16_2.method394() << 8 | Static76.aClass16_2.method394();
				Static256.method4302(local119);
				if (Static287.anInt5784 == -1) {
					Static84.anInt1683 = 6;
					Static271.anInt5440 = 0;
					Static76.aClass16_2.method392();
					Static76.aClass16_2 = null;
				} else {
					Static271.anInt5440 = 0;
					Static76.aClass16_2.method392();
					Static76.aClass16_2 = null;
					Static118.method2063();
				}
			}
		} catch (@Pc(199) IOException local199) {
			if (Static76.aClass16_2 != null) {
				Static76.aClass16_2.method392();
				Static76.aClass16_2 = null;
			}
			if (Static297.anInt5928 >= 1) {
				Static271.anInt5440 = 0;
				Static84.anInt1683 = -4;
			} else {
				if (Static147.anInt2909 == Static86.anInt4277) {
					Static147.anInt2909 = Static7.anInt203;
				} else {
					Static147.anInt2909 = Static86.anInt4277;
				}
				Static272.anInt5451 = 0;
				Static297.anInt5928++;
				Static271.anInt5440 = 1;
			}
		}
	}
}
