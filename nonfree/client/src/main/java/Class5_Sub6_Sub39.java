import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class5_Sub6_Sub39 extends Class5_Sub6 {

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub39() {
		super(1, true);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(27) int[][] local27 = this.method8116(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			for (@Pc(41) int local41 = 0; local41 < Static421.anInt7443; local41++) {
				local17[local41] = (local39[local41] + local35[local41] + local31[local41]) / 3;
			}
		}
		return local17;
	}
}
