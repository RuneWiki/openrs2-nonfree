import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "[I")
	public static final int[] anIntArray465 = new int[1000];

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "([BZ)[B")
	public static byte[] method4761(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub9 local8 = new Class4_Sub9(arg0);
		@Pc(19) int local19 = local8.method6015();
		@Pc(23) int local23 = local8.method6026();
		if (local23 < 0 || Static164.anInt3574 != 0 && local23 > Static164.anInt3574) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(42) byte[] local42 = new byte[local23];
			local8.method5966(local23, local42);
			return local42;
		} else {
			@Pc(54) int local54 = local8.method6026();
			if (local54 < 0 || Static164.anInt3574 != 0 && local54 > Static164.anInt3574) {
				throw new RuntimeException();
			}
			@Pc(71) byte[] local71 = new byte[local54];
			if (local19 == 1) {
				Static372.method5578(local71, local54, arg0, local23);
			} else {
				@Pc(87) Class232 local87 = Static464.aClass232_6;
				synchronized (Static464.aClass232_6) {
					Static464.aClass232_6.method5025(local8, local71);
				}
			}
			return local71;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	public static void method4762() {
		@Pc(18) int local18 = Static189.aClass4_Sub2_Sub1_1.method7667(Static403.anInt6994);
		if (local18 == 0) {
			Static567.aByteArrayArrayArray21 = null;
			Static68.method1132(0);
		} else if (local18 == 1) {
			Static532.method7402((byte) 0);
			Static68.method1132(512);
			if (Static97.aByteArrayArrayArray19 != null) {
				Static535.method7437();
			}
		} else {
			Static532.method7402((byte) (Static523.anInt8897 - 4 & 0xFF));
			Static68.method1132(2);
		}
		Static160.anInt3554 = Static320.anInt5748;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IB)Z")
	public static boolean method4764(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}
}
