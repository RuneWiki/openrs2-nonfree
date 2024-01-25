import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "Lclient!s;")
	public static Class4_Sub13_Sub3 aClass4_Sub13_Sub3_2;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Ljava/lang/String;")
	public static final String aString153 = "slide:";

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_1 = new Class10();

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
	public static int anInt4340 = 0;

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "Z")
	public static boolean aBoolean369 = false;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)V")
	public static void method3640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg0 * Static147.anInt3292 >> 8;
		if (local9 != 0 && arg1 != -1) {
			Static298.method5067(Static203.aClass11_84, local9, arg1);
			Static174.aBoolean320 = true;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBI)V")
	public static void method3641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static157.anInt3513 = arg0 - Static42.anInt2441;
		Static352.anInt6599 = arg1 - Static42.anInt2446;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!lo;I)I")
	public static int method3642(@OriginalArg(0) Class2_Sub2_Sub1 arg0) {
		if (arg0.anInt6514 == 0) {
			return 0;
		}
		@Pc(36) int local36;
		@Pc(43) int local43;
		if (arg0.anInt6479 != -1 && arg0.anInt6479 < 32768) {
			@Pc(27) Class2_Sub2_Sub1_Sub2 local27 = Static101.aClass2_Sub2_Sub1_Sub2Array6[arg0.anInt6479];
			if (local27 != null) {
				local36 = arg0.anInt6465 - local27.anInt6465;
				local43 = arg0.anInt6466 - local27.anInt6466;
				if (local36 != 0 || local43 != 0) {
					arg0.method5437((int) (Math.atan2((double) local36, (double) local43) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(72) int local72;
		if (arg0.anInt6479 >= 32768) {
			local72 = arg0.anInt6479 - 32768;
			if (local72 == Static321.anInt6343) {
				local72 = 2047;
			}
			@Pc(81) Class2_Sub2_Sub1_Sub1 local81 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local72];
			if (local81 != null) {
				local43 = arg0.anInt6465 - local81.anInt6465;
				@Pc(96) int local96 = arg0.anInt6466 - local81.anInt6466;
				if (local43 != 0 || local96 != 0) {
					arg0.method5437((int) (Math.atan2((double) local43, (double) local96) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt6539 != 0 || arg0.anInt6478 != 0) && (arg0.anInt6547 == 0 || arg0.anInt6548 > 0)) {
			local72 = arg0.anInt6465 - (arg0.anInt6539 - Static10.anInt231 - Static10.anInt231) * 64;
			local36 = arg0.anInt6466 - (arg0.anInt6478 - Static81.anInt1732 - Static81.anInt1732) * 64;
			if (local72 != 0 || local36 != 0) {
				arg0.method5437((int) (Math.atan2((double) local72, (double) local36) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt6539 = 0;
			arg0.anInt6478 = 0;
		}
		return arg0.method5429();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZI)V")
	public static void method3643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg1, 7);
		local8.method2031();
		local8.anInt2410 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
	public static void method3644() {
		@Pc(1) Class154 local1 = Static154.aClass154_55;
		synchronized (Static154.aClass154_55) {
			Static154.aClass154_55.method4219();
		}
		local1 = Static13.aClass154_5;
		synchronized (Static13.aClass154_5) {
			Static13.aClass154_5.method4219();
		}
		@Pc(31) Class85 local31 = Static234.aClass85_1;
		synchronized (Static234.aClass85_1) {
			Static234.aClass85_1.method2010();
		}
	}
}
