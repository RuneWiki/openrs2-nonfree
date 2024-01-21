import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!nf", name = "Y", descriptor = "[I")
	public static int[] anIntArray389;

	@OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
	public static int anInt3358 = 0;

	@OriginalMember(owner = "client!nf", name = "T", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!nf", name = "W", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_929 = Static158.method3034("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!nf", name = "eb", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_47 = new Class89(64);

	@OriginalMember(owner = "client!nf", name = "hb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_930 = Static158.method3034("Loaded wordpack");

	@OriginalMember(owner = "client!nf", name = "ib", descriptor = "Lclient!pi;")
	public static final Class67 aClass67_7 = new Class67();

	@OriginalMember(owner = "client!nf", name = "jb", descriptor = "[Lclient!ob;")
	public static final Class60[] aClass60Array19 = new Class60[1000];

	@OriginalMember(owner = "client!nf", name = "kb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_931 = aClass60_930;

	@OriginalMember(owner = "client!nf", name = "lb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_932 = Static158.method3034("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!nf", name = "mb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_933 = Static158.method3034(" weitere Optionen");

	@OriginalMember(owner = "client!nf", name = "nb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_934 = aClass60_932;

	@OriginalMember(owner = "client!nf", name = "ob", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_935 = Static158.method3034("null");

	@OriginalMember(owner = "client!nf", name = "pb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_936 = Static158.method3034(":tradereq:");

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZ[B)Ljava/lang/Object;")
	public static Object method2600(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static77.aBoolean93) {
			try {
				@Pc(18) Class22 local18 = (Class22) Class.forName("Class22_Sub1").getDeclaredConstructor().newInstance();
				local18.method2320(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static77.aBoolean93 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ra;I)Z")
	public static boolean method2601(@OriginalArg(0) Class72 arg0) {
		if (arg0.anIntArray435 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray435.length; local12++) {
			@Pc(21) int local21 = Static85.method1991(local12, arg0);
			@Pc(26) int local26 = arg0.anIntArray437[local12];
			if (arg0.anIntArray435[local12] == 2) {
				if (local21 >= local26) {
					return false;
				}
			} else if (arg0.anIntArray435[local12] == 3) {
				if (local26 >= local21) {
					return false;
				}
			} else if (arg0.anIntArray435[local12] == 4) {
				if (local26 == local21) {
					return false;
				}
			} else if (local21 != local26) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(III)V")
	public static void method2602(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static14.anInt485 != 0 && arg1 != -1) {
			Static4.method71(arg1, Static147.aClass13_Sub1_23, Static14.anInt485);
			Static107.aBoolean118 = true;
		}
	}
}
