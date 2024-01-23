import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ei", name = "U", descriptor = "[I")
	public static int[] anIntArray154;

	@OriginalMember(owner = "client!ei", name = "eb", descriptor = "Lclient!mj;")
	public static Class64 aClass64_4;

	@OriginalMember(owner = "client!ei", name = "X", descriptor = "Lclient!qe;")
	private static Class78 aClass78_187 = Static199.method3560(" has logged out)3");

	@OriginalMember(owner = "client!ei", name = "R", descriptor = "Lclient!qe;")
	public static Class78 aClass78_186 = aClass78_187;

	@OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
	public static int anInt981 = 0;

	@OriginalMember(owner = "client!ei", name = "Z", descriptor = "B")
	public static byte aByte5 = 0;

	@OriginalMember(owner = "client!ei", name = "bb", descriptor = "[I")
	public static int[] anIntArray155 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!oe;BI)Z")
	public static boolean method713(@OriginalArg(0) int arg0, @OriginalArg(1) Class72 arg1) {
		@Pc(10) byte[] local10 = arg1.method3197(0, arg0);
		if (local10 == null) {
			return false;
		} else {
			Static156.method2803(local10);
			return true;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!uc;)V")
	public static void method715(@OriginalArg(0) Class100 arg0) {
		for (@Pc(2) int local2 = arg0.anInt4529; local2 <= arg0.anInt4525; local2++) {
			for (@Pc(6) int local6 = arg0.anInt4517; local6 <= arg0.anInt4528; local6++) {
				@Pc(16) Class2_Sub12 local16 = Static226.aClass2_Sub12ArrayArrayArray3[arg0.anInt4516][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt775; local20++) {
						if (local16.aClass100Array3[local20] == arg0) {
							local16.anInt775--;
							for (local35 = local20; local35 < local16.anInt775; local35++) {
								local16.aClass100Array3[local35] = local16.aClass100Array3[local35 + 1];
								local16.anIntArray128[local35] = local16.anIntArray128[local35 + 1];
							}
							local16.aClass100Array3[local16.anInt775] = null;
							break;
						}
					}
					local16.anInt762 = 0;
					for (local35 = 0; local35 < local16.anInt775; local35++) {
						local16.anInt762 |= local16.anIntArray128[local35];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIB)V")
	public static void method716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub26 local12 = (Class2_Sub26) Static48.aClass103_6.method3659((long) arg2);
		if (local12 == null) {
			local12 = new Class2_Sub26();
			Static48.aClass103_6.method3665((long) arg2, local12);
		}
		if (arg0 >= local12.anIntArray605.length) {
			@Pc(40) int[] local40 = new int[arg0 + 1];
			@Pc(45) int[] local45 = new int[arg0 + 1];
			for (@Pc(47) int local47 = 0; local47 < local12.anIntArray605.length; local47++) {
				local40[local47] = local12.anIntArray605[local47];
				local45[local47] = local12.anIntArray602[local47];
			}
			for (@Pc(73) int local73 = local12.anIntArray605.length; local73 < arg0; local73++) {
				local40[local73] = -1;
				local45[local73] = 0;
			}
			local12.anIntArray605 = local40;
			local12.anIntArray602 = local45;
		}
		local12.anIntArray605[arg0] = arg3;
		local12.anIntArray602[arg0] = arg1;
	}
}
