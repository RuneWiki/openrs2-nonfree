import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hha")
public final class Class3_Sub1_Sub12_Sub1 extends Class3_Sub1_Sub12 {

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509 && this.method3479()) {
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			@Pc(41) int local41 = arg0 % super.anInt3852 * super.anInt3852;
			for (@Pc(43) int local43 = 0; local43 < Static379.anInt5859; local43++) {
				@Pc(56) int local56 = super.anIntArray285[local41 + local43 % super.anInt3849];
				local33[local43] = (local56 & 0xFF) << 4;
				local29[local43] = local56 >> 4 & 0xFF0;
				local25[local43] = local56 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
