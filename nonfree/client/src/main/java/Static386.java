import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "Lclient!tt;")
	public static Class224 aClass224_1;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
	public static int anInt6855;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_128 = new Class254(71, -1);

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "[I")
	public static final int[] anIntArray505 = new int[16];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIII)V")
	public static void method5371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static327.aClass230_Sub1_1.anInt7298 != 0 && arg4 != 0 && Static381.anInt436 < 50 && arg1 != -1) {
			Static426.aClass239Array1[Static381.anInt436++] = new Class239((byte) 1, arg1, arg4, arg2, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIILclient!qa;III)V")
	public static void method5372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class121 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface11 local11 = (Interface11) Static208.method3165(arg6, arg1, arg5);
		@Pc(20) Class29 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(37) int local37;
		if (local11 != null) {
			local20 = Static251.aClass207_2.method4977(local11.method5744());
			local26 = local11.method5742() & 0x3;
			local30 = local11.method5747();
			if (local20.anInt536 == -1) {
				local37 = arg0;
				if (local20.anInt550 > 0) {
					local37 = arg7;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg4.method4583(local37, 4, arg2, arg3);
					} else if (local26 == 1) {
						arg4.method4594(arg2, local37, 4, arg3);
					} else if (local26 == 2) {
						arg4.method4583(local37, 4, arg2 + 3, arg3);
					} else if (local26 == 3) {
						arg4.method4594(arg2, local37, 4, arg3 + 3);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg4.method4600(1, arg2, local37, 1, arg3);
					} else if (local26 == 1) {
						arg4.method4600(1, arg2 + 3, local37, 1, arg3);
					} else if (local26 == 2) {
						arg4.method4600(1, arg2 + 3, local37, 1, arg3 + 3);
					} else if (local26 == 3) {
						arg4.method4600(1, arg2, local37, 1, arg3 + 3);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg4.method4594(arg2, local37, 4, arg3);
					} else if (local26 == 1) {
						arg4.method4583(local37, 4, arg2 + 3, arg3);
					} else if (local26 == 2) {
						arg4.method4594(arg2, local37, 4, arg3 + 3);
					} else if (local26 == 3) {
						arg4.method4583(local37, 4, arg2, arg3);
					}
				}
			} else {
				Static332.method4784(local26, local20, arg3, arg2, arg4);
			}
		}
		local11 = (Interface11) Static286.method3918(arg6, arg1, arg5, rq.class);
		if (local11 != null) {
			local20 = Static251.aClass207_2.method4977(local11.method5744());
			local26 = local11.method5742() & 0x3;
			local30 = local11.method5747();
			if (local20.anInt536 != -1) {
				Static332.method4784(local26, local20, arg3, arg2, arg4);
			} else if (local30 == 9) {
				local37 = -1118482;
				if (local20.anInt550 > 0) {
					local37 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg4.method4636(arg2, arg3 + 3, arg2 + 3, arg3, local37);
				} else {
					arg4.method4636(arg2, arg3, arg2 + 3, arg3 + 3, local37);
				}
			}
		}
		local11 = (Interface11) Static112.method1764(arg6, arg1, arg5);
		if (local11 == null) {
			return;
		}
		local20 = Static251.aClass207_2.method4977(local11.method5744());
		local26 = local11.method5742() & 0x3;
		if (local20.anInt536 != -1) {
			Static332.method4784(local26, local20, arg3, arg2, arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BII)V")
	public static void method5373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(arg1, 16);
		local8.method32();
		local8.anInt35 = arg0;
	}
}
