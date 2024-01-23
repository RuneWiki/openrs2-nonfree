import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ni", name = "W", descriptor = "Lclient!me;")
	public static Class66 aClass66_3;

	@OriginalMember(owner = "client!ni", name = "ab", descriptor = "I")
	public static int anInt2931;

	@OriginalMember(owner = "client!ni", name = "db", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1014 = Static200.method3116("glow2:");

	@OriginalMember(owner = "client!ni", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1010 = aClass60_1014;

	@OriginalMember(owner = "client!ni", name = "X", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1011 = Static200.method3116("Allocating memory");

	@OriginalMember(owner = "client!ni", name = "Y", descriptor = "I")
	public static int anInt2929 = -1;

	@OriginalMember(owner = "client!ni", name = "Z", descriptor = "I")
	public static int anInt2930 = 0;

	@OriginalMember(owner = "client!ni", name = "bb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1012 = Static200.method3116("::noclip");

	@OriginalMember(owner = "client!ni", name = "cb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1013 = Static200.method3116("hint_mapedge");

	@OriginalMember(owner = "client!ni", name = "eb", descriptor = "I")
	public static int anInt2932 = -1;

	@OriginalMember(owner = "client!ni", name = "gb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1015 = aClass60_1014;

	@OriginalMember(owner = "client!ni", name = "hb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1016 = aClass60_1011;

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(III)V")
	public static void method2252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass78_1 = null;
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(BJ)Lclient!kh;")
	public static Class60 method2254(@OriginalArg(1) long arg0) {
		return Static155.method2627(arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBILclient!kh;Lclient!kh;Lclient!kh;)V")
	public static void method2255(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60 arg2, @OriginalArg(4) Class60 arg3, @OriginalArg(5) Class60 arg4) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static87.anIntArray238[local3] = Static87.anIntArray238[local3 - 1];
			Static205.aClass60Array30[local3] = Static205.aClass60Array30[local3 - 1];
			Static5.aClass60Array1[local3] = Static5.aClass60Array1[local3 - 1];
			Static97.aClass60Array14[local3] = Static97.aClass60Array14[local3 - 1];
			Static82.anIntArray229[local3] = Static82.anIntArray229[local3 - 1];
		}
		Static205.aClass60Array30[0] = arg2;
		Static87.anIntArray238[0] = arg1;
		Static128.anInt2811++;
		Static5.aClass60Array1[0] = arg4;
		Static204.anInt4328 = Static171.anInt3707;
		Static97.aClass60Array14[0] = arg3;
		Static82.anIntArray229[0] = arg0;
	}
}
