import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static310 {

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "Lclient!pc;")
	public static Class188 aClass188_83;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "Lclient!nc;")
	public static Class2_Sub29 aClass2_Sub29_2;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "[I")
	public static final int[] anIntArray361 = new int[14];

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "Z")
	public static boolean aBoolean472 = true;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
	public static int anInt5449 = 0;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_72 = new Class44(1, 3);

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
	public static int anInt5450 = 2;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)I")
	public static int method4420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static87.aByteArrayArray6 == null ? 0 : Static87.aByteArrayArray6[arg0][arg1] & 0xFF;
	}
}
