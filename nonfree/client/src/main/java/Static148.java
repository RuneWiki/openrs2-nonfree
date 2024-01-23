import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!of", name = "lb", descriptor = "Lclient!gd;")
	public static Class2_Sub3_Sub8 aClass2_Sub3_Sub8_7;

	@OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
	public static int anInt3377 = 50;

	@OriginalMember(owner = "client!of", name = "T", descriptor = "Lclient!ek;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!of", name = "U", descriptor = "Lclient!qe;")
	public static Class78 aClass78_624 = Static199.method3560("scrollbar");

	@OriginalMember(owner = "client!of", name = "X", descriptor = "Lclient!qe;")
	public static Class78 aClass78_625 = Static199.method3560("Mem:");

	@OriginalMember(owner = "client!of", name = "ab", descriptor = "I")
	public static int anInt3382 = 0;

	@OriginalMember(owner = "client!of", name = "fb", descriptor = "I")
	public static int anInt3386 = 0;

	@OriginalMember(owner = "client!of", name = "kb", descriptor = "I")
	public static int anInt3390 = 0;

	@OriginalMember(owner = "client!of", name = "nb", descriptor = "I")
	public static int anInt3392 = 0;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)V")
	public static void method2648(@OriginalArg(0) int arg0) {
		if (!Static80.method1339(arg0)) {
			return;
		}
		@Pc(16) Class64[] local16 = Static181.aClass64ArrayArray1[arg0];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(23) Class64 local23 = local16[local18];
			if (local23 != null) {
				local23.anInt3050 = 0;
				local23.anInt3020 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(IB)I")
	public static int method2650(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(IBI)I")
	public static int method2651(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (arg0 + local7) / arg1 - local7;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(III)Lclient!dj;")
	public static Class27 method2654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class27 local14 = local7.aClass27_1;
			local7.aClass27_1 = null;
			return local14;
		}
	}
}
