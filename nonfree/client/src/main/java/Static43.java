import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!gf", name = "P", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!gf", name = "cb", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!gf", name = "X", descriptor = "Lclient!qc;")
	public static Class60 aClass60_450 = Static121.method2047("Clientscript error in: ");

	@OriginalMember(owner = "client!gf", name = "wb", descriptor = "I")
	public static int anInt1096 = 0;

	@OriginalMember(owner = "client!gf", name = "Fb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_452 = Static121.method2047("compass");

	@OriginalMember(owner = "client!gf", name = "Kb", descriptor = "I")
	public static int anInt1107 = 0;

	@OriginalMember(owner = "client!gf", name = "Mb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_453 = Static121.method2047("<br>(X");

	@OriginalMember(owner = "client!gf", name = "Ob", descriptor = "I")
	public static int anInt1110 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIZIIII)V")
	public static void method721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static27.method520(arg0)) {
			Static128.aClass4_Sub17Array4 = null;
			Static24.method474(-1, arg2, arg4, arg5, Static82.aClass4_Sub17ArrayArray1[arg0], arg3, arg7, arg1, arg6);
			if (Static128.aClass4_Sub17Array4 != null) {
				Static24.method474(-1412584499, arg2, arg4, arg5, Static128.aClass4_Sub17Array4, arg3, Static58.anInt1443, Static83.anInt1978, arg6);
				Static128.aClass4_Sub17Array4 = null;
			}
		} else if (arg3 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static69.aBooleanArray8[local15] = true;
			}
		} else {
			Static69.aBooleanArray8[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([BIILclient!oa;)V")
	public static void method724(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class54 arg2) {
		@Pc(11) Class4_Sub6 local11 = new Class4_Sub6();
		local11.aByteArray27 = arg0;
		local11.aClass54_1 = arg2;
		local11.anInt669 = 0;
		local11.aLong100 = arg1;
		@Pc(26) Class70 local26 = Static60.aClass70_16;
		synchronized (Static60.aClass70_16) {
			Static60.aClass70_16.method1931(local11);
		}
		Static1.method2();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Lclient!qc;")
	public static Class60 method726(@OriginalArg(1) int arg0) {
		return Static9.aClass60Array2[arg0].method1644() <= 0 ? Static112.aClass60Array24[arg0] : Static125.method2072(new Class60[] { Static112.aClass60Array24[arg0], Static116.aClass60_1114, Static9.aClass60Array2[arg0] });
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public static void method730() {
		aClass60_453 = null;
		aClass60_452 = null;
		aFont1 = null;
		anIntArray92 = null;
		aClass60_450 = null;
	}
}
