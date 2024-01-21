import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
	public static int anInt1523;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!lf;")
	public static Class49 aClass49_796 = Static32.method683("logo");

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_797 = Static32.method683("<col=ff9040>");

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Lclient!lf;")
	public static Class49 aClass49_798 = Static32.method683("Einloggen");

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
	public static int anInt1527 = 0;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!lf;")
	public static Class49 aClass49_799 = Static32.method683("<img=0>");

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!lf;")
	public static Class49 aClass49_800 = Static32.method683("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!vg;IILclient!kf;II)V")
	public static void method1209(@OriginalArg(0) int arg0, @OriginalArg(1) Class85 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub2_Sub2_Sub3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = Math.min(arg1.anInt3858 / 2, arg1.anInt3867 / 2);
		@Pc(21) int local21 = arg5 * arg5 + arg0 * arg0;
		if (local9 * local9 >= local21 || local21 >= 90000) {
			Static75.method1223(arg0, arg2, arg5, arg4, arg3, arg1);
			return;
		}
		local9 -= 10;
		@Pc(48) int local48 = Static43.anInt1034 + Static63.anInt1356 & 0x7FF;
		@Pc(52) int local52 = Class2_Sub2_Sub2_Sub4.anIntArray218[local48];
		@Pc(56) int local56 = Class2_Sub2_Sub2_Sub4.anIntArray217[local48];
		@Pc(64) int local64 = local56 * 256 / (Static128.anInt2774 + 256);
		@Pc(72) int local72 = local52 * 256 / (Static128.anInt2774 + 256);
		@Pc(83) int local83 = local72 * arg5 - arg0 * local64 >> 16;
		@Pc(93) int local93 = arg5 * local64 + local72 * arg0 >> 16;
		@Pc(99) double local99 = Math.atan2((double) local93, (double) local83);
		@Pc(106) int local106 = (int) ((double) local9 * Math.sin(local99));
		@Pc(113) int local113 = (int) (Math.cos(local99) * (double) local9);
		Static146.aClass2_Sub2_Sub2_Sub3_7.method1536(local106 + arg2 + arg1.anInt3858 / 2 - 10, -local113 + arg1.anInt3867 / 2 + arg4 - 10, local99);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method1210() {
		aClass49_796 = null;
		aClass49_798 = null;
		aClass49_797 = null;
		aClass49_800 = null;
		aClass49_799 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Lclient!la;")
	public static Class47 method1211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass47_1;
	}
}
