import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
	public static int anInt1195;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BIII)I")
	public static int method1050(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static85.aByteArrayArrayArray1[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static85.aByteArrayArrayArray1[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V")
	public static void method1051() {
		Static7.aClass90_1.method2261();
		Static441.aClass92_4.method2284();
		Static423.aClass323_1.method7158();
		Static347.aClass122_4.method2767();
		Static84.aClass242_1.method5275();
		Static230.aClass225_1.method4863();
		Static223.aClass245_1.method5311();
		Static583.aClass256_2.method5472();
		Static300.aClass321_3.method7114();
		Static433.aClass117_2.method2698();
		Static241.aClass340_1.method7436();
		Static191.aClass33_2.method790();
		Static144.aClass113_1.method2591();
		Static197.aClass284_1.method6123();
		Static256.aClass263_1.method5595();
		Static544.aClass237_1.method5209();
		Static40.aClass164_1.method3421();
		Static400.aClass351_1.method7553();
		Static215.aClass18_2.method493();
		Static381.aClass359_1.method7785();
		Static426.method6099();
		Static543.method7386();
		Static557.method7544();
		Static284.method7254();
		Static369.method7305();
		Static148.aClass207_12.method4398();
		Static318.aClass207_31.method4398();
		Static118.aClass207_8.method4398();
		Static364.aClass207_50.method4398();
		Static451.aClass207_47.method4398();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
	public static void method1052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class1_Sub8_Sub9 local10 = Static465.method6470(arg1, 6);
		local10.method4833();
		local10.anInt5968 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIII)V")
	public static void method1053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = arg0;
		@Pc(19) int local19 = -arg0;
		@Pc(21) int local21 = -1;
		Static329.method4871(arg2 - arg0, arg2 + arg0, Static280.anIntArrayArray25[arg3], arg1);
		while (local14 < local16) {
			local21 += 2;
			local19 += local21;
			local14++;
			if (local19 >= 0) {
				local16--;
				local19 -= local16 << 1;
				@Pc(60) int[] local60 = Static280.anIntArrayArray25[local16 + arg3];
				@Pc(67) int[] local67 = Static280.anIntArrayArray25[arg3 - local16];
				@Pc(71) int local71 = arg2 + local14;
				@Pc(76) int local76 = arg2 - local14;
				Static329.method4871(local76, local71, local60, arg1);
				Static329.method4871(local76, local71, local67, arg1);
			}
			@Pc(93) int local93 = arg2 + local16;
			@Pc(97) int local97 = arg2 - local16;
			@Pc(103) int[] local103 = Static280.anIntArrayArray25[local14 + arg3];
			@Pc(110) int[] local110 = Static280.anIntArrayArray25[arg3 - local14];
			Static329.method4871(local97, local93, local103, arg1);
			Static329.method4871(local97, local93, local110, arg1);
		}
	}
}
