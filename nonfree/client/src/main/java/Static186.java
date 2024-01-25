import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
	public static int anInt3783;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
	public static int anInt3784;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_49 = new Class218(74, 7);

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I")
	public static int method3454() {
		if ((double) Static317.aFloat113 == 3.0D) {
			return 37;
		} else if ((double) Static317.aFloat113 == 4.0D) {
			return 50;
		} else if ((double) Static317.aFloat113 == 6.0D) {
			return 75;
		} else if ((double) Static317.aFloat113 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIZ)V")
	public static void method3455(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class3_Sub24 local10 = Static640.method8894(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray307.length; local15++) {
				local10.anIntArray307[local15] = -1;
				local10.anIntArray306[local15] = 0;
			}
		}
	}
}
