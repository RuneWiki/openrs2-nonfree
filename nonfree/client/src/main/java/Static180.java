import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static180 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_189 = new Class40(61, 11);

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
	public static int[] anIntArray693 = new int[2];

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
	public static final int[] anIntArray694 = new int[14];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
	public static int method7548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static95.anIntArray180[arg0 & 0x3] : Static571.anIntArray721[arg0 & 0x3];
	}
}
