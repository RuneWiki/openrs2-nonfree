import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!laa", name = "rb", descriptor = "Lclient!bt;")
	public static Class34 aClass34_71;

	@OriginalMember(owner = "client!laa", name = "pb", descriptor = "[J")
	public static final long[] aLongArray7 = new long[100];

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method4554(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static246.aClass33_6 = arg0;
		Static290.anInt4589 = arg1;
		Static186.aBoolean244 = Static290.anInt4589 > 1 && Static246.aClass33_6.method8146();
		Static273.anInt4424 = 9;
		Static63.anInt1356 = 0x1 << Static273.anInt4424;
		Static85.anInt1770 = Static63.anInt1356 >> 1;
		Math.sqrt((double) (Static85.anInt1770 * Static85.anInt1770 + Static85.anInt1770 * Static85.anInt1770));
		Static539.anInt8345 = 4;
		Static51.anInt1108 = arg2;
		Static245.anInt7888 = arg3;
		Static112.anInt2200 = arg4;
		Static269.aClass69_1 = Static195.method3026();
		Static531.method7141();
		Static21.aClass73ArrayArrayArray1 = new Class73[4][Static51.anInt1108][Static245.anInt7888];
		Static655.aClass42Array5 = new Class42[4];
		if (arg5) {
			Static32.anIntArrayArray3 = new int[Static51.anInt1108][Static245.anInt7888];
			Static50.aByteArrayArray2 = new byte[Static51.anInt1108][Static245.anInt7888];
			Static392.aShortArrayArray14 = new short[Static51.anInt1108][Static245.anInt7888];
			Static540.aClass73ArrayArrayArray3 = new Class73[1][Static51.anInt1108][Static245.anInt7888];
			Static146.aClass42Array3 = new Class42[1];
		} else {
			Static32.anIntArrayArray3 = null;
			Static50.aByteArrayArray2 = null;
			Static392.aShortArrayArray14 = null;
			Static540.aClass73ArrayArrayArray3 = null;
			Static146.aClass42Array3 = null;
		}
		if (arg6) {
			Static432.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static217.aClass85Array1 = new Class85[65535];
			Static17.aBooleanArray2 = new boolean[65535];
			Static355.anInt5402 = 0;
		} else {
			Static432.aLongArrayArrayArray1 = null;
			Static217.aClass85Array1 = null;
			Static17.aBooleanArray2 = null;
			Static355.anInt5402 = 0;
		}
		Static365.method4835(false);
		Static114.aClass3_Sub1Array1 = new Class3_Sub1[2];
		Static506.aClass3_Sub1Array3 = new Class3_Sub1[2];
		Static596.aClass3_Sub1Array4 = new Class3_Sub1[2];
		Static668.aClass3_Sub1Array5 = new Class3_Sub1[10000];
		Static215.anInt3488 = 0;
		Static269.aClass3_Sub1Array2 = new Class3_Sub1[5000];
		Static522.anInt8084 = 0;
		Static321.aClass3_Sub1_Sub2Array1 = new Class3_Sub1_Sub2[5000];
		Static239.anInt3959 = 0;
		Static537.aBooleanArrayArray32 = new boolean[Static112.anInt2200 + Static112.anInt2200 + 1][Static112.anInt2200 + Static112.anInt2200 + 1];
		Static211.aBooleanArrayArray37 = new boolean[Static112.anInt2200 + Static112.anInt2200 + 2][Static112.anInt2200 + Static112.anInt2200 + 2];
		Static443.anIntArray478 = new int[Static112.anInt2200 + Static112.anInt2200 + 2];
		Static419.aClass223_4 = Static419.aClass223_3;
		if (Static186.aBoolean244) {
			Static444.aBooleanArrayArrayArray1 = new boolean[4][Static112.anInt2200 + Static112.anInt2200 + 1][Static112.anInt2200 + Static112.anInt2200 + 1];
			Static471.aBooleanArrayArrayArray2 = new boolean[4][][];
			if (Static409.aClass10Array1 != null) {
				Static407.method2205();
			}
			Static409.aClass10Array1 = new Class10[Static290.anInt4589];
			Static246.aClass33_6.method8111(Static409.aClass10Array1.length + 1);
			Static246.aClass33_6.method8109(0);
			for (@Pc(205) int local205 = 0; local205 < Static409.aClass10Array1.length; local205++) {
				Static409.aClass10Array1[local205] = new Class10(local205 + 1, Static246.aClass33_6);
				(new Thread(Static409.aClass10Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static290.anInt4589 == 2) {
				local240 = 4;
				Static71.anInt1495 = 2;
			} else if (Static290.anInt4589 == 3) {
				local240 = 6;
				Static71.anInt1495 = 3;
			} else {
				local240 = 8;
				Static71.anInt1495 = 4;
			}
			Static48.aClass394Array1 = new Class394[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static48.aClass394Array1[local260] = new Class394(Static349.aStringArrayArray23[Static290.anInt4589 - 2][local260]);
			}
		} else {
			Static71.anInt1495 = 1;
		}
		Static562.anIntArray614 = new int[Static71.anInt1495 - 1];
		Static405.anIntArray446 = new int[Static71.anInt1495 - 1];
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(III)Z")
	public static boolean method4555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(CI)Z")
	public static boolean method4557(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
