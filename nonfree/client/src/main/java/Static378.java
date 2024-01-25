import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Lclient!in;")
	public static Class157 aClass157_70;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_18 = new Class169(5);

	@OriginalMember(owner = "client!np", name = "b", descriptor = "Lclient!eq;")
	public static final Class99 aClass99_26 = new Class99(64);

	@OriginalMember(owner = "client!np", name = "f", descriptor = "Z")
	public static boolean aBoolean237 = false;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "Z")
	public static boolean aBoolean238 = false;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!baa;)I")
	public static int method2837(@OriginalArg(1) Class26 arg0) {
		if (Static29.aClass26_1 == arg0) {
			return 5120;
		} else if (arg0 == Static29.aClass26_2) {
			return 5122;
		} else if (arg0 == Static29.aClass26_3) {
			return 5124;
		} else if (Static29.aClass26_4 == arg0) {
			return 5121;
		} else if (arg0 == Static29.aClass26_5) {
			return 5123;
		} else if (arg0 == Static29.aClass26_6) {
			return 5125;
		} else if (Static29.aClass26_7 == arg0) {
			return 5131;
		} else if (Static29.aClass26_8 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
	public static void method2838(@OriginalArg(0) int arg0) {
		Static302.anInt6299 = 3;
		Static422.anInt7962 = 100;
		Static232.anInt5106 = -1;
		Static604.anInt10636 = arg0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method2839(@OriginalArg(0) Class2_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static9.aClass65Array1 != Static103.aClass65Array3) {
			@Pc(12) int local12 = Static40.aClass65Array2[arg1].method7999(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class65 local19 = Static40.aClass65Array2[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7999(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method8002(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
