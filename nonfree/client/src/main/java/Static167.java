import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "[I")
	public static int[] anIntArray364;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	public static int anInt3694 = 64;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;Lclient!oe;I)I")
	public static int method3039(@OriginalArg(0) String arg0, @OriginalArg(1) Class2_Sub16 arg1) {
		@Pc(2) int local2 = arg1.anInt2789;
		@Pc(10) byte[] local10 = Static264.method4157(arg0);
		arg1.method2163(local10.length);
		arg1.anInt2789 += Static173.aClass159_1.method4048(local10.length, arg1.aByteArray17, 0, arg1.anInt2789, local10);
		return arg1.anInt2789 - local2;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZBLjava/lang/String;I)I")
	public static int method3041(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(49) char local49 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local49 == '-') {
					local28 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local49 >= '0' && local49 <= '9') {
				local76 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local76 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local76 = local49 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local76) {
				throw new NumberFormatException();
			}
			if (local28) {
				local76 = -local76;
			}
			@Pc(125) int local125 = local32 * arg1 + local76;
			if (local32 != local125 / arg1) {
				throw new NumberFormatException();
			}
			local30 = true;
			local32 = local125;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local32;
	}
}
