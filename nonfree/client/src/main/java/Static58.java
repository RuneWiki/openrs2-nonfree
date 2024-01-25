import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!df", name = "S", descriptor = "I")
	public static int anInt1549;

	@OriginalMember(owner = "client!df", name = "L", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_53 = new Class198(64);

	@OriginalMember(owner = "client!df", name = "W", descriptor = "Z")
	public static boolean aBoolean111 = false;

	@OriginalMember(owner = "client!df", name = "Y", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_7 = new Class116();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIZIIIF)[I")
	public static int[] method1228(@OriginalArg(7) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class4_Sub6_Sub9 local10 = new Class4_Sub6_Sub9();
		local10.anInt1627 = 4;
		local10.anInt1631 = 35;
		local10.aBoolean115 = true;
		local10.anInt1633 = 8;
		local10.anInt1638 = 8;
		local10.anInt1628 = (int) (arg0 * 4096.0F);
		local10.method5700();
		Static265.method4581(2048, 1);
		local10.method1309(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method1229(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local32++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static45.aCharArray3[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V")
	public static void method1230(@OriginalArg(1) int arg0) {
		Static140.aClass198_108 = new Class198(arg0);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
	public static void method1231(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static273.aClass128ArrayArrayArray4 = Static24.aClass128ArrayArrayArray2;
			Static261.aClass60Array2 = Static77.aClass60Array1;
		} else {
			Static273.aClass128ArrayArrayArray4 = Static1.aClass128ArrayArrayArray3;
			Static261.aClass60Array2 = Static304.aClass60Array3;
		}
		Static327.anInt6252 = Static273.aClass128ArrayArrayArray4.length;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	public static void method1233() {
		@Pc(5) Class198 local5 = Static140.aClass198_108;
		synchronized (Static140.aClass198_108) {
			Static140.aClass198_108.method5213();
		}
		local5 = Static349.aClass198_243;
		synchronized (Static349.aClass198_243) {
			Static349.aClass198_243.method5213();
		}
		local5 = Static325.aClass198_228;
		synchronized (Static325.aClass198_228) {
			Static325.aClass198_228.method5213();
		}
		local5 = Static265.aClass198_192;
		synchronized (Static265.aClass198_192) {
			Static265.aClass198_192.method5213();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZIIZI)V")
	public static void method1235(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) Class10_Sub1 local20 = Static77.aClass10_Sub1Array1[local14];
		Static77.aClass10_Sub1Array1[local14] = Static77.aClass10_Sub1Array1[arg2];
		Static77.aClass10_Sub1Array1[arg2] = local20;
		for (@Pc(32) int local32 = arg3; local32 < arg2; local32++) {
			if (Static181.method3489(arg0, arg4, arg5, local20, arg1, Static77.aClass10_Sub1Array1[local32]) <= 0) {
				@Pc(49) Class10_Sub1 local49 = Static77.aClass10_Sub1Array1[local32];
				Static77.aClass10_Sub1Array1[local32] = Static77.aClass10_Sub1Array1[local16];
				Static77.aClass10_Sub1Array1[local16++] = local49;
			}
		}
		Static77.aClass10_Sub1Array1[arg2] = Static77.aClass10_Sub1Array1[local16];
		Static77.aClass10_Sub1Array1[local16] = local20;
		method1235(arg0, arg1, local16 - 1, arg3, arg4, arg5);
		method1235(arg0, arg1, arg2, local16 + 1, arg4, arg5);
	}
}
