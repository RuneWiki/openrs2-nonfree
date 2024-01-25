import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!su", name = "b", descriptor = "[I")
	public static final int[] anIntArray655 = new int[5];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	public static void method7050() {
		@Pc(8) Class4_Sub22 local8 = (Class4_Sub22) Static324.aClass124_28.method3267();
		@Pc(19) boolean local19 = Static287.aClass115_12 != null || Static171.anInt3692 > 0;
		if (local19) {
			Static526.anInt8940 = 1;
		}
		if (Static307.aBoolean423 && Static12.aClass173_1.method6259(81) && Static300.anInt5730 > 2) {
			if (local19) {
				Static22.aClass4_Sub18_1 = (Class4_Sub18) Static354.aClass124_32.aClass4_90.aClass4_288.aClass4_288;
			} else {
				Static145.method2994(local8.method7270(), local8.method7271(), (Class4_Sub18) Static354.aClass124_32.aClass4_90.aClass4_288.aClass4_288);
			}
		} else if (local19) {
			Static22.aClass4_Sub18_1 = (Class4_Sub18) Static354.aClass124_32.aClass4_90.aClass4_288;
		} else {
			Static145.method2994(local8.method7270(), local8.method7271(), (Class4_Sub18) Static354.aClass124_32.aClass4_90.aClass4_288);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B[[I)V")
	public static void method7051(@OriginalArg(1) int[][] arg0) {
		Static383.anIntArrayArray62 = arg0;
	}
}
