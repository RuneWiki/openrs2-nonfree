import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static340 {

	@OriginalMember(owner = "client!np", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "Lclient!il;")
	public static Class146 aClass146_8;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_78 = new Class160(3, -1);

	@OriginalMember(owner = "client!np", name = "m", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_143 = new Class40(70, 1);

	@OriginalMember(owner = "client!np", name = "o", descriptor = "[I")
	public static final int[] anIntArray528 = new int[4096];

	@OriginalMember(owner = "client!np", name = "p", descriptor = "Lclient!fca;")
	public static Class97 aClass97_9 = null;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)Z")
	public static boolean method5138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}
}
