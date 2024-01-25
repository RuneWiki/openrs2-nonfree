import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!va", name = "I", descriptor = "Lclient!iq;")
	public static Class104 aClass104_184;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "Lclient!iq;")
	public static Class104 aClass104_185;

	@OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
	public static int anInt6591;

	@OriginalMember(owner = "client!va", name = "S", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_216 = new Class221(70, 8);

	@OriginalMember(owner = "client!va", name = "X", descriptor = "[I")
	public static final int[] anIntArray503 = new int[5];

	@OriginalMember(owner = "client!va", name = "Y", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_54 = new Class107(5);

	@OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
	public static int anInt6589 = -50;

	@OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
	public static int anInt6590 = -1;

	@OriginalMember(owner = "client!va", name = "db", descriptor = "[I")
	public static final int[] anIntArray504 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!va", name = "fb", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_55 = new Class107(64);

	@OriginalMember(owner = "client!va", name = "gb", descriptor = "I")
	public static int anInt6592 = -1;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
	public static void method5525(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class68 local8 = Static50.method942(arg1, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray18 != null) {
			@Pc(18) Class2_Sub41 local18 = new Class2_Sub41();
			local18.aClass68_35 = local8;
			local18.aString64 = arg0;
			local18.anObjectArray35 = local8.anObjectArray18;
			local18.anInt6103 = arg2;
			Static367.method5890(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt1829 != 0) {
			local35 = Static53.method1172(local8);
		}
		if (!local35 || !Static46.method890(local8).method5642(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static300.method5057(Static45.aClass157_31);
			Static230.method4868(arg1, arg3, local8.anInt1890);
		}
		if (arg2 == 2) {
			Static300.method5057(Static229.aClass157_149);
			Static230.method4868(arg1, arg3, local8.anInt1890);
		}
		if (arg2 == 3) {
			Static300.method5057(Static256.aClass157_163);
			Static230.method4868(arg1, arg3, local8.anInt1890);
		}
		if (arg2 == 4) {
			Static300.method5057(Static190.aClass157_195);
			Static230.method4868(arg1, arg3, local8.anInt1890);
		}
		if (arg2 == 5) {
			Static300.method5057(Static213.aClass157_135);
			Static230.method4868(arg1, arg3, local8.anInt1890);
		}
		if (arg2 == 6) {
			Static300.method5057(Static34.aClass157_23);
			Static230.method4868(arg1, arg3, local8.anInt1890);
		}
		if (arg2 == 7) {
			Static300.method5057(Static40.aClass157_27);
			Static230.method4868(arg1, arg3, local8.anInt1890);
		}
		if (arg2 == 8) {
			Static300.method5057(Static64.aClass157_39);
			Static230.method4868(arg1, arg3, local8.anInt1890);
		}
		if (arg2 == 9) {
			Static300.method5057(Static347.aClass157_216);
			Static230.method4868(arg1, arg3, local8.anInt1890);
		}
		if (arg2 == 10) {
			Static300.method5057(Static250.aClass157_157);
			Static230.method4868(arg1, arg3, local8.anInt1890);
		}
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(I)Lclient!ci;")
	public static Class39 method5527() {
		try {
			return (Class39) Class.forName("Class39_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
