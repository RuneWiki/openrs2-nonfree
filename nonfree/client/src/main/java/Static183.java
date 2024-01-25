import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "Lclient!wv;")
	public static Class366 aClass366_1;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IBIIZI)V")
	public static void method2578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(22) long local22 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg1);
		@Pc(28) Class1_Sub25 local28 = (Class1_Sub25) Static15.aClass187_1.method3797(local22);
		if (local28 == null) {
			local28 = new Class1_Sub25();
			Static15.aClass187_1.method3795(local28, local22);
		}
		if (arg2 >= local28.anIntArray328.length) {
			@Pc(53) int[] local53 = new int[arg2 + 1];
			@Pc(58) int[] local58 = new int[arg2 + 1];
			for (@Pc(60) int local60 = 0; local60 < local28.anIntArray328.length; local60++) {
				local53[local60] = local28.anIntArray328[local60];
				local58[local60] = local28.anIntArray327[local60];
			}
			for (@Pc(90) int local90 = local28.anIntArray328.length; local90 < arg2; local90++) {
				local53[local90] = -1;
				local58[local90] = 0;
			}
			local28.anIntArray327 = local58;
			local28.anIntArray328 = local53;
		}
		local28.anIntArray328[arg2] = arg0;
		local28.anIntArray327[arg2] = arg4;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BII)Z")
	public static boolean method2579(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static344.method4702(arg1, arg0) || Static113.method1787(arg0, arg1);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILclient!vg;I)V")
	public static void method2580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class341 arg2) {
		@Pc(15) Class204 local15 = arg2.method7563(Static16.aClass134_1);
		if (local15 == null) {
			return;
		}
		Static16.aClass134_1.da(arg0, arg1, arg0 + arg2.anInt9300, arg1 + arg2.anInt9248);
		if (Static509.anInt5326 >= 3) {
			Static16.aClass134_1.FA(-16777216, local15, arg0, arg1);
		} else {
			Static74.aClass22_4.method7664((float) arg0 + (float) arg2.anInt9300 / 2.0F, (float) arg2.anInt9248 / 2.0F + (float) arg1, ((int) -Static167.aFloat59 & 0x3FFF) << 2, local15, arg0, arg1);
		}
	}
}
