import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!ffa", name = "B", descriptor = "I")
	public static int anInt3012 = 1;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I[[BLclient!dw;)V")
	public static void method2713(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class70_Sub1 arg1) {
		@Pc(13) int local13 = Static240.aByteArrayArray13.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(21) byte[] local21 = arg0[local15];
			if (local21 != null) {
				@Pc(34) int local34 = (Static548.anIntArray650[local15] >> 8) * 64 - Static529.anInt8344;
				@Pc(44) int local44 = (Static548.anIntArray650[local15] & 0xFF) * 64 - Static463.anInt7588;
				Static66.method1526();
				arg1.method2218(local21, local34, local44, Static221.aClass95Array2, Static4.aClass43_1);
			}
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "([BB)V")
	public static void method2714(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub11 local8 = new Class3_Sub11(arg0);
		while (true) {
			@Pc(16) int local16 = local8.method3118();
			if (local16 == 0) {
				return;
			}
			if (local16 == 2) {
				Static488.anInt7869 = local8.method3109();
			}
		}
	}
}
