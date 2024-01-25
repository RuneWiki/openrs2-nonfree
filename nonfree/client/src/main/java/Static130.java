import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!eia", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!eia", name = "i", descriptor = "[Lclient!ae;")
	public static final Class6_Sub2_Sub1[] aClass6_Sub2_Sub1Array4 = new Class6_Sub2_Sub1[14];

	@OriginalMember(owner = "client!eia", name = "p", descriptor = "Z")
	public static boolean aBoolean182 = false;

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ZII)Z")
	public static boolean method2123(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(FIIIIZII)[I")
	public static int[] method2124(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class6_Sub4_Sub5 local10 = new Class6_Sub4_Sub5();
		local10.aBoolean164 = true;
		local10.anInt2212 = 35;
		local10.anInt2200 = 4;
		local10.anInt2207 = 8;
		local10.anInt2211 = 8;
		local10.anInt2198 = (int) (arg0 * 4096.0F);
		local10.method8315();
		Static535.method7897(1, 2048);
		local10.method1852(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(B[B)[B")
	public static byte[] method2126(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class6_Sub40 local8 = new Class6_Sub40(arg0);
		@Pc(12) int local12 = local8.method8604();
		@Pc(16) int local16 = local8.method8579();
		if (local16 < 0 || Static522.anInt9107 != 0 && local16 > Static522.anInt9107) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(103) byte[] local103 = new byte[local16];
			local8.method8595(local103, local16, 0);
			return local103;
		} else {
			@Pc(59) int local59 = local8.method8579();
			if (local59 < 0 || Static522.anInt9107 != 0 && Static522.anInt9107 < local59) {
				throw new RuntimeException();
			}
			@Pc(73) byte[] local73 = new byte[local59];
			if (local12 == 1) {
				Static405.method6493(local73, local59, arg0, local16);
			} else {
				@Pc(78) Class109 local78 = Static281.aClass109_1;
				synchronized (Static281.aClass109_1) {
					Static281.aClass109_1.method3150(local8, local73);
				}
			}
			return local73;
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(BLclient!cha;ILclient!cha;IZZ)I")
	public static int method2129(@OriginalArg(1) Class51_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class51_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static463.method7062(arg3, arg2, arg5, arg0);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(33) int local33 = Static463.method7062(arg1, arg2, arg4, arg0);
			return arg4 ? -local33 : local33;
		}
	}
}
