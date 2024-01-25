import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Lclient!am;")
	public static Class11 aClass11_142;

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "Z")
	public static boolean aBoolean551;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString236 = "Connection lost.";

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
	public static int anInt6296 = 0;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_98 = new Class154(64);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!vm;ILclient!am;)V")
	public static void method5266(@OriginalArg(0) Class92 arg0, @OriginalArg(2) Class11 arg1) {
		@Pc(10) Class206[] local10 = Static367.method5454(arg1, Static215.anInt4508);
		Static242.aClass60Array14 = new Class60[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static242.aClass60Array14[local16] = arg0.method4506(local10[local16]);
		}
		local10 = Static367.method5454(arg1, Static272.anInt5589);
		Static310.aClass60Array17 = new Class60[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static310.aClass60Array17[local43] = arg0.method4506(local10[local43]);
		}
		local10 = Static367.method5454(arg1, Static106.anInt2366);
		Static118.aClass60Array6 = new Class60[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static118.aClass60Array6[local74] = arg0.method4506(local10[local74]);
		}
		local10 = Static367.method5454(arg1, Static40.anInt913);
		Static216.aClass60Array18 = new Class60[local10.length];
		for (@Pc(101) int local101 = 0; local101 < local10.length; local101++) {
			Static216.aClass60Array18[local101] = arg0.method4506(local10[local101]);
		}
		local10 = Static367.method5454(arg1, Static210.anInt5563);
		Static19.aClass60Array19 = new Class60[local10.length];
		for (@Pc(132) int local132 = 0; local132 < local10.length; local132++) {
			Static19.aClass60Array19[local132] = arg0.method4506(local10[local132]);
		}
		local10 = Static367.method5454(arg1, Static311.anInt6245);
		Static220.aClass60Array10 = new Class60[local10.length];
		for (@Pc(163) int local163 = 0; local163 < local10.length; local163++) {
			Static220.aClass60Array10[local163] = arg0.method4506(local10[local163]);
		}
		local10 = Static367.method5454(arg1, Static316.anInt5504);
		Static108.aClass60Array5 = new Class60[local10.length];
		for (@Pc(202) int local202 = 0; local202 < local10.length; local202++) {
			Static108.aClass60Array5[local202] = arg0.method4506(local10[local202]);
		}
		local10 = Static367.method5454(arg1, Static193.anInt4170);
		Static234.aClass60Array13 = new Class60[local10.length];
		for (@Pc(233) int local233 = 0; local233 < local10.length; local233++) {
			Static234.aClass60Array13[local233] = arg0.method4506(local10[local233]);
		}
		local10 = Static367.method5454(arg1, Static345.anInt6744);
		Static67.aClass60Array4 = new Class60[local10.length];
		for (@Pc(260) int local260 = 0; local260 < local10.length; local260++) {
			Static67.aClass60Array4[local260] = arg0.method4506(local10[local260]);
		}
		local10 = Static367.method5454(arg1, Static354.anInt4900);
		Static27.aClass60Array2 = new Class60[local10.length];
		for (@Pc(287) int local287 = 0; local287 < local10.length; local287++) {
			Static27.aClass60Array2[local287] = arg0.method4506(local10[local287]);
		}
		local10 = Static367.method5454(arg1, Static90.anInt2011);
		Static54.aClass60Array3 = new Class60[local10.length];
		for (@Pc(314) int local314 = 0; local314 < local10.length; local314++) {
			Static54.aClass60Array3[local314] = arg0.method4506(local10[local314]);
		}
		local10 = Static367.method5454(arg1, Static307.anInt3769);
		Static164.aClass60Array7 = new Class60[local10.length];
		for (@Pc(341) int local341 = 0; local341 < local10.length; local341++) {
			Static164.aClass60Array7[local341] = arg0.method4506(local10[local341]);
		}
		local10 = Static367.method5454(arg1, Static204.anInt4308);
		Static244.aClass60Array15 = new Class60[local10.length];
		for (@Pc(368) int local368 = 0; local368 < local10.length; local368++) {
			Static244.aClass60Array15[local368] = arg0.method4506(local10[local368]);
		}
		Static48.aClass60_3 = arg0.method4506(Static367.method5452(arg1, Static98.anInt6646, 0));
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V")
	public static void method5269() {
		if (Static258.anIntArray442 != null && Static238.anIntArray411 != null) {
			return;
		}
		Static258.anIntArray442 = new int[256];
		Static238.anIntArray411 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static258.anIntArray442[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static238.anIntArray411[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}
}
