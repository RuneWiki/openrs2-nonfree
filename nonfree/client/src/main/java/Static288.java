import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
	public static int anInt5464 = 0;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Z")
	public static boolean method4698(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)I")
	public static int method4701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static456.anInt7803 == -1) {
			return 1;
		}
		if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() != arg0) {
			Static126.method1775(true, Static582.aClass335_14.method8349(Static323.anInt5795), arg0);
			if (arg0 != Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153()) {
				return -1;
			}
		}
		try {
			@Pc(43) Dimension local43 = Static24.aCanvas1.getSize();
			Static299.method1114(true, Static582.aClass335_14.method8349(Static323.anInt5795), Static582.aClass80_12, Static570.aClass224_11, Static457.aClass57_11);
			@Pc(66) Class192 local66 = Static213.method3061(Static635.aClass208_143, Static456.anInt7803);
			@Pc(69) long local69 = Static515.method7499(94);
			Static457.aClass57_11.la();
			Static158.aClass203_4.method8332(0, Static349.anInt6143, 0);
			Static457.aClass57_11.method7657(Static158.aClass203_4);
			Static457.aClass57_11.DA(local43.width / 2, local43.height / 2, 512, 512);
			Static457.aClass57_11.xa(1.0F);
			Static457.aClass57_11.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(110) Class164 local110 = Static457.aClass57_11.method7700(local66, 2048, 64, 64, 768);
			@Pc(112) int local112 = 0;
			label41: for (@Pc(114) int local114 = 0; local114 < 500; local114++) {
				Static457.aClass57_11.GA(0);
				Static457.aClass57_11.ya();
				for (@Pc(125) int local125 = 15; local125 >= 0; local125--) {
					for (@Pc(129) int local129 = 0; local129 <= local125; local129++) {
						Static113.aClass203_3.method8332((int) ((float) Static88.anInt7739 * ((float) local129 - (float) local125 / 2.0F)), 0, (local125 + 1) * Static88.anInt7739);
						local112++;
						local110.method9073(Static113.aClass203_3, (Class8_Sub7) null, 0);
						if (Static515.method7499(113) - local69 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static457.aClass57_11.method7645();
			@Pc(221) long local221 = (long) (local112 * 1000) / (Static515.method7499(115) - local69);
			Static457.aClass57_11.GA(0);
			Static457.aClass57_11.ya();
			return (int) local221;
		} catch (@Pc(232) Throwable local232) {
			local232.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(III)I")
	public static int method4702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0 >>> 24;
		@Pc(31) int local31 = (local13 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local13 & 0xFF0000) >>> 8;
		@Pc(36) int local36 = 255 - local13;
		return local31 + ((local36 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local36 & 0xFF0000) >>> 8);
	}
}
