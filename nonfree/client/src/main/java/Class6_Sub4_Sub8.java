import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class6_Sub4_Sub8 extends Class6_Sub4 {

	@OriginalMember(owner = "client!cw", name = "z", descriptor = "I")
	private int anInt1630 = 4096;

	@OriginalMember(owner = "client!cw", name = "A", descriptor = "I")
	private int anInt1631 = 0;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(29) int[] local29 = this.method7748(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static408.anInt7209; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = this.anInt1631 <= local37 && this.anInt1630 >= local37 ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt1631 = arg1.method6003();
		} else if (arg0 == 1) {
			this.anInt1630 = arg1.method6003();
		}
	}
}
