import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!qg", name = "fb", descriptor = "I")
	public static int anInt5581;

	@OriginalMember(owner = "client!qg", name = "W", descriptor = "Lclient!ls;")
	public static Class153 aClass153_1 = new Class153();

	@OriginalMember(owner = "client!qg", name = "X", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_73 = new Class44(70, 8);

	@OriginalMember(owner = "client!qg", name = "gb", descriptor = "Lclient!os;")
	public static final Class184 aClass184_4 = new Class184();

	@OriginalMember(owner = "client!qg", name = "jb", descriptor = "[Lclient!dc;")
	public static final Class46[] aClass46Array1 = new Class46[14];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
	public static void method4520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static175.anInt3399 < arg0 || arg1 < Static75.anInt1858) {
			return;
		}
		@Pc(25) boolean local25;
		if (Static331.anInt5894 > arg4) {
			local25 = false;
			arg4 = Static331.anInt5894;
		} else if (Static351.anInt6176 >= arg4) {
			local25 = true;
		} else {
			local25 = false;
			arg4 = Static351.anInt6176;
		}
		@Pc(45) boolean local45;
		if (arg2 < Static331.anInt5894) {
			local45 = false;
			arg2 = Static331.anInt5894;
		} else if (arg2 <= Static351.anInt6176) {
			local45 = true;
		} else {
			local45 = false;
			arg2 = Static351.anInt6176;
		}
		if (Static75.anInt1858 <= arg0) {
			Static49.method990(Static277.anIntArrayArray40[arg0++], arg2, arg4, arg3);
		} else {
			arg0 = Static75.anInt1858;
		}
		if (arg1 > Static175.anInt3399) {
			arg1 = Static175.anInt3399;
		} else {
			Static49.method990(Static277.anIntArrayArray40[arg1--], arg2, arg4, arg3);
		}
		@Pc(106) int local106;
		if (local25 && local45) {
			for (local106 = arg0; local106 <= arg1; local106++) {
				@Pc(146) int[] local146 = Static277.anIntArrayArray40[local106];
				local146[arg4] = local146[arg2] = arg3;
			}
		} else if (local25) {
			for (local106 = arg0; local106 <= arg1; local106++) {
				Static277.anIntArrayArray40[local106][arg4] = arg3;
			}
		} else if (local45) {
			for (local106 = arg0; local106 <= arg1; local106++) {
				Static277.anIntArrayArray40[local106][arg2] = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBLclient!pc;I)Lclient!re;")
	public static Class210 method4524(@OriginalArg(0) int arg0, @OriginalArg(2) Class188 arg1) {
		@Pc(16) byte[] local16 = arg1.method4283(arg0, 0);
		return local16 == null ? null : new Class210(local16);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(CB)Z")
	public static boolean method4527(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(BI)I")
	public static int method4530(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(21) int local21 = local10 | local10 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
