import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!iv", name = "I", descriptor = "Lclient!ia;")
	public static Class102 aClass102_3;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
	public static void method2830() {
		@Pc(15) Class224 local15 = null;
		try {
			@Pc(20) Class128 local20 = Static303.aClass131_4.method3058("2");
			while (local20.anInt3727 == 0) {
				Static443.method5991(1L);
			}
			if (local20.anInt3727 == 1) {
				local15 = (Class224) local20.anObject4;
				@Pc(45) byte[] local45 = new byte[(int) local15.method5144()];
				@Pc(60) int local60;
				for (@Pc(47) int local47 = 0; local47 < local45.length; local47 += local60) {
					local60 = local15.method5142(local45, local47, local45.length - local47);
					if (local60 == -1) {
						throw new IOException("EOF");
					}
				}
				Static252.method3871(new Class2_Sub20(local45));
			}
		} catch (@Pc(88) Exception local88) {
		}
		try {
			if (local15 != null) {
				local15.method5141();
			}
		} catch (@Pc(95) Exception local95) {
		}
	}
}
