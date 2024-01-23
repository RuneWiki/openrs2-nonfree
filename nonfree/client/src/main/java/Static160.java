import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!md", name = "c", descriptor = "[I")
	public static int[] anIntArray336;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "[Lclient!td;")
	public static Class140_Sub1[] aClass140_Sub1Array2 = new Class140_Sub1[0];

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString109 = "wave2:";

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
	public static void method3001(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static104.method831(arg0, 5);
		local8.method1189();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lclient!td;")
	public static Class140_Sub1 method3003() {
		return aClass140_Sub1Array2.length > Static152.anInt3531 ? aClass140_Sub1Array2[Static152.anInt3531++] : null;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(BI)Lclient!rc;")
	public static Class136 method3004(@OriginalArg(1) int arg0) {
		@Pc(10) Class136 local10 = (Class136) Static50.aClass155_10.method4358((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static228.aClass83_153.method2306(1, arg0);
		local10 = new Class136();
		if (local26 != null) {
			local10.method3925(new Class1_Sub16(local26), arg0);
		}
		Static50.aClass155_10.method4360((long) arg0, local10);
		return local10;
	}
}
