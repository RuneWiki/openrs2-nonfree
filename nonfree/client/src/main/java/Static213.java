import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
	public static int anInt4453;

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "I")
	public static int anInt4455;

	@OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
	public static int anInt4456;

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "Lclient!tb;")
	public static Class167 aClass167_5 = new Class167();

	@OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
	public static int anInt4452 = 100;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method3842(@OriginalArg(0) int arg0) {
		return Static73.aStringArray6[arg0].length() > 0 ? Static164.aStringArray25[arg0] + Static207.aString221 + Static73.aStringArray6[arg0] : Static164.aStringArray25[arg0];
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(B)Lclient!md;")
	public static Class1_Sub2_Sub11 method3843() {
		@Pc(14) Class1_Sub2_Sub11 local14 = (Class1_Sub2_Sub11) Static206.aClass170_8.method4212();
		if (local14 != null) {
			local14.method4779();
			local14.method4493();
			return local14;
		}
		do {
			local14 = (Class1_Sub2_Sub11) Static287.aClass170_11.method4212();
			if (local14 == null) {
				return null;
			}
			if (local14.method2867() > Static298.method4535()) {
				return null;
			}
			local14.method4779();
			local14.method4493();
		} while ((local14.aLong196 & Long.MIN_VALUE) == 0L);
		return local14;
	}
}
