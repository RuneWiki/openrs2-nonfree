import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!vo;")
	public static Class348 aClass348_53;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
	public static int[] anIntArray273;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!jb;")
	public static final Class161 aClass161_12 = new Class161(1);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public static int anInt5011 = -1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Z")
	public static boolean aBoolean353 = false;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "F")
	public static float aFloat107 = 0.0F;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method3888() {
		Static542.aClass262Array3 = new Class262[2000];
		Static28.anInt1048 = 0;
		Static407.anInt7866 = 0;
		Static560.aClass262Array4 = new Class262[500];
		Static123.anInt9178 = 0;
		Static477.anInt9047 = Static168.anInt3487;
		Static248.aClass262Array2 = new Class262[1000];
		Static590.anInt10586 = Static168.anInt3487;
		Static595.aBoolean721 = false;
		Static218.aClass262Array1 = new Class262[500];
		Static120.anInt2729 = 0;
		Static206.anIntArrayArrayArray23 = new int[Static218.anInt4559][Static10.anInt812 + 1][Static255.anInt5209 + 1];
		if (Static299.aClass7_12 instanceof l) {
			Static358.aBoolean477 = false;
		} else {
			Static358.aBoolean477 = true;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIILclient!r;I)Lclient!da;")
	public static Class65 method3889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class7 arg5) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(12) Class65 local12 = (Class65) Static228.aClass167_18.method3966(local6);
		if (local12 == null) {
			@Pc(30) Class59 local30 = Static485.method7071(Static383.aClass348_91, arg4);
			if (local30 == null) {
				return null;
			}
			if (local30.anInt1895 < 13) {
				local30.method1588();
			}
			local12 = arg5.method7828(local30, 2055, Static11.anInt815, 64, 768);
			Static228.aClass167_18.method3974(local6, local12);
		}
		local12 = local12.method7682((byte) 2, 2055, true);
		if (arg3 != 0) {
			local12.M(arg3);
		}
		if (arg2 != 0) {
			local12.MA(arg2);
		}
		if (arg0 != 0) {
			local12.W(arg0);
		}
		if (arg1 != 0) {
			local12.oa(0, arg1, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ll;Lclient!is;Lclient!ua;Lclient!la;IILjava/lang/String;IIIII)V")
	public static void method3890(@OriginalArg(0) Class198 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) Class45 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) int local16;
		if (Static300.anInt6053 == 4) {
			local16 = (int) Static189.aFloat83 & 0x3FFF;
		} else {
			local16 = (int) Static189.aFloat83 + Static136.anInt3033 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg1.anInt4806 / 2, arg1.anInt4831 / 2) + 10;
		@Pc(45) int local45 = arg9 * arg9 + arg4 * arg4;
		if (local37 * local37 < local45) {
			return;
		}
		@Pc(59) int local59 = Class262.anIntArray420[local16];
		@Pc(63) int local63 = Class262.anIntArray421[local16];
		if (Static300.anInt6053 != 4) {
			local59 = local59 * 256 / (Static273.anInt5737 + 256);
			local63 = local63 * 256 / (Static273.anInt5737 + 256);
		}
		@Pc(94) int local94 = local59 * arg9 + arg4 * local63 >> 14;
		@Pc(105) int local105 = local63 * arg9 - local59 * arg4 >> 14;
		@Pc(112) int local112 = arg0.method4761(100, null, arg5);
		@Pc(118) int local118 = local94 - local112 / 2;
		@Pc(126) int local126 = arg0.method4771(100, 0, arg5, null);
		if (local118 >= -arg1.anInt4806 && arg1.anInt4806 >= local118 && local105 >= -arg1.anInt4831 && arg1.anInt4831 >= local105) {
			arg3.method4852(1, null, arg2, 50, arg7, arg8, 0, 0, arg1.anInt4831 / 2 + arg8 - local126 - local105 - arg10, local112, arg6, arg5, 0, null, arg7 + local118 + arg1.anInt4806 / 2);
		}
	}
}
