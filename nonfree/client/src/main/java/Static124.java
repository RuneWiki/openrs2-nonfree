import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "[Lclient!wn;")
	public static Class95[] aClass95Array8;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "[I")
	public static final int[] anIntArray226 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
	public static int anInt2371 = 0;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)V")
	public static void method2196(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = arg4 + 1;
		Static160.method2840(arg3, arg1, arg0, Static129.anIntArrayArray46[arg4]);
		@Pc(25) int local25 = arg2 - 1;
		Static160.method2840(arg3, arg1, arg0, Static129.anIntArrayArray46[arg2]);
		for (@Pc(29) int local29 = local16; local29 <= local25; local29++) {
			@Pc(35) int[] local35 = Static129.anIntArrayArray46[local29];
			local35[arg0] = local35[arg1] = arg3;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I")
	public static int method2197() {
		@Pc(10) Class109 local10 = Static174.aClass109_39;
		synchronized (Static174.aClass109_39) {
			return Static174.aClass109_39.method2862();
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method2198(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static346.anInt6667 >= 100) {
			Static45.method713(Static231.aClass85_106.method2020(Static41.anInt726));
			return;
		}
		@Pc(22) String local22 = Static289.method5015(arg0);
		if (local22 == null) {
			return;
		}
		@Pc(69) String local69;
		for (@Pc(27) int local27 = 0; local27 < Static346.anInt6667; local27++) {
			@Pc(39) String local39 = Static289.method5015(Static25.aStringArray52[local27]);
			if (local39 != null && local39.equals(local22)) {
				Static45.method713(arg0 + Static329.aClass85_140.method2020(Static41.anInt726));
				return;
			}
			if (Static222.aStringArray48[local27] != null) {
				local69 = Static289.method5015(Static222.aStringArray48[local27]);
				if (local69 != null && local69.equals(local22)) {
					Static45.method713(arg0 + Static329.aClass85_140.method2020(Static41.anInt726));
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < Static44.anInt750; local95++) {
			local69 = Static289.method5015(Static85.aStringArray14[local95]);
			if (local69 != null && local69.equals(local22)) {
				Static45.method713(Static251.aClass85_116.method2020(Static41.anInt726) + arg0 + Static39.aClass85_18.method2020(Static41.anInt726));
				return;
			}
			if (Static20.aStringArray5[local95] != null) {
				@Pc(137) String local137 = Static289.method5015(Static20.aStringArray5[local95]);
				if (local137 != null && local137.equals(local22)) {
					Static45.method713(Static251.aClass85_116.method2020(Static41.anInt726) + arg0 + Static39.aClass85_18.method2020(Static41.anInt726));
					return;
				}
			}
		}
		if (Static289.method5015(Static192.aClass4_Sub5_Sub2_Sub1_2.aString40).equals(local22)) {
			Static45.method713(Static155.aClass85_71.method2020(Static41.anInt726));
		} else {
			Static125.aClass5_Sub12_Sub2_3.method5125(140);
			Static125.aClass5_Sub12_Sub2_3.method5089(Static56.method878(arg0) + 1);
			Static125.aClass5_Sub12_Sub2_3.method5094(arg0);
			Static125.aClass5_Sub12_Sub2_3.method5089(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!h;I)Ljava/lang/String;")
	public static String method2199(@OriginalArg(0) Class5_Sub20 arg0) {
		return arg0.aString13 == null || arg0.aString13.length() <= 0 ? arg0.aString14 : arg0.aString14 + Static333.aClass85_142.method2020(Static41.anInt726) + arg0.aString13;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
	public static void method2201() {
		if (Static77.anIntArray120 != null && Static186.anIntArray370 != null) {
			return;
		}
		Static77.anIntArray120 = new int[256];
		Static186.anIntArray370 = new int[256];
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(19) double local19 = (double) local11 / 255.0D * 6.283185307179586D;
			Static77.anIntArray120[local11] = (int) (Math.sin(local19) * 4096.0D);
			Static186.anIntArray370[local11] = (int) (Math.cos(local19) * 4096.0D);
		}
	}
}
