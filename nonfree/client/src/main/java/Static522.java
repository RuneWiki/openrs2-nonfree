import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static522 {

	@OriginalMember(owner = "client!vu", name = "z", descriptor = "I")
	public static int anInt8770;

	@OriginalMember(owner = "client!vu", name = "B", descriptor = "I")
	public static int anInt8772;

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_104 = new Class37();

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[4];

	@OriginalMember(owner = "client!vu", name = "D", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_374 = new Class296(36, 7);

	@OriginalMember(owner = "client!vu", name = "F", descriptor = "[I")
	public static final int[] anIntArray821 = new int[1];

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BII)I")
	public static int method7171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static441.anIntArray719[arg0 & 0x3] : 256;
	}
}
