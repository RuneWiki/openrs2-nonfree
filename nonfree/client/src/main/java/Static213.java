import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "Lclient!fja;")
	public static Class126 aClass126_73;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	public static int anInt3976 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBII)Z")
	public static boolean method3374(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static44.aBoolean107 || !Static262.aBoolean400) {
			return false;
		} else if (Static594.anInt9366 < 100) {
			return false;
		} else {
			@Pc(27) int local27 = Static662.anIntArrayArrayArray20[arg0][arg1][arg2];
			if (-Static553.anInt8943 == local27) {
				return false;
			} else if (Static553.anInt8943 == local27) {
				return true;
			} else if (Static343.aClass104Array2 == Static605.aClass104Array3) {
				return false;
			} else {
				@Pc(51) int local51 = arg1 << Static436.anInt7634;
				@Pc(55) int local55 = arg2 << Static436.anInt7634;
				if (Static301.method4655(local55 + Static10.anInt118 - 1, local51 - -1, local55 + 1, local55 - -Static10.anInt118 + -1, local51 + 1, Static343.aClass104Array2[arg0].method8279(arg2, arg1), Static343.aClass104Array2[arg0].method8279(arg2 + 1, arg1 + 1), Static343.aClass104Array2[arg0].method8279(arg2 + 1, arg1), Static10.anInt118 + local51 - 1) && Static301.method4655(local55 + Static10.anInt118 - 1, local51 + 1, local55 + 1, local55 + 1, Static10.anInt118 + local51 - 1, Static343.aClass104Array2[arg0].method8279(arg2, arg1), Static343.aClass104Array2[arg0].method8279(arg2, arg1 + 1), Static343.aClass104Array2[arg0].method8279(arg2 + 1, arg1 + 1), local51 + Static10.anInt118 - 1)) {
					Static293.anInt5388++;
					Static662.anIntArrayArrayArray20[arg0][arg1][arg2] = Static553.anInt8943;
					return true;
				} else {
					Static662.anIntArrayArrayArray20[arg0][arg1][arg2] = -Static553.anInt8943;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/Object;IIB)[B")
	public static byte[] method3377(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static471.method8500(local13, arg1);
		} else if (arg0 instanceof Class346) {
			@Pc(25) Class346 local25 = (Class346) arg0;
			return local25.method7936(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)Z")
	public static boolean method3379(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[SZ)[S")
	public static short[] method3380(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(14) short[] local14 = new short[arg0];
		Static689.method8060(arg1, 0, local14, 0, arg0);
		return local14;
	}
}
