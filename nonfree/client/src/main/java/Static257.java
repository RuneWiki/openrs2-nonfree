import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_65 = new Class25(28, 6);

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
	public static int anInt4382 = 0;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ICI)I")
	public static int method3950(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!lt;I)V")
	public static void method3952(@OriginalArg(0) Class158 arg0) {
		Static174.anInt3052 = 0;
		Static392.anInt6526 = 0;
		Static62.aClass128_2 = new Class128();
		Static33.aClass48_Sub2_Sub1_Sub1Array1 = new Class48_Sub2_Sub1_Sub1[1024];
		Static283.method4263(arg0);
		Static393.method4740(arg0);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!tq;B)Lclient!tq;")
	public static Class239 method3954(@OriginalArg(0) Class239 arg0) {
		if (arg0.anInt6479 != -1) {
			return Static299.method4387(arg0.anInt6479);
		}
		@Pc(24) int local24 = arg0.anInt6423 >>> 16;
		@Pc(29) Class123 local29 = new Class123(Static20.aClass137_3);
		for (@Pc(34) Class6_Sub16 local34 = (Class6_Sub16) local29.method2751(); local34 != null; local34 = (Class6_Sub16) local29.method2752()) {
			if (local24 == local34.anInt2715) {
				return Static299.method4387((int) local34.aLong217);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IBI)I")
	public static int method3955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (local7 + arg1) / arg0 - local7;
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
	public static void method3958() {
		if (Static143.aString28.toLowerCase().indexOf("microsoft") != -1) {
			Static17.anIntArray21[192] = 58;
			Static17.anIntArray21[190] = 72;
			Static17.anIntArray21[220] = 74;
			Static17.anIntArray21[189] = 26;
			Static17.anIntArray21[221] = 43;
			Static17.anIntArray21[186] = 57;
			Static17.anIntArray21[191] = 73;
			Static17.anIntArray21[219] = 42;
			Static17.anIntArray21[188] = 71;
			Static17.anIntArray21[223] = 28;
			Static17.anIntArray21[222] = 59;
			Static17.anIntArray21[187] = 27;
			return;
		}
		Static17.anIntArray21[91] = 42;
		Static17.anIntArray21[92] = 74;
		Static17.anIntArray21[46] = 72;
		Static17.anIntArray21[44] = 71;
		Static17.anIntArray21[45] = 26;
		Static17.anIntArray21[93] = 43;
		if (Static143.aMethod1 == null) {
			Static17.anIntArray21[222] = 59;
			Static17.anIntArray21[192] = 58;
		} else {
			Static17.anIntArray21[222] = 58;
			Static17.anIntArray21[192] = 28;
			Static17.anIntArray21[520] = 59;
		}
		Static17.anIntArray21[59] = 57;
		Static17.anIntArray21[47] = 73;
		Static17.anIntArray21[61] = 27;
	}
}
