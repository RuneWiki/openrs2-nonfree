import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "[I")
	public static int[] anIntArray329;

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "[I")
	public static int[] anIntArray327 = new int[2];

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "[I")
	public static final int[] anIntArray328 = new int[5];

	@OriginalMember(owner = "client!ir", name = "C", descriptor = "Lclient!ot;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILjava/awt/Component;ILclient!lp;)Lclient!gaa;")
	public static Class39 method3840(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class182 arg3) {
		if (Static77.anInt2079 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class39 local36 = (Class39) Class.forName("Class39_Sub1").getDeclaredConstructor().newInstance();
			local36.anInt5867 = arg2;
			local36.anIntArray415 = new int[(Static267.aBoolean348 ? 2 : 1) * 256];
			local36.method5064(arg1);
			local36.anInt5862 = (arg2 & 0xFFFFFC00) + 1024;
			if (local36.anInt5862 > 16384) {
				local36.anInt5862 = 16384;
			}
			local36.method5065(local36.anInt5862);
			if (Static176.anInt3761 > 0 && Static229.aClass261_1 == null) {
				Static229.aClass261_1 = new Class261();
				Static229.aClass261_1.aClass182_7 = arg3;
				arg3.method4799(Static176.anInt3761, Static229.aClass261_1);
			}
			if (Static229.aClass261_1 != null) {
				if (Static229.aClass261_1.aClass39Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static229.aClass261_1.aClass39Array1[arg0] = local36;
			}
			return local36;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class39_Sub2 local114 = new Class39_Sub2(arg3, arg0);
				local114.anInt5867 = arg2;
				local114.anIntArray415 = new int[(Static267.aBoolean348 ? 2 : 1) * 256];
				local114.method5064(arg1);
				local114.anInt5862 = 16384;
				local114.method5065(local114.anInt5862);
				if (Static176.anInt3761 > 0 && Static229.aClass261_1 == null) {
					Static229.aClass261_1 = new Class261();
					Static229.aClass261_1.aClass182_7 = arg3;
					arg3.method4799(Static176.anInt3761, Static229.aClass261_1);
				}
				if (Static229.aClass261_1 != null) {
					if (Static229.aClass261_1.aClass39Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static229.aClass261_1.aClass39Array1[arg0] = local114;
				}
				return local114;
			} catch (@Pc(173) Throwable local173) {
				return new Class39();
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!faa;)V")
	public static void method3844(@OriginalArg(1) Class47_Sub2_Sub3 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static416.anInt7252 == arg0.anInt5006 || arg0.anInt5018 == -1 || arg0.anInt5026 != 0) {
			local5 = true;
		} else {
			@Pc(30) Class280 local30 = Static6.aClass126_1.method3574(arg0.anInt5018);
			if (local30.aBoolean547 || arg0.anInt5063 + 1 > local30.anIntArray630[arg0.anInt5007]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt5006 - arg0.anInt5020;
			@Pc(63) int local63 = Static416.anInt7252 - arg0.anInt5020;
			@Pc(76) int local76 = arg0.anInt5031 * 128 + arg0.method4350() * 64;
			@Pc(88) int local88 = arg0.anInt5055 * 128 + arg0.method4350() * 64;
			@Pc(99) int local99 = arg0.anInt5064 * 128 + arg0.method4350() * 64;
			@Pc(110) int local110 = arg0.anInt5003 * 128 + arg0.method4350() * 64;
			arg0.anInt8191 = (local110 * local63 + (local57 - local63) * local88) / local57;
			arg0.anInt8189 = (local76 * (local57 - local63) + local99 * local63) / local57;
		}
		arg0.anInt5081 = 0;
		if (arg0.anInt5067 == 0) {
			arg0.method4351(false, 8192);
		}
		if (arg0.anInt5067 == 1) {
			arg0.method4351(false, 12288);
		}
		if (arg0.anInt5067 == 2) {
			arg0.method4351(false, 0);
		}
		if (arg0.anInt5067 == 3) {
			arg0.method4351(false, 4096);
		}
	}

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "(I)V")
	public static void method3845() {
		if (Static424.aClass9_9 != null) {
			Static424.aClass9_9.method7585();
			Static424.aClass9_9 = null;
			Static351.aClass27_5 = null;
		}
	}
}
