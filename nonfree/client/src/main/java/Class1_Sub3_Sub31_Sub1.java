import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class1_Sub3_Sub31_Sub1 extends Class1_Sub3_Sub31 {

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415 && this.method5087()) {
			@Pc(27) int[] local27 = local13[0];
			@Pc(31) int[] local31 = local13[1];
			@Pc(35) int[] local35 = local13[2];
			@Pc(43) int local43 = arg0 % super.anInt5955 * super.anInt5955;
			for (@Pc(45) int local45 = 0; local45 < Static153.anInt3378; local45++) {
				@Pc(58) int local58 = super.anIntArray496[local43 + local45 % super.anInt5946];
				local35[local45] = (local58 & 0xFF) << 4;
				local31[local45] = local58 >> 4 & 0xFF0;
				local27[local45] = local58 >> 12 & 0xFF0;
			}
		}
		return local13;
	}
}
