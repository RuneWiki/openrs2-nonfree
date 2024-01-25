import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "Lclient!kn;")
	public static Class193 aClass193_1;

	@OriginalMember(owner = "client!tj", name = "z", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_65 = new Class165(64);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V")
	public static void method8152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class164 local7 = Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class28_Sub1_Sub2 local13 = local7.aClass28_Sub1_Sub2_2;
		@Pc(16) Class28_Sub1_Sub2 local16 = local7.aClass28_Sub1_Sub2_1;
		if (local13 != null) {
			local13.aShort37 = (short) (local13.aShort37 * arg3 / (0x10 << Static391.anInt10262 - 7));
			local13.aShort38 = (short) (local13.aShort38 * arg3 / (0x10 << Static391.anInt10262 - 7));
		}
		if (local16 != null) {
			local16.aShort37 = (short) (local16.aShort37 * arg3 / (0x10 << Static391.anInt10262 - 7));
			local16.aShort38 = (short) (local16.aShort38 * arg3 / (0x10 << Static391.anInt10262 - 7));
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)I")
	public static int method8153() {
		return Static294.anInt6320;
	}
}
