import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
	public static int anInt2545;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
	public static int anInt2543 = -1;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
	public static int anInt2544 = -1;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
	public static int anInt2546 = -1;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ps;Z)V")
	public static void method2426(@OriginalArg(0) Class2_Sub29 arg0) {
		@Pc(14) byte[] local14 = new byte[24];
		if (Static346.aClass179_28 != null) {
			@Pc(26) int local26;
			try {
				Static346.aClass179_28.method4528(0L);
				Static346.aClass179_28.method4527(local14);
				for (local26 = 0; local26 < 24 && local14[local26] == 0; local26++) {
				}
				if (local26 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(48) Exception local48) {
				for (local26 = 0; local26 < 24; local26++) {
					local14[local26] = -1;
				}
			}
		}
		arg0.method5221(24, local14);
	}
}
