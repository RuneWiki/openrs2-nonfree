import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static484 {

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public static int anInt8559;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_45 = new Class94(4);

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
	public static final int[] anIntArray441 = new int[13];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)Lclient!jha;")
	public static Class67_Sub1 method7132(@OriginalArg(1) int arg0) {
		return Static211.aBoolean332 && arg0 >= Static305.anInt6172 && arg0 <= Static181.anInt3989 ? Static256.aClass67_Sub1Array2[arg0 - Static305.anInt6172] : null;
	}
}
