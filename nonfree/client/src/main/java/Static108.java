import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_25 = new Class179(42, 3);

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "J")
	public static long aLong59 = 0L;

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "[F")
	public static final float[] aFloatArray5 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)[Lclient!vfa;")
	public static Class361[] method1608() {
		return new Class361[] { Static632.aClass361_13, Static624.aClass361_12, Static241.aClass361_7 };
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!paa;I)Lclient!paa;")
	public static Class261 method1609(@OriginalArg(0) Class261 arg0) {
		@Pc(6) Class261 local6 = Static76.method1079(arg0);
		if (local6 == null) {
			local6 = arg0.aClass261_8;
		}
		return local6;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIII)V")
	public static void method1610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static379.anInt5914 <= arg3 - arg1 && arg1 + arg3 <= Static624.anInt10032 && arg2 - arg1 >= Static257.anInt4068 && arg2 + arg1 <= Static67.anInt1214) {
			Static474.method6405(arg4, arg1, arg2, arg3, arg5, arg0);
		} else {
			Static545.method7519(arg2, arg4, arg3, arg5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "([[BLclient!tp;B)V")
	public static void method1611(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class275_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(43) int local43;
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt9071; local14++) {
			Static48.method803();
			for (local20 = 0; local20 < Static228.anInt3704 >> 3; local20++) {
				for (local24 = 0; local24 < Static162.anInt2911 >> 3; local24++) {
					local34 = Static37.anIntArrayArrayArray1[local14][local20][local24];
					if (local34 != -1) {
						local43 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean674 || local43 == 0) {
							@Pc(57) int local57 = local34 >> 1 & 0x3;
							@Pc(63) int local63 = local34 >> 14 & 0x3FF;
							@Pc(69) int local69 = local34 >> 3 & 0x7FF;
							@Pc(80) int local80 = (local63 / 8 << 8) + (local69 / 8);
							for (@Pc(82) int local82 = 0; local82 < Static407.anIntArray620.length; local82++) {
								if (local80 == Static407.anIntArray620[local82] && arg0[local82] != null) {
									@Pc(104) Class2_Sub22 local104 = new Class2_Sub22(arg0[local82]);
									arg1.method7612(local57, local104, local69, local14, local63, Static230.aClass240Array1, local43, local20 * 8, local24 * 8);
									arg1.method7623(local12[0] == -1 ? local12 : null, local43, local24 * 8, local20 * 8, local104, local69, local63, local57, Static192.aClass95_4, local14);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg1.anInt9071; local20++) {
			Static48.method803();
			for (local24 = 0; local24 < Static228.anInt3704 >> 3; local24++) {
				for (local34 = 0; local34 < Static162.anInt2911 >> 3; local34++) {
					local43 = Static37.anIntArrayArrayArray1[local20][local24][local34];
					if (local43 == -1) {
						arg1.method7610(local20, local34 * 8, 8, 8, local24 * 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static382.aClass160_1 = Static355.aClass157_1.method3384(local12[2], Static263.aClass224_1, local12[1], local12[3], local12[0]);
			Static222.anInt3623 = local12[4];
		}
	}
}
