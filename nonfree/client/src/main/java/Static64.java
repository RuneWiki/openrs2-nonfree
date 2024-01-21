import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!la", name = "qc", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!la", name = "uc", descriptor = "I")
	public static int anInt2486;

	@OriginalMember(owner = "client!la", name = "wc", descriptor = "I")
	public static int anInt2488;

	@OriginalMember(owner = "client!la", name = "xc", descriptor = "Lclient!oa;")
	public static Class7 aClass7_76;

	@OriginalMember(owner = "client!la", name = "Cc", descriptor = "Lclient!we;")
	public static Class5_Sub1_Sub10_Sub4 aClass5_Sub1_Sub10_Sub4_6;

	@OriginalMember(owner = "client!la", name = "Fc", descriptor = "Lclient!nb;")
	public static Class24 aClass24_22;

	@OriginalMember(owner = "client!la", name = "Gc", descriptor = "Lclient!fc;")
	public static Class24_Sub1 aClass24_Sub1_20;

	@OriginalMember(owner = "client!la", name = "lb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger4 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!la", name = "Eb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1227 = Static38.method736("Choose Option");

	@OriginalMember(owner = "client!la", name = "nb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1226 = aClass71_1227;

	@OriginalMember(owner = "client!la", name = "Ac", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1230 = Static38.method736("Please wait)3)3)3");

	@OriginalMember(owner = "client!la", name = "rc", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1228 = aClass71_1230;

	@OriginalMember(owner = "client!la", name = "yc", descriptor = "I")
	public static int anInt2489 = 3;

	@OriginalMember(owner = "client!la", name = "Dc", descriptor = "I")
	public static int anInt2492 = 0;

	@OriginalMember(owner = "client!la", name = "Ec", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1231 = aClass71_1230;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V")
	public static void method1681(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub7 local8 = (Class5_Sub7) Static71.aClass57_10.method1575((long) arg0);
		if (local8 != null) {
			for (@Pc(17) int local17 = 0; local17 < local8.anIntArray212.length; local17++) {
				local8.anIntArray212[local17] = -1;
				local8.anIntArray211[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(I)V")
	public static void method1683() {
		aClass71_1228 = null;
		aClass5_Sub1_Sub10_Sub4_6 = null;
		anIntArrayArrayArray9 = null;
		aClass71_1226 = null;
		aClass24_22 = null;
		aClass7_76 = null;
		aBigInteger4 = null;
		aClass71_1231 = null;
		aClass24_Sub1_20 = null;
		aClass71_1227 = null;
		aClass71_1230 = null;
	}
}
