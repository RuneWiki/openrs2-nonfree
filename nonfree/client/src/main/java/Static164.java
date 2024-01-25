import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "[I")
	public static final int[] anIntArray687 = new int[14];

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_274 = new Class235(58, 6);

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "[I")
	public static int[] anIntArray688 = new int[2];

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
	public static int anInt9118 = 0;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "Z")
	public static boolean aBoolean703 = false;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!de;B)V")
	public static void method7466(@OriginalArg(0) Class8_Sub3_Sub3_Sub1_Sub1 arg0) {
		@Pc(19) Class1_Sub38 local19 = (Class1_Sub38) Static478.aClass187_41.method3797((long) arg0.anInt6821);
		if (local19 == null) {
			Static229.method3478(arg0.anIntArray534[0], null, arg0.aByte123, arg0.anIntArray533[0], null, 0, arg0);
		} else {
			local19.method4951();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIII[B)V")
	public static void method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		arg0 += arg2;
		@Pc(19) int local19 = arg1 - arg2 >> 2;
		while (true) {
			local19--;
			if (local19 < 0) {
				local19 = arg1 - arg2 & 0x3;
				while (true) {
					local19--;
					if (local19 < 0) {
						return;
					}
					arg3[arg0++] = 1;
				}
			}
			@Pc(26) int local26 = arg0 + 1;
			arg3[arg0] = 1;
			@Pc(31) int local31 = local26 + 1;
			arg3[local26] = 1;
			@Pc(36) int local36 = local31 + 1;
			arg3[local31] = 1;
			arg0 = local36 + 1;
			arg3[local36] = 1;
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	public static void method7470() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static166.aBooleanArray5[local7] = true;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBI)Z")
	public static boolean method7473(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
	public static void method7475() {
		Static42.aClass222_3.method4428();
	}
}
