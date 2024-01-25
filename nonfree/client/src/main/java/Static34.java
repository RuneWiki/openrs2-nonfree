import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_24 = new Class102(13, 0);

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_25 = new Class102(64, 3);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B")
	public static byte[] method520(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg0;
			return arg1 ? Static69.method1053(local21) : local21;
		} else if (arg0 instanceof Class89) {
			@Pc(35) Class89 local35 = (Class89) arg0;
			return local35.method5156();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method521(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static456.method5710(0, arg5, arg0, arg4, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!sv;I)V")
	public static void method523(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static29.aClass110_2 != null) {
			@Pc(20) int local20;
			try {
				Static29.aClass110_2.method2262(0L);
				Static29.aClass110_2.method2265(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method3596(24, local8);
	}
}
