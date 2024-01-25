import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
	public static int anInt4261;

	@OriginalMember(owner = "client!ss", name = "E", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_85 = new Class92(52, 0);

	@OriginalMember(owner = "client!ss", name = "G", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_227 = new Class123(39, -2);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[S)[S")
	public static short[] method3608(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static459.method6339(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(III)V")
	public static void method3609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (arg0 != Static240.anInt4386) {
			Static80.anIntArray117 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static80.anIntArray117[local17] = (local17 << 12) / arg0;
			}
			Static408.anInt7338 = arg0 - 1;
			Static240.anInt4386 = arg0;
			Static300.anInt5298 = arg0 * 32;
		}
		if (Static235.anInt4304 == arg1) {
			return;
		}
		if (Static240.anInt4386 == arg1) {
			Static247.anIntArray318 = Static80.anIntArray117;
		} else {
			Static247.anIntArray318 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static247.anIntArray318[local17] = (local17 << 12) / arg1;
			}
		}
		Static52.anInt1464 = arg1 - 1;
		Static235.anInt4304 = arg1;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object method3610(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static179.aBoolean230) {
			try {
				@Pc(20) Class75 local20 = (Class75) Class.forName("Class75_Sub1").getDeclaredConstructor().newInstance();
				local20.method5748(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static179.aBoolean230 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!rl;I)V")
	public static void method3612(@OriginalArg(0) Class66_Sub2 arg0) {
		@Pc(23) byte[] local23;
		if (Static283.anObject12 == null) {
			@Pc(16) Class60_Sub1_Sub1 local16 = new Class60_Sub1_Sub1();
			local23 = local16.method4167();
			Static283.anObject12 = method3610(local23);
		}
		if (Static219.anObject8 == null) {
			@Pc(34) Class60_Sub2_Sub1 local34 = new Class60_Sub2_Sub1();
			local23 = local34.method4046();
			Static219.anObject8 = method3610(local23);
		}
		@Pc(49) Class258 local49 = arg0.aClass258_1;
		if (local49.method6303() && Static121.anObject2 == null) {
			local23 = Static395.method5855(new Class45_Sub1(419684), 16.0F, 0.5F, 4.0F, 4.0F, 0.6F);
			Static121.anObject2 = method3610(local23);
		}
	}
}
