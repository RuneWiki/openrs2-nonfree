import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static207 {

	@OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
	public static int anInt3960;

	@OriginalMember(owner = "client!oj", name = "H", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
	public static int anInt3955 = 0;

	@OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
	public static int anInt3958 = 64;

	@OriginalMember(owner = "client!oj", name = "S", descriptor = "I")
	public static int anInt3962 = -1;

	@OriginalMember(owner = "client!oj", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString221 = " ";

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)I")
	public static int method3316(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(II)I")
	public static int method3317(@OriginalArg(1) int arg0) {
		if (arg0 > 0) {
			return 1;
		} else if (arg0 < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!nk;)V")
	public static void method3318(@OriginalArg(1) Class121 arg0) {
		Static219.aClass121_94 = arg0;
	}
}
