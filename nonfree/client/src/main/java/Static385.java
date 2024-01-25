import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_338 = new Class12(64, 1);

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_127 = new Class254(1, -1);

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_339 = new Class12(22, 0);

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_100 = new Class96("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IC)C")
	public static char method5366(@OriginalArg(1) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIILclient!dn;ZI)V")
	public static void method5367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class58 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (Static381.anInt436 >= 50 || (arg3 == null || arg3.anIntArrayArray5 == null || arg3.anIntArrayArray5.length <= arg2 || arg3.anIntArrayArray5[arg2] == null)) {
			return;
		}
		@Pc(30) int local30 = arg3.anIntArrayArray5[arg2][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(40) int local40 = local30 >> 5 & 0x7;
		@Pc(44) int local44 = local30 & 0x1F;
		@Pc(63) int local63;
		if (arg3.anIntArrayArray5[arg2].length > 1) {
			local63 = (int) ((double) arg3.anIntArrayArray5[arg2].length * Math.random());
			if (local63 > 0) {
				local34 = arg3.anIntArrayArray5[arg2][local63];
			}
		}
		if (local44 == 0) {
			if (arg4) {
				Static110.method1735(local40, 0, local34, 255);
			}
		} else if (Static327.aClass230_Sub1_1.anInt7306 != 0) {
			local63 = arg5 - 64 >> 7;
			@Pc(104) int local104 = arg1 - 64 >> 7;
			Static426.aClass239Array1[Static381.anInt436++] = new Class239((byte) 1, local34, local40, 0, 255, (local104 << 8) + (local63 << 16) + (arg0 << 24) + local44);
		}
	}
}
