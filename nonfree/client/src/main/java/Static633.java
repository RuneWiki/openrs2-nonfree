import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static633 {

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_95 = new Class181(84, 4);

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
	public static int anInt10303 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BC)Z")
	public static boolean method8763(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
