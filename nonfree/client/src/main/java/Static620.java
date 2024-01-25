import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!us", name = "k", descriptor = "I")
	public static int anInt10280;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I[B)V")
	public static void method8392(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub4 local10 = new Class3_Sub4(arg0);
		@Pc(12) boolean local12 = false;
		while (true) {
			while (true) {
				@Pc(16) int local16 = local10.method7954();
				if (local16 == 0) {
					if (!local12) {
						if (Static198.anIntArray186 == null) {
							Static258.anInt4523 = 4;
							Static75.anIntArray81 = new int[4];
							Static198.anIntArray186 = new int[4];
						}
						for (local16 = 0; local16 < Static198.anIntArray186.length; local16++) {
							Static198.anIntArray186[local16] = 0;
							Static75.anIntArray81[local16] = local16 * 20;
						}
					}
					return;
				}
				if (local16 == 1) {
					if (Static198.anIntArray186 == null) {
						Static198.anIntArray186 = new int[4];
						Static258.anInt4523 = 4;
						Static75.anIntArray81 = new int[4];
					}
					for (@Pc(68) int local68 = 0; local68 < Static198.anIntArray186.length; local68++) {
						Static198.anIntArray186[local68] = local10.method7918();
						Static75.anIntArray81[local68] = local10.method7918();
					}
					local12 = true;
				} else if (local16 == 2) {
					Static26.anInt627 = local10.method7951();
				} else if (local16 == 3) {
					Static258.anInt4523 = local10.method7954();
					Static75.anIntArray81 = new int[Static258.anInt4523];
					Static198.anIntArray186 = new int[Static258.anInt4523];
				}
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)Z")
	public static boolean method8393() {
		return Static166.anInt3037 > 0;
	}
}
