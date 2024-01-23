import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "Lclient!em;")
	public static Class43 aClass43_2;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "Lclient!ck;")
	public static Class29 aClass29_1 = new Class29();

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!sf;")
	public static Class157 aClass157_10 = new Class157(4);

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "[I")
	public static int[] anIntArray97 = new int[200];

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	public static int anInt1204 = 0;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "[Lclient!ol;")
	public static Class130[] aClass130Array1 = new Class130[29];

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Z")
	public static boolean method888(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)Lclient!aj;")
	public static Class10 method890(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = (Class10) Static92.aClass157_21.method4031((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static187.aClass42_55.method1256(36, arg0);
		local6 = new Class10();
		local6.anInt167 = arg0;
		if (local21 != null) {
			local6.method152(new Class2_Sub16(local21));
		}
		Static92.aClass157_21.method4026((long) arg0, local6);
		return local6;
	}
}
