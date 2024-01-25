import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
	public static int anInt5197;

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
	public static int anInt5199;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
	public static int anInt5192 = 0;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "Z")
	public static boolean aBoolean301 = false;

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "Z")
	public static boolean aBoolean302 = true;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
	public static int anInt5194 = 0;

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
	public static int anInt5195 = 127;

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
	public static int anInt5196 = 999999;

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "[I")
	public static final int[] anIntArray419 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray13 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13] };

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!de;Lclient!fb;IZ)V")
	public static void method4396(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class3_Sub35 local9 = new Class3_Sub35();
		local9.anInt4837 = arg1.method3643();
		local9.anInt4834 = arg1.method3642();
		local9.aByteArrayArrayArray11 = new byte[local9.anInt4837][][];
		local9.anIntArray397 = new int[local9.anInt4837];
		local9.anIntArray395 = new int[local9.anInt4837];
		local9.aClass207Array2 = new Class207[local9.anInt4837];
		local9.aClass207Array1 = new Class207[local9.anInt4837];
		local9.anIntArray396 = new int[local9.anInt4837];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt4837; local56++) {
			try {
				@Pc(62) int local62 = arg1.method3643();
				@Pc(87) String local87;
				@Pc(91) String local91;
				@Pc(95) int local95;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local87 = arg1.method3671();
					local91 = arg1.method3671();
					local95 = 0;
					if (local62 == 1) {
						local95 = arg1.method3642();
					}
					local9.anIntArray397[local56] = local62;
					local9.anIntArray396[local56] = local95;
					local9.aClass207Array1[local56] = arg0.method967(local91, Static228.method3975(local87));
				} else if (local62 == 3 || local62 == 4) {
					local87 = arg1.method3671();
					local91 = arg1.method3671();
					local95 = arg1.method3643();
					@Pc(98) String[] local98 = new String[local95];
					for (@Pc(100) int local100 = 0; local100 < local95; local100++) {
						local98[local100] = arg1.method3671();
					}
					@Pc(115) byte[][] local115 = new byte[local95][];
					@Pc(128) int local128;
					if (local62 == 3) {
						for (@Pc(122) int local122 = 0; local122 < local95; local122++) {
							local128 = arg1.method3642();
							local115[local122] = new byte[local128];
							arg1.method3620(local128, local115[local122]);
						}
					}
					local9.anIntArray397[local56] = local62;
					@Pc(157) Class[] local157 = new Class[local95];
					for (local128 = 0; local128 < local95; local128++) {
						local157[local128] = Static228.method3975(local98[local128]);
					}
					local9.aClass207Array2[local56] = arg0.method983(local91, Static228.method3975(local87), local157);
					local9.aByteArrayArrayArray11[local56] = local115;
				}
			} catch (@Pc(232) ClassNotFoundException local232) {
				local9.anIntArray395[local56] = -1;
			} catch (@Pc(239) SecurityException local239) {
				local9.anIntArray395[local56] = -2;
			} catch (@Pc(246) NullPointerException local246) {
				local9.anIntArray395[local56] = -3;
			} catch (@Pc(253) Exception local253) {
				local9.anIntArray395[local56] = -4;
			} catch (@Pc(260) Throwable local260) {
				local9.anIntArray395[local56] = -5;
			}
		}
		Static254.aClass127_26.method3387(local9);
	}
}
