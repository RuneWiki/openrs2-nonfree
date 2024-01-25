import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "Lclient!lp;")
	public static final Class188 aClass188_7 = new Class188(1, 2, 2, 0);

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "Z")
	public static boolean aBoolean256 = false;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_53 = new Class160(64, 7);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Lclient!saa;")
	public static Class287 method3460(@OriginalArg(0) int arg0) {
		@Pc(13) Class287[] local13 = Static200.method3798();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class287 local21 = local13[local15];
			if (arg0 == local21.anInt7793) {
				return local21;
			}
		}
		return null;
	}
}
