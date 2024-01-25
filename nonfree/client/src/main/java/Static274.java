import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!rc", name = "K", descriptor = "Lclient!io;")
	public static Class97 aClass97_1;

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString196;

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "[I")
	public static final int[] anIntArray472 = new int[14];

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "F")
	public static float aFloat100 = 1024.0F;

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString197 = "Opened title screen";

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
	public static int anInt5227 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZLclient!e;ILclient!fa;)V")
	public static void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class46 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class59 arg4) {
		@Pc(8) Class184 local8 = Static100.method2240(arg4.anInt1949);
		if (local8.anInt5592 == -1) {
			return;
		}
		if (arg4.aBoolean131) {
			@Pc(26) int local26 = arg1 + arg4.anInt1935;
			arg1 = local26 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(38) Class2 local38 = local8.method4964(arg4.aBoolean136, arg1, arg2);
		if (local38 == null) {
			return;
		}
		@Pc(44) int local44 = arg4.anInt1950;
		@Pc(47) int local47 = arg4.anInt1912;
		if ((arg1 & 0x1) == 1) {
			local47 = arg4.anInt1950;
			local44 = arg4.anInt1912;
		}
		@Pc(63) int local63 = local38.method2630();
		@Pc(66) int local66 = local38.method2627();
		if (local8.aBoolean369) {
			local63 = local44 * 4;
			local66 = local47 * 4;
		}
		if (local8.anInt5587 == 0) {
			local38.method2632(arg0, arg3 + 4 - local47 * 4, local63, local66);
		} else {
			local38.method2637(arg0, arg3 - (local47 - 1) * 4, local63, local66, 1, local8.anInt5587 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(III)Lclient!tk;")
	public static Class10_Sub5 method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class213 local7 = Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass10_Sub5_1 == null ? null : local7.aClass10_Sub5_1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[IB)V")
	public static void method4661(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		for (@Pc(11) int local11 = 31; local11 > 0; local11--) {
			@Pc(17) int local17 = local11 * 36;
			for (@Pc(19) int local19 = 35; local19 > 0; local19--) {
				if (arg1[local19 + local17] == 0 && arg1[local19 + local17 - 37] != 0) {
					arg1[local17 + local19] = arg0;
				}
			}
		}
	}
}
