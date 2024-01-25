import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
	public static int anInt8899;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "Lclient!gm;")
	public static Class118 aClass118_2;

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
	public static int anInt8891 = -1;

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_156 = new Class254(91, -1);

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
	public static int anInt8898 = -1;

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "[I")
	public static final int[] anIntArray785 = new int[25];

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
	public static int anInt8902 = -1;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIB)I")
	public static int method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)Z")
	public static boolean method7468(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLclient!oa;Lclient!gf;)I")
	public static int method7469(@OriginalArg(1) Class9 arg0, @OriginalArg(2) Class113 arg1) {
		if (arg1.anInt3827 != -1) {
			return arg1.anInt3827;
		}
		if (arg1.anInt3829 != -1) {
			@Pc(33) Class296 local33 = arg0.anInterface2_11.method3585(arg0.method5458() ? arg1.anInt3829 : arg1.anInt3834);
			if (!local33.aBoolean656) {
				return local33.aShort125;
			}
		}
		return arg1.anInt3826;
	}
}
