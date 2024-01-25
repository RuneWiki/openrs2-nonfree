import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!at", name = "j", descriptor = "I")
	public static int anInt304 = -1;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!vn;)V")
	public static void method281(@OriginalArg(0) Class8_Sub3 arg0) {
		for (@Pc(2) int local2 = arg0.aShort100; local2 <= arg0.aShort101; local2++) {
			for (@Pc(6) int local6 = arg0.aShort99; local6 <= arg0.aShort98; local6++) {
				@Pc(16) Class75 local16 = Static432.aClass75ArrayArrayArray6[arg0.aByte99][local2][local6];
				if (local16 != null) {
					@Pc(21) Class251 local21 = local16.aClass251_2;
					@Pc(23) Class251 local23 = null;
					while (local21 != null) {
						if (local21.aClass8_Sub3_2 == arg0) {
							if (local23 == null) {
								local16.aClass251_2 = local21.aClass251_3;
							} else {
								local23.aClass251_3 = local21.aClass251_3;
							}
							local21.method5637();
							break;
						}
						local23 = local21;
						local21 = local21.aClass251_3;
					}
					local16.aByte25 = 0;
					for (@Pc(56) Class251 local56 = local16.aClass251_2; local56 != null; local56 = local56.aClass251_3) {
						local16.aByte25 = (byte) (local16.aByte25 | local56.anInt7018);
					}
				}
			}
		}
	}
}
