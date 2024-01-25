import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "J")
	public static long aLong244;

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "[I")
	public static final int[] anIntArray562 = new int[13];

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "[I")
	public static final int[] anIntArray563 = new int[8];

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILclient!rp;III)Ljava/awt/Frame;")
	public static Frame method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class298 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method7271()) {
			return null;
		}
		@Pc(20) Class334[] local20 = Static443.method6643(arg2);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (arg0 == local20[local28].anInt9336 && local20[local28].anInt9335 == arg3 && (!local26 || arg1 < local20[local28].anInt9334)) {
				arg1 = local20[local28].anInt9334;
				local26 = true;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(90) Class174 local90 = arg2.method7286(arg1, arg3, arg0);
		while (local90.anInt5121 == 0) {
			Static143.method2414(10L);
		}
		@Pc(105) Frame local105 = (Frame) local90.anObject12;
		if (local105 == null) {
			return null;
		} else if (local90.anInt5121 == 2) {
			Static647.method8678(local105, arg2);
			return null;
		} else {
			return local105;
		}
	}
}
