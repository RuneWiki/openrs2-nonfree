import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!eba", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!eba", name = "l", descriptor = "Lclient!la;")
	public static Class208 aClass208_20;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
	public static int anInt1995;

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "Lclient!lk;")
	public static final Class219 aClass219_6 = new Class219();

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I[[S[[F)[[S")
	public static short[][] method1779(@OriginalArg(1) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			for (@Pc(16) int local16 = 0; local16 < arg0[local3].length; local16++) {
				arg0[local3][local16] = (short) (int) (arg1[local3][local16] * 16383.0F);
			}
		}
		anInt1995++;
		return arg0;
	}
}
