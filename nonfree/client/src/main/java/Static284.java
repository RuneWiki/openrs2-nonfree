import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "Lclient!bf;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "Lclient!ak;")
	public static Class7 aClass7_229;

	@OriginalMember(owner = "client!vj", name = "B", descriptor = "Lclient!og;")
	public static Class127 aClass127_16;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "Lclient!db;")
	public static Class31 aClass31_43 = new Class31(64);

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
	public static int anInt5643 = 100;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
	public static void method4339() {
		Static270.aClass1_Sub18_Sub1_3.method3130(59);
		Static270.aClass1_Sub18_Sub1_3.method3091(0L);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIILclient!ac;II)V")
	public static void method4341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = 0L;
		if (arg1 == 0) {
			local7 = Static291.method4472(arg0, arg5, arg3);
		} else if (arg1 == 1) {
			local7 = Static101.method1647(arg0, arg5, arg3);
		} else if (arg1 == 2) {
			local7 = Static242.method3841(arg0, arg5, arg3);
		} else if (arg1 == 3) {
			local7 = Static287.method4359(arg0, arg5, arg3);
		}
		@Pc(59) int local59 = (int) local7 >> 14 & 0x1F;
		@Pc(68) int local68 = Integer.MAX_VALUE & (int) (local7 >>> 32);
		@Pc(72) Class104 local72 = Static35.method636(local68);
		@Pc(79) int local79 = (int) local7 >> 20 & 0x3;
		if (local72.method2346()) {
			Static158.method2472(local72, arg5, arg3, arg0);
		}
		if (local7 == 0L) {
			return;
		}
		@Pc(98) Class6 local98 = null;
		@Pc(100) Class6 local100 = null;
		if (arg1 == 0) {
			@Pc(219) Class125 local219 = Static185.method2789(arg0, arg5, arg3);
			if (local219 != null) {
				local100 = local219.aClass6_7;
				local98 = local219.aClass6_8;
			}
			if (local72.anInt2810 != 0) {
				arg4.method113(arg3, !local72.aBoolean205, local59, local72.aBoolean202, local79, arg5);
			}
		} else if (arg1 == 1) {
			@Pc(115) Class63 local115 = Static75.method1282(arg0, arg5, arg3);
			if (local115 != null) {
				local98 = local115.aClass6_4;
				local100 = local115.aClass6_5;
			}
		} else if (arg1 == 2) {
			@Pc(132) Class124 local132 = Static295.method4512(arg0, arg5, arg3);
			if (local132 != null) {
				local98 = local132.aClass6_6;
			}
			if (local72.anInt2810 != 0 && local72.anInt2814 + arg5 < 104 && local72.anInt2814 + arg3 < 104 && local72.anInt2817 + arg5 < 104 && local72.anInt2817 + arg3 < 104) {
				arg4.method117(local72.aBoolean202, local72.anInt2814, !local72.aBoolean205, local79, local72.anInt2817, arg5, arg3);
			}
		} else if (arg1 == 3) {
			@Pc(196) Class167 local196 = Static298.method4548(arg0, arg5, arg3);
			if (local196 != null) {
				local98 = local196.aClass6_9;
			}
			if (local72.anInt2810 == 1) {
				arg4.method111(arg3, arg5);
			}
		}
		if (local72.anIntArray350 != null) {
			local72 = local72.method2355();
		}
		if (!Static240.aBoolean369 || local72 == null || !local72.aBoolean207) {
			return;
		}
		if (local59 == 2) {
			if (local98 instanceof Class6_Sub5) {
				((Class6_Sub5) local98).method2824();
			} else {
				Static251.method3952(0, local59, local79 + 4, local72, 0, arg3, arg2, arg5);
			}
			if (local100 instanceof Class6_Sub5) {
				((Class6_Sub5) local100).method2824();
			} else {
				Static251.method3952(0, local59, local79 + 1 & 0x3, local72, 0, arg3, arg2, arg5);
			}
		} else if (local59 == 5) {
			if (local98 instanceof Class6_Sub5) {
				((Class6_Sub5) local98).method2824();
			} else {
				Static251.method3952(Static247.anIntArray591[local79] * 8, 4, local79, local72, Static220.anIntArray521[local79] * 8, arg3, arg2, arg5);
			}
		} else if (local59 == 6) {
			if (local98 instanceof Class6_Sub5) {
				((Class6_Sub5) local98).method2824();
			} else {
				Static251.method3952(Static25.anIntArray356[local79] * 8, 4, local79 + 4, local72, Static190.anIntArray420[local79] * 8, arg3, arg2, arg5);
			}
		} else if (local59 == 7) {
			if (local98 instanceof Class6_Sub5) {
				((Class6_Sub5) local98).method2824();
			} else {
				Static251.method3952(0, 4, (local79 + 2 & 0x3) + 4, local72, 0, arg3, arg2, arg5);
			}
		} else if (local59 == 8) {
			if (local98 instanceof Class6_Sub5) {
				((Class6_Sub5) local98).method2824();
			} else {
				Static251.method3952(Static25.anIntArray356[local79] * 8, 4, local79 + 4, local72, Static190.anIntArray420[local79] * 8, arg3, arg2, arg5);
			}
			if (local100 instanceof Class6_Sub5) {
				((Class6_Sub5) local100).method2824();
			} else {
				Static251.method3952(Static25.anIntArray356[local79] * 8, 4, (local79 + 2 & 0x3) + 4, local72, Static190.anIntArray420[local79] * 8, arg3, arg2, arg5);
			}
		} else if (local59 == 11) {
			if (local98 instanceof Class6_Sub5) {
				((Class6_Sub5) local98).method2824();
			} else {
				Static251.method3952(0, 10, local79 + 4, local72, 0, arg3, arg2, arg5);
			}
		} else if (local98 instanceof Class6_Sub5) {
			((Class6_Sub5) local98).method2824();
		} else {
			Static251.method3952(0, local59, local79, local72, 0, arg3, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "(I)V")
	public static void method4349() {
		Static293.aFontMetrics1 = null;
		Static108.anImage4 = null;
		Static103.aFont1 = null;
	}
}
