import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cw", name = "P", descriptor = "Lclient!hh;")
	public static Class109 aClass109_23;

	@OriginalMember(owner = "client!cw", name = "N", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_69 = new Class12(27, 18);

	@OriginalMember(owner = "client!cw", name = "O", descriptor = "I")
	public static int anInt1137 = 2;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!kh;IB)V")
	public static void method950(@OriginalArg(0) int arg0, @OriginalArg(1) Class47_Sub1_Sub5_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg1.anInt5348 && arg2 != -1) {
			@Pc(20) Class58 local20 = Static322.aClass45_5.method690(arg2);
			@Pc(23) int local23 = local20.anInt1436;
			if (local23 == 1) {
				arg1.anInt5403 = 0;
				arg1.anInt5372 = 1;
				arg1.anInt5339 = 0;
				arg1.anInt5370 = arg0;
				arg1.anInt5350 = 0;
				Static385.method5367(arg1.aByte97, arg1.anInt7066, arg1.anInt5350, local20, false, arg1.anInt7060);
			}
			if (local23 == 2) {
				arg1.anInt5339 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt5348 == -1 || Static322.aClass45_5.method690(arg2).anInt1426 >= Static322.aClass45_5.method690(arg1.anInt5348).anInt1426) {
			arg1.anInt5372 = 1;
			arg1.anInt5350 = 0;
			arg1.anInt5339 = 0;
			arg1.anInt5403 = 0;
			arg1.anInt5348 = arg2;
			arg1.anInt5420 = arg1.anInt5421;
			arg1.anInt5370 = arg0;
			if (arg1.anInt5348 != -1) {
				Static385.method5367(arg1.aByte97, arg1.anInt7066, arg1.anInt5350, Static322.aClass45_5.method690(arg1.anInt5348), false, arg1.anInt7060);
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!qs;[[BB)V")
	public static void method952(@OriginalArg(0) Class71_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(8) int local8 = Static435.aByteArrayArray24.length;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(35) int local35 = (Static68.anIntArray59[local17] >> 8) * 64 - Static190.anInt3507;
				@Pc(46) int local46 = (Static68.anIntArray59[local17] & 0xFF) * 64 - Static331.anInt6034;
				Static442.method5918();
				arg0.method4807(Static20.aClass181Array2, local35, local23, Static447.aClass121_11, local46);
			}
		}
	}
}
