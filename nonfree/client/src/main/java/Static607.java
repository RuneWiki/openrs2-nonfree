import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static607 {

	@OriginalMember(owner = "client!uia", name = "r", descriptor = "F")
	public static float aFloat205;

	@OriginalMember(owner = "client!uia", name = "n", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_196 = new Class180(122, 1);

	@OriginalMember(owner = "client!uia", name = "p", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!uia", name = "q", descriptor = "[Lclient!eja;")
	public static final Class89[] aClass89Array1 = new Class89[100];

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(III)Z")
	public static boolean method8573(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static268.method4385(arg1, arg0) | (arg1 & 0x800) != 0 || Static581.method7252(arg1, arg0);
	}
}
