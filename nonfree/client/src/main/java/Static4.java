import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
	public static int anInt134;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "[Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1Array5;

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "Lclient!kc;")
	private static Class36 aClass36_69 = Static14.method2017("World");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!kc;")
	public static Class36 aClass36_61 = aClass36_69;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
	public static int anInt128 = -1;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Lclient!kc;")
	public static Class36 aClass36_62 = Static14.method2017("auf der Hautpseite)3");

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!kc;")
	private static Class36 aClass36_63 = Static14.method2017("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!kc;")
	private static Class36 aClass36_65 = Static14.method2017("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Lclient!kc;")
	public static Class36 aClass36_64 = aClass36_65;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!kc;")
	public static Class36 aClass36_66 = Static14.method2017("headicons_hint");

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "[I")
	public static int[] anIntArray14 = new int[2000];

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "[J")
	public static long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "[Lclient!ob;")
	public static Class47[] aClass47Array1 = new Class47[14];

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "Lclient!kc;")
	private static Class36 aClass36_68 = Static14.method2017("Click to continue");

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "Lclient!kc;")
	public static Class36 aClass36_67 = aClass36_68;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "Lclient!kc;")
	private static Class36 aClass36_70 = Static14.method2017("Add friend");

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "Lclient!kc;")
	public static Class36 aClass36_71 = Static14.method2017("Titelbild geladen)3");

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "Lclient!kc;")
	public static Class36 aClass36_72 = aClass36_63;

	@OriginalMember(owner = "client!ad", name = "L", descriptor = "Lclient!kc;")
	public static Class36 aClass36_73 = Static14.method2017("compass");

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "Lclient!kc;")
	public static Class36 aClass36_74 = aClass36_70;

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "Lclient!kc;")
	public static Class36 aClass36_75 = Static14.method2017("mod_icons");

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "Lclient!kc;")
	public static Class36 aClass36_76 = Static14.method2017("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public static void method132() {
		aClass36_61 = null;
		aClass36_70 = null;
		aClass36_71 = null;
		aClass36_67 = null;
		aClass36_75 = null;
		aClass36_74 = null;
		aClass36_66 = null;
		aClass36_73 = null;
		anIntArray14 = null;
		aClass36_65 = null;
		aClass36_69 = null;
		aClass36_68 = null;
		aClass47Array1 = null;
		aClass36_62 = null;
		aClass36_64 = null;
		aClass36_63 = null;
		aClass36_72 = null;
		aClass36_76 = null;
		aLongArray1 = null;
		aClass2_Sub1_Sub1_Sub1Array5 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)I")
	public static int method133(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub1_Sub10 local12 = Static6.method149(arg0);
		@Pc(15) int local15 = local12.anInt1576;
		@Pc(18) int local18 = local12.anInt1579;
		@Pc(21) int local21 = local12.anInt1583;
		@Pc(28) int local28 = Class35.anIntArray176[local21 - local18];
		return anIntArray14[local15] >> local18 & local28;
	}
}
