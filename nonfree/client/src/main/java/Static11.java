import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
	public static final int anInt372 = 1400;

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("8039018895f41c212dc6e1582a2f865580b2e069179904583a0548d13c45bb873613ed80c159aa277a1b66fb5b4db88b9fb539cae179ee72c5e980f77130f821", 16);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!aaa;)Lclient!dja;")
	public static Class67 method409(@OriginalArg(1) Class2_Sub1_Sub1 arg0) {
		@Pc(13) Class67 local13;
		if (Static419.aClass67_2 == null) {
			local13 = new Class67();
		} else {
			local13 = Static419.aClass67_2;
			Static419.aClass67_2 = Static419.aClass67_2.aClass67_1;
			local13.aClass67_1 = null;
			Static298.anInt5008--;
		}
		local13.aClass2_Sub1_Sub1_1 = arg0;
		return local13;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)Lclient!ok;")
	public static Class25 method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(38) long local38 = (long) arg2 * 32147369L ^ (long) arg1 * 97549L ^ (long) arg5 * 67481L ^ (long) arg4 * 475427L ^ (long) arg0 * 986053L ^ (long) arg3 * 76724863L;
		@Pc(44) Class25 local44 = (Class25) Static544.aClass10_52.method373(local38);
		if (local44 == null) {
			local44 = Static83.aClass132_3.method7443(arg5, arg1, arg4, arg0, arg2, arg3);
			Static544.aClass10_52.method366(local44, local38);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FI)F")
	public static float method416(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}
}
