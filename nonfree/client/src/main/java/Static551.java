import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static551 {

	@OriginalMember(owner = "client!tia", name = "i", descriptor = "I")
	public static int anInt8858;

	@OriginalMember(owner = "client!tia", name = "j", descriptor = "Lclient!jl;")
	public static Class183 aClass183_13;

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "Z")
	public static boolean aBoolean626 = false;

	@OriginalMember(owner = "client!tia", name = "c", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_160 = new Class145(14, -1);

	@OriginalMember(owner = "client!tia", name = "e", descriptor = "[[B")
	public static final byte[][] aByteArrayArray25 = new byte[250][];

	@OriginalMember(owner = "client!tia", name = "g", descriptor = "[I")
	public static int[] anIntArray659 = new int[1];

	@OriginalMember(owner = "client!tia", name = "h", descriptor = "I")
	public static final int anInt8857 = 1;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IBI)Z")
	public static boolean method7587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static493.method6911(arg0, arg1) | (arg0 & 0x70000) != 0 || Static244.method4141(arg0, arg1);
	}
}
