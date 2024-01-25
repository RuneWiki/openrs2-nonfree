import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!um", name = "f", descriptor = "Lclient!d;")
	public static Interface11 anInterface11_12;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Lclient!ff;")
	public static final Class111 aClass111_7 = new Class111();

	@OriginalMember(owner = "client!um", name = "i", descriptor = "Z")
	public static boolean aBoolean726 = false;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!vo;II)V")
	public static void method8542(@OriginalArg(1) Class381 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static162.aBoolean266) {
			@Pc(20) Class302 local20 = Static417.anInt7211 == -1 ? null : Static521.aClass20_21.method250(Static417.anInt7211);
			if (Static78.method1061(arg0).method5211() && (Static109.anInt2151 & 0x20) != 0 && (local20 == null || arg0.method8755(local20.anInt8386, Static417.anInt7211) != local20.anInt8386)) {
				Static541.method8078(Static607.anInt9573, Static6.aString5 + " -> " + arg0.aString121, arg0.anInt10112, (long) (arg0.anInt10112 << 0 | arg0.anInt10089), true, Static185.aString41, arg0.anInt10149, false, arg0.anInt10089, false, 45, 0L);
			}
		}
		@Pc(97) String local97;
		for (@Pc(90) int local90 = 9; local90 >= 5; local90--) {
			local97 = Static596.method8242(local90, arg0);
			if (local97 != null) {
				Static541.method8078(Static552.method7808(arg0, local90), arg0.aString121, arg0.anInt10112, (long) (arg0.anInt10089 | arg0.anInt10112 << 0), true, local97, arg0.anInt10149, false, arg0.anInt10089, false, 1007, (long) (local90 + 1));
			}
		}
		local97 = Static346.method5315(arg0);
		if (local97 != null) {
			Static541.method8078(arg0.anInt10084, arg0.aString121, arg0.anInt10112, (long) (arg0.anInt10112 << 0 | arg0.anInt10089), true, local97, arg0.anInt10149, false, arg0.anInt10089, false, 11, 0L);
		}
		for (@Pc(190) int local190 = 4; local190 >= 0; local190--) {
			@Pc(199) String local199 = Static596.method8242(local190, arg0);
			if (local199 != null) {
				Static541.method8078(Static552.method7808(arg0, local190), arg0.aString121, arg0.anInt10112, (long) (arg0.anInt10089 | arg0.anInt10112 << 0), true, local199, arg0.anInt10149, false, arg0.anInt10089, false, 6, (long) (local190 + 1));
			}
		}
		if (!Static78.method1061(arg0).method5216()) {
			return;
		}
		if (arg0.aString125 == null) {
			Static541.method8078(-1, "", arg0.anInt10112, (long) (arg0.anInt10112 << 0 | arg0.anInt10089), true, Static50.aClass43_10.method596(Static601.anInt9518), arg0.anInt10149, false, arg0.anInt10089, false, 60, 0L);
		} else {
			Static541.method8078(-1, "", arg0.anInt10112, (long) (arg0.anInt10089 | arg0.anInt10112 << 0), true, arg0.aString125, arg0.anInt10149, false, arg0.anInt10089, false, 60, 0L);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Lclient!jc;")
	public static Class6_Sub15 method8544() {
		@Pc(16) Class6_Sub15 local16 = new Class6_Sub15(518);
		Static169.anIntArray188 = new int[4];
		Static169.anIntArray188[3] = (int) (Math.random() * 9.9999999E7D);
		Static169.anIntArray188[2] = (int) (Math.random() * 9.9999999E7D);
		Static169.anIntArray188[0] = (int) (Math.random() * 9.9999999E7D);
		Static169.anIntArray188[1] = (int) (Math.random() * 9.9999999E7D);
		local16.method3016(10);
		local16.method3029(Static169.anIntArray188[0]);
		local16.method3029(Static169.anIntArray188[1]);
		local16.method3029(Static169.anIntArray188[2]);
		local16.method3029(Static169.anIntArray188[3]);
		return local16;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIILclient!ha;III)Lclient!ka;")
	public static Class54 method8545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) long local6 = (long) arg0;
		@Pc(12) Class54 local12 = (Class54) Static688.aClass359_71.method8517(local6);
		if (local12 == null) {
			@Pc(22) Class316 local22 = Static347.method5332(arg0, Static517.aClass223_100);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt8613 < 13) {
				local22.method7538();
			}
			local12 = arg3.method6688(local22, 2055, Static314.anInt5452, 64, 768);
			Static688.aClass359_71.method8515(local6, local12);
		}
		local12 = local12.method7398((byte) 2, 2055, true);
		if (arg1 != 0) {
			local12.a(arg1);
		}
		if (arg4 != 0) {
			local12.FA(arg4);
		}
		if (arg5 != 0) {
			local12.VA(arg5);
		}
		if (arg2 != 0) {
			local12.H(0, arg2, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!bo;)Ljava/lang/String;")
	public static String method8546(@OriginalArg(1) Class6_Sub2_Sub2 arg0) {
		return arg0.aString10 + " <col=ffffff>>";
	}
}
