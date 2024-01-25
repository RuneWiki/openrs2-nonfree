import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray63;

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "Lclient!oh;")
	public static Class237 aClass237_44;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	public static int anInt3823 = -2;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
	public static int anInt3831 = 0;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
	public static int anInt3832 = 0;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(IB)I")
	public static int method3096(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)I")
	public static int method3098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static34.aClass86Array5 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 9;
		@Pc(15) int local15 = arg0 >> 9;
		if (local11 < 0 || local15 < 0 || local11 > Static372.anInt7082 - 1 || local15 > Static218.anInt5023 - 1) {
			return 0;
		}
		@Pc(45) int local45 = arg2;
		if (arg2 < 3 && (Static118.aByteArrayArrayArray20[1][local11][local15] & 0x2) != 0) {
			local45 = arg2 + 1;
		}
		return Static34.aClass86Array5[local45].method8088(arg0, arg1);
	}
}
