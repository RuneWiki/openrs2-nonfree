import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "[J")
	public static final long[] aLongArray18 = new long[10];

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZZZII)I")
	public static int method6042(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class14_Sub50 local10 = Static250.method3683(arg2, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray699.length; local18++) {
			if (local10.anIntArray699[local18] >= 0 && Static175.aClass247_2.anInt7328 > local10.anIntArray699[local18]) {
				@Pc(48) Class27 local48 = Static175.aClass247_2.method5962(local10.anIntArray699[local18]);
				@Pc(58) int local58 = local48.method807(arg1, Static217.aClass90_1.method2122(arg1).anInt9931);
				if (arg0) {
					local16 += local10.anIntArray698[local18] * local58;
				} else {
					local16 += local58;
				}
			}
		}
		return local16;
	}
}
