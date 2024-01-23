import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Lclient!f;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
	public static int anInt1031 = 1;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "Lclient!vh;")
	public static Class187 aClass187_33 = new Class187(128);

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
	public static int anInt1036 = 0;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)Lclient!om;")
	public static Class1_Sub2_Sub13 method966(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub2_Sub13 local6 = (Class1_Sub2_Sub13) Static248.aClass148_9.method3600((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static83.aClass121_47.method3115(5, arg0);
		local6 = new Class1_Sub2_Sub13();
		if (local21 != null) {
			local6.method3348(new Class1_Sub14(local21));
		}
		Static248.aClass148_9.method3602(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!nk;)I")
	public static int method967(@OriginalArg(1) Class121 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3140(Static255.anInt4618)) {
			local5++;
		}
		if (arg0.method3140(Static82.anInt1644)) {
			local5++;
		}
		if (arg0.method3140(Static251.anInt4554)) {
			local5++;
		}
		if (arg0.method3140(Static182.anInt3493)) {
			local5++;
		}
		if (arg0.method3140(Static102.anInt2059)) {
			local5++;
		}
		if (arg0.method3140(Static123.anInt2529)) {
			local5++;
		}
		if (arg0.method3140(Static314.anInt867)) {
			local5++;
		}
		if (arg0.method3140(Static218.anInt1148)) {
			local5++;
		}
		if (arg0.method3140(Static314.anInt870)) {
			local5++;
		}
		if (arg0.method3140(Static63.anInt3246)) {
			local5++;
		}
		if (arg0.method3140(Static263.anInt4829)) {
			local5++;
		}
		if (arg0.method3140(Static213.anInt4455)) {
			local5++;
		}
		if (arg0.method3140(Static61.anInt1171)) {
			local5++;
		}
		if (arg0.method3140(Static278.anInt5013)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)Lclient!hi;")
	public static Class66 method968(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static274.aClass66ArrayArray1[local7] == null || Static274.aClass66ArrayArray1[local7][local17] == null) {
			@Pc(34) boolean local34 = Static85.method1597(local7);
			if (!local34) {
				return null;
			}
		}
		return Static274.aClass66ArrayArray1[local7][local17];
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIC)I")
	public static int method969(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local12 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local12 = 1762;
		}
		return local12;
	}
}
