import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "Lclient!fs;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "[I")
	public static int[] anIntArray291;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "Lclient!sm;")
	public static final Class210 aClass210_20 = new Class210();

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
	public static int anInt2573 = 0;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "S")
	public static short aShort22 = 32767;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBI)I")
	public static int method2405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg2 >> 1) + ((arg1 & 0xFF) >> 2 << 10) + (arg0 >> 5 << 7);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V")
	public static void method2406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 * Static193.anInt6666 >> 8;
		if (arg0 == -1 && !Static327.aBoolean445) {
			Static277.method2507();
		} else if (arg0 != -1 && (Static4.anInt147 != arg0 || !Static67.method1242()) && local9 != 0 && !Static327.aBoolean445) {
			Static206.method3522(local9, Static161.aClass71_37, arg0);
		}
		Static4.anInt147 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Z")
	public static boolean method2407(@OriginalArg(1) int arg0) {
		if (Static136.aBooleanArray55[arg0]) {
			return true;
		} else if (Static265.aClass71_63.method1570(arg0)) {
			@Pc(23) int local23 = Static265.aClass71_63.method1580(arg0);
			if (local23 == 0) {
				Static136.aBooleanArray55[arg0] = true;
				return true;
			}
			if (Static228.aClass155ArrayArray1[arg0] == null) {
				Static228.aClass155ArrayArray1[arg0] = new Class155[local23];
			}
			for (@Pc(50) int local50 = 0; local50 < local23; local50++) {
				if (Static228.aClass155ArrayArray1[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static265.aClass71_63.method1555(arg0, local50);
					if (local64 != null) {
						@Pc(76) Class155 local76 = Static228.aClass155ArrayArray1[arg0][local50] = new Class155();
						local76.anInt4166 = (arg0 << 16) + local50;
						if (local64[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local76.method3772(new Class2_Sub13(local64));
					}
				}
			}
			Static136.aBooleanArray55[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
