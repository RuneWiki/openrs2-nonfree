import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
	public static int anInt5934;

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "Lclient!lw;")
	public static final Class223 aClass223_12 = new Class223(1);

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "[S")
	public static short[] aShortArray96 = new short[256];

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "[I")
	public static final int[] anIntArray332 = new int[14];

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BILclient!raa;I)V")
	public static void method5281(@OriginalArg(1) int arg0, @OriginalArg(2) Class295 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray5 != null) {
			@Pc(13) Class5_Sub51 local13 = new Class5_Sub51();
			local13.aClass295_19 = arg1;
			local13.anObjectArray33 = arg1.anObjectArray5;
			Static370.method5457(local13);
		}
		Static83.anInt6737 = arg1.anInt8031;
		Static427.anInt7391 = arg2;
		Static285.aBoolean378 = true;
		Static375.anInt6224 = arg1.anInt8022;
		Static229.anInt4250 = arg0;
		Static289.anInt5055 = arg1.anInt8010;
		Static570.anInt9615 = arg1.anInt8025;
		Static578.anInt4589 = arg1.anInt8013;
		Static465.method6901(arg1);
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
	public static void method5282() {
		for (@Pc(6) Class5_Sub5_Sub4 local6 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8702(); local6 != null; local6 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8710()) {
			if (local6.anInt2287 > 1) {
				local6.anInt2287 = 0;
				Static171.aClass87_94.method1792(((Class5_Sub5_Sub15) local6.aClass368_2.aClass5_Sub5_64.aClass5_Sub5_66).aLong173, local6);
				local6.aClass368_2.method8703();
			}
		}
		Static140.anInt2437 = 0;
		Static491.anInt8293 = 0;
		Static84.aClass330_6.method7910();
		Static594.aClass273_45.method6586();
		Static601.aClass368_13.method8703();
		Static219.method3770(Static596.aClass5_Sub5_Sub15_4);
	}
}
