import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bn", name = "s", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!bn", name = "t", descriptor = "Lclient!fk;")
	public static Class67 aClass67_3;

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_9 = new Class93("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!wl;)V")
	public static void method752(@OriginalArg(0) Class62_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort84; local2 <= arg0.aShort86; local2++) {
			for (@Pc(6) int local6 = arg0.aShort83; local6 <= arg0.aShort85; local6++) {
				@Pc(16) Class8 local16 = Static275.aClass8ArrayArrayArray4[arg0.aByte56][local2][local6];
				if (local16 != null) {
					@Pc(21) Class172 local21 = local16.aClass172_1;
					@Pc(23) Class172 local23 = null;
					while (local21 != null) {
						if (local21.aClass62_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass172_1 = local21.aClass172_4;
							} else {
								local23.aClass172_4 = local21.aClass172_4;
							}
							local21.method5019();
							break;
						}
						local23 = local21;
						local21 = local21.aClass172_4;
					}
					local16.aByte3 = 0;
					for (@Pc(56) Class172 local56 = local16.aClass172_1; local56 != null; local56 = local56.aClass172_4) {
						local16.aByte3 = (byte) (local16.aByte3 | local56.anInt5621);
					}
				}
			}
		}
	}
}
