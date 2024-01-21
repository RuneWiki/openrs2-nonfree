import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "[Lclient!sa;")
	public static Class4_Sub14[] aClass4_Sub14Array2;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "[Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3[] aClass4_Sub3_Sub6_Sub3Array4;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
	public static int anInt1200;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "J")
	public static long aLong44 = 0L;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
	public static int anInt1202 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public static void method678() {
		aClass4_Sub14Array2 = null;
		aClass4_Sub3_Sub6_Sub3Array4 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLclient!c;Lclient!c;)V")
	public static void method679(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class10 arg1) {
		Static127.aClass10_15 = arg0;
		Static25.aClass10_10 = arg1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!od;)Z")
	public static boolean method680(@OriginalArg(1) Class60 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static83.anInt1972; local11++) {
			if (arg0.method1318(Static32.aClass60Array4[local11])) {
				return true;
			}
		}
		return arg0.method1318(Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.aClass60_139);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
	public static void method681() {
		for (@Pc(5) int local5 = 0; local5 < Static9.anInt116; local5++) {
			@Pc(13) int local13 = Static35.anIntArray97[local5];
			@Pc(17) Class4_Sub3_Sub1_Sub2_Sub1 local17 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local13];
			@Pc(21) int local21 = Static96.aClass4_Sub9_Sub1_2.method773();
			if ((local21 & 0x2) != 0) {
				local21 += Static96.aClass4_Sub9_Sub1_2.method773() << 8;
			}
			Static127.method630(local17, local13, local21);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I")
	public static int method682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (arg0 + local7) / arg1 - local7;
	}
}
