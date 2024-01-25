import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!av", name = "h", descriptor = "Lclient!nd;")
	public static Class238 aClass238_16;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_22 = new Class200(45, -1);

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
	public static void method631() {
		@Pc(7) Class82 local7 = null;
		try {
			@Pc(13) Class319 local13 = Static265.aClass286_3.method6570("2");
			while (local13.anInt8562 == 0) {
				Static440.method6322(1L);
			}
			if (local13.anInt8562 == 1) {
				local7 = (Class82) local13.anObject19;
				@Pc(38) byte[] local38 = new byte[(int) local7.method2009()];
				@Pc(53) int local53;
				for (@Pc(40) int local40 = 0; local40 < local38.length; local40 += local53) {
					local53 = local7.method2008(local38, local40, local38.length - local40);
					if (local53 == -1) {
						throw new IOException("EOF");
					}
				}
				Static201.method3464(new Class2_Sub17(local38));
			}
		} catch (@Pc(77) Exception local77) {
		}
		try {
			if (local7 != null) {
				local7.method2011();
			}
		} catch (@Pc(89) Exception local89) {
		}
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(B)V")
	public static void method635() {
		if (Static519.anInterface16Array1 == null) {
			return;
		}
		@Pc(3) Interface16[] local3 = Static519.anInterface16Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(10) Interface16 local10 = local3[local5];
			local10.method6298();
		}
	}
}
