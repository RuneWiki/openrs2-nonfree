import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
	public static int anInt5290;

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "[I")
	public static int[] anIntArray426;

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_118 = new Class209("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "[I")
	public static final int[] anIntArray427 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZLclient!ya;)V")
	public static void method4247(@OriginalArg(1) Class49 arg0) {
		arg0.OA(0, 0, Static86.anInt4394, 350);
		arg0.O(0, 0, Static86.anInt4394, 350, Static50.anInt6160 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static401.anInt6673;
		@Pc(39) int local39;
		if (Static155.anInt3171 > 0) {
			local39 = 346 - Static401.anInt6673 - 4;
			@Pc(49) int local49 = local27 * local39 / (local27 + Static155.anInt3171 - 1);
			@Pc(51) int local51 = 4;
			if (Static155.anInt3171 > 1) {
				local51 = (Static155.anInt3171 - Static161.anInt6991 - 1) * (-local49 + local39) / (Static155.anInt3171 - 1) + 4;
			}
			arg0.O(Static86.anInt4394 - 16, local51, 12, local49, Static50.anInt6160 << 24 | 0x332277, 2);
			for (@Pc(89) int local89 = Static161.anInt6991; Static161.anInt6991 + local27 > local89 && local89 < Static155.anInt3171; local89++) {
				@Pc(98) String[] local98 = Static455.method4448('\b', Static311.aStringArray39[local89]);
				@Pc(105) int local105 = (Static86.anInt4394 - 24) / local98.length;
				for (@Pc(107) int local107 = 0; local107 < local98.length; local107++) {
					@Pc(115) int local115 = local107 * local105 + 8;
					arg0.OA(local115, 0, local105 + local115 - 8, 350);
					Static368.aClass116_4.method4814(local115, local98[local107], -16777216, 350 - Static401.anInt6673 * (local89 - Static161.anInt6991) - Static270.aClass58_11.anInt1587 - Static436.anInt7188 - 2, -1);
				}
			}
		}
		arg0.OA(0, 0, Static86.anInt4394, 350);
		arg0.method4413(-1, Static86.anInt4394, 350 - Static436.anInt7188, 0);
		Static114.aClass116_1.method4814(10, "--> " + Static20.aString3, -16777216, 350 - Static172.aClass58_5.anInt1587 - 1, -1);
		local39 = -1;
		if (Static131.anInt2821 % 30 > 15) {
			local39 = 16777215;
		}
		arg0.method4464(350 - Static172.aClass58_5.anInt1587 - 11, 12, Static172.aClass58_5.method1340("--> " + Static20.aString3.substring(0, Static174.anInt3461)) + 10, local39);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)V")
	public static void method4249(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static343.anInt5854 + Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119;
		@Pc(15) int local15 = Static197.anInt3801 + Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121;
		if (Static290.anInt5208 - local10 < -500 || Static290.anInt5208 - local10 > 500 || Static335.anInt941 - local15 < -500 || Static335.anInt941 - local15 > 500) {
			Static335.anInt941 = local15;
			Static290.anInt5208 = local10;
		}
		@Pc(52) int local52;
		@Pc(60) int local60;
		if (local10 != Static290.anInt5208) {
			local52 = local10 - Static290.anInt5208;
			local60 = (int) (arg0 * (long) local52 / 320L);
			if (local52 > 0) {
				if (local60 == 0) {
					local60 = 1;
				} else if (local60 > local52) {
					local60 = local52;
				}
			} else if (local60 == 0) {
				local60 = -1;
			} else if (local60 < local52) {
				local60 = local52;
			}
			Static290.anInt5208 += local60;
		}
		if (local15 != Static335.anInt941) {
			local52 = local15 - Static335.anInt941;
			local60 = (int) ((long) local52 * arg0 / 320L);
			if (local52 > 0) {
				if (local60 == 0) {
					local60 = 1;
				} else if (local52 < local60) {
					local60 = local52;
				}
			} else if (local60 == 0) {
				local60 = -1;
			} else if (local60 < local52) {
				local60 = local52;
			}
			Static335.anInt941 += local60;
		}
		if (!Static12.aClass79_Sub1_1.aBoolean363) {
			Static202.aFloat62 += (float) arg0 * Static118.aFloat53 / 6.0F;
			Static287.aFloat74 += (float) arg0 * Static286.aFloat73 / 6.0F;
		}
		Static45.method713();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!co;Z)V")
	public static void method4250(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static131.anInt2821 < arg1.anInt6181) {
			Static187.method2963(arg1);
		} else if (Static131.anInt2821 > arg1.anInt6183) {
			Static190.method3000(arg1, false);
			local9 = Static171.anInt3396;
			local7 = Static413.anInt6892;
		} else {
			Static360.method5481(arg1);
		}
		if (arg1.anInt6119 < 128 || arg1.anInt6121 < 128 || Static229.anInt4427 * 128 - 128 <= arg1.anInt6119 || Static379.anInt6422 * 128 - 128 <= arg1.anInt6121) {
			arg1.anInt6181 = 0;
			arg1.anInt6163 = -1;
			arg1.anInt6150 = -1;
			arg1.anInt6126 = -1;
			local7 = -1;
			arg1.anInt6183 = 0;
			local9 = 0;
			arg1.anInt6119 = arg1.anIntArray525[0] * 128 + arg1.method4935() * 64;
			arg1.anInt6121 = arg1.anIntArray524[0] * 128 + arg1.method4935() * 64;
			arg1.method4933();
		}
		if (Static375.aClass3_Sub2_Sub1_Sub2_7 == arg1 && (arg1.anInt6119 < 1536 || arg1.anInt6121 < 1536 || Static229.anInt4427 * 128 - 1536 <= arg1.anInt6119 || (Static379.anInt6422 - 12) * 128 <= arg1.anInt6121)) {
			arg1.anInt6183 = 0;
			arg1.anInt6126 = -1;
			local9 = 0;
			arg1.anInt6163 = -1;
			local7 = -1;
			arg1.anInt6181 = 0;
			arg1.anInt6150 = -1;
			arg1.anInt6119 = arg1.anIntArray525[0] * 128 + arg1.method4935() * 64;
			arg1.anInt6121 = arg1.anIntArray524[0] * 128 + arg1.method4935() * 64;
			arg1.method4933();
		}
		@Pc(222) int local222 = Static50.method4936(arg1);
		Static395.method5210(local222, arg1, local9, local7);
		Static290.method4176(arg1);
	}
}
