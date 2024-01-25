import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!he", name = "M", descriptor = "I")
	public static int anInt2486;

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
	public static int anInt2499;

	@OriginalMember(owner = "client!he", name = "U", descriptor = "Lclient!m;")
	public static final Class127 aClass127_12 = new Class127();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z")
	public static boolean method2027(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static160.aByteArrayArrayArray9[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(B)V")
	public static void method2028() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static80.aBooleanArray7[local3] = false;
		}
		Static352.anInt6828 = Static154.anInt6368;
		Static293.anInt6248 = Static175.anInt3631;
		Static114.anInt2403 = Static110.anInt2324;
		Static119.anInt2573 = 0;
		Static261.anInt5200 = 5;
		Static267.anInt5386 = Static210.anInt4317;
		Static104.anInt2186 = -1;
		Static296.anInt5891 = Static51.anInt1101;
		Static335.anInt6512 = 0;
		Static147.anInt2903 = -1;
		Static297.anInt5913 = Static350.anInt6797;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIB)Lclient!jr;")
	public static Class3_Sub7_Sub11 method2029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(28) Class3_Sub7_Sub11 local28 = (Class3_Sub7_Sub11) Static134.aClass24_19.method609((long) arg0 | (long) arg1 << 32);
		if (local28 == null) {
			local28 = new Class3_Sub7_Sub11(arg1, arg0);
			Static134.aClass24_19.method598(local28.aLong211, local28);
		}
		return local28;
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(B)V")
	public static void method2030() {
		Static60.aClass198_16.method5236();
		Static4.aClass198_3.method5236();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIILclient!sj;IILclient!sf;I)V")
	public static void method2031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class181 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class74 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg0 * arg0 + arg7 * arg7;
		if (arg2 < local11) {
			return;
		}
		@Pc(31) int local31 = Math.min(arg3.anInt5704 / 2, arg3.anInt5721 / 2);
		if (local31 * local31 >= local11) {
			Static47.method811(arg3, arg4, arg5, Static82.aClass57Array4[arg1], arg7, arg0, arg6);
			return;
		}
		local31 -= 10;
		@Pc(47) int local47;
		if (Static261.anInt5200 == 4) {
			local47 = (int) Static57.aFloat3 & 0x3FFF;
		} else {
			local47 = Static42.anInt892 + (int) Static57.aFloat3 & 0x3FFF;
		}
		@Pc(60) int local60 = Class19.anIntArray20[local47];
		@Pc(64) int local64 = Class19.anIntArray21[local47];
		if (Static261.anInt5200 != 4) {
			local64 = local64 * 256 / (Static12.anInt309 + 256);
			local60 = local60 * 256 / (Static12.anInt309 + 256);
		}
		@Pc(95) int local95 = local64 * arg0 + local60 * arg7 >> 15;
		@Pc(105) int local105 = local64 * arg7 - arg0 * local60 >> 15;
		@Pc(111) double local111 = Math.atan2((double) local95, (double) local105);
		@Pc(118) int local118 = (int) (Math.sin(local111) * (double) local31);
		@Pc(125) int local125 = (int) (Math.cos(local111) * (double) local31);
		Static257.aClass57Array17[arg1].method5435((float) local118 + (float) arg3.anInt5704 / 2.0F + (float) arg5, (float) -local125 + (float) arg4 + (float) arg3.anInt5721 / 2.0F, 4096, (int) (-local111 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ir;I)V")
	public static void method2032(@OriginalArg(0) Class100 arg0) {
		Static273.aClass100_109 = arg0;
	}
}
