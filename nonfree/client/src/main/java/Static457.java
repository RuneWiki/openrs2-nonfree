import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "Lclient!dc;")
	public static final Class52 aClass52_3 = new Class52(16);

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
	public static int anInt7597 = -1;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)Z")
	public static boolean method6053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static107.method1886(arg0, arg1) & Static373.method4981(arg1, arg0);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)I")
	public static int method6055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static290.anIntArrayArray46 == null ? 0 : Static290.anIntArrayArray46[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BLclient!za;)V")
	public static void method6057(@OriginalArg(1) Class50 arg0) {
		@Pc(7) int local7 = Static270.anInt4755;
		@Pc(9) int local9 = Static279.anInt4882;
		@Pc(11) int local11 = Static226.anInt4217;
		@Pc(15) int local15 = Static361.anInt6151 - 3;
		if (Static164.aClass80_9 == null || Static243.aClass80_10 == null) {
			if (Static21.aClass187_8.method4282(Static49.anInt894) && Static21.aClass187_8.method4282(Static78.anInt1648)) {
				Static164.aClass80_9 = arg0.method5861(Static463.method1657(Static21.aClass187_8, Static49.anInt894, 0));
				@Pc(44) Class66 local44 = Static463.method1657(Static21.aClass187_8, Static78.anInt1648, 0);
				Static243.aClass80_10 = arg0.method5861(local44);
				local44.method1666();
				Static26.aClass80_2 = arg0.method5861(local44);
			} else {
				arg0.P(local7, local9, local11, 20, 255 - Static353.anInt6045 << 24 | Static119.anInt2409, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static164.aClass80_9 != null && Static243.aClass80_10 != null) {
			local87 = (local11 - Static243.aClass80_10.YA() * 2) / Static164.aClass80_9.YA();
			for (local89 = 0; local89 < local87; local89++) {
				Static164.aClass80_9.method5558(local7 + Static243.aClass80_10.YA() + Static164.aClass80_9.YA() * local89, local9);
			}
			Static243.aClass80_10.method5558(local7, local9);
			Static26.aClass80_2.method5558(local11 + local7 - Static26.aClass80_2.YA(), local9);
		}
		Static330.aClass57_3.method5960(local7 + 3, Static383.anInt6559 | 0xFF000000, -1, local9 + 14, Static23.aClass182_247.method4155(Static191.anInt3842));
		arg0.P(local7, local9 + 20, local11, local15 - 20, -Static353.anInt6045 + 255 << 24 | Static119.anInt2409, 1);
		local87 = Static113.aClass13_1.method4116();
		local89 = Static113.aClass13_1.method4123();
		@Pc(173) int local173 = 0;
		for (@Pc(178) Class10_Sub45 local178 = (Class10_Sub45) Static70.aClass163_13.method3620(); local178 != null; local178 = (Class10_Sub45) Static70.aClass163_13.method3621()) {
			@Pc(196) int local196 = (Static207.anInt4055 - local173 - 1) * 16 + local9 + 13 + 20;
			local173++;
			if (local87 > local7 && local7 + local11 > local87 && local196 - 13 < local89 && local196 + 4 > local89 && local178.aBoolean495) {
				arg0.P(local7, local196 - 12, local11, 16, 255 - Static182.anInt3699 << 24 | Static260.anInt4621, 1);
			}
		}
		if ((Static311.aClass80_17 == null || Static23.aClass80_24 == null || Static261.aClass80_14 == null) && Static21.aClass187_8.method4282(Static421.anInt7073) && Static21.aClass187_8.method4282(Static349.anInt5976) && Static21.aClass187_8.method4282(Static137.anInt2870)) {
			@Pc(292) Class66 local292 = Static463.method1657(Static21.aClass187_8, Static349.anInt5976, 0);
			Static23.aClass80_24 = arg0.method5861(local292);
			local292.method1666();
			Class222.lb = arg0.method5861(local292);
			Static311.aClass80_17 = arg0.method5861(Static463.method1657(Static21.aClass187_8, Static421.anInt7073, 0));
			@Pc(317) Class66 local317 = Static463.method1657(Static21.aClass187_8, Static137.anInt2870, 0);
			Static261.aClass80_14 = arg0.method5861(local317);
			local317.method1666();
			Static306.aClass80_16 = arg0.method5861(local317);
		}
		@Pc(383) int local383;
		@Pc(348) int local348;
		if (Static311.aClass80_17 != null && Static23.aClass80_24 != null && Static261.aClass80_14 != null) {
			@Pc(346) int local346 = (local11 - Static261.aClass80_14.YA() * 2) / Static311.aClass80_17.YA();
			for (local348 = 0; local348 < local346; local348++) {
				Static311.aClass80_17.method5558(local7 + Static261.aClass80_14.YA() + local348 * Static311.aClass80_17.YA(), local9 + local15 - Static311.aClass80_17.ZA());
			}
			local383 = (local15 - Static261.aClass80_14.ZA() - 20) / Static23.aClass80_24.ZA();
			for (@Pc(385) int local385 = 0; local385 < local383; local385++) {
				Static23.aClass80_24.method5558(local7, local385 * Static23.aClass80_24.ZA() + local9 + 20);
				Class222.lb.method5558(local11 + local7 - Class222.lb.YA(), Static23.aClass80_24.ZA() * local385 + 20 + local9);
			}
			Static261.aClass80_14.method5558(local7, local15 + local9 - Static261.aClass80_14.ZA());
			Static306.aClass80_16.method5558(local11 + local7 - Static261.aClass80_14.YA(), -Static261.aClass80_14.ZA() + local15 + local9);
		}
		local173 = 0;
		for (@Pc(452) Class10_Sub45 local452 = (Class10_Sub45) Static70.aClass163_13.method3620(); local452 != null; local452 = (Class10_Sub45) Static70.aClass163_13.method3621()) {
			local348 = local9 + (Static207.anInt4055 - (1 - -local173)) * 16 + 13 + 20;
			local383 = Static383.anInt6559 | 0xFF000000;
			if (local87 > local7 && local87 < local7 + local11 && local89 > local348 - 13 && local89 < local348 + 4 && local452.aBoolean495) {
				local383 = Static226.anInt4216 | 0xFF000000;
			}
			@Pc(514) int[] local514 = null;
			if (Static252.method3680(local452.anInt7505)) {
				local514 = Static313.aClass272_2.method6068((int) local452.aLong261).anIntArray131;
			} else if (local452.anInt7506 != -1) {
				local514 = Static313.aClass272_2.method6068(local452.anInt7506).anIntArray131;
			} else if (Static114.method1979(local452.anInt7505)) {
				@Pc(555) Class10_Sub26 local555 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local452.aLong261);
				if (local555 != null) {
					@Pc(560) Class24_Sub3_Sub2_Sub1 local560 = local555.aClass24_Sub3_Sub2_Sub1_2;
					@Pc(563) Class222 local563 = local560.aClass222_1;
					if (local563.anIntArray613 != null) {
						local563 = local563.method4938(Static329.aClass201_9);
					}
					if (local563 != null) {
						local514 = local563.anIntArray615;
					}
				}
			} else if (Static380.method5132(local452.anInt7505)) {
				@Pc(599) Class126 local599;
				if (local452.anInt7505 == 1003) {
					local599 = Static342.aClass237_4.method5212((int) local452.aLong261);
				} else {
					local599 = Static342.aClass237_4.method5212((int) (local452.aLong261 >>> 32 & 0x7FFFFFFFL));
				}
				if (local599.anIntArray380 != null) {
					local599 = local599.method3009(Static329.aClass201_9);
				}
				if (local599 != null) {
					local514 = local599.anIntArray384;
				}
			}
			@Pc(624) String local624 = Static3.method3431(local452);
			if (local514 != null) {
				local624 = local624 + Static87.method1638(local514);
			}
			Static330.aClass57_3.method5950(Static271.aClass80Array14, local624, local383, local348, local7 + 3, Static56.anIntArray89);
			if (local452.aBoolean494) {
				Static40.aClass80_3.method5558(Static450.aClass79_10.method1977(local624) + local7 + 5, local348 + -12);
			}
			local173++;
		}
		Static154.method2632(Static226.anInt4217, Static279.anInt4882, Static270.anInt4755, Static361.anInt6151);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIII)V")
	public static void method6059(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static167.anInt3304; local3++) {
			@Pc(9) Rectangle local9 = Class10_Sub1_Sub7.aRectangleArray4[local3];
			if (local9.x + local9.width > arg3 && local9.x < arg0 + arg3 && arg1 < local9.height + local9.y && local9.y < arg1 + arg2) {
				Static432.aBooleanArray24[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)V")
	public static void method6060(@OriginalArg(0) int arg0) {
		Static222.anInt4181 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static54.anInt998; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static24.anInt401; local6++) {
				if (Static309.aClass11ArrayArrayArray2[arg0][local3][local6] == null) {
					Static309.aClass11ArrayArrayArray2[arg0][local3][local6] = new Class11(arg0, local3, local6);
				}
			}
		}
	}
}
