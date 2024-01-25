import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_1 = new Class283(14, 1);

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
	public static int anInt475 = 0;

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_2 = new Class283(15, 4);

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_3 = new Class283(16, -2);

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_4 = new Class283(17, 0);

	@OriginalMember(owner = "client!bb", name = "V", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_5 = new Class283(18, -2);

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_6 = new Class283(19, -2);

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_7 = new Class283(20, 6);

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_8 = new Class283(21, 9);

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_9 = new Class283(22, -2);

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_10 = new Class283(23, 4);

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_11 = new Class283(24, -1);

	@OriginalMember(owner = "client!bb", name = "cb", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_12 = new Class283(25, -2);

	@OriginalMember(owner = "client!bb", name = "db", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_13 = new Class283(26, 0);

	@OriginalMember(owner = "client!bb", name = "eb", descriptor = "Lclient!qf;")
	public static final Class283 aClass283_14 = new Class283(27, 0);

	@OriginalMember(owner = "client!bb", name = "gb", descriptor = "I")
	public static int anInt486 = 0;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)Lclient!kp;")
	public static Class197 method375() {
		return new Class197(1, false);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!gk;)Lclient!kda;")
	public static Class190 method380(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(7) int local7 = arg0.method4464();
		@Pc(14) Class322 local14 = Static30.method394()[arg0.method4464()];
		@Pc(21) Class347 local21 = Static226.method2754()[arg0.method4464()];
		@Pc(25) int local25 = arg0.method4478();
		@Pc(29) int local29 = arg0.method4478();
		@Pc(33) int local33 = arg0.method4518();
		@Pc(44) int local44 = arg0.method4518();
		@Pc(48) int local48 = arg0.method4509();
		@Pc(52) int local52 = arg0.method4509();
		@Pc(56) int local56 = arg0.method4509();
		@Pc(67) boolean local67 = arg0.method4464() == 1;
		return new Class190(local7, local14, local21, local25, local29, local33, local44, local48, local52, local56, local67);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!hq;II)V")
	public static void method382(@OriginalArg(0) Class148 arg0, @OriginalArg(2) int arg1) {
		if (Static276.anInt4784 >= 50 || (arg0 == null || arg0.anIntArrayArray34 == null || arg1 >= arg0.anIntArrayArray34.length || arg0.anIntArrayArray34[arg1] == null)) {
			return;
		}
		@Pc(30) int local30 = arg0.anIntArrayArray34[arg1][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(40) int local40 = local30 >> 5 & 0x7;
		@Pc(57) int local57;
		if (arg0.anIntArrayArray34[arg1].length > 1) {
			local57 = (int) ((double) arg0.anIntArrayArray34[arg1].length * Math.random());
			if (local57 > 0) {
				local34 = arg0.anIntArrayArray34[arg1][local57];
			}
		}
		local57 = 256;
		if (arg0.anIntArray255 != null && arg0.anIntArray256 != null) {
			local57 = Static241.method3436(arg0.anIntArray255[arg1], arg0.anIntArray256[arg1]);
		}
		if (arg0.aBoolean222) {
			Static351.method5040(false, local40, 0, local57, local34, 255);
		} else {
			Static86.method1275(255, local34, local57, 0, local40);
		}
	}
}
