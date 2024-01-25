import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fka", name = "F", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_64 = new Class44(9, 3);

	@OriginalMember(owner = "client!fka", name = "N", descriptor = "[I")
	public static final int[] anIntArray267 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!fka", name = "O", descriptor = "Lclient!bg;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(BLclient!td;ILclient!so;)V")
	public static void method2650(@OriginalArg(1) Class333 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14_Sub29 arg2) {
		@Pc(9) Class14_Sub28 local9 = new Class14_Sub28();
		local9.anInt4734 = arg2.method5866();
		local9.anInt4733 = arg2.method5878();
		local9.aClass150Array2 = new Class150[local9.anInt4734];
		local9.anIntArray382 = new int[local9.anInt4734];
		local9.anIntArray381 = new int[local9.anInt4734];
		local9.aClass150Array1 = new Class150[local9.anInt4734];
		local9.aByteArrayArrayArray8 = new byte[local9.anInt4734][][];
		local9.anIntArray380 = new int[local9.anInt4734];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt4734; local56++) {
			try {
				@Pc(62) int local62 = arg2.method5866();
				@Pc(87) String local87;
				@Pc(91) String local91;
				@Pc(95) int local95;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local87 = arg2.method5898();
					local91 = arg2.method5898();
					local95 = 0;
					if (local62 == 1) {
						local95 = arg2.method5878();
					}
					local9.anIntArray382[local56] = local62;
					local9.anIntArray381[local56] = local95;
					local9.aClass150Array1[local56] = arg0.method8142(local91, Static60.method1231(local87));
				} else if (local62 == 3 || local62 == 4) {
					local87 = arg2.method5898();
					local91 = arg2.method5898();
					local95 = arg2.method5866();
					@Pc(98) String[] local98 = new String[local95];
					for (@Pc(100) int local100 = 0; local100 < local95; local100++) {
						local98[local100] = arg2.method5898();
					}
					@Pc(115) byte[][] local115 = new byte[local95][];
					@Pc(126) int local126;
					if (local62 == 3) {
						for (@Pc(120) int local120 = 0; local120 < local95; local120++) {
							local126 = arg2.method5878();
							local115[local120] = new byte[local126];
							arg2.method5860(local115[local120], 0, local126);
						}
					}
					local9.anIntArray382[local56] = local62;
					@Pc(151) Class[] local151 = new Class[local95];
					for (local126 = 0; local126 < local95; local126++) {
						local151[local126] = Static60.method1231(local98[local126]);
					}
					local9.aClass150Array2[local56] = arg0.method8149(local151, Static60.method1231(local87), local91);
					local9.aByteArrayArrayArray8[local56] = local115;
				}
			} catch (@Pc(232) ClassNotFoundException local232) {
				local9.anIntArray380[local56] = -1;
			} catch (@Pc(239) SecurityException local239) {
				local9.anIntArray380[local56] = -2;
			} catch (@Pc(246) NullPointerException local246) {
				local9.anIntArray380[local56] = -3;
			} catch (@Pc(253) Exception local253) {
				local9.anIntArray380[local56] = -4;
			} catch (@Pc(260) Throwable local260) {
				local9.anIntArray380[local56] = -5;
			}
		}
		Static663.aClass262_75.method6314(local9);
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(IIIIIIBLjava/lang/String;)V")
	public static void method2651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) String arg6) {
		@Pc(7) Class12_Sub5 local7 = new Class12_Sub5();
		local7.anInt4125 = arg5;
		local7.aString47 = arg6;
		local7.anInt4127 = arg3;
		local7.anInt4128 = arg1;
		local7.anInt4124 = arg4;
		local7.anInt4129 = arg2;
		local7.anInt4130 = arg0 + Static87.anInt1951;
		Static239.aClass376_4.method9011(local7);
	}
}
