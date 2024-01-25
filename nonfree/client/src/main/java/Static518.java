import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!tt", name = "L", descriptor = "Lclient!jn;")
	public static Class176 aClass176_127;

	@OriginalMember(owner = "client!tt", name = "G", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_202 = new Class362(91, 10);

	@OriginalMember(owner = "client!tt", name = "H", descriptor = "I")
	public static int anInt9302 = 0;

	@OriginalMember(owner = "client!tt", name = "S", descriptor = "[I")
	public static final int[] anIntArray501 = new int[3];

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(I)V")
	public static void method7583() {
		Static341.method5551();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method7584(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(30) char local30 = arg0.charAt(local12);
			if (local30 >= 'A' && local30 <= 'Z') {
				local7 += local30 - 64;
			} else if (local30 >= 'a' && local30 <= 'z') {
				local7 += local30 + 1 - 97;
			} else if (local30 >= '0' && local30 <= '9') {
				local7 += local30 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(B)V")
	public static void method7585() {
		Static145.method2782();
		Static257.aClass362_105 = null;
		Static186.anInt3680 = 0;
		Static400.aClass362_168 = null;
		Static401.aClass362_169 = null;
		Static454.anInt8310 = 0;
		Static319.aClass4_Sub11_Sub1_2.anInt5831 = 0;
		Static395.anInt7584 = 0;
		Static370.aClass362_153 = null;
		Static428.method6709();
		Static220.method3591();
		for (@Pc(34) int local34 = 0; local34 < 2048; local34++) {
			Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local34] = null;
		}
		Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 = null;
		for (@Pc(48) int local48 = 0; local48 < Static436.anInt8163; local48++) {
			@Pc(55) Class1_Sub4_Sub2_Sub1_Sub1 local55 = Static457.aClass4_Sub4Array1[local48].aClass1_Sub4_Sub2_Sub1_Sub1_1;
			if (local55 != null) {
				local55.anInt8405 = -1;
			}
		}
		Static82.method1375();
		Static166.anInt3419 = 1;
		Static214.anInt3969 = -1;
		Static326.anInt6302 = -1;
		Static285.method5604(10);
		for (@Pc(81) int local81 = 0; local81 < 100; local81++) {
			Static261.aBooleanArray18[local81] = true;
		}
		Static186.method3294();
		Static484.aClass4_Sub42_2 = null;
		Static406.aLong201 = 0L;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIZ)V")
	public static void method7586(@OriginalArg(3) boolean arg0) {
		Static161.aBoolean31 = arg0;
		Static262.anInt5047 = 22050;
		Static354.anInt6884 = 2;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(Z)V")
	public static void method7588() {
		if (Static587.anInt10158 == 6) {
			Static587.anInt10158 = 7;
		}
	}
}
