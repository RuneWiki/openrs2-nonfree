import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "[I")
	public static int[] anIntArray701;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "D")
	public static double aDouble29;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
	public static int anInt10831;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "Z")
	public static boolean aBoolean737;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_247 = new Class215(1, 2);

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "[Lclient!gw;")
	public static final Class2_Sub6_Sub9[] aClass2_Sub6_Sub9Array4 = new Class2_Sub6_Sub9[14];

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
	public static int anInt10830 = -1;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	public static int anInt10832 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIB)I")
	public static int method9024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ke;I)V")
	public static void method9025(@OriginalArg(0) Class3_Sub1_Sub3_Sub3_Sub2 arg0) {
		@Pc(16) Class2_Sub21 local16 = (Class2_Sub21) Static458.aClass99_62.method3056((long) arg0.anInt6083);
		if (local16 == null) {
			return;
		}
		if (local16.aClass2_Sub8_Sub5_3 != null) {
			Static614.aClass2_Sub8_Sub4_2.method7925(local16.aClass2_Sub8_Sub5_3);
			local16.aClass2_Sub8_Sub5_3 = null;
		}
		local16.method9253();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V")
	public static void method9026(@OriginalArg(0) int arg0) {
		Static298.aLong137 = 1000000000L / (long) arg0;
	}
}
