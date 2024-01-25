import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Z")
	public static boolean aBoolean262 = false;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "F")
	public static float aFloat83 = 0.0F;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "S")
	public static short aShort25 = 256;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "[[B")
	public static final byte[][] aByteArrayArray9 = new byte[50][];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIZII)V")
	public static void method2791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class5_Sub6 local7 = null;
		for (@Pc(12) Class5_Sub6 local12 = (Class5_Sub6) Static173.aClass114_20.method2805(); local12 != null; local12 = (Class5_Sub6) Static173.aClass114_20.method2814()) {
			if (arg0 == local12.anInt551 && arg5 == local12.anInt548 && local12.anInt547 == arg4 && arg2 == local12.anInt554) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class5_Sub6();
			local7.anInt554 = arg2;
			local7.anInt551 = arg0;
			local7.anInt547 = arg4;
			local7.anInt548 = arg5;
			if (arg5 >= 0 && arg4 >= 0 && arg5 < Static201.anInt3834 && arg4 < Static626.anInt10238) {
				Static340.method5190(local7);
			}
			Static173.aClass114_20.method2807(local7);
		}
		local7.anInt544 = arg3;
		local7.aBoolean37 = true;
		local7.aBoolean36 = false;
		local7.anInt553 = arg6;
		local7.anInt550 = arg1;
	}
}
