import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!fh", name = "I", descriptor = "F")
	public static float aFloat16;

	@OriginalMember(owner = "client!fh", name = "T", descriptor = "B")
	public static byte aByte47;

	@OriginalMember(owner = "client!fh", name = "J", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_44 = new Class217(24, -1);

	@OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
	public static int anInt2449 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	public static void method1878(@OriginalArg(0) int arg0) {
		Static411.anInt6760 = arg0;
		Static405.anInt6683 = -1;
		Static339.anInt5767 = -1;
		Static197.method3120();
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)Z")
	public static boolean method1879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static93.method1695(arg0, arg1) || Static120.method1956(arg0, arg1) || Static8.method4685(arg0, arg1);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILclient!bu;)Lclient!eu;")
	public static Class70 method1880(@OriginalArg(1) int arg0, @OriginalArg(2) Class32 arg1) {
		@Pc(15) byte[] local15 = arg1.method811(arg0);
		return local15 == null ? null : new Class70(local15);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[S)[S")
	public static short[] method1881(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static462.method4615(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
