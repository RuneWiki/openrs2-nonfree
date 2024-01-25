import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "Lclient!jia;")
	public static Class172 aClass172_6;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)Lclient!hha;")
	public static Class3_Sub4_Sub12 method5863() {
		@Pc(16) Class3_Sub4_Sub12 local16 = (Class3_Sub4_Sub12) Static223.aClass15_7.method897();
		if (local16 != null) {
			local16.method8769();
			local16.method8732();
			return local16;
		}
		do {
			local16 = (Class3_Sub4_Sub12) Static411.aClass15_12.method897();
			if (local16 == null) {
				return null;
			}
			if (local16.method3604() > Static374.method6036()) {
				return null;
			}
			local16.method8769();
			local16.method8732();
		} while ((local16.aLong274 & Long.MIN_VALUE) == 0L);
		return local16;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!la;[ILclient!la;)V")
	public static void method5869(@OriginalArg(1) Class196 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class196 arg2) {
		if (arg1 != null) {
			Static307.anIntArray298 = arg1;
		}
		Static592.aClass196_123 = arg0;
		Static303.aClass196_59 = arg2;
	}
}
