import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static671 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_210 = new Class126(26, 0);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)I")
	public static int method8691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static205.anInt3816 == -1) {
			return 1;
		}
		if (arg0 != Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402()) {
			Static141.method2446(Static569.aClass335_14.method7694(Static319.anInt5939), true, arg0);
			if (arg0 != Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402()) {
				return -1;
			}
		}
		try {
			@Pc(39) Dimension local39 = Static469.aCanvas11.getSize();
			Static659.method8584(Static582.aClass16_12, Static117.aClass202_3, Static277.aClass69_9, Static569.aClass335_14.method7694(Static319.anInt5939), true);
			@Pc(55) Class73 local55 = Static573.method7744(Static205.anInt3816, Static21.aClass143_5);
			@Pc(58) long local58 = Static131.method2268();
			Static582.aClass16_12.la();
			Static668.aClass25_9.method4303(0, Static589.anInt9316, 0);
			Static582.aClass16_12.method8135(Static668.aClass25_9);
			Static582.aClass16_12.DA(local39.width / 2, local39.height / 2, 512, 512);
			Static582.aClass16_12.xa(1.0F);
			Static582.aClass16_12.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(99) Class28 local99 = Static582.aClass16_12.method8137(local55, 2048, 64, 64, 768);
			@Pc(101) int local101 = 0;
			label41: for (@Pc(103) int local103 = 0; local103 < 500; local103++) {
				Static582.aClass16_12.GA(0);
				Static582.aClass16_12.ya();
				for (@Pc(112) int local112 = 15; local112 >= 0; local112--) {
					for (@Pc(116) int local116 = 0; local116 <= local112; local116++) {
						Static366.aClass25_4.method4303((int) ((float) Static10.anInt118 * ((float) local116 - (float) local112 / 2.0F)), 0, Static10.anInt118 * (local112 + 1));
						local99.method6908(Static366.aClass25_4, (Class23_Sub4) null, 0);
						local101++;
						if (Static131.method2268() - local58 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static582.aClass16_12.method8127();
			@Pc(178) long local178 = (long) (local101 * 1000) / (Static131.method2268() - local58);
			Static582.aClass16_12.GA(0);
			Static582.aClass16_12.ya();
			return (int) local178;
		} catch (@Pc(192) Throwable local192) {
			local192.printStackTrace();
			return -1;
		}
	}
}
