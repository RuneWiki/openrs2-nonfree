import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
	public static int anInt10173;

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "Lclient!mq;")
	public static Class218 aClass218_148;

	@OriginalMember(owner = "client!vs", name = "z", descriptor = "Lclient!mw;")
	public static Class116 aClass116_1;

	@OriginalMember(owner = "client!vs", name = "B", descriptor = "I")
	public static int anInt10177;

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "Lclient!bj;")
	public static final Class30 aClass30_13 = new Class30();

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "Lclient!qia;")
	public static Class276 aClass276_64 = new Class276();

	@OriginalMember(owner = "client!vs", name = "y", descriptor = "Lclient!qi;")
	public static final Class275 aClass275_10 = new Class275(0, 1);

	@OriginalMember(owner = "client!vs", name = "A", descriptor = "Z")
	public static boolean aBoolean856 = false;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "([BZI)V")
	public static void method8353(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static502.aClass3_Sub15_9 == null) {
			Static502.aClass3_Sub15_9 = new Class3_Sub15(20000);
		}
		Static502.aClass3_Sub15_9.method8430(arg0.length, 0, arg0);
		if (!arg1) {
			return;
		}
		Static637.method8380(Static502.aClass3_Sub15_9.aByteArray106);
		Static199.aClass153_Sub1Array1 = new Class153_Sub1[Static72.anInt1911];
		@Pc(38) int local38 = 0;
		for (@Pc(40) int local40 = Static46.anInt1031; local40 <= Static464.anInt8404; local40++) {
			@Pc(46) Class153_Sub1 local46 = Static643.method8649(local40);
			if (local46 != null) {
				Static199.aClass153_Sub1Array1[local38++] = local46;
			}
		}
		Static237.aBoolean473 = false;
		Static300.aLong144 = Static444.method6719();
		Static502.aClass3_Sub15_9 = null;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method8354(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static644.anInt10532 >= 100) {
			Static496.method7251(Static287.aClass176_39.method4986(Static380.anInt7247));
			return;
		}
		@Pc(25) String local25 = Static629.method8529(arg0);
		if (local25 == null) {
			return;
		}
		@Pc(71) String local71;
		for (@Pc(30) int local30 = 0; local30 < Static644.anInt10532; local30++) {
			@Pc(38) String local38 = Static629.method8529(Static615.aStringArray41[local30]);
			if (local38 != null && local38.equals(local25)) {
				Static496.method7251(arg0 + Static287.aClass176_40.method4986(Static380.anInt7247));
				return;
			}
			if (Static228.aStringArray20[local30] != null) {
				local71 = Static629.method8529(Static228.aStringArray20[local30]);
				if (local71 != null && local71.equals(local25)) {
					Static496.method7251(arg0 + Static287.aClass176_40.method4986(Static380.anInt7247));
					return;
				}
			}
		}
		for (@Pc(102) int local102 = 0; local102 < Static409.anInt6024; local102++) {
			local71 = Static629.method8529(Static573.aStringArray40[local102]);
			if (local71 != null && local71.equals(local25)) {
				Static496.method7251(Static287.aClass176_45.method4986(Static380.anInt7247) + arg0 + Static287.aClass176_46.method4986(Static380.anInt7247));
				return;
			}
			if (Static175.aStringArray16[local102] != null) {
				@Pc(155) String local155 = Static629.method8529(Static175.aStringArray16[local102]);
				if (local155 != null && local155.equals(local25)) {
					Static496.method7251(Static287.aClass176_45.method4986(Static380.anInt7247) + arg0 + Static287.aClass176_46.method4986(Static380.anInt7247));
					return;
				}
			}
		}
		if (Static629.method8529(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aString68).equals(local25)) {
			Static496.method7251(Static287.aClass176_42.method4986(Static380.anInt7247));
			return;
		}
		@Pc(213) Class3_Sub26 local213 = Static640.method8636(Static125.aClass344_52, Static403.aClass294_3);
		local213.aClass3_Sub15_Sub1_3.method8448(Static139.method3132(arg0) + 1);
		local213.aClass3_Sub15_Sub1_3.method8417(arg0);
		local213.aClass3_Sub15_Sub1_3.method8448(arg1 ? 1 : 0);
		Static472.method5189(local213);
	}
}
