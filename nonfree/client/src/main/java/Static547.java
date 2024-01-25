import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "Lclient!sn;")
	public static Class81 aClass81_3;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
	public static int anInt8867;

	@OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
	public static int anInt8870;

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_106 = new Class241(73, 4);

	@OriginalMember(owner = "client!sca", name = "i", descriptor = "Lclient!op;")
	public static final Class275 aClass275_15 = new Class275("", 17);

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)I")
	public static int method7749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static130.anIntArrayArray10 == null ? 0 : Static130.anIntArrayArray10[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(B)Z")
	public static boolean method7750() {
		if (Static477.aBoolean381) {
			try {
				Static692.method2495("showVideoAd", Static371.anApplet1);
				return true;
			} catch (@Pc(21) Throwable local21) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILclient!ml;IZ)Lclient!gda;")
	public static Class44_Sub1_Sub1 method7751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75_Sub3 arg2, @OriginalArg(3) int arg3) {
		if (arg2.aBoolean495 || Static232.method4114(arg0) && Static232.method4114(arg3)) {
			return new Class44_Sub1_Sub1(arg2, 3553, arg1, arg0, arg3);
		} else if (arg2.aBoolean492) {
			return new Class44_Sub1_Sub1(arg2, 34037, arg1, arg0, arg3);
		} else {
			return new Class44_Sub1_Sub1(arg2, arg1, arg0, arg3, Static314.method4970(arg0), Static314.method4970(arg3));
		}
	}
}
