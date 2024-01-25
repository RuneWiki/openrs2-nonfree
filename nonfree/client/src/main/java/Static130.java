import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	public static int anInt2247;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	public static int anInt2246 = 2;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
	public static int anInt2250 = -1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZI)Z")
	public static boolean method1779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface9 local11 = (Interface9) Static336.method4293(arg1, arg0, arg2);
		if (local11 != null) {
			local5 = Static361.method4696(local11) & true;
		}
		local11 = (Interface9) Static422.method5254(arg1, arg0, arg2, mq.class);
		if (local11 != null) {
			local5 &= Static361.method4696(local11);
		}
		local11 = (Interface9) Static261.method3366(arg1, arg0, arg2);
		if (local11 != null) {
			local5 &= Static361.method4696(local11);
		}
		return local5;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([BI)[B")
	public static byte[] method1780(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class1_Sub11 local13 = new Class1_Sub11(arg0);
		@Pc(17) int local17 = local13.method4463();
		@Pc(21) int local21 = local13.method4487();
		if (local21 < 0 || Static63.anInt1124 != 0 && local21 > Static63.anInt1124) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(47) byte[] local47 = new byte[local21];
			local13.method4471(local47, local21);
			return local47;
		} else {
			@Pc(59) int local59 = local13.method4487();
			if (local59 < 0 || Static63.anInt1124 != 0 && local59 > Static63.anInt1124) {
				throw new RuntimeException();
			}
			@Pc(79) byte[] local79 = new byte[local59];
			if (local17 == 1) {
				Static294.method3833(local79, local59, arg0, local21);
			} else {
				Static78.aClass261_1.method5567(local13, local79);
			}
			return local79;
		}
	}
}
