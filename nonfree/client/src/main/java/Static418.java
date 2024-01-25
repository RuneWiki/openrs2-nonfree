import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "[Lclient!sh;")
	public static Class331[] aClass331Array1;

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
	public static int anInt7052 = 0;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!tga;I)[Lclient!pf;")
	public static Class284[] method6134(@OriginalArg(0) Class349 arg0) {
		if (!arg0.method7736()) {
			return new Class284[0];
		}
		@Pc(24) Class361 local24 = arg0.method7744();
		while (local24.anInt9720 == 0) {
			Static620.method7045(-4, 10L);
		}
		if (local24.anInt9720 == 2) {
			return new Class284[0];
		}
		@Pc(50) int[] local50 = (int[]) local24.anObject20;
		@Pc(56) Class284[] local56 = new Class284[local50.length >> 2];
		for (@Pc(58) int local58 = 0; local58 < local56.length; local58++) {
			@Pc(64) Class284 local64 = new Class284();
			local56[local58] = local64;
			local64.anInt7350 = local50[local58 << 2];
			local64.anInt7345 = local50[(local58 << 2) + 1];
			local64.anInt7347 = local50[(local58 << 2) + 2];
			local64.anInt7348 = local50[(local58 << 2) + 3];
		}
		return local56;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
	public static void method6136() {
		for (@Pc(7) int local7 = 0; local7 < Static172.aByteArrayArrayArray23.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static172.aByteArrayArrayArray23[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static172.aByteArrayArrayArray23[0][0].length; local15++) {
					Static172.aByteArrayArrayArray23[local7][local11][local15] = 0;
				}
			}
		}
	}
}
