import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static308 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "Lclient!wq;")
	public static final Class359 aClass359_8 = new Class359();

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)Z")
	public static boolean method5146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
