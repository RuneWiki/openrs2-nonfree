import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!jh", name = "Z", descriptor = "[I")
	public static final int[] anIntArray230 = new int[1];

	@OriginalMember(owner = "client!jh", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString120 = null;

	@OriginalMember(owner = "client!jh", name = "gb", descriptor = "Z")
	public static boolean aBoolean324 = false;

	@OriginalMember(owner = "client!jh", name = "jb", descriptor = "Z")
	public static boolean aBoolean325 = false;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!r;)Lclient!ufa;")
	public static Class328 method3965(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1) {
		@Pc(11) Class346 local11 = Static510.method6871(arg1, true, arg0);
		return local11 == null ? null : local11.aClass328_12;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ie;I)Lclient!pda;")
	public static Class110_Sub3 method3966(@OriginalArg(0) Class3_Sub26 arg0) {
		return new Class110_Sub3(arg0.method6789(), arg0.method6789(), arg0.method6789(), arg0.method6789(), arg0.method6789(), arg0.method6789(), arg0.method6789(), arg0.method6789(), arg0.method6830(), arg0.method6814());
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method3967(@OriginalArg(0) String arg0) {
		if (Static131.aClass74Array1 != null) {
			@Pc(21) Class3_Sub10 local21 = Static129.method2403(Static452.aClass353_2, Static167.aClass287_113);
			local21.aClass3_Sub26_Sub1_1.method6809(Static158.method2898(arg0));
			local21.aClass3_Sub26_Sub1_1.method6772(arg0);
			Static193.method3398(local21);
		}
	}

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "(I)V")
	public static void method3969() {
		Static249.anInt8899 = -1;
		Static544.aClass73_39 = null;
	}
}
