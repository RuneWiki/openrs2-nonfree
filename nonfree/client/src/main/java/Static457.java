import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static457 {

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	public static int anInt8802;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "Lclient!iea;")
	public static Class31 aClass31_35;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
	public static int anInt8803;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_203 = new Class200(5, 6);

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_204 = new Class200(21, -1);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIB)Z")
	public static boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
