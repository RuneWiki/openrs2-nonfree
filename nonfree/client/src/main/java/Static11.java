import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!be", name = "k", descriptor = "[Lclient!ld;")
	public static Class1_Sub12[] aClass1_Sub12Array1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_221 = Static108.method1915("0(U");

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!kd;")
	public static Class39 aClass39_222 = Static108.method1915("titlebox");

	@OriginalMember(owner = "client!be", name = "c", descriptor = "J")
	public static long aLong12 = 0L;

	@OriginalMember(owner = "client!be", name = "d", descriptor = "I")
	public static int anInt495 = 0;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "Lclient!kd;")
	private static Class39 aClass39_227 = Static108.method1915(" from your ignore list first");

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_223 = aClass39_227;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Lclient!kd;")
	private static Class39 aClass39_224 = Static108.method1915(" million");

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!kd;")
	public static Class39 aClass39_225 = Static108.method1915("<col=ffb000>");

	@OriginalMember(owner = "client!be", name = "i", descriptor = "[Lclient!kd;")
	public static Class39[] aClass39Array6 = new Class39[5];

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Lclient!kd;")
	public static Class39 aClass39_226 = aClass39_224;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!kd;")
	public static Class39 aClass39_228 = Static108.method1915("Neuer Benutzer");

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	public static int anInt499 = 0;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Lclient!kd;")
	public static Class39 aClass39_229 = Static108.method1915("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!be", name = "s", descriptor = "[I")
	public static int[] anIntArray89 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method270(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static63.aClass45_1);
		arg0.addMouseMotionListener(Static63.aClass45_1);
		arg0.addFocusListener(Static63.aClass45_1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)[Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4[] method271() {
		@Pc(8) Class1_Sub1_Sub4_Sub4[] local8 = new Class1_Sub1_Sub4_Sub4[Static4.anInt160];
		for (@Pc(10) int local10 = 0; local10 < Static4.anInt160; local10++) {
			@Pc(26) Class1_Sub1_Sub4_Sub4 local26 = local8[local10] = new Class1_Sub1_Sub4_Sub4();
			local26.anInt2161 = Static95.anInt2872;
			local26.anInt2158 = Static41.anInt3022;
			local26.anInt2159 = Static21.anIntArray107[local10];
			local26.anInt2160 = Static113.anIntArray436[local10];
			local26.anInt2156 = Static64.anIntArray244[local10];
			local26.anInt2157 = Static2.anIntArray21[local10];
			@Pc(58) int local58 = local26.anInt2156 * local26.anInt2157;
			@Pc(62) byte[] local62 = Static81.aByteArrayArray8[local10];
			local26.anIntArray327 = new int[local58];
			for (@Pc(68) int local68 = 0; local68 < local58; local68++) {
				local26.anIntArray327[local68] = Static23.anIntArray116[local62[local68] & 0xFF];
			}
		}
		Static52.method964();
		return local8;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!se;B)V")
	public static void method272(@OriginalArg(0) Class68 arg0) {
		Static50.aClass68_1 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
	public static void method273() {
		aClass39_224 = null;
		aClass39_228 = null;
		aClass39_221 = null;
		aClass39_222 = null;
		aClass39_229 = null;
		aClass39_226 = null;
		aBooleanArray3 = null;
		aClass39Array6 = null;
		aClass39_223 = null;
		aClass39_227 = null;
		aClass1_Sub12Array1 = null;
		aClass39_225 = null;
		anIntArray89 = null;
	}
}
