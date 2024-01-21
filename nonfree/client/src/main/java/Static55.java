import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "[I")
	public static int[] anIntArray241;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "[I")
	public static int[] anIntArray240 = new int[1000];

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	public static volatile int anInt1437 = 0;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "[Lclient!hb;")
	public static Class27[] aClass27Array7 = new Class27[5];

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4 = new int[4][105][105];

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "[Lclient!hb;")
	public static Class27[] aClass27Array8 = new Class27[100];

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "[Lclient!hb;")
	public static Class27[] aClass27Array9 = new Class27[500];

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "Lclient!hb;")
	public static Class27 aClass27_705 = Static87.method1648(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Lclient!hb;")
	private static Class27 aClass27_708 = Static87.method1648("Prepared visibility map");

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "Lclient!hb;")
	public static Class27 aClass27_706 = aClass27_708;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
	public static int anInt1446 = -1;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "Lclient!hb;")
	private static Class27 aClass27_707 = Static87.method1648("Offline");

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "Lclient!hb;")
	public static Class27 aClass27_709 = aClass27_707;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "Lclient!hb;")
	public static Class27 aClass27_710 = Static87.method1648("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I")
	public static int method1059() {
		return 19;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method1060() {
		Static2.aClass28_1 = new Class28();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!td;IIBI)[B")
	public static byte[] method1061(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) long local19 = (long) (arg2 << 16) + ((long) arg3 << 32) + ((long) (arg2 * 37 + arg1 & 0xFFFF));
		if (Static1.aClass21_1 != null) {
			@Pc(36) Class3_Sub3_Sub12 local36 = (Class3_Sub3_Sub12) Static1.aClass21_1.method658(local19);
			if (local36 != null) {
				return local36.aByteArray22;
			}
		}
		@Pc(47) byte[] local47 = arg0.method1615(arg2, arg1);
		if (local47 == null) {
			return null;
		} else {
			if (Static1.aClass21_1 != null) {
				Static1.aClass21_1.method660(new Class3_Sub3_Sub12(local47), local19);
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	public static void method1062() {
		aClass27_706 = null;
		aClass27_709 = null;
		anIntArray241 = null;
		aClass27_705 = null;
		aClass27Array7 = null;
		aClass27Array8 = null;
		anIntArray240 = null;
		aClass27_707 = null;
		aClass27_708 = null;
		aClass27Array9 = null;
		aClass27_710 = null;
		anIntArrayArrayArray4 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!i;")
	public static RuntimeException_Sub1 method1063(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
