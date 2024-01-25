import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static275 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "Z")
	public static boolean aBoolean387 = true;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "Lclient!sk;")
	public static final Class297 aClass297_8 = new Class297(2);

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	public static final int anInt5082 = 1400;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "Lclient!nq;")
	public static Class230 aClass230_2 = null;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBI)Z")
	public static boolean method4276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static541.method7812(arg1, arg0) || Static395.method5608(arg1, arg0);
	}
}
