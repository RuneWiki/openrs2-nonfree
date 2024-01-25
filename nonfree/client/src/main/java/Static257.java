import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static257 {

	@OriginalMember(owner = "client!mp", name = "P", descriptor = "Lclient!af;")
	public static Class6 aClass6_3;

	@OriginalMember(owner = "client!mp", name = "W", descriptor = "Lclient!jm;")
	public static Class124 aClass124_4;

	@OriginalMember(owner = "client!mp", name = "Q", descriptor = "Z")
	public static boolean aBoolean276 = true;

	@OriginalMember(owner = "client!mp", name = "S", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!mp", name = "U", descriptor = "J")
	public static volatile long aLong138 = 0L;

	@OriginalMember(owner = "client!mp", name = "V", descriptor = "Lclient!go;")
	public static Class95 aClass95_10 = null;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBI)I")
	public static int method3427(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static282.anIntArray427[arg0 & 0x3] : Static105.anIntArray142[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIBZ)V")
	public static void method3428(@OriginalArg(3) boolean arg0) {
		Static208.anInt3680 = 22050;
		Static59.anInt1065 = 2;
		Static213.aBoolean232 = arg0;
	}
}
