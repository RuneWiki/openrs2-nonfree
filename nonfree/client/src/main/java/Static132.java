import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "Lclient!ge;")
	public static Class30 aClass30_12;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
	public static int anInt3459;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	public static int anInt3443 = -1;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray7 = new byte[1000][];

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	public static int anInt3450 = -1;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1165 = Static49.method1293("Close");

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1166 = aClass70_1165;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([BI)[B")
	public static byte[] method2566(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub9 local8 = new Class1_Sub9(arg0);
		@Pc(12) int local12 = local8.method1234();
		@Pc(16) int local16 = local8.method1273();
		if (local16 < 0 || Static67.anInt2088 != 0 && Static67.anInt2088 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(79) byte[] local79 = new byte[local16];
			local8.method1241(local79, local16);
			return local79;
		} else {
			@Pc(36) int local36 = local8.method1273();
			if (local36 < 0 || Static67.anInt2088 != 0 && local36 > Static67.anInt2088) {
				throw new RuntimeException();
			}
			@Pc(57) byte[] local57 = new byte[local36];
			if (local12 == 1) {
				Static17.method389(local57, local36, arg0, local16);
			} else {
				Static77.aClass58_1.method2406(local57, local8);
			}
			return local57;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method2567() {
		aClass70_1165 = null;
		aClass70_1166 = null;
		aByteArrayArray7 = null;
		aClass30_12 = null;
	}
}
