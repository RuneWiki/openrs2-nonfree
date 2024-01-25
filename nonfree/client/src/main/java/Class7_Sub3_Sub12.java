import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class7_Sub3_Sub12 extends Class7_Sub3 {

	@OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
	private int anInt2382 = 0;

	@OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
	private int anInt2378 = 4096;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt2382 = arg1.method3943();
		} else if (arg0 == 1) {
			this.anInt2378 = arg1.method3943();
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(29) int[] local29 = this.method5591(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static58.anInt1052; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = this.anInt2382 <= local37 && this.anInt2378 >= local37 ? 4096 : 0;
			}
		}
		return local19;
	}
}
