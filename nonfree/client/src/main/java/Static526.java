import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "[Lclient!gp;")
	public static Class124[] aClass124Array2;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
	public static final int anInt3463 = 1403;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("92f0c5123c5c056d07b275553ed048af3ad3c5ff8c727fd90984a24b991209762b9581dac2d1b3527c06fbd564787d9f9d1dfece4c713429fb92ccfe3f39942b", 16);

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_77 = new Class362(48, 0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZI)Z")
	public static boolean method3100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ[S)[S")
	public static short[] method3101(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static597.method3728(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
