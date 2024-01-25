import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static649 {

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "[I")
	public static final int[] anIntArray717 = new int[3];

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "[Lclient!ln;")
	public static final Class229[] aClass229Array1 = new Class229[4];

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "Z")
	public static boolean aBoolean879 = false;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BJ)I")
	public static int method8928(@OriginalArg(1) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}
}
