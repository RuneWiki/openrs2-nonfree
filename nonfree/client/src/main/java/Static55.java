import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "I")
	public static int anInt1673 = 0;

	@OriginalMember(owner = "client!kc", name = "db", descriptor = "Lclient!wb;")
	private static Class65 aClass65_748 = Static24.method441("Welcome to RuneScape");

	@OriginalMember(owner = "client!kc", name = "eb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_749 = aClass65_748;

	@OriginalMember(owner = "client!kc", name = "fb", descriptor = "Z")
	public static final boolean aBoolean91 = false;

	@OriginalMember(owner = "client!kc", name = "hb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger28 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!kc", name = "ib", descriptor = "Lclient!wb;")
	public static Class65 aClass65_750 = Static24.method441("l");

	@OriginalMember(owner = "client!kc", name = "jb", descriptor = "I")
	public static int anInt1675 = 0;

	@OriginalMember(owner = "client!kc", name = "kb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_751 = Static24.method441("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!kc", name = "nb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_752 = Static24.method441("No response from server)3");

	@OriginalMember(owner = "client!kc", name = "ob", descriptor = "Lclient!wb;")
	public static Class65 aClass65_753 = aClass65_752;

	@OriginalMember(owner = "client!kc", name = "pb", descriptor = "I")
	public static int anInt1678 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!ab;)Z")
	public static boolean method979(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt180;
		if (local4 >= 1 && local4 <= 200 || !(local4 < 701 || local4 > 900)) {
			if (local4 >= 801) {
				local4 -= 701;
			} else if (local4 >= 701) {
				local4 -= 601;
			} else if (local4 < 101) {
				local4--;
			} else {
				local4 -= 101;
			}
			Static47.method820(0, 0, Static38.aClass65_530, Static13.method282(new Class65[] { Static68.aClass65_948, Static67.aClass65Array9[local4] }), 27, 0);
			Static47.method820(0, 0, Static28.aClass65_380, Static13.method282(new Class65[] { Static68.aClass65_948, Static67.aClass65Array9[local4] }), 34, 0);
			return true;
		} else if (local4 >= 401 && local4 <= 500) {
			Static47.method820(0, 0, Static38.aClass65_530, Static13.method282(new Class65[] { Static68.aClass65_948, arg0.aClass65_89 }), 24, 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lclient!pd;")
	public static Class2_Sub1_Sub12 method982(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub1_Sub12 local6 = (Class2_Sub1_Sub12) Static48.aClass21_17.method744((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static95.aClass33_33.method1150(arg0, 1);
		local6 = new Class2_Sub1_Sub12();
		if (local20 != null) {
			local6.method1349(new Class2_Sub8(local20), arg0);
		}
		local6.method1347();
		Static48.aClass21_17.method745((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)V")
	public static void method983() {
		aClass65_751 = null;
		aClass65_752 = null;
		aClass65_748 = null;
		aBigInteger28 = null;
		aClass65_749 = null;
		aClass65_753 = null;
		aClass65_750 = null;
	}
}
