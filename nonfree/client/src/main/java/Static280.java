import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!f;")
	public static Class80 aClass80_12;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!jc;")
	public static Class125 aClass125_2;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "[B")
	public static final byte[] aByteArray63 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_65 = new Class84(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "S")
	public static short aShort53 = 32767;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!tk;")
	public static final Class225 aClass225_15 = new Class225(6, 0, 4, 2);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lclient!fm;")
	public static Class87 method4019(@OriginalArg(1) int arg0) {
		@Pc(8) Class87[] local8 = Static431.method5760();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class87 local16 = local8[local10];
			if (arg0 == local16.anInt2029) {
				return local16;
			}
		}
		return null;
	}
}
