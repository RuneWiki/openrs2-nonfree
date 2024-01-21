import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public static int anInt1454;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "[I")
	public static int[] anIntArray177;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Lclient!pe;")
	public static Class65 aClass65_635 = Static119.method1462("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Lclient!bc;")
	public static Class8 aClass8_35 = new Class8(64);

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	public static int anInt1458 = 2;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
	public static int anInt1460 = 0;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "Lclient!pe;")
	private static Class65 aClass65_637 = Static119.method1462("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!pe;")
	public static Class65 aClass65_636 = aClass65_637;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!le;[Lclient!la;ZI[B)V")
	public static void method1085(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) Class46[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(10) Class2_Sub4 local10 = new Class2_Sub4(arg4);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method938();
			if (local16 == 0) {
				return;
			}
			@Pc(23) int local23 = 0;
			local12 += local16;
			while (true) {
				@Pc(31) int local31 = local10.method938();
				if (local31 == 0) {
					break;
				}
				local23 += local31 - 1;
				@Pc(46) int local46 = local23 >> 12;
				@Pc(50) int local50 = local23 & 0x3F;
				@Pc(54) int local54 = local10.method933();
				@Pc(58) int local58 = local54 & 0x3;
				@Pc(64) int local64 = local23 >> 6 & 0x3F;
				@Pc(68) int local68 = arg0 + local64;
				@Pc(72) int local72 = local54 >> 2;
				@Pc(76) int local76 = local50 + arg3;
				if (local68 > 0 && local76 > 0 && local68 < 103 && local76 < 103) {
					@Pc(95) int local95 = local46;
					if ((Static88.aByteArrayArrayArray3[1][local68][local76] & 0x2) == 2) {
						local95 = local46 - 1;
					}
					@Pc(109) Class46 local109 = null;
					if (local95 >= 0) {
						local109 = arg2[local95];
					}
					Static70.method1237(local58, local109, arg1, local76, local12, local68, local46, local72);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method1086() {
		anIntArray177 = null;
		aClass65_636 = null;
		aClass8_35 = null;
		aClass65_637 = null;
		aClass65_635 = null;
	}
}
