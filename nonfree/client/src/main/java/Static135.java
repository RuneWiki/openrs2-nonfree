import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
	public static int anInt2908;

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
	public static int anInt2910;

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "Lclient!lp;")
	public static Class71 aClass71_2;

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "Lclient!cm;")
	public static final Class41 aClass41_15 = new Class41(512);

	@OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
	public static int anInt2909 = 0;

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "[Lclient!gr;")
	public static final Class84[] aClass84Array1 = new Class84[14];

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "Lclient!jg;")
	public static Class107 aClass107_12 = new Class107(64);

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
	public static final int anInt2911 = 1339;

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "Z")
	public static boolean aBoolean276 = false;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ef;II)V")
	public static void method2627(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (Static220.aClass10_2 == null) {
			return;
		}
		try {
			Static220.aClass10_2.method184(0L);
			Static220.aClass10_2.method174(arg1, 24, arg0.aByteArray30);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!iq;)V")
	public static void method2629(@OriginalArg(1) Class104 arg0) {
		Static48.aClass104_105 = arg0;
	}
}
