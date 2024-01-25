import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_32 = new Class179(12, 4);

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
	public static final int anInt2733 = 1400;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
	public static void method2344() {
		for (@Pc(22) Class1_Sub42 local22 = (Class1_Sub42) Static16.aClass181_4.method4112(); local22 != null; local22 = (Class1_Sub42) Static16.aClass181_4.method4104()) {
			if (local22.anInt6551 == -1) {
				local22.anInt6563 = 0;
				if (local22.anInt6560 >= 0 && local22.anInt6557 >= 0 && local22.anInt6560 < Static195.anInt3537 && local22.anInt6557 < Static118.anInt2419) {
					Static384.method5198(local22);
				}
			} else {
				local22.method6020();
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!wt;Lclient!kn;Lclient!ya;IIIBLclient!ql;)V")
	public static void method2345(@OriginalArg(0) Class271 arg0, @OriginalArg(1) Class1_Sub26 arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class202 arg6) {
		@Pc(14) int local14 = arg1.anInt3923 - arg3 / 2 - 5;
		@Pc(18) int local18 = arg5 + 2;
		if (arg6.anInt5563 != 0) {
			arg2.method4563(local18, arg6.anInt5563, arg3 + 10, local14, arg0.method6013() * arg4 + arg5 + 1 - local18);
		}
		if (arg6.anInt5584 != 0) {
			arg2.method4499(arg6.anInt5584, local14, arg3 + 10, local18, arg4 * arg0.method6013() + arg5 + 1 - local18);
		}
		@Pc(78) int local78 = arg6.anInt5565;
		if (arg1.aBoolean279 && arg6.anInt5562 != -1) {
			local78 = arg6.anInt5562;
		}
		for (@Pc(90) int local90 = 0; local90 < arg4; local90++) {
			@Pc(96) String local96 = Static123.aStringArray18[local90];
			if (arg4 - 1 > local90) {
				local96 = local96.substring(0, local96.length() - 4);
			}
			arg0.method6012(arg2, local96, arg1.anInt3923, arg5, local78);
			arg5 += arg0.method6013();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)I")
	public static int method2347(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method2348(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) long local9 = (long) 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			local9 = (local9 << 5) + (long) arg0.charAt(local11) - local9;
		}
		return local9;
	}
}
