import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
	public static int anInt5401;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "[[[Lclient!sk;")
	public static Class187[][][] aClass187ArrayArrayArray2;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	public static int anInt5405;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Lclient!il;")
	public static Class101 aClass101_1;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "[S")
	public static short[] aShortArray109 = new short[256];

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Ljava/lang/String;")
	public static final String aString235 = "shake:";

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "[B")
	public static final byte[] aByteArray88 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZB)V")
	public static void method4915(@OriginalArg(0) boolean arg0) {
		if (Static327.aBoolean227 != arg0) {
			Static327.aBoolean227 = arg0;
			Static271.method4597();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!dp;IB)Lclient!eb;")
	public static Class57 method4917(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1) {
		@Pc(14) byte[] local14 = arg1.method1033(0, arg0);
		return local14 == null ? null : new Class57(local14);
	}
}
