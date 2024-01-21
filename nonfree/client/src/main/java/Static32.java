import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "[I")
	public static int[] anIntArray133;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "[I")
	public static int[] anIntArray134;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!qf;")
	private static Class60 aClass60_426 = Static59.method1195("Your account is already logged in)3");

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!qf;")
	public static Class60 aClass60_427 = Static59.method1195("titlebox");

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!qf;")
	private static Class60 aClass60_428 = Static59.method1195("Checking for updates )2 ");

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!qf;")
	public static Class60 aClass60_429 = aClass60_428;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "[I")
	public static int[] anIntArray135 = new int[50];

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
	public static int anInt1112 = 1;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
	public static int anInt1113 = 0;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	public static int anInt1114 = 0;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "Lclient!qf;")
	public static Class60 aClass60_430 = Static59.method1195("logo");

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_431 = Static59.method1195("<col=ffff00>*V");

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_432 = aClass60_426;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
	public static int anInt1115 = -1;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!jb;)V")
	public static void method732(@OriginalArg(1) Class25 arg0) {
		Static15.aClass25_2 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method733() {
		aClass60_430 = null;
		anIntArray135 = null;
		aClass60_429 = null;
		anIntArray133 = null;
		aClass60_426 = null;
		aClass60_431 = null;
		aClass60_432 = null;
		anIntArray134 = null;
		aClass60_427 = null;
		aClass60_428 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)I")
	public static int method734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class3_Sub13 local16 = (Class3_Sub13) Static16.aClass82_1.method2305((long) arg0);
		if (local16 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local16.anIntArray213.length) {
			return local16.anIntArray213[arg1];
		} else {
			return 0;
		}
	}
}
