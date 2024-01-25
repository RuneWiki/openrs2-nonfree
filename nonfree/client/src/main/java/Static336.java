import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "Lclient!qp;")
	public static Class171 aClass171_4;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
	public static int anInt6660;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "[I")
	public static int[] anIntArray529;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Z")
	public static boolean aBoolean578 = false;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
	public static int anInt6659 = 0;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "Z")
	public static boolean aBoolean579 = true;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)V")
	public static void method5527(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg0, 2);
		local8.method2034();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BZ)V")
	public static void method5528(@OriginalArg(1) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static68.aByteArrayArray3;
		} else {
			local9 = Static118.aByteArrayArray8;
		}
		@Pc(16) int local16 = Static235.aByteArrayArray25.length;
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(29) byte[] local29 = local9[local23];
			if (local29 != null) {
				@Pc(42) int local42 = (Static313.anIntArray505[local23] >> 8) * 64 - Static10.anInt231;
				@Pc(52) int local52 = (Static313.anIntArray505[local23] & 0xFF) * 64 - Static81.anInt1732;
				Static294.method3383();
				Static67.method1257(Static345.aClass174Array1, Static164.aClass92_7, local52, local29, arg0, local42);
			}
		}
	}
}
