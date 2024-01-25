import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "F")
	public static float aFloat237;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
	public static int anInt7914;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
	public static int anInt7912 = 0;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!qg;")
	public static final Class246 aClass246_11 = new Class246();

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "[I")
	public static final int[] anIntArray673 = new int[8];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Lclient!vi;")
	public static Class306 method6552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class306 local7 = new Class306();
		local7.anInt8969 = -1;
		local7.anInt8973 = arg0 + 5 + 1;
		local7.anInt8975 = -1;
		local7.anInt8965 = arg1 + 1 + 5;
		local7.anIntArrayArray85 = new int[local7.anInt8973][local7.anInt8965];
		local7.method7366();
		return local7;
	}
}
