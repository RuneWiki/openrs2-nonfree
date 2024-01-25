import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "[Lclient!ho;")
	public static Class9[] aClass9Array152;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
	public static int anInt9416 = 0;

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_325 = new Class179(52, -2);

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
	public static int anInt9418 = -1;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)J")
	public static synchronized long method7936() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static481.aLong246 > local5) {
			Static118.aLong73 += Static481.aLong246 - local5;
		}
		Static481.aLong246 = local5;
		return local5 + Static118.aLong73;
	}
}
