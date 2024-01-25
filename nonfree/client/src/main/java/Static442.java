import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
	public static int anInt7524;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_21 = new Class87(8, 14);

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
	public static int anInt7517 = 0;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_246 = new Class175("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
	public static int[] anIntArray572 = new int[1];

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "[Lclient!hi;")
	public static final Class96[] aClass96Array2 = new Class96[14];

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "[S")
	public static short[] aShortArray116 = new short[256];

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "Z")
	public static boolean aBoolean518 = false;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(JLclient!eo;IIIILclient!ea;II)V")
	public static void method5898(@OriginalArg(0) long arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class32 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(19) int local19 = arg2 * arg2 + arg3 * arg3;
		if ((long) local19 > arg0) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg1.anInt2178 / 2, arg1.lb / 2);
		if (local35 * local35 >= local19) {
			Static263.method3974(arg4, arg5, arg2, arg3, arg1, arg7, Static402.aClass22Array23[arg6]);
			return;
		}
		local35 -= 10;
		@Pc(49) int local49;
		if (Static107.anInt2382 == 4) {
			local49 = (int) Static235.aFloat60 & 0x3FFF;
		} else {
			local49 = Static397.anInt6876 + (int) Static235.aFloat60 & 0x3FFF;
		}
		@Pc(62) int local62 = Applet_Sub1.anIntArray85[local49];
		@Pc(66) int local66 = Applet_Sub1.anIntArray87[local49];
		if (Static107.anInt2382 != 4) {
			local62 = local62 * 256 / (Static317.anInt5759 + 256);
			local66 = local66 * 256 / (Static317.anInt5759 + 256);
		}
		@Pc(95) int local95 = local66 * arg3 + local62 * arg2 >> 15;
		@Pc(106) int local106 = arg2 * local66 - arg3 * local62 >> 15;
		@Pc(112) double local112 = Math.atan2((double) local95, (double) local106);
		@Pc(119) int local119 = (int) (Math.sin(local112) * (double) local35);
		@Pc(126) int local126 = (int) ((double) local35 * Math.cos(local112));
		Static426.aClass22Array25[arg6].method6069((float) arg1.anInt2178 / 2.0F + (float) arg4 + (float) local119, (float) arg1.lb / 2.0F + (float) arg7 - (float) local126, 4096, (int) (-local112 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!eo;)V")
	public static void method5899(@OriginalArg(1) Class68 arg0) {
		if (Static183.anInt4104 == arg0.anInt2215) {
			Static308.aBooleanArray18[arg0.anInt2218] = true;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5901(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)Lclient!cc;")
	public static Class3_Sub8 method5902() {
		if (Static210.aClass229_48 == null || Static158.aClass162_1 == null) {
			return null;
		}
		Static158.aClass162_1.method3882(Static210.aClass229_48);
		@Pc(18) Class3_Sub8 local18 = (Class3_Sub8) Static158.aClass162_1.method3884();
		if (local18 == null) {
			return null;
		} else {
			@Pc(28) Class223 local28 = Static210.aClass61_4.method1426(local18.anInt1157);
			return local28 != null && local28.aBoolean471 && local28.method5283(Static210.anInterface8_2) ? local18 : Static370.method5162();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!pb;I)Lclient!pl;")
	public static Class3_Sub3_Sub17 method5903(@OriginalArg(0) int arg0, @OriginalArg(2) Class180 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = arg1.anInt5498 | arg2 << 8;
		@Pc(27) Class3_Sub3_Sub17 local27 = (Class3_Sub3_Sub17) Static291.aClass173_3.method4163((long) local18 << 16);
		if (local27 != null) {
			return local27;
		}
		@Pc(39) byte[] local39 = Static331.aClass56_71.method1391(Static331.aClass56_71.method1366(local18));
		if (local39 == null) {
			local18 = arg1.anInt5498 | arg0 + 65536 << 8;
			local27 = (Class3_Sub3_Sub17) Static291.aClass173_3.method4163((long) local18 << 16);
			if (local27 != null) {
				return local27;
			}
			local39 = Static331.aClass56_71.method1391(Static331.aClass56_71.method1366(local18));
			if (local39 == null) {
				local18 = arg1.anInt5498 | 0xFFFF00;
				local27 = (Class3_Sub3_Sub17) Static291.aClass173_3.method4163((long) local18 << 16);
				if (local27 != null) {
					return local27;
				}
				local39 = Static331.aClass56_71.method1391(Static331.aClass56_71.method1366(local18));
				if (local39 == null) {
					return null;
				} else if (local39.length <= 1) {
					return null;
				} else {
					local27 = Static123.method2194(local39);
					local27.aClass180_6 = arg1;
					Static291.aClass173_3.method4159(local27, (long) local18 << 16);
					return local27;
				}
			} else if (local39.length <= 1) {
				return null;
			} else {
				local27 = Static123.method2194(local39);
				local27.aClass180_6 = arg1;
				Static291.aClass173_3.method4159(local27, (long) local18 << 16);
				return local27;
			}
		} else if (local39.length <= 1) {
			return null;
		} else {
			local27 = Static123.method2194(local39);
			local27.aClass180_6 = arg1;
			Static291.aClass173_3.method4159(local27, (long) local18 << 16);
			return local27;
		}
	}
}
