import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!te", name = "P", descriptor = "I")
	public static int anInt2640;

	@OriginalMember(owner = "client!te", name = "Q", descriptor = "Lclient!mb;")
	public static Class70 aClass70_28;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "Lclient!w;")
	public static Class123 aClass123_7 = new Class123(64);

	@OriginalMember(owner = "client!te", name = "N", descriptor = "[Lclient!ti;")
	public static Class112[] aClass112Array3 = new Class112[27];

	@OriginalMember(owner = "client!te", name = "O", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger5 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILjava/awt/Component;Z)Lclient!hc;")
	public static Class19 method2072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class19_Sub2");
			@Pc(10) Class19 local10 = (Class19) local6.getDeclaredConstructor().newInstance();
			local10.method883(arg0, arg1, arg2);
			return local10;
		} catch (@Pc(19) Throwable local19) {
			@Pc(23) Class19_Sub1 local23 = new Class19_Sub1();
			local23.method883(arg0, arg1, arg2);
			return local23;
		}
	}
}
