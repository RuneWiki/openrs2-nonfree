import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "[Lclient!i;")
	public static Class127[] aClass127Array3;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
	public static void method3984(@OriginalArg(1) int arg0) {
		Static82.anInt9708 = -1;
		if (arg0 == 37) {
			Static157.aFloat72 = 3.0F;
		} else if (arg0 == 50) {
			Static157.aFloat72 = 4.0F;
		} else if (arg0 == 75) {
			Static157.aFloat72 = 6.0F;
		} else if (arg0 == 100) {
			Static157.aFloat72 = 8.0F;
		} else if (arg0 == 200) {
			Static157.aFloat72 = 16.0F;
		}
		Static82.anInt9708 = -1;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Z")
	public static boolean method3985() {
		try {
			return Static424.method7514();
		} catch (@Pc(14) IOException local14) {
			Static318.method4716();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(78) String local78 = "T2 - " + (Static170.aClass123_284 == null ? -1 : Static170.aClass123_284.method3400()) + "," + (Static83.aClass123_63 == null ? -1 : Static83.aClass123_63.method3400()) + "," + (Static269.aClass123_174 == null ? -1 : Static269.aClass123_174.method3400()) + " - " + Static42.anInt1159 + "," + (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray512[0] + Static321.anInt5874) + "," + (Static137.anInt3293 + Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray513[0]) + " - ";
			for (@Pc(80) int local80 = 0; Static42.anInt1159 > local80 && local80 < 50; local80++) {
				local78 = local78 + Static455.aClass3_Sub26_Sub1_2.aByteArray213[local80] + ",";
			}
			Static332.method1390(local19, local78);
			Static218.method6807(false);
			return true;
		}
	}
}
