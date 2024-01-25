import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	public static int anInt9694;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!vga;B)V")
	public static void method8327(@OriginalArg(0) int arg0, @OriginalArg(1) Class362 arg1) {
		if (Static44.anInt945 >= 50 || (arg1 == null || arg1.anIntArrayArray70 == null || arg1.anIntArrayArray70.length <= arg0 || arg1.anIntArrayArray70[arg0] == null)) {
			return;
		}
		@Pc(34) int local34 = arg1.anIntArrayArray70[arg0][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(63) int local63;
		if (arg1.anIntArrayArray70[arg0].length > 1) {
			local63 = (int) ((double) arg1.anIntArrayArray70[arg0].length * Math.random());
			if (local63 > 0) {
				local38 = arg1.anIntArrayArray70[arg0][local63];
			}
		}
		local63 = 256;
		if (arg1.anIntArray568 != null && arg1.anIntArray572 != null) {
			local63 = Static493.method7230(arg1.anIntArray568[arg0], arg1.anIntArray572[arg0]);
		}
		if (arg1.aBoolean720) {
			Static492.method7225(0, local63, 255, local38, local44, false);
		} else {
			Static443.method6696(255, 0, local38, local63, local44);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method8328(@OriginalArg(1) String arg0) {
		return Static438.method8966(arg0, 16);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!ofa;)V")
	public static void method8329(@OriginalArg(1) Class5_Sub22 arg0) {
		@Pc(9) int local9 = arg0.method5947();
		Static249.aClass244Array1 = new Class244[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static249.aClass244Array1[local14] = new Class244();
			Static249.aClass244Array1[local14].anInt6184 = arg0.method5947();
			Static249.aClass244Array1[local14].aString65 = arg0.method5923();
		}
		Static527.anInt9062 = arg0.method5947();
		Static511.anInt8847 = arg0.method5947();
		Static85.anInt1713 = arg0.method5947();
		Static51.aClass33_Sub1Array1 = new Class33_Sub1[Static511.anInt8847 + 1 - Static527.anInt9062];
		for (@Pc(62) int local62 = 0; local62 < Static85.anInt1713; local62++) {
			@Pc(68) int local68 = arg0.method5947();
			@Pc(76) Class33_Sub1 local76 = Static51.aClass33_Sub1Array1[local68] = new Class33_Sub1();
			local76.anInt6149 = arg0.method5966();
			local76.anInt6143 = arg0.method5913();
			local76.anInt6152 = local68 + Static527.anInt9062;
			local76.aString63 = arg0.method5923();
			local76.aString64 = arg0.method5923();
		}
		Static641.anInt10605 = arg0.method5913();
		Static47.aBoolean59 = true;
	}
}
