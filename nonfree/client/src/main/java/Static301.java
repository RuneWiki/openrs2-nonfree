import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
	public static int anInt5894 = 0;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	public static int anInt5895 = -1;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([[BZLclient!paa;)V")
	public static void method5287(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class49_Sub1 arg1) {
		@Pc(8) int local8 = arg0.length;
		@Pc(29) int local29;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg0[local10];
			if (local16 != null) {
				@Pc(23) Class14_Sub21 local23 = new Class14_Sub21(local16);
				local29 = Static365.anIntArray336[local10] >> 8;
				@Pc(35) int local35 = Static365.anIntArray336[local10] & 0xFF;
				@Pc(42) int local42 = local29 * 64 - Static36.anInt617;
				@Pc(48) int local48 = local35 * 64 - Static550.anInt9242;
				Static599.method8480();
				arg1.method6722(Static550.anInt9242, local23, Static36.anInt617, local48, local42, Static40.aClass289Array1);
				arg1.method6727(local23, local42, Static103.aClass144_3, local48);
			}
		}
		for (@Pc(72) int local72 = 0; local72 < local8; local72++) {
			@Pc(87) int local87 = (Static365.anIntArray336[local72] >> 8) * 64 - Static36.anInt617;
			local29 = (Static365.anIntArray336[local72] & 0xFF) * 64 - Static550.anInt9242;
			@Pc(102) byte[] local102 = arg0[local72];
			if (local102 == null && Static306.anInt6137 < 800) {
				Static599.method8480();
				arg1.method6713(local29, local87);
			}
		}
		if (false) {
			anInt5894 = 123;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZII)I")
	public static int method5308(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > arg2) {
			return arg0;
		} else if (arg2 <= arg1) {
			return arg2;
		} else {
			return arg1;
		}
	}
}
