import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!js", name = "i", descriptor = "[Lclient!dp;")
	public static Class51[] aClass51Array12;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "I")
	public static final int anInt3224 = -1;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_81 = new Class211(94, 9);

	@OriginalMember(owner = "client!js", name = "g", descriptor = "J")
	public static volatile long aLong102 = 0L;

	@OriginalMember(owner = "client!js", name = "h", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_82 = new Class211(69, 0);

	@OriginalMember(owner = "client!js", name = "j", descriptor = "Lclient!es;")
	public static final Class73 aClass73_3 = new Class73("LOCAL", 4);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BIII)Lclient!sk;")
	public static Class25_Sub1_Sub1 method2609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class132 local16 = Static25.aClass132ArrayArrayArray1[arg1][arg0][arg2];
		if (local16 == null) {
			return null;
		}
		@Pc(22) Class25_Sub1_Sub1 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class116 local27 = local16.aClass116_3; local27 != null; local27 = local27.aClass116_2) {
			@Pc(31) Class25_Sub1 local31 = local27.aClass25_Sub1_1;
			if (local31 instanceof Class25_Sub1_Sub1) {
				@Pc(37) Class25_Sub1_Sub1 local37 = (Class25_Sub1_Sub1) local31;
				@Pc(47) int local47 = local37.method1877() * 64 + 60 - 64;
				@Pc(55) int local55 = local37.anInt6080 - local47 >> 7;
				@Pc(63) int local63 = local37.anInt6077 - local47 >> 7;
				@Pc(70) int local70 = local47 + local37.anInt6080 >> 7;
				@Pc(78) int local78 = local37.anInt6077 + local47 >> 7;
				if (local55 <= arg0 && local63 <= arg2 && arg0 <= local70 && local78 >= arg2) {
					@Pc(112) int local112 = (local78 + 1 - arg2) * (-arg0 + (local70 - -1));
					if (local112 > local24) {
						local24 = local112;
						local22 = local37;
					}
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([[BLclient!jb;B)V")
	public static void method2611(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class115_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg1.anInt2995; local18++) {
			Static44.method683();
			for (@Pc(24) int local24 = 0; local24 < Static92.anInt1675 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static262.anInt6340 >> 3; local28++) {
					@Pc(32) boolean local32 = false;
					@Pc(40) int local40 = Static384.anIntArrayArrayArray14[local18][local24][local28];
					if (local40 != -1) {
						@Pc(49) int local49 = local40 >> 24 & 0x3;
						if (!arg1.aBoolean255 || local49 == 0) {
							@Pc(60) int local60 = local40 >> 1 & 0x3;
							@Pc(66) int local66 = local40 >> 14 & 0x3FF;
							@Pc(72) int local72 = local40 >> 3 & 0x7FF;
							@Pc(83) int local83 = (local66 / 8 << 8) + (local72 / 8);
							for (@Pc(85) int local85 = 0; local85 < Static223.anIntArray480.length; local85++) {
								if (local83 == Static223.anIntArray480[local85] && arg0[local85] != null) {
									@Pc(107) Class1_Sub33 local107 = new Class1_Sub33(arg0[local85]);
									arg1.method2447(local24 * 8, local66, local18, local28 * 8, Static257.aClass222Array1, local49, local60, local72, local107);
									local32 = true;
									arg1.method2469(local28 * 8, local49, local24 * 8, Static66.aClass164_2, local18, local72, local66, local60, local107, local12[0] == -1 ? local12 : null);
									break;
								}
							}
						}
					}
					if (!local32) {
						arg1.method2455(local24 * 8, local18, local28 * 8, 8, 8);
					}
				}
			}
		}
		if (local12[0] == -1) {
			Static177.aClass33_3 = null;
		} else {
			Static177.aClass33_3 = Static274.aClass63_1.method1190(local12[2], local12[0], Static301.aClass31_1, local12[3], local12[1]);
			Static177.anInt1347 = local12[4];
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!bg;I)I")
	public static int method2612(@OriginalArg(0) Class25_Sub1_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt576;
		@Pc(12) Class8 local12 = arg0.method1880();
		if (arg0.aBoolean191) {
			local8 = arg0.anInt605;
		} else if (arg0.anInt2340 == local12.anInt128 || arg0.anInt2340 == local12.anInt138 || local12.anInt150 == arg0.anInt2340 || arg0.anInt2340 == local12.anInt133) {
			local8 = arg0.anInt583;
		} else if (local12.anInt151 == arg0.anInt2340 || arg0.anInt2340 == local12.anInt137 || arg0.anInt2340 == local12.anInt122 || arg0.anInt2340 == local12.anInt145) {
			local8 = arg0.anInt604;
		}
		return local8;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IZIIII)V")
	public static void method2613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg4; local7++) {
			Static382.method5419(Static369.anIntArrayArray35[local7], arg1, arg0, arg3);
		}
	}
}
