import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class2_Sub10_Sub11 extends Class2_Sub10 {

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
	private int anInt4253 = 4096;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
	private int anInt4258 = 0;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(29) int[] local29 = this.method8402(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static93.anInt1862; local31++) {
				@Pc(37) int local37 = local29[local31];
				local11[local31] = this.anInt4258 <= local37 && this.anInt4253 >= local37 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4258 = arg0.method6884();
		} else if (arg1 == 1) {
			this.anInt4253 = arg0.method6884();
		}
	}
}
