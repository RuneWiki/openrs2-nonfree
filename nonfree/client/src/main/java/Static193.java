import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
	public static int anInt4183 = -1;

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "[I")
	public static int[] anIntArray314 = new int[256];

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
	public static int anInt4185 = 0;

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
	public static int anInt4186 = 0;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1441 = Static64.method1101("gr-Un:");

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1442 = Static64.method1101("Players");

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1443 = aClass51_1442;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!mb;I)V")
	public static void method3237(@OriginalArg(0) Class70 arg0) {
		Static142.aClass70_31 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3238(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static125.anInt3564 = (short) arg1;
		Static217.anInt4594 = (short) arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIII)V")
	public static void method3239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static189.method3168(arg4);
		@Pc(6) int local6 = 0;
		@Pc(11) int local11 = arg4 - arg3;
		@Pc(18) int local18 = -arg4;
		@Pc(20) int local20 = arg4;
		if (local11 < 0) {
			local11 = 0;
		}
		@Pc(29) int local29 = local11;
		@Pc(32) int local32 = -local11;
		@Pc(36) int[] local36 = Static113.anIntArrayArray10[arg5];
		@Pc(38) int local38 = -1;
		@Pc(42) int local42 = local11 + arg0;
		@Pc(44) int local44 = -1;
		@Pc(48) int local48 = arg0 - local11;
		Static71.method1261(local36, arg0 - arg4, arg2, local48);
		Static71.method1261(local36, local48, arg1, local42);
		Static71.method1261(local36, local42, arg2, arg4 + arg0);
		while (local6 < local20) {
			local44 += 2;
			local38 += 2;
			local18 += local44;
			local32 += local38;
			if (local32 >= 0 && local29 >= 1) {
				Static220.anIntArray361[local29] = local6;
				local29--;
				local32 -= local29 << 1;
			}
			local6++;
			@Pc(139) int[] local139;
			@Pc(128) int[] local128;
			@Pc(122) int local122;
			@Pc(133) int local133;
			@Pc(179) int local179;
			@Pc(188) int local188;
			@Pc(184) int local184;
			if (local18 >= 0) {
				local20--;
				if (local20 >= local11) {
					local122 = local6 + arg0;
					local128 = Static113.anIntArrayArray10[arg5 - local20];
					local133 = arg0 - local6;
					local139 = Static113.anIntArrayArray10[local20 + arg5];
					Static71.method1261(local139, local133, arg2, local122);
					Static71.method1261(local128, local133, arg2, local122);
				} else {
					local128 = Static113.anIntArrayArray10[arg5 - local20];
					local133 = local6 + arg0;
					local139 = Static113.anIntArrayArray10[arg5 + local20];
					local122 = Static220.anIntArray361[local20];
					local179 = arg0 - local6;
					local184 = arg0 - local122;
					local188 = local122 + arg0;
					Static71.method1261(local139, local179, arg2, local184);
					Static71.method1261(local139, local184, arg1, local188);
					Static71.method1261(local139, local188, arg2, local133);
					Static71.method1261(local128, local179, arg2, local184);
					Static71.method1261(local128, local184, arg1, local188);
					Static71.method1261(local128, local188, arg2, local133);
				}
				local18 -= local20 << 1;
			}
			local139 = Static113.anIntArrayArray10[arg5 + local6];
			local128 = Static113.anIntArrayArray10[arg5 - local6];
			local122 = arg0 + local20;
			local133 = arg0 - local20;
			if (local6 < local11) {
				local179 = local29 >= local6 ? local29 : Static220.anIntArray361[local6];
				local188 = local179 + arg0;
				local184 = arg0 - local179;
				Static71.method1261(local139, local133, arg2, local184);
				Static71.method1261(local139, local184, arg1, local188);
				Static71.method1261(local139, local188, arg2, local122);
				Static71.method1261(local128, local133, arg2, local184);
				Static71.method1261(local128, local184, arg1, local188);
				Static71.method1261(local128, local188, arg2, local122);
			} else {
				Static71.method1261(local139, local133, arg2, local122);
				Static71.method1261(local128, local133, arg2, local122);
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLclient!mb;BLclient!mb;)V")
	public static void method3241(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(3) Class70 arg2) {
		Static116.aBoolean64 = arg0;
		Static64.aClass70_17 = arg1;
		Static16.aClass70_7 = arg2;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
	public static void method3242() {
		for (@Pc(11) int local11 = 0; local11 < Static226.anInt4738; local11++) {
			@Pc(17) int local17 = Static145.anIntArray216[local11];
			@Pc(21) Class5_Sub1_Sub1 local21 = Static191.aClass5_Sub1_Sub1Array1[local17];
			@Pc(25) int local25 = Static225.aClass1_Sub16_Sub1_4.method3793();
			if ((local25 & 0x4) != 0) {
				local25 += Static225.aClass1_Sub16_Sub1_4.method3793() << 8;
			}
			Static166.method2845(local17, local21, local25);
		}
	}
}
