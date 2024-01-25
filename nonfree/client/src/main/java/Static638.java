import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "Z")
	public static boolean aBoolean751 = false;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIII[BI)V")
	public static void method9206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		arg1 += arg0;
		@Pc(28) int local28 = arg3 - arg0 >> 2;
		while (true) {
			local28--;
			if (local28 < 0) {
				local28 = arg3 - arg0 & 0x3;
				while (true) {
					local28--;
					if (local28 < 0) {
						return;
					}
					arg2[arg1++] = 1;
				}
			}
			@Pc(33) int local33 = arg1 + 1;
			arg2[arg1] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg2[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg2[local38] = 1;
			arg1 = local43 + 1;
			arg2[local43] = 1;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "()V")
	public static void method9207() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static68.aClass366Array1.length; local3++) {
				if (Static68.aClass366Array1[local3].method8994()) {
					Static44.aLongArray1[local3] = Static68.aClass366Array1[local3].method8988();
				} else {
					synchronized (Static68.aClass366Array1[local3]) {
						Static68.aClass366Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static68.aClass366Array1[Static68.aClass366Array1.length - 1].method8992();
				Static31.method769(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static68.aClass366Array1.length - 1; local3++) {
						if (!Static68.aClass366Array1[local3].method8994()) {
							synchronized (Static68.aClass366Array1[local3]) {
								Static68.aClass366Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static68.aClass366Array1.length - 2; local102++) {
							Static68.aClass366Array1[local102].method8992();
						}
						Static31.method769(2);
						while (!Static68.aClass366Array1[0].method8994()) {
							synchronized (Static68.aClass366Array1[0]) {
								Static68.aClass366Array1[0].notify();
							}
							try {
								Static190.method3914(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static68.aClass366Array1[0].method8992();
						return;
					}
					try {
						Static190.method3914(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static190.method3914(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BII)V")
	public static void method9208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static161.aClass239_14.method6482(Static588.aClass351_26.method8691(Static476.anInt8915));
		@Pc(55) int local55;
		@Pc(26) int local26;
		if (Static374.aBoolean539) {
			for (@Pc(62) Class2_Sub6_Sub21 local62 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6008(); local62 != null; local62 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6000()) {
				if (local62.anInt10705 == 1) {
					local26 = Static546.method8164((Class2_Sub6_Sub3) local62.aClass211_12.aClass2_Sub6_48.aClass2_Sub6_66);
				} else {
					local26 = Static612.method8947(local62);
				}
				if (local26 > local13) {
					local13 = local26;
				}
			}
			local13 += 8;
			local55 = Static193.anInt4507 * 16 + 21;
			Static589.anInt10431 = (Static292.aBoolean464 ? 26 : 22) + Static193.anInt4507 * 16;
		} else {
			for (@Pc(20) Class2_Sub6_Sub3 local20 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8524(); local20 != null; local20 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8519()) {
				local26 = Static546.method8164(local20);
				if (local13 < local26) {
					local13 = local26;
				}
			}
			local13 += 8;
			Static589.anInt10431 = (Static292.aBoolean464 ? 26 : 22) + Static298.anInt6262 * 16;
			local55 = Static298.anInt6262 * 16 + 21;
		}
		@Pc(124) int local124 = arg0 - local13 / 2;
		if (Static81.anInt2497 < local13 + local124) {
			local124 = Static81.anInt2497 - local13;
		}
		if (local124 < 0) {
			local124 = 0;
		}
		local26 = arg1;
		if (arg1 + local55 > Static423.anInt7984) {
			local26 = Static423.anInt7984 - local55;
		}
		if (local26 < 0) {
			local26 = 0;
		}
		Static274.anInt5852 = local124;
		Static65.aBoolean754 = true;
		Static332.anInt6717 = local26;
		Static278.anInt5905 = local13;
	}
}
