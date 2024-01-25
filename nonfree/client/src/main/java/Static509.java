import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!ria", name = "g", descriptor = "B")
	public static byte aByte124;

	@OriginalMember(owner = "client!ria", name = "j", descriptor = "[I")
	public static final int[] anIntArray561 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(III)V")
	public static void method7242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static571.method7962(local7.aClass2_Sub1_Sub4_2);
		Static571.method7962(local7.aClass2_Sub1_Sub4_1);
		if (local7.aClass2_Sub1_Sub4_2 != null) {
			local7.aClass2_Sub1_Sub4_2 = null;
		}
		if (local7.aClass2_Sub1_Sub4_1 != null) {
			local7.aClass2_Sub1_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V")
	public static void method7248() {
		for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
			Static224.aBooleanArray12[local8] = true;
		}
	}
}
