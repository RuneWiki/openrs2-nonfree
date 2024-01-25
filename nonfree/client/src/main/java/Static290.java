import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_113 = new Class40(6, -2);

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method4077(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class6_Sub1_Sub5 local13 = Static77.method1176(arg0, 2);
		local13.method776();
		local13.aString10 = arg1;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIII)V")
	public static void method4078(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class102_Sub3 local10 = (Class102_Sub3) Static206.aClass249_3.method5817(); local10 != null; local10 = (Class102_Sub3) Static206.aClass249_3.method5815()) {
			if (Static358.anInt6263 >= local10.anInt7040) {
				local10.method7587();
			} else {
				Static478.method6659(local10.anInt7042 * 2, (local10.anInt7043 << 9) + 256, (local10.anInt7047 << 9) + 256, arg0 >> 1, local10.anInt7045, arg2 >> 1);
				Static408.aClass56_4.method7866(arg1 + Static550.anIntArray695[0], 0, local10.aString86, Static550.anIntArray695[1] + arg3, local10.anInt7046 | 0xFF000000);
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)I")
	public static int method4083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static38.anIntArray53[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLclient!lt;)V")
	public static void method4085(@OriginalArg(1) Class102_Sub2 arg0) {
		arg0.aClass29_1 = null;
		@Pc(12) int local12 = arg0.aClass102_Sub5Array1.length;
		for (@Pc(17) int local17 = 0; local17 < local12; local17++) {
			arg0.aClass102_Sub5Array1[local17].aBoolean515 = false;
		}
		@Pc(31) Class249[] local31 = Class45.aClass249Array3;
		synchronized (Class45.aClass249Array3) {
			if (Class45.aClass249Array3.length > local12 && Static98.anIntArray234[local12] < 200) {
				Class45.aClass249Array3[local12].method5809(arg0);
				@Pc(52) int local52 = Static98.anIntArray234[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)V")
	public static void method4086() {
		@Pc(12) Class6_Sub8 local12 = (Class6_Sub8) Static274.aClass275_64.method6366();
		@Pc(23) boolean local23 = Static382.aClass97_10 != null || Static540.anInt9139 > 0;
		if (local23) {
			Static460.anInt7814 = 1;
		}
		if (Static330.aBoolean414 && Static539.aClass88_1.method6348(81) && Static374.anInt6451 > 2) {
			if (local23) {
				Static336.aClass6_Sub48_3 = (Class6_Sub48) Static445.aClass275_162.aClass6_229.aClass6_283.aClass6_283;
			} else {
				Static206.method3068((Class6_Sub48) Static445.aClass275_162.aClass6_229.aClass6_283.aClass6_283, local12.method7643(), local12.method7645());
			}
		} else if (local23) {
			Static336.aClass6_Sub48_3 = (Class6_Sub48) Static445.aClass275_162.aClass6_229.aClass6_283;
		} else {
			Static206.method3068((Class6_Sub48) Static445.aClass275_162.aClass6_229.aClass6_283, local12.method7643(), local12.method7645());
		}
	}
}
