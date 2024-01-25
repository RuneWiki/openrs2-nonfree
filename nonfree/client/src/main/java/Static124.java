import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "Lclient!ir;")
	public static Class94 aClass94_2;

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "[Lclient!qg;")
	public static Class55_Sub8_Sub1_Sub1[] aClass55_Sub8_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "Lclient!tq;")
	public static Class191 aClass191_143;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
	public static int anInt4221 = 0;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II[Lclient!on;)V")
	public static void method3875(@OriginalArg(1) int arg0, @OriginalArg(2) Class146[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) Class146 local14 = arg1[local8];
			if (local14 != null) {
				if (local14.anInt4419 == 0) {
					if (local14.aClass146Array2 != null) {
						method3875(arg0, local14.aClass146Array2);
					}
					@Pc(38) Class2_Sub8 local38 = (Class2_Sub8) Static273.aClass199_25.method5751((long) local14.anInt4450);
					if (local38 != null) {
						Static103.method2286(arg0, local38.anInt694);
					}
				}
				@Pc(57) Class2_Sub44 local57;
				if (arg0 == 0 && local14.anObjectArray4 != null) {
					local57 = new Class2_Sub44();
					local57.anObjectArray35 = local14.anObjectArray4;
					local57.aClass146_18 = local14;
					Static72.method1646(local57);
				}
				if (arg0 == 1 && local14.anObjectArray11 != null) {
					if (local14.anInt4493 >= 0) {
						@Pc(82) Class146 local82 = Static1.method16(local14.anInt4450);
						if (local82 == null || local82.aClass146Array2 == null || local82.aClass146Array2.length <= local14.anInt4493 || local82.aClass146Array2[local14.anInt4493] != local14) {
							continue;
						}
					}
					local57 = new Class2_Sub44();
					local57.anObjectArray35 = local14.anObjectArray11;
					local57.aClass146_18 = local14;
					Static72.method1646(local57);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3876(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
