import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!mt", name = "u", descriptor = "F")
	public static float aFloat157;

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_92 = new Class90(30, 4);

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)V")
	public static void method5119() {
		Static566.method8002();
		Static100.aClass90_34 = null;
		Static595.aClass90_154 = null;
		Static531.anInt9752 = 0;
		Static79.aClass90_29 = null;
		Static488.anInt9250 = 0;
		Static549.aClass4_Sub13_Sub2_2.anInt9170 = 0;
		Static388.anInt7599 = 0;
		Static528.aClass90_133 = null;
		Static329.method7370();
		Static409.method6223();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local30] = null;
		}
		Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 = null;
		for (@Pc(46) int local46 = 0; local46 < Static222.anInt4653; local46++) {
			@Pc(53) Class21_Sub1_Sub1_Sub1_Sub1 local53 = Static590.aClass4_Sub29Array1[local46].aClass21_Sub1_Sub1_Sub1_Sub1_1;
			if (local53 != null) {
				local53.anInt4263 = -1;
			}
		}
		Static501.method7219();
		Static453.anInt8613 = -1;
		Static587.anInt10508 = -1;
		Static300.anInt6053 = 1;
		Static231.method3759(10);
		for (@Pc(79) int local79 = 0; local79 < 100; local79++) {
			Static155.aBooleanArray6[local79] = true;
		}
		Static275.method4452();
		Static221.aLong20 = 0L;
		Static59.aClass4_Sub46_1 = null;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/lang/String;Lclient!ek;I)I")
	public static int method5120(@OriginalArg(0) String arg0, @OriginalArg(1) Class4_Sub13 arg1) {
		@Pc(6) int local6 = arg1.anInt9170;
		@Pc(10) byte[] local10 = Static50.method1169(arg0);
		arg1.method7003(local10.length);
		arg1.anInt9170 += Static180.aClass79_4.method1937(local10.length, local10, arg1.anInt9170, arg1.aByteArray88, 0);
		return arg1.anInt9170 - local6;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!at;)Lclient!lba;")
	public static Class192 method5122(@OriginalArg(1) Class21_Sub1_Sub1 arg0) {
		@Pc(7) Class192 local7;
		if (Static186.aClass192_1 == null) {
			local7 = new Class192();
		} else {
			local7 = Static186.aClass192_1;
			Static186.aClass192_1 = Static186.aClass192_1.aClass192_3;
			Static123.anInt9123--;
			local7.aClass192_3 = null;
		}
		local7.aClass21_Sub1_Sub1_1 = arg0;
		return local7;
	}
}
