import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!ve", name = "Cb", descriptor = "I")
	public static int anInt7321;

	@OriginalMember(owner = "client!ve", name = "xc", descriptor = "I")
	public static int anInt7349;

	@OriginalMember(owner = "client!ve", name = "Ac", descriptor = "I")
	public static int anInt7350;

	@OriginalMember(owner = "client!ve", name = "Cc", descriptor = "Lclient!pc;")
	public static Class188 aClass188_123;

	@OriginalMember(owner = "client!ve", name = "tc", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_73 = new Class129(50);

	@OriginalMember(owner = "client!ve", name = "zc", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_155 = new Class256("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!ve", name = "Bc", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_91 = new Class44(71, 7);

	@OriginalMember(owner = "client!ve", name = "Dc", descriptor = "I")
	public static int anInt7351 = 0;

	@OriginalMember(owner = "client!ve", name = "Ec", descriptor = "I")
	public static int anInt7352 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIII)V")
	public static void method5687(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg3;
		@Pc(14) int local14 = arg2 - arg0;
		if (local14 == 0) {
			if (local10 != 0) {
				Static159.method2513(arg0, arg4, arg1, arg3);
			}
		} else if (local10 == 0) {
			Static227.method3516(arg2, arg4, arg0, arg3);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(62) boolean local62 = local14 < local10;
			@Pc(66) int local66;
			@Pc(70) int local70;
			if (local62) {
				local66 = arg0;
				arg0 = arg3;
				local70 = arg2;
				arg3 = local66;
				arg2 = arg1;
				arg1 = local70;
			}
			if (arg2 < arg0) {
				local66 = arg0;
				arg0 = arg2;
				local70 = arg3;
				arg3 = arg1;
				arg2 = local66;
				arg1 = local70;
			}
			local66 = arg3;
			local70 = arg2 - arg0;
			@Pc(103) int local103 = arg1 - arg3;
			@Pc(108) int local108 = -(local70 >> 1);
			@Pc(119) int local119 = arg1 <= arg3 ? -1 : 1;
			if (local103 < 0) {
				local103 = -local103;
			}
			@Pc(131) int local131;
			if (local62) {
				for (local131 = arg0; local131 <= arg2; local131++) {
					local108 += local103;
					Static277.anIntArrayArray40[local131][local66] = arg4;
					if (local108 > 0) {
						local66 += local119;
						local108 -= local70;
					}
				}
			} else {
				for (local131 = arg0; local131 <= arg2; local131++) {
					local108 += local103;
					Static277.anIntArrayArray40[local66][local131] = arg4;
					if (local108 > 0) {
						local66 += local119;
						local108 -= local70;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
	public static void method5689() {
		Static193.aClass56_3 = null;
		Static266.aClass76Array14 = null;
		Static245.aClass76Array13 = null;
		Static226.aClass76_11 = null;
		Static375.aClass76Array17 = null;
		Static411.aClass76Array18 = null;
		Static120.aClass76Array12 = null;
		Static91.aClass76Array9 = null;
		Static192.aClass76Array6 = null;
		Static119.aClass76Array11 = null;
		Static76.aClass76Array8 = null;
		Static372.aClass76Array16 = null;
		Static23.aClass76Array1 = null;
		Static284.aClass76_13 = null;
		Static184.aClass56_2 = null;
		Static344.aClass76Array15 = null;
		Static418.aClass56_4 = null;
		Static218.aClass76Array3 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(CB)Z")
	public static boolean method5698(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIB)V")
	public static void method5700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg3, 8);
		local8.method434();
		local8.anInt656 = arg2;
		local8.anInt657 = arg1;
		local8.anInt659 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ks;ZZB)V")
	public static void method5701(@OriginalArg(0) Class2_Sub25 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt4163;
		@Pc(12) int local12 = (int) arg0.aLong227;
		arg0.method6072();
		if (arg2) {
			Static299.method4339(local8);
		}
		Static375.method5256(local8);
		@Pc(27) Class41 local27 = Static160.method2564(local12);
		if (local27 != null) {
			Static168.method2616(local27);
		}
		Static231.method3539();
		if (!arg1 && Static108.anInt2264 != -1) {
			Static442.method5989(Static108.anInt2264, 1);
		}
		@Pc(48) Class211 local48 = new Class211(Static398.aClass240_27);
		for (@Pc(53) Class2_Sub25 local53 = (Class2_Sub25) local48.method4764(); local53 != null; local53 = (Class2_Sub25) local48.method4760()) {
			if (!local53.method6074()) {
				local53 = (Class2_Sub25) local48.method4764();
				if (local53 == null) {
					break;
				}
			}
			if (local53.anInt4162 == 3) {
				@Pc(78) int local78 = (int) local53.aLong227;
				if (local8 == local78 >>> 16) {
					method5701(local53, arg1, true);
				}
			}
		}
	}
}
