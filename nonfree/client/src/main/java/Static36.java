import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!di", name = "c", descriptor = "[Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3[] aClass1_Sub2_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "I")
	public static int anInt973 = 0;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_342 = Static120.method2057("blinken2:");

	@OriginalMember(owner = "client!di", name = "i", descriptor = "Lclient!tg;")
	public static Class81 aClass81_343 = Static120.method2057("title)3jpg");

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)I")
	public static int method741(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local14 << 13 ^ local14;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
	public static void method742() {
		aClass81_342 = null;
		aByteArrayArray1 = null;
		aClass1_Sub2_Sub2_Sub3Array3 = null;
		aClass81_343 = null;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)[Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4[] method743() {
		@Pc(6) Class1_Sub2_Sub2_Sub4[] local6 = new Class1_Sub2_Sub2_Sub4[Static43.anInt1081];
		for (@Pc(8) int local8 = 0; local8 < Static43.anInt1081; local8++) {
			@Pc(17) Class1_Sub2_Sub2_Sub4 local17 = new Class1_Sub2_Sub2_Sub4();
			local17.anInt3359 = Static23.anInt582;
			local17.anInt3360 = Static97.anInt2130;
			local17.anInt3362 = Static155.anIntArray369[local8];
			local17.anInt3363 = Static25.anIntArray37[local8];
			local17.anInt3358 = Static73.anIntArray155[local8];
			local17.anInt3361 = Static161.anIntArray386[local8];
			local17.anIntArray356 = Static73.anIntArray156;
			local17.aByteArray24 = Static178.aByteArrayArray10[local8];
			local6[local8] = local17;
		}
		Static176.method3057();
		return local6;
	}
}
