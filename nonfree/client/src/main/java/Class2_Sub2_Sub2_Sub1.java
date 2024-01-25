import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class2_Sub2_Sub2_Sub1 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653 && this.method538()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(39) int local39 = arg0 % super.anInt748 * super.anInt748;
			for (@Pc(41) int local41 = 0; local41 < Static153.anInt3070; local41++) {
				@Pc(53) int local53 = super.anIntArray43[local39 + local41 % super.anInt757];
				local31[local41] = (local53 & 0xFF) << 4;
				local27[local41] = local53 >> 4 & 0xFF0;
				local23[local41] = local53 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
