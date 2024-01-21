import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
	public static int[] anIntArray366;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
	public static int anInt3389;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "Lclient!sc;")
	public static Class72 aClass72_46 = new Class72();

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1829 = Static122.method531("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1830 = Static122.method531("Konfig geladen)3");

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public static void method2465() {
		aClass73_1829 = null;
		anIntArray366 = null;
		aClass72_46 = null;
		aClass73_1830 = null;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)Lclient!qa;")
	public static Class3_Sub1_Sub15 method2466(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub15 local10 = (Class3_Sub1_Sub15) Static142.aClass7_24.method183((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static25.aClass13_5.method348(6, arg0);
		local10 = new Class3_Sub1_Sub15();
		local10.anInt3031 = arg0;
		if (local20 != null) {
			local10.method2192(new Class3_Sub12(local20));
		}
		local10.method2196();
		if (local10.aBoolean201) {
			local10.aBoolean205 = false;
			local10.anInt3008 = 0;
		}
		Static142.aClass7_24.method186(local10, (long) arg0);
		return local10;
	}
}
