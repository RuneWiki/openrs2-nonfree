import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub3_Sub24_Sub1 extends Class2_Sub3_Sub24 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77 && this.method2824()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(40) int local40 = super.anInt3712 * (arg0 % super.anInt3712);
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static53.anInt1184; local46++) {
				@Pc(58) int local58 = super.anIntArray328[local46 % super.anInt3710 + local40];
				local44[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
