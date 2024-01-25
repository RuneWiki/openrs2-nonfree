import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!db", name = "rb", descriptor = "I")
	public static int anInt1230;

	@OriginalMember(owner = "client!db", name = "Bb", descriptor = "I")
	public static int anInt1236;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "S")
	public static short aShort6 = 32767;

	@OriginalMember(owner = "client!db", name = "V", descriptor = "Lclient!uc;")
	public static Class198 aClass198_15 = new Class198(64);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZI)I")
	public static int method923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static143.anIntArray562[arg0 & 0x3] : Static221.anIntArray370[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	public static void method928() {
		if (Static266.anInt5370 == 10 || Static266.anInt5370 == 28) {
			Static151.method2439(Static210.anInt4317 >> 10, Static110.anInt2324 >> 10);
		} else {
			Static151.method2439(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0] >> 3, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0] >> 3);
		}
		Static35.method2333();
		Static277.method4640();
		Static25.method509();
		Static163.method2599();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public static void method929() {
		for (@Pc(15) Class3_Sub32 local15 = (Class3_Sub32) Static188.aClass24_21.method595(); local15 != null; local15 = (Class3_Sub32) Static188.aClass24_21.method602()) {
			@Pc(20) int local20 = local15.anInt4348;
			if (Static149.method2419(local20)) {
				@Pc(26) boolean local26 = true;
				@Pc(30) Class181[] local30 = Static311.aClass181ArrayArray1[local20];
				for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
					if (local30[local32] != null) {
						local26 = local30[local32].aBoolean381;
						break;
					}
				}
				if (!local26) {
					@Pc(56) int local56 = (int) local15.aLong211;
					@Pc(60) Class181 local60 = Static20.method415(local56);
					if (local60 != null) {
						Static316.method5250(local60);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method934() {
		Static4.aClass198_2.method5236();
		Static264.aClass198_49.method5236();
		Static290.aClass198_52.method5236();
		Static235.aClass198_44.method5236();
		Static181.aClass198_13.method5236();
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(III)I")
	public static int method936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static195.method3427(arg1 + 91923, arg0 + 45365, 4) + (Static195.method3427(arg1 + 37821, arg0 - -10294, 2) - 128 >> 1) + (Static195.method3427(arg1, arg0, 1) - 128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
