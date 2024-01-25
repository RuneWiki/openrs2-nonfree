import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	public static int anInt850;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
	public static int anInt851 = 100;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "Lclient!mga;")
	public static final Class230 aClass230_1 = new Class230();

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	public static void method787() {
		@Pc(7) Class80 local7 = null;
		try {
			@Pc(18) Class281 local18 = Static239.aClass207_2.method4574("2");
			while (local18.anInt7338 == 0) {
				Static491.method6679(1L);
			}
			if (local18.anInt7338 == 1) {
				local7 = (Class80) local18.anObject17;
				@Pc(45) byte[] local45 = new byte[(int) local7.method2120()];
				@Pc(60) int local60;
				for (@Pc(47) int local47 = 0; local47 < local45.length; local47 += local60) {
					local60 = local7.method2121(local47, local45.length - local47, local45);
					if (local60 == -1) {
						throw new IOException("EOF");
					}
				}
				Static312.method4346(new Class4_Sub11(local45));
			}
		} catch (@Pc(89) Exception local89) {
		}
		try {
			if (local7 != null) {
				local7.method2118();
			}
		} catch (@Pc(96) Exception local96) {
		}
	}
}
