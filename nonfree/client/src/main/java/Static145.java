import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_118 = new Class93("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
	public static int anInt6939 = -1;

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
	public static int anInt6944 = 0;

	@OriginalMember(owner = "client!ir", name = "K", descriptor = "[S")
	public static final short[] aShortArray114 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V")
	public static void method5964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static312.aClass119_189 = new Class119(arg0);
		Static38.aClass119_24 = new Class119(arg1);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "([BB)[B")
	public static byte[] method5966(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub10 local8 = new Class2_Sub10(arg0);
		@Pc(17) int local17 = local8.method4421();
		@Pc(21) int local21 = local8.method4444();
		if (local21 < 0 || Static86.anInt1864 != 0 && local21 > Static86.anInt1864) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(47) byte[] local47 = new byte[local21];
			local8.method4417(local47, local21);
			return local47;
		} else {
			@Pc(59) int local59 = local8.method4444();
			if (local59 < 0 || Static86.anInt1864 != 0 && local59 > Static86.anInt1864) {
				throw new RuntimeException();
			}
			@Pc(77) byte[] local77 = new byte[local59];
			if (local17 == 1) {
				Static195.method3510(local77, local59, arg0, local21);
			} else {
				Static159.aClass147_1.method4056(local77, local8);
			}
			return local77;
		}
	}
}
