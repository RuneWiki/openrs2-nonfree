import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1562 = Static118.method2249("Drop");

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1560 = aClass65_1562;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1561 = Static118.method2249("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "[Lclient!bi;")
	public static final Class9[] aClass9Array1 = new Class9[6];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZI)Lclient!oc;")
	public static Class65 method2002(@OriginalArg(2) int arg0) {
		return Static100.method1901(arg0, true);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([Lclient!oc;I)Lclient!oc;")
	public static Class65 method2004(@OriginalArg(0) Class65[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static123.method2356(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BILclient!wa;)Lclient!oc;")
	public static Class65 method2005(@OriginalArg(2) Class1_Sub14 arg0) {
		try {
			@Pc(7) Class65 local7 = new Class65();
			local7.anInt3190 = arg0.method1703();
			if (local7.anInt3190 > 32767) {
				local7.anInt3190 = 32767;
			}
			local7.aByteArray37 = new byte[local7.anInt3190];
			arg0.anInt2306 += Static67.aClass70_1.method2616(local7.anInt3190, arg0.aByteArray29, arg0.anInt2306, 0, local7.aByteArray37);
			return local7;
		} catch (@Pc(53) Exception local53) {
			return Static141.aClass65_1976;
		}
	}
}
