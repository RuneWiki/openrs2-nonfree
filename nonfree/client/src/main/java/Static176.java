import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!td", name = "G", descriptor = "Lclient!sd;")
	public static Class60 aClass60_36;

	@OriginalMember(owner = "client!td", name = "J", descriptor = "I")
	public static int anInt3920;

	@OriginalMember(owner = "client!td", name = "K", descriptor = "I")
	public static int anInt3921;

	@OriginalMember(owner = "client!td", name = "E", descriptor = "J")
	public static long aLong134 = 0L;

	@OriginalMember(owner = "client!td", name = "F", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2325 = Static118.method2249("headicons_prayer");

	@OriginalMember(owner = "client!td", name = "H", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "Lclient!hf;")
	public static final Class1_Sub9 aClass1_Sub9_1 = new Class1_Sub9(0, 0);

	@OriginalMember(owner = "client!td", name = "L", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2326 = Static118.method2249("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!td", name = "M", descriptor = "I")
	public static int anInt3922 = 0;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V")
	public static void method2981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass88_1 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII)V")
	public static void method2983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static148.anInt3494 == arg1 && Static206.anInt4395 == arg4 && (arg3 == Static37.anInt1034 || !Static13.aBoolean36)) {
			return;
		}
		Static206.anInt4395 = arg4;
		Static148.anInt3494 = arg1;
		Static37.anInt1034 = arg3;
		if (!Static13.aBoolean36) {
			Static37.anInt1034 = 0;
		}
		Static118.method2247(25);
		Static168.method2339(Static166.aClass65_2238, true);
		@Pc(43) int local43 = Static58.anInt1543;
		Static58.anInt1543 = (arg4 - 6) * 8;
		@Pc(51) int local51 = Static205.anInt4337;
		Static205.anInt4337 = arg1 * 8 - 48;
		@Pc(62) int local62 = Static205.anInt4337 - local51;
		@Pc(66) int local66 = Static58.anInt1543 - local43;
		for (@Pc(72) int local72 = 0; local72 < 32768; local72++) {
			@Pc(77) Class6_Sub4_Sub2 local77 = Static106.aClass6_Sub4_Sub2Array1[local72];
			if (local77 != null) {
				for (@Pc(81) int local81 = 0; local81 < 10; local81++) {
					local77.anIntArray451[local81] -= local62;
					local77.anIntArray455[local81] -= local66;
				}
				local77.anInt3934 -= local62 * 128;
				local77.anInt3976 -= local66 * 128;
			}
		}
		for (@Pc(128) int local128 = 0; local128 < 2048; local128++) {
			@Pc(133) Class6_Sub4_Sub1 local133 = Static158.aClass6_Sub4_Sub1Array1[local128];
			if (local133 != null) {
				for (@Pc(137) int local137 = 0; local137 < 10; local137++) {
					local133.anIntArray451[local137] -= local62;
					local133.anIntArray455[local137] -= local66;
				}
				local133.anInt3934 -= local62 * 128;
				local133.anInt3976 -= local66 * 128;
			}
		}
		@Pc(184) byte local184 = 0;
		@Pc(186) byte local186 = 104;
		@Pc(188) byte local188 = 1;
		@Pc(190) byte local190 = 0;
		Static207.anInt4425 = arg3;
		if (local62 < 0) {
			local184 = 103;
			local186 = -1;
			local188 = -1;
		}
		@Pc(202) byte local202 = 104;
		Static201.aClass6_Sub4_Sub1_3.method2991(arg0, false, arg2);
		@Pc(210) byte local210 = 1;
		if (local66 < 0) {
			local190 = 103;
			local210 = -1;
			local202 = -1;
		}
		for (@Pc(220) int local220 = local184; local220 != local186; local220 += local188) {
			for (@Pc(223) int local223 = local190; local223 != local202; local223 += local210) {
				@Pc(228) int local228 = local66 + local223;
				@Pc(232) int local232 = local62 + local220;
				for (@Pc(234) int local234 = 0; local234 < 4; local234++) {
					if (local232 >= 0 && local228 >= 0 && local232 < 104 && local228 < 104) {
						Static27.aClass91ArrayArrayArray1[local234][local220][local223] = Static27.aClass91ArrayArrayArray1[local234][local232][local228];
					} else {
						Static27.aClass91ArrayArrayArray1[local234][local220][local223] = null;
					}
				}
			}
		}
		for (@Pc(300) Class1_Sub24 local300 = (Class1_Sub24) Static159.aClass91_19.method3148(); local300 != null; local300 = (Class1_Sub24) Static159.aClass91_19.method3150()) {
			local300.anInt4087 -= local66;
			local300.anInt4100 -= local62;
			if (local300.anInt4100 < 0 || local300.anInt4087 < 0 || local300.anInt4100 >= 104 || local300.anInt4087 >= 104) {
				local300.method3295();
			}
		}
		Static54.anInt3677 = -1;
		if (Static106.anInt2616 != 0) {
			Static106.anInt2616 -= local62;
			Static129.anInt3182 -= local66;
		}
		Static77.aBoolean81 = false;
		Static161.anInt3642 = 0;
		Static169.aClass91_7.method3147();
		Static78.aClass91_6.method3147();
	}
}
