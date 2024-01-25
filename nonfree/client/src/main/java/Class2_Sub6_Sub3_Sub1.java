import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class2_Sub6_Sub3_Sub1 extends Class2_Sub6_Sub3 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88 && this.method3177()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = super.anInt3751 * (arg0 % super.anInt3751);
			for (@Pc(46) int local46 = 0; local46 < Static51.anInt1085; local46++) {
				@Pc(58) int local58 = super.anIntArray257[local44 + local46 % super.anInt3752];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
