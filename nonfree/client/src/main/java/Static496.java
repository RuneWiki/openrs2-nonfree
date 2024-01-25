import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
	public static int anInt8826;

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
	public static int anInt8827;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "I")
	public static int anInt8825 = 0;

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "I")
	public static int anInt8830 = 0;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IZLclient!mea;I)V")
	public static void method7328(@OriginalArg(0) int arg0, @OriginalArg(2) Class230 arg1, @OriginalArg(3) int arg2) {
		if (Static299.aClass230_4 != null || Static505.aBoolean629 || (arg1 == null || Static93.method6852(arg1) == null)) {
			return;
		}
		Static299.aClass230_4 = arg1;
		Static176.aClass230_2 = Static93.method6852(arg1);
		Static325.anInt6166 = arg2;
		Static96.aBoolean171 = false;
		Static260.anInt4561 = arg0;
		Static147.anInt2822 = 0;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7329(@OriginalArg(1) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			local18 = (local18 << 5) + Static591.method8411(arg0.charAt(local20)) - local18;
		}
		return local18;
	}
}
