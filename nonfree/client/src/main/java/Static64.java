import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Z")
	public static boolean aBoolean41;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "I")
	public static int anInt987;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "[[[Lclient!ad;")
	public static Class4[][][] aClass4ArrayArrayArray2 = new Class4[4][104][104];

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[S")
	public static short[] aShortArray10 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!h", name = "H", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_3 = new CRC32();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method766() {
		for (@Pc(21) Class1_Sub11 local21 = (Class1_Sub11) Static14.aClass4_1.method174(); local21 != null; local21 = (Class1_Sub11) Static14.aClass4_1.method181()) {
			if (local21.anInt1932 == -1) {
				local21.anInt1939 = 0;
				Static133.method2571(local21);
			} else {
				local21.method3499();
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Z")
	public static boolean method771(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIBIIILclient!ig;)V")
	public static void method773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class39 arg6) {
		if (Static94.aBoolean109) {
			Static142.anInt3765 = 32;
		} else {
			Static142.anInt3765 = 0;
		}
		Static94.aBoolean109 = false;
		@Pc(133) int local133;
		if (Static109.anInt3064 != 0) {
			if (arg0 >= arg4 && arg4 + 16 > arg0 && arg1 >= arg5 && arg5 + 16 > arg1) {
				arg6.anInt2341 -= 4;
				Static171.method3407(arg6);
			} else if (arg0 >= arg4 && arg4 + 16 > arg0 && arg1 >= arg5 + arg3 - 16 && arg5 + arg3 > arg1) {
				arg6.anInt2341 += 4;
				Static171.method3407(arg6);
			} else if (arg4 - Static142.anInt3765 <= arg0 && arg0 < Static142.anInt3765 + arg4 + 16 && arg5 + 16 <= arg1 && arg5 + arg3 - 16 > arg1) {
				@Pc(115) int local115 = (arg3 - 32) * arg3 / arg2;
				if (local115 < 8) {
					local115 = 8;
				}
				local133 = arg1 - local115 / 2 - arg5 - 16;
				@Pc(140) int local140 = arg3 - local115 - 32;
				arg6.anInt2341 = (arg2 - arg3) * local133 / local140;
				Static171.method3407(arg6);
				Static94.aBoolean109 = true;
			}
		}
		if (Static78.anInt2425 == 0) {
			return;
		}
		local133 = arg6.anInt2340;
		if (arg4 - local133 <= arg0 && arg1 >= arg5 && arg4 + 16 > arg0 && arg5 + arg3 >= arg1) {
			arg6.anInt2341 += Static78.anInt2425 * 45;
			Static171.method3407(arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	public static void method778() {
		aClass4ArrayArrayArray2 = null;
		aCRC32_3 = null;
		aShortArray10 = null;
	}
}
