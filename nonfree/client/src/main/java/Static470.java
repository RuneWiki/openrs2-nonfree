import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
	public static int anInt8834;

	@OriginalMember(owner = "client!qca", name = "d", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_95 = new Class387(52, 7);

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BII[B)[B")
	public static byte[] method7564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) byte[] local12;
		if (arg1 <= 0) {
			local12 = arg2;
		} else {
			local12 = new byte[arg0];
			for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
				local12[local19] = arg2[arg1 + local19];
			}
		}
		@Pc(53) Class210 local53 = new Class210();
		local53.method5050();
		local53.method5048((long) (arg0 * 8), local12);
		@Pc(67) byte[] local67 = new byte[64];
		local53.method5057(local67);
		return local67;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZIIIZ)Lclient!ss;")
	public static Class5_Sub49 method7565(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(19) Class5_Sub49 local19 = new Class5_Sub49();
		local19.anInt9318 = arg0;
		local19.anInt9322 = arg1;
		Static549.aClass291_37.method6984((long) arg2, local19);
		Static366.method5408(arg1);
		@Pc(38) Class73 local38 = Static259.method3831(arg2);
		if (local38 != null) {
			Static298.method4399(local38);
		}
		if (Static24.aClass73_3 != null) {
			Static298.method4399(Static24.aClass73_3);
			Static24.aClass73_3 = null;
		}
		Static231.method3356();
		if (local38 != null) {
			Static547.method7962(local38, !arg3);
		}
		if (!arg3) {
			Static173.method2523(arg1);
		}
		if (!arg3 && Static390.anInt6669 != -1) {
			Static190.method2757(Static390.anInt6669, 1);
		}
		return local19;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(II)V")
	public static void method7567(@OriginalArg(1) int arg0) {
		Static305.anInt5440 = arg0;
		Static536.aClass391_51.method9276(0);
	}
}
