import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!k", name = "K", descriptor = "Lclient!la;")
	public static Class29 aClass29_7;

	@OriginalMember(owner = "client!k", name = "N", descriptor = "I")
	public static int anInt4870;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "I")
	public static int anInt4872 = 0;

	@OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
	public static int anInt4873 = -1;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V")
	public static void method4066() {
		@Pc(7) Class63 local7 = null;
		try {
			@Pc(20) Class347 local20 = Static356.aClass287_5.method6548("2", true);
			while (local20.anInt9172 == 0) {
				Static459.method6498(1L);
			}
			if (local20.anInt9172 == 1) {
				local7 = (Class63) local20.anObject49;
				@Pc(47) byte[] local47 = new byte[(int) local7.method1175()];
				@Pc(62) int local62;
				for (@Pc(49) int local49 = 0; local49 < local47.length; local49 += local62) {
					local62 = local7.method1178(local49, local47, local47.length - local49);
					if (local62 == -1) {
						throw new IOException("EOF");
					}
				}
				Static299.method4534(new Class2_Sub15(local47));
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local7 != null) {
				local7.method1174();
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)Z")
	public static boolean method4067(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}
}
