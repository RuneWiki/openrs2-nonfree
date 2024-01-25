import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!qj;")
	public static Class165 aClass165_11;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V")
	public static void method863() {
		Static261.aClass140_133.method3813();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method865(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			local17 = (local17 << 5) - (local17 - Static191.method3006(arg0.charAt(local19)));
		}
		return local17;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Lclient!tq;")
	public static Class201 method866(@OriginalArg(0) int arg0) {
		@Pc(10) Class201 local10 = (Class201) Static56.aClass140_33.method3816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static260.aClass165_76.method4508(arg0, 33);
		local10 = new Class201();
		if (local20 != null) {
			local10.method5158(new Class1_Sub7(local20), arg0);
		}
		Static56.aClass140_33.method3817((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	public static void method867() {
		@Pc(1) Class140 local1 = Static50.aClass140_29;
		synchronized (Static50.aClass140_29) {
			Static50.aClass140_29.method3819();
		}
		local1 = Static234.aClass140_121;
		synchronized (Static234.aClass140_121) {
			Static234.aClass140_121.method3819();
		}
	}
}
