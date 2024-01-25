import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!jca", name = "t", descriptor = "Lclient!pe;")
	public static Class246 aClass246_4;

	@OriginalMember(owner = "client!jca", name = "x", descriptor = "F")
	public static float aFloat119;

	@OriginalMember(owner = "client!jca", name = "z", descriptor = "I")
	public static int anInt5412;

	@OriginalMember(owner = "client!jca", name = "o", descriptor = "Ljava/util/Random;")
	public static final Random aRandom3 = new Random();

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIII)I")
	public static int method4629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg1;
			arg1 = arg3;
			arg3 = local12;
		}
		@Pc(25) int local25 = arg5 & 0x3;
		if (local25 == 0) {
			return arg2;
		} else if (local25 == 1) {
			return 1 + 7 - arg1 - arg4;
		} else if (local25 == 2) {
			return 1 + 7 - arg3 - arg2;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIB)Z")
	public static boolean method4633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static103.method2158(arg1, arg0) & Static436.method6661(arg1, arg0);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "()V")
	public static void method4635() {
		for (@Pc(1) int local1 = 0; local1 < Static209.anInt4411; local1++) {
			@Pc(6) Class11_Sub1 local6 = Static374.aClass11_Sub1Array1[local1];
			Static476.method7284(local6);
			Static374.aClass11_Sub1Array1[local1] = null;
		}
		Static209.anInt4411 = 0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method4637(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIII)I")
	public static int method4639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}
}
