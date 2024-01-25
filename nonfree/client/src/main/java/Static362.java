import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
	public static int anInt7191 = 0;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Z")
	public static boolean aBoolean525 = false;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_145 = new Class215(50, -1);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method6134() {
		@Pc(12) Class320 local12 = null;
		try {
			@Pc(18) Class240 local18 = Static268.aClass370_3.method9068("2");
			while (local18.anInt7566 == 0) {
				Static190.method3914(1L);
			}
			if (local18.anInt7566 == 1) {
				local12 = (Class320) local18.anObject13;
				@Pc(45) byte[] local45 = new byte[(int) local12.method7910()];
				@Pc(60) int local60;
				for (@Pc(47) int local47 = 0; local47 < local45.length; local47 += local60) {
					local60 = local12.method7904(local45, local47, local45.length - local47);
					if (local60 == -1) {
						throw new IOException("EOF");
					}
				}
				Static428.method5145(new Class2_Sub11(local45));
			}
		} catch (@Pc(89) Exception local89) {
		}
		try {
			if (local12 != null) {
				local12.method7905();
			}
		} catch (@Pc(96) Exception local96) {
		}
	}
}
