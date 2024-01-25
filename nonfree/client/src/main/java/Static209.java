import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
	public static int anInt3960 = 0;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
	public static void method3405() {
		@Pc(1) Class330 local1 = Static129.aClass330_17;
		synchronized (Static129.aClass330_17) {
			Static129.aClass330_17.method7678();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZLclient!hp;)V")
	public static void method3406(@OriginalArg(1) Interface6 arg0) {
		Static143.anInterface6_1.method3968();
		Static143.anInterface6_1 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)I")
	public static int method3410(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V")
	public static void method3411() {
		Static187.aClass71Array23 = null;
		Static570.aClass71Array56 = null;
		Static279.aClass71Array33 = null;
		Static264.aClass82_3 = null;
		Static266.aClass82_4 = null;
		Static449.aClass71_48 = null;
		Static244.aClass71Array31 = null;
		Static230.aClass71Array27 = null;
		Static390.aClass71Array43 = null;
		Static143.aClass71Array17 = null;
		Static201.aClass71Array24 = null;
		Static171.aClass71_55 = null;
		Static280.aClass71Array34 = null;
		Static118.aClass71Array57 = null;
		Static353.aClass71Array39 = null;
		Static544.aClass71Array44 = null;
		Static75.aClass82_1 = null;
		Static357.aClass71Array41 = null;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)V")
	public static void method3412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static172.aClass68_4 == Static14.aClass68_6) {
			if (!Static227.method3563(1, 1, false, -2, arg0, 0, 0, arg1)) {
				Static227.method3563(1, 1, false, -3, arg0, 0, 0, arg1);
			}
		} else if (!Static227.method3563(1, 1, false, -3, arg0, 0, 0, arg1)) {
			Static227.method3563(1, 1, false, -2, arg0, 0, 0, arg1);
		}
	}
}
