import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
	public static int anInt1494 = 0;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_933 = Static118.method2249(":");

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!wa;I)Lclient!pc;")
	public static Class69 method984(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(12) Class69 local12 = new Class69();
		local12.anInt3416 = arg0.method1753();
		local12.aClass1_Sub2_Sub24_1 = Static15.method282(local12.anInt3416);
		return local12;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!sd;I)Z")
	public static boolean method987(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1) {
		@Pc(12) byte[] local12 = arg1.method2331(arg0);
		if (local12 == null) {
			return false;
		} else {
			Static116.method2132(local12);
			return true;
		}
	}
}
