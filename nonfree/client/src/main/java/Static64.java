import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
	public static int anInt1371;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!eq;")
	public static Class97 aClass97_12;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Lclient!uf;")
	public static final Class334 aClass334_1 = new Class334();

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!mp;")
	public static final Class222 aClass222_5 = new Class222(64);

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
	public static int anInt1374 = -1;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_14 = new Class269(26, 3);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)I")
	public static int method1234() {
		@Pc(10) Class233 local10 = Static42.aClass233_2;
		synchronized (Static42.aClass233_2) {
			return Static42.aClass233_2.method5667();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIBI)I")
	public static int method1236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 255 - arg2;
		@Pc(26) int local26 = (arg2 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
		return local26 + (((arg1 & 0xFF00FF) * local8 & 0xFF00FF00 | (arg1 & 0xFF00) * local8 & 0xFF0000) >>> 8);
	}
}
