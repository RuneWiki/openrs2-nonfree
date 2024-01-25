import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "Lclient!tu;")
	public static Class229 aClass229_35;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4611(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZBZLclient!te;)V")
	public static void method4612(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class3_Sub40 arg2) {
		@Pc(6) int local6 = arg2.anInt6668;
		@Pc(10) int local10 = (int) arg2.aLong227;
		arg2.method5987();
		if (arg1) {
			Static410.method5505(local6);
		}
		Static256.method3883(local6);
		@Pc(25) Class68 local25 = Static321.method4661(local10);
		if (local25 != null) {
			Static442.method5899(local25);
		}
		Static218.method3482();
		if (!arg0 && Static337.anInt6221 != -1) {
			Static289.method4240(Static337.anInt6221, 1);
		}
		@Pc(55) Class100 local55 = new Class100(Static30.aClass127_3);
		for (@Pc(60) Class3_Sub40 local60 = (Class3_Sub40) local55.method2733(); local60 != null; local60 = (Class3_Sub40) local55.method2731()) {
			if (!local60.method5985()) {
				local60 = (Class3_Sub40) local55.method2733();
				if (local60 == null) {
					return;
				}
			}
			if (local60.anInt6670 == 3) {
				@Pc(81) int local81 = (int) local60.aLong227;
				if (local81 >>> 16 == local6) {
					method4612(arg0, true, local60);
				}
			}
		}
	}
}
