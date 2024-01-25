import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
	public static int anInt1721;

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
	public static int anInt1724;

	@OriginalMember(owner = "client!eh", name = "L", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_25 = new Class244(80, -1);

	@OriginalMember(owner = "client!eh", name = "R", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_31 = new Class57("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
	public static int anInt1723 = 1;

	@OriginalMember(owner = "client!eh", name = "Y", descriptor = "Lclient!us;")
	public static final Class234 aClass234_37 = new Class234(66, 12);

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)I")
	public static int method1392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(13) int local13 = arg2 & arg1 - 1;
		@Pc(17) int local17 = arg0 / arg1;
		@Pc(28) int local28 = arg0 & arg1 - 1;
		@Pc(33) int local33 = Static281.method4457(local7, local17);
		@Pc(40) int local40 = Static281.method4457(local7 + 1, local17);
		@Pc(47) int local47 = Static281.method4457(local7, local17 + 1);
		@Pc(56) int local56 = Static281.method4457(local7 + 1, local17 + 1);
		@Pc(63) int local63 = Static384.method5679(local13, local33, local40, arg1);
		@Pc(70) int local70 = Static384.method5679(local13, local47, local56, arg1);
		return Static384.method5679(local28, local63, local70, arg1);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIB)Lclient!bj;")
	public static Class28_Sub1_Sub1 method1393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class48 local11 = Static69.aClass48ArrayArrayArray1[arg2][arg1][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(22) Class28_Sub1_Sub1 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class50 local27 = local11.aClass50_1; local27 != null; local27 = local27.aClass50_2) {
			@Pc(31) Class28_Sub1 local31 = local27.aClass28_Sub1_1;
			if (local31 instanceof Class28_Sub1_Sub1) {
				@Pc(37) Class28_Sub1_Sub1 local37 = (Class28_Sub1_Sub1) local31;
				@Pc(47) int local47 = (local37.method4009() - 1) * 64 + 60;
				@Pc(55) int local55 = local37.anInt5774 - local47 >> 7;
				@Pc(63) int local63 = local37.anInt5766 - local47 >> 7;
				@Pc(70) int local70 = local37.anInt5774 + local47 >> 7;
				@Pc(78) int local78 = local37.anInt5766 + local47 >> 7;
				if (local55 <= arg1 && local63 <= arg0 && local70 >= arg1 && arg0 <= local78) {
					@Pc(108) int local108 = (local78 + 1 - arg0) * (-arg1 + local70 + 1);
					if (local24 < local108) {
						local24 = local108;
						local22 = local37;
					}
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BII)I")
	public static int method1394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static226.anIntArray428[arg0 & 0x3] : Static312.anIntArray593[arg0 & 0x3];
	}
}
