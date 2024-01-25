import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!saa", name = "i", descriptor = "J")
	public static long aLong320;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ILclient!lk;)V")
	public static void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28_Sub2 arg1) {
		for (@Pc(3) int local3 = 0; local3 < Static3.anInt30; local3++) {
			@Pc(11) int local11 = Static603.anIntArray545[local3];
			@Pc(15) Class19_Sub1_Sub3_Sub2_Sub2 local15 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local11];
			@Pc(21) int local21 = arg1.method5322(arg0 ^ 0xFFFF7F8B);
			if ((local21 & 0x4) != 0) {
				local21 += arg1.method5322(-31) << 8;
			}
			if ((local21 & 0x8000) != 0) {
				local21 += arg1.method5322(arg0 ^ 0xFFFF7FE5) << 16;
			}
			Static204.method3026(local21, local11, local15, arg1);
		}
		if (arg0 != 32768) {
			method7904(-103, (Class3_Sub28_Sub2) null);
		}
	}
}
