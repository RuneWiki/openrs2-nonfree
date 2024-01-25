import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "Lclient!uu;")
	public static Class343 aClass343_130;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "Lclient!uu;")
	public static Class343 aClass343_131;

	@OriginalMember(owner = "client!jc", name = "L", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_146 = new Class194(37, 16);

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_147 = new Class194(123, 7);

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
	public static int anInt5032 = -1;

	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "Lclient!sga;")
	public static final Class306 aClass306_1 = new Class306();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)Lclient!uv;")
	public static Class344 method4328(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class344 local7 = Static324.method5363(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass344Array2 == null || arg1 >= local7.aClass344Array2.length) {
			return null;
		} else {
			return local7.aClass344Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)Z")
	public static boolean method4331() {
		return Static422.method6653("jaclib") ? Static422.method6653("hw3d") : false;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIB)V")
	public static void method4332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static250.method6648(arg0, arg1);
	}
}
