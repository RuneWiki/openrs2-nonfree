import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static136 {

	@OriginalMember(owner = "client!en", name = "e", descriptor = "I")
	public static int anInt9996;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray32;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "Z")
	public static final boolean aBoolean732 = false;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_86 = new Class32(5);

	@OriginalMember(owner = "client!en", name = "j", descriptor = "I")
	public static final int anInt9999 = 2;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!ka;IIILclient!gp;)V")
	public static void method8325(@OriginalArg(1) Class182 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class128 arg4) {
		if (arg0 != null) {
			arg4.method2768(arg0.HA(), arg0.RA(), arg3, arg0.fa(), arg0.V(), arg1, arg2, arg0.EA(), arg0.na(), arg0.G());
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BLclient!hd;)I")
	public static int method8328(@OriginalArg(1) Class136 arg0) {
		if (Static225.aClass136_3 == arg0) {
			return 7681;
		} else if (arg0 == Static483.aClass136_6) {
			return 8448;
		} else if (Static504.aClass136_8 == arg0) {
			return 34165;
		} else if (arg0 == Static248.aClass136_4) {
			return 260;
		} else if (Static579.aClass136_7 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
