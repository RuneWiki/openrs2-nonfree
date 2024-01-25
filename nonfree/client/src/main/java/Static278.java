import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!o", name = "V", descriptor = "Lclient!hh;")
	public static Class109 aClass109_95;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_107 = new Class96("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!o", name = "U", descriptor = "Z")
	public static boolean aBoolean642 = false;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIILclient!qg;[I[I)Lclient!op;")
	public static Class34_Sub2 method5795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121_Sub2 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(26) int local26 = arg0 * local12 + arg3[local12];
			for (@Pc(28) int local28 = 0; local28 < arg4[local12]; local28++) {
				local10[local26++] = -1;
			}
		}
		return new Class34_Sub2(arg2, arg0, arg1, local10);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILclient!m;ILclient!ci;Ljava/awt/Canvas;)Lclient!qa;")
	public static Class121 method5796(@OriginalArg(0) int arg0, @OriginalArg(2) Interface5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42 arg3, @OriginalArg(5) Canvas arg4) {
		return new Class121_Sub2(arg0, arg4, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
	public static void method5798() {
		Static135.aClass123_2.method2913();
		Static121.aClass104_2.method2060();
		Static160.aClass122_5.method2739();
		Static251.aClass207_2.method4983();
		Static268.aClass26_1.method436();
		Static388.aClass193_3.method4252();
		Static322.aClass45_5.method695();
		Static294.aClass125_2.method2963();
		Static82.aClass260_1.method5912();
		Static157.aClass255_1.method5819();
		Static117.aClass81_1.method1626();
		Static50.aClass177_1.method3803();
		Static86.aClass103_2.method2053();
		Static183.aClass30_1.method483();
		Static192.aClass75_1.method1516();
		Static377.aClass243_1.method5514();
		Static347.aClass163_1.method3573();
		Static40.aClass165_1.method3594();
		Static394.aClass86_2.method1709();
		Static96.aClass39_1.method577();
		Static236.method3452();
		Static438.method5887();
		Static324.method4561();
		if (Static153.aClass174_7 != Static191.aClass174_5) {
			for (@Pc(87) int local87 = 0; local87 < Static334.aByteArrayArray25.length; local87++) {
				Static334.aByteArrayArray25[local87] = null;
			}
			Static170.anInt3035 = 0;
		}
		Static302.method4111();
		Static418.method5656();
		Static54.method830();
		Static298.method4067();
		Static64.method972();
		Static354.aClass151_155.method3298();
		Static447.aClass121_11.method4633();
		Static413.aClass116_3.method2528();
		Static442.method5919();
		Static188.aClass109_52.method2329();
		Static368.aClass109_83.method2329();
		Static225.aClass109_57.method2329();
		Static19.aClass109_4.method2329();
		Static453.aClass109_44.method2329();
		Static162.aClass109_37.method2329();
		Static297.aClass109_69.method2329();
		Static172.aClass109_40.method2329();
		Static353.aClass109_79.method2329();
		Static279.aClass109_97.method2329();
		Static21.aClass109_7.method2329();
		Static21.aClass109_8.method2329();
		Static29.aClass109_14.method2329();
		Static381.aClass109_12.method2329();
		Static360.aClass109_80.method2329();
		Static263.aClass109_61.method2329();
		Static134.aClass109_35.method2329();
		Static221.aClass109_98.method2329();
		Static131.aClass109_31.method2329();
		Static388.aClass109_94.method2329();
		Static200.aClass109_53.method2329();
		Static173.aClass109_42.method2329();
		aClass109_95.method2329();
		Static44.aClass109_20.method2329();
		Static184.aClass109_48.method2329();
		Static222.aClass109_56.method2329();
		Static454.aClass109_100.method2329();
		Static116.aClass109_29.method2329();
		Static140.aClass109_36.method2329();
		Static369.aClass109_84.method2329();
		Static291.aClass151_187.method3298();
		Static111.aClass151_55.method3298();
		Static323.aClass151_139.method3298();
		Static320.aClass151_136.method3298();
	}
}
