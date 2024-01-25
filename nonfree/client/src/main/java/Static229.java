import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "Lclient!tq;")
	public static Class191 aClass191_77;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "Lclient!tq;")
	public static Class191 aClass191_78;

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "Z")
	public static boolean aBoolean220 = false;

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "Z")
	public static boolean aBoolean222 = false;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "([[IILclient!ae;ZI)V")
	public static void method2463(@OriginalArg(0) int[][] arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3; local7++) {
			@Pc(19) int[][] local19;
			@Pc(21) int local21;
			@Pc(25) int local25;
			if (arg0 == null) {
				local19 = null;
			} else {
				local19 = new int[Static95.anInt6381 + 1][Static237.anInt4532 + 1];
				for (local21 = 0; local21 <= Static237.anInt4532; local21++) {
					for (local25 = 0; local25 <= Static95.anInt6381; local25++) {
						local19[local25][local21] = Static109.anIntArrayArrayArray3[local7][local25][local21] - arg0[local25][local21];
					}
				}
			}
			local21 = 0;
			local25 = 0;
			if (!arg2) {
				if (Static348.aBoolean606) {
					local21 = 2;
				}
				if (Static304.aBoolean545) {
					local25 = 8;
				}
				if (Static322.anInt6490 != 0) {
					if (local7 == 0 || Static339.anInt6736 >= 96) {
						local25 |= 0x10;
					}
					local21 |= 0x1;
				}
			}
			if (Static348.aBoolean606) {
				local25 |= 0x7;
			}
			@Pc(116) Class73 local116 = arg1.method4224(Static95.anInt6381, Static237.anInt4532, Static109.anIntArrayArrayArray3[local7], local19, local21, local25);
			Static343.method5929(local7, local116);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)V")
	public static void method2464() {
		Static74.aClass2_Sub10_Sub1_2.method2049(71);
		for (@Pc(22) Class2_Sub8 local22 = (Class2_Sub8) Static273.aClass199_25.method5747(); local22 != null; local22 = (Class2_Sub8) Static273.aClass199_25.method5753()) {
			if (!local22.method5949()) {
				local22 = (Class2_Sub8) Static273.aClass199_25.method5747();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt699 == 0) {
				Static148.method2868(local22, true, true);
			}
		}
		if (Static27.aClass146_16 != null) {
			Static152.method2932(Static27.aClass146_16);
			Static27.aClass146_16 = null;
		}
	}
}
