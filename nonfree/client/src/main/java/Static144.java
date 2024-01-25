import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	public static int anInt3606;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Z")
	public static boolean aBoolean300 = false;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	public static int anInt3605 = 0;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean301 = true;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Z")
	public static boolean aBoolean302 = false;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!ha;IIIII)Lclient!ka;")
	public static Class128 method3175(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(12) Class128 local12 = (Class128) Static29.aClass112_5.method3640(local6);
		if (local12 == null) {
			@Pc(34) Class142 local34 = Static579.method8023(arg4, Static412.aClass181_78);
			if (local34 == null) {
				return null;
			}
			if (local34.anInt5151 < 13) {
				local34.method4357();
			}
			local12 = arg1.method6157(local34, 2055, Static198.anInt4626, 64, 768);
			Static29.aClass112_5.method3636(local6, local12);
		}
		local12 = local12.method6279((byte) 2, 2055, true);
		if (arg5 != 0) {
			local12.a(arg5);
		}
		if (arg3 != 0) {
			local12.FA(arg3);
		}
		if (arg0 != 0) {
			local12.VA(arg0);
		}
		if (arg2 != 0) {
			local12.H(0, arg2, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BB)Z")
	public static boolean method3176(@OriginalArg(0) byte arg0) {
		@Pc(14) int local14 = arg0 & 0xFF;
		if (local14 == 0) {
			return false;
		} else {
			return local14 < 128 || local14 >= 160 || Static565.aCharArray7[local14 - 128] != '\u0000';
		}
	}
}
