import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!uq;")
	public static Class362 aClass362_83;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
	public static int anInt6523;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "[Lclient!fq;")
	public static Class34_Sub1[] aClass34_Sub1Array4;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
	public static int anInt6521 = -1;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!uq;IZ)Lclient!hh;")
	public static Class6 method5476(@OriginalArg(0) Class362 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class6 local15 = (Class6) Static135.aClass295_9.method6470((long) arg1);
		if (local15 == null) {
			if (Static296.aBoolean334) {
				local15 = Static119.aClass95_4.method8008(Static688.method8604(arg0, arg1), true);
			} else {
				local15 = Static484.method6392(arg0.method8356(arg1));
			}
			Static135.aClass295_9.method6469((long) arg1, local15);
		}
		return local15;
	}
}
