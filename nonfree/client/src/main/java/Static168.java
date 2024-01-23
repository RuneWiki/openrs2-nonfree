import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "[I")
	public static int[] anIntArray321 = new int[4096];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)I")
	public static int method2911(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(29) int local29 = (local14 >>> 2 & 0xB3333333) + (local14 & 0x33333333);
		@Pc(37) int local37 = (local29 >>> 4) + local29 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BII)V")
	public static void method2912(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub18 local8 = Static130.method2227(arg1, 1);
		local8.method3905();
		local8.anInt5005 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
	public static void method2914(@OriginalArg(1) int arg0) {
		if (Static21.anIntArray47 == null || Static21.anIntArray47.length < arg0) {
			Static21.anIntArray47 = new int[arg0];
		}
	}
}
