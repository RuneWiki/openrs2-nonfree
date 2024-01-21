import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "B")
	public static byte aByte8;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	public static int anInt4068;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
	public static int anInt4069;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1595 = Static120.method1824("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1594 = aClass80_1595;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!pg;)V")
	public static void method2908(@OriginalArg(1) Class3_Sub4 arg0) {
		if (arg0.aClass3_Sub19_5 != null) {
			arg0.aClass3_Sub19_5.anInt2748 = 0;
		}
		arg0.aBoolean112 = false;
		for (@Pc(18) Class3_Sub4 local18 = arg0.method1976(); local18 != null; local18 = arg0.method1973()) {
			method2908(local18);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!qf;BILclient!sa;II)V")
	public static void method2910(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub4_Sub4 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == null) {
			return;
		}
		@Pc(12) int local12 = Static126.anInt2707 + Static126.anInt2704 & 0x7FF;
		@Pc(20) int local20 = arg0 * arg0 + arg5 * arg5;
		@Pc(32) int local32 = Math.max(arg1.anInt3251 / 2, arg1.anInt3221 / 2) + 10;
		if (local32 * local32 < local20) {
			return;
		}
		@Pc(55) int local55 = Class3_Sub1_Sub4_Sub2.anIntArray188[local12];
		@Pc(63) int local63 = local55 * 256 / (Static148.anInt3314 + 256);
		@Pc(67) int local67 = Class3_Sub1_Sub4_Sub2.anIntArray190[local12];
		@Pc(75) int local75 = local67 * 256 / (Static148.anInt3314 + 256);
		@Pc(85) int local85 = local63 * arg5 + local75 * arg0 >> 16;
		@Pc(96) int local96 = arg5 * local75 - local63 * arg0 >> 16;
		arg3.method2600(local85 + arg1.anInt3251 / 2 + arg4 - arg3.anInt3603 / 2, -(arg3.anInt3598 / 2) + arg2 + arg1.anInt3221 / 2 + -local96, arg1.anIntArray412, arg1.anIntArray415);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!qf;B)Z")
	public static boolean method2911(@OriginalArg(0) Class77 arg0) {
		@Pc(2) int local2 = arg0.anInt3256;
		if (local2 == 205) {
			Static57.anInt1252 = 250;
			return true;
		}
		@Pc(38) int local38;
		@Pc(32) int local32;
		if (local2 >= 300 && local2 <= 313) {
			local32 = local2 & 0x1;
			local38 = (local2 - 300) / 2;
			Static171.aClass55_1.method1535(local32 == 1, local38);
		}
		if (local2 >= 314 && local2 <= 323) {
			local38 = (local2 - 314) / 2;
			local32 = local2 & 0x1;
			Static171.aClass55_1.method1531(local38, local32 == 1);
		}
		if (local2 == 324) {
			Static171.aClass55_1.method1525(false);
		}
		if (local2 == 325) {
			Static171.aClass55_1.method1525(true);
		}
		if (local2 == 326) {
			Static146.aClass3_Sub17_Sub1_3.method2146(109);
			Static171.aClass55_1.method1527(Static146.aClass3_Sub17_Sub1_3);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!bc;ILclient!bc;)I")
	public static int method2912(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method43(Static19.anInt469)) {
			local5++;
		}
		if (arg0.method43(Static181.anInt4058)) {
			local5++;
		}
		if (arg0.method43(Static192.anInt4405)) {
			local5++;
		}
		if (arg0.method43(Static158.anInt3508)) {
			local5++;
		}
		if (arg0.method43(Static153.anInt686)) {
			local5++;
		}
		if (arg0.method43(Static57.anInt1247)) {
			local5++;
		}
		arg0.method43(Static60.anInt1327);
		arg0.method43(Static157.anInt3501);
		arg0.method43(Static78.anInt1724);
		arg0.method43(Static184.anInt4148);
		arg0.method43(Static152.anInt3409);
		return local5;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[Lclient!rd;[SII)V")
	public static void method2913(@OriginalArg(0) int arg0, @OriginalArg(1) Class80[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(17) int local17 = arg0;
		@Pc(23) int local23 = (arg3 + arg0) / 2;
		@Pc(27) Class80 local27 = arg1[local23];
		arg1[local23] = arg1[arg3];
		arg1[arg3] = local27;
		@Pc(41) short local41 = arg2[local23];
		arg2[local23] = arg2[arg3];
		arg2[arg3] = local41;
		for (@Pc(53) int local53 = arg0; local53 < arg3; local53++) {
			if (local27 == null || arg1[local53] != null && arg1[local53].method2442(local27) < (local53 & 0x1)) {
				@Pc(81) Class80 local81 = arg1[local53];
				arg1[local53] = arg1[local17];
				arg1[local17] = local81;
				@Pc(95) short local95 = arg2[local53];
				arg2[local53] = arg2[local17];
				arg2[local17++] = local95;
			}
		}
		arg1[arg3] = arg1[local17];
		arg1[local17] = local27;
		arg2[arg3] = arg2[local17];
		arg2[local17] = local41;
		method2913(arg0, arg1, arg2, local17 - 1);
		method2913(local17 + 1, arg1, arg2, arg3);
	}
}
