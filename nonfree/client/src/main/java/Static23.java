import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public static int anInt7093;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
	public static int anInt7087 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!hd;[[BZ)V")
	public static void method5676(@OriginalArg(0) Class107_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(8) int local8 = Static246.aByteArrayArray15.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(21) byte[] local21 = arg1[local10];
			if (local21 != null) {
				@Pc(34) int local34 = (Static450.anIntArray635[local10] >> 8) * 64 - Static386.anInt7205;
				@Pc(45) int local45 = (Static450.anIntArray635[local10] & 0xFF) * 64 - Static153.anInt2798;
				Static230.method3117();
				arg0.method2287(Static89.aClass225Array2, local34, local45, Static257.aClass75_8, local21);
			}
		}
	}
}
