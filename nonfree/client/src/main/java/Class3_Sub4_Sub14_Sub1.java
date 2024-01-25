import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class3_Sub4_Sub14_Sub1 extends Class3_Sub4_Sub14 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455 && this.method2804()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(44) int local44 = super.anInt3441 * (arg0 % super.anInt3441);
			for (@Pc(46) int local46 = 0; local46 < Static106.anInt2356; local46++) {
				@Pc(58) int local58 = super.anIntArray260[local44 + local46 % super.anInt3440];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
