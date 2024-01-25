import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Z")
	public static boolean aBoolean614 = true;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "I")
	public static int anInt6320 = 0;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_59 = new Class87(4);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I")
	public static int method5340(@OriginalArg(1) int arg0) {
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
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)I")
	public static int method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(6) int local6 = arg5;
			arg5 = arg2;
			arg2 = local6;
		}
		@Pc(14) int local14 = arg3 & 0x3;
		if (local14 == 0) {
			return arg0;
		} else if (local14 == 1) {
			return arg4;
		} else if (local14 == 2) {
			return 1 + 7 - arg5 - arg0;
		} else {
			return 7 + 1 - arg4 - arg2;
		}
	}
}
