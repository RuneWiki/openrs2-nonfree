import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
	public static int anInt3348;

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
	public static int anInt3358;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Lclient!ce;")
	public static final Class3_Sub4 aClass3_Sub4_6 = new Class3_Sub4(8);

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "[S")
	public static short[] aShortArray55 = new short[256];

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
	public static int anInt3345 = 0;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
	public static int anInt3346 = 0;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
	public static int anInt3351 = 0;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
	public static volatile int anInt3353 = 0;

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1599 = Static193.method3027("Fps:");

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!kh;ILclient!cg;)V")
	public static void method2443(@OriginalArg(0) int arg0, @OriginalArg(1) Class52_Sub1 arg1, @OriginalArg(3) Class18 arg2) {
		@Pc(1) byte[] local1 = null;
		@Pc(3) Class10 local3 = Static155.aClass10_87;
		synchronized (Static155.aClass10_87) {
			for (@Pc(16) Class3_Sub17 local16 = (Class3_Sub17) Static155.aClass10_87.method267(); local16 != null; local16 = (Class3_Sub17) Static155.aClass10_87.method268()) {
				if (local16.aLong147 == (long) arg0 && arg2 == local16.aClass18_2 && local16.anInt2109 == 0) {
					local1 = local16.aByteArray17;
					break;
				}
			}
		}
		if (local1 == null) {
			@Pc(66) byte[] local66 = arg2.method471(arg0);
			arg1.method1593(arg2, local66, true, arg0);
		} else {
			arg1.method1593(arg2, local1, true, arg0);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z")
	public static boolean method2444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static208.anInt2597; local1++) {
			@Pc(6) Class87 local6 = Static24.aClass87Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3642 == 1) {
				local15 = local6.anInt3641 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3633 + (local6.anInt3631 * local15 >> 8);
					local37 = local6.anInt3626 + (local6.anInt3640 * local15 >> 8);
					local47 = local6.anInt3632 + (local6.anInt3643 * local15 >> 8);
					local57 = local6.anInt3637 + (local6.anInt3629 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3642 == 2) {
				local15 = arg0 - local6.anInt3641;
				if (local15 > 0) {
					local27 = local6.anInt3633 + (local6.anInt3631 * local15 >> 8);
					local37 = local6.anInt3626 + (local6.anInt3640 * local15 >> 8);
					local47 = local6.anInt3632 + (local6.anInt3643 * local15 >> 8);
					local57 = local6.anInt3637 + (local6.anInt3629 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3642 == 3) {
				local15 = local6.anInt3633 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3641 + (local6.anInt3635 * local15 >> 8);
					local37 = local6.anInt3628 + (local6.anInt3625 * local15 >> 8);
					local47 = local6.anInt3632 + (local6.anInt3643 * local15 >> 8);
					local57 = local6.anInt3637 + (local6.anInt3629 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3642 == 4) {
				local15 = arg2 - local6.anInt3633;
				if (local15 > 0) {
					local27 = local6.anInt3641 + (local6.anInt3635 * local15 >> 8);
					local37 = local6.anInt3628 + (local6.anInt3625 * local15 >> 8);
					local47 = local6.anInt3632 + (local6.anInt3643 * local15 >> 8);
					local57 = local6.anInt3637 + (local6.anInt3629 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3642 == 5) {
				local15 = arg1 - local6.anInt3632;
				if (local15 > 0) {
					local27 = local6.anInt3641 + (local6.anInt3635 * local15 >> 8);
					local37 = local6.anInt3628 + (local6.anInt3625 * local15 >> 8);
					local47 = local6.anInt3633 + (local6.anInt3631 * local15 >> 8);
					local57 = local6.anInt3626 + (local6.anInt3640 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
