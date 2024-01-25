import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
	public static int anInt5230;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "Lclient!hk;")
	public static Class155 aClass155_14;

	@OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
	public static int anInt5246;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	public static void method4716() {
		@Pc(7) int local7 = Static274.anInt4921;
		@Pc(9) int[] local9 = Static605.anIntArray544;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class4_Sub1_Sub1_Sub2_Sub1 local19 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static146.method2738(local19.method5932(), local19);
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method4724(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static44.aClass100_1 = arg0;
		Static549.anInt8710 = arg1;
		Static205.aBoolean259 = Static549.anInt8710 > 1 && Static44.aClass100_1.method8611();
		Static314.anInt5377 = 9;
		Static492.anInt7972 = 0x1 << Static314.anInt5377;
		Static377.anInt6337 = Static492.anInt7972 >> 1;
		Math.sqrt((double) (Static377.anInt6337 * Static377.anInt6337 + Static377.anInt6337 * Static377.anInt6337));
		Static237.anInt4100 = 4;
		Static672.anInt10829 = arg2;
		Static532.anInt8517 = arg3;
		Static553.anInt8738 = arg4;
		Static147.aClass77_1 = Static194.method8967();
		Static380.method5640();
		Static451.aClass128ArrayArrayArray2 = new Class128[4][Static672.anInt10829][Static532.anInt8517];
		Static668.aClass84Array4 = new Class84[4];
		if (arg5) {
			Static503.anIntArrayArray57 = new int[Static672.anInt10829][Static532.anInt8517];
			Static220.aByteArrayArray10 = new byte[Static672.anInt10829][Static532.anInt8517];
			Static206.aShortArrayArray11 = new short[Static672.anInt10829][Static532.anInt8517];
			Static681.aClass128ArrayArrayArray3 = new Class128[1][Static672.anInt10829][Static532.anInt8517];
			Static77.aClass84Array1 = new Class84[1];
		} else {
			Static503.anIntArrayArray57 = null;
			Static220.aByteArrayArray10 = null;
			Static206.aShortArrayArray11 = null;
			Static681.aClass128ArrayArrayArray3 = null;
			Static77.aClass84Array1 = null;
		}
		if (arg6) {
			Static680.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static665.aClass204Array3 = new Class204[65535];
			Static488.aBooleanArray22 = new boolean[65535];
			Static257.anInt4639 = 0;
		} else {
			Static680.aLongArrayArrayArray1 = null;
			Static665.aClass204Array3 = null;
			Static488.aBooleanArray22 = null;
			Static257.anInt4639 = 0;
		}
		Static130.method1928(false);
		Static623.aClass4_Sub1Array11 = new Class4_Sub1[2];
		Static194.aClass4_Sub1Array13 = new Class4_Sub1[2];
		Static321.aClass4_Sub1Array5 = new Class4_Sub1[2];
		Static552.aClass4_Sub1Array10 = new Class4_Sub1[10000];
		Static347.anInt5727 = 0;
		Static388.aClass4_Sub1Array8 = new Class4_Sub1[5000];
		Static574.anInt8994 = 0;
		Static414.aClass4_Sub1_Sub1Array1 = new Class4_Sub1_Sub1[5000];
		Static107.anInt1735 = 0;
		Static407.aBooleanArrayArray8 = new boolean[Static553.anInt8738 + Static553.anInt8738 + 1][Static553.anInt8738 + Static553.anInt8738 + 1];
		Static241.aBooleanArrayArray5 = new boolean[Static553.anInt8738 + Static553.anInt8738 + 2][Static553.anInt8738 + Static553.anInt8738 + 2];
		Static112.anIntArray98 = new int[Static553.anInt8738 + Static553.anInt8738 + 2];
		Static605.aClass321_3 = Static605.aClass321_2;
		if (Static205.aBoolean259) {
			Static115.aBooleanArrayArrayArray1 = new boolean[4][Static553.anInt8738 + Static553.anInt8738 + 1][Static553.anInt8738 + Static553.anInt8738 + 1];
			Static637.aBooleanArrayArrayArray3 = new boolean[4][][];
			if (Static312.aClass291Array1 != null) {
				Static676.method9165();
			}
			Static312.aClass291Array1 = new Class291[Static549.anInt8710];
			Static44.aClass100_1.method8662(Static312.aClass291Array1.length + 1);
			Static44.aClass100_1.method8608(0);
			for (@Pc(214) int local214 = 0; local214 < Static312.aClass291Array1.length; local214++) {
				Static312.aClass291Array1[local214] = new Class291(local214 + 1, Static44.aClass100_1);
				(new Thread(Static312.aClass291Array1[local214], "wr" + local214)).start();
			}
			@Pc(253) byte local253;
			if (Static549.anInt8710 == 2) {
				local253 = 4;
				Static165.anInt3244 = 2;
			} else if (Static549.anInt8710 == 3) {
				local253 = 6;
				Static165.anInt3244 = 3;
			} else {
				local253 = 8;
				Static165.anInt3244 = 4;
			}
			Static57.aClass287Array1 = new Class287[local253];
			for (@Pc(273) int local273 = 0; local273 < local253; local273++) {
				Static57.aClass287Array1[local273] = new Class287(Static496.aStringArrayArray1[Static549.anInt8710 - 2][local273]);
			}
		} else {
			Static165.anInt3244 = 1;
		}
		Static349.anIntArray335 = new int[Static165.anInt3244 - 1];
		Static288.anIntArray296 = new int[Static165.anInt3244 - 1];
	}
}
