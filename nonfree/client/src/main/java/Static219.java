import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ij", name = "G", descriptor = "[J")
	public static long[] aLongArray22;

	@OriginalMember(owner = "client!ij", name = "Q", descriptor = "[I")
	public static final int[] anIntArray576 = new int[1];

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ok;Z)V")
	public static void method5960(@OriginalArg(0) Class134_Sub2 arg0) {
		@Pc(16) byte[] local16;
		if (Static483.anObject19 == null) {
			@Pc(9) Class5_Sub2_Sub2 local9 = new Class5_Sub2_Sub2();
			local16 = local9.method2412();
			Static483.anObject19 = Static476.method6489(local16);
		}
		if (Static559.anObject22 == null) {
			@Pc(27) Class5_Sub1_Sub2 local27 = new Class5_Sub1_Sub2();
			local16 = local27.method5034();
			Static559.anObject22 = Static476.method6489(local16);
		}
		@Pc(47) Class37 local47 = arg0.aClass37_1;
		if (local47.method707() && Static394.anObject14 == null) {
			local16 = Static264.method3793(new Class230_Sub1(419684), 4.0F, 16.0F, 0.6F, 4.0F, 0.5F);
			Static394.anObject14 = Static476.method6489(local16);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(CI)C")
	public static char method5963(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!wt;B)V")
	public static void method5964(@OriginalArg(0) Class1_Sub51 arg0) {
		if (!Static554.aBoolean708) {
			arg0.method7859();
			Static337.anInt8004--;
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)I")
	public static int method5965(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
