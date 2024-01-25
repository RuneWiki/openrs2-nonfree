import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZI)V")
	public static void method3937(@OriginalArg(0) boolean arg0) {
		@Pc(5) int local5 = Static531.anInt8271;
		@Pc(7) int local7 = Static145.anInt2680;
		if (arg0 && Static444.aBoolean451) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static153.aClass22_4.f(local7, local5);
	}
}
