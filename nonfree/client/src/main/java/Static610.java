import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
	public static int anInt10725;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger31 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!wh;")
	public static final Class400 aClass400_36 = new Class400();

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
	public static int anInt10726 = 1;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public static void method9380() {
		@Pc(7) Class268 local7 = null;
		try {
			@Pc(13) Class163 local13 = Static135.aClass389_2.method9277("");
			while (local13.anInt3843 == 0) {
				Static570.method7907(1L);
			}
			if (local13.anInt3843 == 1) {
				local7 = (Class268) local13.anObject5;
				@Pc(39) Class2_Sub20 local39 = Static650.aClass2_Sub30_29.method2989();
				local7.method6517(local39.aByteArray111, local39.anInt9723, 0);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local7 != null) {
				local7.method6511();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}
}
