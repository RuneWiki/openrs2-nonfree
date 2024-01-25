import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
	public static int anInt4127;

	@OriginalMember(owner = "client!lq", name = "E", descriptor = "Lclient!nj;")
	public static Class181 aClass181_16 = new Class181();

	@OriginalMember(owner = "client!lq", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString35 = null;

	@OriginalMember(owner = "client!lq", name = "L", descriptor = "[I")
	public static final int[] anIntArray379 = new int[32];

	@OriginalMember(owner = "client!lq", name = "M", descriptor = "[I")
	public static final int[] anIntArray380 = new int[3];

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B[B)Z")
	public static boolean method3348(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub17 local8 = new Class2_Sub17(arg0);
		@Pc(14) int local14 = local8.method6138();
		if (local14 != 2) {
			return false;
		}
		@Pc(30) boolean local30 = local8.method6138() == 1;
		if (local30) {
			Static170.method2520(local8);
		}
		Static54.method897(local8);
		return true;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method3350(@OriginalArg(0) Class75 arg0) {
		arg0.ba(0, 0, Static49.anInt789, 350);
		arg0.P(0, 0, Static49.anInt789, 350, Static300.anInt5409 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static32.anInt7620;
		@Pc(36) int local36;
		if (Static275.anInt4981 > 0) {
			local36 = 342 - Static32.anInt7620;
			@Pc(47) int local47 = local27 * local36 / (local27 + Static275.anInt4981 - 1);
			@Pc(49) int local49 = 4;
			if (Static275.anInt4981 > 1) {
				local49 = (local36 - local47) * (Static275.anInt4981 + -1 + -Static142.anInt2604) / (Static275.anInt4981 - 1) + 4;
			}
			arg0.P(Static49.anInt789 - 16, local49, 12, local47, Static300.anInt5409 << 24 | 0x332277, 2);
			for (@Pc(88) int local88 = Static142.anInt2604; local88 < local27 + Static142.anInt2604 && Static275.anInt4981 > local88; local88++) {
				@Pc(97) String[] local97 = Static305.method172(Static20.aStringArray8[local88], '\b');
				@Pc(106) int local106 = (Static49.anInt789 - 8 - 16) / local97.length;
				for (@Pc(108) int local108 = 0; local108 < local97.length; local108++) {
					@Pc(116) int local116 = local108 * local106 + 8;
					arg0.ba(local116, 0, local106 + local116 - 8, 350);
					Static11.aClass14_1.method4886(-1, -16777216, local97[local108], local116, 348 - Static419.anInt7184 - Static458.aClass15_11.anInt318 - (local88 - Static142.anInt2604) * Static32.anInt7620);
				}
			}
		}
		arg0.ba(0, 0, Static49.anInt789, 350);
		arg0.method6022(350 - Static419.anInt7184, -1, 0, Static49.anInt789);
		Static143.aClass14_2.method4886(-1, -16777216, "--> " + Static216.aString73, 10, 350 - Static9.aClass15_9.anInt318 - 1);
		local36 = -1;
		if (Static277.anInt5022 % 30 > 15) {
			local36 = 16777215;
		}
		arg0.method5976(12, Static9.aClass15_9.method320("--> " + Static216.aString73.substring(0, Static243.anInt4160)) + 10, local36, 350 - Static9.aClass15_9.anInt318 - 11);
	}
}
