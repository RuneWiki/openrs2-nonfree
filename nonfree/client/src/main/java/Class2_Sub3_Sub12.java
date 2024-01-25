import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class2_Sub3_Sub12 extends Class2_Sub3 {

	@OriginalMember(owner = "client!hga", name = "N", descriptor = "I")
	private int anInt4740 = 4096;

	@OriginalMember(owner = "client!hga", name = "K", descriptor = "I")
	private int anInt4737 = 0;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4737 = arg0.method8326();
		} else if (arg1 == 1) {
			this.anInt4740 = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(29) int[] local29 = this.method9156(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static222.anInt4971; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = local37 >= this.anInt4737 && this.anInt4740 >= local37 ? 4096 : 0;
			}
		}
		return local19;
	}
}
