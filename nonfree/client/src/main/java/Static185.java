import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!se", name = "hb", descriptor = "Lclient!mj;")
	public static Class64 aClass64_13;

	@OriginalMember(owner = "client!se", name = "U", descriptor = "Lclient!qe;")
	public static Class78 aClass78_737 = Static199.method3560("<br>");

	@OriginalMember(owner = "client!se", name = "V", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array32 = new Class78[100];

	@OriginalMember(owner = "client!se", name = "ib", descriptor = "Z")
	public static boolean aBoolean187 = true;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
	public static void method3420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static6.anInt187 <= arg1 && arg4 <= Static101.anInt2213 && Static73.anInt1576 <= arg0 && Static137.anInt3137 >= arg2) {
			Static158.method2852(arg1, arg3, arg0, arg4, arg2);
		} else {
			Static207.method3656(arg2, arg4, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)[B")
	public static byte[] method3421(@OriginalArg(1) int arg0) {
		@Pc(20) Class2_Sub3_Sub18 local20 = (Class2_Sub3_Sub18) Static21.aClass110_2.method3891((long) arg0);
		if (local20 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(48) int local48 = 0; local48 < 255; local48++) {
				@Pc(55) int local55 = 255 - local48;
				@Pc(60) int local60 = Static8.method184(local31, local55);
				@Pc(64) byte local64 = local25[local60];
				local25[local60] = local25[local55];
				local25[local55] = local25[511 - local48] = local64;
			}
			local20 = new Class2_Sub3_Sub18(local25);
			Static21.aClass110_2.method3894(local20, (long) arg0);
		}
		return local20.aByteArray38;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZIIIIII)V")
	public static void method3423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static80.method1339(arg3)) {
			Static40.aClass64Array1 = null;
			Static131.method2397(Static181.aClass64ArrayArray1[arg3], arg1, arg7, arg2, arg0, arg4, arg6, -1, arg5);
			if (Static40.aClass64Array1 != null) {
				Static131.method2397(Static40.aClass64Array1, arg1, arg7, arg2, Static80.anInt1730, arg4, Static183.anInt4268, -1412584499, arg5);
				Static40.aClass64Array1 = null;
			}
		} else if (arg7 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static165.aBooleanArray111[local19] = true;
			}
		} else {
			Static165.aBooleanArray111[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)I")
	public static int method3424(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(16) int local16 = local4 | local4 >>> 1;
		@Pc(22) int local22 = local16 | local16 >>> 2;
		@Pc(28) int local28 = local22 | local22 >>> 4;
		@Pc(34) int local34 = local28 | local28 >>> 8;
		@Pc(40) int local40 = local34 | local34 >>> 16;
		return local40 + 1;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!oe;Z)V")
	public static void method3425(@OriginalArg(0) Class72 arg0) {
		Static170.anInt3940 = arg0.method3190(Static82.aClass78_396);
	}

	@OriginalMember(owner = "client!se", name = "i", descriptor = "(I)V")
	public static void method3426() {
		if (Static10.aClass36_1 != null) {
			@Pc(11) Class36 local11 = Static10.aClass36_1;
			synchronized (Static10.aClass36_1) {
				Static10.aClass36_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIBII)V")
	public static void method3427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 - arg5 >= Static6.anInt187 && Static101.anInt2213 >= arg0 + arg5 && Static73.anInt1576 <= arg3 - arg5 && arg5 + arg3 <= Static137.anInt3137) {
			Static26.method344(arg1, arg2, arg5, arg0, arg3, arg4);
		} else {
			Static37.method493(arg3, arg0, arg2, arg5, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILclient!oe;B)[Lclient!fe;")
	public static Class2_Sub3_Sub8_Sub1[] method3429(@OriginalArg(0) int arg0, @OriginalArg(2) Class72 arg1) {
		return Static55.method713(arg0, arg1) ? Static123.method2221() : null;
	}
}
