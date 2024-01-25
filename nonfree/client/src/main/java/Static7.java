import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
	public static int anInt54;

	@OriginalMember(owner = "client!ada", name = "h", descriptor = "Lclient!vaa;")
	public static Class361 aClass361_1 = new Class361();

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_1 = new Class187(8);

	@OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
	public static final int anInt53 = 328;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lclient!js;I)I")
	public static int method48(@OriginalArg(0) Class14_Sub29_Sub1 arg0) {
		@Pc(15) int local15 = arg0.method4289(2);
		@Pc(27) int local27;
		if (local15 == 0) {
			local27 = 0;
		} else if (local15 == 1) {
			local27 = arg0.method4289(5);
		} else if (local15 == 2) {
			local27 = arg0.method4289(8);
		} else {
			local27 = arg0.method4289(11);
		}
		return local27;
	}

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "(I)Z")
	public static boolean method49() {
		try {
			@Pc(15) Class212 local15 = new Class212();
			@Pc(20) byte[] local20 = local15.method5195(Static193.aByteArray48);
			Static253.method3715(local20);
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}
}
