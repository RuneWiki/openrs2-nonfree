import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "Lclient!i;")
	public static final Class111 aClass111_8 = new Class111();

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "[I")
	public static final int[] anIntArray470 = new int[1000];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!qn;IIIB)Ljava/awt/Frame;")
	public static Frame method5704(@OriginalArg(1) Class209 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0.method4693()) {
			return null;
		}
		@Pc(20) Class118[] local20 = Static331.method4830(arg0);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (arg2 == local20[local28].anInt3440 && arg1 == local20[local28].anInt3438 && (!local26 || arg3 < local20[local28].anInt3441)) {
				local26 = true;
				arg3 = local20[local28].anInt3441;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(97) Class122 local97 = arg0.method4675(arg1, arg3, arg2);
		while (local97.anInt3557 == 0) {
			Static88.method4161(10L);
		}
		@Pc(112) Frame local112 = (Frame) local97.anObject7;
		if (local112 == null) {
			return null;
		} else if (local97.anInt3557 == 2) {
			Static298.method4403(local112, arg0);
			return null;
		} else {
			return local112;
		}
	}
}
