import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!jj", name = "D", descriptor = "[Lclient!ae;")
	public static Class4[] aClass4Array19;

	@OriginalMember(owner = "client!jj", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!jj", name = "K", descriptor = "Lclient!kg;")
	public static Class112 aClass112_18 = null;

	@OriginalMember(owner = "client!jj", name = "L", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!qh;III[Z)Z")
	public static boolean method4953(@OriginalArg(0) Class1_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static258.aClass36Array2 != Static200.aClass36Array4) {
			@Pc(11) int local11 = Static50.aClass36Array3[arg1].method4433(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class36 local18 = Static50.aClass36Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method4433(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4445(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method4444(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(BI)V")
	public static void method4954() {
		@Pc(9) Class21 local9 = Static163.aClass21_93;
		synchronized (Static163.aClass21_93) {
			Static163.aClass21_93.method844(5);
		}
		local9 = Static93.aClass21_135;
		synchronized (Static93.aClass21_135) {
			Static93.aClass21_135.method844(5);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Lclient!ik;")
	public static Class11_Sub5 method4955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class155 local7 = Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub5_1;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)Z")
	public static boolean method4956() {
		return Static241.anInt4925 == 0 ? Static103.aBoolean159 : true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4958(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < Static195.anInt3948; local21++) {
			if (arg0.equalsIgnoreCase(Static247.aStringArray29[local21])) {
				return local21;
			}
		}
		return -1;
	}
}
