import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!bf;")
	public static final Class27 aClass27_1 = new Class27();

	@OriginalMember(owner = "client!as", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
	public static void method289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static230.anInt3922 = arg1 - Static349.anInt7465;
		Static331.anInt6297 = arg0 - Static349.anInt7457;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)Z")
	public static boolean method291(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)I")
	public static int method292(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 >>> 1;
		@Pc(20) int local20 = local14 | local14 >>> 1;
		@Pc(26) int local26 = local20 | local20 >>> 2;
		@Pc(32) int local32 = local26 | local26 >>> 4;
		@Pc(38) int local38 = local32 | local32 >>> 8;
		@Pc(44) int local44 = local38 | local38 >>> 16;
		return arg0 & ~local44;
	}
}
