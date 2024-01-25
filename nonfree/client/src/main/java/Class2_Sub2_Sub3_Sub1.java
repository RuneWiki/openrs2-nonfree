import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class2_Sub2_Sub3_Sub1 extends Class2_Sub2_Sub3 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419 && this.method359()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = arg0 % super.anInt443 * super.anInt443;
			for (@Pc(46) int local46 = 0; local46 < Static217.anInt3574; local46++) {
				@Pc(58) int local58 = super.anIntArray40[local44 + local46 % super.anInt448];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
