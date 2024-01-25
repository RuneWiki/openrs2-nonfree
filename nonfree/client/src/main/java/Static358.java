import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "Lclient!iq;")
	public static Class104 aClass104_192;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "Lclient!ec;")
	public static Interface3 anInterface3_7;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "Lclient!iq;")
	public static Class104 aClass104_193;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_223 = new Class221(2, -2);

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_43 = new Class180();

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[5];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIFZ)[I")
	public static int[] method5715(@OriginalArg(6) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub3_Sub10 local10 = new Class2_Sub3_Sub10();
		local10.aBoolean147 = true;
		local10.anInt1634 = 4;
		local10.anInt1633 = 8;
		local10.anInt1635 = 8;
		local10.anInt1636 = 35;
		local10.anInt1628 = (int) (arg0 * 4096.0F);
		local10.method5708();
		Static336.method5480(1, 2048);
		local10.method1740(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIII)I")
	public static int method5718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static9.aClass105Array1 == null) {
			return 0;
		} else if (arg2 < 3) {
			@Pc(21) int local21 = arg0 >> 7;
			@Pc(25) int local25 = arg3 >> 7;
			if (arg4 < 0 || arg1 < 0 || arg4 > Static66.anInt1177 - 1 || arg1 > Static12.anInt213 - 1) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && Static66.anInt1177 - 1 >= local21 && local25 <= Static12.anInt213 - 1) {
				@Pc(92) boolean local92 = (Static243.aByteArrayArrayArray10[1][arg0 >> 7][arg3 >> 7] & 0x2) != 0;
				@Pc(117) boolean local117;
				@Pc(136) boolean local136;
				if ((arg0 & 0x7F) == 0) {
					local117 = (Static243.aByteArrayArrayArray10[1][local21 - 1][arg3 >> 7] & 0x2) != 0;
					local136 = (Static243.aByteArrayArrayArray10[1][local21][arg3 >> 7] & 0x2) != 0;
					if (local117 != local136) {
						local92 = (Static243.aByteArrayArrayArray10[1][arg4][arg1] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x7F) == 0) {
					local117 = (Static243.aByteArrayArrayArray10[1][arg0 >> 7][local25 - 1] & 0x2) != 0;
					local136 = (Static243.aByteArrayArrayArray10[1][arg0 >> 7][local25] & 0x2) != 0;
					if (local117 != local136) {
						local92 = (Static243.aByteArrayArrayArray10[1][arg4][arg1] & 0x2) != 0;
					}
				}
				if (local92) {
					arg2++;
				}
				return Static9.aClass105Array1[arg2].method4452(arg0, arg3);
			} else {
				return 0;
			}
		} else {
			return Static9.aClass105Array1[arg2].method4452(arg0, arg3);
		}
	}
}
