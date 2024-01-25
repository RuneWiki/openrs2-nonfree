import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "J")
	public static long aLong248;

	@OriginalMember(owner = "client!sda", name = "n", descriptor = "I")
	public static int anInt8605;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "[I")
	public static int[] anIntArray493 = new int[1];

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(III)Z")
	public static boolean method7411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method7416(@OriginalArg(1) Class100 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static377.aBoolean419) {
			local7 = Static194.method8971();
			local9 = Static5.method9220();
		}
		Static499.method6951(arg0, Static515.anInt8186, local7 + Static32.anInt5104, Static482.anInt7810, Static619.anInt9981 + local9);
		Static196.aClass70_3.method8433(local7 + Static32.anInt5104 + 3, -1, -10660793, Static184.aClass131_25.method3168(Static375.anInt7800), Static619.anInt9981 + local9 + 14);
		@Pc(59) int local59 = Static300.aClass164_1.method4999() + local7;
		@Pc(65) int local65 = Static300.aClass164_1.method5000() + local9;
		@Pc(76) int local76;
		@Pc(98) int local98;
		if (Static83.aBoolean120) {
			local76 = 0;
			for (@Pc(135) Class5_Sub1_Sub20 local135 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9027(); local135 != null; local135 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9024()) {
				local98 = local9 + Static619.anInt9981 + local76 * 16 + 31;
				local76++;
				if (local135.anInt9857 == 1) {
					Static673.method9141(local98, Static32.anInt5104 + local7, local65, arg0, (Class5_Sub1_Sub13) local135.aClass388_14.aClass5_Sub1_66.aClass5_Sub1_65, local59, Static515.anInt8186, -1, local9 + Static619.anInt9981, Static482.anInt7810, -256);
				} else {
					Static229.method3617(local9 + Static619.anInt9981, -1, arg0, local7 + Static32.anInt5104, -256, Static515.anInt8186, local65, local135, local59, Static482.anInt7810, local98);
				}
			}
			if (Static272.aClass5_Sub1_Sub20_1 != null) {
				Static499.method6951(arg0, Static389.anInt1887, Static240.anInt4167, Static498.anInt8035, Static145.anInt2900);
				local76 = 0;
				Static196.aClass70_3.method8433(Static240.anInt4167 + 3, -1, -10660793, Static272.aClass5_Sub1_Sub20_1.aString114, Static145.anInt2900 + 14);
				for (@Pc(241) Class5_Sub1_Sub13 local241 = (Class5_Sub1_Sub13) Static272.aClass5_Sub1_Sub20_1.aClass388_14.method9027(); local241 != null; local241 = (Class5_Sub1_Sub13) Static272.aClass5_Sub1_Sub20_1.aClass388_14.method9024()) {
					@Pc(253) int local253 = local76 * 16 + Static145.anInt2900 + 31;
					Static673.method9141(local253, Static240.anInt4167, local65, arg0, local241, local59, Static389.anInt1887, -1, Static145.anInt2900, Static498.anInt8035, -256);
					local76++;
				}
				Static180.method3130(Static240.anInt4167, Static145.anInt2900, Static389.anInt1887, Static498.anInt8035);
			}
		} else {
			local76 = 0;
			for (@Pc(81) Class5_Sub1_Sub13 local81 = (Class5_Sub1_Sub13) Static399.aClass20_33.method378(); local81 != null; local81 = (Class5_Sub1_Sub13) Static399.aClass20_33.method366()) {
				local98 = (Static651.anInt10662 - local76 - 1) * 16 + Static619.anInt9981 + local9 + 31;
				Static673.method9141(local98, local7 + Static32.anInt5104, local65, arg0, local81, local59, Static515.anInt8186, -1, Static619.anInt9981 + local9, Static482.anInt7810, -256);
				local76++;
			}
		}
		Static180.method3130(local7 + Static32.anInt5104, local9 + Static619.anInt9981, Static515.anInt8186, Static482.anInt7810);
	}
}
