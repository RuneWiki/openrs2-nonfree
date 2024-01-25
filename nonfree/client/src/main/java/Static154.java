import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "Lclient!kda;")
	public static Class160 aClass160_34;

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
	public static int anInt3465;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "([Lclient!vp;BZIII)V")
	public static void method3119(@OriginalArg(0) Class309[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
			@Pc(14) Class309 local14 = arg0[local9];
			if (local14 != null && arg3 == local14.anInt8764) {
				Static11.method240(arg1, arg2, local14, arg4);
				Static140.method2957(local14, arg4, arg2);
				if (local14.anInt8786 > local14.anInt8807 - local14.anInt8790) {
					local14.anInt8786 = local14.anInt8807 - local14.anInt8790;
				}
				if (local14.anInt8721 > local14.anInt8775 - local14.anInt8752) {
					local14.anInt8721 = local14.anInt8775 - local14.anInt8752;
				}
				if (local14.anInt8786 < 0) {
					local14.anInt8786 = 0;
				}
				if (local14.anInt8721 < 0) {
					local14.anInt8721 = 0;
				}
				if (local14.anInt8802 == 0) {
					Static341.method5527(local14, arg1);
				}
			}
		}
	}
}
