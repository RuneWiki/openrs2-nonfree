import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_136 = Static158.method3034("huffman");

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_137 = Static158.method3034("gr-Un:");

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
	public static int anInt580 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!ra;)Z")
	public static boolean method445(@OriginalArg(1) Class72 arg0) {
		if (Static89.aBoolean102) {
			if (Static26.method637(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3932 == 0) {
				return false;
			}
		}
		return arg0.aBoolean148;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[Lclient!ob;)Lclient!ob;")
	public static Class60 method446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60[] arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			if (arg2[local9 + arg0] == null) {
				arg2[local9 + arg0] = Static7.aClass60_1328;
			}
			local7 += arg2[arg0 + local9].anInt3466;
		}
		@Pc(39) byte[] local39 = new byte[local7];
		@Pc(41) int local41 = 0;
		@Pc(51) Class60 local51;
		for (@Pc(43) int local43 = 0; local43 < arg1; local43++) {
			local51 = arg2[local43 + arg0];
			Static203.method2767(local51.aByteArray39, 0, local39, local41, local51.anInt3466);
			local41 += local51.anInt3466;
		}
		local51 = new Class60();
		local51.anInt3466 = local7;
		local51.aByteArray39 = local39;
		return local51;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V")
	public static void method448(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub15 local15 = (Class2_Sub15) Static88.aClass51_7.method2458((long) arg0);
		if (local15 != null) {
			local15.method3556();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[[[I)V")
	public static void method449(@OriginalArg(3) int[][][] arg0) {
		Static98.anInt2864 = 4;
		Static146.anInt3815 = 104;
		Static193.anInt4611 = 104;
		Static118.aClass2_Sub17ArrayArrayArray1 = new Class2_Sub17[4][104][104];
		Static127.anIntArrayArrayArray6 = new int[4][105][105];
		Static100.anIntArrayArrayArray5 = arg0;
		Static149.method2962();
	}
}
