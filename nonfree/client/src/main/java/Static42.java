import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static42 {

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "Lclient!wo;")
	public static Class216 aClass216_9;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)I")
	public static int method970(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
