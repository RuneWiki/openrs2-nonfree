import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!la", name = "j", descriptor = "I")
	public static int anInt8220 = 0;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "[I")
	public static final int[] anIntArray635 = new int[1];

	@OriginalMember(owner = "client!la", name = "n", descriptor = "[I")
	public static final int[] anIntArray636 = new int[4096];

	@OriginalMember(owner = "client!la", name = "w", descriptor = "S")
	public static short aShort118 = 205;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
	public static int method6607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static130.anInt2565 == -1) {
			return 1;
		}
		if (arg1 != Static113.anInt2222) {
			Static589.method7834(arg1, Static568.aClass351_17.method7651(Static307.anInt5279));
			if (Static113.anInt2222 != arg1) {
				return -1;
			}
		}
		try {
			@Pc(33) Dimension local33 = Static499.aCanvas9.getSize();
			Static152.method2206(Static442.aClass64_12, true, Static268.aClass334_14, Static16.aClass134_1, Static568.aClass351_17.method7651(Static307.anInt5279));
			@Pc(57) Class210 local57 = Static127.method2013(Static130.anInt2565, Static412.aClass270_84);
			@Pc(60) long local60 = Static413.method5668();
			Static16.aClass134_1.JA();
			Static458.aClass113_6.NA(0, Static142.anInt2687, 0);
			Static16.aClass134_1.method6919(Static458.aClass113_6);
			Static16.aClass134_1.la(local33.width / 2, local33.height / 2, 512, 512);
			Static16.aClass134_1.ra(1.0F);
			Static16.aClass134_1.VA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(101) Class63 local101 = Static16.aClass134_1.method6910(local57, 2048, 64, 64, 768);
			@Pc(103) int local103 = 0;
			label41: for (@Pc(105) int local105 = 0; local105 < 500; local105++) {
				Static16.aClass134_1.ja(0);
				Static16.aClass134_1.ya();
				for (@Pc(114) int local114 = 15; local114 >= 0; local114--) {
					for (@Pc(118) int local118 = 0; local118 <= local114; local118++) {
						Static250.aClass113_2.NA((int) (((float) local118 - (float) local114 / 2.0F) * (float) Static379.anInt6307), 0, (local114 + 1) * Static379.anInt6307);
						local101.method7429(Static250.aClass113_2, null, 0);
						local103++;
						if (Static413.method5668() - local60 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static16.aClass134_1.method6971();
			@Pc(180) long local180 = (long) (local103 * 1000) / (Static413.method5668() - local60);
			Static16.aClass134_1.ja(0);
			Static16.aClass134_1.ya();
			return (int) local180;
		} catch (@Pc(189) Throwable local189) {
			local189.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)I")
	public static int method6616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1 & 0x3;
		if (local8 == 0) {
			return arg0;
		} else if (local8 == 1) {
			return arg2;
		} else if (local8 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg2;
		}
	}
}
