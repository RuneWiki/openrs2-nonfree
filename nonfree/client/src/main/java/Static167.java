import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static167 {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "J")
	public static long aLong94;

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "Lclient!pea;")
	public static Class283 aClass283_3;

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
	public static int anInt3248 = 0;

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[200];

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "[I")
	public static final int[] anIntArray152 = new int[200];

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "[I")
	public static final int[] anIntArray153 = new int[8];

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBI)I")
	public static int method3017(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static242.anIntArray293[arg1 & 0x3] : Static661.anIntArray615[arg1 & 0x3];
	}
}
