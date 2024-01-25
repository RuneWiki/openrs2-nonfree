import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_108 = new Class252(24, 5);

	@OriginalMember(owner = "client!re", name = "d", descriptor = "S")
	public static short aShort95 = 256;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_381 = new Class305(85, 8);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BIII)Z")
	public static boolean method6567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface7 local11 = (Interface7) Static47.method5108(arg0, arg2, arg1);
		if (local11 != null) {
			local5 = Static433.method6714(local11) & true;
		}
		local11 = (Interface7) Static100.method2041(arg0, arg2, arg1, fp.class);
		if (local11 != null) {
			local5 &= Static433.method6714(local11);
		}
		local11 = (Interface7) Static465.method7066(arg0, arg2, arg1);
		if (local11 != null) {
			local5 &= Static433.method6714(local11);
		}
		return local5;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public static void method6569() {
		if (Static87.aBoolean161) {
			return;
		}
		Static87.aBoolean161 = true;
		Static506.aBoolean670 = true;
		if (Static286.aClass1_Sub15_Sub1_1.aBoolean528) {
			Static135.aFloat193 = (int) Static135.aFloat193 - 65 & 0xFFFFFF80;
		} else {
			Static360.aFloat140 += (-Static360.aFloat140 - 24.0F) / 2.0F;
		}
	}
}
