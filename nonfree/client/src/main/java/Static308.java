import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!kw", name = "I", descriptor = "J")
	public static long aLong141 = 0L;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method5451(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static194.aClass20_5 = arg0;
		Static149.anInt3867 = arg1;
		Static218.aBoolean365 = Static149.anInt3867 > 1 && Static194.aClass20_5.method7311();
		Static151.anInt3896 = 9;
		Static582.anInt10356 = 0x1 << Static151.anInt3896;
		Static361.anInt7189 = Static582.anInt10356 >> 1;
		Math.sqrt((double) (Static361.anInt7189 * Static361.anInt7189 + Static361.anInt7189 * Static361.anInt7189));
		Static462.anInt8470 = 4;
		Static477.anInt8929 = arg2;
		Static562.anInt10128 = arg3;
		Static177.anInt4273 = arg4;
		Static386.aClass158_1 = Static37.method868();
		Static55.method7080();
		Static281.aClass100ArrayArrayArray1 = new Class100[4][Static477.anInt8929][Static562.anInt10128];
		Static40.aClass65Array2 = new Class65[4];
		if (arg5) {
			Static118.anIntArrayArray13 = new int[Static477.anInt8929][Static562.anInt10128];
			Static98.aByteArrayArray6 = new byte[Static477.anInt8929][Static562.anInt10128];
			Static15.aShortArrayArray1 = new short[Static477.anInt8929][Static562.anInt10128];
			Static283.aClass100ArrayArrayArray2 = new Class100[1][Static477.anInt8929][Static562.anInt10128];
			Static103.aClass65Array3 = new Class65[1];
		} else {
			Static118.anIntArrayArray13 = null;
			Static98.aByteArrayArray6 = null;
			Static15.aShortArrayArray1 = null;
			Static283.aClass100ArrayArrayArray2 = null;
			Static103.aClass65Array3 = null;
		}
		if (arg6) {
			Static423.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static436.aClass300Array1 = new Class300[65535];
			Static475.aBooleanArray26 = new boolean[65535];
			Static102.anInt2851 = 0;
		} else {
			Static423.aLongArrayArrayArray1 = null;
			Static436.aClass300Array1 = null;
			Static475.aBooleanArray26 = null;
			Static102.anInt2851 = 0;
		}
		Static533.method8023(false);
		Static124.aClass3_Sub1Array151 = new Class3_Sub1[2];
		Static548.aClass3_Sub1Array129 = new Class3_Sub1[2];
		Static359.aClass3_Sub1Array94 = new Class3_Sub1[2];
		Static613.aClass3_Sub1Array143 = new Class3_Sub1[10000];
		Static644.anInt11085 = 0;
		Static615.aClass3_Sub1Array145 = new Class3_Sub1[5000];
		Static328.anInt6627 = 0;
		Static20.aClass3_Sub1_Sub3Array1 = new Class3_Sub1_Sub3[5000];
		Static319.anInt6492 = 0;
		Static342.aBooleanArrayArray6 = new boolean[Static177.anInt4273 + Static177.anInt4273 + 1][Static177.anInt4273 + Static177.anInt4273 + 1];
		Static186.aBooleanArrayArray5 = new boolean[Static177.anInt4273 + Static177.anInt4273 + 2][Static177.anInt4273 + Static177.anInt4273 + 2];
		Static432.anIntArray534 = new int[Static177.anInt4273 + Static177.anInt4273 + 2];
		Static292.aClass182_1 = Static292.aClass182_2;
		if (Static218.aBoolean365) {
			Static359.aBooleanArrayArrayArray2 = new boolean[4][Static177.anInt4273 + Static177.anInt4273 + 1][Static177.anInt4273 + Static177.anInt4273 + 1];
			Static327.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static68.aClass366Array1 != null) {
				Static568.method8488();
			}
			Static68.aClass366Array1 = new Class366[Static149.anInt3867];
			Static194.aClass20_5.method7234(Static68.aClass366Array1.length + 1);
			Static194.aClass20_5.method7262(0);
			for (@Pc(205) int local205 = 0; local205 < Static68.aClass366Array1.length; local205++) {
				Static68.aClass366Array1[local205] = new Class366(local205 + 1, Static194.aClass20_5);
				(new Thread(Static68.aClass366Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static149.anInt3867 == 2) {
				local240 = 4;
				Static6.anInt117 = 2;
			} else if (Static149.anInt3867 == 3) {
				local240 = 6;
				Static6.anInt117 = 3;
			} else {
				local240 = 8;
				Static6.anInt117 = 4;
			}
			Static78.aClass59Array1 = new Class59[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static78.aClass59Array1[local260] = new Class59(Static90.aStringArrayArray1[Static149.anInt3867 - 2][local260]);
			}
		} else {
			Static6.anInt117 = 1;
		}
		Static208.anIntArray239 = new int[Static6.anInt117 - 1];
		Static121.anIntArray631 = new int[Static6.anInt117 - 1];
	}
}
