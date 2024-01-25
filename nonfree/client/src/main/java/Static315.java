import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	public static int anInt6124;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Z")
	public static boolean aBoolean594 = false;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
	public static final int[] anIntArray498 = new int[32];

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "S")
	public static short aShort89 = 32767;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
	public static int method5212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(29) int local29 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local29;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public static void method5213() {
		while (true) {
			if (Static311.aClass1_Sub8_Sub1_8.method3237(Static85.anInt5393) >= 11) {
				@Pc(18) int local18 = Static311.aClass1_Sub8_Sub1_8.method3238(11);
				if (local18 != 2047) {
					@Pc(23) boolean local23 = false;
					if (Static102.aClass17_Sub1_Sub1_Sub1Array1[local18] == null) {
						Static102.aClass17_Sub1_Sub1_Sub1Array1[local18] = new Class17_Sub1_Sub1_Sub1();
						Static102.aClass17_Sub1_Sub1_Sub1Array1[local18].anInt4867 = local18;
						local23 = true;
						if (Static313.aClass1_Sub8Array1[local18] != null) {
							Static102.aClass17_Sub1_Sub1_Sub1Array1[local18].method564(Static313.aClass1_Sub8Array1[local18]);
						}
					}
					Static298.anIntArray492[Static357.anInt4331++] = local18;
					@Pc(64) Class17_Sub1_Sub1_Sub1 local64 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local18];
					local64.anInt4852 = Static5.anInt208;
					@Pc(72) int local72 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
					if (local72 == 1) {
						Static191.anIntArray373[Static125.anInt2818++] = local18;
					}
					@Pc(88) int local88 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
					@Pc(95) int local95 = Static210.anIntArray407[Static311.aClass1_Sub8_Sub1_8.method3238(3)];
					@Pc(100) int local100 = Static311.aClass1_Sub8_Sub1_8.method3238(5);
					if (local100 > 15) {
						local100 -= 32;
					}
					@Pc(111) int local111 = Static311.aClass1_Sub8_Sub1_8.method3238(5);
					if (local111 > 15) {
						local111 -= 32;
					}
					if (local23) {
						local64.method4323(local95);
					}
					local64.method560(local88 == 1, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0] + local111, Static242.anInt6745, local100 + Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0]);
					continue;
				}
			}
			Static311.aClass1_Sub8_Sub1_8.method3235();
			return;
		}
	}
}
