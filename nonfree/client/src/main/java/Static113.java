import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!eq", name = "qb", descriptor = "I")
	public static int anInt2306;

	@OriginalMember(owner = "client!eq", name = "rb", descriptor = "I")
	public static int anInt2307;

	@OriginalMember(owner = "client!eq", name = "vb", descriptor = "Lclient!uw;")
	public static final Class291 aClass291_1 = new Class291();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lclient!fea;")
	public static Class2_Sub21 method2225(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class2_Sub21_Sub2");
			@Pc(15) Class2_Sub21 local15 = (Class2_Sub21) local11.getDeclaredConstructor().newInstance();
			local15.method7764(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class2_Sub21_Sub1 local26 = new Class2_Sub21_Sub1();
			local26.method7764(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BII)Z")
	public static boolean method2226(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static114.method2233(arg0, arg1) || Static105.method1941(arg1, arg0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!wca;Z)V")
	public static void method2228(@OriginalArg(1) Class310 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt9191 == 0 ? arg0.anInt9163 : arg0.anInt9191;
		@Pc(27) int local27 = arg0.anInt9178 == 0 ? arg0.anInt9198 : arg0.anInt9178;
		Static20.method548(local15, arg1, Static235.aClass310ArrayArray2[arg0.anInt9226 >> 16], local27, arg0.anInt9226);
		if (arg0.aClass310Array2 != null) {
			Static20.method548(local15, arg1, arg0.aClass310Array2, local27, arg0.anInt9226);
		}
		@Pc(60) Class2_Sub9 local60 = (Class2_Sub9) Static110.aClass127_21.method3205((long) arg0.anInt9226);
		if (local60 != null) {
			Static257.method4030(arg1, local15, local27, local60.anInt833);
		}
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V")
	public static void method2229() {
		for (@Pc(6) Class2_Sub44 local6 = (Class2_Sub44) Static448.aClass249_63.method6527(); local6 != null; local6 = (Class2_Sub44) Static448.aClass249_63.method6525()) {
			if (Static472.method6914(local6.anInt8460)) {
				Static324.method5150(local6);
			}
		}
		if (Static323.anInt6016 == 1) {
			Static340.method5355();
			return;
		}
		Static330.method3994(Static193.anInt3519, Static536.anInt9313, Static529.anInt9144, Static178.anInt3307);
		@Pc(51) int local51 = Static188.aClass52_2.method1582(Static239.aClass202_253.method5139(Static172.anInt6352));
		for (@Pc(56) Class2_Sub44 local56 = (Class2_Sub44) Static448.aClass249_63.method6527(); local56 != null; local56 = (Class2_Sub44) Static448.aClass249_63.method6525()) {
			@Pc(62) int local62 = Static329.method3403(local56);
			if (local62 > local51) {
				local51 = local62;
			}
		}
		Static529.anInt9144 = local51 + 8;
		Static193.anInt3519 = (Static254.aBoolean340 ? 26 : 22) + Static323.anInt6016 * 16;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([JZII[I)V")
	public static void method2230(@OriginalArg(0) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(11) int local11 = (arg1 + arg2) / 2;
		@Pc(13) int local13 = arg1;
		@Pc(17) long local17 = arg0[local11];
		arg0[local11] = arg0[arg2];
		arg0[arg2] = local17;
		@Pc(31) int local31 = arg3[local11];
		arg3[local11] = arg3[arg2];
		arg3[arg2] = local31;
		@Pc(49) int local49 = local17 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(51) int local51 = arg1; local51 < arg2; local51++) {
			if ((long) (local49 & local51) + local17 > arg0[local51]) {
				@Pc(72) long local72 = arg0[local51];
				arg0[local51] = arg0[local13];
				arg0[local13] = local72;
				@Pc(86) int local86 = arg3[local51];
				arg3[local51] = arg3[local13];
				arg3[local13++] = local86;
			}
		}
		arg0[arg2] = arg0[local13];
		arg0[local13] = local17;
		arg3[arg2] = arg3[local13];
		arg3[local13] = local31;
		method2230(arg0, arg1, local13 - 1, arg3);
		method2230(arg0, local13 + 1, arg2, arg3);
	}
}
