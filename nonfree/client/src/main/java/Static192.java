import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hfa", name = "Sc", descriptor = "I")
	public static int anInt4179;

	@OriginalMember(owner = "client!hfa", name = "Tc", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13;

	@OriginalMember(owner = "client!hfa", name = "uc", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_47 = new Class61(60, -1);

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)[Lclient!rt;")
	public static Class297[] method3526() {
		return new Class297[] { Static288.aClass297_6, Static61.aClass297_1, Static506.aClass297_11 };
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIJB)V")
	public static void method3529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg2 >> 20 & 0x3;
		@Pc(32) int local32 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static292.method4577(0, true, 0, 0, arg1, arg0, local17, local10);
			return;
		}
		@Pc(48) Class25 local48 = Static553.aClass288_4.method6419(local32);
		@Pc(61) int local61;
		@Pc(58) int local58;
		if (local17 == 0 || local17 == 2) {
			local58 = local48.anInt638;
			local61 = local48.anInt612;
		} else {
			local61 = local48.anInt638;
			local58 = local48.anInt612;
		}
		@Pc(72) int local72 = local48.anInt619;
		if (local17 != 0) {
			local72 = (local72 << local17 & 0xF) + (local72 >> 4 - local17);
		}
		Static292.method4577(local61, true, local72, local58, arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!hfa", name = "g", descriptor = "(B)[Lclient!ff;")
	public static Class104[] method3533() {
		return new Class104[] { Static224.aClass104_2, Static120.aClass104_1, Static380.aClass104_3 };
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIIII)V")
	public static void method3534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= Static68.anInt1306 && Static589.anInt9684 >= arg1 && arg2 >= Static252.anInt4971 && arg4 <= Static359.anInt6232) {
			Static371.method5573(arg2, arg4, arg1, arg3, arg0);
		} else {
			Static280.method4439(arg2, arg1, arg4, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "(II)V")
	public static void method3535(@OriginalArg(0) int arg0) {
		if (Static114.anIntArray244 == null || Static114.anIntArray244.length < arg0) {
			Static114.anIntArray244 = new int[arg0];
		}
	}
}
