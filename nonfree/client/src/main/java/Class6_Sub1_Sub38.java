import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class6_Sub1_Sub38 extends Class6_Sub1 {

	@OriginalMember(owner = "client!wc", name = "V", descriptor = "[Lclient!naa;")
	private static final Class219[] aClass219Array1 = new Class219[32];

	static {
		@Pc(89) Class219[] local89 = Static237.method4161();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass219Array1[local89[local91].anInt6222] = local89[local91];
		}
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub38() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(26) int[][] local26 = this.method8162(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static289.anInt5549; local40++) {
				local16[local40] = (local34[local40] + local30[local40] + local38[local40]) / 3;
			}
		}
		return local16;
	}
}
