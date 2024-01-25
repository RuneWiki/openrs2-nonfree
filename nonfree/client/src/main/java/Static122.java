import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!hf", name = "L", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_88 = new Class221(68, 7);

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
	public static int anInt2591 = -1;

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "Lclient!sf;")
	public static Class180 aClass180_17 = new Class180();

	@OriginalMember(owner = "client!hf", name = "X", descriptor = "Z")
	public static boolean aBoolean255 = false;

	@OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
	public static int anInt2596 = 0;

	@OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
	public static int anInt2597 = 0;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)V")
	public static void method2380() {
		if (!Static189.method3533()) {
			return;
		}
		if (Static81.aStringArray8 == null) {
			Static183.method3477();
		}
		Static81.anIntArray127 = new int[100];
		Static351.aBooleanArray30 = new boolean[100];
		Static123.anInt2610 = 0;
		Static220.anIntArray355 = new int[100];
		Static63.anIntArray102 = new int[100];
		Static66.aBoolean117 = true;
		for (@Pc(34) int local34 = 0; local34 < 100; local34++) {
			Static220.anIntArray355[local34] = (int) ((double) Static335.anInt6496 * Math.random());
			Static81.anIntArray127[local34] = (int) (Math.random() * 350.0D);
			Static63.anIntArray102[local34] = (int) (Math.random() * 102.0D);
			Static351.aBooleanArray30[local34] = Math.random() < 0.5D;
		}
		try {
			Static346.aClipboard2 = Static2.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(80) Exception local80) {
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(III)I")
	public static int method2381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static299.anIntArray459[arg1 & 0x3] : Static341.anIntArray58[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(ZI)V")
	public static void method2384(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub9_Sub4 local13 = Static98.method1971(2, arg0);
		local13.method1799();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!fq;Lclient!dr;IIII)V")
	public static void method2385(@OriginalArg(0) Class74 arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class150 local8 = Static12.method176(arg0.anInt2070);
		if (local8.anInt5043 == -1) {
			return;
		}
		if (arg0.aBoolean202) {
			@Pc(22) int local22 = arg2 + arg0.anInt2047;
			arg2 = local22 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(38) Class46 local38 = local8.method4293(arg2, arg1, arg0.aBoolean198);
		if (local38 == null) {
			return;
		}
		@Pc(44) int local44 = arg0.anInt2094;
		@Pc(47) int local47 = arg0.anInt2048;
		if ((arg2 & 0x1) == 1) {
			local44 = arg0.anInt2048;
			local47 = arg0.anInt2094;
		}
		@Pc(63) int local63 = local38.method5031();
		@Pc(66) int local66 = local38.method5022();
		if (local8.aBoolean439) {
			local63 = local44 * 4;
			local66 = local47 * 4;
		}
		if (local8.anInt5036 == 0) {
			local38.method5021(arg4, arg3 - (local47 - 1) * 4, local63, local66);
		} else {
			local38.method5026(arg4, arg3 - (local47 - 1) * 4, local63, local66, 1, local8.anInt5036 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)I")
	public static int method2386(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
