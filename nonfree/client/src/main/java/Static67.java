import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "[I")
	public static int[] anIntArray143 = new int[100];

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "[I")
	public static int[] anIntArray144 = new int[14];

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString110 = "glow2:";

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!hc;Ljava/lang/String;B)Lclient!wl;")
	public static Class151 method1311(@OriginalArg(0) Class51 arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg0.method1866(arg1);
		if (local6 == -1) {
			return new Class151(0);
		}
		@Pc(24) int[] local24 = arg0.method1865(local6);
		@Pc(30) Class151 local30 = new Class151(local24.length);
		for (@Pc(32) int local32 = 0; local32 < local30.anInt5555; local32++) {
			@Pc(45) Class1_Sub13 local45 = new Class1_Sub13(arg0.method1874(local6, local24[local32]));
			local30.aStringArray39[local32] = local45.method1774();
			local30.aByteArray65[local32] = local45.method1756();
			local30.anIntArray470[local32] = local45.method1802();
			local30.anIntArray471[local32] = local45.method1802();
		}
		return local30;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
	public static int method1314(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)I")
	public static int method1315() {
		return 6;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)V")
	public static void method1316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg1 != Static110.anInt2934) {
			Static175.anIntArray302 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static175.anIntArray302[local13] = (local13 << 12) / arg1;
			}
			Static197.anInt2335 = arg1 * 32;
			Static2.anInt38 = arg1 - 1;
			Static110.anInt2934 = arg1;
		}
		if (arg0 == Static166.anInt3882) {
			return;
		}
		if (arg0 == Static110.anInt2934) {
			Static94.anIntArray321 = Static175.anIntArray302;
		} else {
			Static94.anIntArray321 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static94.anIntArray321[local13] = (local13 << 12) / arg0;
			}
		}
		Static166.anInt3882 = arg0;
		Static42.anInt1193 = arg0 - 1;
	}
}
