import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
	public static int anInt3326;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1080 = Static186.method3527(" is already on your friend list)3");

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
	public static int anInt3323 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1081 = Static186.method3527("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1082 = aClass50_1080;

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "[I")
	public static int[] anIntArray357 = new int[256];

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1083 = Static186.method3527(":chalreq:");

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1084 = Static186.method3527("mem=");

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(II)I")
	public static int method2682(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 * 6 - 61440;
		@Pc(24) int local24 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(33) int local33 = (local14 * arg0 >> 12) + 40960;
		return local24 * local33 >> 12;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method2683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(3) int local3 = 0; local3 < Static131.aClass62_2.anInt2136; local3++) {
			@Pc(13) int local13 = Static131.aClass62_2.aShortArray32[local3] - Static121.anInt2393;
			@Pc(30) int local30 = (local13 - arg2) * (arg3 - arg6) / (arg4 - arg2) + arg6;
			@Pc(42) int local42 = Static195.anInt3969 + Static12.anInt239 - Static131.aClass62_2.aShortArray31[local3] - 1;
			@Pc(47) int local47 = Static131.aClass62_2.method1640(local3);
			@Pc(64) int local64 = arg0 + (local42 - arg1) * (arg5 - arg0) / (arg7 - arg1);
			@Pc(66) Class27 local66 = null;
			if (local47 == 0) {
				if ((double) Static198.aFloat6 == 3.0D) {
					local66 = Static102.aClass27_3;
				}
				if ((double) Static198.aFloat6 == 4.0D) {
					local66 = Static225.aClass27_8;
				}
				if ((double) Static198.aFloat6 == 6.0D) {
					local66 = Static131.aClass27_4;
				}
				if ((double) Static198.aFloat6 == 8.0D) {
					local66 = Static5.aClass27_1;
				}
			}
			@Pc(98) int local98 = 16777215;
			if (local47 == 1) {
				if ((double) Static198.aFloat6 == 3.0D) {
					local66 = Static131.aClass27_4;
				}
				if ((double) Static198.aFloat6 == 4.0D) {
					local66 = Static5.aClass27_1;
				}
				if ((double) Static198.aFloat6 == 6.0D) {
					local66 = Static189.aClass27_6;
				}
				if ((double) Static198.aFloat6 == 8.0D) {
					local66 = Static190.aClass27_7;
				}
			}
			if (local47 == 2) {
				if ((double) Static198.aFloat6 == 3.0D) {
					local66 = Static189.aClass27_6;
				}
				local98 = 16755200;
				if ((double) Static198.aFloat6 == 4.0D) {
					local66 = Static190.aClass27_7;
				}
				if ((double) Static198.aFloat6 == 6.0D) {
					local66 = Static132.aClass27_5;
				}
				if ((double) Static198.aFloat6 == 8.0D) {
					local66 = Static43.aClass27_2;
				}
			}
			if (Static131.aClass62_2.anIntArray205[local3] != -1) {
				local98 = Static131.aClass62_2.anIntArray205[local3];
			}
			if (local66 != null) {
				@Pc(188) Class50[] local188 = new Class50[Static131.aClass62_2.aClass50Array38[local3].method1250() + 1];
				Static5.aClass1_Sub1_Sub10_1.method1815(Static131.aClass62_2.aClass50Array38[local3], null, local188);
				@Pc(200) int local200 = local188.length;
				local64 -= (local200 - 1) * local66.method785() / 2;
				local64 += local66.method790() / 2;
				for (@Pc(220) int local220 = 0; local220 < local200; local220++) {
					@Pc(249) Class50 local249 = local220 == local200 - 1 ? local188[local220] : local188[local220].method1216(local188[local220].method1249() - 4, 0);
					local66.method793(local249, local30, local64, local98);
					local64 += local66.method785();
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Lclient!hh;")
	public static Class50 method2684(@OriginalArg(0) int arg0) {
		return Static8.method148(arg0, false);
	}
}
