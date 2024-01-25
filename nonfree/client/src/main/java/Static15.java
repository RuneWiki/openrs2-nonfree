import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
	public static int anInt493;

	@OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
	public static int anInt500;

	@OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
	public static int anInt503;

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "Lclient!en;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!ba", name = "L", descriptor = "Ljava/lang/String;")
	public static final String aString32 = "shake:";

	@OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
	public static int anInt502 = 2;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!en;BLclient!nl;I)V")
	public static void method516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(4) Class137 arg3, @OriginalArg(5) int arg4) {
		@Pc(13) Class188 local13 = Static316.method5384(arg3.anInt4130);
		if (local13.anInt5702 == -1) {
			return;
		}
		if (arg3.aBoolean292) {
			@Pc(31) int local31 = arg1 + arg3.anInt4127;
			arg1 = local31 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(43) Class54 local43 = local13.method5042(arg1, arg3.aBoolean302, arg2);
		if (local43 == null) {
			return;
		}
		@Pc(49) int local49 = arg3.anInt4126;
		@Pc(52) int local52 = arg3.anInt4166;
		if ((arg1 & 0x1) == 1) {
			local49 = arg3.anInt4166;
			local52 = arg3.anInt4126;
		}
		@Pc(68) int local68 = local43.method5560();
		@Pc(71) int local71 = local43.method5576();
		if (local13.aBoolean425) {
			local71 = local52 * 4;
			local68 = local49 * 4;
		}
		if (local13.anInt5705 == 0) {
			local43.method5578(arg0, arg4 + 4 - local52 * 4, local68, local71);
		} else {
			local43.method5573(arg0, arg4 + 4 - local52 * 4, local68, local71, 1, local13.anInt5705 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)Lclient!dh;")
	public static Class47_Sub1 method517() {
		return Static285.anInt5768 < Static63.aClass47_Sub1Array1.length ? Static63.aClass47_Sub1Array1[Static285.anInt5768++] : null;
	}

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "(I)V")
	public static void method518() {
		while (true) {
			@Pc(15) Class5_Sub32 local15 = (Class5_Sub32) Static145.aClass211_38.method5596();
			if (local15 == null) {
				return;
			}
			if (Static138.aClass51ArrayArrayArray1 != null) {
				@Pc(40) Class25_Sub1_Sub1 local40;
				@Pc(31) int local31;
				if (local15.anInt4196 < 0) {
					local31 = -local15.anInt4196 - 1;
					if (Static99.anInt2186 == local31) {
						local40 = Static85.aClass25_Sub1_Sub1_Sub1_1;
					} else {
						local40 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local31];
					}
				} else {
					local31 = local15.anInt4196 - 1;
					local40 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local31];
				}
				if (local40 != null) {
					@Pc(64) Class137 local64 = Static228.method3923(local15.anInt4198);
					@Pc(79) int local79;
					@Pc(82) int local82;
					if (local15.anInt4193 == 1 || local15.anInt4193 == 3) {
						local79 = local64.anInt4166;
						local82 = local64.anInt4126;
					} else {
						local82 = local64.anInt4166;
						local79 = local64.anInt4126;
					}
					@Pc(98) int local98 = local15.anInt4192 + (local79 >> 1);
					@Pc(107) int local107 = (local79 + 1 >> 1) + local15.anInt4192;
					@Pc(115) int local115 = local15.anInt4194 + (local82 >> 1);
					@Pc(125) int local125 = local15.anInt4194 + (local82 + 1 >> 1);
					@Pc(130) Class3 local130 = Static130.aClass3Array2[local40.aByte62];
					@Pc(155) int local155 = local130.method5638(local98, local115) + local130.method5638(local107, local115) + local130.method5638(local98, local125) + local130.method5638(local107, local125) >> 2;
					@Pc(157) Interface8 local157 = null;
					@Pc(162) int local162 = Static353.anIntArray564[local15.anInt4200];
					if (local162 == 0) {
						local157 = (Interface8) Static178.method3304(local40.aByte62, local15.anInt4192, local15.anInt4194);
					} else if (local162 == 1) {
						local157 = (Interface8) Static258.method4479(local40.aByte62, local15.anInt4192, local15.anInt4194);
					} else if (local162 == 2) {
						local157 = (Interface8) Static82.method1816(local40.aByte62, local15.anInt4192, local15.anInt4194, sl.class);
					} else if (local162 == 3) {
						local157 = (Interface8) Static251.method4403(local40.aByte62, local15.anInt4192, local15.anInt4194);
					}
					if (local157 != null) {
						Static181.method3374(local15.anInt4192, local40.aByte62, -1, 0, local15.anInt4194, local162, local15.anInt4195 + 1, local15.anInt4204, 0);
						local40.anInt5338 = Static180.anInt3606 + local15.anInt4204;
						local40.anInt5335 = local15.anInt4195 + Static180.anInt3606;
						local40.anInt5345 = local79 * 64 + local15.anInt4192 * 128;
						local40.anInt5342 = local155;
						local40.anInterface8_3 = local157;
						local40.anInt5344 = local15.anInt4194 * 128 + local82 * 64;
						@Pc(285) int local285 = local15.anInt4191;
						@Pc(288) int local288 = local15.anInt4197;
						@Pc(291) int local291 = local15.anInt4201;
						@Pc(294) int local294 = local15.anInt4199;
						@Pc(303) int local303;
						if (local285 > local288) {
							local303 = local285;
							local285 = local288;
							local288 = local303;
						}
						local40.anInt5343 = local15.anInt4192 + local288;
						local40.anInt5339 = local285 + local15.anInt4192;
						if (local294 < local291) {
							local303 = local291;
							local291 = local294;
							local294 = local303;
						}
						local40.anInt5333 = local291 + local15.anInt4194;
						local40.anInt5336 = local15.anInt4194 + local294;
					}
				}
			}
		}
	}
}
