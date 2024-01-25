import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class5_Sub2_Sub25 extends Class5_Sub2 {

	@OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
	private int anInt7436 = 4096;

	@OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
	private int anInt7439 = 0;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(29) int[] local29 = this.method8945(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static195.anInt3759; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = local37 >= this.anInt7439 && this.anInt7436 >= local37 ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7439 = arg0.method7860();
		} else if (arg1 == 1) {
			this.anInt7436 = arg0.method7860();
		}
	}
}
