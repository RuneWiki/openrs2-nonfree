import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!kja", name = "t", descriptor = "Lclient!bd;")
	public static Class3_Sub1_Sub2 aClass3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!kja", name = "q", descriptor = "Lclient!tja;")
	public static final Class336 aClass336_11 = new Class336(9, 19);

	@OriginalMember(owner = "client!kja", name = "s", descriptor = "[I")
	public static final int[] anIntArray470 = new int[3];

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(Z)V")
	public static void method4793() {
		@Pc(5) int local5 = 0;
		if (Static24.aClass3_Sub22_4.aClass6_Sub12_1.method4157() == 1) {
			local5 = 55;
		}
		if (Static24.aClass3_Sub22_4.aClass6_Sub15_1.method4448() == 0) {
			local5 |= 0x40;
		}
		Static482.method7008(local5);
		Static652.aClass267_4.method6680(local5);
		Static170.aClass370_1.method8906(local5);
		Static580.aClass36_2.method1058(local5);
		Static354.aClass236_2.method5610(local5);
		Static150.method5041(local5);
		Static119.method2274(local5);
		Static164.method2974(local5);
		Static131.method2497(local5);
		Static200.method3621();
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(IIIII)V")
	public static void method4794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) float local13 = (float) Static317.anInt5405 / (float) Static317.anInt5410;
		@Pc(15) int local15 = arg2;
		@Pc(17) int local17 = arg1;
		if (local13 < 1.0F) {
			local17 = (int) ((float) arg2 * local13);
		} else {
			local15 = (int) ((float) arg1 / local13);
		}
		@Pc(44) int local44 = arg0 - (arg1 - local17) / 2;
		@Pc(53) int local53 = arg3 - (arg2 - local15) / 2;
		Static361.anInt5827 = local53 * Static317.anInt5410 / local15;
		Static590.anInt9485 = -1;
		Static90.anInt10121 = Static317.anInt5405 - local44 * Static317.anInt5405 / local17;
		Static88.anInt1725 = -1;
		Static496.method7118();
	}

	@OriginalMember(owner = "client!kja", name = "d", descriptor = "(I)V")
	public static void method4795() {
		for (@Pc(6) Class3_Sub11_Sub8 local6 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1842(); local6 != null; local6 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1844()) {
			if (local6.anInt3796 > 1) {
				local6.anInt3796 = 0;
				Static555.aClass165_63.method4392(local6, ((Class3_Sub11_Sub14) local6.aClass74_4.aClass3_Sub11_16.aClass3_Sub11_67).aLong212);
				local6.aClass74_4.method1845();
			}
		}
		Static71.anInt1334 = 0;
		Static450.anInt7444 = 0;
		Static78.aClass338_99.method8175();
		Static369.aClass83_24.method2374();
		Static111.aClass74_3.method1845();
		Static43.aBoolean74 = false;
	}
}
