import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static595 {

	@OriginalMember(owner = "client!vda", name = "T", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_110 = new Class185(71, 7);

	@OriginalMember(owner = "client!vda", name = "Ib", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_176 = new Class73(17, 8);

	@OriginalMember(owner = "client!vda", name = "Mb", descriptor = "F")
	public static float aFloat184 = 0.0F;

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "(II)I")
	public static int method8268(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
