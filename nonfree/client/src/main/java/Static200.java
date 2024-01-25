import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
	public static int anInt3958 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method3285(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!es;I)V")
	public static void method3288(@OriginalArg(0) Class2_Sub15 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static407.anInt7071; local3++) {
			@Pc(9) int local9 = arg0.method4328();
			@Pc(13) int local13 = arg0.method4294();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static363.aClass136_Sub1Array2[local9] != null) {
				Static363.aClass136_Sub1Array2[local9].anInt4377 = local13;
			}
		}
	}
}
