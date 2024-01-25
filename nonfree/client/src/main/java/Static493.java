import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Lclient!kt;")
	public static final Class178 aClass178_12 = new Class178(1);

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	public static int anInt8604 = 1;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "Lclient!kba;")
	public static final Class163 aClass163_51 = new Class163();

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "Lclient!hda;")
	public static final Class129 aClass129_7 = new Class129(5, 1);

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "J")
	public static long aLong236 = 1L;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!em;I)V")
	public static void method7161(@OriginalArg(0) Class6_Sub5_Sub9 arg0) {
		if (Static199.aBoolean358) {
			return;
		}
		arg0.method8792();
		Static611.anInt10324--;
		if (!arg0.aBoolean254) {
			@Pc(26) long local26 = arg0.aLong79;
			@Pc(32) Class6_Sub5_Sub11 local32;
			for (local32 = (Class6_Sub5_Sub11) Static565.aClass380_46.method8747(local26); local32 != null && !local32.aString28.equals(arg0.aString25); local32 = (Class6_Sub5_Sub11) Static565.aClass380_46.method8750()) {
			}
			if (local32 != null && local32.method2841(arg0)) {
				Static20.method604(local32);
				return;
			}
			return;
		}
		for (@Pc(63) Class6_Sub5_Sub11 local63 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6055(); local63 != null; local63 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6050()) {
			if (local63.aString28.equals(arg0.aString25)) {
				@Pc(73) boolean local73 = false;
				for (@Pc(79) Class6_Sub5_Sub9 local79 = (Class6_Sub5_Sub9) local63.aClass231_2.method6055(); local79 != null; local79 = (Class6_Sub5_Sub9) local63.aClass231_2.method6050()) {
					if (local79 == arg0) {
						if (local63.method2841(arg0)) {
							Static20.method604(local63);
						}
						local73 = true;
						break;
					}
				}
				if (local73) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!gaa;B)V")
	public static void method7164(@OriginalArg(0) int arg0, @OriginalArg(1) Class113 arg1) {
		if (Static530.anInt9223 >= 50 || (arg1 == null || arg1.anIntArrayArray16 == null || arg1.anIntArrayArray16.length <= arg0 || arg1.anIntArrayArray16[arg0] == null)) {
			return;
		}
		@Pc(36) int local36 = arg1.anIntArrayArray16[arg0][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(57) int local57;
		if (arg1.anIntArrayArray16[arg0].length > 1) {
			local57 = (int) (Math.random() * (double) arg1.anIntArrayArray16[arg0].length);
			if (local57 > 0) {
				local40 = arg1.anIntArrayArray16[arg0][local57];
			}
		}
		@Pc(72) int local72 = local36 >> 5 & 0x7;
		local57 = 256;
		if (arg1.anIntArray175 != null && arg1.anIntArray177 != null) {
			local57 = Static276.method8005(arg1.anIntArray175[arg0], arg1.anIntArray177[arg0]);
		}
		if (arg1.aBoolean307) {
			Static141.method2795(255, local72, local40, false, 0, local57);
		} else {
			Static523.method7452(local57, local40, local72, 0, 255);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIILclient!qfa;)V")
	public static void method7165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub45 arg4) {
		if (arg4.anInt8269 == -1 && arg4.anIntArray428 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(26) int local26 = arg4.anInt8284 * Static87.aClass6_Sub33_6.aClass14_Sub22_1.method7288() >> 8;
		if (arg2 > arg4.anInt8278) {
			local16 = arg2 - arg4.anInt8278;
		} else if (arg2 < arg4.anInt8283) {
			local16 = arg4.anInt8283 - arg2;
		}
		if (arg4.anInt8270 < arg0) {
			local16 += arg0 - arg4.anInt8270;
		} else if (arg4.anInt8280 > arg0) {
			local16 += arg4.anInt8280 - arg0;
		}
		if (arg4.anInt8282 == 0 || local16 - 256 > arg4.anInt8282 || Static87.aClass6_Sub33_6.aClass14_Sub22_1.method7288() == 0 || arg4.anInt8274 != arg1) {
			if (arg4.aClass6_Sub4_Sub5_3 != null) {
				Static152.aClass6_Sub4_Sub3_2.method5197(arg4.aClass6_Sub4_Sub5_3);
				arg4.aClass6_Sub27_Sub1_3 = null;
				arg4.aClass6_Sub4_Sub5_3 = null;
				arg4.aClass6_Sub20_1 = null;
			}
			if (arg4.aClass6_Sub4_Sub5_2 != null) {
				Static152.aClass6_Sub4_Sub3_2.method5197(arg4.aClass6_Sub4_Sub5_2);
				arg4.aClass6_Sub27_Sub1_2 = null;
				arg4.aClass6_Sub20_2 = null;
				arg4.aClass6_Sub4_Sub5_2 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(163) int local163 = arg4.anInt8282 - arg4.anInt8272;
		if (local163 < 0) {
			local163 = arg4.anInt8282;
		}
		@Pc(173) int local173 = local26;
		@Pc(178) int local178 = local16 - arg4.anInt8272;
		if (local178 > 0 && local163 > 0) {
			local173 = local26 * (local163 - local178) / local163;
		}
		Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3620();
		@Pc(204) int local204 = 8192;
		@Pc(215) int local215 = (arg4.anInt8283 + arg4.anInt8278) / 2 - arg2;
		@Pc(225) int local225 = (arg4.anInt8280 + arg4.anInt8270) / 2 - arg0;
		@Pc(249) int local249;
		@Pc(266) int local266;
		if (local215 != 0 || local225 != 0) {
			local249 = -Static349.anInt6848 - (int) (Math.atan2((double) local215, (double) local225) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local249 > 8192) {
				local249 = 16384 - local249;
			}
			if (local16 <= 0) {
				local266 = 8192;
			} else if (local16 >= 4096) {
				local266 = 16384;
			} else {
				local266 = local16 * 8192 / 4096 + 8192;
			}
			local204 = (16384 - local266 >> 1) + local266 * local249 / 8192;
		}
		@Pc(394) Class6_Sub4_Sub5 local394;
		if (arg4.aClass6_Sub4_Sub5_3 != null) {
			arg4.aClass6_Sub4_Sub5_3.method8672(local173);
			arg4.aClass6_Sub4_Sub5_3.method8676(local204);
		} else if (arg4.anInt8269 >= 0) {
			local249 = arg4.anInt8285 == 256 && arg4.anInt8277 == 256 ? 256 : Static276.method8005(arg4.anInt8277, arg4.anInt8285);
			if (arg4.aBoolean661) {
				if (arg4.aClass6_Sub20_1 == null) {
					arg4.aClass6_Sub20_1 = Static172.method3243(Static360.aClass223_74, arg4.anInt8269);
				}
				if (arg4.aClass6_Sub20_1 != null) {
					if (arg4.aClass6_Sub27_Sub1_3 == null) {
						arg4.aClass6_Sub27_Sub1_3 = arg4.aClass6_Sub20_1.method3238(new int[] { 22050 });
					}
					if (arg4.aClass6_Sub27_Sub1_3 != null) {
						local394 = Static656.method8647(arg4.aClass6_Sub27_Sub1_3, local249, local173 << 6, local204);
						local394.method8667(-1);
						Static152.aClass6_Sub4_Sub3_2.method5194(local394);
						arg4.aClass6_Sub4_Sub5_3 = local394;
					}
				}
			} else {
				@Pc(330) Class51 local330 = Static648.method2092(Static168.aClass223_47, arg4.anInt8269, 0);
				if (local330 != null) {
					@Pc(337) Class6_Sub27_Sub1 local337 = local330.method2094().method4220(Static286.aClass321_2);
					@Pc(345) Class6_Sub4_Sub5 local345 = Static656.method8647(local337, local249, local173 << 6, local204);
					local345.method8667(-1);
					Static152.aClass6_Sub4_Sub3_2.method5194(local345);
					arg4.aClass6_Sub4_Sub5_3 = local345;
				}
			}
		}
		if (arg4.aClass6_Sub4_Sub5_2 != null) {
			arg4.aClass6_Sub4_Sub5_2.method8672(local173);
			arg4.aClass6_Sub4_Sub5_2.method8676(local204);
			if (arg4.aClass6_Sub4_Sub5_2.method8791()) {
				return;
			}
			arg4.aClass6_Sub4_Sub5_2 = null;
			arg4.aClass6_Sub20_2 = null;
			arg4.aClass6_Sub27_Sub1_2 = null;
		} else if (arg4.anIntArray428 != null && (arg4.anInt8275 -= arg3) <= 0) {
			local249 = arg4.anInt8285 == 256 && arg4.anInt8277 == 256 ? 256 : arg4.anInt8277 + (int) (Math.random() * (double) (arg4.anInt8285 - arg4.anInt8277));
			if (arg4.aBoolean663) {
				if (arg4.aClass6_Sub20_2 == null) {
					local266 = (int) (Math.random() * (double) arg4.anIntArray428.length);
					arg4.aClass6_Sub20_2 = Static172.method3243(Static360.aClass223_74, arg4.anIntArray428[local266]);
				}
				if (arg4.aClass6_Sub20_2 != null) {
					if (arg4.aClass6_Sub27_Sub1_2 == null) {
						arg4.aClass6_Sub27_Sub1_2 = arg4.aClass6_Sub20_2.method3238(new int[] { 22050 });
					}
					if (arg4.aClass6_Sub27_Sub1_2 != null) {
						local394 = Static656.method8647(arg4.aClass6_Sub27_Sub1_2, local249, local173 << 6, local204);
						local394.method8667(0);
						Static152.aClass6_Sub4_Sub3_2.method5194(local394);
						arg4.aClass6_Sub4_Sub5_2 = local394;
						arg4.anInt8275 = (int) (Math.random() * (double) (arg4.anInt8268 - arg4.anInt8273)) + arg4.anInt8273;
						return;
					}
				}
				return;
			}
			local266 = (int) (Math.random() * (double) arg4.anIntArray428.length);
			@Pc(546) Class51 local546 = Static648.method2092(Static168.aClass223_47, arg4.anIntArray428[local266], 0);
			if (local546 != null) {
				@Pc(553) Class6_Sub27_Sub1 local553 = local546.method2094().method4220(Static286.aClass321_2);
				@Pc(561) Class6_Sub4_Sub5 local561 = Static656.method8647(local553, local249, local173 << 6, local204);
				local561.method8667(0);
				Static152.aClass6_Sub4_Sub3_2.method5194(local561);
				arg4.anInt8275 = (int) ((double) (arg4.anInt8268 - arg4.anInt8273) * Math.random()) + arg4.anInt8273;
				arg4.aClass6_Sub4_Sub5_2 = local561;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	public static void method7167() {
		@Pc(1) Class94 local1 = Static378.aClass94_34;
		synchronized (Static378.aClass94_34) {
			Static378.aClass94_34.method2952();
		}
		local1 = Static403.aClass94_38;
		synchronized (Static403.aClass94_38) {
			Static403.aClass94_38.method2952();
		}
	}
}
