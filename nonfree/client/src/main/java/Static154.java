import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "Lclient!vn;")
	public static Class252 aClass252_1;

	@OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
	public static int anInt3163;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "Z")
	public static boolean aBoolean245 = false;

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_60 = new Class265(6, 2);

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
	public static int anInt3156 = 0;

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
	public static int anInt3161 = -1;

	@OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
	public static int anInt3162 = 0;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZIIIII)V")
	public static void method2539(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
		@Pc(22) Class2_Sub38 local22 = (Class2_Sub38) Static198.aClass163_24.method3769(local14);
		if (local22 == null) {
			local22 = new Class2_Sub38();
			Static198.aClass163_24.method3764(local14, local22);
		}
		if (arg1 >= local22.anIntArray512.length) {
			@Pc(47) int[] local47 = new int[arg1 + 1];
			@Pc(52) int[] local52 = new int[arg1 + 1];
			for (@Pc(54) int local54 = 0; local54 < local22.anIntArray512.length; local54++) {
				local47[local54] = local22.anIntArray512[local54];
				local52[local54] = local22.anIntArray513[local54];
			}
			for (@Pc(84) int local84 = local22.anIntArray512.length; local84 < arg1; local84++) {
				local47[local84] = -1;
				local52[local84] = 0;
			}
			local22.anIntArray513 = local52;
			local22.anIntArray512 = local47;
		}
		local22.anIntArray512[arg1] = arg4;
		local22.anIntArray513[arg1] = arg3;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLclient!em;Lclient!em;)V")
	public static void method2540(@OriginalArg(1) Class68 arg0, @OriginalArg(2) Class68 arg1) {
		Static159.method2586(Static178.aClass54_107);
		Static424.aClass2_Sub23_Sub2_1.method5506(arg0.anInt2229);
		Static424.aClass2_Sub23_Sub2_1.method5507(arg1.anInt2208);
		Static424.aClass2_Sub23_Sub2_1.method5470(arg0.anInt2208);
		Static424.aClass2_Sub23_Sub2_1.method5507(arg0.anInt2215);
		Static424.aClass2_Sub23_Sub2_1.method5470(arg1.anInt2215);
		Static424.aClass2_Sub23_Sub2_1.method5506(arg1.anInt2229);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	public static void method2542() {
		Static354.aClass17_46 = null;
		Static85.anInt2110 = -1;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IB)I")
	public static int method2543(@OriginalArg(0) int arg0) {
		if (Static34.aClass34_2 != null) {
			Static34.aClass34_2.method610();
			Static34.aClass34_2 = null;
		}
		Static444.anInt7234++;
		if (Static444.anInt7234 > 4) {
			Static156.anInt3174 = 0;
			Static444.anInt7234 = 0;
			return arg0;
		}
		if (Static370.anInt6355 == Static420.anInt7047) {
			Static370.anInt6355 = Static188.anInt3651;
		} else {
			Static370.anInt6355 = Static420.anInt7047;
		}
		Static156.anInt3174 = 0;
		return -1;
	}
}
