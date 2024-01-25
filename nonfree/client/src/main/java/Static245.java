import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "F")
	public static float aFloat60;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
	public static int anInt4912 = 0;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Z")
	public static boolean aBoolean411 = true;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)Z")
	public static boolean method4388() {
		@Pc(13) Class5_Sub20 local13 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.aClass5_114.aClass5_252;
		if (local13 == null || Class4_Sub3_Sub2.aClass103_139.aClass5_114 == local13) {
			return false;
		} else {
			if (local13.anInt2094 >= 2000) {
				local13.anInt2094 -= 2000;
			}
			return local13.anInt2094 == 1009;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Lclient!nr;")
	public static Class145 method4389(@OriginalArg(0) int arg0) {
		@Pc(10) Class145 local10 = (Class145) Static115.aClass109_26.method2857((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static277.aClass93_107.method2410(arg0, 33);
		local10 = new Class145();
		if (local20 != null) {
			local10.method4018(new Class5_Sub12(local20), arg0);
		}
		Static115.aClass109_26.method2855((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ne;Lclient!rg;ZI)V")
	public static void method4390(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Class5_Sub12 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class5_Sub39 local9 = new Class5_Sub39();
		local9.anInt5905 = arg1.method5115();
		local9.anInt5903 = arg1.method5067();
		local9.anIntArray572 = new int[local9.anInt5905];
		local9.aClass16Array2 = new Class16[local9.anInt5905];
		local9.aByteArrayArrayArray14 = new byte[local9.anInt5905][][];
		local9.aClass16Array1 = new Class16[local9.anInt5905];
		local9.anIntArray574 = new int[local9.anInt5905];
		local9.anIntArray573 = new int[local9.anInt5905];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt5905; local56++) {
			try {
				@Pc(62) int local62 = arg1.method5115();
				@Pc(76) String local76;
				@Pc(80) String local80;
				@Pc(82) int local82;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local76 = arg1.method5064();
					local80 = arg1.method5064();
					local82 = 0;
					if (local62 == 1) {
						local82 = arg1.method5067();
					}
					local9.anIntArray574[local56] = local62;
					local9.anIntArray573[local56] = local82;
					local9.aClass16Array2[local56] = arg0.method3880(local80, Static220.method4016(local76));
				} else if (local62 == 3 || local62 == 4) {
					local76 = arg1.method5064();
					local80 = arg1.method5064();
					local82 = arg1.method5115();
					@Pc(135) String[] local135 = new String[local82];
					for (@Pc(137) int local137 = 0; local137 < local82; local137++) {
						local135[local137] = arg1.method5064();
					}
					@Pc(152) byte[][] local152 = new byte[local82][];
					@Pc(165) int local165;
					if (local62 == 3) {
						for (@Pc(159) int local159 = 0; local159 < local82; local159++) {
							local165 = arg1.method5067();
							local152[local159] = new byte[local165];
							arg1.method5058(local165, local152[local159]);
						}
					}
					local9.anIntArray574[local56] = local62;
					@Pc(194) Class[] local194 = new Class[local82];
					for (local165 = 0; local165 < local82; local165++) {
						local194[local165] = Static220.method4016(local135[local165]);
					}
					local9.aClass16Array1[local56] = arg0.method3862(Static220.method4016(local76), local194, local80);
					local9.aByteArrayArrayArray14[local56] = local152;
				}
			} catch (@Pc(229) ClassNotFoundException local229) {
				local9.anIntArray572[local56] = -1;
			} catch (@Pc(236) SecurityException local236) {
				local9.anIntArray572[local56] = -2;
			} catch (@Pc(243) NullPointerException local243) {
				local9.anIntArray572[local56] = -3;
			} catch (@Pc(250) Exception local250) {
				local9.anIntArray572[local56] = -4;
			} catch (@Pc(257) Throwable local257) {
				local9.anIntArray572[local56] = -5;
			}
		}
		Static338.aClass103_164.method2745(local9);
	}
}
