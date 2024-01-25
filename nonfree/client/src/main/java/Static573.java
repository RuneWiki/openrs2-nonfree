import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "Lclient!da;")
	public static Class64 aClass64_15;

	@OriginalMember(owner = "client!uha", name = "f", descriptor = "Lclient!eq;")
	public static Class97 aClass97_139;

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_161 = new Class274(29, -1);

	@OriginalMember(owner = "client!uha", name = "d", descriptor = "[I")
	public static final int[] anIntArray658 = new int[2];

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V")
	public static void method7870() {
		if (Static410.aClass372_1 != null) {
			Static368.aClass349_2 = new Class349();
			Static368.aClass349_2.method8067(Static410.aClass372_1.aClass369_64.method8475(Static377.anInt6756), Static533.aLong246, Static410.aClass372_1.anInt10147, Static410.aClass372_1);
			Static3.aThread1 = new Thread(Static368.aClass349_2, "");
			Static3.aThread1.start();
		}
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(BII)I")
	public static int method7871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static415.anInt7581 == -1) {
			return 1;
		}
		if (arg0 != Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329()) {
			Static346.method5400(Static628.aClass369_13.method8475(Static377.anInt6756), arg0, true);
			if (arg0 != Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329()) {
				return -1;
			}
		}
		try {
			@Pc(41) Dimension local41 = Static147.aCanvas5.getSize();
			Static86.method1555(Static600.aClass87_15, true, Static628.aClass369_13.method8475(Static377.anInt6756), Static428.aClass64_11, Static305.aClass114_29);
			@Pc(57) Class379 local57 = Static614.method8359(Static415.anInt7581, Static625.aClass97_153);
			@Pc(60) long local60 = Static438.method6517();
			Static600.aClass87_15.la();
			Static386.aClass6_27.method6701(0, Static290.anInt5464, 0);
			Static600.aClass87_15.method7896(Static386.aClass6_27);
			Static600.aClass87_15.DA(local41.width / 2, local41.height / 2, 512, 512);
			Static600.aClass87_15.xa(1.0F);
			Static600.aClass87_15.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(101) Class25 local101 = Static600.aClass87_15.method7975(local57, 2048, 64, 64, 768);
			@Pc(103) int local103 = 0;
			label41: for (@Pc(105) int local105 = 0; local105 < 500; local105++) {
				Static600.aClass87_15.GA(0);
				Static600.aClass87_15.ya();
				for (@Pc(113) int local113 = 15; local113 >= 0; local113--) {
					for (@Pc(116) int local116 = 0; local116 <= local113; local116++) {
						Class6_Sub2.lb.method6701((int) ((float) Static312.anInt5690 * (-((float) local113 / 2.0F) + (float) local116)), 0, Static312.anInt5690 * (local113 + 1));
						local101.method7735(Class6_Sub2.lb, null, 0);
						local103++;
						if (Static438.method6517() - local60 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static600.aClass87_15.method7937();
			@Pc(195) long local195 = (long) (local103 * 1000) / (Static438.method6517() - local60);
			Static600.aClass87_15.GA(0);
			Static600.aClass87_15.ya();
			return (int) local195;
		} catch (@Pc(204) Throwable local204) {
			local204.printStackTrace();
			return -1;
		}
	}
}
