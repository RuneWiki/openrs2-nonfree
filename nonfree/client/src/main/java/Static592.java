import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static592 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "Z")
	public static boolean aBoolean843 = true;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "[I")
	public static final int[] anIntArray843 = new int[8];

	@OriginalMember(owner = "client!va", name = "g", descriptor = "Z")
	public static boolean aBoolean844 = false;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!pb;BLclient!pb;)V")
	public static void method8903(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		if (arg1.aClass5_300 != null) {
			arg1.method8911();
		}
		arg1.aClass5_300 = arg0.aClass5_300;
		arg1.aClass5_299 = arg0;
		arg1.aClass5_300.aClass5_299 = arg1;
		arg1.aClass5_299.aClass5_300 = arg1;
	}
}
