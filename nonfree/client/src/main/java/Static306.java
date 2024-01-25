import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "Lclient!eu;")
	public static final Class102 aClass102_5 = new Class102();

	@OriginalMember(owner = "client!kka", name = "f", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!kka", name = "h", descriptor = "Z")
	public static boolean aBoolean341 = false;

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(ILclient!ha;ZI)Lclient!da;")
	public static Class70 method4763(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(15) Class194 local15 = Static574.method7722(arg1, arg0, arg2);
		return local15 == null ? null : local15.aClass70_4;
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(IZI)Z")
	public static boolean method4764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
