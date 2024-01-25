import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
	private int anInt52 = 0;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
	private int anInt55 = 4096;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(29) int[] local29 = this.method8603(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static491.anInt8519; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = local37 >= this.anInt52 && this.anInt55 >= local37 ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt52 = arg0.method4221();
		} else if (arg1 == 1) {
			this.anInt55 = arg0.method4221();
		}
	}
}
