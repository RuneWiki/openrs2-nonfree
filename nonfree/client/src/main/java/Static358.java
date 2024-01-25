import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!s", name = "O", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_51 = new Class83(8);

	@OriginalMember(owner = "client!s", name = "S", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_153 = new Class131(10, 8);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!vh;III)Lclient!wk;")
	public static Class264 method4932(@OriginalArg(0) Class250 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) byte[] local18 = arg0.method5667(0, arg1);
		return local18 == null ? null : new Class264(local18);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII)V")
	public static void method4933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg3 - arg1;
		@Pc(15) int local15 = arg2 - arg0;
		if (local10 == 0) {
			if (local15 != 0) {
				Static48.method817(arg1, arg0, arg4, arg2);
			}
		} else if (local15 == 0) {
			Static282.method4031(arg0, arg1, arg4, arg3);
		} else {
			@Pc(48) int local48 = (local15 << 12) / local10;
			@Pc(57) int local57 = arg0 - (arg1 * local48 >> 12);
			@Pc(71) int local71;
			@Pc(69) int local69;
			if (arg1 < Static83.anInt7380) {
				local71 = Static83.anInt7380;
				local69 = local57 + (Static83.anInt7380 * local48 >> 12);
			} else if (arg1 <= Static221.anInt4001) {
				local69 = arg0;
				local71 = arg1;
			} else {
				local69 = local57 + (local48 * Static221.anInt4001 >> 12);
				local71 = Static221.anInt4001;
			}
			@Pc(114) int local114;
			@Pc(112) int local112;
			if (Static83.anInt7380 > arg3) {
				local112 = local57 + (local48 * Static83.anInt7380 >> 12);
				local114 = Static83.anInt7380;
			} else if (Static221.anInt4001 >= arg3) {
				local112 = arg2;
				local114 = arg3;
			} else {
				local112 = (local48 * Static221.anInt4001 >> 12) + local57;
				local114 = Static221.anInt4001;
			}
			if (Static305.anInt5429 > local112) {
				local114 = (Static305.anInt5429 - local57 << 12) / local48;
				local112 = Static305.anInt5429;
			} else if (local112 > Static212.anInt452) {
				local112 = Static212.anInt452;
				local114 = (Static212.anInt452 - local57 << 12) / local48;
			}
			if (Static305.anInt5429 > local69) {
				local69 = Static305.anInt5429;
				local71 = (Static305.anInt5429 - local57 << 12) / local48;
			} else if (Static212.anInt452 < local69) {
				local71 = (Static212.anInt452 - local57 << 12) / local48;
				local69 = Static212.anInt452;
			}
			Static198.method3010(local112, local69, arg4, local71, local114);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method4934(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static55.method989(Static56.aClass131_180);
		Static232.aClass1_Sub1_Sub1_2.method4115(Static43.method4229(arg0) + 1);
		Static232.aClass1_Sub1_Sub1_2.method4098(arg1);
		Static232.aClass1_Sub1_Sub1_2.method4104(arg0);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(BI)V")
	public static void method4935(@OriginalArg(1) int arg0) {
		Static234.method3460();
		@Pc(11) int local11 = Static80.aClass258_1.method5794(arg0).anInt2361;
		if (local11 == 0) {
			return;
		}
		@Pc(26) int local26 = Static51.aClass79_1.anIntArray161[arg0];
		if (local11 == 5) {
			Static42.anInt758 = local26;
		}
		if (local11 == 6) {
			Static281.anInt4961 = local26;
		}
	}
}
