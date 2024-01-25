import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Lclient!lq;")
	public static Class159 aClass159_2;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "Lclient!pu;")
	public static final Class203 aClass203_31 = new Class203();

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "[Lclient!dl;")
	public static final Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array6 = new Class1_Sub1_Sub8[14];

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
	public static int anInt3842 = 1;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)[B")
	public static byte[] method2963(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub2 local15 = (Class1_Sub1_Sub2) Static340.aClass215_3.method4926((long) arg0);
		if (local15 == null) {
			@Pc(20) byte[] local20 = new byte[512];
			@Pc(26) Random local26 = new Random((long) arg0);
			for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
				local20[local28] = (byte) local28;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(46) int local46 = 255 - local40;
				@Pc(51) int local51 = Static70.method1340(local26, local46);
				@Pc(55) byte local55 = local20[local51];
				local20[local51] = local20[local46];
				local20[local46] = local20[511 - local40] = local55;
			}
			local15 = new Class1_Sub1_Sub2(local20);
			Static340.aClass215_3.method4925(local15, (long) arg0);
		}
		return local15.aByteArray4;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	public static void method2964() {
		if (Static30.aClass106_3.method5949()) {
			Static30.aClass106_3.method5959(Static443.aCanvas33);
			Static441.method5990();
			Static30.aClass106_3.method5965(Static443.aCanvas33);
			Static30.aClass106_3.method5920(Static443.aCanvas33);
		} else {
			Static197.method3166(Static262.anInt2805);
		}
		Static179.method3014();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIB)Z")
	public static boolean method2965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!co;I)Z")
	public static boolean method2966(@OriginalArg(0) Class47 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean102) {
			return false;
		} else if (!arg0.method1081(Static377.anInterface4_2)) {
			return false;
		} else if (Static128.aClass38_12.method765((long) arg0.anInt1534) == null) {
			return Static55.aClass38_4.method765((long) arg0.anInt1531) == null;
		} else {
			return false;
		}
	}
}
