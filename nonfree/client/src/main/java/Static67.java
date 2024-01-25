import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!mi;")
	public static Class46 aClass46_9;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	public static final int anInt2176 = 50;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "[I")
	public static final int[] anIntArray91 = new int[anInt2176];

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "[I")
	public static final int[] anIntArray92 = new int[anInt2176];

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
	public static final int[] anIntArray93 = new int[anInt2176];

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	public static int anInt2178 = 0;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "[I")
	public static final int[] anIntArray94 = new int[anInt2176];

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[anInt2176];

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "[I")
	public static final int[] anIntArray95 = new int[anInt2176];

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "[I")
	public static final int[] anIntArray96 = new int[anInt2176];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IJII)V")
	public static void method2075(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		@Pc(17) int local17 = (int) arg1 >> 14 & 0x1F;
		@Pc(24) int local24 = (int) arg1 >> 20 & 0x3;
		@Pc(31) int local31 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local17 != 10 && local17 != 11 && local17 != 22) {
			Static624.method9086(true, arg2, arg0, 0, 0, 0, local17, local24);
			return;
		}
		@Pc(59) Class161 local59 = Static27.aClass342_3.method8534(local31);
		@Pc(75) int local75;
		@Pc(72) int local72;
		if (local24 == 0 || local24 == 2) {
			local72 = local59.anInt5389;
			local75 = local59.anInt5411;
		} else {
			local72 = local59.anInt5411;
			local75 = local59.anInt5389;
		}
		@Pc(86) int local86 = local59.anInt5383;
		if (local24 != 0) {
			local86 = (local86 << local24 & 0xF) + (local86 >> 4 - local24);
		}
		Static624.method9086(true, arg2, arg0, local72, local86, local75, 0, 0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)Z")
	public static boolean method2076(@OriginalArg(1) int arg0) {
		return arg0 == 15 || arg0 == 2 || arg0 == 30 || arg0 == 49 || arg0 == 51 || arg0 == 50 || arg0 == 6;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2077(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static653.method7723(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(BI)V")
	public static void method2079(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg0, 16);
		local8.method3093();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!uh;ILclient!ha;)V")
	public static void method2080(@OriginalArg(2) Class341 arg0, @OriginalArg(4) Class20 arg1) {
		Static612.aClass341_69.method8525();
		if (Static40.aBoolean112) {
			return;
		}
		for (@Pc(16) Class2_Sub32 local16 = (Class2_Sub32) arg0.method8524(); local16 != null; local16 = (Class2_Sub32) arg0.method8519()) {
			@Pc(24) Class153 local24 = Static303.aClass248_2.method6584(local16.anInt6568);
			if (Static273.method5008(local24)) {
				@Pc(36) boolean local36 = Static52.method1771(local24, local16, arg1);
				if (local36) {
					Static271.method9050(local16, arg1, local24);
				}
			}
		}
	}
}
