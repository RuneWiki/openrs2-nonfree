import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static672 {

	@OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
	public static int anInt10829;

	@OriginalMember(owner = "client!wk", name = "Q", descriptor = "[I")
	public static int[] anIntArray620 = new int[4];

	@OriginalMember(owner = "client!wk", name = "P", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_272 = new Class381(38, -1);

	@OriginalMember(owner = "client!wk", name = "M", descriptor = "[S")
	public static final short[] aShortArray186 = new short[] { 46, 21, 19, 30, 49, 57, 16, 18 };

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method9137(@OriginalArg(0) Class100 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static377.aBoolean419) {
			local7 = Static194.method8971();
			local9 = Static5.method9220();
		}
		@Pc(26) int local26 = Static32.anInt5104 + local7;
		@Pc(31) int local31 = Static619.anInt9981 + local9;
		@Pc(33) int local33 = Static482.anInt7810;
		@Pc(37) int local37 = Static515.anInt8186 - 3;
		Static527.method7217(Static515.anInt8186, Static184.aClass131_25.method3168(Static375.anInt7800), Static482.anInt7810, local9 + Static619.anInt9981, arg0, Static32.anInt5104 + local7);
		@Pc(62) int local62 = local7 + Static300.aClass164_1.method4999();
		@Pc(68) int local68 = Static300.aClass164_1.method5000() + local9;
		@Pc(72) int local72;
		@Pc(79) Class5_Sub1_Sub13 local79;
		@Pc(98) int local98;
		@Pc(313) int local313;
		@Pc(179) Class5_Sub1_Sub20 local179;
		@Pc(299) Class5_Sub1_Sub13 local299;
		if (Static83.aBoolean120) {
			local72 = 0;
			for (local179 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9027(); local179 != null; local179 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9024()) {
				local98 = local31 + local72 * 16 + 33;
				if (local62 > local7 + Static32.anInt5104 && local62 < local7 + Static32.anInt5104 + Static482.anInt7810 && local68 > local98 - 13 && local98 + 4 > local68 && (local179.anInt9857 > 1 || ((Class5_Sub1_Sub13) local179.aClass388_14.aClass5_Sub1_66.aClass5_Sub1_65).aBoolean414)) {
					arg0.aa(local7 + Static32.anInt5104, local98 + -12, Static482.anInt7810, 16, 255 - Static198.anInt3602 << 24 | Static208.anInt3699, 1);
				}
				local72++;
			}
			if (Static272.aClass5_Sub1_Sub20_1 != null) {
				local72 = 0;
				Static527.method7217(Static389.anInt1887, Static272.aClass5_Sub1_Sub20_1.aString114, Static498.anInt8035, Static145.anInt2900, arg0, Static240.anInt4167);
				for (local299 = (Class5_Sub1_Sub13) Static272.aClass5_Sub1_Sub20_1.aClass388_14.method9027(); local299 != null; local299 = (Class5_Sub1_Sub13) Static272.aClass5_Sub1_Sub20_1.aClass388_14.method9024()) {
					local313 = local72 * 16 + Static145.anInt2900 + 13 + 20;
					if (local62 > Static240.anInt4167 && local62 < Static498.anInt8035 + Static240.anInt4167 && local313 - 13 < local68 && local313 + 4 > local68 && local299.aBoolean414) {
						arg0.aa(Static240.anInt4167, local313 - 12, Static498.anInt8035, 16, Static208.anInt3699 | 255 - Static198.anInt3602 << 24, 1);
					}
					local72++;
				}
				Static126.method1894(Static145.anInt2900, Static498.anInt8035, Static389.anInt1887, Static240.anInt4167, arg0);
			}
		} else {
			local72 = 0;
			for (local79 = (Class5_Sub1_Sub13) Static399.aClass20_33.method378(); local79 != null; local79 = (Class5_Sub1_Sub13) Static399.aClass20_33.method366()) {
				local98 = local31 + (-local72 + -1 + Static651.anInt10662) * 16 + 20 + 13;
				local72++;
				if (local7 + Static32.anInt5104 < local62 && local7 + Static32.anInt5104 + Static482.anInt7810 > local62 && local68 > local98 - 13 && local68 < local98 + 4 && local79.aBoolean414) {
					arg0.aa(local7 + Static32.anInt5104, local98 + -12, Static482.anInt7810, 16, Static208.anInt3699 | 255 - Static198.anInt3602 << 24, 1);
				}
			}
		}
		Static126.method1894(local9 + Static619.anInt9981, Static482.anInt7810, Static515.anInt8186, local7 + Static32.anInt5104, arg0);
		if (Static83.aBoolean120) {
			local72 = 0;
			for (local179 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9027(); local179 != null; local179 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9024()) {
				local98 = Static619.anInt9981 + local9 + local72 * 16 + 13 + 20;
				if (local179.anInt9857 == 1) {
					Static673.method9141(local98, local7 + Static32.anInt5104, local68, arg0, (Class5_Sub1_Sub13) local179.aClass388_14.aClass5_Sub1_66.aClass5_Sub1_65, local62, Static515.anInt8186, Static180.anInt3395 | 0xFF000000, local9 + Static619.anInt9981, Static482.anInt7810, Static533.anInt8877 | 0xFF000000);
				} else {
					Static229.method3617(local9 + Static619.anInt9981, Static180.anInt3395 | 0xFF000000, arg0, local7 + Static32.anInt5104, Static533.anInt8877 | 0xFF000000, Static515.anInt8186, local68, local179, local62, Static482.anInt7810, local98);
				}
				local72++;
			}
			if (Static272.aClass5_Sub1_Sub20_1 != null) {
				local72 = 0;
				for (local299 = (Class5_Sub1_Sub13) Static272.aClass5_Sub1_Sub20_1.aClass388_14.method9027(); local299 != null; local299 = (Class5_Sub1_Sub13) Static272.aClass5_Sub1_Sub20_1.aClass388_14.method9024()) {
					local313 = Static145.anInt2900 + local72 * 16 + 33;
					Static673.method9141(local313, Static240.anInt4167, local68, arg0, local299, local62, Static389.anInt1887, Static180.anInt3395 | 0xFF000000, Static145.anInt2900, Static498.anInt8035, Static533.anInt8877 | 0xFF000000);
					local72++;
				}
				Static180.method3130(Static240.anInt4167, Static145.anInt2900, Static389.anInt1887, Static498.anInt8035);
			}
		} else {
			local72 = 0;
			for (local79 = (Class5_Sub1_Sub13) Static399.aClass20_33.method378(); local79 != null; local79 = (Class5_Sub1_Sub13) Static399.aClass20_33.method366()) {
				local98 = local31 + (-local72 + Static651.anInt10662 + -1) * 16 + 33;
				local72++;
				Static673.method9141(local98, local26, local68, arg0, local79, local62, local37, Static180.anInt3395 | 0xFF000000, local31, local33, Static533.anInt8877 | 0xFF000000);
			}
		}
		Static180.method3130(local7 + Static32.anInt5104, local9 + Static619.anInt9981, Static515.anInt8186, Static482.anInt7810);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V")
	public static void method9138(@OriginalArg(1) int arg0) {
		Static527.anInt8399 = arg0;
		Static481.aClass168_67.method3862();
	}
}
