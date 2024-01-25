import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
	public static int anInt10273;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "Lclient!gm;")
	public static final Class135 aClass135_11 = new Class135("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method8381(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static50.aClass95_1 = arg0;
		Static270.anInt4661 = arg1;
		Static626.aBoolean718 = Static270.anInt4661 > 1 && Static50.aClass95_1.method8001();
		Static571.anInt9216 = 9;
		Static599.anInt7773 = 0x1 << Static571.anInt9216;
		Static579.anInt9391 = Static599.anInt7773 >> 1;
		Math.sqrt((double) (Static579.anInt9391 * Static579.anInt9391 + Static579.anInt9391 * Static579.anInt9391));
		Static247.anInt4367 = 4;
		Static133.anInt2551 = arg2;
		Static155.anInt2874 = arg3;
		Static362.anInt6205 = arg4;
		Static9.aClass151_1 = Static517.method6727();
		Static587.method7788();
		Static416.aClass368ArrayArrayArray3 = new Class368[4][Static133.anInt2551][Static155.anInt2874];
		Static556.aClass35Array2 = new Class35[4];
		if (arg5) {
			Static403.anIntArrayArray59 = new int[Static133.anInt2551][Static155.anInt2874];
			Static510.aByteArrayArray12 = new byte[Static133.anInt2551][Static155.anInt2874];
			Static465.aShortArrayArray8 = new short[Static133.anInt2551][Static155.anInt2874];
			Static195.aClass368ArrayArrayArray1 = new Class368[1][Static133.anInt2551][Static155.anInt2874];
			Static368.aClass35Array1 = new Class35[1];
		} else {
			Static403.anIntArrayArray59 = null;
			Static510.aByteArrayArray12 = null;
			Static465.aShortArrayArray8 = null;
			Static195.aClass368ArrayArrayArray1 = null;
			Static368.aClass35Array1 = null;
		}
		if (arg6) {
			Static231.aLongArrayArrayArray3 = new long[4][arg2][arg3];
			Static192.aClass165Array1 = new Class165[65535];
			Static44.aBooleanArray3 = new boolean[65535];
			Static619.anInt10271 = 0;
		} else {
			Static231.aLongArrayArrayArray3 = null;
			Static192.aClass165Array1 = null;
			Static44.aBooleanArray3 = null;
			Static619.anInt10271 = 0;
		}
		Static224.method3292(false);
		Static368.aClass34_Sub1Array3 = new Class34_Sub1[2];
		Static218.aClass34_Sub1Array2 = new Class34_Sub1[2];
		Static392.aClass34_Sub1Array4 = new Class34_Sub1[2];
		Static137.aClass34_Sub1Array1 = new Class34_Sub1[10000];
		Static194.anInt3515 = 0;
		Static428.aClass34_Sub1Array5 = new Class34_Sub1[5000];
		Static313.anInt9097 = 0;
		Static579.aClass34_Sub1_Sub1Array1 = new Class34_Sub1_Sub1[5000];
		Static23.anInt559 = 0;
		Static375.aBooleanArrayArray6 = new boolean[Static362.anInt6205 + Static362.anInt6205 + 1][Static362.anInt6205 + Static362.anInt6205 + 1];
		Static591.aBooleanArrayArray9 = new boolean[Static362.anInt6205 + Static362.anInt6205 + 2][Static362.anInt6205 + Static362.anInt6205 + 2];
		Static40.anIntArray46 = new int[Static362.anInt6205 + Static362.anInt6205 + 2];
		Static305.aClass255_2 = Static305.aClass255_3;
		if (Static626.aBoolean718) {
			Static30.aBooleanArrayArrayArray2 = new boolean[4][Static362.anInt6205 + Static362.anInt6205 + 1][Static362.anInt6205 + Static362.anInt6205 + 1];
			Static579.aBooleanArrayArrayArray3 = new boolean[4][][];
			if (Static433.aClass298Array6 != null) {
				Static58.method7703();
			}
			Static433.aClass298Array6 = new Class298[Static270.anInt4661];
			Static50.aClass95_1.method8029(Static433.aClass298Array6.length + 1);
			Static50.aClass95_1.method8035(0);
			for (@Pc(205) int local205 = 0; local205 < Static433.aClass298Array6.length; local205++) {
				Static433.aClass298Array6[local205] = new Class298(local205 + 1, Static50.aClass95_1);
				(new Thread(Static433.aClass298Array6[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static270.anInt4661 == 2) {
				local240 = 4;
				Static356.anInt6077 = 2;
			} else if (Static270.anInt4661 == 3) {
				local240 = 6;
				Static356.anInt6077 = 3;
			} else {
				local240 = 8;
				Static356.anInt6077 = 4;
			}
			Static304.aClass283Array1 = new Class283[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static304.aClass283Array1[local260] = new Class283(Static270.aStringArrayArray2[Static270.anInt4661 - 2][local260]);
			}
		} else {
			Static356.anInt6077 = 1;
		}
		Static366.anIntArray331 = new int[Static356.anInt6077 - 1];
		Static141.anIntArray146 = new int[Static356.anInt6077 - 1];
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)S")
	public static short method8383(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(36) int local36 = local19 <= 64 ? local15 * local19 >> 7 : (127 - local19) * local15 >> 7;
		@Pc(47) int local47 = local19 + local36;
		@Pc(58) int local58;
		if (local47 == 0) {
			local58 = local36 << 1;
		} else {
			local58 = (local36 << 8) / local47;
		}
		return (short) (local47 | local9 << 10 | local58 >> 4 << 7);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLclient!ofa;)V")
	public static void method8384(@OriginalArg(1) Class265 arg0) {
		if (arg0.anInt7015 != Static627.anInt10387) {
			return;
		}
		if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aString25 == null) {
			arg0.anInt6988 = 0;
			arg0.anInt7050 = 0;
			return;
		}
		arg0.anInt7030 = 150;
		arg0.anInt7036 = (int) (Math.sin((double) Static122.anInt2190 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt7050 = Static291.anInt4955;
		arg0.anInt7023 = 5;
		arg0.anInt6988 = Static181.method2867(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aString25);
		arg0.anInt7026 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9647;
		arg0.anInt7022 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9653;
		arg0.anInt6979 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9648;
		arg0.anInt7041 = 0;
		@Pc(75) Class239 local75 = arg0.anInt7026 == -1 ? null : Static13.aClass213_1.method5008(arg0.anInt7026);
		if (local75 != null) {
			Static367.method9033(arg0.anInt6979, local75);
		}
	}
}
