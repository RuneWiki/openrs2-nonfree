import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	public static int anInt332;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!oc;")
	public static Class34 aClass34_11;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "[I")
	public static int[] anIntArray60 = new int[128];

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!ba;")
	public static Class5 aClass5_12 = new Class5(20);

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!gd;")
	private static Class23 aClass23_238 = Static15.method178("Unable to find ");

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Lclient!gd;")
	public static Class23 aClass23_239 = aClass23_238;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
	public static int anInt335 = -1;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
	public static int anInt336 = 0;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "Lclient!gd;")
	public static Class23 aClass23_240 = Static15.method178("::fpson");

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Lclient!gd;")
	public static Class23 aClass23_241 = Static15.method178("(U");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	public static void method191() {
		Static31.aClass5_25.method99();
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V")
	public static void method192() {
		aClass23_238 = null;
		anIntArray60 = null;
		aClass23_241 = null;
		aClass5_12 = null;
		aClass34_11 = null;
		aClass23_239 = null;
		aClass23_240 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZ)I")
	public static int method193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) long local16 = (long) ((arg0 << 16) + arg1);
		return Static105.aClass1_Sub1_Sub11_1 != null && Static105.aClass1_Sub1_Sub11_1.aLong85 == local16 ? Static34.aClass1_Sub5_4.anInt1266 * 99 / (Static34.aClass1_Sub5_4.aByteArray6.length - Static105.aClass1_Sub1_Sub11_1.aByte1) + 1 : 0;
	}
}
