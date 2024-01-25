import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hha", name = "o", descriptor = "[I")
	public static int[] anIntArray299 = new int[1];

	@OriginalMember(owner = "client!hha", name = "q", descriptor = "I")
	public static int anInt4387 = -1;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "([[BILclient!wq;)V")
	public static void method3645(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class45_Sub1 arg1) {
		@Pc(8) int local8 = Static501.aByteArrayArray20.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg0[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static349.anIntArray395[local10] >> 8) * 64 - Static451.anInt7933;
				@Pc(40) int local40 = (Static349.anIntArray395[local10] & 0xFF) * 64 - Static470.anInt8063;
				Static77.method1461();
				arg1.method8536(local40, local16, Static19.aClass179Array2, Static600.aClass87_15, local29);
			}
		}
	}
}
