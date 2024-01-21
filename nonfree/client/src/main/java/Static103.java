import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
	public static int anInt2265;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Lclient!tg;")
	private static Class81 aClass81_796 = Static120.method2057("button near the top of that page)3");

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Lclient!tg;")
	public static Class81 aClass81_793 = aClass81_796;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "Lclient!tg;")
	public static Class81 aClass81_794 = Static120.method2057("(U4");

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Lclient!tg;")
	public static Class81 aClass81_795 = Static120.method2057("sl_back");

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_797 = Static120.method2057("<col=ffff00>");

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Lclient!tg;")
	public static Class81 aClass81_798 = Static120.method2057("::gc");

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "[I")
	public static int[] anIntArray244 = new int[128];

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "[I")
	public static int[] anIntArray245 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class85 local3 = new Class85();
		local3.anInt3950 = arg2 / 128;
		local3.anInt3954 = arg3 / 128;
		local3.anInt3949 = arg4 / 128;
		local3.anInt3959 = arg5 / 128;
		local3.anInt3961 = arg1;
		local3.anInt3958 = arg2;
		local3.anInt3953 = arg3;
		local3.anInt3957 = arg4;
		local3.anInt3942 = arg5;
		local3.anInt3945 = arg6;
		local3.anInt3955 = arg7;
		Static19.aClass85ArrayArray1[arg0][Static19.anIntArray21[arg0]++] = local3;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public static void method1703() {
		aClass81_793 = null;
		anIntArray244 = null;
		aClass81_796 = null;
		aClass81_795 = null;
		aClass81_798 = null;
		aClass81_797 = null;
		aClass81_794 = null;
		anIntArray245 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
	public static int method1704(@OriginalArg(1) int arg0) {
		@Pc(20) Class1_Sub2_Sub4 local20 = Static46.method848(arg0);
		@Pc(23) int local23 = local20.anInt530;
		@Pc(26) int local26 = local20.anInt534;
		@Pc(33) int local33 = Class1_Sub8_Sub1.anIntArray16[local23 - local26];
		@Pc(36) int local36 = local20.anInt528;
		return local33 & Static83.anIntArray178[local36] >> local26;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII)V")
	public static void method1705(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub2_Sub4 local7 = Static46.method848(arg0);
		@Pc(10) int local10 = local7.anInt528;
		@Pc(13) int local13 = local7.anInt534;
		@Pc(16) int local16 = local7.anInt530;
		@Pc(23) int local23 = Class1_Sub8_Sub1.anIntArray16[local16 - local13];
		if (arg1 < 0 || arg1 > local23) {
			arg1 = 0;
		}
		local23 <<= local13;
		Static83.anIntArray178[local10] = ~local23 & Static83.anIntArray178[local10] | arg1 << local13 & local23;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZLjava/util/Random;)I")
	public static int method1706(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static98.method1638(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(40) int local40;
			do {
				local40 = arg1.nextInt();
			} while (local40 >= local37);
			return Static87.method1495(arg0, local40);
		}
	}
}
