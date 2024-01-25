import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static463 {

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "Lclient!kp;")
	public static final Class180 aClass180_11 = new Class180();

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Z")
	public static boolean method6484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static294.method4726(arg0, arg1) | (arg0 & 0x70000) != 0 || Static297.method992(arg0, arg1);
	}
}
