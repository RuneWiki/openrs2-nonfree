import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!kt", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString46 = "";

	@OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
	public static int anInt3769 = -1;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!nj;Z)Ljava/lang/String;")
	public static String method3237(@OriginalArg(0) Class3_Sub25 arg0) {
		return Static425.method1940(arg0);
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)V")
	public static void method3239() {
		@Pc(7) Class220 local7 = null;
		try {
			@Pc(13) Class181 local13 = Static32.aClass51_1.method1359(true, "2");
			while (local13.anInt5298 == 0) {
				Static83.method1499(1L);
			}
			if (local13.anInt5298 == 1) {
				local7 = (Class220) local13.anObject7;
				@Pc(44) byte[] local44 = new byte[(int) local7.method5189()];
				@Pc(59) int local59;
				for (@Pc(46) int local46 = 0; local46 < local44.length; local46 += local59) {
					local59 = local7.method5186(local44.length - local46, local46, local44);
					if (local59 == -1) {
						throw new IOException("EOF");
					}
				}
				Static85.method1532(new Class3_Sub25(local44));
			}
		} catch (@Pc(88) Exception local88) {
		}
		try {
			if (local7 != null) {
				local7.method5190();
			}
		} catch (@Pc(95) Exception local95) {
		}
	}
}
