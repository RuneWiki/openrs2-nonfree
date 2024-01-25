import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_120 = new Class45(91, 6);

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_221 = new Class88("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIII)V")
	public static void method6387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg3;
		@Pc(16) int local16 = -arg3;
		@Pc(18) int local18 = -1;
		@Pc(27) int local27 = Static108.method2267(arg0 + arg3, Static251.anInt5168, Static341.anInt6481);
		@Pc(35) int local35 = Static108.method2267(arg0 - arg3, Static251.anInt5168, Static341.anInt6481);
		Static118.method2461(Static228.anIntArrayArray46[arg1], local27, arg2, local35);
		while (local11 < local13) {
			local18 += 2;
			local16 += local18;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(82) int local82;
			@Pc(90) int local90;
			if (local16 > 0) {
				local13--;
				local16 -= local13 << 1;
				local64 = arg1 - local13;
				local68 = arg1 + local13;
				if (Static507.anInt9124 <= local68 && Static234.anInt4897 >= local64) {
					local82 = Static108.method2267(local11 + arg0, Static251.anInt5168, Static341.anInt6481);
					local90 = Static108.method2267(arg0 - local11, Static251.anInt5168, Static341.anInt6481);
					if (local68 <= Static234.anInt4897) {
						Static118.method2461(Static228.anIntArrayArray46[local68], local82, arg2, local90);
					}
					if (local64 >= Static507.anInt9124) {
						Static118.method2461(Static228.anIntArrayArray46[local64], local82, arg2, local90);
					}
				}
			}
			local11++;
			local64 = arg1 - local11;
			local68 = local11 + arg1;
			if (local68 >= Static507.anInt9124 && Static234.anInt4897 >= local64) {
				local82 = Static108.method2267(arg0 + local13, Static251.anInt5168, Static341.anInt6481);
				local90 = Static108.method2267(arg0 - local13, Static251.anInt5168, Static341.anInt6481);
				if (local68 <= Static234.anInt4897) {
					Static118.method2461(Static228.anIntArrayArray46[local68], local82, arg2, local90);
				}
				if (Static507.anInt9124 <= local64) {
					Static118.method2461(Static228.anIntArrayArray46[local64], local82, arg2, local90);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
	public static void method6389() {
		Static512.anInt9218 = 0;
		Static83.anInt2006 = -1;
		Static340.aBoolean475 = false;
		Static444.aClass16_104 = null;
		Static224.anInt8484 = 2;
		Static111.anInt2588 = 1;
		Static105.anInt2408 = -1;
	}
}
