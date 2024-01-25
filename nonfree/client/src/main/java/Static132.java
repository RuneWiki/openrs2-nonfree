import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!eq", name = "hb", descriptor = "[Lclient!mb;")
	public static Class2_Sub3[] aClass2_Sub3Array4;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IBLclient!ha;IIIII)V")
	public static void method3074(@OriginalArg(2) Class33 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		Static67.aClass33_5 = arg0;
		Static449.aClass47_8 = Static67.aClass33_5.method6223();
		Static364.aClass47_4 = Static67.aClass33_5.method6223();
		Static269.aClass47_2 = Static67.aClass33_5.method6223();
		Static79.anInt1962 = 2;
		Static470.anInterface16_4 = null;
		Static43.anInt770 = 0;
		Static164.anInt8855 = 0;
		Static246.anInt5504 = arg2;
		Static94.anInt2525 = 2;
		Static584.anInt9762 = arg3;
		Static178.anInt4220 = 1;
		Static207.method4083(arg4, arg1);
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(III)Z")
	public static boolean method3076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method3077(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub1_Sub21 local13 = Static57.method8561(arg1, 3);
		local13.method8631();
		local13.aString114 = arg0;
	}
}
