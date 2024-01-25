import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!nq", name = "s", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_7 = new Class295(8, 16);

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)Lclient!mk;")
	public static Class1_Sub8_Sub9 method5290() {
		@Pc(10) Class1_Sub8_Sub9 local10 = (Class1_Sub8_Sub9) Static305.aClass170_9.method3553();
		if (local10 != null) {
			local10.method7908();
			local10.method7712();
			return local10;
		}
		do {
			local10 = (Class1_Sub8_Sub9) Static440.aClass170_11.method3553();
			if (local10 == null) {
				return null;
			}
			if (local10.method4834() > Static480.method6650()) {
				return null;
			}
			local10.method7908();
			local10.method7712();
		} while ((local10.aLong263 & Long.MIN_VALUE) == 0L);
		return local10;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)Z")
	public static boolean method5292(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
