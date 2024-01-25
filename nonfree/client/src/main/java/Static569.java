import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!bca;")
	public static final Class27 aClass27_6 = new Class27();

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	public static int anInt7524 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZI)I")
	public static int method6634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static334.anInt5798 == -1) {
			return 1;
		}
		if (arg0 != Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289()) {
			Static23.method494(arg0, Static76.aClass58_14.method1237(Static321.anInt5554), true);
			if (arg0 != Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289()) {
				return -1;
			}
		}
		try {
			@Pc(35) Dimension local35 = Static181.aCanvas3.getSize();
			Static237.method3641(Static530.aClass298_13, Static437.aClass6_11, Static485.aClass126_17, true, Static76.aClass58_14.method1237(Static321.anInt5554));
			@Pc(51) Class349 local51 = Static277.method4157(Static107.aClass384_33, Static334.anInt5798);
			@Pc(54) long local54 = Static205.method3179();
			Static485.aClass126_17.la();
			Static468.aClass117_6.method7244(0, Static617.anInt10032, 0);
			Static485.aClass126_17.method7040(Static468.aClass117_6);
			Static485.aClass126_17.DA(local35.width / 2, local35.height / 2, 512, 512);
			Static485.aClass126_17.xa(1.0F);
			Static485.aClass126_17.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(95) Class180 local95 = Static485.aClass126_17.method6982(local51, 2048, 64, 64, 768);
			@Pc(97) int local97 = 0;
			label41: for (@Pc(99) int local99 = 0; local99 < 500; local99++) {
				Static485.aClass126_17.GA(0);
				Static485.aClass126_17.ya();
				for (@Pc(108) int local108 = 15; local108 >= 0; local108--) {
					for (@Pc(112) int local112 = 0; local112 <= local108; local112++) {
						Static88.aClass117_1.method7244((int) (((float) local112 - (float) local108 / 2.0F) * (float) Static407.anInt7012), 0, Static407.anInt7012 * (local108 + 1));
						local95.method7949(Static88.aClass117_1, (Class14_Sub9) null, 0);
						local97++;
						if (Static205.method3179() - local54 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static485.aClass126_17.method7052();
			@Pc(178) long local178 = (long) (local97 * 1000) / (Static205.method3179() - local54);
			Static485.aClass126_17.GA(0);
			Static485.aClass126_17.ya();
			return (int) local178;
		} catch (@Pc(187) Throwable local187) {
			local187.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)I")
	public static int method6637(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V")
	public static void method6638(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(15) Class14_Sub3 local15 = (Class14_Sub3) Static41.aClass363_1.method8484(); local15 != null; local15 = (Class14_Sub3) Static41.aClass363_1.method8478()) {
			if (Static235.anInt3998 >= local15.anInt482) {
				local15.method8904();
			} else {
				Static365.method5698(local15.anInt488, arg1 >> 1, arg0 >> 1, (local15.anInt484 << 9) + 256, local15.anInt487 * 2, (local15.anInt485 << 9) + 256);
				Static471.aClass6_12.method7199(arg2 + Static515.anIntArray676[0], local15.aString7, Static515.anIntArray676[1] + arg3, local15.anInt480 | 0xFF000000, 0);
			}
		}
	}
}
