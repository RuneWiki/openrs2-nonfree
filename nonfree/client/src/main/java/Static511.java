import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static511 {

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "Lclient!wu;")
	public static Class384 aClass384_113;

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "F")
	public static float aFloat189;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
	public static int anInt8568 = -1;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_166 = new Class136(108, 6);

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "[I")
	public static final int[] anIntArray674 = new int[3];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)Z")
	public static boolean method7385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!ee;)Lclient!ab;")
	public static Class3_Sub1 method7387(@OriginalArg(1) Class5_Sub12 arg0) {
		return new Class3_Sub1(arg0.method8595(), arg0.method8595(), arg0.method8595(), arg0.method8595(), arg0.method8657(), arg0.method8657(), arg0.method8645());
	}
}
