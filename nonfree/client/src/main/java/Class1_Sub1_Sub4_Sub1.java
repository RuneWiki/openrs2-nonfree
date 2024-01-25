import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class1_Sub1_Sub4_Sub1 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505 && this.method709()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(44) int local44 = arg0 % super.anInt807 * super.anInt807;
			for (@Pc(46) int local46 = 0; local46 < Static501.anInt8748; local46++) {
				@Pc(59) int local59 = super.anIntArray37[local44 + local46 % super.anInt806];
				local36[local46] = (local59 & 0xFF) << 4;
				local32[local46] = local59 >> 4 & 0xFF0;
				local28[local46] = local59 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
