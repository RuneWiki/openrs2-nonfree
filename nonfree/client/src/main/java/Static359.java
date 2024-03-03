import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "Lclient!od;")
	public static Class2_Sub12_Sub3 aClass2_Sub12_Sub3_3;

	@OriginalMember(owner = "client!wi", name = "y", descriptor = "Lclient!ha;")
	public static Class2_Sub16 aClass2_Sub16_2;

	@OriginalMember(owner = "client!wi", name = "z", descriptor = "Lclient!r;")
	public static Class197 aClass197_94;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(III)I", line = 3)
	public static int method6430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Class197.anIntArray375[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLclient!oo;)V", line = 23)
	public static void method6431(@OriginalArg(1) Class12_Sub6 arg0) {
		arg0.aClass11_Sub5_Sub2_1 = null;
		if (Class191.anInt5362 < 20) {
			Class11_Sub5_Sub4.aClass36_9.method1420(arg0);
			Class191.anInt5362++;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)V", line = 63)
	public static void method6433(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Class83.anInt2345 - Class165.anInt4438;
		if (local8 >= 100) {
			Static291.anInt5899 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Class28.aFloat27;
		if (Class66.anInt1883 >> 8 > local19) {
			local19 = Class66.anInt1883 >> 8;
		}
		if (Class132.aBooleanArray33[4] && local19 < Class2_Sub3_Sub11.anIntArray134[4] + 128) {
			local19 = Class2_Sub3_Sub11.anIntArray134[4] + 128;
		}
		@Pc(53) int local53 = (int) Class187.aFloat66 + Class11_Sub4.anInt3961 & 0x3FFF;
		Static324.method5834((local19 >> 3) * 3 + 600, Static265.anInt5451, arg0, Static360.method6033(Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768, Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770, Static330.anInt6573) - 50, Static58.anInt2392, local53, local19);
		@Pc(96) float local96 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static197.anInt3773 = (int) (local96 * (float) (Static197.anInt3773 - Static183.anInt3314) + (float) Static183.anInt3314);
		Static127.anInt6765 = (int) ((float) Static99.anInt2215 + local96 * (float) (Static127.anInt6765 - Static99.anInt2215));
		Static95.anInt3588 = (int) (local96 * (float) (Static95.anInt3588 - Static5.anInt105) + (float) Static5.anInt105);
		Static244.anInt4847 = (int) ((float) Static214.anInt4066 + local96 * (float) (Static244.anInt4847 - Static214.anInt4066));
		@Pc(151) int local151 = Static4.anInt87 - Static250.anInt5013;
		if (local151 > 8192) {
			local151 -= 16384;
		} else if (local151 < -8192) {
			local151 += 16384;
		}
		Static4.anInt87 = (int) ((float) Static250.anInt5013 + (float) local151 * local96);
		Static4.anInt87 &= 0x3FFF;
	}
}
