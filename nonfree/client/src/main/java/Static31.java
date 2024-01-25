import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "Lclient!tq;")
	public static Class191 aClass191_18;

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "[I")
	public static int[] anIntArray37;

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "S")
	public static short aShort16 = 256;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "Lclient!fk;")
	public static final Class67 aClass67_4 = new Class67();

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "[I")
	public static final int[] anIntArray38 = new int[13];

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZLclient!tq;Lclient!tq;I)V")
	public static void method770(@OriginalArg(0) int arg0, @OriginalArg(2) Class191 arg1, @OriginalArg(3) Class191 arg2) {
		Static83.anInt1823 = arg0;
		Static277.aBoolean510 = true;
		Static197.aClass191_127 = arg1;
		Static23.aClass191_14 = arg2;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)I")
	public static int method771(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
