import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "[I")
	public static int[] anIntArray633;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Lclient!fk;")
	public static Class71 aClass71_10;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
	public static int anInt6699 = 255;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[5];

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "[S")
	public static short[] aShortArray118 = new short[256];

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
	public static int anInt6701 = 0;

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
	public static final int[] anIntArray634 = new int[200];

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!vg;")
	public static Class201 aClass201_14 = null;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!ij;II)Lclient!ci;")
	public static Class36 method5944(@OriginalArg(1) Class93 arg0, @OriginalArg(3) int arg1) {
		@Pc(18) byte[] local18 = arg0.method2410(0, arg1);
		return local18 == null ? null : new Class36(local18);
	}
}
