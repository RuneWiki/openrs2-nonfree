import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class4_Sub4_Sub25_Sub1 extends Class4_Sub4_Sub25 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392 && this.method7382()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = super.anInt8982 * (arg0 % super.anInt8982);
			for (@Pc(46) int local46 = 0; local46 < Static560.anInt9394; local46++) {
				@Pc(59) int local59 = super.anIntArray681[local44 + local46 % super.anInt8984];
				local36[local46] = (local59 & 0xFF) << 4;
				local32[local46] = local59 >> 4 & 0xFF0;
				local28[local46] = local59 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
