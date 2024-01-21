import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ue", name = "P", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "Lclient!de;")
	public static Class17 aClass17_4;

	@OriginalMember(owner = "client!ue", name = "V", descriptor = "Lclient!tb;")
	public static Class44 aClass44_65;

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
	public static int anInt2967;

	@OriginalMember(owner = "client!ue", name = "gb", descriptor = "[Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array61;

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
	public static final int anInt2968 = 50;

	@OriginalMember(owner = "client!ue", name = "G", descriptor = "[I")
	public static int[] anIntArray295 = new int[anInt2968];

	@OriginalMember(owner = "client!ue", name = "I", descriptor = "[Lclient!oa;")
	public static Class56[] aClass56Array17 = new Class56[anInt2968];

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1618 = Static33.method650("Remove");

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1613 = aClass56_1618;

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "[I")
	public static int[] anIntArray296 = new int[anInt2968];

	@OriginalMember(owner = "client!ue", name = "L", descriptor = "[I")
	public static int[] anIntArray297 = new int[1000];

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "[I")
	public static int[] anIntArray299 = new int[anInt2968];

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
	public static int anInt2965 = 0;

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1614 = Static33.method650("Loaded config");

	@OriginalMember(owner = "client!ue", name = "T", descriptor = "[I")
	public static int[] anIntArray301 = new int[anInt2968];

	@OriginalMember(owner = "client!ue", name = "U", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1615 = Static33.method650("mod_icons");

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "[I")
	public static int[] anIntArray302 = new int[anInt2968];

	@OriginalMember(owner = "client!ue", name = "Z", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1616 = Static33.method650("null");

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1617 = aClass56_1614;

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "[I")
	public static int[] anIntArray303 = new int[500];

	@OriginalMember(owner = "client!ue", name = "eb", descriptor = "[I")
	public static int[] anIntArray304 = new int[anInt2968];

	@OriginalMember(owner = "client!ue", name = "fb", descriptor = "[I")
	public static int[] anIntArray305 = new int[anInt2968];

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!b;)Lclient!oa;")
	public static Class56 method1917(@OriginalArg(2) Class3_Sub2 arg0) {
		try {
			@Pc(7) Class56 local7 = new Class56();
			local7.anInt2171 = arg0.method311();
			if (local7.anInt2171 > 32767) {
				local7.anInt2171 = 32767;
			}
			local7.aByteArray29 = new byte[local7.anInt2171];
			arg0.anInt413 += Static7.aClass5_2.method48(local7.anInt2171, arg0.aByteArray7, 0, local7.aByteArray29, arg0.anInt413);
			return local7;
		} catch (@Pc(46) Exception local46) {
			return Static111.aClass56_1539;
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
	public static void method1918() {
		aClass56_1616 = null;
		anIntArray302 = null;
		aClass17_4 = null;
		aClass56Array17 = null;
		aClass56_1615 = null;
		anIntArray303 = null;
		aByteArrayArrayArray8 = null;
		anIntArray295 = null;
		anIntArray296 = null;
		aClass3_Sub1_Sub1_Sub4Array61 = null;
		aClass56_1614 = null;
		aClass56_1618 = null;
		aClass56_1613 = null;
		aClass44_65 = null;
		anIntArray297 = null;
		anIntArray305 = null;
		anIntArray301 = null;
		anIntArray304 = null;
		anIntArray299 = null;
		aClass56_1617 = null;
	}
}
