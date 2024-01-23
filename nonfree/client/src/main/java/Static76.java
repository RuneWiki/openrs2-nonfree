import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
	private static int anInt800;

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "Lclient!oc;")
	public static Class2_Sub18 aClass2_Sub18_2 = new Class2_Sub18(0, 0);

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "Lclient!i;")
	public static Class41 aClass41_213 = Static184.method2923("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
	public static int anInt782 = 500;

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "S")
	public static short aShort8 = 1;

	@OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
	public static int anInt787 = -1;

	@OriginalMember(owner = "client!hj", name = "G", descriptor = "Lclient!i;")
	private static Class41 aClass41_214 = Static184.method2923("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "Lclient!i;")
	public static Class41 aClass41_215 = aClass41_214;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!q;)Lclient!q;")
	public static Class80 method586(@OriginalArg(1) Class80 arg0) {
		@Pc(11) int local11 = Static16.method305(Static70.method1287(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(17) int local17 = 0; local17 < local11; local17++) {
			arg0 = Static212.method3256(arg0.anInt3697);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
	public static int method598(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
