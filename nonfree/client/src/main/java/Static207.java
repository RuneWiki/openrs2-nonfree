import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_58 = new Class218(6, -2);

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)V")
	public static void method4077(@OriginalArg(0) int arg0) {
		Static128.anInt3197 = -1;
		Static479.anInt8544 = 100;
		Static134.anInt3480 = arg0;
		Static473.anInt8493 = 3;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
	public static int method4079(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
	public static void method4080() {
		for (@Pc(14) Class3_Sub38 local14 = (Class3_Sub38) Static165.aClass276_29.method6907(); local14 != null; local14 = (Class3_Sub38) Static165.aClass276_29.method6912()) {
			if (local14.anInt8087 > 0) {
				local14.anInt8087--;
			}
			if (local14.anInt8087 != 0) {
				if (local14.anInt8094 > 0) {
					local14.anInt8094--;
				}
				if (local14.anInt8094 == 0 && local14.anInt8095 >= 1 && local14.anInt8088 >= 1 && Static394.anInt7540 - 2 >= local14.anInt8095 && local14.anInt8088 <= Static462.anInt8391 - 2 && (local14.anInt8085 < 0 || Static255.method4808(local14.anInt8085, local14.anInt8093))) {
					Static567.method7984(local14.anInt8089, local14.anInt8093, local14.anInt8088, local14.anInt8095, -1, local14.anInt8086, local14.anInt8096, local14.anInt8085);
					local14.anInt8094 = -1;
					if (local14.anInt8092 == local14.anInt8085 && local14.anInt8092 == -1) {
						local14.method8671();
					} else if (local14.anInt8085 == local14.anInt8092 && local14.anInt8098 == local14.anInt8089 && local14.anInt8093 == local14.anInt8097) {
						local14.method8671();
					}
				}
			} else if (local14.anInt8092 < 0 || Static255.method4808(local14.anInt8092, local14.anInt8097)) {
				Static567.method7984(local14.anInt8098, local14.anInt8097, local14.anInt8088, local14.anInt8095, -1, local14.anInt8086, local14.anInt8096, local14.anInt8092);
				local14.method8671();
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!kha;Z)V")
	public static void method4081(@OriginalArg(0) Class181 arg0) {
		Static397.anInt7604 = arg0.method5033("p11_full");
		Static151.anInt3728 = arg0.method5033("p12_full");
		Static42.anInt765 = arg0.method5033("b12_full");
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public static void method4082() {
		Static393.anIntArray157 = null;
		Static224.anIntArray291 = null;
		Static148.anIntArray193 = null;
		Static572.aBoolean807 = false;
		Static568.anIntArray588 = null;
		Static365.anIntArray409 = null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
	public static void method4083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static67.aClass33_5 == null) {
			return;
		}
		@Pc(10) int local10 = Static87.anInt2288;
		@Pc(12) int local12 = Static158.anInt3847;
		Static64.method8136(arg1, arg0);
		if (Static178.anInt4220 == 0) {
			Static470.anInterface16_4 = null;
			Static470.anInterface16_4 = Static67.aClass33_5.method6211(Static67.aClass33_5.method6213(Static273.anInt5828, Static211.anInt4905), Static67.aClass33_5.method6169(Static273.anInt5828, Static211.anInt4905));
		} else if (Static178.anInt4220 == 1 && (Static235.anInterface16Array1 == null || local10 != Static87.anInt2288 || Static158.anInt3847 != local12)) {
			Static235.anInterface16Array1 = new Interface16[Static87.anInt2288 * Static158.anInt3847];
			for (@Pc(50) int local50 = 0; local50 < Static235.anInterface16Array1.length; local50++) {
				Static235.anInterface16Array1[local50] = Static67.aClass33_5.method6211(Static67.aClass33_5.method6213(Static246.anInt5504, Static584.anInt9762), Static67.aClass33_5.method6169(Static246.anInt5504, Static584.anInt9762));
			}
			Static451.anInt8203 = 1;
			Static295.anIntArray349 = new int[Static158.anInt3847 * Static87.anInt2288];
		}
		Static160.aBoolean330 = true;
	}
}
