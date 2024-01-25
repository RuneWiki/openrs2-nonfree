import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class1_Sub3_Sub28 extends Class1_Sub3 {

	@OriginalMember(owner = "client!rw", name = "F", descriptor = "I")
	private int anInt7403 = 4096;

	@OriginalMember(owner = "client!rw", name = "E", descriptor = "I")
	private int anInt7402 = 0;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(29) int[] local29 = this.method7911(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static236.anInt4609; local31++) {
				@Pc(37) int local37 = local29[local31];
				local11[local31] = this.anInt7402 <= local37 && this.anInt7403 >= local37 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7402 = arg0.method3056();
		} else if (arg1 == 1) {
			this.anInt7403 = arg0.method3056();
		}
	}
}
