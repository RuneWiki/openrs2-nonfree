import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static244 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "F")
	public static float aFloat77;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!dda;")
	public static Class53 aClass53_76;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	public static int anInt4329;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "[Lclient!ada;")
	public static final Class8[] aClass8Array1 = new Class8[100];

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!wo;")
	public static final Class316 aClass316_2 = new Class316();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)I")
	public static int method3751(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
