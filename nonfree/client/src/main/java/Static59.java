import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dl", name = "Z", descriptor = "Lclient!ko;")
	public static Class118 aClass118_1;

	@OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
	public static int anInt1119 = -1;

	@OriginalMember(owner = "client!dl", name = "O", descriptor = "Lclient!no;")
	public static final Class142 aClass142_5 = new Class142(16);

	@OriginalMember(owner = "client!dl", name = "V", descriptor = "I")
	public static int anInt1129 = 0;

	@OriginalMember(owner = "client!dl", name = "X", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_5 = new Class26(64);

	@OriginalMember(owner = "client!dl", name = "Y", descriptor = "[I")
	public static final int[] anIntArray69 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!dl", name = "ab", descriptor = "I")
	public static int anInt1131 = 0;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!nq;Lclient!nq;IZI)V")
	public static void method891(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) int arg2) {
		Static254.aClass144_87 = arg0;
		Static157.aBoolean194 = true;
		Static5.anInt32 = arg2;
		Static306.aClass144_98 = arg1;
		@Pc(25) int local25 = Static254.aClass144_87.method3893() - 1;
		Static207.anInt4248 = Static254.aClass144_87.method3890(local25) + local25 * 256;
		Static199.aStringArray31 = new String[] { null, null, Static154.aClass117_53.method2684(Static5.anInt32), null, null };
		Static316.aStringArray50 = new String[] { null, null, null, null, Static207.aClass117_74.method2684(Static5.anInt32) };
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)Lclient!cf;")
	public static Class34 method892(@OriginalArg(1) int arg0) {
		@Pc(10) Class34 local10 = (Class34) Static212.aClass26_40.method332((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static202.aClass144_59.method3896(arg0, 4);
		local10 = new Class34();
		if (local20 != null) {
			local10.method549(new Class11_Sub25(local20), arg0);
		}
		local10.method548(arg0);
		Static212.aClass26_40.method330((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V")
	public static void method893() {
		for (@Pc(7) int local7 = -1; local7 < Static331.anInt6366; local7++) {
			@Pc(14) int local14;
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static87.anIntArray104[local7];
			}
			@Pc(24) Class67_Sub3_Sub3_Sub2 local24 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local14];
			if (local24 != null) {
				Static318.method5289(local24.method4368(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!g;)V")
	public static void method894(@OriginalArg(1) Class11_Sub14 arg0) {
		if (!Static38.aBoolean40) {
			arg0.method5701();
			Static13.anInt245--;
		}
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(B)I")
	public static int method895() {
		return Static122.anInt2287;
	}

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "(B)V")
	public static void method897() {
		if (Static245.anInt6561 == 10) {
			Static284.method4731(28);
		}
		if (Static245.anInt6561 == 30) {
			Static284.method4731(25);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZLclient!oo;)I")
	public static int method898(@OriginalArg(1) Class67_Sub3_Sub3 arg0) {
		if (arg0.anInt5055 == 0) {
			return 0;
		}
		@Pc(32) int local32;
		@Pc(39) int local39;
		if (arg0.anInt5023 != -1 && arg0.anInt5023 < 32768) {
			@Pc(24) Class67_Sub3_Sub3_Sub1 local24 = Static356.aClass67_Sub3_Sub3_Sub1Array1[arg0.anInt5023];
			if (local24 != null) {
				local32 = arg0.anInt6308 - local24.anInt6308;
				local39 = arg0.anInt6310 - local24.anInt6310;
				if (local32 != 0 || local39 != 0) {
					arg0.method4370((int) (Math.atan2((double) local32, (double) local39) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(70) int local70;
		if (arg0.anInt5023 >= 32768) {
			local70 = arg0.anInt5023 - 32768;
			if (Static256.anInt5197 == local70) {
				local70 = 2047;
			}
			@Pc(79) Class67_Sub3_Sub3_Sub2 local79 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local70];
			if (local79 != null) {
				local39 = arg0.anInt6308 - local79.anInt6308;
				@Pc(95) int local95 = arg0.anInt6310 - local79.anInt6310;
				if (local39 != 0 || local95 != 0) {
					arg0.method4370((int) (Math.atan2((double) local39, (double) local95) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt5027 != 0 || arg0.anInt5008 != 0) && (arg0.anInt5074 == 0 || arg0.anInt5071 > 0)) {
			local70 = arg0.anInt6308 - (arg0.anInt5027 - Static182.anInt3662 - Static182.anInt3662) * 64;
			local32 = arg0.anInt6310 - (arg0.anInt5008 - Static169.anInt6312 - Static169.anInt6312) * 64;
			if (local70 != 0 || local32 != 0) {
				arg0.method4370((int) (Math.atan2((double) local70, (double) local32) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt5027 = 0;
			arg0.anInt5008 = 0;
		}
		return arg0.method4377();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IJLclient!uo;)V")
	public static void method899(@OriginalArg(1) long arg0, @OriginalArg(2) Class129 arg1) {
		Static61.anInt1143 = 0;
		Static225.anInt4561 = Static46.anInt907;
		Static46.anInt907 = 0;
		@Pc(19) long local19 = Static268.method4627();
		for (@Pc(24) Class10_Sub2 local24 = (Class10_Sub2) Static220.aClass210_11.method5608(); local24 != null; local24 = (Class10_Sub2) Static220.aClass210_11.method5615()) {
			if (local24.method987(arg1, arg0)) {
				Static61.anInt1143++;
			}
		}
		if (Static155.aBoolean193 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static220.aClass210_11.method5607() + ", running: " + Static61.anInt1143 + ". Particles: " + Static46.anInt907 + ". Time taken: " + (Static268.method4627() - local19) + "ms");
		}
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(II)Z")
	public static boolean method900(@OriginalArg(0) int arg0) {
		if (arg0 == 4 || arg0 == 11 || arg0 == 15 || arg0 == 58 || arg0 == 45) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 1010;
		}
	}
}
