import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
	public static int anInt1478;

	@OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
	public static int anInt1479;

	@OriginalMember(owner = "client!cg", name = "H", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!cg", name = "J", descriptor = "Lclient!jr;")
	public static final Class155 aClass155_1 = new Class155("", 17);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)I")
	public static int method1511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static81.anIntArray124[arg1 & 0x3] : Static504.anIntArray774[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!dn;Lclient!dn;I)I")
	public static int method1513(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method1896(Static447.anInt7829)) {
			local5++;
		}
		if (arg1.method1896(Static226.anInt4370)) {
			local5++;
		}
		if (arg1.method1896(Static54.anInt1389)) {
			local5++;
		}
		if (arg0.method1896(Static447.anInt7829)) {
			local5++;
		}
		if (arg0.method1896(Static226.anInt4370)) {
			local5++;
		}
		if (arg0.method1896(Static54.anInt1389)) {
			local5++;
		}
		return local5;
	}
}
