import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_63 = new Class15("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "[F")
	public static final float[] aFloatArray11 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!qn;ILclient!qn;)V")
	public static void method3174(@OriginalArg(0) Class211 arg0, @OriginalArg(2) Class211 arg1) {
		Static177.aClass211_49 = arg0;
		Static262.aClass211_70 = arg1;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!mv;Lclient!mv;IZ)I")
	public static int method3177(@OriginalArg(1) Class176_Sub1 arg0, @OriginalArg(2) Class176_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(19) int local19;
		@Pc(22) int local22;
		if (arg2 == 1) {
			local19 = arg1.anInt4256;
			local22 = arg0.anInt4256;
			if (!arg3) {
				if (local19 == -1) {
					local19 = 2001;
				}
				if (local22 == -1) {
					local22 = 2001;
				}
			}
			return local19 - local22;
		} else if (arg2 == 2) {
			return Static350.method4637(Static429.anInt6999, arg1.method3398().aString3, arg0.method3398().aString3);
		} else if (arg2 == 3) {
			if (arg1.aString35.equals("-")) {
				if (arg0.aString35.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString35.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static350.method4637(Static429.anInt6999, arg1.aString35, arg0.aString35);
			}
		} else if (arg2 == 4) {
			if (arg1.method3389()) {
				return arg0.method3389() ? 0 : 1;
			} else if (arg0.method3389()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg1.method3394()) {
				return arg0.method3394() ? 0 : 1;
			} else if (arg0.method3394()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg1.method3390()) {
				return arg0.method3390() ? 0 : 1;
			} else if (arg0.method3390()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg1.method3391()) {
				return arg0.method3391() ? 0 : 1;
			} else if (arg0.method3391()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local19 = arg1.anInt4266;
			local22 = arg0.anInt4266;
			if (arg3) {
				if (local22 == 1000) {
					local22 = -1;
				}
				if (local19 == 1000) {
					local19 = -1;
				}
			} else {
				if (local22 == -1) {
					local22 = 1000;
				}
				if (local19 == -1) {
					local19 = 1000;
				}
			}
			return local19 - local22;
		} else {
			return arg1.anInt4262 - arg0.anInt4262;
		}
	}
}
