import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!gba", name = "o", descriptor = "Lclient!kr;")
	public static Class171 aClass171_58;

	@OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
	public static int anInt2803;

	@OriginalMember(owner = "client!gba", name = "h", descriptor = "Lclient!vda;")
	public static final Class299 aClass299_3 = new Class299();

	@OriginalMember(owner = "client!gba", name = "m", descriptor = "Z")
	public static boolean aBoolean182 = true;

	@OriginalMember(owner = "client!gba", name = "n", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_36 = new Class306(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 200.", null, null);

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "Lclient!wg;")
	public static final Class313 aClass313_21 = new Class313(5);

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(BLclient!dc;)I")
	public static int method2413(@OriginalArg(1) Class49_Sub2_Sub2 arg0) {
		if (arg0.anInt4270 == 0) {
			return 0;
		}
		@Pc(60) int local60;
		@Pc(53) int local53;
		if (arg0.anInt4323 != -1) {
			@Pc(15) Class49_Sub2_Sub2 local15 = null;
			if (arg0.anInt4323 < 32768) {
				@Pc(39) Class1_Sub17 local39 = (Class1_Sub17) Static380.aClass17_29.method738((long) arg0.anInt4323);
				if (local39 != null) {
					local15 = local39.aClass49_Sub2_Sub2_Sub2_2;
				}
			} else if (arg0.anInt4323 >= 32768) {
				local15 = Static349.aClass49_Sub2_Sub2_Sub1Array1[arg0.anInt4323 - 32768];
			}
			if (local15 != null) {
				local53 = arg0.anInt7137 - local15.anInt7137;
				local60 = arg0.anInt7141 - local15.anInt7141;
				if (local53 != 0 || local60 != 0) {
					arg0.method3783((int) (Math.atan2((double) local53, (double) local60) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class49_Sub2_Sub2_Sub1) {
			@Pc(89) Class49_Sub2_Sub2_Sub1 local89 = (Class49_Sub2_Sub2_Sub1) arg0;
			if (local89.anInt1760 != -1 && (local89.anInt4338 == 0 || local89.anInt4337 > 0)) {
				local89.method3783(local89.anInt1760);
				local89.anInt1760 = -1;
			}
		} else if (arg0 instanceof Class49_Sub2_Sub2_Sub2) {
			@Pc(117) Class49_Sub2_Sub2_Sub2 local117 = (Class49_Sub2_Sub2_Sub2) arg0;
			if (local117.anInt4345 != -1 && (local117.anInt4338 == 0 || local117.anInt4337 > 0)) {
				local53 = local117.anInt7137 - (local117.anInt4345 - Static470.anInt7897 - Static470.anInt7897) * 256;
				local60 = local117.anInt7141 - (local117.anInt4341 - Static534.anInt9007 - Static534.anInt9007) * 256;
				if (local53 != 0 || local60 != 0) {
					local117.method3783((int) (Math.atan2((double) local53, (double) local60) * 2607.5945876176133D) & 0x3FFF);
				}
				local117.anInt4345 = -1;
			}
		}
		return arg0.method3790();
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V")
	public static void method2415() {
		Static144.method2331(Static147.aClass296_133);
		Static455.aClass1_Sub6_Sub2_2.method3937(0);
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
	public static void method2416() {
		Static246.method4198();
	}
}
