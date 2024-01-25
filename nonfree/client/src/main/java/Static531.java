import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static531 {

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_290 = new Class123(76, 2);

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
	public static void method7273() {
		Static298.aClass346Array1 = null;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lclient!ri;Z)V")
	public static void method7275(@OriginalArg(0) Class284 arg0) {
		Static197.aClass284_62 = arg0;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BII)Z")
	public static boolean method7276(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(JJ)J")
	public static long method7277(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}
}
