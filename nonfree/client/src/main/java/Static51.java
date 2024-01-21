import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "Lclient!pb;")
	public static Class31 aClass31_21;

	@OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
	public static int anInt1373;

	@OriginalMember(owner = "client!kb", name = "fb", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!kb", name = "kb", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!kb", name = "Cb", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_13;

	@OriginalMember(owner = "client!kb", name = "S", descriptor = "[I")
	public static int[] anIntArray200 = new int[2000];

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "Lclient!mc;")
	public static Class42 aClass42_725 = Static23.method501("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!kb", name = "ab", descriptor = "Lclient!mc;")
	private static Class42 aClass42_726 = Static23.method501("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!kb", name = "vb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_735 = Static23.method501("red:");

	@OriginalMember(owner = "client!kb", name = "bb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_727 = aClass42_735;

	@OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_728 = Static23.method501("slide:");

	@OriginalMember(owner = "client!kb", name = "db", descriptor = "Lclient!mc;")
	private static Class42 aClass42_729 = Static23.method501("Too many connections from your address)3");

	@OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
	public static int anInt1376 = 10;

	@OriginalMember(owner = "client!kb", name = "hb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_730 = aClass42_729;

	@OriginalMember(owner = "client!kb", name = "lb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_731 = Static23.method501("yellow:");

	@OriginalMember(owner = "client!kb", name = "nb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_732 = Static23.method501("Handel akzeptieren");

	@OriginalMember(owner = "client!kb", name = "ob", descriptor = "Lclient!mc;")
	public static Class42 aClass42_733 = aClass42_731;

	@OriginalMember(owner = "client!kb", name = "pb", descriptor = "I")
	public static int anInt1378 = 0;

	@OriginalMember(owner = "client!kb", name = "sb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_734 = aClass42_726;

	@OriginalMember(owner = "client!kb", name = "wb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_736 = Static23.method501(" Millionen");

	@OriginalMember(owner = "client!kb", name = "Fb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_741 = Static23.method501("Ok");

	@OriginalMember(owner = "client!kb", name = "xb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_737 = aClass42_741;

	@OriginalMember(owner = "client!kb", name = "yb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_738 = Static23.method501("Sprites geladen)3");

	@OriginalMember(owner = "client!kb", name = "Ab", descriptor = "Lclient!mc;")
	public static Class42 aClass42_739 = aClass42_728;

	@OriginalMember(owner = "client!kb", name = "Bb", descriptor = "I")
	public static int anInt1383 = 0;

	@OriginalMember(owner = "client!kb", name = "Eb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_740 = Static23.method501("backright2");

	@OriginalMember(owner = "client!kb", name = "Gb", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!kb", name = "Hb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_742 = Static23.method501("Benutzername: ");

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
	public static void method963() {
		aClass42_730 = null;
		aClass42_732 = null;
		aClass42_727 = null;
		aClass1_Sub1_Sub1_Sub4_13 = null;
		aClass42_726 = null;
		aClass42_742 = null;
		anIntArray200 = null;
		aClass42_734 = null;
		aClass42_733 = null;
		aClass42_731 = null;
		aClass42_725 = null;
		aClass31_21 = null;
		anIntArray205 = null;
		aClass42_728 = null;
		aClass42_737 = null;
		aClass42_729 = null;
		aClass42_740 = null;
		aClass42_736 = null;
		aClass42_741 = null;
		aClass42_738 = null;
		anIntArray203 = null;
		aClass42_735 = null;
		aClass42_739 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BB)I")
	public static int method964(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static106.method1844(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZILclient!vb;Z)Z")
	public static boolean method966(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class60 arg1) {
		return Static84.method1533(arg1, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method971(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static73.aClass62_1);
		arg0.addMouseMotionListener(Static73.aClass62_1);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)I")
	public static int method972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 179) {
			arg0 /= 2;
		}
		if (arg1 > 192) {
			arg0 /= 2;
		}
		if (arg1 > 217) {
			arg0 /= 2;
		}
		if (arg1 > 243) {
			arg0 /= 2;
		}
		return arg1 / 2 + (arg0 / 32 << 7) + (arg2 / 4 << 10);
	}
}
