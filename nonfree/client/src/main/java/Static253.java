import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!im", name = "g", descriptor = "I")
	public static int anInt4353;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method3647(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static576.aClass132_15 = arg0;
		Static140.anInt2434 = arg1;
		Static251.aBoolean272 = Static140.anInt2434 > 1 && Static576.aClass132_15.method7445();
		Static185.anInt3178 = 9;
		Static655.anInt10510 = 0x1 << Static185.anInt3178;
		Static625.anInt10177 = Static655.anInt10510 >> 1;
		Math.sqrt((double) (Static625.anInt10177 * Static625.anInt10177 + Static625.anInt10177 * Static625.anInt10177));
		Static633.anInt10310 = 4;
		Static209.anInt3602 = arg2;
		Static245.anInt4308 = arg3;
		Static514.anInt8546 = arg4;
		Static623.aClass13_1 = Static360.method8246();
		Static628.method8636();
		Static611.aClass351ArrayArrayArray2 = new Class351[4][Static209.anInt3602][Static245.anInt4308];
		Static64.aClass12Array1 = new Class12[4];
		if (arg5) {
			Static161.anIntArrayArray14 = new int[Static209.anInt3602][Static245.anInt4308];
			Static312.aByteArrayArray25 = new byte[Static209.anInt3602][Static245.anInt4308];
			Static225.aShortArrayArray13 = new short[Static209.anInt3602][Static245.anInt4308];
			Static661.aClass351ArrayArrayArray3 = new Class351[1][Static209.anInt3602][Static245.anInt4308];
			Static68.aClass12Array2 = new Class12[1];
		} else {
			Static161.anIntArrayArray14 = null;
			Static312.aByteArrayArray25 = null;
			Static225.aShortArrayArray13 = null;
			Static661.aClass351ArrayArrayArray3 = null;
			Static68.aClass12Array2 = null;
		}
		if (arg6) {
			Static371.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static193.aClass394Array1 = new Class394[65535];
			Static223.aBooleanArray11 = new boolean[65535];
			Static390.anInt6562 = 0;
		} else {
			Static371.aLongArrayArrayArray1 = null;
			Static193.aClass394Array1 = null;
			Static223.aBooleanArray11 = null;
			Static390.anInt6562 = 0;
		}
		Static546.method7770(false);
		Static229.aClass2_Sub1Array2 = new Class2_Sub1[2];
		Static643.aClass2_Sub1Array5 = new Class2_Sub1[2];
		Static512.aClass2_Sub1Array4 = new Class2_Sub1[2];
		Static370.aClass2_Sub1Array3 = new Class2_Sub1[10000];
		Static241.anInt4291 = 0;
		Static15.aClass2_Sub1Array1 = new Class2_Sub1[5000];
		Static335.anInt5753 = 0;
		Static493.aClass2_Sub1_Sub1Array1 = new Class2_Sub1_Sub1[5000];
		Static25.anInt3151 = 0;
		Static443.aBooleanArrayArray8 = new boolean[Static514.anInt8546 + Static514.anInt8546 + 1][Static514.anInt8546 + Static514.anInt8546 + 1];
		Static349.aBooleanArrayArray7 = new boolean[Static514.anInt8546 + Static514.anInt8546 + 2][Static514.anInt8546 + Static514.anInt8546 + 2];
		Static328.anIntArray603 = new int[Static514.anInt8546 + Static514.anInt8546 + 2];
		Static663.aClass115_12 = Static663.aClass115_13;
		if (Static251.aBoolean272) {
			Static597.aBooleanArrayArrayArray2 = new boolean[4][Static514.anInt8546 + Static514.anInt8546 + 1][Static514.anInt8546 + Static514.anInt8546 + 1];
			Static71.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static47.aClass329Array1 != null) {
				Static642.method8766();
			}
			Static47.aClass329Array1 = new Class329[Static140.anInt2434];
			Static576.aClass132_15.method7486(Static47.aClass329Array1.length + 1);
			Static576.aClass132_15.method7497(0);
			for (@Pc(205) int local205 = 0; local205 < Static47.aClass329Array1.length; local205++) {
				Static47.aClass329Array1[local205] = new Class329(local205 + 1, Static576.aClass132_15);
				(new Thread(Static47.aClass329Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static140.anInt2434 == 2) {
				local240 = 4;
				Static564.anInt9384 = 2;
			} else if (Static140.anInt2434 == 3) {
				local240 = 6;
				Static564.anInt9384 = 3;
			} else {
				local240 = 8;
				Static564.anInt9384 = 4;
			}
			Static364.aClass40Array1 = new Class40[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static364.aClass40Array1[local260] = new Class40(Static520.aStringArrayArray3[Static140.anInt2434 - 2][local260]);
			}
		} else {
			Static564.anInt9384 = 1;
		}
		Static258.anIntArray259 = new int[Static564.anInt9384 - 1];
		Static506.anIntArray556 = new int[Static564.anInt9384 - 1];
	}
}
