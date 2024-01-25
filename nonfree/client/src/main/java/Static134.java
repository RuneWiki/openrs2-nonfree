import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "Lclient!sq;")
	public static final Class307 aClass307_4 = new Class307(0, 1);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)[Lclient!iv;")
	public static Class162[] method2658() {
		return new Class162[] { Static247.aClass162_12, Static278.aClass162_15, Static364.aClass162_19, Static212.aClass162_10, Static270.aClass162_13, Static12.aClass162_2, Static123.aClass162_8, Static220.aClass162_11, Static296.aClass162_17, Static153.aClass162_9, Static240.aClass162_28, Static274.aClass162_14, Static504.aClass162_27, Static540.aClass162_16, Static3.aClass162_1 };
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBIII)V")
	public static void method2659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg1 > arg2) {
			for (local10 = arg2; local10 < arg1; local10++) {
				Static46.anIntArrayArray4[local10][arg0] = arg3;
			}
		} else {
			for (local10 = arg1; local10 < arg2; local10++) {
				Static46.anIntArrayArray4[local10][arg0] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)Lclient!ke;")
	public static Class1_Sub6 method2660() {
		@Pc(17) Class1_Sub6 local17 = (Class1_Sub6) Static108.aClass136_2.method3292();
		if (local17 == null) {
			return new Class1_Sub6();
		} else {
			Static538.anInt8762--;
			return local17;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)V")
	public static void method2662(@OriginalArg(0) int arg0) {
		@Pc(17) Class4_Sub5_Sub16 local17 = Static219.method3587(arg0, 7);
		local17.method7134();
	}
}
