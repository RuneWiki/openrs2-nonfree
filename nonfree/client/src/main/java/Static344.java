import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
	public static int anInt7754;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!sl;Z)Lclient!fga;")
	public static Class56_Sub2 method6787(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(12) Class56 local12 = Static316.method4866(arg0);
		@Pc(16) int local16 = arg0.method2881();
		@Pc(20) int local20 = arg0.method2881();
		@Pc(24) int local24 = arg0.method2825();
		return new Class56_Sub2(local12.aClass97_15, local12.aClass252_11, local12.anInt9417, local12.anInt9419, local12.anInt9422, local12.anInt9414, local12.anInt9421, local12.anInt9415, local12.anInt9412, local16, local20, local24);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZII)I")
	public static int method6790(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub43 local8 = Static95.method1915(arg0, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < local8.anIntArray672.length; local27++) {
				if (arg1 == local8.anIntArray671[local27]) {
					local25 += local8.anIntArray672[local27];
				}
			}
			return local25;
		}
	}
}
