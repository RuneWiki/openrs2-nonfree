import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
	public static int anInt3891;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!ka;")
	public static Class8_Sub8_Sub2 aClass8_Sub8_Sub2_2;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)V")
	public static void method3023(@OriginalArg(0) int arg0) {
		if (!Static92.method1483(arg0)) {
			return;
		}
		@Pc(15) Class159[] local15 = Static210.aClass159ArrayArray6[arg0];
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(25) Class159 local25 = local15[local17];
			if (local25 != null) {
				local25.anInt5194 = 0;
				local25.anInt5137 = 1;
				local25.anInt5175 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method3025(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
