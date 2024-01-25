import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "Lclient!tj;")
	public static Class328 aClass328_6;

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!pea", name = "l", descriptor = "Lclient!fg;")
	public static Class98 aClass98_26;

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "I")
	public static int anInt7824 = 0;

	@OriginalMember(owner = "client!pea", name = "n", descriptor = "[I")
	public static final int[] anIntArray480 = new int[3];

	@OriginalMember(owner = "client!pea", name = "o", descriptor = "[B")
	public static final byte[] aByteArray89 = new byte[2048];

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILclient!og;IIIIIIILclient!ega;II)V")
	public static void method6734(@OriginalArg(0) int arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class79 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static384.anInt7275 = arg7;
		Static210.anInt4131 = arg10;
		Static242.aClass79_12 = arg8;
		Static602.anInt10027 = arg5;
		Static145.anInt2728 = arg6;
		Static247.anInt4938 = arg4;
		Static295.anInt5793 = arg0;
		Static446.anInt8019 = arg9;
		aClass98_26 = null;
		Static347.anInt6541 = arg2;
		Static176.aClass98_35 = null;
		Static242.aClass238_7 = arg1;
		Static639.aClass98_34 = null;
		Static289.anInt5726 = arg3;
		Static385.method6201();
		Static531.aBoolean616 = true;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILclient!ge;IILjava/awt/Component;)Lclient!vn;")
	public static Class190 method6735(@OriginalArg(0) int arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3) {
		if (Static78.anInt1661 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(32) Class190 local32 = (Class190) Class.forName("Class190_Sub1").getDeclaredConstructor().newInstance();
			local32.anIntArray540 = new int[(Static339.aBoolean677 ? 2 : 1) * 256];
			local32.anInt8716 = arg2;
			local32.method7497(arg3);
			local32.anInt8726 = (arg2 & 0xFFFFFC00) + 1024;
			if (local32.anInt8726 > 16384) {
				local32.anInt8726 = 16384;
			}
			local32.method7492(local32.anInt8726);
			if (Static360.anInt6666 > 0 && Static394.aClass176_1 == null) {
				Static394.aClass176_1 = new Class176();
				Static394.aClass176_1.aClass112_3 = arg1;
				arg1.method3237(Static394.aClass176_1, Static360.anInt6666);
			}
			if (Static394.aClass176_1 != null) {
				if (Static394.aClass176_1.aClass190Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static394.aClass176_1.aClass190Array1[arg0] = local32;
			}
			return local32;
		} catch (@Pc(118) Throwable local118) {
			try {
				@Pc(124) Class190_Sub2 local124 = new Class190_Sub2(arg1, arg0);
				local124.anInt8716 = arg2;
				local124.anIntArray540 = new int[(Static339.aBoolean677 ? 2 : 1) * 256];
				local124.method7497(arg3);
				local124.anInt8726 = 16384;
				local124.method7492(local124.anInt8726);
				if (Static360.anInt6666 > 0 && Static394.aClass176_1 == null) {
					Static394.aClass176_1 = new Class176();
					Static394.aClass176_1.aClass112_3 = arg1;
					arg1.method3237(Static394.aClass176_1, Static360.anInt6666);
				}
				if (Static394.aClass176_1 != null) {
					if (Static394.aClass176_1.aClass190Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static394.aClass176_1.aClass190Array1[arg0] = local124;
				}
				return local124;
			} catch (@Pc(183) Throwable local183) {
				return new Class190();
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILclient!rg;)Lclient!mm;")
	public static Class167_Sub1 method6737(@OriginalArg(1) Class6_Sub40 arg0) {
		@Pc(12) Class167 local12 = Static323.method5376(arg0);
		@Pc(16) int local16 = arg0.method8577();
		return new Class167_Sub1(local12.anInt6590, local12.aClass238_11, local12.aClass79_16, local12.anInt6595, local12.anInt6589, local16);
	}
}
