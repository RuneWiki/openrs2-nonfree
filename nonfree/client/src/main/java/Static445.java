import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray151;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "[I")
	public static int[] anIntArray607;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_118 = new Class21("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "[I")
	public static final int[] anIntArray606 = new int[14];

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Z")
	public static boolean aBoolean558 = false;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
	public static int anInt7575 = 0;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_228 = new Class214(75, -2);

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "Z")
	public static boolean aBoolean559 = false;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method6066(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static463.aBoolean580) {
			try {
				@Pc(18) Class174 local18 = (Class174) Class.forName("Class174_Sub1").getDeclaredConstructor().newInstance();
				local18.method4357(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static463.aBoolean580 = true;
			}
		}
		return arg0;
	}
}
