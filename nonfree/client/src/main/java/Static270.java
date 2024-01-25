import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "[Lclient!dp;")
	public static Class53[] aClass53Array1;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
	public static int anInt5491 = -1;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_42 = new Class16();

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "[I")
	public static final int[] anIntArray415 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "Lclient!ec;")
	public static final Class58 aClass58_32 = new Class58(16);

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "[I")
	public static final int[] anIntArray416 = new int[50];

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_92 = new Class117("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "[I")
	public static final int[] anIntArray417 = new int[50];

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_93 = new Class117("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	public static void method4632() {
		@Pc(5) Class26 local5 = Static342.aClass26_60;
		synchronized (Static342.aClass26_60) {
			Static342.aClass26_60.method333();
		}
		local5 = Static262.aClass26_48;
		synchronized (Static262.aClass26_48) {
			Static262.aClass26_48.method333();
		}
		@Pc(36) Class54 local36 = Static72.aClass54_1;
		synchronized (Static72.aClass54_1) {
			Static72.aClass54_1.method929();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!uo;[BI[Lclient!hh;IZIIIIII)V")
	public static void method4633(@OriginalArg(0) Class129 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class92[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(10) Class11_Sub25 local10 = new Class11_Sub25(arg1);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method5193();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local10.method5188();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(47) int local47 = local28 & 0x3F;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(61) int local61 = local10.method5185();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				if (arg2 == local57 && arg6 <= local53 && local53 < arg6 + 8 && arg8 <= local47 && arg8 + 8 > local47) {
					@Pc(108) Class84 local108 = Static108.method1650(local16);
					@Pc(125) int local125 = Static217.method3914(local69, local53 & 0x7, local47 & 0x7, arg9, local108.anInt2035, local108.anInt1988) + arg7;
					@Pc(142) int local142 = arg10 + Static168.method2720(local69, local108.anInt2035, local53 & 0x7, local47 & 0x7, local108.anInt1988, arg9);
					if (local125 > 0 && local142 > 0 && Static24.anInt454 - 1 > local125 && Static240.anInt4832 - 1 > local142) {
						@Pc(172) Class92 local172 = null;
						if (!arg5) {
							@Pc(176) int local176 = arg4;
							if ((Static1.aByteArrayArrayArray1[1][local125][local142] & 0x2) == 2) {
								local176 = arg4 - 1;
							}
							if (local176 >= 0) {
								local172 = arg3[local176];
							}
						}
						Static262.method4547(-1, local65, arg5, local16, true, arg4, arg4, arg9 + local69 & 0x3, arg0, local125, local142, local172);
					}
				}
			}
		}
	}
}
