import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
	public static int anInt5626;

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "Lclient!um;")
	public static Class243 aClass243_195;

	@OriginalMember(owner = "client!qr", name = "s", descriptor = "Lclient!c;")
	public static Class29 aClass29_6;

	@OriginalMember(owner = "client!qr", name = "E", descriptor = "Lclient!um;")
	public static Class243 aClass243_196;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
	public static int anInt5625 = 0;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIZZI)I")
	public static int method4470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) Class5_Sub26 local10 = Static176.method2415(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray247.length; local18++) {
			if (local10.anIntArray247[local18] >= 0 && local10.anIntArray247[local18] < Static306.aClass67_3.anInt1775) {
				@Pc(47) Class40 local47 = Static306.aClass67_3.method1452(local10.anIntArray247[local18]);
				@Pc(57) int local57 = local47.method969(arg0, Static1.aClass33_3.method788(arg0).anInt4273);
				if (arg2) {
					local16 += local57 * local10.anIntArray249[local18];
				} else {
					local16 += local57;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIB)V")
	public static void method4471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub2_Sub9 local8 = Static72.method1073(16, arg0);
		local8.method3026();
		local8.anInt3818 = arg1;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!fh;I)V")
	public static void method4472(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (Static296.aClass10_5 == null) {
			return;
		}
		try {
			Static296.aClass10_5.method171(0L);
			Static296.aClass10_5.method172(arg1, 24, arg0.aByteArray93);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
