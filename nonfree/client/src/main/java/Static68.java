import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZLclient!et;)Lclient!et;")
	public static Class91 method1682(@OriginalArg(1) Class91 arg0) {
		if (arg0.anInt2375 != -1) {
			return Static384.method6156(arg0.anInt2375);
		}
		@Pc(20) int local20 = arg0.anInt2368 >>> 16;
		@Pc(30) Class239 local30 = new Class239(Static362.aClass230_45);
		for (@Pc(35) Class1_Sub35 local35 = (Class1_Sub35) local30.method6256(); local35 != null; local35 = (Class1_Sub35) local30.method6258()) {
			if (local35.anInt5502 == local20) {
				return Static384.method6156((int) local35.aLong251);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method1683(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static275.anInt5260 = 7;
		Static382.anInt6794 = 0x1 << Static275.anInt5260;
		Static270.anInt5197 = Static382.anInt6794 >> 1;
		Static360.anInt6513 = (int) Math.sqrt((double) (Static270.anInt5197 * Static270.anInt5197 + Static270.anInt5197 * Static270.anInt5197));
		Static194.anInt3975 = Static382.anInt6794 >> 2;
		Static289.anInt5544 = Static382.anInt6794;
		Static501.anInt9458 = arg0;
		Static420.anInt7323 = arg1;
		Static466.anInt8044 = arg2;
		Static61.aClass64ArrayArrayArray2 = new Class64[4][Static501.anInt9458][Static420.anInt7323];
		Static411.aClass7Array12 = new Class7[4];
		if (arg3) {
			Static523.anIntArrayArray120 = new int[Static501.anInt9458][Static420.anInt7323];
			Static278.aByteArrayArray16 = new byte[Static501.anInt9458][Static420.anInt7323];
			Static200.aShortArrayArray3 = new short[Static501.anInt9458][Static420.anInt7323];
			Static15.aClass64ArrayArrayArray1 = new Class64[1][Static501.anInt9458][Static420.anInt7323];
			Static207.aClass7Array7 = new Class7[1];
		} else {
			Static523.anIntArrayArray120 = null;
			Static278.aByteArrayArray16 = null;
			Static200.aShortArrayArray3 = null;
			Static15.aClass64ArrayArrayArray1 = null;
			Static207.aClass7Array7 = null;
		}
		if (arg4) {
			Static8.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static102.aClass108Array1 = new Class108[65535];
			Static179.aBooleanArray11 = new boolean[65535];
			Static5.anInt146 = 0;
		} else {
			Static8.aLongArrayArrayArray1 = null;
			Static102.aClass108Array1 = null;
			Static179.aBooleanArray11 = null;
			Static5.anInt146 = 0;
		}
		Static355.method5829(false);
		Static220.aClass192Array2 = new Class192[1000];
		Static84.anInt1919 = 0;
		Static79.aClass192Array1 = new Class192[1000];
		Static349.anInt6412 = 0;
		Static232.anIntArrayArrayArray11 = new int[4][Static501.anInt9458 + 1][Static420.anInt7323 + 1];
		Static227.aClass20_Sub1Array3 = new Class20_Sub1[5000];
		Static316.anInt6013 = 0;
		Static38.aBooleanArrayArray1 = new boolean[Static466.anInt8044 + Static466.anInt8044 + 1][Static466.anInt8044 + Static466.anInt8044 + 1];
		Static442.aBooleanArrayArray10 = new boolean[Static466.anInt8044 + Static466.anInt8044 + 2][Static466.anInt8044 + Static466.anInt8044 + 2];
		Static164.aClass40_1 = null;
	}
}
