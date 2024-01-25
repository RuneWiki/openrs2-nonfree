import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!er", name = "f", descriptor = "Lclient!st;")
	public static Class297 aClass297_3;

	@OriginalMember(owner = "client!er", name = "j", descriptor = "I")
	public static int anInt2534;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_32 = new Class98(27, 8);

	@OriginalMember(owner = "client!er", name = "g", descriptor = "I")
	public static int anInt2531 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/String;IIIIJIZLjava/lang/String;BZ)V")
	public static void method2173(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) String arg8, @OriginalArg(10) boolean arg9) {
		if (!Static266.aBoolean351 && Static384.anInt7048 < 500) {
			@Pc(26) int local26 = arg6 == -1 ? Static427.anInt7590 : arg6;
			@Pc(40) Class6_Sub26 local40 = new Class6_Sub26(arg8, arg0, local26, arg2, arg3, arg5, arg1, arg4, arg7, arg9);
			Static408.aClass298_154.method6812(local40);
			Static384.anInt7048++;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public static void method2174() {
		Static340.aClass6_Sub12_Sub2_1.anInt7556 = 0;
		Static446.aClass98_124 = null;
		Static429.aClass6_Sub12_Sub2_2.anInt7556 = 0;
		Static207.anInt3929 = 0;
		Static111.aClass98_28 = null;
		Static144.aClass98_147 = null;
		Static503.anInt8751 = 0;
		Static221.anInt4092 = 0;
		Static84.aClass98_23 = null;
		Static217.method3478();
		Static58.method833();
		for (@Pc(39) int local39 = 0; local39 < 2048; local39++) {
			Static551.aClass15_Sub2_Sub4_Sub2Array1[local39] = null;
		}
		Static461.aClass15_Sub2_Sub4_Sub2_2 = null;
		for (@Pc(53) int local53 = 0; local53 < Static192.anInt3744; local53++) {
			@Pc(60) Class15_Sub2_Sub4_Sub1 local60 = Static324.aClass6_Sub49Array1[local53].aClass15_Sub2_Sub4_Sub1_2;
			if (local60 != null) {
				local60.anInt8927 = -1;
			}
		}
		Static324.method4988();
		Static60.anInt1008 = 1;
		Static436.method6188(10);
		for (@Pc(78) int local78 = 0; local78 < 100; local78++) {
			Static543.aBooleanArray30[local78] = true;
		}
		Static2.method59();
		Static126.aLong42 = 0L;
		Static566.aClass6_Sub16_2 = null;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIZ)I")
	public static int method2177(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class6_Sub46 local8 = Static378.method5549(arg2, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray582.length) {
			return local8.anIntArray582[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	public static void method2178() {
		@Pc(5) Class330 local5 = Static129.aClass330_17;
		synchronized (Static129.aClass330_17) {
			Static129.aClass330_17.method7688();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)Z")
	public static boolean method2179(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static277.method4167(arg0, arg1) & Static483.method6799(arg0, arg1);
	}
}
