import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
	public static int anInt1017;

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
	public static int anInt1019 = 0;

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
	public static int anInt1022 = 0;

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "Lclient!im;")
	public static final Class140 aClass140_18 = new Class140(29, 6);

	@OriginalMember(owner = "client!bw", name = "r", descriptor = "Lclient!im;")
	public static final Class140 aClass140_19 = new Class140(89, 10);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
	public static byte[] method979(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static534.method7394(arg1, local13);
		} else if (arg0 instanceof Class233) {
			@Pc(25) Class233 local25 = (Class233) arg0;
			return local25.method5449(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!jq;B)V")
	public static void method985(@OriginalArg(0) Class156 arg0) {
		@Pc(15) Class156 local15 = Static189.method2934(arg0);
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (local15 == null) {
			local20 = Static83.anInt1567;
			local23 = Static350.anInt6255;
		} else {
			local20 = local15.anInt4732;
			local23 = local15.anInt4673;
		}
		Static340.method5163(false, arg0, local23, local20);
		Static374.method5743(local23, arg0, local20);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIZ)Z")
	public static boolean method986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
