import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!paa", name = "nb", descriptor = "[I")
	public static int[] anIntArray403;

	@OriginalMember(owner = "client!paa", name = "ob", descriptor = "Lclient!in;")
	public static Class169 aClass169_194;

	@OriginalMember(owner = "client!paa", name = "pb", descriptor = "Lclient!gga;")
	public static Class124 aClass124_92;

	@OriginalMember(owner = "client!paa", name = "jb", descriptor = "Lclient!in;")
	public static final Class169 aClass169_193 = new Class169(51, 4);

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIFIIZIII)[[I")
	public static int[][] method7246(@OriginalArg(2) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub15_Sub21 local13 = new Class2_Sub15_Sub21();
		local13.aBoolean573 = false;
		local13.anInt7707 = 4;
		local13.anInt7718 = (int) (arg0 * 4096.0F);
		local13.anInt7712 = 3;
		local13.anInt7715 = 4;
		local13.method9722();
		Static463.method7433(256, 64);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method6894(local9[local40], local40);
		}
		return local9;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!gga;[IILclient!gga;)V")
	public static void method7247(@OriginalArg(0) Class124 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class124 arg2) {
		aClass124_92 = arg0;
		Static638.aClass124_130 = arg2;
		if (arg1 != null) {
			Static11.anIntArray3 = arg1;
		}
	}
}
