import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public static int anInt1044;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "[I")
	public static int[] anIntArray87 = new int[128];

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BJ)V")
	public static void method780(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(15) InterruptedException local15) {
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)J")
	public static long method783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass61_1 == null ? 0L : local7.aClass61_1.aLong89;
	}
}
