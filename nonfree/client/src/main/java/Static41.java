import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
	public static int anInt1301;

	@OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
	public static int anInt1307;

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
	public static int anInt1308;

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "[I")
	public static final int[] anIntArray105 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
	public static int anInt1306 = 2;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!il;IIIII)V")
	public static void method965(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6684 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static150.anIntArrayArrayArray9[arg1][local4][local7];
				@Pc(18) int local18 = 0;
				while (true) {
					label49: while (true) {
						if (local18 > 24) {
							continue label54;
						}
						@Pc(25) int local25 = local16 >>> local18 & 0xFF;
						if (local25 <= 0) {
							continue label54;
						}
						@Pc(33) Class1_Sub30_Sub1 local33 = Static309.aClass1_Sub30_Sub1Array2[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt6684; local35++) {
							if (arg0.aClass1_Sub30_Sub1Array3[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass1_Sub30_Sub1Array3[arg0.anInt6684++] = local33;
						if (arg0.anInt6684 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt6684; local7 < 4; local7++) {
			arg0.aClass1_Sub30_Sub1Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!be;)V")
	public static void method966(@OriginalArg(1) Class17_Sub1_Sub1_Sub1 arg0) {
		@Pc(21) Class1_Sub22 local21 = (Class1_Sub22) Static248.aClass197_24.method5157((long) arg0.anInt4867);
		if (local21 == null) {
			Static209.method3980(0, arg0, null, null, Static242.anInt6745, arg0.anIntArray438[0], arg0.anIntArray439[0]);
		} else {
			local21.method2812();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method968(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static104.method2136(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)V")
	public static void method969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub4_Sub9 local8 = Static139.method4227(arg2, 4);
		local8.method1869();
		local8.anInt2145 = arg3;
		local8.anInt2148 = arg0;
		local8.anInt2142 = arg1;
	}
}
