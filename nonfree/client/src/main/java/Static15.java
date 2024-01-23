import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
	public static int anInt355;

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "Z")
	public static boolean aBoolean12;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "Lclient!ia;")
	public static Class51 aClass51_122 = Static64.method1101("null");

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
	public static int anInt354 = -1;

	@OriginalMember(owner = "client!bc", name = "M", descriptor = "[I")
	public static int[] anIntArray18 = new int[5];

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
	public static int anInt371 = 0;

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
	public static int anInt373 = 0;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public static void method289() {
		for (@Pc(11) int local11 = 0; local11 < Static226.anInt4738; local11++) {
			@Pc(17) int local17 = Static145.anIntArray216[local11];
			@Pc(21) Class5_Sub1_Sub2 local21 = Static168.aClass5_Sub1_Sub2Array1[local17];
			@Pc(25) int local25 = Static225.aClass1_Sub16_Sub1_4.method3793();
			if ((local25 & 0x8) != 0) {
				local21.anInt3621 = Static225.aClass1_Sub16_Sub1_4.method3783();
				if (local21.anInt3621 == 65535) {
					local21.anInt3621 = -1;
				}
			}
			if ((local25 & 0x4) != 0) {
				local21.aClass51_1249 = Static225.aClass1_Sub16_Sub1_4.method3781();
				local21.anInt3594 = 100;
			}
			@Pc(64) int local64;
			@Pc(68) int local68;
			if ((local25 & 0x1) != 0) {
				local64 = Static225.aClass1_Sub16_Sub1_4.method3793();
				local68 = Static225.aClass1_Sub16_Sub1_4.method3793();
				local21.method2791(Static109.anInt2430, local64, local68);
				local21.anInt3613 = Static109.anInt2430 + 300;
				local21.anInt3593 = Static225.aClass1_Sub16_Sub1_4.method3771();
			}
			if ((local25 & 0x40) != 0) {
				local21.anInt3630 = Static225.aClass1_Sub16_Sub1_4.method3794();
				local21.anInt3614 = Static225.aClass1_Sub16_Sub1_4.method3809();
			}
			if ((local25 & 0x2) != 0) {
				local21.anInt3622 = Static225.aClass1_Sub16_Sub1_4.method3805();
				local64 = Static225.aClass1_Sub16_Sub1_4.method3784();
				local21.anInt3611 = local64 >> 16;
				local21.anInt3631 = (local64 & 0xFFFF) + Static109.anInt2430;
				if (local21.anInt3622 == 65535) {
					local21.anInt3622 = -1;
				}
				local21.anInt3628 = 0;
				local21.anInt3605 = 0;
				if (Static109.anInt2430 < local21.anInt3631) {
					local21.anInt3605 = -1;
				}
			}
			if ((local25 & 0x80) != 0) {
				local64 = Static225.aClass1_Sub16_Sub1_4.method3805();
				local68 = Static225.aClass1_Sub16_Sub1_4.method3771();
				if (local64 == 65535) {
					local64 = -1;
				}
				Static23.method473(local21, local68, local64);
			}
			if ((local25 & 0x10) != 0) {
				local64 = Static225.aClass1_Sub16_Sub1_4.method3763();
				local68 = Static225.aClass1_Sub16_Sub1_4.method3763();
				local21.method2791(Static109.anInt2430, local64, local68);
			}
			if ((local25 & 0x20) != 0) {
				if (local21.aClass27_1.method603()) {
					Static82.method1410(local21);
				}
				local21.aClass27_1 = Static168.method2871(Static225.aClass1_Sub16_Sub1_4.method3809());
				local21.anInt3618 = local21.aClass27_1.anInt796;
				local21.anInt3584 = local21.aClass27_1.anInt822;
				local21.anInt3601 = local21.aClass27_1.anInt827;
				local21.anInt3600 = local21.aClass27_1.anInt815;
				local21.anInt3629 = local21.aClass27_1.anInt821;
				local21.anInt3623 = local21.aClass27_1.anInt807;
				local21.anInt3604 = local21.aClass27_1.anInt811;
				local21.anInt3580 = local21.aClass27_1.anInt819;
				local21.anInt3625 = local21.aClass27_1.anInt801;
				if (local21.aClass27_1.method603()) {
					Static187.method3123(local21, local21.anIntArray238[0], null, Static197.anInt2422, null, 0, local21.anIntArray233[0]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!mb;I)Lclient!ak;")
	public static Class1_Sub2_Sub1_Sub1 method291(@OriginalArg(1) Class70 arg0, @OriginalArg(2) int arg1) {
		return Static118.method1947(arg0, arg1) ? Static106.method1808() : null;
	}
}
