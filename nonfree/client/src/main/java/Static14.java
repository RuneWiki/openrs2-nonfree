import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "p", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array2;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "[I")
	public static final int[] anIntArray35 = new int[5];

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	public static void method201() {
		if (Static268.anIntArray680 != null && Static279.anIntArray848 != null) {
			return;
		}
		Static279.anIntArray848 = new int[256];
		Static268.anIntArray680 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(27) double local27 = (double) local18 / 255.0D * 6.283185307179586D;
			Static268.anIntArray680[local18] = (int) (Math.sin(local27) * 4096.0D);
			Static279.anIntArray848[local18] = (int) (Math.cos(local27) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
	public static void method202() {
		if (!Static258.method4342()) {
			return;
		}
		if (Static353.aStringArray27 == null) {
			Static302.method5504();
		}
		Static276.anInt5461 = 0;
		Static107.anIntArray224 = new int[100];
		Static338.anIntArray816 = new int[100];
		Static96.aBoolean162 = true;
		Static122.anIntArray367 = new int[100];
		Static5.aBooleanArray1 = new boolean[100];
		for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
			Static338.anIntArray816[local26] = (int) ((double) Static128.anInt2823 * Math.random());
			Static107.anIntArray224[local26] = (int) (Math.random() * 350.0D);
			Static122.anIntArray367[local26] = (int) (Math.random() * 102.0D);
			Static5.aBooleanArray1[local26] = Math.random() < 0.5D;
		}
		try {
			Static152.aClipboard1 = Static251.aClient4.getToolkit().getSystemClipboard();
		} catch (@Pc(69) Exception local69) {
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B[B)[B")
	public static byte[] method203(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class7_Sub3 local8 = new Class7_Sub3(arg0);
		@Pc(19) int local19 = local8.method2772();
		@Pc(23) int local23 = local8.method2767();
		if (local23 < 0 || Static160.anInt3336 != 0 && Static160.anInt3336 < local23) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(42) byte[] local42 = new byte[local23];
			local8.method2793(local23, local42);
			return local42;
		} else {
			@Pc(54) int local54 = local8.method2767();
			if (local54 < 0 || Static160.anInt3336 != 0 && Static160.anInt3336 < local54) {
				throw new RuntimeException();
			}
			@Pc(75) byte[] local75 = new byte[local54];
			if (local19 == 1) {
				Static1.method5(local75, local54, arg0, local23);
			} else {
				Static163.aClass44_1.method1100(local8, local75);
			}
			return local75;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIII)I")
	public static int method204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg1;
		}
		@Pc(18) int local18 = 128 - arg0;
		@Pc(32) int local32 = (arg1 & 0x7F) * local18 + (arg2 & 0x7F) * arg0 >> 7;
		@Pc(46) int local46 = (arg1 & 0x380) * local18 + (arg2 & 0x380) * arg0 >> 7;
		@Pc(60) int local60 = (arg1 & 0xFC00) * local18 + (arg2 & 0xFC00) * arg0 >> 7;
		return local46 & 0x380 | local60 & 0xFC00 | local32 & 0x7F;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V")
	public static void method205() {
		if (Static119.aClass99_4 == null) {
			return;
		}
		if (Static119.aClass99_4.anInt2836 == 1) {
			Static119.aClass99_4 = null;
			return;
		}
		if (Static119.aClass99_4.anInt2836 == 2) {
			Static50.method1090(2, Static250.aString308, Static58.aClass21_2);
			Static119.aClass99_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)Lclient!is;")
	public static Class7_Sub1_Sub12 method206(@OriginalArg(1) int arg0) {
		@Pc(10) Class7_Sub1_Sub12 local10 = (Class7_Sub1_Sub12) Static156.aClass154_3.method4079((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29;
		if (arg0 < 32768) {
			local29 = Static69.aClass180_19.method4560(arg0, 0);
		} else {
			local29 = Static179.aClass180_48.method4560(arg0 & 0x7FFF, 0);
		}
		local10 = new Class7_Sub1_Sub12();
		if (local29 != null) {
			local10.method2870(new Class7_Sub3(local29));
		}
		if (arg0 >= 32768) {
			local10.method2868();
		}
		Static156.aClass154_3.method4078(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IZIB)I")
	public static int method208(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class7_Sub9 local10 = (Class7_Sub9) Static175.aClass10_32.method163((long) arg2);
		if (local10 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray262.length; local23++) {
			if (local10.anIntArray262[local23] >= 0 && Static233.anInt4645 > local10.anIntArray262[local23]) {
				@Pc(42) Class138 local42 = Static17.method4472(local10.anIntArray262[local23]);
				@Pc(51) int local51 = local42.method3591(arg0, Static113.method2182(arg0).anInt267);
				if (arg1) {
					local21 += local51 * local10.anIntArray263[local23];
				} else {
					local21 += local51;
				}
			}
		}
		return local21;
	}
}
