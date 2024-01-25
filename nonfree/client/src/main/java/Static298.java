import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "[I")
	public static int[] anIntArray285 = new int[1];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!cc;[[B)V")
	public static void method4354(@OriginalArg(1) Class49_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(8) int local8 = Static455.aByteArrayArray21.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg1[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static448.anIntArray394[local10] >> 8) * 64 - Static534.anInt8358;
				@Pc(40) int local40 = (Static448.anIntArray394[local10] & 0xFF) * 64 - Static402.anInt6661;
				Static333.method4737();
				arg0.method1227(local16, local29, Static609.aClass110Array1, local40, Static119.aClass95_4);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(CI)Z")
	public static boolean method4358(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
