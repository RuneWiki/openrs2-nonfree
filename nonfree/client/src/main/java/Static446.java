import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
	public static int anInt7393;

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "Lclient!io;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
	public static int anInt7396 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[[BLclient!sv;)V")
	public static void method5854(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class195_Sub1 arg1) {
		@Pc(8) int local8 = Static163.aByteArrayArray24.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg0[local10];
			if (local16 != null) {
				@Pc(28) int local28 = (Static248.anIntArray298[local10] >> 8) * 64 - Static199.anInt3480;
				@Pc(38) int local38 = (Static248.anIntArray298[local10] & 0xFF) * 64 - Static164.anInt2731;
				Static111.method1777();
				arg1.method5009(local28, local38, Static185.aClass34_7, local16, Static447.aClass14Array3);
			}
		}
	}
}
