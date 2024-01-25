import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ft", name = "E", descriptor = "[I")
	public static int[] anIntArray169;

	@OriginalMember(owner = "client!ft", name = "M", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!ft", name = "G", descriptor = "I")
	public static int anInt2524 = 0;

	@OriginalMember(owner = "client!ft", name = "I", descriptor = "[Lclient!lv;")
	public static final Class143_Sub1[] aClass143_Sub1Array1 = new Class143_Sub1[30];

	@OriginalMember(owner = "client!ft", name = "J", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_44 = new Class83("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!ft", name = "N", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_106 = new Class22(20, 12);

	@OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
	public static int anInt2527 = 0;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIILclient!pn;)Lclient!ae;")
	public static Class4_Sub1_Sub1 method2147(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class186 arg2) {
		@Pc(10) int local10 = arg2.anInt5418 | arg1 << 8;
		@Pc(19) Class4_Sub1_Sub1 local19 = (Class4_Sub1_Sub1) Static48.aClass142_1.method3483((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(33) byte[] local33 = Static197.aClass76_45.method2122(Static197.aClass76_45.method2117(local10));
		if (local33 == null) {
			local10 = arg2.anInt5418 | arg0 + 65536 << 8;
			local19 = (Class4_Sub1_Sub1) Static48.aClass142_1.method3483((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local33 = Static197.aClass76_45.method2122(Static197.aClass76_45.method2117(local10));
			if (local33 == null) {
				local10 = arg2.anInt5418 | 0xFFFF00;
				local19 = (Class4_Sub1_Sub1) Static48.aClass142_1.method3483((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local33 = Static197.aClass76_45.method2122(Static197.aClass76_45.method2117(local10));
				if (local33 == null) {
					return null;
				} else if (local33.length <= 1) {
					return null;
				} else {
					local19 = Static226.method3441(local33);
					local19.aClass186_1 = arg2;
					Static48.aClass142_1.method3480((long) local10 << 16, local19);
					return local19;
				}
			} else if (local33.length <= 1) {
				return null;
			} else {
				local19 = Static226.method3441(local33);
				local19.aClass186_1 = arg2;
				Static48.aClass142_1.method3480((long) local10 << 16, local19);
				return local19;
			}
		} else if (local33.length <= 1) {
			return null;
		} else {
			local19 = Static226.method3441(local33);
			local19.aClass186_1 = arg2;
			Static48.aClass142_1.method3480((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "(I)V")
	public static void method2149() {
		@Pc(5) int local5 = 0;
		if (Static323.aClass50_Sub1_1.method2854(Static177.anInt2973)) {
			local5 = 55;
		}
		if (!Static323.aClass50_Sub1_1.aBoolean307) {
			local5 |= 0x40;
		}
		Static6.method51(local5);
		Static267.aClass262_2.method5558(local5);
		Static444.aClass206_3.method4712(local5);
		Static329.aClass240_1.method5225(local5);
		Static352.aClass194_2.method4417(local5);
		Static276.method889(local5);
		Static150.method2574(local5);
		Static191.method2233(local5);
		Static22.method296(local5);
		if (Static403.anInt6667 == 10) {
			Static187.method2932(28);
		} else if (Static403.anInt6667 == 30) {
			Static187.method2932(25);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIII)V")
	public static void method2150(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class4_Sub1_Sub11 local16 = Static405.method5222(arg0, 9);
		local16.method2604();
		local16.anInt3083 = arg2;
		local16.anInt3082 = arg1;
	}
}
