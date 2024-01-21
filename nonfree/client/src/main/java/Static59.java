import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
	public static int anInt1432;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "Lclient!wc;")
	public static Class1_Sub2_Sub8_Sub5 aClass1_Sub2_Sub8_Sub5_16;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
	public static int anInt1436;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_392 = Static81.method1507("Mem:");

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_393 = Static81.method1507("Bitte geben Sie Ihren Benutzernamen ein)3");

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_394 = Static81.method1507("(U0a )2 in: ");

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
	public static int anInt1435 = 0;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLclient!fj;)Lclient!o;")
	public static Class72 method1106(@OriginalArg(1) Class1_Sub7 arg0) {
		@Pc(15) Class72 local15 = new Class72();
		local15.anInt2944 = arg0.method2765();
		local15.aClass1_Sub2_Sub9_1 = Static58.method1105(local15.anInt2944);
		return local15;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	public static void method1107() {
		Static71.anIntArray148 = null;
		Static191.anIntArrayArrayArray11 = null;
		Static195.aByteArrayArrayArray13 = null;
		Static177.aByteArrayArrayArray12 = null;
		Static116.anIntArray205 = null;
		Static85.anIntArray287 = null;
		Static189.anIntArray366 = null;
		Static104.anIntArray191 = null;
		Static27.aByteArrayArrayArray1 = null;
		Static144.aByteArrayArrayArray8 = null;
		Static136.aByteArrayArrayArray7 = null;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!ve;)V")
	public static void method1108(@OriginalArg(1) Class69 arg0) {
		Static37.aClass69_8 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Lclient!j;")
	public static Class49 method1110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass49_1;
	}
}
