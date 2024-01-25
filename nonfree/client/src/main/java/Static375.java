import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
	public static int anInt6552 = 999999;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!co;BI)V")
	public static void method5527(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		if (Static331.anInt6013 >= 50 || (arg0 == null || arg0.anIntArrayArray7 == null || arg0.anIntArrayArray7.length <= arg1 || arg0.anIntArrayArray7[arg1] == null)) {
			return;
		}
		@Pc(37) int local37 = arg0.anIntArrayArray7[arg1][0];
		@Pc(41) int local41 = local37 >> 8;
		@Pc(58) int local58;
		if (arg0.anIntArrayArray7[arg1].length > 1) {
			local58 = (int) ((double) arg0.anIntArrayArray7[arg1].length * Math.random());
			if (local58 > 0) {
				local41 = arg0.anIntArrayArray7[arg1][local58];
			}
		}
		@Pc(76) int local76 = local37 >> 5 & 0x7;
		local58 = 256;
		if (arg0.anIntArray76 != null && arg0.anIntArray73 != null) {
			local58 = Static537.method8642(arg0.anIntArray73[arg1], arg0.anIntArray76[arg1]);
		}
		if (arg0.aBoolean104) {
			Static99.method1646(local58, 0, local41, false, local76, 255);
		} else {
			Static85.method1307(local41, 0, local76, local58, 255);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[Lclient!qda;)V")
	public static void method5528(@OriginalArg(1) Class59[] arg0) {
		Static369.anInt6462 = arg0.length;
		Static113.aClass59Array2 = new Class59[Static369.anInt6462 + 10];
		Static558.anIntArray502 = new int[Static369.anInt6462 + 10];
		Static685.method8331(arg0, 0, Static113.aClass59Array2, 0, Static369.anInt6462);
		for (@Pc(24) int local24 = 0; local24 < Static369.anInt6462; local24++) {
			Static558.anIntArray502[local24] = Static113.aClass59Array2[local24].method8064();
		}
		for (@Pc(38) int local38 = Static369.anInt6462; local38 < Static113.aClass59Array2.length; local38++) {
			Static558.anIntArray502[local38] = 12;
		}
	}
}
