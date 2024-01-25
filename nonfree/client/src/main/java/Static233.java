import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
	public static int anInt4304;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "Lclient!mo;")
	public static final Class168 aClass168_20 = new Class168(13, 3);

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
	public static int anInt4303 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method3447(@OriginalArg(0) Class50 arg0) {
		@Pc(7) int local7 = Static270.anInt4755;
		@Pc(9) int local9 = Static279.anInt4882;
		@Pc(11) int local11 = Static226.anInt4217;
		@Pc(13) int local13 = Static361.anInt6151;
		arg0.method5853(local9, local7, -10660793, local13, local11);
		arg0.method5853(local9 + 1, local7 + 1, -16777216, 16, local11 - 2);
		arg0.method5834(local11 - 2, local7 + 1, -16777216, local13 - 19, local9 - -18);
		Static330.aClass57_3.method5960(local7 + 3, -10660793, -1, local9 + 14, Static23.aClass182_247.method4155(Static191.anInt3842));
		@Pc(72) int local72 = Static113.aClass13_1.method4116();
		@Pc(76) int local76 = Static113.aClass13_1.method4123();
		@Pc(78) int local78 = 0;
		for (@Pc(91) Class10_Sub45 local91 = (Class10_Sub45) Static70.aClass163_13.method3620(); local91 != null; local91 = (Class10_Sub45) Static70.aClass163_13.method3621()) {
			@Pc(107) int local107 = local9 + (-local78 + (Static207.anInt4055 - 1)) * 16 + 31;
			@Pc(109) short local109 = -1;
			if (local7 < local72 && local72 < local11 + local7 && local107 - 13 < local76 && local107 + 3 > local76 && local91.aBoolean495) {
				local109 = -256;
			}
			@Pc(138) int[] local138 = null;
			if (Static252.method3680(local91.anInt7505)) {
				local138 = Static313.aClass272_2.method6068((int) local91.aLong261).anIntArray131;
			} else if (local91.anInt7506 != -1) {
				local138 = Static313.aClass272_2.method6068(local91.anInt7506).anIntArray131;
			} else if (Static114.method1979(local91.anInt7505)) {
				@Pc(208) Class10_Sub26 local208 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local91.aLong261);
				if (local208 != null) {
					@Pc(213) Class24_Sub3_Sub2_Sub1 local213 = local208.aClass24_Sub3_Sub2_Sub1_2;
					@Pc(216) Class222 local216 = local213.aClass222_1;
					if (local216.anIntArray613 != null) {
						local216 = local216.method4938(Static329.aClass201_9);
					}
					if (local216 != null) {
						local138 = local216.anIntArray615;
					}
				}
			} else if (Static380.method5132(local91.anInt7505)) {
				@Pc(173) Class126 local173;
				if (local91.anInt7505 == 1003) {
					local173 = Static342.aClass237_4.method5212((int) local91.aLong261);
				} else {
					local173 = Static342.aClass237_4.method5212((int) (local91.aLong261 >>> 32 & 0x7FFFFFFFL));
				}
				if (local173.anIntArray380 != null) {
					local173 = local173.method3009(Static329.aClass201_9);
				}
				if (local173 != null) {
					local138 = local173.anIntArray384;
				}
			}
			@Pc(250) String local250 = Static3.method3431(local91);
			if (local138 != null) {
				local250 = local250 + Static87.method1638(local138);
			}
			Static330.aClass57_3.method5950(Static271.aClass80Array14, local250, local109, local107, local7 + 3, Static56.anIntArray89);
			if (local91.aBoolean494) {
				Static40.aClass80_3.method5558(local7 + Static450.aClass79_10.method1977(local250) + 5, local107 + -12);
			}
			local78++;
		}
		Static154.method2632(Static226.anInt4217, Static279.anInt4882, Static270.anInt4755, Static361.anInt6151);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)V")
	public static void method3450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class11 local7 = Static309.aClass11ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class24_Sub1 local13 = local7.aClass24_Sub1_2;
		@Pc(16) Class24_Sub1 local16 = local7.aClass24_Sub1_1;
		if (local13 != null) {
			local13.anInt4871 = local13.anInt4871 * arg3 / (0x10 << Static286.anInt5018 - 7);
			local13.anInt4866 = local13.anInt4866 * arg3 / (0x10 << Static286.anInt5018 - 7);
		}
		if (local16 != null) {
			local16.anInt4871 = local16.anInt4871 * arg3 / (0x10 << Static286.anInt5018 - 7);
			local16.anInt4866 = local16.anInt4866 * arg3 / (0x10 << Static286.anInt5018 - 7);
		}
	}
}
