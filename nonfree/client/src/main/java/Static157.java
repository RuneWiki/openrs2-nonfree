import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public static int anInt3335;

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_19;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public static int anInt3330 = 0;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1191 = Static151.method2243("weiss:");

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1192 = Static151.method2243("Connection timed out)3");

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "[I")
	public static final int[] anIntArray287 = new int[] { 1, 0, 0, 0, 1, 0, 2 };

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1193 = Static151.method2243("Mitglieder)2Welt");

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1194 = Static151.method2243("overlay)3dat");

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1195 = aClass62_1192;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)Z")
	public static boolean method2314(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBI)I")
	public static int method2316(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 >>> 31;
		return (local15 + arg0) / arg1 - local15;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!pb;IZ)Z")
	public static boolean method2317(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg1.method2130(arg0, arg2);
		if (local5 == null) {
			return false;
		} else {
			Static91.method1391(local5);
			return true;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!mb;B)I")
	public static int method2319(@OriginalArg(0) Class62 arg0) {
		return arg0.method1878() + 1;
	}
}
