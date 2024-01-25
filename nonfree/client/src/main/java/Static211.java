import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	public static int anInt3898;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "[Lclient!qg;")
	public static Class87[] aClass87Array12;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
	public static int anInt3900;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_198 = new Class123(23, -1);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!ts;)Lclient!ts;")
	public static Class239 method3216(@OriginalArg(1) Class239 arg0) {
		if (arg0.anInt6895 != -1) {
			return Static121.method2092(arg0.anInt6895);
		}
		@Pc(25) int local25 = arg0.anInt6908 >>> 16;
		@Pc(30) Class230 local30 = new Class230(Static432.aClass74_33);
		for (@Pc(35) Class6_Sub9 local35 = (Class6_Sub9) local30.method5635(); local35 != null; local35 = (Class6_Sub9) local30.method5636()) {
			if (local25 == local35.anInt1505) {
				return Static121.method2092((int) local35.aLong229);
			}
		}
		return null;
	}
}
