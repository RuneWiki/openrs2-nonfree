import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Lclient!lb;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method2948(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(13) byte[] local13;
		if (arg2 > 0) {
			local13 = new byte[arg0];
			for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
				local13[local15] = arg1[arg2 + local15];
			}
		} else {
			local13 = arg1;
		}
		@Pc(47) Class96 local47 = new Class96();
		local47.method2021();
		local47.method2025((long) (arg0 * 8), local13);
		@Pc(61) byte[] local61 = new byte[64];
		local47.method2019(local61);
		return local61;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)I")
	public static int method2949(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!qga;)Lclient!qga;")
	public static Class299 method2950(@OriginalArg(1) Class299 arg0) {
		if (arg0.anInt8527 != -1) {
			return Static391.method5936(arg0.anInt8527);
		}
		@Pc(19) int local19 = arg0.anInt8526 >>> 16;
		@Pc(24) Class190 local24 = new Class190(Static27.aClass125_3);
		for (@Pc(36) Class14_Sub13 local36 = (Class14_Sub13) local24.method4788(); local36 != null; local36 = (Class14_Sub13) local24.method4783()) {
			if (local19 == local36.anInt1465) {
				return Static391.method5936((int) local36.aLong324);
			}
		}
		return null;
	}
}
