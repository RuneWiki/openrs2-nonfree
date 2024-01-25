import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
	public static int anInt2163;

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
	public static int anInt2162 = 0;

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "[I")
	public static final int[] anIntArray119 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_30 = new Class194(75, 8);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZJII)V")
	public static void method1727(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (int) arg0 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static159.method2246(local15, 0, local22, arg1, 0, true, arg2, 0);
			return;
		}
		@Pc(47) Class114 local47 = Static398.aClass256_4.method5782(local29);
		@Pc(55) int local55;
		@Pc(58) int local58;
		if (local22 == 0 || local22 == 2) {
			local55 = local47.anInt2990;
			local58 = local47.anInt2993;
		} else {
			local58 = local47.anInt2990;
			local55 = local47.anInt2993;
		}
		@Pc(69) int local69 = local47.anInt2997;
		if (local22 != 0) {
			local69 = (local69 << local22 & 0xF) + (local69 >> 4 - local22);
		}
		Static159.method2246(0, local58, 0, arg1, local55, true, arg2, local69);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!fh;ILjava/lang/String;)I")
	public static int method1728(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt7013;
		@Pc(10) byte[] local10 = Static287.method3553(arg1);
		arg0.method5551(local10.length);
		arg0.anInt7013 += Static330.aClass71_1.method1503(0, arg0.aByteArray93, arg0.anInt7013, local10, local10.length);
		return arg0.anInt7013 - local6;
	}
}
