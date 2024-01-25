import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "Lclient!bp;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "[Lclient!ro;")
	public static Class300[] aClass300Array1;

	@OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
	public static int anInt8106;

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "Lclient!uea;")
	public static Class338 aClass338_1;

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "Lclient!tr;")
	public static final Class332 aClass332_5 = new Class332();

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[6][];

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_180 = new Class215(17, 4);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	public static void method6913() {
		Static153.method3432();
		Static571.aClass41ArrayArray1 = null;
		Static273.aClass20_8 = null;
		Static90.aClass78_2 = null;
		Static409.aClass78_3 = null;
		Static534.aClass78_4 = null;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)I")
	public static int method6915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static428.anInt5961 == -1) {
			return 1;
		}
		if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() != arg0) {
			Static116.method2899(Static588.aClass351_15.method8691(Static476.anInt8915), true, arg0);
			if (arg0 != Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945()) {
				return -1;
			}
		}
		try {
			@Pc(39) Dimension local39 = Static639.aCanvas10.getSize();
			Static151.method3426(true, Static300.aClass68_4, Static58.aClass239_18, Static588.aClass351_15.method8691(Static476.anInt8915), Static186.aClass20_4);
			@Pc(55) Class32 local55 = Static630.method9136(Static363.aClass157_188, Static428.anInt5961);
			@Pc(58) long local58 = Static277.method5091();
			Static186.aClass20_4.la();
			Static45.aClass30_3.method4649(0, Static361.anInt7189, 0);
			Static186.aClass20_4.method7241(Static45.aClass30_3);
			Static186.aClass20_4.DA(local39.width / 2, local39.height / 2, 512, 512);
			Static186.aClass20_4.xa(1.0F);
			Static186.aClass20_4.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(104) Class166 local104 = Static186.aClass20_4.method7228(local55, 2048, 64, 64, 768);
			@Pc(106) int local106 = 0;
			label41: for (@Pc(108) int local108 = 0; local108 < 500; local108++) {
				Static186.aClass20_4.GA(0);
				Static186.aClass20_4.ya();
				for (@Pc(117) int local117 = 15; local117 >= 0; local117--) {
					for (@Pc(121) int local121 = 0; local121 <= local117; local121++) {
						Static172.aClass30_6.method4649((int) ((-((float) local117 / 2.0F) + (float) local121) * (float) Static582.anInt10356), 0, (local117 + 1) * Static582.anInt10356);
						local106++;
						local104.method6685(Static172.aClass30_6, null, 0);
						if ((long) arg1 <= Static277.method5091() - local58) {
							break label41;
						}
					}
				}
			}
			Static186.aClass20_4.method7236();
			@Pc(197) long local197 = (long) (local106 * 1000) / (Static277.method5091() - local58);
			Static186.aClass20_4.GA(0);
			Static186.aClass20_4.ya();
			return (int) local197;
		} catch (@Pc(206) Throwable local206) {
			local206.printStackTrace();
			return -1;
		}
	}
}
