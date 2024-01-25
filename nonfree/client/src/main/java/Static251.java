import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "[Lclient!o;")
	public static Class85[] aClass85Array7;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B")
	public static byte[] method3543(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static446.method5654(local13) : local13;
		} else if (arg0 instanceof Class16) {
			@Pc(27) Class16 local27 = (Class16) arg0;
			return local27.method234();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Lclient!tj;")
	public static Class239_Sub1 method3545() {
		Static89.anInt1208 = 0;
		return Static17.method3336();
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method3546() {
		for (@Pc(12) Class1_Sub35 local12 = (Class1_Sub35) Static463.aClass14_53.method203(); local12 != null; local12 = (Class1_Sub35) Static463.aClass14_53.method208()) {
			if (local12.aBoolean477) {
				local12.method4222();
			}
		}
		for (@Pc(34) Class1_Sub35 local34 = (Class1_Sub35) Static175.aClass14_12.method203(); local34 != null; local34 = (Class1_Sub35) Static175.aClass14_12.method208()) {
			if (local34.aBoolean477) {
				local34.method4222();
			}
		}
	}
}
