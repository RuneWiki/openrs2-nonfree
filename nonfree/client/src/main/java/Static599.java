import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "Lclient!ega;")
	public static final Class98 aClass98_6 = new Class98("runescape", 0);

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
	public static int anInt9833 = 0;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Z")
	public static boolean method8200(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && Static7.aByteArrayArrayArray1[1].length > arg1 && Static7.aByteArrayArrayArray1[1][arg1].length > arg0) {
			return (Static7.aByteArrayArrayArray1[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "([SI)[S")
	public static short[] method8201(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static686.method4965(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ow;)V")
	public static void method8203(@OriginalArg(0) Class270 arg0) {
		Static296.aClass270_3 = arg0;
	}
}
