import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIII)V")
	public static void method4642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class1_Sub11 local6 = Static165.method2386();
		local6.aClass1_Sub35_Sub2_1.method5777(Static420.aClass128_7.anInt3034);
		local6.aClass1_Sub35_Sub2_1.method5777(arg3);
		local6.aClass1_Sub35_Sub2_1.method5777(arg1);
		local6.aClass1_Sub35_Sub2_1.method5776(arg2);
		local6.aClass1_Sub35_Sub2_1.method5776(arg0);
		Static48.method743(local6);
		Static112.anInt2212 = 0;
		Static61.anInt1176 = 1;
		Static156.anInt2835 = 0;
		Static218.anInt4197 = -3;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BIII)I")
	public static int method4643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg1;
		}
		@Pc(21) int local21 = 128 - arg0;
		@Pc(35) int local35 = arg0 * (arg2 & 0x7F) + local21 * (arg1 & 0x7F) >> 7;
		@Pc(49) int local49 = (arg2 & 0x380) * arg0 + local21 * (arg1 & 0x380) >> 7;
		@Pc(63) int local63 = arg0 * (arg2 & 0xFC00) + (arg1 & 0xFC00) * local21 >> 7;
		return local49 & 0x380 | local63 & 0xFC00 | local35 & 0x7F;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)I")
	public static int method4646(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static477.anInt8065 - 1; local3++) {
			if (arg0 < Static397.anIntArray736[local3] + Static592.anIntArray737[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static477.anInt8065 - 1;
		}
		return local1;
	}
}
