import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public static int anInt86;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_3 = new Class160(55, 8);

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_4 = new Class160(30, 0);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Z")
	public static boolean method70(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}
}
