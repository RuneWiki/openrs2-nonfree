import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_13 = new Class395(10, 4);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method6308(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class14_Sub19 local17 = Static286.method4081(Static205.aClass394_1, Static56.aClass100_24);
			local17.aClass14_Sub29_Sub1_1.method5854(Static651.method9066(arg0));
			local17.aClass14_Sub29_Sub1_1.method5855(arg0);
			Static576.method8234(local17);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I")
	public static int method6310(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static213.anInt4055 == -1) {
			return 1;
		}
		if (arg0 != Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541()) {
			Static608.method8557(true, Static514.aClass303_15.method7473(Static232.anInt4258), arg0);
			if (arg0 != Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541()) {
				return -1;
			}
		}
		try {
			@Pc(37) Dimension local37 = Static68.aCanvas2.getSize();
			Static88.method8992(Static242.aClass38_5, true, Static677.aClass137_47, Static514.aClass303_15.method7473(Static232.anInt4258), Static586.aClass158_12);
			@Pc(55) Class67 local55 = Static40.method1465(Static577.aClass386_122, Static213.anInt4055);
			@Pc(65) long local65 = Static521.method7499();
			Static677.aClass137_47.la();
			Static551.aClass26_7.method6457(0, Static96.anInt2065, 0);
			Static677.aClass137_47.method7950(Static551.aClass26_7);
			Static677.aClass137_47.DA(local37.width / 2, local37.height / 2, 512, 512);
			Static677.aClass137_47.xa(1.0F);
			Static677.aClass137_47.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(106) Class80 local106 = Static677.aClass137_47.method7901(local55, 2048, 64, 64, 768);
			@Pc(108) int local108 = 0;
			label41: for (@Pc(110) int local110 = 0; local110 < 500; local110++) {
				Static677.aClass137_47.GA(0);
				Static677.aClass137_47.ya();
				for (@Pc(119) int local119 = 15; local119 >= 0; local119--) {
					for (@Pc(123) int local123 = 0; local123 <= local119; local123++) {
						Static491.aClass26_12.method6457((int) ((float) Static222.anInt4166 * (-((float) local119 / 2.0F) + (float) local123)), 0, Static222.anInt4166 * (local119 + 1));
						local106.method6391(Static491.aClass26_12, (Class12_Sub1) null, 0);
						local108++;
						if ((long) arg1 <= Static521.method7499() - local65) {
							break label41;
						}
					}
				}
			}
			Static677.aClass137_47.method7946();
			@Pc(188) long local188 = (long) (local108 * 1000) / (Static521.method7499() - local65);
			Static677.aClass137_47.GA(0);
			Static677.aClass137_47.ya();
			return (int) local188;
		} catch (@Pc(197) Throwable local197) {
			local197.printStackTrace();
			return -1;
		}
	}
}
