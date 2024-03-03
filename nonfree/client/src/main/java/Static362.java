import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!ci;IBLjava/awt/Canvas;)Lclient!wm;", line = 4)
	public static Class19 method6438(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2) {
		return new Class19_Sub2(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V", line = 18)
	public static void method6439() {
		try {
			if (Class123.anInt3361 == 1) {
				@Pc(16) int local16 = Static85.aClass2_Sub12_Sub3_1.method4304();
				if (local16 > 0 && Static85.aClass2_Sub12_Sub3_1.method4271()) {
					local16 -= Static27.anInt672;
					if (local16 < 0) {
						local16 = 0;
					}
					Static85.aClass2_Sub12_Sub3_1.method4279(local16);
				} else {
					Static85.aClass2_Sub12_Sub3_1.method4275();
					Static85.aClass2_Sub12_Sub3_1.method4277();
					Static146.aClass2_Sub34_1 = null;
					Static154.aClass24_1 = null;
					if (Static109.aClass197_26 == null) {
						Class123.anInt3361 = 0;
					} else {
						Class123.anInt3361 = 2;
					}
				}
			}
		} catch (@Pc(57) Exception local57) {
			local57.printStackTrace();
			Static85.aClass2_Sub12_Sub3_1.method4275();
			Static154.aClass24_1 = null;
			Class123.anInt3361 = 0;
			Static109.aClass197_26 = null;
			Static146.aClass2_Sub34_1 = null;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZI)V", line = 66)
	public static void method6440(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static106.aClass239_2.method6127(Class124.aClass79_74.method2269(Class197.anInt5569));
		@Pc(24) int local24;
		for (@Pc(18) Class2_Sub5 local18 = (Class2_Sub5) Class92.aClass135_19.method3552(); local18 != null; local18 = (Class2_Sub5) Class92.aClass135_19.method3553()) {
			local24 = Static203.method1096(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Class2_Sub3_Sub24.anInt4949 * 16 + 21;
		@Pc(54) int local54 = arg0 - local13 / 2;
		if (local54 + local13 > Static231.anInt4656) {
			local54 = Static231.anInt4656 - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(77) int local77 = arg1;
		if (Static161.anInt3295 < local24 + arg1) {
			local77 = Static161.anInt3295 - local24;
		}
		if (local77 < 0) {
			local77 = 0;
		}
		Static282.anInt5731 = local54;
		Static100.anInt2217 = local13;
		Static327.anInt6507 = Class2_Sub3_Sub24.anInt4949 * 16 + (Class179.aBoolean371 ? 26 : 22);
		Static338.anInt6788 = local77;
		Class243.aBoolean477 = true;
	}
}
