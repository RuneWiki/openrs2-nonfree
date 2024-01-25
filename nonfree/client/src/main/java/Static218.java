import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ie", name = "db", descriptor = "Z")
	public static boolean aBoolean584 = false;

	@OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
	public static int anInt8725 = 0;

	@OriginalMember(owner = "client!ie", name = "Gb", descriptor = "[I")
	public static final int[] anIntArray520 = new int[3];

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IZ)V")
	public static void method6807(@OriginalArg(1) boolean arg0) {
		if (Static451.aClass223_6 != null) {
			Static451.aClass223_6.method5105();
			Static451.aClass223_6 = null;
		}
		Static340.anInt6133 = 0;
		Static527.method8126();
		Static492.method6624();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static187.aClass220Array1[local19].method5072();
		}
		Static427.method5898(false);
		System.gc();
		Static293.method4413();
		Static526.anInt9227 = -1;
		Static168.aBoolean262 = false;
		Static115.method2284();
		Static560.method7664(true);
		Static321.anInt5874 = 0;
		Static137.anInt3293 = 0;
		Static47.anInt1279 = 0;
		Static365.anInt6426 = 0;
		Static100.anInt9658 = 0;
		Static347.anInt6235 = 0;
		for (@Pc(66) int local66 = 0; local66 < Static98.aClass167Array1.length; local66++) {
			Static98.aClass167Array1[local66] = null;
		}
		Static464.method6365();
		for (@Pc(85) int local85 = 0; local85 < 2048; local85++) {
			Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local85] = null;
		}
		Static60.anInt1599 = 0;
		Static581.aClass297_39.method6535();
		Static238.anInt4737 = 0;
		Static537.aClass297_34.method6535();
		Static446.method6190();
		Static538.anInt9387 = 0;
		Static206.aClass143_3.method3693();
		Static512.method6921();
		Static69.method5321();
		Static321.aClass3_Sub28_3 = null;
		Static207.aLong102 = 0L;
		if (arg0) {
			Static27.method293(12);
			return;
		}
		Static27.method293(3);
		try {
			Static600.method2906("loggedout", Static304.anApplet1);
		} catch (@Pc(138) Throwable local138) {
		}
	}
}
