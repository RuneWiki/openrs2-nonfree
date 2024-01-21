import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!dd", name = "jd", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!dd", name = "pd", descriptor = "Lclient!rb;")
	public static Class55 aClass55_12;

	@OriginalMember(owner = "client!dd", name = "dd", descriptor = "[I")
	public static int[] anIntArray91 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!dd", name = "ed", descriptor = "Lclient!ba;")
	public static Class5 aClass5_19 = new Class5(128);

	@OriginalMember(owner = "client!dd", name = "hd", descriptor = "I")
	public static int anInt687 = -1;

	@OriginalMember(owner = "client!dd", name = "ld", descriptor = "Lclient!oe;")
	public static Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!dd", name = "md", descriptor = "Lclient!gd;")
	public static Class23 aClass23_376 = Static15.method178("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!dd", name = "nd", descriptor = "Lclient!gd;")
	public static Class23 aClass23_377 = Static15.method178("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!dd", name = "vd", descriptor = "Lclient!gd;")
	private static Class23 aClass23_381 = Static15.method178("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!dd", name = "od", descriptor = "Lclient!gd;")
	public static Class23 aClass23_378 = aClass23_381;

	@OriginalMember(owner = "client!dd", name = "qd", descriptor = "Lclient!gd;")
	public static Class23 aClass23_379 = Static15.method178("@or1@");

	@OriginalMember(owner = "client!dd", name = "rd", descriptor = "[I")
	public static int[] anIntArray92 = new int[25];

	@OriginalMember(owner = "client!dd", name = "sd", descriptor = "I")
	public static int anInt690 = -1;

	@OriginalMember(owner = "client!dd", name = "td", descriptor = "I")
	public static int anInt691 = 0;

	@OriginalMember(owner = "client!dd", name = "ud", descriptor = "Lclient!gd;")
	public static Class23 aClass23_380 = Static15.method178("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "(I)V")
	public static void method336() {
		anIntArray91 = null;
		aClass23_380 = null;
		aClass23_378 = null;
		aClass23_379 = null;
		aClass23_376 = null;
		aByteArrayArrayArray1 = null;
		anIntArray92 = null;
		aClass23_377 = null;
		aClass45_1 = null;
		aClass55_12 = null;
		aClass23_381 = null;
		aClass5_19 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(JB)V")
	public static void method337(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < Static35.anInt1118; local15++) {
			if (Static58.aLongArray37[local15] == arg0) {
				Static35.anInt1118--;
				Static34.aBoolean60 = true;
				for (@Pc(34) int local34 = local15; local34 < Static35.anInt1118; local34++) {
					Static58.aLongArray37[local34] = Static58.aLongArray37[local34 + 1];
				}
				Static76.aClass1_Sub5_Sub1_2.method731(29);
				Static76.aClass1_Sub5_Sub1_2.method711(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZLclient!ra;)Z")
	public static boolean method338(@OriginalArg(2) boolean arg0, @OriginalArg(3) Class54 arg1) {
		return Static80.method1401(arg1, arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ra;Ljava/awt/Component;)Lclient!e;")
	public static Class1_Sub4_Sub1 method339(@OriginalArg(1) Class54 arg0, @OriginalArg(2) Component arg1) {
		Static14.method158(arg1, arg0);
		@Pc(16) Class1_Sub4_Sub1 local16 = new Class1_Sub4_Sub1();
		Static12.method1544(local16);
		return local16;
	}
}
