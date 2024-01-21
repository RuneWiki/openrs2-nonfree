import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
	public static int anInt1964 = 0;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
	public static int anInt1973 = 0;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "[Lclient!ea;")
	public static Class18[] aClass18Array10 = new Class18[100];

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "[I")
	public static int[] anIntArray167 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ib", name = "S", descriptor = "[I")
	public static int[] anIntArray168 = new int[25];

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public static void method1296() {
		@Pc(10) int local10 = Static167.aClass1_Sub6_Sub1_3.method562(8);
		@Pc(19) int local19;
		if (Static45.anInt1553 > local10) {
			for (local19 = local10; local19 < Static45.anInt1553; local19++) {
				Static35.anIntArray48[Static118.anInt3362++] = Static58.anIntArray140[local19];
			}
		}
		if (Static45.anInt1553 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static45.anInt1553 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(61) int local61 = Static58.anIntArray140[local19];
			@Pc(65) Class1_Sub1_Sub5_Sub1_Sub2 local65 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local61];
			@Pc(70) int local70 = Static167.aClass1_Sub6_Sub1_3.method562(1);
			if (local70 == 0) {
				Static58.anIntArray140[Static45.anInt1553++] = local61;
				local65.anInt3557 = Static41.anInt1322;
			} else {
				@Pc(93) int local93 = Static167.aClass1_Sub6_Sub1_3.method562(2);
				if (local93 == 0) {
					Static58.anIntArray140[Static45.anInt1553++] = local61;
					local65.anInt3557 = Static41.anInt1322;
					Static82.anIntArray220[Static76.anInt2355++] = local61;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local93 == 1) {
						Static58.anIntArray140[Static45.anInt1553++] = local61;
						local65.anInt3557 = Static41.anInt1322;
						local135 = Static167.aClass1_Sub6_Sub1_3.method562(3);
						local65.method2477(false, local135);
						local145 = Static167.aClass1_Sub6_Sub1_3.method562(1);
						if (local145 == 1) {
							Static82.anIntArray220[Static76.anInt2355++] = local61;
						}
					} else if (local93 == 2) {
						Static58.anIntArray140[Static45.anInt1553++] = local61;
						local65.anInt3557 = Static41.anInt1322;
						local135 = Static167.aClass1_Sub6_Sub1_3.method562(3);
						local65.method2477(true, local135);
						local145 = Static167.aClass1_Sub6_Sub1_3.method562(3);
						local65.method2477(true, local145);
						@Pc(201) int local201 = Static167.aClass1_Sub6_Sub1_3.method562(1);
						if (local201 == 1) {
							Static82.anIntArray220[Static76.anInt2355++] = local61;
						}
					} else if (local93 == 3) {
						Static35.anIntArray48[Static118.anInt3362++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI[BI)Lclient!ea;")
	public static Class18 method1297(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class18 local9 = new Class18();
		local9.anInt1129 = 0;
		local9.aByteArray6 = new byte[arg0];
		for (@Pc(23) int local23 = arg2; local23 < arg0 + arg2; local23++) {
			if (arg1[local23] != 0) {
				local9.aByteArray6[local9.anInt1129++] = arg1[local23];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	public static void method1298() {
		aClass18Array10 = null;
		anIntArray168 = null;
		anIntArray167 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!dd;BI)Z")
	public static boolean method1300(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte[] local10 = arg1.method2254(arg0, arg2);
		if (local10 == null) {
			return false;
		} else {
			Static109.method2228(local10);
			return true;
		}
	}
}
