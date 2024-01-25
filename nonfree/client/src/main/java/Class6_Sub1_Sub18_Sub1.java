import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class6_Sub1_Sub18_Sub1 extends Class6_Sub1_Sub18 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402 && this.method6695()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(39) int local39 = super.anInt7999 * (arg0 % super.anInt7999);
			for (@Pc(41) int local41 = 0; local41 < Static289.anInt5549; local41++) {
				@Pc(53) int local53 = super.anIntArray572[local39 + local41 % super.anInt8001];
				local31[local41] = (local53 & 0xFF) << 4;
				local27[local41] = local53 >> 4 & 0xFF0;
				local23[local41] = local53 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
