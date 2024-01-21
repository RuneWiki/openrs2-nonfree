import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray28;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "Lclient!wh;")
	public static Interface3 anInterface3_2;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Lclient!dc;")
	public static final Class19 aClass19_6 = new Class19();

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_510 = Static181.method2795("Password: ");

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!qe;")
	public static Class83 aClass83_505 = aClass83_510;

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
	public static final int anInt1611 = 50;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "[I")
	public static final int[] anIntArray147 = new int[anInt1611];

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	public static int anInt1607 = 0;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_507 = Static181.method2795("Please use a different world)3");

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!qe;")
	public static Class83 aClass83_506 = aClass83_507;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Z")
	public static final boolean aBoolean84 = false;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
	public static int anInt1608 = -1;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "[I")
	public static final int[] anIntArray148 = new int[anInt1611];

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "[I")
	public static final int[] anIntArray149 = new int[anInt1611];

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
	public static int anInt1609 = 0;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "[I")
	public static final int[] anIntArray150 = new int[anInt1611];

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "[Lclient!qe;")
	public static final Class83[] aClass83Array30 = new Class83[anInt1611];

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "Lclient!qe;")
	public static Class83 aClass83_508 = aClass83_507;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_509 = Static181.method2795("<col=ffb000>");

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "[Lclient!qe;")
	public static final Class83[] aClass83Array31 = new Class83[1000];

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
	public static final int[] anIntArray151 = new int[anInt1611];

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "[I")
	public static final int[] anIntArray152 = new int[anInt1611];

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "[I")
	public static final int[] anIntArray153 = new int[anInt1611];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ra;)Lclient!qi;")
	public static Class85 method1266(@OriginalArg(1) Class2_Sub3 arg0) {
		@Pc(7) Class85 local7 = new Class85();
		local7.anInt3228 = arg0.method269();
		local7.aClass2_Sub2_Sub18_1 = Static212.method3222(local7.anInt3228);
		return local7;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[Lclient!qe;)Lclient!qe;")
	public static Class83 method1268(@OriginalArg(1) Class83[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static197.method2970(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBILclient!kg;)V")
	public static void method1269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24_Sub4_Sub1 arg2) {
		if (arg1 == arg2.anInt3336 && arg1 != -1) {
			@Pc(19) Class2_Sub2_Sub16 local19 = Static213.method3229(arg1);
			@Pc(22) int local22 = local19.anInt2334;
			if (local22 == 1) {
				arg2.anInt3305 = 0;
				arg2.anInt3297 = arg0;
				arg2.anInt3313 = 0;
				arg2.anInt3326 = 0;
				Static200.method3029(Static54.aClass24_Sub4_Sub1_1 == arg2, arg2.anInt3349, arg2.anInt3313, arg2.anInt3316, local19);
			}
			if (local22 == 2) {
				arg2.anInt3326 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt3336 == -1 || Static213.method3229(arg1).anInt2355 >= Static213.method3229(arg2.anInt3336).anInt2355) {
			arg2.anInt3334 = arg2.anInt3330;
			arg2.anInt3313 = 0;
			arg2.anInt3326 = 0;
			arg2.anInt3336 = arg1;
			arg2.anInt3305 = 0;
			arg2.anInt3297 = arg0;
			if (arg2.anInt3336 != -1) {
				Static200.method3029(Static54.aClass24_Sub4_Sub1_1 == arg2, arg2.anInt3349, arg2.anInt3313, arg2.anInt3316, Static213.method3229(arg2.anInt3336));
			}
		}
	}
}
